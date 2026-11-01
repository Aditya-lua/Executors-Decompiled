using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.ComponentModel;
using System.Configuration;
using System.Diagnostics;
using System.Globalization;
using System.IO;
using System.IO.Compression;
using System.Linq;
using System.Net.Http;
using System.Net.Security;
using System.Reflection;
using System.Resources;
using System.Runtime.CompilerServices;
using System.Runtime.InteropServices;
using System.Runtime.Versioning;
using System.Security.Cryptography;
using System.Security.Cryptography.X509Certificates;
using System.Security.Principal;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Input;
using System.Windows.Interop;
using System.Windows.Markup;
using System.Windows.Media.Animation;
using Bootstrapper.Properties;
using Costura;
using Microsoft.Win32;
using Microsoft.WindowsAPICodePack.Dialogs;
using Newtonsoft.Json;

[assembly: CompilationRelaxations(8)]
[assembly: RuntimeCompatibility(WrapNonExceptionThrows = true)]
[assembly: Debuggable(DebuggableAttribute.DebuggingModes.IgnoreSymbolStoreSequencePoints)]
[assembly: AssemblyTitle("Bootstrapper")]
[assembly: AssemblyDescription("")]
[assembly: AssemblyConfiguration("")]
[assembly: AssemblyCompany("CMD Softworks")]
[assembly: AssemblyProduct("Bootstrapper")]
[assembly: AssemblyCopyright("Copyright © CMD Softworks 2026-2027")]
[assembly: AssemblyTrademark("")]
[assembly: ComVisible(false)]
[assembly: ThemeInfo(/*Could not decode attribute arguments.*/)]
[assembly: AssemblyFileVersion("1.0.0.0")]
[assembly: TargetFramework(".NETFramework,Version=v4.8", FrameworkDisplayName = ".NET Framework 4.8")]
[assembly: AssemblyVersion("1.0.0.0")]
internal class <Module>
{
	static <Module>()
	{
		AssemblyLoader.Attach(subscribe: true);
	}
}
public static class SimpleLogger
{
	private static readonly object _lock;

	private static readonly string _logPath;

	static SimpleLogger()
	{
		_lock = new object();
		_logPath = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "bin", "BOOTDEBUG.txt");
		try
		{
			string directoryName = Path.GetDirectoryName(_logPath);
			if (directoryName != null && !Directory.Exists(directoryName))
			{
				Directory.CreateDirectory(directoryName);
			}
			File.WriteAllText(_logPath, string.Empty, Encoding.UTF8);
		}
		catch
		{
		}
	}

	public static void Log(string message)
	{
		try
		{
			string directoryName = Path.GetDirectoryName(_logPath);
			if (directoryName != null && !Directory.Exists(directoryName))
			{
				Directory.CreateDirectory(directoryName);
			}
			string text = string.Format("[{0}]: {1}", DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss"), message);
			lock (_lock)
			{
				File.AppendAllText(_logPath, text + Environment.NewLine, Encoding.UTF8);
			}
		}
		catch
		{
		}
	}
}
namespace Bootstrapper
{
	public class App : Application
	{
		private void StartUp(object sender, StartupEventArgs e)
		{
			if (e.Args.Length == 0)
			{
				return;
			}
			Thread.Sleep(1500);
			Process[] processesByName = Process.GetProcessesByName(e.Args[0]);
			if (processesByName.Length != 0)
			{
				Process[] array = processesByName;
				foreach (Process obj in array)
				{
					obj.Kill();
					obj.WaitForExit();
				}
			}
		}

