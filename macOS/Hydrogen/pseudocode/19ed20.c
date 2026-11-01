
void FUN_0019ed20(undefined8 param_1)

{
  undefined8 uVar1;
  code *pcVar2;
  int iVar3;
  long lVar4;
  undefined8 *unaff_x21;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined *in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  
  lVar4 = _CFURLCopyFileSystemPath(param_1,0);
  if (lVar4 == 0) {
    func_0x007a11c0(&UNK_0081ce61,0x22,&UNK_009c2280);
  }
  else {
    uStack0000000000000008 = 0;
    in_stack_00000010 = 1;
    in_stack_00000018 = 0;
    in_stack_00000030 = 0xe0000020;
    uStack0000000000000020 = &uStack0000000000000008;
    in_stack_00000028 = &UNK_009c2138;
    func_0x0019e4c0(&uStack0000000000000038);
    uVar1 = in_stack_00000040;
    iVar3 = func_0x0046920c(&uStack0000000000000020,in_stack_00000040,in_stack_00000048);
    if ((uStack0000000000000038 | 0x8000000000000000) != 0x8000000000000000) {
      func_0x00187bd4(uVar1,uStack0000000000000038,1);
    }
    if (iVar3 == 0) {
      unaff_x21[1] = in_stack_00000010;
      *unaff_x21 = uStack0000000000000008;
      unaff_x21[2] = in_stack_00000018;
      _CFRelease(param_1);
      _CFRelease(lVar4);
      return;
    }
    func_0x007a2810(&UNK_0081cd4c,0x37,&uStack0000000000000038,&UNK_009c2180,&UNK_009c2168);
  }
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x19ee2c);
  (*pcVar2)();
}

