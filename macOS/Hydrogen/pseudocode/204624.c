
undefined8 * FUN_00204624(undefined8 param_1,undefined8 param_2,code *param_3,undefined8 param_4)

{
  code *pcVar1;
  undefined2 uVar2;
  undefined8 *puVar3;
  undefined2 extraout_w1;
  undefined1 auVar4 [16];
  undefined1 auStack_c0 [16];
  undefined4 uStack_b0;
  long lStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  long lStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined2 uStack_50;
  undefined2 uStack_4e;
  undefined4 uStack_4c;
  undefined2 uStack_48;
  undefined2 uStack_46;
  undefined4 uStack_44;
  
  auVar4 = __Unwind_Resume();
  uVar2 = (*param_3)();
  func_0x001ad4bc(auStack_c0,param_4);
  (*auVar4._8_8_)(&lStack_a8,auVar4._0_8_,auStack_c0,0);
  if (lStack_a8 == -0x8000000000000000) {
    puVar3 = (undefined8 *)0x0;
  }
  else {
    uStack_60 = uStack_a0;
    lStack_68 = lStack_a8;
    uStack_58 = uStack_98;
    uStack_88 = 1;
    uStack_90 = 1;
    uStack_80 = 0;
    uStack_78 = 1;
    uStack_70 = 0;
    uStack_4c = uStack_b0;
    uStack_50 = uVar2;
    uStack_4e = extraout_w1;
    uStack_48 = uVar2;
    uStack_46 = extraout_w1;
    puVar3 = (undefined8 *)func_0x00187bd0(0x50,8);
    if (puVar3 == (undefined8 *)0x0) {
      func_0x007a1f18(8,0x50);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x204728);
      (*pcVar1)();
    }
    puVar3[5] = lStack_68;
    puVar3[4] = uStack_70;
    puVar3[7] = uStack_58;
    puVar3[6] = uStack_60;
    puVar3[9] = CONCAT44(uStack_44,CONCAT22(uStack_46,uStack_48));
    puVar3[8] = CONCAT44(uStack_4c,CONCAT22(uStack_4e,uStack_50));
    puVar3[1] = uStack_88;
    *puVar3 = uStack_90;
    puVar3[3] = uStack_78;
    puVar3[2] = uStack_80;
  }
  return puVar3;
}

