/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a5a7c
 */

/* ix::SocketTLSOptions::hasCertAndKey() const */

bool __thiscall ix::SocketTLSOptions::hasCertAndKey(SocketTLSOptions *this)

{
  ulong uVar1;
  
  if (((byte)*this & 1) == 0) {
    if ((byte)*this >> 1 == 0) {
      return false;
    }
  }
  else if (*(long *)(this + 8) == 0) {
    return false;
  }
  if (((byte)this[0x18] & 1) == 0) {
    uVar1 = (ulong)((byte)this[0x18] >> 1);
  }
  else {
    uVar1 = *(ulong *)(this + 0x20);
  }
  return uVar1 != 0;
}

