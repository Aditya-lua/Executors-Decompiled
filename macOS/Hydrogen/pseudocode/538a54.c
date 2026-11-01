
undefined8 FUN_00538a54(long param_1)

{
  ulong uVar1;
  undefined8 uVar2;
  undefined8 *extraout_x1;
  code *unaff_x23;
  long unaff_x24;
  long unaff_x27;
  uint unaff_w28;
  
  do {
    if ((unaff_w28 >> (ulong)((uint)param_1 & 0x1f) & 1) != 0) {
      if ((unaff_x24 != 0) && (uVar1 = (*unaff_x23)(), (uVar1 & 1) != 0)) {
        return 1;
      }
      if (0xb < unaff_x27 - 1U) {
        func_0x007a2570(unaff_x27 - 1U,0xc,&UNK_009ebf20);
                    /* WARNING: Could not recover jumptable at 0x00469224. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar2 = (**(code **)(extraout_x1[1] + 0x18))(*extraout_x1,&UNK_008a4304,4);
        return uVar2;
      }
      unaff_x24 = unaff_x24 + 1;
      uVar1 = func_0x0046849c();
      if ((uVar1 & 1) != 0) {
        return 1;
      }
    }
    if (unaff_x27 == 0xc) {
      uVar2 = (*unaff_x23)();
      return uVar2;
    }
    param_1 = unaff_x27;
    unaff_x27 = unaff_x27 + 1;
  } while( true );
}

