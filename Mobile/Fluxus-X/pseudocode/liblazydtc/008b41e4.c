/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b41e4
 */

void FUN_008b41e4(long param_1,int param_2)

{
  int iVar1;
  int iVar2;
  
  iVar2 = *(int *)(param_1 + 0x40);
  iVar1 = iVar2 + param_2;
  if (param_2 <= iVar2) {
    iVar1 = iVar2 << 1;
  }
  FUN_008b3fdc(param_1,iVar1,0);
  return;
}

