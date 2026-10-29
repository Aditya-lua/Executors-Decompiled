/* 7ff70c96b410 FUN_7ff70c96b410 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong FUN_7ff70c96b410(longlong *param_1,longlong param_2)

{
  code *pcVar1;
  int iVar2;
  longlong lVar3;
  char *pcVar4;
  char cVar5;
  ulonglong uVar6;
  char *pcVar7;
  ulonglong uVar8;
  undefined1 uStack_42;
  char cStack_41;
  
  lVar3 = *param_1;
  uVar6 = param_1[1];
  pcVar7 = (char *)param_1[2];
  if (((ulonglong)((longlong)pcVar7 - lVar3) < uVar6) && (*pcVar7 == '\'')) {
    if (pcVar7 == (char *)(lVar3 + uVar6)) goto LAB_7ff70c96b507;
    pcVar4 = pcVar7 + 1;
    param_1[2] = (longlong)pcVar4;
    if ((ulonglong)((longlong)pcVar4 - lVar3) < uVar6) {
      if (*pcVar4 != '\\') {
        if (*pcVar4 == '\'') goto LAB_7ff70c96b507;
        goto LAB_7ff70c96b47a;
      }
      FUN_7ff70c96c190(param_1,&uStack_42);
      if (cStack_41 != '\0') {
        *(undefined1 *)(param_2 + 1) = 1;
        return param_2;
      }
      lVar3 = *param_1;
      uVar6 = param_1[1];
      pcVar7 = (char *)param_1[2];
      uVar8 = (longlong)pcVar7 - lVar3;
      if (uVar6 <= uVar8) goto LAB_7ff70c96b503;
    }
    else {
LAB_7ff70c96b47a:
      if (pcVar4 == (char *)(lVar3 + uVar6)) goto LAB_7ff70c96b507;
      pcVar7 = pcVar7 + 2;
      param_1[2] = (longlong)pcVar7;
      uVar8 = (longlong)pcVar7 - lVar3;
      if (uVar6 <= uVar8) goto LAB_7ff70c96b503;
    }
    if (*pcVar7 == '\'') {
      pcVar4 = (char *)(lVar3 + uVar6);
      if (pcVar7 != pcVar4) {
        pcVar7 = pcVar7 + 1;
        param_1[2] = (longlong)pcVar7;
        if ((ulonglong)((longlong)pcVar7 - lVar3) < uVar6) {
          cVar5 = *pcVar7;
        }
        else {
          cVar5 = '\0';
        }
        iVar2 = (*_DAT_7ff70cb96660)((int)cVar5);
        pcVar1 = _DAT_7ff70cb96660;
        if ((((iVar2 != 0) || (cVar5 == '_')) || (cVar5 == '$')) &&
           ((pcVar7 != pcVar4 && ((*(byte *)(param_1 + 3) & 1) == 0)))) {
          do {
            uVar8 = uVar8 + 1;
            iVar2 = 0;
            cVar5 = '\0';
            if (uVar8 < uVar6) {
              cVar5 = *pcVar7;
              iVar2 = (int)cVar5;
              if (9 < iVar2 - 0x30U) goto LAB_7ff70c96b546;
            }
            else {
LAB_7ff70c96b546:
              iVar2 = (*pcVar1)(iVar2);
              if (((iVar2 == 0) && (cVar5 != '_')) && (cVar5 != '$')) break;
            }
            pcVar7 = pcVar7 + 1;
            param_1[2] = (longlong)pcVar7;
          } while (pcVar7 != pcVar4);
        }
        *(undefined1 *)(param_2 + 1) = 0;
        return param_2;
      }
      goto LAB_7ff70c96b507;
    }
  }
LAB_7ff70c96b503:
  *(undefined1 *)(param_1 + 3) = 1;
LAB_7ff70c96b507:
  *(undefined1 *)(param_2 + 1) = 1;
  return param_2;
}


