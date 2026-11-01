
undefined8 FUN_00198c14(void)

{
  long lVar1;
  code *pcVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long *unaff_x20;
  undefined *puVar8;
  long lVar9;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  long in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  undefined8 in_stack_00000060;
  long in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  
  uVar3 = _SecItemImport();
  lVar1 = in_stack_00000048;
  if ((unaff_x20 != (long *)0x0) && ((int)uVar3 == 0)) {
    if (in_stack_00000048 == 0) {
      func_0x007a11c0(&UNK_0081c0f7,0x22,&UNK_009c1b10);
code_r0x00198e68:
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x198e6c);
      (*pcVar2)();
    }
    lVar4 = _CFArrayGetCount(in_stack_00000048);
    if (0 < lVar4) {
      lVar9 = 0;
      puVar8 = &UNK_009c1bb0;
      do {
        lVar5 = _CFArrayGetValueAtIndex(lVar1,lVar9);
        if (lVar5 == 0) {
          func_0x007a11c0(&UNK_0081c0f7,0x22,&UNK_009c1978);
          goto code_r0x00198e68;
        }
        lVar6 = _CFGetTypeID();
        uStack0000000000000050 = lVar6;
        lVar7 = _SecCertificateGetTypeID();
        if (lVar6 == lVar7) {
          lVar5 = _CFRetain(lVar5);
          if (lVar5 == 0) {
LAB_00198e38:
            func_0x007a11c0(&UNK_0081c0f7,0x22,puVar8);
            goto code_r0x00198e68;
          }
          lVar6 = unaff_x20[2];
          if (lVar6 == *unaff_x20) {
            func_0x00192810();
          }
          *(long *)(unaff_x20[1] + lVar6 * 8) = lVar5;
          unaff_x20[2] = lVar6 + 1;
        }
        else {
          lVar7 = _SecIdentityGetTypeID();
          if (lVar6 == lVar7) {
            lVar5 = _CFRetain(lVar5);
            if (lVar5 == 0) {
              puVar8 = &UNK_009c1bc8;
              goto LAB_00198e38;
            }
            lVar6 = unaff_x20[5];
            if (lVar6 == unaff_x20[3]) {
              func_0x00192810(unaff_x20 + 3,&UNK_009c1b68);
            }
            *(long *)(unaff_x20[4] + lVar6 * 8) = lVar5;
            unaff_x20[5] = lVar6 + 1;
          }
          else {
            lVar7 = _SecKeyGetTypeID();
            if (lVar6 != lVar7) {
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
            lVar5 = _CFRetain(lVar5);
            if (lVar5 == 0) {
              puVar8 = &UNK_009c1be0;
              goto LAB_00198e38;
            }
            lVar6 = unaff_x20[8];
            if (lVar6 == unaff_x20[6]) {
              func_0x00192810(unaff_x20 + 6,&UNK_009c1b50);
            }
            *(long *)(unaff_x20[7] + lVar6 * 8) = lVar5;
            unaff_x20[8] = lVar6 + 1;
          }
        }
        lVar9 = lVar9 + 1;
      } while (lVar4 != lVar9);
    }
    _CFRelease(lVar1);
    uVar3 = 0;
  }
  func_0x0019fb28(&uStack0000000000000008);
  return uVar3;
}

