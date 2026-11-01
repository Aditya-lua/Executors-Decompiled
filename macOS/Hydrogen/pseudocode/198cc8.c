
undefined8 FUN_00198cc8(long param_1)

{
  code *pcVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long *unaff_x20;
  undefined *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x27;
  long unaff_x28;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  undefined8 in_stack_00000060;
  long in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  
  do {
    if (unaff_x28 == param_1) {
      func_0x00192810();
    }
    *(long *)(unaff_x20[1] + unaff_x28 * 8) = unaff_x27;
    unaff_x20[2] = unaff_x28 + 1;
    while( true ) {
      unaff_x23 = unaff_x23 + 1;
      if (unaff_x22 == unaff_x23) {
        _CFRelease();
        func_0x0019fb28(&uStack0000000000000008);
        return 0;
      }
      lVar2 = _CFArrayGetValueAtIndex();
      if (lVar2 == 0) {
        func_0x007a11c0(&UNK_0081c0f7,0x22,&UNK_009c1978);
        goto code_r0x00198e68;
      }
      lVar3 = _CFGetTypeID();
      uStack0000000000000050 = lVar3;
      lVar4 = _SecCertificateGetTypeID();
      if (lVar3 == lVar4) break;
      lVar4 = _SecIdentityGetTypeID();
      if (lVar3 == lVar4) {
        lVar2 = _CFRetain(lVar2);
        if (lVar2 == 0) {
          unaff_x21 = &UNK_009c1bc8;
          goto code_r0x00198e38;
        }
        lVar3 = unaff_x20[5];
        if (lVar3 == unaff_x20[3]) {
          func_0x00192810(unaff_x20 + 3);
        }
        *(long *)(unaff_x20[4] + lVar3 * 8) = lVar2;
        unaff_x20[5] = lVar3 + 1;
      }
      else {
        lVar4 = _SecKeyGetTypeID();
        if (lVar3 != lVar4) {
          *(undefined8 **)(unaff_x29 + -0x68) = &uStack0000000000000050;
          *(undefined **)(unaff_x29 + -0x60) =
               &
               __ZN4core3fmt3num3imp54__LT_impl_u20_core__fmt__Display_u20_for_u20_usize_GT_3fmt17ha107b9c25e7f708eE
          ;
          uStack0000000000000058 = &UNK_009c1b28;
          in_stack_00000060 = 1;
          in_stack_00000070 = 1;
          in_stack_00000078 = 0;
          in_stack_00000068 = unaff_x29 + -0x68;
          func_0x007a2420(&uStack0000000000000058,&UNK_009c1b38);
          goto code_r0x00198e68;
        }
        lVar2 = _CFRetain(lVar2);
        if (lVar2 == 0) {
          unaff_x21 = &UNK_009c1be0;
          goto code_r0x00198e38;
        }
        lVar3 = unaff_x20[8];
        if (lVar3 == unaff_x20[6]) {
          func_0x00192810(unaff_x20 + 6);
        }
        *(long *)(unaff_x20[7] + lVar3 * 8) = lVar2;
        unaff_x20[8] = lVar3 + 1;
      }
    }
    unaff_x27 = _CFRetain(lVar2);
    if (unaff_x27 == 0) {
code_r0x00198e38:
      func_0x007a11c0(&UNK_0081c0f7,0x22,unaff_x21);
code_r0x00198e68:
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x198e6c);
      (*pcVar1)();
    }
    unaff_x28 = unaff_x20[2];
    param_1 = *unaff_x20;
  } while( true );
}

