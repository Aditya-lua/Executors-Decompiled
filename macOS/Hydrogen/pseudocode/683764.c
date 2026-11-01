
ulong FUN_00683764(long param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                  undefined1 param_4 [16],undefined1 param_5 [16])

{
  undefined1 (*pauVar1) [16];
  uint uVar2;
  long lVar3;
  undefined8 *in_x9;
  ulong unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long unaff_x28;
  long in_stack_00000008;
  
  do {
    in_x9[1] = param_2._8_8_;
    *in_x9 = param_2._0_8_;
    in_x9[3] = param_3._8_8_;
    in_x9[2] = param_3._0_8_;
    in_x9[5] = param_4._8_8_;
    in_x9[4] = param_4._0_8_;
    in_x9[7] = param_5._8_8_;
    in_x9[6] = param_5._0_8_;
    param_1 = param_1 + 0x40;
    if (unaff_x28 == param_1) {
      lVar3 = in_stack_00000008;
      if (unaff_x25 == in_stack_00000008) goto LAB_00683700;
      while( true ) {
        do {
          uVar2 = *(uint *)(unaff_x21 + lVar3 * 4);
          uVar2 = (uVar2 & 0xff00ff00) >> 8 | (uVar2 & 0xff00ff) << 8;
          *(uint *)(unaff_x23 + lVar3 * 4) = uVar2 >> 0x10 | uVar2 << 0x10;
          lVar3 = lVar3 + 1;
        } while (unaff_x25 != lVar3);
LAB_00683700:
        (**(code **)(*unaff_x20 + 0xb0))();
        unaff_x27 = unaff_x27 + 1;
        unaff_x21 = unaff_x21 + unaff_x26;
        unaff_x19 = unaff_x19 - unaff_x22;
        if (unaff_x19 < unaff_x22) {
          return unaff_x19;
        }
        if (0x3f < (ulong)(unaff_x23 - (unaff_x24 + unaff_x26 * unaff_x27))) break;
        lVar3 = 0;
      }
      param_1 = 0;
    }
    pauVar1 = (undefined1 (*) [16])(unaff_x21 + param_1);
    param_2 = NEON_rev32(*pauVar1,1);
    param_3 = NEON_rev32(pauVar1[1],1);
    param_4 = NEON_rev32(pauVar1[2],1);
    param_5 = NEON_rev32(pauVar1[3],1);
    in_x9 = (undefined8 *)(unaff_x23 + param_1);
  } while( true );
}

