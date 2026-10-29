using System;
using System.Net.WebSockets;
using System.Threading;
using System.Threading.Tasks;

namespace Tether;

internal static class WsUtil
{
	public static async Task<int> ReceiveSingleAsync(WebSocket Ws, byte[] Buffer, int Max, CancellationToken Ct)
	{
		int Count = 0;
		ValueWebSocketReceiveResult valueWebSocketReceiveResult;
		do
		{
			if (Count >= Max)
			{
				return -1;
			}
			valueWebSocketReceiveResult = await Ws.ReceiveAsync(Buffer.AsMemory(Count, Max - Count), Ct).ConfigureAwait(continueOnCapturedContext: false);
			if (valueWebSocketReceiveResult.MessageType != WebSocketMessageType.Binary)
			{
				return -1;
			}
			Count += valueWebSocketReceiveResult.Count;
		}
		while (!valueWebSocketReceiveResult.EndOfMessage);
		return Count;
	}
}
