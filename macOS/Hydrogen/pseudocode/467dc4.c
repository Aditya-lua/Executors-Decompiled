
void FUN_00467dc4(long param_1)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  ulong unaff_x22;
  ulong unaff_x23;
  long unaff_x25;
  ulong uVar3;
  undefined8 uStack0000000000000000;
  undefined1 uStack0000000000000015;
  undefined8 uStack0000000000000028;
  
  func_0x0046792c(param_1 + unaff_x23 * 0x7538dcfb76180000,(long)&uStack0000000000000000 + 1,
                  &uStack0000000000000028);
  if (unaff_x23 != 0 || unaff_x25 != 0) {
    _memset(&uStack0000000000000015,0x30,uStack0000000000000028 + -0x14);
    uStack0000000000000028 = 0x14;
    uVar3 = unaff_x23 >> 0x13 | unaff_x25 << 0x2d;
    auVar1._8_8_ = 0;
    auVar1._0_8_ = uVar3;
    auVar2._8_8_ = 0;
    auVar2._0_8_ = unaff_x22;
    func_0x0046792c(unaff_x23 + (SUB168(auVar1 * auVar2,8) >> 0x2b) * 0x7538dcfb76180000,
                    (long)&uStack0000000000000000 + 1,&uStack0000000000000028);
    if (0x1158e460913c < uVar3) {
      _memset((long)&uStack0000000000000000 + 2,0x30,uStack0000000000000028 + -1);
      uStack0000000000000000._1_1_ = (char)(SUB164(auVar1 * auVar2,0xc) >> 0xb) + '0';
    }
  }
  func_0x00468684();
  return;
}

