/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00917850
 */

undefined4 FUN_00917850(long param_1,long *param_2)

{
  undefined4 uVar1;
  
  if ((*(byte *)(*(long *)(param_1 + 0x20) + 0x3a3) >> 1 & 1) == 0) {
    uVar1 = FUN_0090ec74();
  }
  else {
    uVar1 = FUN_00911dc8();
  }
  if (*param_2 != 0) {
    FUN_009178a8(param_1);
  }
  return uVar1;
}

