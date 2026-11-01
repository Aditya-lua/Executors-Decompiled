
/* WARNING: Removing unreachable block (ram,0x000ab788) */
/* WARNING: Removing unreachable block (ram,0x000ab794) */

undefined8 FUN_000ac868(ulong param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  long *plVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  uint uVar6;
  long unaff_x21;
  
  func_0x000970d8(param_4);
  if ((param_1 == 0) || ((param_1 & 7) != 0)) {
    return 0;
  }
  _bzero(param_1,&UNK_00040030);
  *(undefined2 *)(&UNK_00040024 + param_1) = 9;
  if ((param_1 & 7) == 0) {
    plVar2 = (long *)(param_1 + 0x40000);
    if ((&UNK_00040027)[param_1] == '\0') {
      lVar4 = 0;
      uVar6 = *(int *)(&UNK_00040018 + param_1) +
              (*(int *)plVar2 - *(int *)(&UNK_00040008 + param_1));
      *(undefined8 *)(&UNK_00040028 + param_1) = 0;
    }
    else {
      _bzero(param_1,&UNK_00040030);
      uVar6 = *(uint *)(&UNK_00040018 + param_1);
      lVar4 = *plVar2 - *(long *)(&UNK_00040008 + param_1);
    }
    *(undefined2 *)(&UNK_00040024 + param_1) = 9;
    uVar5 = lVar4 + (ulong)uVar6;
    if (0x40000000 < uVar5) {
      _bzero(param_1,0x20000);
      _memset(param_1 + 0x20000,0xff,0x20000);
      uVar5 = 0;
    }
    iVar1 = (int)uVar5 + 0x10000;
    *(int *)(&UNK_0004001c + param_1) = iVar1;
    *(int *)(&UNK_00040020 + param_1) = iVar1;
    *plVar2 = unaff_x21;
    *(long *)(&UNK_00040008 + param_1) = unaff_x21;
    *(long *)(&UNK_00040010 + param_1) = unaff_x21;
    *(int *)(&UNK_00040018 + param_1) = iVar1;
    func_0x000970d8();
    uVar3 = func_0x000ab8a8(param_1);
  }
  else {
    uVar3 = 0;
  }
  return uVar3;
}

