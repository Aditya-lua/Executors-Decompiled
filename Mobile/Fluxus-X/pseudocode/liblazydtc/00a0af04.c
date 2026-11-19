/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0af04
 */

undefined8 bn_rshift_fixed_top(long *param_1,long *param_2,uint param_3)

{
  int iVar1;
  uint uVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  long lVar10;
  
  uVar2 = param_3 + 0x3f;
  if (-1 < (int)param_3) {
    uVar2 = param_3;
  }
  iVar1 = (int)uVar2 >> 6;
  iVar3 = (int)param_2[1] - iVar1;
  if (iVar3 == 0 || (int)param_2[1] < iVar1) {
    BN_zero_ex(param_1);
  }
  else {
    if ((param_1 != param_2) && (lVar4 = bn_wexpand(param_1,iVar3), lVar4 == 0)) {
      return 0;
    }
    lVar8 = *param_2;
    lVar5 = *param_1;
    uVar6 = *(ulong *)(lVar8 + (long)iVar1 * 8);
    lVar4 = 0;
    if (iVar3 + -1 != 0 && 0 < iVar3) {
      uVar9 = -(ulong)(-param_3 & 0x3f);
      uVar7 = uVar6;
      do {
        lVar10 = lVar4 * 8;
        uVar6 = *(ulong *)(lVar8 + (long)iVar1 * 8 + 8 + lVar10);
        lVar4 = lVar4 + 1;
        *(ulong *)(lVar5 + lVar10) =
             uVar6 << (ulong)(-param_3 & 0x3f) & (uVar9 | uVar9 >> 8) | uVar7 >> (param_3 & 0x3f);
        uVar7 = uVar6;
      } while (lVar4 < iVar3 + -1);
    }
    *(ulong *)(lVar5 + lVar4 * 8) = uVar6 >> (param_3 & 0x3f);
    lVar4 = param_2[2];
    *(int *)(param_1 + 1) = iVar3;
    *(int *)(param_1 + 2) = (int)lVar4;
  }
  return 1;
}

