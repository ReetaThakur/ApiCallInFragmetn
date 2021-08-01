package com.example.apicallinfragmetn;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

//@Generated("com.robohorse.robopojogenerator")
public class ResponseModel implements Serializable {

	@SerializedName("login")
	private String login;

	@SerializedName("id")
	private int id;

	@SerializedName("node_id")
	private String nodeId;

	@SerializedName("avatar_url")
	private String avatarUrl;

	@SerializedName("gravatar_id")
	private String gravatarId;

	@SerializedName("url")
	private String url;

	@SerializedName("html_url")
	private String htmlUrl;

	@SerializedName("followers_url")
	private String followersUrl;

	@SerializedName("following_url")
	private String followingUrl;

	@SerializedName("gists_url")
	private String gistsUrl;

	@SerializedName("starred_url")
	private String starredUrl;

	@SerializedName("subscriptions_url")
	private String subscriptionsUrl;

	@SerializedName("organizations_url")
	private String organizationsUrl;

	@SerializedName("repos_url")
	private String reposUrl;

	@SerializedName("events_url")
	private String eventsUrl;

	@SerializedName("received_events_url")
	private String receivedEventsUrl;

	@SerializedName("type")
	private String type;

	@SerializedName("site_admin")
	private boolean siteAdmin;

	@SerializedName("name")
	private String name;

	@SerializedName("company")
	private Object company;

	@SerializedName("blog")
	private String blog;

	@SerializedName("location")
	private String location;

	@SerializedName("email")
	private Object email;

	@SerializedName("hireable")
	private Object hireable;

	@SerializedName("bio")
	private String bio;

	@SerializedName("twitter_username")
	private Object twitterUsername;

	@SerializedName("public_repos")
	private int publicRepos;

	@SerializedName("public_gists")
	private int publicGists;

	@SerializedName("followers")
	private int followers;

	@SerializedName("following")
	private int following;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("updated_at")
	private String updatedAt;

	public String getLogin(){
		return login;
	}

	public int getId(){
		return id;
	}

	public String getNodeId(){
		return nodeId;
	}

	public String getAvatarUrl(){
		return avatarUrl;
	}

	public String getGravatarId(){
		return gravatarId;
	}

	public String getUrl(){
		return url;
	}

	public String getHtmlUrl(){
		return htmlUrl;
	}

	public String getFollowersUrl(){
		return followersUrl;
	}

	public String getFollowingUrl(){
		return followingUrl;
	}

	public String getGistsUrl(){
		return gistsUrl;
	}

	public String getStarredUrl(){
		return starredUrl;
	}

	public String getSubscriptionsUrl(){
		return subscriptionsUrl;
	}

	public String getOrganizationsUrl(){
		return organizationsUrl;
	}

	public String getReposUrl(){
		return reposUrl;
	}

	public String getEventsUrl(){
		return eventsUrl;
	}

	public String getReceivedEventsUrl(){
		return receivedEventsUrl;
	}

	public String getType(){
		return type;
	}

	public boolean isSiteAdmin(){
		return siteAdmin;
	}

	public String getName(){
		return name;
	}

	public Object getCompany(){
		return company;
	}

	public String getBlog(){
		return blog;
	}

	public String getLocation(){
		return location;
	}

	public Object getEmail(){
		return email;
	}

	public Object getHireable(){
		return hireable;
	}

	public String getBio(){
		return bio;
	}

	public Object getTwitterUsername(){
		return twitterUsername;
	}

	public int getPublicRepos(){
		return publicRepos;
	}

	public int getPublicGists(){
		return publicGists;
	}

	public int getFollowers(){
		return followers;
	}

	public int getFollowing(){
		return following;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	@Override
 	public String toString(){
		return 
			"ResponseModel{" + 
			"login = '" + login + '\'' + 
			",id = '" + id + '\'' + 
			",node_id = '" + nodeId + '\'' + 
			",avatar_url = '" + avatarUrl + '\'' + 
			",gravatar_id = '" + gravatarId + '\'' + 
			",url = '" + url + '\'' + 
			",html_url = '" + htmlUrl + '\'' + 
			",followers_url = '" + followersUrl + '\'' + 
			",following_url = '" + followingUrl + '\'' + 
			",gists_url = '" + gistsUrl + '\'' + 
			",starred_url = '" + starredUrl + '\'' + 
			",subscriptions_url = '" + subscriptionsUrl + '\'' + 
			",organizations_url = '" + organizationsUrl + '\'' + 
			",repos_url = '" + reposUrl + '\'' + 
			",events_url = '" + eventsUrl + '\'' + 
			",received_events_url = '" + receivedEventsUrl + '\'' + 
			",type = '" + type + '\'' + 
			",site_admin = '" + siteAdmin + '\'' + 
			",name = '" + name + '\'' + 
			",company = '" + company + '\'' + 
			",blog = '" + blog + '\'' + 
			",location = '" + location + '\'' + 
			",email = '" + email + '\'' + 
			",hireable = '" + hireable + '\'' + 
			",bio = '" + bio + '\'' + 
			",twitter_username = '" + twitterUsername + '\'' + 
			",public_repos = '" + publicRepos + '\'' + 
			",public_gists = '" + publicGists + '\'' + 
			",followers = '" + followers + '\'' + 
			",following = '" + following + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			"}";
		}
}