
bool FUN_0041f1e0(long param_1,undefined8 param_2,undefined8 param_3,ulong param_4)

{
  ulong uVar1;
  long in_x9;
  long in_x10;
  ulong unaff_x19;
  long unaff_x20;
  long *plVar2;
  ulong uVar3;
  long unaff_x23;
  long unaff_x24;
  
  uVar3 = in_x9 - in_x10;
  uVar1 = uVar3;
  if (param_4 <= uVar3) {
    uVar1 = param_4;
  }
  _memcpy(param_1 + in_x10,param_3,uVar1);
  *(ulong *)(unaff_x23 + 0x10) = uVar1 + unaff_x24;
  if (uVar3 < unaff_x19) {
    plVar2 = (long *)(unaff_x20 + 8);
    if (*plVar2 != 0) {
      func_0x003f67e4(plVar2);
    }
    *plVar2 = (long)&UNK_009da470;
  }
  return uVar3 < unaff_x19;
}

