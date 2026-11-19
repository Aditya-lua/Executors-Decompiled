/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a28458
 */

size_t EC_get_builtin_curves(EC_builtin_curve *r,size_t nitems)

{
  int *piVar1;
  int iVar2;
  ulong uVar3;
  int *piVar4;
  undefined **ppuVar5;
  EC_builtin_curve *pEVar6;
  char **ppcVar7;
  ulong uVar8;
  char *pcVar9;
  
  if ((r != (EC_builtin_curve *)0x0) && (nitems != 0)) {
    if (0x51 < nitems) {
      nitems = 0x52;
    }
    if (nitems != 0) {
      uVar3 = 0;
      if (2 < nitems) {
        uVar3 = nitems & 0x7e;
        piVar4 = &DAT_00c5b458;
        pEVar6 = r + 1;
        uVar8 = uVar3;
        do {
          iVar2 = *piVar4;
          uVar8 = uVar8 - 2;
          pEVar6[-1].nid = piVar4[-8];
          pEVar6->nid = iVar2;
          piVar1 = piVar4 + -2;
          pcVar9 = *(char **)(piVar4 + 6);
          piVar4 = piVar4 + 0x10;
          pEVar6[-1].comment = *(char **)piVar1;
          pEVar6->comment = pcVar9;
          pEVar6 = pEVar6 + 2;
        } while (uVar8 != 0);
        if (nitems == uVar3) {
          return 0x52;
        }
      }
      ppuVar5 = &PTR_s_SECG_WTLS_curve_over_a_112_bit_p_00c5b450 + uVar3 * 4;
      ppcVar7 = &r[uVar3].comment;
      do {
        uVar3 = uVar3 + 1;
        ((EC_builtin_curve *)(ppcVar7 + -1))->nid = *(int *)(ppuVar5 + -3);
        *ppcVar7 = *ppuVar5;
        ppuVar5 = ppuVar5 + 4;
        ppcVar7 = ppcVar7 + 2;
      } while (uVar3 < nitems);
    }
  }
  return 0x52;
}

