
bool FUN_00582038(long param_1)

{
  ulong uVar1;
  long lVar2;
  long in_x9;
  long unaff_x19;
  long lVar3;
  
  lVar3 = in_x9 + 1;
  lVar2 = *(long *)(unaff_x19 + 0x28);
  do {
    lVar3 = lVar3 + -1;
    if (lVar3 == 0) {
      return lVar3 == 0;
    }
    uVar1 = func_0x005774ac(param_1,lVar2);
    lVar2 = lVar2 + 0x40;
    param_1 = param_1 + 0x40;
  } while ((uVar1 & 1) != 0);
  return lVar3 == 0;
}

