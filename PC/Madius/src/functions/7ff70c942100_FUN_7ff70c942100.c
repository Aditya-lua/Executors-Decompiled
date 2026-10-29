/* 7ff70c942100 FUN_7ff70c942100 */

undefined8
FUN_7ff70c942100(longlong *param_1,longlong param_2,undefined8 *param_3,undefined8 *param_4)

{
  longlong lVar1;
  longlong lVar2;
  longlong lVar3;
  longlong lVar4;
  char cVar5;
  int iVar6;
  undefined8 uVar7;
  longlong lVar8;
  int *piVar9;
  ulonglong uVar10;
  longlong lVar11;
  longlong lVar12;
  
  lVar12 = 0x1e8;
  lVar11 = param_2 + 0x528;
  if (*param_1 == 0x7ff70cbec850) {
    lVar12 = 600;
    lVar11 = param_2 + 0x5e0;
  }
  lVar1 = param_1[2];
  uVar7 = 0x201;
  lVar2 = param_1[3];
  *param_3 = 0;
  if ((*(char *)(lVar11 + 0x6c) == '\x01') && (*(longlong *)(param_2 + 0xc70) != 0)) {
    lVar11 = *(longlong *)(param_2 + 0xe8);
    if ((lVar11 == 0) || ((*(byte *)(lVar11 + 4) & 0x10) == 0)) {
      piVar9 = (int *)(param_2 + 0xc78);
      lVar11 = *(longlong *)(param_2 + 0x6a8);
    }
    else {
      piVar9 = (int *)(lVar11 + 0xd8);
      lVar11 = *(longlong *)(param_2 + 0x6a8);
    }
    if (lVar11 != 0) {
      lVar11 = 0x38;
      uVar10 = 0;
      do {
        lVar3 = *(longlong *)(param_2 + 0xc70);
        if ((*(longlong *)(lVar3 + -0x20 + lVar11) != 0) &&
           (iVar6 = FUN_7ff70c959220(*(undefined8 *)(lVar1 + 8),
                                     *(undefined8 *)(lVar3 + -0x38 + lVar11)), iVar6 != 0)) {
          lVar8 = param_1[3];
          lVar4 = *(longlong *)(lVar3 + -0x30 + lVar11);
          if (*(char *)(lVar8 + 0x2d1) == '\0') {
            if (lVar4 == 0) goto LAB_7ff70c942233;
          }
          else if ((lVar4 != 0) &&
                  (iVar6 = FUN_7ff70c959220(*(undefined8 *)(lVar8 + 0xa0)), iVar6 != 0)) {
            lVar8 = param_1[3];
LAB_7ff70c942233:
            iVar6 = *(int *)(lVar3 + -8 + lVar11);
            if (*(char *)(lVar8 + 0x2d2) == '\0') {
              if (iVar6 == -1) goto LAB_7ff70c942258;
            }
            else if ((iVar6 != -1) && (*(int *)(lVar8 + 0x604) == iVar6)) {
LAB_7ff70c942258:
              if ((*(int *)(lVar1 + 0x40) == *(int *)(lVar3 + -0xc + lVar11)) &&
                 ((iVar6 = FUN_7ff70c959220(**(undefined8 **)(lVar8 + 0x2e8),
                                            *(undefined8 *)(lVar3 + -0x28 + lVar11)), iVar6 != 0 &&
                  (cVar5 = FUN_7ff70c941a20(lVar12 + lVar2,lVar3 + lVar11), cVar5 != '\0')))) {
                iVar6 = *piVar9;
                *piVar9 = iVar6 + 1;
                *(int *)(lVar3 + -0x10 + lVar11) = iVar6 + 1;
                *param_3 = *(undefined8 *)(lVar3 + -0x20 + lVar11);
                if (param_4 != (undefined8 *)0x0) {
                  *param_4 = *(undefined8 *)(lVar3 + -0x18 + lVar11);
                }
                return 0;
              }
            }
          }
        }
        uVar10 = uVar10 + 1;
        lVar11 = lVar11 + 0xa8;
      } while (uVar10 < *(ulonglong *)(param_2 + 0x6a8));
      uVar7 = 1;
    }
  }
  return uVar7;
}


