using System;

namespace dotnet_codex_bootstrapper.Services;

public sealed class CdnException(string Message, int? StatusCode = null, Exception? Inner = null) : UpdateException("E-NET", Message, Inner)
{
	public int? StatusCode { get; } = StatusCode;

	public bool IsTransient
	{
		get
		{
			int? statusCode = StatusCode;
			if (statusCode.HasValue)
			{
				int valueOrDefault = statusCode.GetValueOrDefault();
				if (valueOrDefault < 500 && valueOrDefault != 408 && valueOrDefault != 429)
				{
					return false;
				}
			}
			return true;
		}
	}
}
