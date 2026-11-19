/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009afb54
 */

void FUN_009afb54(int param_1,uint param_2,uint param_3,uint param_4,uint param_5,int param_6,
                 uint param_7,int param_8,int param_9,long *param_10,long *param_11)

{
  long *plVar1;
  bool bVar2;
  long *plVar3;
  bool bVar4;
  long *plVar5;
  long *plVar6;
  long *plVar7;
  long *plVar8;
  long lVar9;
  long *plVar10;
  
  if ((param_8 == 3) || (param_8 == 6)) {
    plVar5 = (long *)*param_10;
    plVar6 = (long *)*param_11;
    bVar2 = true;
    plVar3 = plVar5;
    plVar7 = plVar6;
  }
  else {
    plVar5 = (long *)*param_10;
    bVar2 = false;
    plVar6 = plVar5;
    plVar3 = (long *)*param_11;
    plVar7 = (long *)*param_11;
  }
  if ((plVar6 != (long *)0x0) && (plVar3 != (long *)0x0)) {
    do {
      lVar9 = 0x18;
      if (!bVar2) {
        lVar9 = 0x10;
      }
      plVar8 = *(long **)((long)plVar6 + lVar9);
      lVar9 = *plVar6;
      if (param_9 < 0) {
        if (((((((param_1 == 0) || (*(int *)(lVar9 + 0x18) == param_1)) &&
               ((param_2 == 0 || ((*(uint *)(lVar9 + 0x1c) & param_2) != 0)))) &&
              ((param_3 == 0 || ((*(uint *)(lVar9 + 0x20) & param_3) != 0)))) &&
             ((param_4 == 0 || ((*(uint *)(lVar9 + 0x24) & param_4) != 0)))) &&
            ((((param_5 == 0 || ((*(uint *)(lVar9 + 0x28) & param_5) != 0)) &&
              ((param_6 == 0 || (*(int *)(lVar9 + 0x2c) == param_6)))) &&
             (((param_7 & 0x1f) == 0 || ((*(uint *)(lVar9 + 0x3c) & param_7 & 0x1f) != 0)))))) &&
           (((param_7 & 0x20) == 0 || ((*(uint *)(lVar9 + 0x3c) & param_7 & 0x20) != 0))))
        goto LAB_009afbe8;
        goto switchD_009afbfc_caseD_5;
      }
      if (*(int *)(lVar9 + 0x44) != param_9) goto switchD_009afbfc_caseD_5;
LAB_009afbe8:
      if (5 < param_8 - 1U) goto switchD_009afbfc_caseD_5;
      plVar1 = plVar6 + 2;
      switch(param_8) {
      case 1:
        if ((int)plVar6[1] != 0) goto switchD_009afbfc_caseD_5;
        if (plVar6 != plVar7) {
          if (plVar6 == plVar5) {
            plVar5 = (long *)*plVar1;
          }
          lVar9 = plVar6[3];
          if (lVar9 != 0) {
            *(long *)(lVar9 + 0x10) = *plVar1;
          }
          if (*plVar1 != 0) {
            *(long *)(*plVar1 + 0x18) = lVar9;
          }
          plVar7[2] = (long)plVar6;
          plVar6[2] = 0;
          plVar6[3] = (long)plVar7;
          plVar7 = plVar6;
        }
        *(undefined4 *)(plVar6 + 1) = 1;
        break;
      case 2:
        plVar10 = (long *)plVar6[2];
        if (plVar6 != plVar5) {
          *(long **)(plVar6[3] + 0x10) = plVar10;
          plVar10 = plVar5;
        }
        if (plVar6 == plVar7) {
          plVar7 = (long *)plVar6[3];
        }
        lVar9 = plVar6[2];
        *(undefined4 *)(plVar6 + 1) = 0;
        if (lVar9 != 0) {
          *(long *)(lVar9 + 0x18) = plVar6[3];
        }
        if (plVar6[3] != 0) {
          *(long *)(plVar6[3] + 0x10) = lVar9;
        }
        *plVar1 = 0;
        plVar6[3] = 0;
        plVar5 = plVar10;
        break;
      case 3:
        if ((int)plVar6[1] == 0) goto switchD_009afbfc_caseD_5;
        if (plVar6 != plVar5) {
          if (plVar6 == plVar7) {
            plVar7 = (long *)plVar6[3];
          }
          lVar9 = *plVar1;
          if (lVar9 != 0) {
            *(long *)(lVar9 + 0x18) = plVar6[3];
          }
          if (plVar6[3] != 0) {
            *(long *)(plVar6[3] + 0x10) = lVar9;
          }
          plVar5[3] = (long)plVar6;
          plVar6[2] = (long)plVar5;
          plVar6[3] = 0;
          plVar5 = plVar6;
        }
        *(undefined4 *)(plVar6 + 1) = 0;
        break;
      case 4:
        if (((int)plVar6[1] == 0) || (plVar6 == plVar7)) goto switchD_009afbfc_caseD_5;
        if (plVar6 == plVar5) {
          plVar5 = (long *)*plVar1;
        }
        lVar9 = plVar6[3];
        if (lVar9 != 0) {
          *(long *)(lVar9 + 0x10) = *plVar1;
        }
        if (*plVar1 != 0) {
          *(long *)(*plVar1 + 0x18) = lVar9;
        }
        plVar7[2] = (long)plVar6;
        plVar6[2] = 0;
        plVar6[3] = (long)plVar7;
        plVar7 = plVar6;
        goto joined_r0x009afdb4;
      case 5:
        goto switchD_009afbfc_caseD_5;
      case 6:
        if (((int)plVar6[1] != 0) && (plVar6 != plVar5)) {
          if (plVar6 == plVar7) {
            plVar7 = (long *)plVar6[3];
          }
          lVar9 = *plVar1;
          if (lVar9 != 0) {
            *(long *)(lVar9 + 0x18) = plVar6[3];
          }
          if (plVar6[3] != 0) {
            *(long *)(plVar6[3] + 0x10) = lVar9;
          }
          plVar5[3] = (long)plVar6;
          plVar6[2] = (long)plVar5;
          plVar6[3] = 0;
          plVar5 = plVar6;
        }
        goto switchD_009afbfc_caseD_5;
      }
      if (plVar8 == (long *)0x0) break;
LAB_009afe04:
      bVar4 = plVar6 != plVar3;
      plVar6 = plVar8;
    } while (bVar4);
  }
LAB_009afe2c:
  *param_10 = (long)plVar5;
  *param_11 = (long)plVar7;
  return;
switchD_009afbfc_caseD_5:
joined_r0x009afdb4:
  if (plVar8 != (long *)0x0) goto LAB_009afe04;
  goto LAB_009afe2c;
}

