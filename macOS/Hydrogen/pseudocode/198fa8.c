
void FUN_00198fa8(undefined8 *param_1)

{
  int iVar1;
  long lStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  
  lStack0000000000000000 = 0;
  iVar1 = _SecTrustCopyAnchorCertificates();
  if (iVar1 == 0) {
    if (lStack0000000000000000 == 0) {
      *param_1 = 0;
      param_1[1] = 8;
      param_1[2] = 0;
    }
    else {
      uStack0000000000000008 = lStack0000000000000000;
      in_stack_00000038 = _CFArrayGetCount();
      uStack0000000000000028 = &uStack0000000000000008;
      in_stack_00000030 = 0;
      func_0x0018bd2c(&uStack0000000000000010,&uStack0000000000000028,&UNK_009c1900);
      param_1[1] = in_stack_00000018;
      *param_1 = uStack0000000000000010;
      param_1[2] = in_stack_00000020;
      _CFRelease(uStack0000000000000008);
    }
  }
  else {
    *(int *)(param_1 + 1) = iVar1;
    *param_1 = 0x8000000000000000;
  }
  return;
}

