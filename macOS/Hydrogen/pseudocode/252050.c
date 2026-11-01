
void FUN_00252050(void)

{
  long lVar1;
  code *pcVar2;
  char in_w8;
  ulong unaff_x19;
  long unaff_x20;
  ulong unaff_x24;
  ulong unaff_x26;
  char unaff_w27;
  code *unaff_x28;
  long unaff_x29;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  ulong in_stack_00000050;
  undefined8 uStack0000000000000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  ulong in_stack_00000098;
  
  do {
    *(char *)(unaff_x29 + -0x59) = in_w8;
    (*unaff_x28)(&uStack0000000000000058);
    func_0x00240a1c(&uStack0000000000000010);
    in_stack_00000038 = in_stack_00000080;
    in_stack_00000030 = in_stack_00000078;
    in_stack_00000048 = in_stack_00000090;
    in_stack_00000040 = in_stack_00000088;
    in_stack_00000050 = in_stack_00000098;
    in_stack_00000018 = in_stack_00000060;
    uStack0000000000000010 = uStack0000000000000058;
    in_stack_00000028 = in_stack_00000070;
    in_stack_00000020 = in_stack_00000068;
    if (0x40 < in_stack_00000098) {
      func_0x007a28b0(in_stack_00000098,0x40,&UNK_009c9cd0);
LAB_00252158:
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x25215c);
      (*pcVar2)();
    }
    if (in_stack_00000098 < unaff_x26) {
      func_0x007a28b0(unaff_x26,in_stack_00000098,&UNK_009ca530);
      goto LAB_00252158;
    }
    lVar1 = unaff_x20 + unaff_x26;
    unaff_x19 = unaff_x19 - unaff_x26;
    _memcpy(unaff_x20,&uStack0000000000000010,unaff_x26);
    if (unaff_x19 == 0) {
      func_0x00240a1c(&uStack0000000000000010);
      return;
    }
    unaff_x26 = unaff_x24;
    if (unaff_x19 <= unaff_x24) {
      unaff_x26 = unaff_x19;
    }
    in_w8 = unaff_w27 + '\x02';
    unaff_x20 = lVar1;
    unaff_w27 = unaff_w27 + '\x01';
  } while( true );
}

