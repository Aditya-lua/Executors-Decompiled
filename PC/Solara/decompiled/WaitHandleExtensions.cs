using System.Threading;
using System.Threading.Tasks;

namespace SolaraUI;

public static class WaitHandleExtensions
{
	public static Task WaitAsync(this WaitHandle waitHandle)
	{
		TaskCompletionSource<bool> taskCompletionSource = new TaskCompletionSource<bool>();
		ThreadPool.RegisterWaitForSingleObject(waitHandle, delegate(object state, bool timedOut)
		{
			((TaskCompletionSource<bool>)state).TrySetResult(result: true);
		}, taskCompletionSource, -1, executeOnlyOnce: true);
		return taskCompletionSource.Task;
	}
}
