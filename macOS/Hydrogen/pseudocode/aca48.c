
undefined8
FUN_000aca48(undefined8 param_1,long param_2,undefined8 param_3,undefined8 param_4,
            undefined8 param_5,int param_6)

{
  long *plVar1;
  undefined2 uVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  uint uVar6;
  int iVar7;
  ulong unaff_x24;
  
  _bzero();
  *(undefined2 *)(&UNK_00040024 + unaff_x24) = 9;
  if ((unaff_x24 & 7) == 0) {
    plVar1 = (long *)(unaff_x24 + 0x40000);
    if ((&UNK_00040027)[unaff_x24] == '\0') {
      lVar4 = 0;
      uVar6 = *(int *)(&UNK_00040018 + unaff_x24) +
              (*(int *)plVar1 - *(int *)(&UNK_00040008 + unaff_x24));
      *(undefined8 *)(&UNK_00040028 + unaff_x24) = 0;
    }
    else {
      _bzero();
      uVar6 = *(uint *)(&UNK_00040018 + unaff_x24);
      lVar4 = *plVar1 - *(long *)(&UNK_00040008 + unaff_x24);
    }
    iVar7 = param_6;
    if (0xb < param_6) {
      iVar7 = 0xc;
    }
    uVar2 = 9;
    if (0 < param_6) {
      uVar2 = (short)iVar7;
    }
    *(undefined2 *)(&UNK_00040024 + unaff_x24) = uVar2;
    uVar5 = lVar4 + (ulong)uVar6;
    if (0x40000000 < uVar5) {
      _bzero();
      _memset(unaff_x24 + 0x20000,0xff,0x20000);
      uVar5 = 0;
    }
    iVar7 = (int)uVar5 + 0x10000;
    *(int *)(&UNK_0004001c + unaff_x24) = iVar7;
    *(int *)(&UNK_00040020 + unaff_x24) = iVar7;
    *plVar1 = param_2;
    *(long *)(&UNK_00040008 + unaff_x24) = param_2;
    *(long *)(&UNK_00040010 + unaff_x24) = param_2;
    *(int *)(&UNK_00040018 + unaff_x24) = iVar7;
    func_0x000970d8(param_4);
    uVar3 = func_0x000ab8a8();
  }
  else {
    uVar3 = 0;
  }
  return uVar3;
}