		[DebuggerNonUserCode]
		[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
		public void InitializeComponent()
		{
			//IL_0008: Unknown result type (might be due to invalid IL or missing references)
			//IL_0012: Expected O, but got Unknown
			((Application)this).Startup += new StartupEventHandler(StartUp);
			((Application)this).StartupUri = new Uri("MainWindow.xaml", UriKind.Relative);
		}

		[STAThread]
		[DebuggerNonUserCode]
		[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
		public static void Main()
		{
			App app = new App();
			app.InitializeComponent();
			((Application)app).Run();
		}
	}
	internal class Installer
	{
		public class Config
		{
			public bool DontShowChangeLogs { get; set; }

			public string FolderPath { get; set; }
		}

		private class EndpointData
		{
			public string BootstrapperVersion { get; set; }

			public string SupportedClient { get; set; }

			public string SoftwareVersion { get; set; }

			public string BootstrapperUrl { get; set; }

			public string SoftwareUrl { get; set; }

			public string VersionUrl { get; set; }

			public string ClientHash { get; set; }

			public string Changelog { get; set; }
		}

		private readonly double currentInstallerVersion = 2.29;

		private readonly string[] solara_endpoints = new string[3] { "https://getsolara.dev/api/endpoint.json", "https://api.getsolara.gg/api/endpoint.json", "https://getsolara.net/api/endpoint.json" };

		public string BootstrapperVersion { get; private set; }

		public string SupportedClient { get; private set; }

		public string SoftwareVersion { get; private set; }

		public string BootstrapperUrl { get; private set; }

		public string SoftwareUrl { get; private set; }

		public string VersionUrl { get; private set; }

		public string ClientHash { get; private set; }

		public string Changelog { get; private set; }

		public static bool WebViewIsInstalled()
		{
			using RegistryKey registryKey = Registry.LocalMachine.OpenSubKey("Software\\WOW6432Node\\Microsoft\\EdgeUpdate\\Clients\\{F3017226-FE2A-4295-8BDF-00C3A9A7E4C5}");
			if (registryKey != null && registryKey.GetValue("pv") != null)
			{
				return true;
			}
			return false;
		}

		private async Task DownloadAndStartNewBootstrapper(double newVersion)
		{
			_ = 3;
			try
			{
				string baseDirectory = AppDomain.CurrentDomain.BaseDirectory;
				string newFileName = Path.Combine(baseDirectory, $"Bootstrapper_v{newVersion}.exe");
				HttpClient httpClient = new HttpClient();
				try
				{
					HttpResponseMessage response = await httpClient.GetAsync(BootstrapperUrl);
					try
					{
						response.EnsureSuccessStatusCode();
						using FileStream fs = new FileStream(newFileName, FileMode.Create, FileAccess.Write, FileShare.None);
						await response.Content.CopyToAsync((Stream)fs);
					}
					finally
					{
						((IDisposable)response)?.Dispose();
					}
				}
				finally
				{
					((IDisposable)httpClient)?.Dispose();
				}
				await Task.Run(() => Process.Start(newFileName, Process.GetCurrentProcess().ProcessName));
				await Task.Delay(500);
				Application.Current.Shutdown();
			}
			catch (Exception ex)
			{
				MessageBox.Show("An error occurred while updating the bootstrapper:\n" + ex.Message, "Error", (MessageBoxButton)0, (MessageBoxImage)16);
			}
		}

		private bool FilesAreEqual(ZipArchiveEntry entry, string filePath)
		{
			if (!File.Exists(filePath))
			{
				return false;
			}
			if (entry.Length != new FileInfo(filePath).Length)
			{
				return false;
			}
			Stream stream = entry.Open();
			FileStream fileStream = File.OpenRead(filePath);
			SHA256 sHA = SHA256.Create();
			byte[] first = sHA.ComputeHash(stream);
			byte[] second = sHA.ComputeHash(fileStream);
			fileStream.Close();
			stream.Close();
			return first.SequenceEqual(second);
		}

		public async Task DownloadSolara(string folderPath)
		{
			string folderPath2 = Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData);
			string tempZipPath = Path.Combine(folderPath2, "SolaraTemp_" + Guid.NewGuid().ToString("N") + ".zip");
			try
			{
				HttpClient httpClient = new HttpClient();
				try
				{
					HttpResponseMessage response = await httpClient.GetAsync(SoftwareUrl);
					try
					{
						response.EnsureSuccessStatusCode();
						using FileStream fs = new FileStream(tempZipPath, FileMode.Create, FileAccess.Write, FileShare.None);
						await response.Content.CopyToAsync((Stream)fs);
					}
					finally
					{
						((IDisposable)response)?.Dispose();
					}
				}
				finally
				{
					((IDisposable)httpClient)?.Dispose();
				}
				await Task.Run(delegate
				{
					ZipArchive zipArchive = ZipFile.OpenRead(tempZipPath);
					foreach (ZipArchiveEntry entry in zipArchive.Entries)
					{
						string text = Path.Combine(folderPath, entry.FullName);
						if (string.IsNullOrEmpty(entry.Name))
						{
							Directory.CreateDirectory(text);
						}
						else
						{
							Directory.CreateDirectory(Path.GetDirectoryName(text) ?? folderPath);
							if (!File.Exists(text) || !FilesAreEqual(entry, text))
							{
								entry.ExtractToFile(text, overwrite: true);
							}
						}
					}
					zipArchive.Dispose();
				});
			}
			catch (Exception ex)
			{
				MessageBox.Show("An exception occurred when extracting Solara's files: " + ex.Message, "Error", (MessageBoxButton)0, (MessageBoxImage)16);
			}
			finally
			{
				try
				{
					if (File.Exists(tempZipPath))
					{
						File.Delete(tempZipPath);
					}
				}
				catch
				{
				}
			}
			try
			{
				if (File.Exists(tempZipPath))
				{
					File.Delete(tempZipPath);
				}
			}
			catch
			{
			}
		}

		private bool NeedsAdmin(string folderPath)
		{
			string text = Path.Combine(folderPath, "bin");
			string path = Path.Combine(text, "write_test.tmp");
			try
			{
				if (!Directory.Exists(text))
				{
					Directory.CreateDirectory(text);
				}
				File.WriteAllText(path, "test");
				File.Delete(path);
				return false;
			}
			catch (UnauthorizedAccessException)
			{
				return true;
			}
			catch (IOException)
			{
				return true;
			}
		}

		private bool IsElevated()
		{
			return new WindowsPrincipal(WindowsIdentity.GetCurrent()).IsInRole(WindowsBuiltInRole.Administrator);
		}

		public async Task CheckAndUpdateSolaraAsync()
		{
			string folderPath = Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData);
			string path;
			try
			{
				path = Settings.Default.FolderPath;
			}
			catch (SettingsPropertyNotFoundException)
			{
				Settings.Default.FolderPath = folderPath;
				((SettingsBase)Settings.Default).Save();
				path = folderPath;
			}
			string folderPath2 = Path.Combine(path, "Solara");
			if (!IsElevated() && NeedsAdmin(folderPath2))
			{
				ProcessStartInfo startInfo = new ProcessStartInfo(Process.GetCurrentProcess().MainModule.FileName)
				{
					UseShellExecute = true,
					Verb = "runas"
				};
				try
				{
					Process.Start(startInfo);
					Environment.Exit(0);
				}
				catch
				{
					Settings.Default.FolderPath = folderPath;
					((SettingsBase)Settings.Default).Save();
					Path.Combine(folderPath, "Solara");
				}
			}
			else if (IsElevated() && NeedsAdmin(folderPath2))
			{
				Settings.Default.FolderPath = folderPath;
				((SettingsBase)Settings.Default).Save();
				Path.Combine(folderPath, "Solara");
			}
			await DownloadSolara(Settings.Default.FolderPath);
		}

