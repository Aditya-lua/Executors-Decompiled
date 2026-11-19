/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a14284
 */

undefined8 SCT_set_source(long param_1,int param_2)

{
  undefined4 uVar1;
  
  *(int *)(param_1 + 0x5c) = param_2;
  *(undefined4 *)(param_1 + 0x60) = 0;
  if (param_2 - 1U < 3) {
    uVar1 = *(undefined4 *)(&DAT_007526c4 + (long)(int)(param_2 - 1U) * 4);
    *(undefined4 *)(param_1 + 0x60) = 0;
    *(undefined4 *)(param_1 + 0x58) = uVar1;
  }
  return 1;
}

