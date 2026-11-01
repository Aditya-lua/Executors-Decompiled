
void FUN_005d2edc(void)

{
  long lVar1;
  code *pcVar2;
  int iVar3;
  ulong unaff_x20;
  long *unaff_x22;
  long unaff_x25;
  long unaff_x27;
  undefined8 unaff_x28;
  long unaff_x29;
  long *in_stack_00000000;
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000038;
  long in_stack_00000040;
  long in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined1 uStack0000000000000068;
  undefined8 uStack0000000000000088;
  
  while( true ) {
    _uStack0000000000000068 = &UNK_007fc120;
    uStack0000000000000088 = 0;
    iVar3 = func_0x0046849c(&uStack0000000000000038);
    if (iVar3 != 0) {
      func_0x007a2810(&UNK_008b5cbe,0x2b,&uStack0000000000000068,&UNK_009f2cd8,&UNK_009f2db8);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x5d2ff0);
      (*pcVar2)();
    }
    if (uStack0000000000000050 != 0) {
      func_0x00187bd4(in_stack_00000058,uStack0000000000000050,1);
    }
    if (unaff_x27 == unaff_x25) break;
    unaff_x27 = unaff_x27 + 0x108;
    *unaff_x22 = unaff_x27;
    func_0x005d35c4(&uStack0000000000000050);
    if ((ulong)(uStack0000000000000038 - in_stack_00000048) < unaff_x20) {
      func_0x007af5a0(&uStack0000000000000038,in_stack_00000048);
    }
    lVar1 = in_stack_00000048;
    _memcpy(in_stack_00000040 + in_stack_00000048);
    in_stack_00000048 = lVar1 + unaff_x20;
    *(undefined8 *)(unaff_x29 + -0x68) = unaff_x28;
    *(undefined **)(unaff_x29 + -0x60) = &DAT_005d2910;
  }
  in_stack_00000000[1] = in_stack_00000040;
  *in_stack_00000000 = uStack0000000000000038;
  in_stack_00000000[2] = in_stack_00000048;
  if (in_stack_00000020 != 0) {
    func_0x00187bd4(in_stack_00000028,in_stack_00000020,1);
  }
  return;
}