		public async Task CheckAndUpdateBootstrapperAsync()
		{
			if (double.TryParse(BootstrapperVersion, NumberStyles.Float, CultureInfo.InvariantCulture, out var result))
			{
				if (currentInstallerVersion < result && (int)MessageBox.Show("A new bootstrapper version is available. Would you like to update?", "Update Available", (MessageBoxButton)4, (MessageBoxImage)32) == 6)
				{
					await DownloadAndStartNewBootstrapper(result);
				}
			}
			else
			{
				MessageBox.Show("Failed to parse the bootstrapper version from the server.", "Error", (MessageBoxButton)0, (MessageBoxImage)16);
			}
		}

		private static async Task DownloadWebview()
		{
			string text = "https://go.microsoft.com/fwlink/p/?LinkId=2124703";
			string installerPath = Path.Combine(Path.GetTempPath(), "MicrosoftEdgeWebview2Setup.exe");
			HttpClient client = new HttpClient();
			try
			{
				HttpResponseMessage response = await client.GetAsync(text, (HttpCompletionOption)1);
				try
				{
					response.EnsureSuccessStatusCode();
					using FileStream fileStream = new FileStream(installerPath, FileMode.Create, FileAccess.Write, FileShare.None);
					await response.Content.CopyToAsync((Stream)fileStream);
				}
				finally
				{
					((IDisposable)response)?.Dispose();
				}
			}
			finally
			{
				((IDisposable)client)?.Dispose();
			}
			using Process installerProcess = new Process
			{
				StartInfo = new ProcessStartInfo
				{
					FileName = installerPath,
					Arguments = "/silent /install",
					UseShellExecute = false,
					CreateNoWindow = true
				}
			};
			installerProcess.Start();
			await installerProcess.WaitForProcessExitAsync();
			if (installerProcess.ExitCode != 0)
			{
				MessageBox.Show($"Couldn't install WebView2 Runtime. Error Code: {installerProcess.ExitCode}");
			}
		}

		public async Task<bool> StartAsync(Page3 window)
		{
			if (!WebViewIsInstalled())
			{
				window.SetStatus("Installing WebView2 Runtime - this may take a few minutes...");
				await DownloadWebview();
				window.SetStatus("Getting Solara ready, sit tight...");
			}
			int tries = 0;
			string[] array = solara_endpoints;
			foreach (string endpoint in array)
			{
				tries++;
				if (await TryFetchEndpointDataAsync(endpoint))
				{
					if (double.TryParse(BootstrapperVersion, NumberStyles.Float, CultureInfo.InvariantCulture, out var result))
					{
						if (result > currentInstallerVersion)
						{
							await CheckAndUpdateBootstrapperAsync();
							return true;
						}
						await CheckAndUpdateSolaraAsync();
						return true;
					}
					return false;
				}
				if (tries == 3)
				{
					MessageBox.Show("Unable to connect to servers.", "Error", (MessageBoxButton)0, (MessageBoxImage)16);
					return false;
				}
			}
			return false;
		}

		private async Task<bool> TryFetchEndpointDataAsync(string endpoint)
		{
			try
			{
				EndpointData endpointData = JsonConvert.DeserializeObject<EndpointData>(await new HttpClient((HttpMessageHandler)new HttpClientHandler
				{
					ServerCertificateCustomValidationCallback = (HttpRequestMessage message, X509Certificate2 cert, X509Chain chain, SslPolicyErrors errors) => true
				}).GetStringAsync(endpoint));
				if (endpointData != null)
				{
					StoreData(endpointData);
					return true;
				}
			}
			catch (Exception)
			{
			}
			return false;
		}

		private void StoreData(EndpointData data)
		{
			BootstrapperVersion = data.BootstrapperVersion;
			SupportedClient = data.SupportedClient;
			SoftwareVersion = data.SoftwareVersion;
			BootstrapperUrl = data.BootstrapperUrl;
			SoftwareUrl = data.SoftwareUrl;
			VersionUrl = data.VersionUrl;
			ClientHash = data.ClientHash;
			Changelog = data.Changelog;
		}
	}
	public class MainWindow : Window, IComponentConnector
	{
		public class Config
		{
			public bool DontShowChangeLogs { get; set; }

			public string FolderPath { get; set; }
		}

		internal Frame MainFrame;

		private bool _contentLoaded;

		public MainWindow()
		{
			InitializeComponent();
		}

		private void drag(object sender, MouseButtonEventArgs e)
		{
			//IL_0001: Unknown result type (might be due to invalid IL or missing references)
			if ((int)e.ChangedButton == 0)
			{
				((Window)this).DragMove();
			}
		}

