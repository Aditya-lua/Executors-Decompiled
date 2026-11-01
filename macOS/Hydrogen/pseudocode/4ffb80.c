
void FUN_004ffb80(void)

{
  long lVar1;
  code *pcVar2;
  undefined1 in_ZR;
  int iVar3;
  undefined8 *unaff_x19;
  undefined8 *unaff_x22;
  long unaff_x23;
  long unaff_x24;
  undefined8 *unaff_x25;
  undefined8 *unaff_x26;
  long unaff_x27;
  undefined8 *unaff_x28;
  undefined8 *in_stack_00000000;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  long in_stack_00000030;
  undefined8 uStack0000000000000040;
  long in_stack_00000048;
  long in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  
  do {
    if (((bool)in_ZR) && (iVar3 = _memcmp(*unaff_x22,*unaff_x26,unaff_x23), iVar3 == 0)) {
      func_0x00505704(&uStack0000000000000040);
      lVar1 = in_stack_00000048;
      in_stack_00000030 = in_stack_00000048 + in_stack_00000050 * 0x10;
      uStack0000000000000028 = in_stack_00000048;
      func_0x004e05e8(&uStack0000000000000010,&uStack0000000000000028);
      if (uStack0000000000000040 != (undefined *)0x0) {
        func_0x00187bd4(lVar1,(long)uStack0000000000000040 << 4,8);
      }
      if (unaff_x28 == unaff_x25) {
        in_stack_00000000[1] = in_stack_00000018;
        *in_stack_00000000 = uStack0000000000000010;
        in_stack_00000000[2] = in_stack_00000020;
        return;
      }
      unaff_x23 = unaff_x28[1];
      unaff_x22 = unaff_x19;
      unaff_x26 = unaff_x28;
      unaff_x27 = unaff_x24;
      unaff_x28 = unaff_x28 + 2;
    }
    else {
      unaff_x22 = unaff_x22 + 0xc;
      unaff_x27 = unaff_x27 + -0x60;
      if (unaff_x27 == 0) {
        uStack0000000000000040 = &UNK_009e89c0;
        in_stack_00000048 = 1;
        in_stack_00000058 = 0;
        in_stack_00000060 = 0;
        in_stack_00000050 = 8;
        func_0x007a2420(&uStack0000000000000040,&UNK_009e89d0);
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x4ffc48);
        (*pcVar2)();
      }
    }
    in_ZR = unaff_x22[1] == unaff_x23;
  } while( true );
}

