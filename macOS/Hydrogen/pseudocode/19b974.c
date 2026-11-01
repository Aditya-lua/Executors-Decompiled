
void FUN_0019b974(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  code *pcVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long *extraout_x8;
  undefined8 uVar6;
  undefined1 auVar7 [16];
  undefined1 uStack0000000000000008;
  long lStack_50;
  long lStack_48;
  
  func_0x0019fb28(&uStack0000000000000008);
  __Unwind_Resume(param_1);
  auVar7 = func_0x007a2668();
  lStack_50 = 0;
  uVar6 = *auVar7._0_8_;
  uVar2 = func_0x0019dae4(auVar7._8_8_);
  lStack_48 = func_0x0019f0a4(param_3,param_4);
  lVar3 = _SecKeyCreateSignature(uVar6,uVar2,lStack_48,&lStack_50);
  func_0x0019fb28(&lStack_48);
  if (lStack_50 != 0) {
    *extraout_x8 = -0x8000000000000000;
    extraout_x8[1] = lStack_50;
    return;
  }
  if (lVar3 == 0) {
    func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c88);
    lVar3 = 0;
code_r0x0019bab8:
    uVar2 = 0;
code_r0x0019babc:
    func_0x007a1f00(uVar2,lVar3,&UNK_009c1ca0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x19bad4);
    (*pcVar1)();
  }
  lStack_48 = lVar3;
  lVar4 = _CFDataGetBytePtr(lVar3);
  if (lVar4 == 0) {
    lVar3 = 0;
    lVar4 = 1;
  }
  else {
    lVar3 = _CFDataGetLength(lVar3);
    if (lVar3 < 0) goto code_r0x0019bab8;
    if (lVar3 != 0) {
      uVar2 = 1;
      lVar5 = func_0x00187bd0(lVar3,1);
      if (lVar5 == 0) goto code_r0x0019babc;
      goto code_r0x0019ba68;
    }
  }
  lVar5 = 1;
code_r0x0019ba68:
  _memcpy(lVar5,lVar4,lVar3);
  *extraout_x8 = lVar3;
  extraout_x8[1] = lVar5;
  extraout_x8[2] = lVar3;
  func_0x0019fb28(&lStack_48);
  return;
}

