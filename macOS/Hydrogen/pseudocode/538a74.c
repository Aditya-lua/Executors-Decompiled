
undefined8 FUN_00538a74(void)

{
  ulong uVar1;
  undefined8 uVar2;
  undefined8 *extraout_x1;
  uint uVar3;
  long lVar4;
  code *unaff_x23;
  long unaff_x24;
  long unaff_x27;
  uint unaff_w28;
  
  do {
    uVar1 = (*unaff_x23)();
    if ((uVar1 & 1) != 0) {
      return 1;
    }
    do {
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
      lVar4 = unaff_x27;
      do {
        if (lVar4 == 0xc) {
          uVar2 = (*unaff_x23)();
          return uVar2;
        }
        unaff_x27 = lVar4 + 1;
        uVar3 = (uint)lVar4;
        lVar4 = unaff_x27;
      } while ((unaff_w28 >> (ulong)(uVar3 & 0x1f) & 1) == 0);
    } while (unaff_x24 == 0);
  } while( true );
}

