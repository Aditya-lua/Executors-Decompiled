namespace Tether;

internal readonly struct Outgoing(byte[] Buffer, int Length, Op Op, OutKind Kind)
{
	public readonly byte[] Buffer = Buffer;

	public readonly int Length = Length;

	public readonly Op Op = Op;

	public readonly OutKind Kind = Kind;
}
