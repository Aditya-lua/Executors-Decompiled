/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091973c
 */

int FUN_0091973c(long param_1,int param_2,uint param_3)

{
  long lVar1;
  
  lVar1 = *(long *)(param_1 + 0x20);
  *(byte *)(param_1 + 0xd68) = *(byte *)(param_1 + 0xd68) & 0xfd;
  *(byte *)(param_1 + 0xd88) = *(byte *)(param_1 + 0xd88) & 0xfd;
  FUN_0090456c(param_1 + 0xc60);
  if ((((param_2 == 0) && ((param_3 & 1) == 0)) && (param_2 = 0, -1 < *(char *)(lVar1 + 0x3a1))) &&
     (param_2 = 0, *(char *)(param_1 + 0xa81) == '\0')) {
    param_2 = 0;
    if ((long)(*(long *)(param_1 + 0xe8) + (ulong)*(uint *)(param_1 + 0x108)) <=
        (long)(ulong)*(uint *)(param_1 + 0x110)) {
      FUN_00904b80(param_1,"Empty reply from server");
      FUN_00908c4c(lVar1,2);
      param_2 = 0x34;
    }
  }
  return param_2;
}

