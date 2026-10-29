using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Linq;

namespace dotnet_codex_ui.Services;

internal sealed class ToastQueue
{
	internal const int SoftCap = 20;

	private readonly LinkedList<ToastHandle> Items = new LinkedList<ToastHandle>();

	public int Count => Items.Count;

	public ToastHandle? Enqueue(ToastHandle Handle)
	{
		ToastHandle result = null;
		if (Items.Count >= 20)
		{
			for (LinkedListNode<ToastHandle> linkedListNode = Items.First; linkedListNode != null; linkedListNode = linkedListNode.Next)
			{
				ToastType type = linkedListNode.Value.Notification.Type;
				if ((uint)type <= 1u)
				{
					result = linkedListNode.Value;
					Items.Remove(linkedListNode);
					break;
				}
			}
		}
		Items.AddLast(Handle);
		return result;
	}

	public bool TryDequeue([NotNullWhen(true)] out ToastHandle? Handle)
	{
		Handle = Items.First?.Value;
		if (Handle == null)
		{
			return false;
		}
		Items.RemoveFirst();
		return true;
	}

	public bool Remove(ToastHandle Handle)
	{
		return Items.Remove(Handle);
	}

	public List<ToastHandle> Clear()
	{
		List<ToastHandle> result = Items.ToList();
		Items.Clear();
		return result;
	}
}
