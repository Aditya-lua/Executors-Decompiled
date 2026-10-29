/* 7ff70c982d20 FUN_7ff70c982d20 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c982d20(longlong param_1,char *param_2,longlong param_3)

{
  code *pcVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  int iVar5;
  undefined *puVar6;
  code *pcVar7;
  longlong lVar8;
  
  pcVar1 = _DAT_7ff70cb96698;
  iVar5 = 0;
  pcVar7 = _DAT_7ff70cb966e8;
  do {
    if ((*param_2 == '\0') || (0x2e < iVar5)) break;
    iVar2 = (*pcVar7)(param_2,0,0);
    if (iVar2 == 0) {
      lVar3 = FUN_7ff70cb12b90(param_2,0x3a);
      if (lVar3 == 0) {
        lVar3 = FUN_7ff70cb12e80(param_2);
      }
      else {
        lVar3 = lVar3 - (longlong)param_2;
      }
      lVar8 = -0x2f0;
      puVar6 = &UNK_7ff70cb8b928;
      do {
        lVar4 = FUN_7ff70cb12e80(puVar6);
        if ((lVar3 == lVar4) && (iVar2 = (*pcVar1)(puVar6,param_2), iVar2 == 0)) {
          if (lVar8 != 0) {
            iVar2 = *(int *)(&UNK_7ff70cb527e8 + lVar8);
            pcVar7 = _DAT_7ff70cb966e8;
            goto LAB_7ff70c982d70;
          }
          break;
        }
        puVar6 = *(undefined **)(&DAT_7ff70cb527f0 + lVar8);
        lVar8 = lVar8 + 0x10;
      } while (lVar8 != 0);
      iVar2 = (*pcVar1)(param_2,&UNK_7ff70cb89cca);
      if ((iVar2 != 0) && (iVar2 = (*pcVar1)(param_2,&UNK_7ff70cb89cc6), iVar2 != 0)) {
        return 0x3b;
      }
      *(byte *)(param_1 + 0x4a) = *(byte *)(param_1 + 0x4a) | 0x40;
      pcVar7 = _DAT_7ff70cb966e8;
    }
    else {
LAB_7ff70c982d70:
      lVar3 = (longlong)iVar5;
      iVar5 = iVar5 + 1;
      *(int *)(param_3 + lVar3 * 4) = iVar2;
    }
    lVar3 = FUN_7ff70cb12b90(param_2);
    param_2 = (char *)(lVar3 + 1);
  } while (lVar3 != 0);
  *(longlong *)(param_1 + 0x30) = param_3;
  *(int *)(param_1 + 0x28) = iVar5;
  return 0;
}


