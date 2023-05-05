package api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Article{
	private String layout;
	private List<String> categories;
	private String title;
	private String lang;
	private String url;
	private String content;
	private List<Object> tags;
}