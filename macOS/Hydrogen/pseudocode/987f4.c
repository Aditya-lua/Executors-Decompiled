
int FUN_000987f4(ulong param_1,undefined8 param_2)

{
  long lVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined8 in_x4;
  ulong unaff_x19;
  ulong uVar4;
  int unaff_w22;
  long unaff_x24;
  int unaff_w27;
  
  auVar2._8_8_ = 0;
  auVar2._0_8_ = unaff_x19;
  auVar3._8_8_ = 0;
  auVar3._0_8_ = param_1;
  uVar4 = SUB168(auVar2 * auVar3,8) >> 7;
  _memset(param_2,0xff,uVar4 + 1);
  *(char *)(uVar4 + unaff_x24 + 2) = (char)uVar4 + (char)unaff_x19;
  lVar1 = uVar4 + unaff_x24 + 3;
  _memcpy(lVar1,in_x4);
  return ((int)lVar1 + unaff_w22) - unaff_w27;
}

