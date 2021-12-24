package eu.neclab.ngsildbroker.registryhandler.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import eu.neclab.ngsildbroker.commons.datatypes.requests.BaseRequest;

@Service
public class CSourceKafkaService {
	private static final Logger logger = LoggerFactory.getLogger(CSourceKafkaService.class);
	
	@Autowired
	CSourceService cSourceService;
	
	@KafkaListener(topics = "${entity.create.topic}")
	public void handleEntityCreate(@Payload BaseRequest message,
			@Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key) {
		new Thread() {
			@Override
			public void run() {
			}
		};
	}
	@KafkaListener(topics = "${entity.update.topic}")
	public void handleEntityUpdate(@Payload BaseRequest message,
			@Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key) {
		new Thread() {
			@Override
			public void run() {
			}
		};
	}
	@KafkaListener(topics = "${entity.append.topic}")
	public void handleEntityAppend(@Payload BaseRequest message,
			@Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key) {
		new Thread() {
			@Override
			public void run() {
			}
		};
	}
	@KafkaListener(topics = "${entity.delete.topic}")
	public void handleEntityDelete(@Payload BaseRequest message,
			@Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key) {
		new Thread() {
			@Override
			public void run() {
			}
		};
	}

//	private CSourceRegistration getCSourceRegistrationFromJson(String payload) throws URISyntaxException, IOException {
//		logger.trace("getCSourceRegistrationFromJson() :: started");
//		CSourceRegistration csourceRegistration = new CSourceRegistration();
//		// csourceJsonBody = objectMapper.createObjectNode();
//		// csourceJsonBody = objectMapper.readTree(entityBody);
//		List<Information> information = new ArrayList<Information>();
//		Information info = new Information();
//		List<EntityInfo> entities = info.getEntities();
//		Entity entity = DataSerializer.getEntity(payload);
//
//		// Entity to CSourceRegistration conversion.
//		csourceRegistration.setId(entity.getId());
//		csourceRegistration.setEndpoint(MicroServiceUtils.getGatewayURL());
//		// location node
//		GeoProperty geoLocationProperty = entity.getLocation();
//		if (geoLocationProperty != null) {
//			csourceRegistration.setLocation(getCoveringGeoValue(geoLocationProperty));
//		}
//
//		// Information node
//		Set<String> propertiesList = entity.getProperties().stream().map(Property::getIdString)
//				.collect(Collectors.toSet());
//
//		Set<String> relationshipsList = entity.getRelationships().stream().map(Relationship::getIdString)
//				.collect(Collectors.toSet());
//
//		entities.add(new EntityInfo(entity.getId(), null, entity.getType()));
//
//		info.setPropertyNames(propertiesList);
//		info.setRelationshipNames(relationshipsList);
//		information.add(info);
//		csourceRegistration.setInformation(information);
//
//		// location node.
//
//		TimeInterval timestamp = new TimeInterval();
//		timestamp.setStartAt(new Date().getTime());
//		csourceRegistration.setTimestamp(timestamp);
//		logger.trace("getCSourceRegistrationFromJson() :: completed");
//		return csourceRegistration;
//	}
//
//	private Geometry<?> getCoveringGeoValue(GeoProperty geoLocationProperty) {
//		// TODO should be done better to cover the actual area
//		return geoLocationProperty.getEntries().values().iterator().next().getGeoValue();
//	}
//
//	public URI getResourceURL(String resource) throws URISyntaxException {
//		logger.trace("getResourceURL() :: started");
//		URI uri = MicroServiceUtils.getGatewayURL();
//		logger.trace("getResourceURL() :: completed");
//		return new URI(uri.toString() + "/" + resource);
//	}

	
}
