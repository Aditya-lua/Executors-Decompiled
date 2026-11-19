/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0acbc
 */

undefined8 bn_lshift_fixed_top(long *param_1,long *param_2,uint param_3)

{
  bool bVar1;
  ulong *puVar2;
  uint uVar3;
  long lVar4;
  void *__s;
  undefined8 uVar5;
  int iVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  
  uVar3 = param_3 + 0x3f;
  if (-1 < (int)param_3) {
    uVar3 = param_3;
  }
  uVar3 = (int)uVar3 >> 6;
  lVar4 = bn_wexpand(param_1,uVar3 + 1 + (int)param_2[1]);
  uVar5 = 0;
  if (lVar4 != 0) {
    iVar6 = (int)param_2[1];
    if (iVar6 == 0) {
      __s = (void *)*param_1;
      *(undefined8 *)((long)__s + (long)(int)uVar3 * 8) = 0;
    }
    else {
      lVar7 = *param_2;
      __s = (void *)*param_1;
      uVar9 = *(ulong *)(lVar7 + (long)(iVar6 + -1) * 8);
      uVar8 = (ulong)(-param_3 & 0x3f);
      uVar11 = -uVar8 | -uVar8 >> 8;
      puVar2 = (ulong *)((long)__s + (long)(int)uVar3 * 8);
      uVar10 = uVar9 << (param_3 & 0x3f);
      puVar2[iVar6] = uVar9 >> uVar8 & uVar11;
      lVar4 = (long)iVar6;
      if (1 < iVar6) {
        do {
          uVar9 = *(ulong *)(lVar7 + lVar4 * 8 + -0x10);
          puVar2[lVar4 + -1] = uVar9 >> uVar8 & uVar11 | uVar10;
          uVar10 = uVar9 << (param_3 & 0x3f);
          bVar1 = 2 < lVar4;
          lVar4 = lVar4 + -1;
        } while (bVar1);
      }
      *puVar2 = uVar10;
    }
    if (0x7e < param_3 + 0x3f) {
      memset(__s,0,-(ulong)(uVar3 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar3 << 3);
      iVar6 = (int)param_2[1];
    }
    lVar4 = param_2[2];
    uVar5 = 1;
    *(uint *)(param_1 + 1) = uVar3 + 1 + iVar6;
    *(int *)(param_1 + 2) = (int)lVar4;
  }
  return uVar5;
}