		private void Window_Loaded(object sender, RoutedEventArgs e)
		{
			try
			{
				string fileName = Process.GetCurrentProcess().MainModule.FileName;
				Environment.SetEnvironmentVariable("SOLARA_BOOTSTRAPPER", fileName, EnvironmentVariableTarget.User);
			}
			catch (Exception)
			{
			}
			if (string.IsNullOrEmpty(Settings.Default.FolderPath))
			{
				Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData);
				try
				{
					_ = Settings.Default.FolderPath;
				}
				catch (SettingsPropertyNotFoundException)
				{
					Settings.Default.FolderPath = "";
					((SettingsBase)Settings.Default).Save();
				}
				MainFrame.Navigate((object)new Page0(this));
			}
			else if (!string.IsNullOrEmpty(Settings.Default.FolderPath))
			{
				MainFrame.Navigate((object)new Page3(this, Settings.Default.FolderPath));
			}
			else
			{
				MainFrame.Navigate((object)new Page1(this));
			}
		}

		public void NavigateToPage(Page nextPage)
		{
			//IL_0034: Unknown result type (might be due to invalid IL or missing references)
			//IL_0039: Unknown result type (might be due to invalid IL or missing references)
			//IL_003f: Expected O, but got Unknown
			DoubleAnimation val = new DoubleAnimation(1.0, 0.0, new Duration(TimeSpan.FromSeconds(0.3)));
			((Timeline)val).Completed += delegate
			{
				//IL_0037: Unknown result type (might be due to invalid IL or missing references)
				//IL_003c: Unknown result type (might be due to invalid IL or missing references)
				//IL_0042: Expected O, but got Unknown
				MainFrame.Navigate((object)nextPage);
				DoubleAnimation val2 = new DoubleAnimation(0.0, 1.0, new Duration(TimeSpan.FromSeconds(0.3)));
				((UIElement)MainFrame).BeginAnimation(UIElement.OpacityProperty, (AnimationTimeline)(object)val2);
			};
			((UIElement)MainFrame).BeginAnimation(UIElement.OpacityProperty, (AnimationTimeline)(object)val);
		}

		private async void Window_Closing(object sender, CancelEventArgs e)
		{
			e.Cancel = true;
			((Storyboard)((FrameworkElement)this).FindResource((object)"FadeOutStoryboard")).Begin((FrameworkElement)(object)this);
			await Task.Delay(1000);
			Application.Current.Shutdown();
		}

		private void CloseButton_Click(object sender, RoutedEventArgs e)
		{
			((Window)this).Close();
		}

