/* 7ff70c96b5b0 FUN_7ff70c96b5b0 */

void FUN_7ff70c96b5b0(ulonglong *param_1,longlong param_2)

{
  char *pcVar1;
  ulonglong uVar2;
  char *pcVar3;
  undefined1 uVar4;
  char cVar5;
  byte bVar6;
  char *pcVar7;
  char *pcVar8;
  char *pcVar9;
  char *pcVar10;
  char *pcVar11;
  longlong lVar12;
  longlong lVar13;
  ulonglong uVar14;
  
  uVar2 = *param_1;
  pcVar3 = (char *)param_1[1];
  pcVar9 = (char *)param_1[2];
  if ((pcVar3 <= pcVar9 + -uVar2) || (*pcVar9 != 'R')) {
    *(undefined1 *)(param_1 + 3) = 1;
    uVar4 = 1;
    goto LAB_7ff70c96b641;
  }
  pcVar1 = pcVar3 + uVar2;
  uVar4 = 1;
  if (pcVar9 == pcVar1) goto LAB_7ff70c96b641;
  pcVar8 = pcVar9 + 1;
  param_1[2] = (ulonglong)pcVar8;
  if ((pcVar8 + -uVar2 < pcVar3) && (*pcVar8 == '\"')) {
    if (pcVar8 == pcVar1) goto LAB_7ff70c96b641;
    pcVar8 = pcVar9 + 2;
    param_1[2] = (ulonglong)pcVar8;
    bVar6 = (byte)param_1[3];
    pcVar7 = pcVar8 + -uVar2;
    pcVar10 = pcVar8;
    pcVar11 = pcVar8;
    if (pcVar8 != pcVar1 && (bVar6 & 1) == 0) {
      do {
        if ((pcVar7 < pcVar3) && (*pcVar10 == '(')) {
          bVar6 = 0;
          pcVar11 = pcVar10;
          goto LAB_7ff70c96b686;
        }
        pcVar10 = pcVar10 + 1;
        param_1[2] = (ulonglong)pcVar10;
        pcVar7 = pcVar7 + 1;
      } while (pcVar10 != pcVar1);
      bVar6 = 0;
      pcVar11 = pcVar1;
    }
LAB_7ff70c96b686:
    if (pcVar10 != pcVar1 && (bVar6 & 1) == 0) {
      pcVar7 = (char *)(((longlong)pcVar11 - (longlong)pcVar8) + 1);
      if (pcVar11 == pcVar8) {
        lVar13 = 0;
LAB_7ff70c96b6dd:
        if ((((pcVar3 <= pcVar10 + (lVar13 - uVar2)) || (pcVar10[lVar13] != ')')) ||
            (pcVar3 <= pcVar11 + (longlong)pcVar10 + lVar13 + (~uVar2 - (longlong)pcVar9))) ||
           ((pcVar10 + (longlong)pcVar7)[lVar13] != '\"')) goto LAB_7ff70c96b6c6;
        pcVar9 = pcVar10 + lVar13;
LAB_7ff70c96b780:
        pcVar8 = pcVar3 + ~(ulonglong)pcVar9 + uVar2;
        if (pcVar7 <= pcVar3 + ~(ulonglong)pcVar9 + uVar2) {
          pcVar8 = pcVar7;
        }
        pcVar11 = pcVar8 + 1;
        pcVar10 = pcVar9;
        if ((char *)0x4 < pcVar11) {
          uVar14 = 4;
          if (((ulonglong)pcVar11 & 3) != 0) {
            uVar14 = (ulonglong)((uint)pcVar11 & 3);
          }
          pcVar10 = pcVar9 + ((longlong)pcVar11 - uVar14);
          pcVar7 = pcVar7 + -((longlong)pcVar11 - uVar14);
          lVar13 = 0;
          do {
            lVar13 = lVar13 + -4;
          } while (~(ulonglong)pcVar8 + uVar14 != lVar13);
          param_1[2] = (longlong)pcVar9 - lVar13;
        }
        do {
          if (pcVar7 == (char *)0x0) goto LAB_7ff70c96b7f5;
          pcVar10 = pcVar10 + 1;
          param_1[2] = (ulonglong)pcVar10;
          pcVar7 = pcVar7 + -1;
        } while (pcVar10 != pcVar1);
        if (pcVar7 != (char *)0x0) goto LAB_7ff70c96b641;
      }
      else {
        lVar13 = (longlong)pcVar10 - uVar2;
        pcVar9 = pcVar10;
        do {
          lVar13 = lVar13 + 1;
          if ((pcVar9 + -uVar2 < pcVar3) && (*pcVar9 == ')')) {
            lVar12 = 0;
            do {
              if ((char *)(lVar13 + lVar12) < pcVar3) {
                cVar5 = pcVar9[lVar12 + 1];
              }
              else {
                cVar5 = '\0';
              }
              if (cVar5 != (pcVar8 + -uVar2)[lVar12 + uVar2]) goto LAB_7ff70c96b715;
              lVar12 = lVar12 + 1;
            } while ((longlong)pcVar11 - (longlong)pcVar8 != lVar12);
            if ((pcVar9 + ((longlong)pcVar7 - uVar2) < pcVar3) && (pcVar9[(longlong)pcVar7] == '\"')
               ) goto LAB_7ff70c96b780;
          }
LAB_7ff70c96b715:
          pcVar10 = pcVar9 + 1;
          param_1[2] = (ulonglong)pcVar10;
          pcVar9 = pcVar10;
        } while (pcVar10 != pcVar1);
      }
    }
    goto LAB_7ff70c96b7f5;
  }
LAB_7ff70c96b81d:
  *(undefined1 *)(param_1 + 3) = 1;
LAB_7ff70c96b641:
  *(undefined1 *)(param_2 + 1) = uVar4;
  return;
LAB_7ff70c96b6c6:
  lVar12 = lVar13 + 1;
  param_1[2] = (ulonglong)(pcVar10 + lVar12);
  lVar13 = lVar13 + 1;
  if (pcVar10 + lVar12 == pcVar1) goto LAB_7ff70c96b7f2;
  goto LAB_7ff70c96b6dd;
LAB_7ff70c96b7f2:
  pcVar10 = pcVar10 + lVar13;
LAB_7ff70c96b7f5:
  if ((pcVar10 + -uVar2 < pcVar3) && (*pcVar10 == '\"')) {
    if (pcVar10 != pcVar1) {
      param_1[2] = (ulonglong)(pcVar10 + 1);
      uVar4 = 0;
    }
    goto LAB_7ff70c96b641;
  }
  goto LAB_7ff70c96b81d;
}


