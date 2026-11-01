
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_001942d4(undefined8 param_1,undefined8 param_2)

{
  code *pcVar1;
  undefined8 *puVar2;
  long lVar3;
  undefined1 *extraout_x8;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined1 auVar7 [16];
  undefined8 uStack_60;
  undefined8 uStack_58;
  long lStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  
  func_0x00187bd4(param_1,param_2,8);
  __Unwind_Resume();
  func_0x001931d8(&lStack_50);
  uStack_60 = func_0x0019f0a4(uStack_48,uStack_40);
  if (lStack_50 != 0) {
    func_0x00187bd4(uStack_48,lStack_50,1);
  }
  uStack_30 = 0;
  uStack_48 = *(undefined8 *)PTR__kSecDigestSHA2_009b0360;
  lStack_50 = 1;
  uStack_38 = _UNK_0081b0d8;
  uStack_40 = _UNK_0081b0d0;
  auVar7 = func_0x00194c78(&lStack_50,&uStack_60);
  uVar4 = auVar7._8_8_;
  if ((auVar7._0_8_ & 1) == 0) {
    uStack_58 = uVar4;
    puVar2 = (undefined8 *)_CFDataGetBytePtr(uVar4);
    if ((puVar2 == (undefined8 *)0x0) || (lVar3 = _CFDataGetLength(uStack_58), lVar3 != 0x20)) {
      func_0x007a2810(&UNK_0081b305,0x2b,&lStack_50,&UNK_009c1308,&UNK_009c1468);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x1943fc);
      (*pcVar1)();
    }
    uVar4 = *puVar2;
    uVar6 = puVar2[3];
    uVar5 = puVar2[2];
    *(undefined8 *)(extraout_x8 + 9) = puVar2[1];
    *(undefined8 *)(extraout_x8 + 1) = uVar4;
    *(undefined8 *)(extraout_x8 + 0x19) = uVar6;
    *(undefined8 *)(extraout_x8 + 0x11) = uVar5;
    *extraout_x8 = 0;
    func_0x0019fb28(&uStack_58);
  }
  else {
    *(undefined8 *)(extraout_x8 + 8) = uVar4;
    *extraout_x8 = 1;
  }
  func_0x0019fb28(&uStack_60);
  return;
}

