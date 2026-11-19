/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9cd80
 */

ulong WPACKET_put_bytes__(long param_1,ulong param_2,ulong param_3)

{
  ulong uVar1;
  long local_28;
  
  uVar1 = 0;
  if ((param_3 < 9) && (uVar1 = WPACKET_reserve_bytes(param_1,param_3,&local_28), (int)uVar1 != 0))
  {
    *(ulong *)(param_1 + 0x18) = param_3 + *(long *)(param_1 + 0x18);
    *(ulong *)(param_1 + 0x10) = param_3 + *(long *)(param_1 + 0x10);
    if (local_28 == 0) {
      uVar1 = 1;
    }
    else {
      for (; param_3 != 0; param_3 = param_3 - 1) {
        *(char *)(local_28 + param_3 + -1) = (char)param_2;
        param_2 = param_2 >> 8;
      }
      uVar1 = (ulong)(param_2 == 0);
    }
  }
  return uVar1;
}

