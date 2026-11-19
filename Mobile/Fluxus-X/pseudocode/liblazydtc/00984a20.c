/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00984a20
 */

/* ix::Socket::send(char*, unsigned long) */

void __thiscall ix::Socket::send(Socket *this,char *param_1,ulong param_2)

{
  ::send(*(int *)(this + 8),param_1,param_2,0x4000);
  return;
}