		[DebuggerNonUserCode]
		[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
		public void InitializeComponent()
		{
			if (!_contentLoaded)
			{
				_contentLoaded = true;
				Uri uri = new Uri("/Bootstrapper;component/mainwindow.xaml", UriKind.Relative);
				Application.LoadComponent((object)this, uri);
			}
		}

		[DebuggerNonUserCode]
		[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
		[EditorBrowsable(EditorBrowsableState.Never)]
		void IComponentConnector.Connect(int connectionId, object target)
		{
			//IL_002e: Unknown result type (might be due to invalid IL or missing references)
			//IL_0038: Expected O, but got Unknown
			//IL_0051: Unknown result type (might be due to invalid IL or missing references)
			//IL_005d: Unknown result type (might be due to invalid IL or missing references)
			//IL_0067: Expected O, but got Unknown
			//IL_0069: Unknown result type (might be due to invalid IL or missing references)
			//IL_0075: Unknown result type (might be due to invalid IL or missing references)
			//IL_007f: Expected O, but got Unknown
			//IL_0082: Unknown result type (might be due to invalid IL or missing references)
			//IL_008c: Expected O, but got Unknown
			//IL_008e: Unknown result type (might be due to invalid IL or missing references)
			//IL_009a: Unknown result type (might be due to invalid IL or missing references)
			//IL_00a4: Expected O, but got Unknown
			switch (connectionId)
			{
			case 1:
				((FrameworkElement)(MainWindow)target).Loaded += new RoutedEventHandler(Window_Loaded);
				((Window)(MainWindow)target).Closing += Window_Closing;
				break;
			case 2:
				((UIElement)(Grid)target).MouseDown += new MouseButtonEventHandler(drag);
				break;
			case 3:
				((ButtonBase)(Button)target).Click += new RoutedEventHandler(CloseButton_Click);
				break;
			case 4:
				MainFrame = (Frame)target;
				break;
			case 5:
				((UIElement)(Image)target).MouseDown += new MouseButtonEventHandler(drag);
				break;
			default:
				_contentLoaded = true;
				break;
			}
		}
	}
	public class Page0 : Page, IComponentConnector
	{
		public struct DWM_BLURBEHIND
		{
			public uint dwFlags;

			public bool fEnable;

			public IntPtr hRgnBlur;

			public bool fTransitionOnMaximized;
		}

		private const uint DWM_BB_ENABLE = 1u;

		private MainWindow _mainWindow;

		internal Image GlowingImage;

		internal Button GlowingButton;

		private bool _contentLoaded;

		[DllImport("dwmapi.dll")]
		public static extern int DwmEnableBlurBehindWindow(IntPtr hWnd, ref DWM_BLURBEHIND pBlurBehind);

		public Page0(MainWindow mainWindow)
		{
			InitializeComponent();
			_mainWindow = mainWindow;
		}

		private void GlowingButton_Click(object sender, RoutedEventArgs e)
		{
			_mainWindow.NavigateToPage((Page)(object)new Page1(_mainWindow));
		}

		private void drag(object sender, MouseButtonEventArgs e)
		{
			//IL_0001: Unknown result type (might be due to invalid IL or missing references)
			if ((int)e.ChangedButton == 0)
			{
				((Window)_mainWindow).DragMove();
			}
		}

		private void CloseButton_Click(object sender, RoutedEventArgs e)
		{
			((Window)_mainWindow).Close();
		}

		private void Page_Loaded(object sender, RoutedEventArgs e)
		{
			//IL_0006: Unknown result type (might be due to invalid IL or missing references)
			IntPtr handle = new WindowInteropHelper(Window.GetWindow((DependencyObject)(object)this)).Handle;
			DWM_BLURBEHIND pBlurBehind = new DWM_BLURBEHIND
			{
				dwFlags = 1u,
				fEnable = true,
				hRgnBlur = IntPtr.Zero
			};
			DwmEnableBlurBehindWindow(handle, ref pBlurBehind);
		}

		[DebuggerNonUserCode]
		[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
		public void InitializeComponent()
		{
			if (!_contentLoaded)
			{
				_contentLoaded = true;
				Uri uri = new Uri("/Bootstrapper;component/page0.xaml", UriKind.Relative);
				Application.LoadComponent((object)this, uri);
			}
		}

		[DebuggerNonUserCode]
		[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
		[EditorBrowsable(EditorBrowsableState.Never)]
		void IComponentConnector.Connect(int connectionId, object target)
		{
			//IL_000c: Unknown result type (might be due to invalid IL or missing references)
			//IL_0016: Expected O, but got Unknown
			//IL_0019: Unknown result type (might be due to invalid IL or missing references)
			//IL_0023: Expected O, but got Unknown
			//IL_0030: Unknown result type (might be due to invalid IL or missing references)
			//IL_003a: Expected O, but got Unknown
			switch (connectionId)
			{
			case 1:
				GlowingImage = (Image)target;
				break;
			case 2:
				GlowingButton = (Button)target;
				((ButtonBase)GlowingButton).Click += new RoutedEventHandler(GlowingButton_Click);
				break;
			default:
				_contentLoaded = true;
				break;
			}
		}
	}
	public class Page1 : Page, IComponentConnector
	{
		public class Config
		{
			public bool DontShowChangeLogs { get; set; }

			public string FolderPath { get; set; }
		}

		private MainWindow _mainWindow;

		internal Button GlowingButton;

		internal TextBlock FolderPathTextBox;

		private bool _contentLoaded;

		private void drag(object sender, MouseButtonEventArgs e)
		{
			//IL_0001: Unknown result type (might be due to invalid IL or missing references)
			if ((int)e.ChangedButton == 0)
			{
				((Window)_mainWindow).DragMove();
			}
		}

		public Page1(MainWindow mainWindow)
		{
			InitializeComponent();
			_mainWindow = mainWindow;
			string folderPath = Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData);
			FolderPathTextBox.Text = folderPath;
			Settings.Default.FolderPath = folderPath;
			((SettingsBase)Settings.Default).Save();
		}

		private void CloseButton_Click(object sender, RoutedEventArgs e)
		{
			((Window)_mainWindow).Close();
		}

		private void GlowingButton_Click(object sender, RoutedEventArgs e)
		{
			_mainWindow.NavigateToPage((Page)(object)new Page3(_mainWindow, FolderPathTextBox.Text));
		}

		private void UpdateFolderPathInConfig(string newFolderPath)
		{
			//IL_0030: Unknown result type (might be due to invalid IL or missing references)
			try
			{
				Settings.Default.FolderPath = newFolderPath;
				((SettingsBase)Settings.Default).Save();
			}
			catch (Exception ex)
			{
				MessageBox.Show("An error occurred while updating the folder path: " + ex.Message, "Error", (MessageBoxButton)0, (MessageBoxImage)16);
			}
		}

		private void Button_Click(object sender, RoutedEventArgs e)
		{
			//IL_0000: Unknown result type (might be due to invalid IL or missing references)
			//IL_0005: Unknown result type (might be due to invalid IL or missing references)
			//IL_000c: Unknown result type (might be due to invalid IL or missing references)
			//IL_0018: Expected O, but got Unknown
			//IL_0019: Unknown result type (might be due to invalid IL or missing references)
			//IL_001f: Invalid comparison between Unknown and I4
			CommonOpenFileDialog val = new CommonOpenFileDialog
			{
				IsFolderPicker = true,
				Title = "Select a Folder"
			};
			if ((int)((CommonFileDialog)val).ShowDialog() == 1)
			{
				FolderPathTextBox.Text = ((CommonFileDialog)val).FileName;
				UpdateFolderPathInConfig(FolderPathTextBox.Text);
			}
		}

		[DebuggerNonUserCode]
		[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
		public void InitializeComponent()
		{
			if (!_contentLoaded)
			{
				_contentLoaded = true;
				Uri uri = new Uri("/Bootstrapper;component/page1.xaml", UriKind.Relative);
				Application.LoadComponent((object)this, uri);
			}
		}

		[DebuggerNonUserCode]
		[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
		[EditorBrowsable(EditorBrowsableState.Never)]
		void IComponentConnector.Connect(int connectionId, object target)
		{
			//IL_0018: Unknown result type (might be due to invalid IL or missing references)
			//IL_0022: Expected O, but got Unknown
			//IL_002f: Unknown result type (might be due to invalid IL or missing references)
			//IL_0039: Expected O, but got Unknown
			//IL_003c: Unknown result type (might be due to invalid IL or missing references)
			//IL_0046: Expected O, but got Unknown
			//IL_0048: Unknown result type (might be due to invalid IL or missing references)
			//IL_0054: Unknown result type (might be due to invalid IL or missing references)
			//IL_005e: Expected O, but got Unknown
			switch (connectionId)
			{
			case 1:
				GlowingButton = (Button)target;
				((ButtonBase)GlowingButton).Click += new RoutedEventHandler(GlowingButton_Click);
				break;
			case 2:
				FolderPathTextBox = (TextBlock)target;
				break;
			case 3:
				((ButtonBase)(Button)target).Click += new RoutedEventHandler(Button_Click);
				break;
			default:
				_contentLoaded = true;
				break;
			}
		}
	}
	public class Page3 : Page, IComponentConnector
	{
		public class Config
		{
			public bool DontShowChangeLogs { get; set; }

			public string FolderPath { get; set; }
		}

		private MainWindow _mainWindow;

		private string pathstr;

		internal TextBlock Status;

		private bool _contentLoaded;

		private void drag(object sender, MouseButtonEventArgs e)
		{
			//IL_0001: Unknown result type (might be due to invalid IL or missing references)
			if ((int)e.ChangedButton == 0)
			{
				((Window)_mainWindow).DragMove();
			}
		}

		public Page3(MainWindow mainWindow, string path)
		{
			pathstr = path;
			InitializeComponent();
			_mainWindow = mainWindow;
		}

		public void SetStatus(string status)
		{
			Status.Text = status;
		}

		public static void SignalSolaraToExit()
		{
			if (EventWaitHandle.TryOpenExisting("Global\\SolaraSingleton", out EventWaitHandle result))
			{
				result.Set();
				result.Dispose();
			}
		}

		private async void Page_Loaded(object sender, RoutedEventArgs e)
		{
			try
			{
				SignalSolaraToExit();
			}
			catch (Exception)
			{
			}
			Process[] processes = Process.GetProcessesByName("Solara");
			if (processes.Length != 0)
			{
				SetStatus("Waiting for a previous Solara to FULLY exit...");
				await Task.Run(delegate
				{
					Process[] array = processes;
					foreach (Process process in array)
					{
						try
						{
							try
							{
								process.Kill();
							}
							catch (Exception)
							{
							}
							process.WaitForExit();
						}
						catch (Exception)
						{
						}
					}
				});
			}
			if (!(await new Installer().StartAsync(this)))
			{
				MessageBox.Show("Installation failed.", "Error", (MessageBoxButton)0, (MessageBoxImage)16);
				((Window)_mainWindow).Close();
				return;
			}
			string path = Path.Combine(Settings.Default.FolderPath, "Solara");
			if (File.Exists(Path.Combine(path, "Solara.exe")) && File.Exists(Path.Combine(path, "SolaraV3.dll")))
			{
				string text = Path.Combine(path, "Solara.exe");
				string text2 = AppContext.BaseDirectory.TrimEnd(new char[1] { '\\' });
				try
				{
					ProcessStartInfo processStartInfo = new ProcessStartInfo();
					processStartInfo.FileName = text;
					processStartInfo.Arguments = "--bootstrapperPath \"" + text2 + "\" --bootstrapperExe \"" + Process.GetCurrentProcess().MainModule.FileName + "\"";
					processStartInfo.UseShellExecute = true;
					processStartInfo.WorkingDirectory = Path.GetDirectoryName(text);
					Process.Start(processStartInfo);
				}
				catch (Exception ex2)
				{
					MessageBox.Show("Failed to start Solara.exe: " + ex2.Message, "Error", (MessageBoxButton)0, (MessageBoxImage)16);
				}
			}
			else
			{
				MessageBox.Show("Solara.exe or Solara DLL not found. This is likely an antivirus or ISP issue.", "Error", (MessageBoxButton)0, (MessageBoxImage)16);
			}
			await Task.Delay(1000);
			((Window)_mainWindow).Close();
		}

		[DebuggerNonUserCode]
		[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
		public void InitializeComponent()
		{
			if (!_contentLoaded)
			{
				_contentLoaded = true;
				Uri uri = new Uri("/Bootstrapper;component/page3.xaml", UriKind.Relative);
				Application.LoadComponent((object)this, uri);
			}
		}

		[DebuggerNonUserCode]
		[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
		[EditorBrowsable(EditorBrowsableState.Never)]
		void IComponentConnector.Connect(int connectionId, object target)
		{
			//IL_0017: Unknown result type (might be due to invalid IL or missing references)
			//IL_0021: Expected O, but got Unknown
			//IL_0024: Unknown result type (might be due to invalid IL or missing references)
			//IL_002e: Expected O, but got Unknown
			switch (connectionId)
			{
			case 1:
				((FrameworkElement)(Page3)target).Loaded += new RoutedEventHandler(Page_Loaded);
				break;
			case 2:
				Status = (TextBlock)target;
				break;
			default:
				_contentLoaded = true;
				break;
			}
		}
	}
	public static class ProcessExtensions
	{
		public static Task WaitForProcessExitAsync(this Process process, CancellationToken cancellationToken = default(CancellationToken))
		{
			if (process.HasExited)
			{
				return Task.CompletedTask;
			}
			TaskCompletionSource<object> tcs = new TaskCompletionSource<object>();
			process.Exited += ProcessExitedHandler;
			process.EnableRaisingEvents = true;
			if (cancellationToken != default(CancellationToken))
			{
				cancellationToken.Register(delegate
				{
					tcs.TrySetCanceled();
					process.Exited -= ProcessExitedHandler;
				});
			}
			return tcs.Task.ContinueWith(delegate(Task<object> task)
			{
				process.Exited -= ProcessExitedHandler;
				return task;
			}).Unwrap();
			void ProcessExitedHandler(object sender, EventArgs e)
			{
				tcs.TrySetResult(null);
			}
		}
	}
}
namespace Bootstrapper.Properties
{
	[GeneratedCode("System.Resources.Tools.StronglyTypedResourceBuilder", "4.0.0.0")]
	[DebuggerNonUserCode]
	[CompilerGenerated]
	internal class Resources
	{
		private static ResourceManager resourceMan;

		private static CultureInfo resourceCulture;

		[EditorBrowsable(EditorBrowsableState.Advanced)]
		internal static ResourceManager ResourceManager
		{
			get
			{
				if (resourceMan == null)
				{
					resourceMan = new ResourceManager("Bootstrapper.Properties.Resources", typeof(Resources).Assembly);
				}
				return resourceMan;
			}
		}

		[EditorBrowsable(EditorBrowsableState.Advanced)]
		internal static CultureInfo Culture
		{
			get
			{
				return resourceCulture;
			}
			set
			{
				resourceCulture = value;
			}
		}

		internal Resources()
		{
		}
	}
	[CompilerGenerated]
	[GeneratedCode("Microsoft.VisualStudio.Editors.SettingsDesigner.SettingsSingleFileGenerator", "17.14.0.0")]
	internal sealed class Settings : ApplicationSettingsBase
	{
		private static Settings defaultInstance = (Settings)(object)SettingsBase.Synchronized((SettingsBase)(object)new Settings());

		public static Settings Default => defaultInstance;

		[UserScopedSetting]
		[DebuggerNonUserCode]
		[DefaultSettingValue("")]
		public string FolderPath
		{
			get
			{
				return (string)((SettingsBase)this)["FolderPath"];
			}
			set
			{
				((SettingsBase)this)["FolderPath"] = value;
			}
		}
	}
}
namespace Costura
{
	[CompilerGenerated]
	internal static class AssemblyLoader
	{
		private static object nullCacheLock = new object();

		private static Dictionary<string, bool> nullCache = new Dictionary<string, bool>();

		private static Dictionary<string, string> assemblyNames = new Dictionary<string, string>();

		private static Dictionary<string, string> symbolNames = new Dictionary<string, string>();

		private static int isAttached;

		private static string CultureToString(CultureInfo culture)
		{
			if (culture == null)
			{
				return string.Empty;
			}
			return culture.Name;
		}

		private static Assembly ReadExistingAssembly(AssemblyName name)
		{
			AppDomain currentDomain = AppDomain.CurrentDomain;
			Assembly[] assemblies = currentDomain.GetAssemblies();
			Assembly[] array = assemblies;
			foreach (Assembly assembly in array)
			{
				AssemblyName name2 = assembly.GetName();
				if (string.Equals(name2.Name, name.Name, StringComparison.InvariantCultureIgnoreCase) && string.Equals(CultureToString(name2.CultureInfo), CultureToString(name.CultureInfo), StringComparison.InvariantCultureIgnoreCase))
				{
					return assembly;
				}
			}
			return null;
		}

		private static string GetAssemblyResourceName(AssemblyName requestedAssemblyName)
		{
			string text = requestedAssemblyName.Name.ToLowerInvariant();
			if (requestedAssemblyName.CultureInfo != null && !string.IsNullOrEmpty(requestedAssemblyName.CultureInfo.Name))
			{
				text = (CultureToString(requestedAssemblyName.CultureInfo) + "." + text).ToLowerInvariant();
			}
			return text;
		}

		private static void CopyTo(Stream source, Stream destination)
		{
			byte[] array = new byte[81920];
			int count;
			while ((count = source.Read(array, 0, array.Length)) != 0)
			{
				destination.Write(array, 0, count);
			}
		}

		private static Stream LoadStream(string fullName)
		{
			Assembly executingAssembly = Assembly.GetExecutingAssembly();
			if (fullName.EndsWith(".compressed"))
			{
				using (Stream stream = executingAssembly.GetManifestResourceStream(fullName))
				{
					using DeflateStream source = new DeflateStream(stream, CompressionMode.Decompress);
					MemoryStream memoryStream = new MemoryStream();
					CopyTo(source, memoryStream);
					memoryStream.Position = 0L;
					return memoryStream;
				}
			}
			return executingAssembly.GetManifestResourceStream(fullName);
		}

		private static Stream LoadStream(Dictionary<string, string> resourceNames, string name)
		{
			if (resourceNames.TryGetValue(name, out var value))
			{
				return LoadStream(value);
			}
			return null;
		}

		private static byte[] ReadStream(Stream stream)
		{
			byte[] array = new byte[stream.Length];
			stream.Read(array, 0, array.Length);
			return array;
		}

		private static Assembly ReadFromEmbeddedResources(Dictionary<string, string> assemblyNames, Dictionary<string, string> symbolNames, AssemblyName requestedAssemblyName)
		{
			string assemblyResourceName = GetAssemblyResourceName(requestedAssemblyName);
			byte[] rawAssembly;
			using (Stream stream = LoadStream(assemblyNames, assemblyResourceName))
			{
				if (stream == null)
				{
					return null;
				}
				rawAssembly = ReadStream(stream);
			}
			using (Stream stream2 = LoadStream(symbolNames, assemblyResourceName))
			{
				if (stream2 != null)
				{
					byte[] rawSymbolStore = ReadStream(stream2);
					return Assembly.Load(rawAssembly, rawSymbolStore);
				}
			}
			return Assembly.Load(rawAssembly);
		}

		public static Assembly ResolveAssembly(object sender, ResolveEventArgs e)
		{
			string name = e.Name;
			AssemblyName assemblyName = new AssemblyName(name);
			lock (nullCacheLock)
			{
				if (nullCache.ContainsKey(name))
				{
					return null;
				}
			}
			Assembly assembly = ReadExistingAssembly(assemblyName);
			if ((object)assembly != null)
			{
				return assembly;
			}
			assembly = ReadFromEmbeddedResources(assemblyNames, symbolNames, assemblyName);
			if ((object)assembly == null)
			{
				lock (nullCacheLock)
				{
					nullCache[name] = true;
				}
				if ((assemblyName.Flags & AssemblyNameFlags.Retargetable) != AssemblyNameFlags.None)
				{
					assembly = Assembly.Load(assemblyName);
				}
			}
			return assembly;
		}

		static AssemblyLoader()
		{
			assemblyNames.Add("costura", "costura.costura.dll.compressed");
			symbolNames.Add("costura", "costura.costura.pdb.compressed");
			assemblyNames.Add("microsoft.aspnetcore.systemwebadapters", "costura.microsoft.aspnetcore.systemwebadapters.dll.compressed");
			symbolNames.Add("microsoft.aspnetcore.systemwebadapters", "costura.microsoft.aspnetcore.systemwebadapters.pdb.compressed");
			assemblyNames.Add("microsoft.bcl.asyncinterfaces", "costura.microsoft.bcl.asyncinterfaces.dll.compressed");
			assemblyNames.Add("microsoft.windowsapicodepack", "costura.microsoft.windowsapicodepack.dll.compressed");
			assemblyNames.Add("microsoft.windowsapicodepack.shell", "costura.microsoft.windowsapicodepack.shell.dll.compressed");
			assemblyNames.Add("newtonsoft.json", "costura.newtonsoft.json.dll.compressed");
			assemblyNames.Add("presentationcore", "costura.presentationcore.dll.compressed");
			assemblyNames.Add("presentationframework", "costura.presentationframework.dll.compressed");
			assemblyNames.Add("system.buffers", "costura.system.buffers.dll.compressed");
			assemblyNames.Add("system.codedom", "costura.system.codedom.dll.compressed");
			assemblyNames.Add("system.data", "costura.system.data.dll.compressed");
			assemblyNames.Add("system.io.compression.filesystem", "costura.system.io.compression.filesystem.dll.compressed");
			assemblyNames.Add("system.io.pipelines", "costura.system.io.pipelines.dll.compressed");
			assemblyNames.Add("system.memory", "costura.system.memory.dll.compressed");
			assemblyNames.Add("system.net.http", "costura.system.net.http.dll.compressed");
			assemblyNames.Add("system.numerics.vectors", "costura.system.numerics.vectors.dll.compressed");
			assemblyNames.Add("system.runtime.compilerservices.unsafe", "costura.system.runtime.compilerservices.unsafe.dll.compressed");
			assemblyNames.Add("system.text.encodings.web", "costura.system.text.encodings.web.dll.compressed");
			assemblyNames.Add("system.text.json", "costura.system.text.json.dll.compressed");
			assemblyNames.Add("system.threading.tasks.extensions", "costura.system.threading.tasks.extensions.dll.compressed");
			assemblyNames.Add("system.valuetuple", "costura.system.valuetuple.dll.compressed");
			assemblyNames.Add("system.windows.forms", "costura.system.windows.forms.dll.compressed");
			assemblyNames.Add("system.xaml", "costura.system.xaml.dll.compressed");
			assemblyNames.Add("system.xml", "costura.system.xml.dll.compressed");
			assemblyNames.Add("system.xml.linq", "costura.system.xml.linq.dll.compressed");
			assemblyNames.Add("windowsbase", "costura.windowsbase.dll.compressed");
			assemblyNames.Add("wpfanimatedgif", "costura.wpfanimatedgif.dll.compressed");
			symbolNames.Add("wpfanimatedgif", "costura.wpfanimatedgif.pdb.compressed");
		}

		public static void Attach(bool subscribe)
		{
			if (Interlocked.Exchange(ref isAttached, 1) == 1 || !subscribe)
			{
				return;
			}
			AppDomain currentDomain = AppDomain.CurrentDomain;
			currentDomain.AssemblyResolve += delegate(object sender, ResolveEventArgs e)
			{
				string name = e.Name;
				AssemblyName assemblyName = new AssemblyName(name);
				lock (nullCacheLock)
				{
					if (nullCache.ContainsKey(name))
					{
						return (Assembly)null;
					}
				}
				Assembly assembly = ReadExistingAssembly(assemblyName);
				if ((object)assembly != null)
				{
					return assembly;
				}
				assembly = ReadFromEmbeddedResources(assemblyNames, symbolNames, assemblyName);
				if ((object)assembly == null)
				{
					lock (nullCacheLock)
					{
						nullCache[name] = true;
					}
					if ((assemblyName.Flags & AssemblyNameFlags.Retargetable) != AssemblyNameFlags.None)
					{
						assembly = Assembly.Load(assemblyName);
					}
				}
				return assembly;
			};
		}
	}
}
internal class Bootstrapper_ProcessedByFody
{
	internal const string FodyVersion = "6.8.2.0";

	internal const string Costura = "6.0.0";
}
