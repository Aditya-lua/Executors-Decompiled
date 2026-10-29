/* 7ff70c96c190 FUN_7ff70c96c190 */

longlong FUN_7ff70c96c190(longlong *param_1,longlong param_2)

{
  byte *pbVar1;
  byte bVar2;
  longlong lVar3;
  ulonglong uVar4;
  char cVar5;
  ulonglong uVar6;
  byte *pbVar7;
  byte *pbVar8;
  uint uVar9;
  bool bVar10;
  undefined1 uStack_44;
  char cStack_43;
  undefined1 uStack_42;
  char cStack_41;
  
  lVar3 = *param_1;
  uVar4 = param_1[1];
  pbVar8 = (byte *)param_1[2];
  if ((uVar4 <= (ulonglong)((longlong)pbVar8 - lVar3)) || (*pbVar8 != 0x5c)) {
    *(undefined1 *)(param_1 + 3) = 1;
LAB_7ff70c96c28a:
    *(undefined1 *)(param_2 + 1) = 1;
    return param_2;
  }
  pbVar1 = (byte *)(lVar3 + uVar4);
  if (pbVar8 == pbVar1) goto LAB_7ff70c96c28a;
  pbVar7 = pbVar8 + 1;
  param_1[2] = (longlong)pbVar7;
  if ((ulonglong)((longlong)pbVar7 - lVar3) < uVar4) {
    bVar2 = *pbVar7;
    cVar5 = FUN_7ff70c96a190(bVar2);
    if (cVar5 != '\0') {
LAB_7ff70c96c2ad:
      if (pbVar7 != pbVar1) {
        param_1[2] = (longlong)(pbVar8 + 2);
        goto LAB_7ff70c96c324;
      }
      goto LAB_7ff70c96c2e0;
    }
    if ((bVar2 & 0xf8) == 0x30) {
      if (pbVar7 != pbVar1) {
        pbVar7 = pbVar8 + 2;
        param_1[2] = (longlong)pbVar7;
        if ((ulonglong)((longlong)pbVar7 - lVar3) < uVar4) {
          if ((*pbVar7 & 0xf8) == 0x30) {
            if (pbVar7 == pbVar1) goto LAB_7ff70c96c28a;
            pbVar7 = pbVar8 + 3;
            param_1[2] = (longlong)pbVar7;
            if (uVar4 <= (ulonglong)((longlong)pbVar7 - lVar3)) goto LAB_7ff70c96c324;
          }
          if ((*pbVar7 & 0xf8) == 0x30) {
            if (pbVar7 == pbVar1) goto LAB_7ff70c96c28a;
            param_1[2] = (longlong)(pbVar7 + 1);
          }
        }
        goto LAB_7ff70c96c324;
      }
      goto LAB_7ff70c96c2e0;
    }
    if (bVar2 == 0x78) {
      if (pbVar7 == pbVar1) goto LAB_7ff70c96c2e0;
      pbVar7 = pbVar8 + 2;
      param_1[2] = (longlong)pbVar7;
      if (uVar4 <= (ulonglong)((longlong)pbVar7 - lVar3)) goto LAB_7ff70c96c28a;
      bVar2 = *pbVar7;
      if ((char)bVar2 == 0x7b) {
        FUN_7ff70c96c3c0(param_1,&uStack_42);
        if (cStack_41 != '\0') goto LAB_7ff70c96c2e0;
      }
      else {
        if ((9 < (int)(char)bVar2 - 0x30U) &&
           ((0x25 < bVar2 - 0x41 || ((0x3f0000003fU >> ((ulonglong)(bVar2 - 0x41) & 0x3f) & 1) == 0)
            ))) goto LAB_7ff70c96c28a;
        if ((pbVar7 != pbVar1) && ((*(byte *)(param_1 + 3) & 1) == 0)) {
          pbVar8 = pbVar8 + 3;
          uVar6 = (longlong)pbVar8 - lVar3;
          do {
            if (((9 < (int)(char)pbVar8[-1] - 0x30U) &&
                ((uVar9 = pbVar8[-1] - 0x41, 0x25 < uVar9 ||
                 ((0x3f0000003fU >> ((ulonglong)uVar9 & 0x3f) & 1) == 0)))) ||
               (param_1[2] = (longlong)pbVar8, uVar4 <= uVar6)) break;
            uVar6 = uVar6 + 1;
            bVar10 = pbVar8 != pbVar1;
            pbVar8 = pbVar8 + 1;
          } while (bVar10);
        }
      }
      goto LAB_7ff70c96c324;
    }
    if (bVar2 == 0x6f) {
      *(undefined1 *)(param_1 + 3) = 1;
      goto LAB_7ff70c96c2e0;
    }
  }
  else {
    cVar5 = FUN_7ff70c96a190(0);
    if (cVar5 != '\0') goto LAB_7ff70c96c2ad;
  }
  FUN_7ff70c96c4e0(param_1,&uStack_44);
  if (cStack_43 == '\0') {
LAB_7ff70c96c324:
    *(undefined1 *)(param_2 + 1) = 0;
    return param_2;
  }
LAB_7ff70c96c2e0:
  *(undefined1 *)(param_2 + 1) = 1;
  return param_2;
}


