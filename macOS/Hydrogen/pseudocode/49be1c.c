
void FUN_0049be1c(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 *unaff_x19;
  long unaff_x29;
  undefined1 uStack0000000000000018;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  
  _uStack0000000000000018 = 0;
  _uStack0000000000000020 = 0;
  uStack0000000000000028 = 1;
  uStack0000000000000030 = 0;
  *(undefined8 *)(unaff_x29 + -0x18) = 0xe0000020;
  *(undefined1 **)(unaff_x29 + -0x28) = &uStack0000000000000020;
  *(undefined **)(unaff_x29 + -0x20) = &UNK_009e2ad8;
  iVar2 = func_0x00476678(&uStack0000000000000018,unaff_x29 + -0x28);
  if (iVar2 != 0) {
    func_0x007a2810(&UNK_0089f5a4,0x37);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x49beb0);
    (*pcVar1)();
  }
  unaff_x19[1] = uStack0000000000000028;
  *unaff_x19 = _uStack0000000000000020;
  unaff_x19[2] = uStack0000000000000030;
  return;
}

