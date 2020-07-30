package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	public List<Topic> topics() {
		return Arrays.asList(new Topic(1, "java", "spring"), new Topic(1, "Kava", "struts"));
	}
}
