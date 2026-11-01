
long FUN_00411720(undefined8 param_1)

{
  long lVar1;
  code *pcVar2;
  int iVar3;
  undefined8 *puVar4;
  code *in_x9;
  undefined8 extraout_x10;
  long *in_x11;
  long in_x12;
  long in_x13;
  long unaff_x20;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000020;
  
  while( true ) {
    if (in_x13 == in_x12) {
      puVar4 = (undefined8 *)(*in_x9)(param_1);
      *puVar4 = extraout_x10;
      uRam0000000000a3bfe8 = extraout_x10;
      iVar3 = (**(code **)(unaff_x20 + 0x28))();
      if (lRam0000000000a3bfd8 != 3) {
        uStack0000000000000008 = 1;
        uStack0000000000000020 = &uStack0000000000000008;
        func_0x007a1658(0xa3bfd8,0,&uStack0000000000000020,&UNK_009dac38,&UNK_009d9ef8);
      }
      return (long)iVar3;
    }
    if (in_x13 == -1) break;
    lVar1 = *in_x11;
    if (lVar1 == in_x13) {
      *in_x11 = in_x13 + 1;
    }
    in_x12 = in_x13;
    in_x13 = lVar1;
  }
  func_0x007a0378();
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x41185c);
  (*pcVar2)();
}

