/* 7ff70c96ba00 FUN_7ff70c96ba00 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c96ba00(longlong *param_1,longlong param_2)

{
  byte *pbVar1;
  longlong lVar2;
  byte *pbVar3;
  code *pcVar4;
  int iVar5;
  undefined1 uVar6;
  byte bVar7;
  byte bVar8;
  longlong lVar9;
  byte *pbVar10;
  byte *pbVar11;
  bool bVar12;
  
  lVar2 = *param_1;
  pbVar3 = (byte *)param_1[1];
  pbVar1 = pbVar3 + lVar2;
  bVar8 = *(byte *)(param_1 + 3);
  pbVar11 = (byte *)param_1[2];
  bVar12 = pbVar11 == pbVar1;
  if (bVar12 || (bVar8 & 1) != 0) {
LAB_7ff70c96bbb0:
    pbVar10 = pbVar11 + -lVar2;
    if (pbVar10 < pbVar3) goto LAB_7ff70c96bbbb;
LAB_7ff70c96bbf1:
    bVar7 = 0;
    iVar5 = (*_DAT_7ff70cb96660)();
    if (iVar5 == 0) goto LAB_7ff70c96bc00;
LAB_7ff70c96bc0d:
    pcVar4 = _DAT_7ff70cb96660;
    if (!bVar12 && (bVar8 & 1) == 0) {
      do {
        bVar8 = 0;
        if ((((pbVar3 <= pbVar10) || (bVar8 = *pbVar11, 9 < (int)(char)bVar8 - 0x30U)) &&
            (iVar5 = (*pcVar4)(), iVar5 == 0)) && ((bVar8 != 0x5f && (bVar8 != 0x24)))) break;
        pbVar11 = pbVar11 + 1;
        param_1[2] = (longlong)pbVar11;
        pbVar10 = pbVar10 + 1;
      } while (pbVar11 != pbVar1);
    }
  }
  else {
    lVar9 = 1;
    if (pbVar3 <= pbVar11 + -lVar2) {
      bVar12 = false;
      iVar5 = (*_DAT_7ff70cb96660)(0);
      if (iVar5 != 0) goto LAB_7ff70c96bae0;
      goto LAB_7ff70c96bbb0;
    }
    bVar7 = *pbVar11;
    if (((int)(char)bVar7 - 0x30U < 10) ||
       (iVar5 = (*_DAT_7ff70cb96660)((int)(char)bVar7), iVar5 != 0)) {
      if (((bVar7 - 0x45 < 0x2c) &&
          (((0x80100000801U >> ((ulonglong)(bVar7 - 0x45) & 0x3f) & 1) != 0 &&
           (pbVar11 + (1 - lVar2) < pbVar3)))) && ((pbVar11[1] == 0x2d || (pbVar11[1] == 0x2b)))) {
        pbVar10 = pbVar11 + 1;
        lVar9 = 2;
        if (pbVar10 == pbVar1) {
LAB_7ff70c96bac3:
          param_1[2] = (longlong)pbVar10;
          uVar6 = 1;
          goto LAB_7ff70c96bc1a;
        }
      }
LAB_7ff70c96bae0:
      pbVar11 = pbVar11 + lVar9;
      param_1[2] = (longlong)pbVar11;
      pcVar4 = _DAT_7ff70cb96660;
      bVar12 = true;
      while (pbVar11 != pbVar1) {
        if (pbVar11 + -lVar2 < pbVar3) {
          bVar7 = *pbVar11;
          if (((int)(char)bVar7 - 0x30U < 10) || (iVar5 = (*pcVar4)((int)(char)bVar7), iVar5 != 0))
          {
            lVar9 = 1;
            if (((bVar7 - 0x45 < 0x2c) &&
                (((0x80100000801U >> ((ulonglong)(bVar7 - 0x45) & 0x3f) & 1) != 0 &&
                 (pbVar11 + (1 - lVar2) < pbVar3)))) &&
               ((pbVar11[1] == 0x2d || (pbVar11[1] == 0x2b)))) {
              pbVar10 = pbVar11 + 1;
              lVar9 = 2;
              if (pbVar10 == pbVar1) goto LAB_7ff70c96bac3;
            }
          }
          else {
            lVar9 = 1;
            if ((bVar7 != 0x27) && (bVar7 != 0x2e)) goto LAB_7ff70c96bbe4;
          }
        }
        else {
          iVar5 = (*pcVar4)(0);
          lVar9 = 1;
          if (iVar5 == 0) {
            bVar12 = false;
            break;
          }
        }
        pbVar11 = pbVar11 + lVar9;
        param_1[2] = (longlong)pbVar11;
      }
      goto LAB_7ff70c96bbb0;
    }
    if ((bVar7 == 0x27) || (bVar7 == 0x2e)) goto LAB_7ff70c96bae0;
LAB_7ff70c96bbe4:
    bVar12 = false;
    pbVar10 = pbVar11 + -lVar2;
    if (pbVar3 <= pbVar10) goto LAB_7ff70c96bbf1;
LAB_7ff70c96bbbb:
    bVar7 = *pbVar11;
    iVar5 = (*_DAT_7ff70cb96660)();
    if (iVar5 != 0) goto LAB_7ff70c96bc0d;
LAB_7ff70c96bc00:
    if ((bVar7 == 0x5f) || (bVar7 == 0x24)) goto LAB_7ff70c96bc0d;
  }
  uVar6 = 0;
LAB_7ff70c96bc1a:
  *(undefined1 *)(param_2 + 1) = uVar6;
  return;
}


