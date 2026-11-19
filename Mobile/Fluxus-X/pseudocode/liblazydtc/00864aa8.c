/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00864aa8
 */

void FUN_00864aa8(long *param_1)

{
  long *plVar1;
  int iVar2;
  code *pcVar3;
  int *piVar4;
  int *piVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  
  plVar1 = (long *)*param_1;
  lVar6 = param_1[1] * 0x58;
  lVar7 = *plVar1;
  piVar5 = (int *)plVar1[1];
  if ((int *)(lVar6 + lVar7) != piVar5) {
    piVar4 = (int *)(lVar7 + lVar6);
    if ((int *)((long)piVar4 + ((long)piVar5 - (lVar6 + lVar7))) != piVar5) {
      lVar8 = (long)piVar5 - lVar7;
      do {
        if (lVar8 != lVar6) {
          piVar4 = (int *)(lVar7 + lVar6);
                    /* try { // try from 00864b4c to 00864b53 has its CatchHandler @ 00864b9c */
          (*(code *)(&PTR_LAB_00c4a6d8)[*piVar4])(piVar4 + 2);
          iVar2 = *(int *)(lVar7 + lVar8);
          pcVar3 = (code *)(&PTR_LAB_00c4a6e8)[iVar2];
          *piVar4 = iVar2;
          (*pcVar3)(piVar4 + 2,(int *)(lVar7 + lVar8) + 2);
        }
        lVar7 = lVar7 + 0x58;
      } while ((int *)(lVar7 + lVar8) != piVar5);
      piVar4 = (int *)(lVar7 + lVar6);
      piVar5 = (int *)plVar1[1];
    }
    while (piVar5 != piVar4) {
                    /* try { // try from 00864b70 to 00864b77 has its CatchHandler @ 00864ba0 */
      (*(code *)(&PTR_LAB_00c4a6d8)[piVar5[-0x16]])(piVar5 + -0x14);
      piVar5 = piVar5 + -0x16;
    }
    plVar1[1] = (long)piVar4;
  }
  return;
}

