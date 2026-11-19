/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc320c
 */

/* std::__ndk1::__get_sp_mut(void const*) */

int std::__ndk1::__get_sp_mut(void *param_1)

{
  long lVar1;
  ulong uVar2;
  
  uVar2 = ((ulong)(uint)((int)param_1 << 3) + 8 ^ (ulong)param_1 >> 0x20) * -0x622015f714c7d297;
  lVar1 = ((ulong)param_1 >> 0x20 ^ uVar2 >> 0x2f ^ uVar2) * -0x622015f714c7d297;
  return (((uint)((ulong)lVar1 >> 0x2f) ^ (uint)lVar1) * 9 & 0x1f) * 8 + 0xcca4e0;
}

