/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00984a54
 */

/* ix::Socket::recv(void*, unsigned long) */

void __thiscall ix::Socket::recv(Socket *this,void *param_1,ulong param_2)

{
  ::recv(*(int *)(this + 8),param_1,param_2,0x4000);
  return;
}

