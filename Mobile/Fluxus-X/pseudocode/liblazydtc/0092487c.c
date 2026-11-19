/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092487c
 */

undefined8 FUN_0092487c(long *param_1,long *param_2,long *param_3)

{
  ulong uVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  
  lVar3 = *param_1;
  if (lVar3 != 0) {
    if (*(ulong *)(lVar3 + 0x18) <= *(ulong *)(lVar3 + 0x10)) {
      FUN_009246cc(param_1);
      lVar3 = *param_1;
      if (lVar3 == 0) goto LAB_009248dc;
    }
    uVar1 = *(ulong *)(lVar3 + 0x10);
    lVar4 = *(ulong *)(lVar3 + 0x18) - uVar1;
    if (uVar1 <= *(ulong *)(lVar3 + 0x18) && lVar4 != 0) {
      *param_2 = lVar3 + uVar1 + 0x20;
      uVar2 = 1;
      goto LAB_009248e8;
    }
  }
LAB_009248dc:
  lVar4 = 0;
  uVar2 = 0;
  *param_2 = 0;
LAB_009248e8:
  *param_3 = lVar4;
  return uVar2;
}

