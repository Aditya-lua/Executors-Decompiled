
undefined8 FUN_00538a8c(void)

{
  undefined8 uVar1;
  ulong uVar2;
  ulong uVar3;
  undefined8 *extraout_x1;
  long unaff_x22;
  code *unaff_x23;
  long unaff_x24;
  long unaff_x25;
  ulong unaff_x27;
  uint unaff_w28;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  long lStack0000000000000030;
  undefined *puStack0000000000000038;
  
  while( true ) {
    unaff_x24 = unaff_x24 + 1;
    puStack0000000000000038 = &DAT_005387f8;
    uStack0000000000000008 = 1;
    uStack0000000000000018 = 1;
    uStack0000000000000020 = 0;
    lStack0000000000000030 = unaff_x22;
    uVar3 = func_0x0046849c();
    if ((uVar3 & 1) != 0) {
      return 1;
    }
    unaff_x22 = unaff_x25 + unaff_x27 * 0x20 + -0x20;
    do {
      uVar3 = unaff_x27;
      if (uVar3 == 0xc) {
        uVar1 = (*unaff_x23)();
        return uVar1;
      }
      unaff_x27 = uVar3 + 1;
      unaff_x22 = unaff_x22 + 0x20;
    } while ((unaff_w28 >> (ulong)((uint)uVar3 & 0x1f) & 1) == 0);
    if ((unaff_x24 != 0) && (uVar2 = (*unaff_x23)(), (uVar2 & 1) != 0)) break;
    if (0xb < uVar3) {
      func_0x007a2570(uVar3,0xc,&UNK_009ebf20);
                    /* WARNING: Could not recover jumptable at 0x00469224. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar1 = (**(code **)(extraout_x1[1] + 0x18))(*extraout_x1,&UNK_008a4304,4);
      return uVar1;
    }
  }
  return 1;
}

