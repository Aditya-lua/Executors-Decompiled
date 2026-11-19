/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac5520
 */

void ossl_sa_doall_arg(int *param_1,code *param_2,undefined8 param_3)

{
  long lVar1;
  int iVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  long local_128 [16];
  uint local_a8 [18];
  
  if (param_1 != (int *)0x0) {
    local_a8[0] = 0;
    uVar7 = 0;
    uVar5 = 0;
    lVar3 = 0;
    local_128[0] = *(long *)(param_1 + 6);
LAB_00ac5580:
    iVar2 = (int)lVar3;
    lVar6 = local_128[iVar2];
    lVar3 = (long)iVar2;
    while (uVar4 = (ulong)(int)uVar7, (int)uVar7 < 0x10) {
      while ((local_a8[lVar3] = (int)uVar4 + 1, lVar6 == 0 ||
             (lVar1 = *(long *)(lVar6 + uVar4 * 8), lVar1 == 0))) {
        uVar4 = uVar4 + 1;
        if (0xf < (int)uVar4) goto LAB_00ac55ec;
      }
      uVar5 = uVar5 & 0xfffffffffffffff0 | uVar4;
      if (iVar2 < *param_1 + -1) {
        lVar3 = lVar3 + 1;
        uVar7 = 0;
        local_a8[lVar3] = 0;
        local_128[lVar3] = lVar1;
        uVar5 = uVar5 << 4;
        goto LAB_00ac5580;
      }
      uVar7 = uVar4 + 1;
      if (param_2 != (code *)0x0) {
        (*param_2)(uVar5,lVar1,param_3);
      }
    }
LAB_00ac55ec:
    if (0 < iVar2) {
      lVar3 = lVar3 + -1;
      uVar7 = (ulong)local_a8[lVar3];
      uVar5 = uVar5 >> 4;
      goto LAB_00ac5580;
    }
  }
  return;
}

