package kjr;

import java.sql.SQLException;
import java.util.ArrayList;

import lastdto.hosMemberDTO;
import kty.DAO;

public class HosmemberDAO extends DAO {
	String sql = "";
	public ArrayList<hosMemberDTO> select(){ //전체 조회
		ArrayList<hosMemberDTO> list = new ArrayList<>();
		sql="SELECT * FROM hos_member";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				hosMemberDTO dto = new hosMemberDTO();
				dto.setHosId(rs.getString("HOS_ID"));
				dto.setHosBizno(rs.getString("HOS_BIZNO"));
				dto.setHosName(rs.getString("HOS_NAME"));
				dto.setHosPhone(rs.getString("HOS_PHONE"));
				dto.setHosPw(rs.getString("HOS_PW"));
				dto.setHosAddr(rs.getString("HOS_ADDR"));
				dto.setHosLat(rs.getInt("HOS_LAT"));
				dto.setHosLng(rs.getInt("HOS_LNG"));
				dto.setHosStart(rs.getString("BIZ_START"));
				dto.setHosLast(rs.getString("BIZ_LAST"));
				list.add(dto);		
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<hosMemberDTO> select(String hos){ //병원이름으로 조회
		ArrayList<hosMemberDTO> list = new ArrayList<>();
		sql="SELECT * FROM hos_member ";
		if(hos!=null) {
			sql += " where hos_name like ? ";
		}
		try {
			pstmt = conn.prepareStatement(sql);
			if(hos!=null) {
				pstmt.setString(1, "%"+hos+"%");
			}
			rs = pstmt.executeQuery();
			while(rs.next()) {
				hosMemberDTO dto = new hosMemberDTO();
				dto.setHosId(rs.getString("HOS_ID"));
				dto.setHosBizno(rs.getString("HOS_BIZNO"));
				dto.setHosName(rs.getString("HOS_NAME"));
				dto.setHosPhone(rs.getString("HOS_PHONE"));
				dto.setHosPw(rs.getString("HOS_PW"));
				dto.setHosAddr(rs.getString("HOS_ADDR"));
				dto.setHosLat(rs.getInt("HOS_LAT"));
				dto.setHosLng(rs.getInt("HOS_LNG"));
				dto.setHosStart(rs.getString("BIZ_START"));
				dto.setHosLast(rs.getString("BIZ_LAST"));
				list.add(dto);		
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		close();
		return list;
	}
	
	
}