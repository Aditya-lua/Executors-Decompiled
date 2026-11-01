
void FUN_00198e90(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  uint uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  uint *extraout_x8;
  undefined1 uStack0000000000000008;
  undefined8 uStack_38;
  
  _CFRelease();
  func_0x0019fb28(&uStack0000000000000008);
  __Unwind_Resume(param_1);
  func_0x007a2668();
  uVar2 = func_0x0018dba4();
  uVar3 = func_0x0018dba4(param_3,param_4);
  uStack_38 = 0;
  uVar1 = _SecTrustCreateWithCertificates(uVar2,uVar3,&uStack_38);
  if (uVar1 == 0) {
    *(undefined8 *)(extraout_x8 + 2) = uStack_38;
  }
  else {
    extraout_x8[1] = uVar1;
  }
  *extraout_x8 = (uint)(uVar1 != 0);
  _CFRelease(uVar3);
  _CFRelease(uVar2);
  return;
}

