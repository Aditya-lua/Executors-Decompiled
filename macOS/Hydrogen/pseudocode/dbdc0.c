
bool FUN_000dbdc0(undefined8 param_1,undefined8 param_2,undefined8 param_3,uint param_4)

{
  int *piVar1;
  int *piVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  long lVar6;
  undefined *puVar7;
  int iVar8;
  ulong unaff_x19;
  
  lVar6 = lRam0000000000a334c0;
  piVar2 = (int *)(&UNK_00004d68 + lRam0000000000a334c0);
  if ((1 < param_4) && (*(int *)(&UNK_00004d74 + lRam0000000000a334c0) != -1)) goto LAB_000dbea0;
  _strncpy(&UNK_00004d78 + lRam0000000000a334c0,param_1,0x20);
  (&UNK_00004d98)[lVar6] = 0;
  piVar1 = (int *)(&UNK_00004de0 + lVar6);
  iVar8 = (int)unaff_x19;
  if (*(int *)(&UNK_00004de4 + lVar6) < 0) {
    func_0x000ba578(piVar1,0);
    *piVar1 = 0;
    if (unaff_x19 < 0x11) goto LAB_000dbe70;
LAB_000dbe18:
    iVar5 = *(int *)(&UNK_00004de4 + lVar6);
    if (iVar5 < iVar8) {
      iVar3 = iVar5;
      if (iVar5 < 0) {
        iVar3 = iVar5 + 1;
      }
      iVar4 = 8;
      if (iVar5 != 0) {
        iVar4 = iVar5 + (iVar3 >> 1);
      }
      if (iVar4 <= iVar8) {
        iVar4 = iVar8;
      }
      func_0x000ba578(piVar1,iVar4);
    }
    *piVar1 = iVar8;
    puVar7 = *(undefined **)(&UNK_00004de8 + lVar6);
LAB_000dbe84:
    *(undefined **)(&UNK_00004d60 + lVar6) = puVar7;
    _memcpy(puVar7,param_2);
  }
  else {
    *piVar1 = 0;
    if (0x10 < unaff_x19) goto LAB_000dbe18;
LAB_000dbe70:
    if (unaff_x19 != 0) {
      puVar7 = &UNK_00004df0 + lVar6;
      *(undefined8 *)(&UNK_00004df8 + lVar6) = 0;
      *(undefined8 *)(&UNK_00004df0 + lVar6) = 0;
      goto LAB_000dbe84;
    }
    *(undefined8 *)(&UNK_00004d60 + lVar6) = 0;
  }
  *piVar2 = iVar8;
LAB_000dbea0:
  iVar8 = *(int *)(&UNK_00003f58 + lVar6);
  *(int *)(&UNK_00004d74 + lVar6) = iVar8;
  return *(int *)(&UNK_00004dd4 + lVar6) == iVar8 || *(int *)(&UNK_00004dd4 + lVar6) == iVar8 + -1;
}

