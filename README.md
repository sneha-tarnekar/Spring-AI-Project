
# Spring AI
- Helps developers to integrate AI models in Spring Based apps.
- Enabling AI in Spring based apps.

Instead of manually calling REST APIs for AI module, we can use Spring AI which is an abstract layer that makes easy to call API.

### Spring AI helps in
- Call AI Models just like you call REST APIs in Spring.
- Plug different providers (OpenAI, Azure, Hugging Face, etc.) without changing much code.
- Work with AI concepts like prompts, embeddings, RAG(Retrieval Augmented Generation), chat history in a structured way.


### Key Features of Spring AI
- Multi-model and Provider Support
- Spring-friendly APIs
- Prompt Management
  You can store prompt in external filesi instead of hardcoding
  Makes prompts reusable and version-controlled.
- Embeddings Support (Vector DB + RAG)
- Chat History and Memory

### Spring AI Setup with Open AI
- Generate an OpenAI API Key
- Create a Spring Boot Project
- Add dependencies in pom.xml
- Configure API Key in application.yml
- Autowired ChatClient.Builder

### Spring AI with Ollama - Free LLM
- Install & Run Ollama
- Create a Spring Boot Project
- Add dependency Spring AI Ollama Starter
- Configure Spring AI for Ollama


