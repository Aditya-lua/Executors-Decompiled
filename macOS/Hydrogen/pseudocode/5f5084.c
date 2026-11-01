
void FUN_005f5084(ulong param_1,long param_2)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  bool in_CY;
  ulong in_x9;
  ulong in_x10;
  ulong in_x11;
  long lVar3;
  
  auVar1._8_8_ = 0;
  auVar1._0_8_ = param_1;
  auVar2._8_8_ = 0;
  auVar2._0_8_ = in_x10;
  lVar3 = SUB168(auVar1 * auVar2,8);
  if (in_CY) {
    lVar3 = lVar3 + 1;
  }
  *(ulong *)(param_2 + 0x30) = in_x11 + in_x9 + in_x10 * param_1;
  *(ulong *)(param_2 + 0x38) =
       lVar3 + (ulong)CARRY8(in_x11,in_x9) + (ulong)CARRY8(in_x11 + in_x9,in_x10 * param_1);
  return;
}

