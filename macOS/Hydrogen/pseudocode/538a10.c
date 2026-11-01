
undefined8 FUN_00538a10(ulong param_1)

{
  ushort uVar1;
  undefined8 uVar2;
  ulong uVar3;
  ulong uVar4;
  undefined8 *extraout_x1;
  ushort *unaff_x21;
  code *unaff_x23;
  long lVar5;
  ulong uVar6;
  
  if ((param_1 & 1) == 0) {
    lVar5 = 0;
    uVar6 = 0;
    uVar1 = *unaff_x21;
    do {
      do {
        uVar4 = uVar6;
        if (uVar4 == 0xc) {
          uVar2 = (*unaff_x23)();
          return uVar2;
        }
        uVar6 = uVar4 + 1;
      } while ((uVar1 >> (ulong)((uint)uVar4 & 0x1f) & 1) == 0);
      if ((lVar5 != 0) && (uVar3 = (*unaff_x23)(), (uVar3 & 1) != 0)) {
        return 1;
      }
      if (0xb < uVar4) {
        func_0x007a2570(uVar4,0xc,&UNK_009ebf20);
                    /* WARNING: Could not recover jumptable at 0x00469224. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar2 = (**(code **)(extraout_x1[1] + 0x18))(*extraout_x1,&UNK_008a4304,4);
        return uVar2;
      }
      lVar5 = lVar5 + 1;
      uVar4 = func_0x0046849c();
    } while ((uVar4 & 1) == 0);
  }
  return 1;
}

