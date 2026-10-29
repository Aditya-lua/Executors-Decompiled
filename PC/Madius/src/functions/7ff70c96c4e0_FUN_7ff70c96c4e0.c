/* 7ff70c96c4e0 FUN_7ff70c96c4e0 */

void FUN_7ff70c96c4e0(longlong *param_1,longlong param_2)

{
  byte *pbVar1;
  byte *pbVar2;
  byte bVar3;
  longlong lVar4;
  ulonglong uVar5;
  byte *pbVar6;
  undefined1 uVar7;
  uint uVar8;
  ulonglong uVar9;
  byte *pbVar10;
  byte *pbVar11;
  bool bVar12;
  
  lVar4 = *param_1;
  uVar5 = param_1[1];
  pbVar6 = (byte *)param_1[2];
  uVar9 = (longlong)pbVar6 - lVar4;
  uVar7 = 1;
  if (uVar5 <= uVar9) goto LAB_7ff70c96cadb;
  bVar3 = *pbVar6;
  if (bVar3 == 0x4e) {
    pbVar2 = (byte *)(lVar4 + uVar5);
    if (pbVar6 == pbVar2) goto LAB_7ff70c96cadb;
    pbVar10 = pbVar6 + 1;
    param_1[2] = (longlong)pbVar10;
    if (((ulonglong)((longlong)pbVar10 - lVar4) < uVar5) && (*pbVar10 == 0x7b)) {
      if (pbVar10 == pbVar2) goto LAB_7ff70c96cadb;
      pbVar1 = pbVar6 + 2;
      param_1[2] = (longlong)pbVar1;
      bVar12 = pbVar1 == pbVar2;
      pbVar11 = pbVar1;
      if ((!bVar12) && ((*(byte *)(param_1 + 3) & 1) == 0)) {
        if (((ulonglong)((longlong)pbVar1 - lVar4) < uVar5) && (*pbVar1 == 0x7d)) {
          bVar12 = false;
        }
        else {
          pbVar11 = pbVar6 + 3;
          param_1[2] = (longlong)pbVar11;
          bVar12 = true;
          pbVar10 = pbVar1;
          if (pbVar11 != pbVar2) {
            uVar9 = uVar9 + 3;
            pbVar6 = pbVar6 + 4;
            do {
              pbVar11 = pbVar6;
              if ((uVar9 < uVar5) && (pbVar11[-1] == 0x7d)) {
                bVar12 = false;
                pbVar10 = pbVar11 + -2;
                pbVar11 = pbVar11 + -1;
                goto LAB_7ff70c96ca98;
              }
              param_1[2] = (longlong)pbVar11;
              uVar9 = uVar9 + 1;
              pbVar6 = pbVar11 + 1;
            } while (pbVar11 != pbVar2);
            pbVar10 = pbVar11 + -1;
          }
        }
      }
LAB_7ff70c96ca98:
      if (((ulonglong)((longlong)pbVar11 - lVar4) < uVar5) && (*pbVar11 == 0x7d)) {
        if (bVar12) goto LAB_7ff70c96cadb;
LAB_7ff70c96cacb:
        pbVar10 = pbVar10 + 2;
        goto LAB_7ff70c96cacf;
      }
    }
LAB_7ff70c96cad7:
    *(undefined1 *)(param_1 + 3) = 1;
  }
  else {
    if (bVar3 == 0x55) {
      pbVar2 = (byte *)(lVar4 + uVar5);
      if (pbVar6 == pbVar2) goto LAB_7ff70c96cadb;
      pbVar10 = pbVar6 + 1;
      param_1[2] = (longlong)pbVar10;
      if ((uVar5 <= (ulonglong)((longlong)pbVar10 - lVar4)) ||
         (((9 < (int)(char)*pbVar10 - 0x30U &&
           ((uVar8 = *pbVar10 - 0x41, 0x25 < uVar8 ||
            ((0x3f0000003fU >> ((ulonglong)uVar8 & 0x3f) & 1) == 0)))) || (pbVar10 == pbVar2))))
      goto LAB_7ff70c96cadb;
      pbVar10 = pbVar6 + 2;
      param_1[2] = (longlong)pbVar10;
      if ((uVar5 <= (ulonglong)((longlong)pbVar10 - lVar4)) ||
         (((9 < (int)(char)*pbVar10 - 0x30U &&
           ((uVar8 = *pbVar10 - 0x41, 0x25 < uVar8 ||
            ((0x3f0000003fU >> ((ulonglong)uVar8 & 0x3f) & 1) == 0)))) || (pbVar10 == pbVar2))))
      goto LAB_7ff70c96cadb;
      pbVar10 = pbVar6 + 3;
      param_1[2] = (longlong)pbVar10;
      if (((uVar5 <= (ulonglong)((longlong)pbVar10 - lVar4)) ||
          ((9 < (int)(char)*pbVar10 - 0x30U &&
           ((uVar8 = *pbVar10 - 0x41, 0x25 < uVar8 ||
            ((0x3f0000003fU >> ((ulonglong)uVar8 & 0x3f) & 1) == 0)))))) || (pbVar10 == pbVar2))
      goto LAB_7ff70c96cadb;
      pbVar10 = pbVar6 + 4;
      param_1[2] = (longlong)pbVar10;
      if ((uVar5 <= (ulonglong)((longlong)pbVar10 - lVar4)) ||
         (((9 < (int)(char)*pbVar10 - 0x30U &&
           ((uVar8 = *pbVar10 - 0x41, 0x25 < uVar8 ||
            ((0x3f0000003fU >> ((ulonglong)uVar8 & 0x3f) & 1) == 0)))) || (pbVar10 == pbVar2))))
      goto LAB_7ff70c96cadb;
      pbVar10 = pbVar6 + 5;
      param_1[2] = (longlong)pbVar10;
      if ((uVar5 <= (ulonglong)((longlong)pbVar10 - lVar4)) ||
         (((9 < (int)(char)*pbVar10 - 0x30U &&
           ((uVar8 = *pbVar10 - 0x41, 0x25 < uVar8 ||
            ((0x3f0000003fU >> ((ulonglong)uVar8 & 0x3f) & 1) == 0)))) || (pbVar10 == pbVar2))))
      goto LAB_7ff70c96cadb;
      pbVar10 = pbVar6 + 6;
      param_1[2] = (longlong)pbVar10;
      if (((uVar5 <= (ulonglong)((longlong)pbVar10 - lVar4)) ||
          ((9 < (int)(char)*pbVar10 - 0x30U &&
           ((uVar8 = *pbVar10 - 0x41, 0x25 < uVar8 ||
            ((0x3f0000003fU >> ((ulonglong)uVar8 & 0x3f) & 1) == 0)))))) || (pbVar10 == pbVar2))
      goto LAB_7ff70c96cadb;
      pbVar10 = pbVar6 + 7;
      param_1[2] = (longlong)pbVar10;
      if ((uVar5 <= (ulonglong)((longlong)pbVar10 - lVar4)) ||
         (((9 < (int)(char)*pbVar10 - 0x30U &&
           ((uVar8 = *pbVar10 - 0x41, 0x25 < uVar8 ||
            ((0x3f0000003fU >> ((ulonglong)uVar8 & 0x3f) & 1) == 0)))) || (pbVar10 == pbVar2))))
      goto LAB_7ff70c96cadb;
      pbVar10 = pbVar6 + 8;
      param_1[2] = (longlong)pbVar10;
      if (((uVar5 <= (ulonglong)((longlong)pbVar10 - lVar4)) ||
          ((9 < (int)(char)*pbVar10 - 0x30U &&
           ((uVar8 = *pbVar10 - 0x41, 0x25 < uVar8 ||
            ((0x3f0000003fU >> ((ulonglong)uVar8 & 0x3f) & 1) == 0)))))) || (pbVar10 == pbVar2))
      goto LAB_7ff70c96cadb;
      pbVar10 = pbVar6 + 9;
    }
    else {
      if ((bVar3 != 0x75) || (pbVar2 = (byte *)(lVar4 + uVar5), pbVar6 == pbVar2))
      goto LAB_7ff70c96cadb;
      pbVar10 = pbVar6 + 1;
      param_1[2] = (longlong)pbVar10;
      if (uVar5 <= (ulonglong)((longlong)pbVar10 - lVar4)) goto LAB_7ff70c96cadb;
      if (*pbVar10 == 0x7b) {
        if (pbVar10 == pbVar2) goto LAB_7ff70c96cadb;
        pbVar1 = pbVar6 + 2;
        param_1[2] = (longlong)pbVar1;
        bVar12 = pbVar1 == pbVar2;
        pbVar11 = pbVar1;
        if ((!bVar12) && ((*(byte *)(param_1 + 3) & 1) == 0)) {
          if (((ulonglong)((longlong)pbVar1 - lVar4) < uVar5) && (*pbVar1 == 0x7d)) {
            bVar12 = false;
          }
          else {
            pbVar11 = pbVar6 + 3;
            param_1[2] = (longlong)pbVar11;
            bVar12 = true;
            pbVar10 = pbVar1;
            if (pbVar11 != pbVar2) {
              uVar9 = uVar9 + 3;
              pbVar6 = pbVar6 + 4;
              do {
                pbVar11 = pbVar6;
                if ((uVar9 < uVar5) && (pbVar11[-1] == 0x7d)) {
                  bVar12 = false;
                  pbVar10 = pbVar11 + -2;
                  pbVar11 = pbVar11 + -1;
                  goto LAB_7ff70c96cab6;
                }
                param_1[2] = (longlong)pbVar11;
                uVar9 = uVar9 + 1;
                pbVar6 = pbVar11 + 1;
              } while (pbVar11 != pbVar2);
              pbVar10 = pbVar11 + -1;
            }
          }
        }
LAB_7ff70c96cab6:
        if (((ulonglong)((longlong)pbVar11 - lVar4) < uVar5) && (*pbVar11 == 0x7d)) {
          if (bVar12) goto LAB_7ff70c96cadb;
          goto LAB_7ff70c96cacb;
        }
        goto LAB_7ff70c96cad7;
      }
      if (((9 < (int)(char)*pbVar10 - 0x30U) &&
          ((uVar8 = *pbVar10 - 0x41, 0x25 < uVar8 ||
           ((0x3f0000003fU >> ((ulonglong)uVar8 & 0x3f) & 1) == 0)))) || (pbVar10 == pbVar2))
      goto LAB_7ff70c96cadb;
      pbVar10 = pbVar6 + 2;
      param_1[2] = (longlong)pbVar10;
      if (((uVar5 <= (ulonglong)((longlong)pbVar10 - lVar4)) ||
          ((9 < (int)(char)*pbVar10 - 0x30U &&
           ((uVar8 = *pbVar10 - 0x41, 0x25 < uVar8 ||
            ((0x3f0000003fU >> ((ulonglong)uVar8 & 0x3f) & 1) == 0)))))) || (pbVar10 == pbVar2))
      goto LAB_7ff70c96cadb;
      pbVar10 = pbVar6 + 3;
      param_1[2] = (longlong)pbVar10;
      if (((uVar5 <= (ulonglong)((longlong)pbVar10 - lVar4)) ||
          ((9 < (int)(char)*pbVar10 - 0x30U &&
           ((uVar8 = *pbVar10 - 0x41, 0x25 < uVar8 ||
            ((0x3f0000003fU >> ((ulonglong)uVar8 & 0x3f) & 1) == 0)))))) || (pbVar10 == pbVar2))
      goto LAB_7ff70c96cadb;
      pbVar10 = pbVar6 + 4;
      param_1[2] = (longlong)pbVar10;
      if ((uVar5 <= (ulonglong)((longlong)pbVar10 - lVar4)) ||
         (((9 < (int)(char)*pbVar10 - 0x30U &&
           ((uVar8 = *pbVar10 - 0x41, 0x25 < uVar8 ||
            ((0x3f0000003fU >> ((ulonglong)uVar8 & 0x3f) & 1) == 0)))) || (pbVar10 == pbVar2))))
      goto LAB_7ff70c96cadb;
      pbVar10 = pbVar6 + 5;
    }
LAB_7ff70c96cacf:
    param_1[2] = (longlong)pbVar10;
    uVar7 = 0;
  }
LAB_7ff70c96cadb:
  *(undefined1 *)(param_2 + 1) = uVar7;
  return;
}


