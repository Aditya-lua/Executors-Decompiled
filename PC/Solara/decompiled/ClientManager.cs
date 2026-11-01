using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Media;
using System.Windows.Shapes;
using System.Windows.Threading;
using Newtonsoft.Json;

namespace SolaraUI;

public class ClientManager
{
	private static readonly ClientManager _instance = new ClientManager();

	private WrapPanel _clientPanel;

	private readonly Dictionary<string, ClientItem> _activeUiClients;

	private readonly object _uiLock = new object();

	private MainWindow _mainWindow;

	public static ClientManager Instance => _instance;

	private ClientManager()
	{
		_activeUiClients = new Dictionary<string, ClientItem>();
	}

	public void Initialize(MainWindow main, WrapPanel panel)
	{
		_mainWindow = main;
		_clientPanel = panel;
	}

	public Brush GetClientStatusBrush(string clientId)
	{
		//IL_001c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0021: Unknown result type (might be due to invalid IL or missing references)
		//IL_0027: Expected O, but got Unknown
		if (_activeUiClients.TryGetValue(clientId, out var value))
		{
			return ((Shape)value.StatusCircle).Fill;
		}
		return (Brush)new SolidColorBrush(Colors.Gray);
	}

	public SolidColorBrush GetBrushB(string clientId)
	{
		//IL_0017: Unknown result type (might be due to invalid IL or missing references)
		//IL_001c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0022: Expected O, but got Unknown
		if (_activeUiClients.TryGetValue(clientId, out var value))
		{
			return value._brush;
		}
		return new SolidColorBrush(Colors.Gray);
	}

	public List<string> GetAllActiveClientIds()
	{
		List<string> list = new List<string>();
		if (_clientPanel == null)
		{
			return list;
		}
		foreach (KeyValuePair<string, ClientItem> activeUiClient in _activeUiClients)
		{
			if (((ToggleButton)activeUiClient.Value.ActiveCheckBox).IsChecked == true)
			{
				list.Add(activeUiClient.Key);
			}
		}
		return list;
	}

	public async Task ScanAndSyncClientsAsync()
	{
		if (_clientPanel == null)
		{
			return;
		}
		var value = new
		{
			request = "scan_clients"
		};
		string text = JsonConvert.SerializeObject(value);
		string jsonResponse = "";
		try
		{
			StringContent val = new StringContent(text, Encoding.UTF8, "application/json");
			jsonResponse = await (await _mainWindow._httpClient.PostAsync("client_manager", (HttpContent)(object)val)).Content.ReadAsStringAsync();
		}
		catch (TaskCanceledException ex)
		{
			SimpleLogger.Log($"[ClientManager] Timeout after {_mainWindow._httpClient.Timeout}");
			SimpleLogger.Log("[ClientManager] " + ex.ToString());
		}
		catch (Exception ex2)
		{
			SimpleLogger.Log("[ClientManager] Scan failed: " + ex2.Message);
			return;
		}
		if (string.IsNullOrEmpty(jsonResponse))
		{
			return;
		}
		Dictionary<string, ClientData> serverClients;
		try
		{
			serverClients = JsonConvert.DeserializeObject<Dictionary<string, ClientData>>(jsonResponse);
		}
		catch (JsonException ex3)
		{
			SimpleLogger.Log("[ClientManager] Failed to deserialize server response: " + ex3.Message);
			return;
		}
		HashSet<string> clientIdsOnServer = new HashSet<string>(serverClients.Keys);
		await ((DispatcherObject)_clientPanel).Dispatcher.InvokeAsync((Action)delegate
		{
			lock (_uiLock)
			{
				List<string> list = _activeUiClients.Keys.Where((string id) => !clientIdsOnServer.Contains(id)).ToList();
				foreach (string item in list)
				{
					if (_activeUiClients.TryGetValue(item, out var value2))
					{
						((Panel)_clientPanel).Children.Remove((UIElement)(object)value2);
						_activeUiClients.Remove(item);
					}
				}
				List<(string, ClientData, bool)> list2 = serverClients.Select((KeyValuePair<string, ClientData> kvp) => (Key: kvp.Key, Value: kvp.Value, isNew: !_activeUiClients.ContainsKey(kvp.Key))).ToList();
				foreach (var item2 in list2)
				{
					var (text2, clientData, _) = item2;
					ClientItem value3;
					if (item2.Item3)
					{
						ClientItem clientItem = new ClientItem(_mainWindow, text2);
						clientItem.SetUsername(clientData.Username);
						clientItem.SetStatus(clientData.Status);
						clientItem.SetThumb(clientData.Thumb);
						_activeUiClients.Add(text2, clientItem);
						((Panel)_clientPanel).Children.Add((UIElement)(object)clientItem);
					}
					else if (_activeUiClients.TryGetValue(text2, out value3))
					{
						value3.SetUsername(clientData.Username);
						value3.SetStatus(clientData.Status);
						value3.SetThumb(clientData.Thumb);
					}
				}
			}
		});
	}

	public string GetFirstClientId()
	{
		lock (_uiLock)
		{
			return _activeUiClients.Keys.FirstOrDefault();
		}
	}

	public ClientItem GetFirstClient()
	{
		lock (_uiLock)
		{
			return _activeUiClients.Values.FirstOrDefault();
		}
	}
}
