/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c22edc
 */

undefined1  [16] FUN_00c22edc(long *param_1)

{
  ulong uVar1;
  long lVar2;
  undefined1 auVar3 [16];
  ulong local_8;
  
  uVar1 = FUN_00c1441c(param_1,&local_8);
  if ((uVar1 & 1) == 0) {
    lVar2 = *param_1;
    if (local_8 <= (ulong)(param_1[1] - lVar2)) {
      *param_1 = lVar2 + local_8;
      goto LAB_00c22f24;
    }
  }
  lVar2 = 0;
  local_8 = 0;
LAB_00c22f24:
  auVar3._8_8_ = local_8;
  auVar3._0_8_ = lVar2;
  return auVar3;
}

