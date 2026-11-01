
undefined8 FUN_00538a34(void)

{
  undefined8 uVar1;
  ulong uVar2;
  ulong uVar3;
  undefined8 *extraout_x1;
  code *unaff_x23;
  long unaff_x24;
  ulong unaff_x27;
  uint unaff_w28;
  
  do {
    do {
      uVar3 = unaff_x27;
      if (uVar3 == 0xc) {
        uVar1 = (*unaff_x23)();
        return uVar1;
      }
      unaff_x27 = uVar3 + 1;
    } while ((unaff_w28 >> (ulong)((uint)uVar3 & 0x1f) & 1) == 0);
    if ((unaff_x24 != 0) && (uVar2 = (*unaff_x23)(), (uVar2 & 1) != 0)) {
      return 1;
    }
    if (0xb < uVar3) {
      func_0x007a2570(uVar3,0xc,&UNK_009ebf20);
                    /* WARNING: Could not recover jumptable at 0x00469224. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar1 = (**(code **)(extraout_x1[1] + 0x18))(*extraout_x1,&UNK_008a4304,4);
      return uVar1;
    }
    unaff_x24 = unaff_x24 + 1;
    uVar3 = func_0x0046849c();
  } while ((uVar3 & 1) == 0);
  return 1;
}

