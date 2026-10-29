/* 7ff70c96b830 FUN_7ff70c96b830 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong FUN_7ff70c96b830(longlong *param_1,longlong param_2)

{
  code *pcVar1;
  int iVar2;
  longlong lVar3;
  byte bVar4;
  ulonglong uVar5;
  byte bVar6;
  char *pcVar7;
  char cVar8;
  ulonglong uVar9;
  char *pcVar10;
  bool bVar11;
  undefined1 uStack_42;
  char cStack_41;
  
  lVar3 = *param_1;
  uVar9 = param_1[1];
  pcVar10 = (char *)param_1[2];
  if (((ulonglong)((longlong)pcVar10 - lVar3) < uVar9) && (*pcVar10 == '\"')) {
    pcVar7 = (char *)(lVar3 + uVar9);
    if (pcVar10 == pcVar7) goto LAB_7ff70c96b95b;
    pcVar10 = pcVar10 + 1;
    param_1[2] = (longlong)pcVar10;
    bVar11 = pcVar10 == pcVar7;
    bVar6 = *(byte *)(param_1 + 3);
    if (!bVar11 && (*(byte *)(param_1 + 3) & 1) == 0) {
      bVar6 = 0;
      do {
        if ((ulonglong)((longlong)pcVar10 - lVar3) < uVar9) {
          if (*pcVar10 != '\\') {
            if (*pcVar10 != '\"') goto LAB_7ff70c96b8e5;
            bVar11 = false;
            uVar5 = (longlong)pcVar10 - lVar3;
            if (uVar9 <= uVar5) goto LAB_7ff70c96b957;
            goto LAB_7ff70c96b8a1;
          }
          FUN_7ff70c96c190(param_1,&uStack_42);
          if (cStack_41 != '\0') goto LAB_7ff70c96b95b;
          lVar3 = *param_1;
          uVar9 = param_1[1];
          pcVar10 = (char *)param_1[2];
          bVar4 = *(byte *)(param_1 + 3);
          pcVar7 = (char *)(lVar3 + uVar9);
          bVar11 = pcVar10 == pcVar7;
          bVar6 = bVar4;
          if (bVar11) break;
        }
        else {
LAB_7ff70c96b8e5:
          pcVar10 = pcVar10 + 1;
          param_1[2] = (longlong)pcVar10;
          bVar4 = 0;
          pcVar7 = (char *)(lVar3 + uVar9);
          bVar11 = pcVar10 == pcVar7;
          if (bVar11) break;
        }
      } while (bVar4 == 0);
    }
    uVar5 = (longlong)pcVar10 - lVar3;
    if (uVar5 < uVar9) {
LAB_7ff70c96b8a1:
      if (*pcVar10 == '\"') {
        if (!bVar11) {
          pcVar10 = pcVar10 + 1;
          param_1[2] = (longlong)pcVar10;
          if ((ulonglong)((longlong)pcVar10 - lVar3) < uVar9) {
            cVar8 = *pcVar10;
          }
          else {
            cVar8 = '\0';
          }
          iVar2 = (*_DAT_7ff70cb96660)((int)cVar8);
          pcVar1 = _DAT_7ff70cb96660;
          if ((((iVar2 != 0) || (cVar8 == '_')) || (cVar8 == '$')) &&
             ((pcVar10 != pcVar7 && ((bVar6 & 1) == 0)))) {
            do {
              uVar5 = uVar5 + 1;
              iVar2 = 0;
              cVar8 = '\0';
              if (uVar5 < uVar9) {
                cVar8 = *pcVar10;
                iVar2 = (int)cVar8;
                if (9 < iVar2 - 0x30U) goto LAB_7ff70c96b99b;
              }
              else {
LAB_7ff70c96b99b:
                iVar2 = (*pcVar1)(iVar2);
                if (((iVar2 == 0) && (cVar8 != '_')) && (cVar8 != '$')) break;
              }
              pcVar10 = pcVar10 + 1;
              param_1[2] = (longlong)pcVar10;
            } while (pcVar10 != pcVar7);
          }
          *(undefined1 *)(param_2 + 1) = 0;
          return param_2;
        }
        goto LAB_7ff70c96b95b;
      }
    }
  }
LAB_7ff70c96b957:
  *(undefined1 *)(param_1 + 3) = 1;
LAB_7ff70c96b95b:
  *(undefined1 *)(param_2 + 1) = 1;
  return param_2;
}


