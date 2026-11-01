using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Net.Http;
using System.Reflection;
using System.Runtime.CompilerServices;
using System.Text.Json;
using System.Threading;
using System.Threading.Tasks;

namespace ScriptEditor.Services;

public sealed class ProductInfo : INotifyPropertyChanged
{
	private const string InfoUrl = "https://getvelocity.llc/api/v1/products/roblox/info";

	private static readonly HttpClient Http = CreateClient();

	private string _version = LocalVersion;

	private string _supportedVersion = "unknown";

	private string _status = string.Empty;

	private string _name = "Velocity";

	private bool _isLoaded;

	private string? _error;

	public static string LocalVersion => Assembly.GetExecutingAssembly().GetName().Version?.ToString(3) ?? "1.0.0";

	public string Name
	{
		get
		{
			return _name;
		}
		private set
		{
			Set(ref _name, value, "Name");
		}
	}

	public string Version
	{
		get
		{
			return _version;
		}
		private set
		{
			Set(ref _version, value, "Version");
		}
	}

	public string SupportedVersion
	{
		get
		{
			return _supportedVersion;
		}
		private set
		{
			Set(ref _supportedVersion, value, "SupportedVersion");
		}
	}

	public string Status
	{
		get
		{
			return _status;
		}
		private set
		{
			Set(ref _status, value, "Status");
		}
	}

	public bool IsLoaded
	{
		get
		{
			return _isLoaded;
		}
		private set
		{
			Set(ref _isLoaded, value, "IsLoaded");
		}
	}

	public string? Error
	{
		get
		{
			return _error;
		}
		private set
		{
			Set(ref _error, value, "Error");
		}
	}

	public event PropertyChangedEventHandler? PropertyChanged;

	public async Task<bool> RefreshAsync(CancellationToken cancellationToken = default(CancellationToken))
	{
		try
		{
			using JsonDocument jsonDocument = JsonDocument.Parse(await Http.GetStringAsync("https://getvelocity.llc/api/v1/products/roblox/info", cancellationToken));
			JsonElement rootElement = jsonDocument.RootElement;
			if (rootElement.ValueKind != JsonValueKind.Object)
			{
				Error = "unexpected response shape";
				return false;
			}
			string text = Read(rootElement, "name");
			if (text != null)
			{
				Name = text;
			}
			string text2 = Read(rootElement, "version");
			if (text2 != null)
			{
				Version = text2;
			}
			string text3 = Read(rootElement, "supported_version");
			if (text3 != null)
			{
				SupportedVersion = text3;
			}
			string text4 = Read(rootElement, "status");
			if (text4 != null)
			{
				Status = text4;
			}
			Error = null;
			IsLoaded = true;
			return true;
		}
		catch (Exception ex) when ((ex is HttpRequestException || ex is TaskCanceledException || ex is JsonException || ex is InvalidOperationException) ? true : false)
		{
			Error = ((ex is TaskCanceledException) ? "request timed out" : ex.Message);
			return false;
		}
	}

	private static string? Read(JsonElement root, string property)
	{
		if (!root.TryGetProperty(property, out var value) || value.ValueKind != JsonValueKind.String)
		{
			return null;
		}
		return value.GetString();
	}

	private static HttpClient CreateClient()
	{
		HttpClient httpClient = new HttpClient();
		httpClient.Timeout = TimeSpan.FromSeconds(10L);
		httpClient.DefaultRequestHeaders.UserAgent.ParseAdd("Velocity/" + LocalVersion);
		return httpClient;
	}

	private void Set<T>(ref T field, T value, [CallerMemberName] string? name = null)
	{
		if (!EqualityComparer<T>.Default.Equals(field, value))
		{
			field = value;
			PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(name));
		}
	}
}
