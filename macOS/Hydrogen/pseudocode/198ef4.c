
void FUN_00198ef4(void)

{
  uint uVar1;
  uint *unaff_x20;
  undefined8 in_stack_00000008;
  
  uVar1 = _SecTrustCreateWithCertificates();
  if (uVar1 == 0) {
    *(undefined8 *)(unaff_x20 + 2) = in_stack_00000008;
  }
  else {
    unaff_x20[1] = uVar1;
  }
  *unaff_x20 = (uint)(uVar1 != 0);
  _CFRelease();
  _CFRelease();
  return;
}

