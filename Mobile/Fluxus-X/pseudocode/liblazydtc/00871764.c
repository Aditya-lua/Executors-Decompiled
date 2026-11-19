/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00871764
 */

int * FUN_00871764(long *param_1,int *param_2)

{
  int *piVar1;
  int *piVar2;
  int *piVar3;
  long lVar4;
  void *pvVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  code *pcVar10;
  long lVar11;
  int *piVar12;
  int *piVar14;
  int *piVar13;
  int *piVar15;
  
  lVar4 = tpidr_el0;
  lVar6 = *(long *)(lVar4 + 0x28);
  lVar11 = param_1[1] - *param_1;
  uVar7 = (lVar11 >> 3) * 0x2e8ba2e8ba2e8ba3 + 1;
  if (uVar7 < 0x2e8ba2e8ba2e8bb) {
    lVar8 = param_1[2] - *param_1 >> 3;
    uVar9 = lVar8 * 0x5d1745d1745d1746;
    if (uVar9 <= uVar7) {
      uVar9 = uVar7;
    }
    if (0x1745d1745d1745c < (ulong)(lVar8 * 0x2e8ba2e8ba2e8ba3)) {
      uVar9 = 0x2e8ba2e8ba2e8ba;
    }
    if (uVar9 == 0) {
      pvVar5 = (void *)0x0;
    }
    else {
      if (0x2e8ba2e8ba2e8ba < uVar9) goto LAB_0087195c;
      pvVar5 = operator_new(uVar9 * 0x58);
    }
    piVar1 = (int *)((long)pvVar5 + lVar11);
    pcVar10 = (code *)(&PTR_LAB_00c4a6f8)[*param_2];
    *piVar1 = *param_2;
                    /* try { // try from 0087185c to 00871863 has its CatchHandler @ 00871970 */
    (*pcVar10)(piVar1 + 2,param_2 + 2);
    piVar12 = (int *)*param_1;
    piVar3 = (int *)param_1[1];
    piVar2 = (int *)((long)piVar1 + ((long)piVar12 - (long)piVar3));
    if ((long)piVar12 - (long)piVar3 != 0) {
      piVar13 = piVar12;
      piVar15 = piVar2;
      do {
        piVar14 = piVar13 + 0x16;
        pcVar10 = (code *)(&PTR_LAB_00c4a6e8)[*piVar13];
        *piVar15 = *piVar13;
        (*pcVar10)(piVar15 + 2,piVar13 + 2);
        piVar13 = piVar14;
        piVar15 = piVar15 + 0x16;
      } while (piVar14 != piVar3);
      do {
                    /* try { // try from 008718d0 to 008718d7 has its CatchHandler @ 00871998 */
        (*(code *)(&PTR_LAB_00c4a6d8)[*piVar12])(piVar12 + 2);
        piVar12 = piVar12 + 0x16;
      } while (piVar12 != piVar3);
      piVar12 = (int *)*param_1;
    }
    lVar11 = param_1[2];
    *param_1 = (long)piVar2;
    param_1[1] = (long)(piVar1 + 0x16);
    param_1[2] = (long)((long)pvVar5 + uVar9 * 0x58);
    if (piVar12 != (int *)0x0) {
      operator_delete(piVar12,lVar11 - (long)piVar12);
    }
    if (*(long *)(lVar4 + 0x28) == lVar6) {
      return piVar1 + 0x16;
    }
  }
  else {
    if (*(long *)(lVar4 + 0x28) != lVar6) goto LAB_00871994;
    FUN_00871a4c();
LAB_0087195c:
    if (*(long *)(lVar4 + 0x28) == lVar6) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe1b8();
    }
  }
LAB_00871994:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

