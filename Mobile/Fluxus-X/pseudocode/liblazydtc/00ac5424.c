/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac5424
 */

void ossl_sa_doall(int *param_1,code *param_2)

{
  long lVar1;
  int iVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  long local_120 [16];
  uint local_a0 [16];
  
  if (param_1 != (int *)0x0) {
    local_a0[0] = 0;
    uVar7 = 0;
    uVar5 = 0;
    lVar3 = 0;
    local_120[0] = *(long *)(param_1 + 6);
LAB_00ac5480:
    iVar2 = (int)lVar3;
    lVar6 = local_120[iVar2];
    lVar3 = (long)iVar2;
    while (uVar4 = (ulong)(int)uVar7, (int)uVar7 < 0x10) {
      while ((local_a0[lVar3] = (int)uVar4 + 1, lVar6 == 0 ||
             (lVar1 = *(long *)(lVar6 + uVar4 * 8), lVar1 == 0))) {
        uVar4 = uVar4 + 1;
        if (0xf < (int)uVar4) goto LAB_00ac54f8;
      }
      uVar5 = uVar5 & 0xfffffffffffffff0 | uVar4;
      if (iVar2 < *param_1 + -1) {
        lVar3 = lVar3 + 1;
        uVar7 = 0;
        local_a0[lVar3] = 0;
        local_120[lVar3] = lVar1;
        uVar5 = uVar5 << 4;
        goto LAB_00ac5480;
      }
      (*param_2)(uVar5);
      uVar7 = uVar4 + 1;
    }
LAB_00ac54f8:
    if (0 < iVar2) {
      lVar3 = lVar3 + -1;
      uVar7 = (ulong)local_a0[lVar3];
      uVar5 = uVar5 >> 4;
      goto LAB_00ac5480;
    }
  }
  return;
}

