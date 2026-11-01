
/* WARNING: Possible PIC construction at 0x004568a4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004568fc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004569d0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00456a38: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00456340: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00456634: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00456430: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00456538: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00456568: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0045659c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004566dc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00456484: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004564b8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004566b8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00456b20: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00456b6c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00456b24) */
/* WARNING: Removing unreachable block (ram,0x004566bc) */
/* WARNING: Removing unreachable block (ram,0x004564bc) */
/* WARNING: Removing unreachable block (ram,0x00456488) */
/* WARNING: Removing unreachable block (ram,0x004566e0) */
/* WARNING: Removing unreachable block (ram,0x004565a0) */
/* WARNING: Removing unreachable block (ram,0x004565a4) */
/* WARNING: Removing unreachable block (ram,0x0045656c) */
/* WARNING: Removing unreachable block (ram,0x0045653c) */
/* WARNING: Removing unreachable block (ram,0x00456434) */
/* WARNING: Removing unreachable block (ram,0x00456638) */
/* WARNING: Removing unreachable block (ram,0x00456344) */
/* WARNING: Removing unreachable block (ram,0x00456a3c) */
/* WARNING: Removing unreachable block (ram,0x004569d4) */
/* WARNING: Removing unreachable block (ram,0x00456900) */
/* WARNING: Removing unreachable block (ram,0x00456904) */
/* WARNING: Removing unreachable block (ram,0x00456928) */
/* WARNING: Removing unreachable block (ram,0x0045690c) */
/* WARNING: Removing unreachable block (ram,0x00456924) */
/* WARNING: Removing unreachable block (ram,0x004568a8) */
/* WARNING: Removing unreachable block (ram,0x00456b70) */
/* WARNING: Removing unreachable block (ram,0x004569c0) */
/* WARNING: Removing unreachable block (ram,0x004568f0) */
/* WARNING: Type propagation algorithm not settling */

ulong FUN_00456878(void)

{
  uint uVar1;
  byte *pbVar2;
  byte *pbVar3;
  uint uVar4;
  undefined1 *puVar5;
  undefined8 *puVar6;
  int iVar7;
  long lVar8;
  ulong uVar9;
  long *plVar10;
  byte *pbVar11;
  undefined8 *puVar12;
  uint uVar13;
  byte *pbVar14;
  byte *pbVar15;
  long *unaff_x19;
  uint uVar16;
  undefined8 *unaff_x20;
  byte *pbVar17;
  undefined *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  uint uVar18;
  undefined8 unaff_x26;
  undefined8 *unaff_x29;
  undefined *puVar19;
  undefined8 uVar20;
  ulong uVar21;
  long lVar22;
  ulong uVar23;
  long lVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  ulong uVar29;
  byte bVar30;
  undefined1 auVar31 [16];
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000038;
  undefined1 uStack0000000000000040;
  undefined7 uStack0000000000000041;
  undefined2 uStack0000000000000048;
  undefined6 uStack000000000000004a;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 uStack00000000000000a0;
  long in_stack_000000a8;
  long in_stack_000000b0;
  undefined *in_stack_000000b8;
  undefined8 *in_stack_000000c0;
  long *in_stack_000000c8;
  undefined8 uStack00000000000000d0;
  undefined *in_stack_000000d8;
  undefined1 uStack00000000000000e0;
  
  uStack0000000000000038 = 0x5f0000005f;
  uStack0000000000000040 = 1;
  uStack0000000000000048 = 1;
  auVar31 = func_0x00452d9c(&uStack0000000000000008);
  if (auVar31._0_8_ == 0) {
    uVar20 = 0x456ab4;
    plVar10 = (long *)func_0x007a23bc(&UNK_009df400);
    puVar5 = (undefined1 *)register0x00000008;
    while( true ) {
      puVar6 = (undefined8 *)(puVar5 + -0x60);
      *(undefined8 **)(puVar5 + -0x20) = unaff_x20;
      *(long **)(puVar5 + -0x18) = unaff_x19;
      *(undefined8 **)(puVar5 + -0x10) = unaff_x29;
      *(undefined8 *)(puVar5 + -8) = uVar20;
      unaff_x29 = (undefined8 *)(puVar5 + -0x10);
      lVar8 = *plVar10;
      if ((lVar8 == 0) || (uVar9 = plVar10[2], (ulong)plVar10[1] <= uVar9)) goto LAB_00456b8c;
      if (*(char *)(lVar8 + uVar9) != 'B') break;
      plVar10[2] = uVar9 + 1;
      func_0x0045480c(puVar5 + -0x60,plVar10);
      if (*(long *)(puVar5 + -0x60) == 0) {
        if (plVar10[4] != 0) {
          puVar19 = &UNK_00890c17;
          if (puVar5[-0x58] == '\0') {
            puVar19 = &UNK_00890e30;
          }
          uVar20 = 0x19;
          if (puVar5[-0x58] == '\0') {
            uVar20 = 0x10;
          }
          iVar7 = func_0x0046adc0(puVar19,uVar20);
          if (iVar7 != 0) {
            return 2;
          }
        }
        lVar8 = *(long *)(puVar5 + -0x60);
        lVar24 = *(long *)(puVar5 + -0x48);
        lVar22 = *(long *)(puVar5 + -0x50);
        plVar10[1] = *(long *)(puVar5 + -0x58);
        *plVar10 = lVar8;
        plVar10[3] = lVar24;
        plVar10[2] = lVar22;
        return 0;
      }
      if (plVar10[4] == 0) {
        return 0;
      }
      lVar8 = *plVar10;
      lVar24 = plVar10[3];
      lVar22 = plVar10[2];
      *(long *)(puVar5 + -0x38) = plVar10[1];
      *(long *)(puVar5 + -0x40) = lVar8;
      *(long *)(puVar5 + -0x28) = lVar24;
      *(long *)(puVar5 + -0x30) = lVar22;
      lVar8 = *(long *)(puVar5 + -0x60);
      lVar24 = *(long *)(puVar5 + -0x48);
      lVar22 = *(long *)(puVar5 + -0x50);
      plVar10[1] = *(long *)(puVar5 + -0x58);
      *plVar10 = lVar8;
      plVar10[3] = lVar24;
      plVar10[2] = lVar22;
      uVar20 = 0x456b24;
      puVar5 = puVar5 + -0x60;
      unaff_x19 = plVar10;
    }
    if (*(char *)(lVar8 + uVar9) == 'I') {
      plVar10[2] = uVar9 + 1;
      uVar9 = func_0x00455c78(plVar10,0);
      if ((uVar9 & 1) != 0) {
        return 2;
      }
      puVar12 = (undefined8 *)plVar10[4];
      if (puVar12 == (undefined8 *)0x0) {
        uVar9 = func_0x004556c0(plVar10);
        uVar13 = 1;
        if ((uVar9 & 1) != 0) {
          uVar13 = 2;
        }
        return (ulong)uVar13;
      }
      auVar31._8_8_ = 1;
      auVar31._0_8_ = &UNK_00890ad8;
      puVar19 = (undefined *)0x456b70;
      goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
    }
LAB_00456b8c:
    iVar7 = func_0x00455c78(plVar10,0);
    uVar13 = 2;
    if (iVar7 == 0) {
      uVar13 = 0;
    }
    return (ulong)uVar13;
  }
  puVar6 = (undefined8 *)register0x00000008;
  plVar10 = unaff_x19;
  if (unaff_x20 != (undefined8 *)0x0) {
    puVar12 = unaff_x20;
    puVar19 = (undefined *)0x4568a8;
    goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
  }
  in_stack_00000088 = CONCAT71(uStack0000000000000041,uStack0000000000000040);
  in_stack_00000078 = in_stack_00000030;
  in_stack_00000070 = in_stack_00000028;
  in_stack_00000080 = uStack0000000000000038;
  in_stack_00000090 = CONCAT62(uStack000000000000004a,uStack0000000000000048);
  in_stack_00000058 = in_stack_00000010;
  uStack0000000000000050 = uStack0000000000000008;
  in_stack_00000068 = in_stack_00000020;
  in_stack_00000060 = in_stack_00000018;
  lVar8 = func_0x00452d9c(&uStack0000000000000050);
  if (lVar8 != 0) {
    unaff_x21 = &UNK_00890b52;
    do {
      auVar31 = func_0x00452d9c(&uStack0000000000000050);
      unaff_x24 = auVar31._8_8_;
      unaff_x23 = 0;
    } while (auVar31._0_8_ != 0);
  }
  if (((unaff_x19[4] != 0) && (uVar9 = func_0x0046adc0(&UNK_00890c59,3), (uVar9 & 1) != 0)) ||
     (uVar9 = func_0x00455b1c(), (uVar9 & 1) != 0)) {
    return 1;
  }
  puVar12 = (undefined8 *)unaff_x19[4];
  if (puVar12 != (undefined8 *)0x0) {
    unaff_x20 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
    auVar31._8_8_ = 1;
    auVar31._0_8_ = &UNK_00890ad5;
    unaff_x22 = 0;
    puVar19 = (undefined *)0x456a3c;
    goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
  }
  if (((*unaff_x19 != 0) && (uVar9 = unaff_x19[2], uVar9 < (ulong)unaff_x19[1])) &&
     (*(char *)(*unaff_x19 + uVar9) == 'u')) {
    unaff_x19[2] = uVar9 + 1;
    return 0;
  }
  if ((unaff_x19[4] != 0) && (uVar9 = func_0x0046adc0(&UNK_00890e6c,4), (uVar9 & 1) != 0)) {
    return 1;
  }
  unaff_x23 = in_stack_000000a8;
  unaff_x24 = CONCAT62(uStack00000000000000a0._2_6_,
                       CONCAT11(uStack00000000000000a0._1_1_,(byte)uStack00000000000000a0));
  puVar6 = &uStack00000000000000a0;
  unaff_x29 = &uStack00000000000000d0;
  unaff_x22 = *unaff_x19;
  if (unaff_x22 == 0) {
    puVar12 = (undefined8 *)unaff_x19[4];
    if (puVar12 == (undefined8 *)0x0) {
      return 0;
    }
    auVar31._8_8_ = 1;
    auVar31._0_8_ = &UNK_00890c30;
code_r0x00456304:
    puVar6 = (undefined8 *)&uStack00000000000000e0;
    plVar10 = in_stack_000000c8;
    unaff_x20 = in_stack_000000c0;
    unaff_x21 = in_stack_000000b8;
    unaff_x22 = in_stack_000000b0;
    unaff_x29 = uStack00000000000000d0;
    puVar19 = in_stack_000000d8;
    goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
  }
  unaff_x21 = (undefined *)unaff_x19[2];
  unaff_x20 = in_stack_000000c0;
  if ((undefined *)unaff_x19[1] <= unaff_x21) {
code_r0x0045641c:
    puVar12 = (undefined8 *)unaff_x19[4];
    if (puVar12 == (undefined8 *)0x0) {
      *unaff_x19 = 0;
      *(undefined1 *)(unaff_x19 + 1) = 0;
      return 0;
    }
    auVar31._8_8_ = 0x10;
    auVar31._0_8_ = &UNK_00890e30;
    puVar19 = &UNK_00456434;
    puVar6 = &uStack00000000000000a0;
    goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
  }
  bVar30 = unaff_x21[unaff_x22];
  unaff_x20 = (undefined8 *)(ulong)bVar30;
  unaff_x19[2] = (long)(unaff_x21 + 1);
  auVar31 = func_0x00454520(unaff_x20);
  if (auVar31._0_8_ != 0) {
    puVar12 = (undefined8 *)unaff_x19[4];
    if (puVar12 == (undefined8 *)0x0) {
      return 0;
    }
    goto code_r0x00456304;
  }
  uVar13 = (int)unaff_x19[3] + 1;
  *(uint *)(unaff_x19 + 3) = uVar13;
  if (500 < uVar13) {
    puVar12 = (undefined8 *)unaff_x19[4];
    if (puVar12 == (undefined8 *)0x0) {
      *unaff_x19 = 0;
      *(undefined1 *)(unaff_x19 + 1) = 1;
      return 0;
    }
    auVar31._8_8_ = 0x19;
    auVar31._0_8_ = &UNK_00890c17;
    puVar19 = &UNK_00456344;
    puVar6 = &uStack00000000000000a0;
    goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
  }
  uVar13 = (uint)bVar30;
  if (bVar30 < 0x51) {
    uVar16 = (uint)bVar30;
    if (uVar16 < 0x46) {
      if (uVar13 == 0x41) goto code_r0x00456520;
      if (uVar13 == 0x42) {
        uVar9 = func_0x00454b38();
        goto joined_r0x0045666c;
      }
      if (uVar13 != 0x44) goto code_r0x00456674;
      if ((unaff_x19[4] != 0) && (uVar9 = func_0x0046adc0(&UNK_00890e68,4), (uVar9 & 1) != 0)) {
        return 1;
      }
      uVar9 = func_0x00455358();
      if ((uVar9 & 1) != 0) {
        return 1;
      }
      if (((*unaff_x19 == 0) || (uVar9 = unaff_x19[2], (ulong)unaff_x19[1] <= uVar9)) ||
         (*(char *)(*unaff_x19 + uVar9) != 'L')) goto code_r0x0045641c;
      unaff_x19[2] = uVar9 + 1;
      func_0x00454618(&uStack00000000000000a0);
      if (((byte)uStack00000000000000a0 & 1) == 0) {
        if (in_stack_000000a8 == 0) goto code_r0x004566f0;
        if ((unaff_x19[4] != 0) && (uVar9 = func_0x0046adc0(&UNK_00890c4d,3), (uVar9 & 1) != 0)) {
          return 1;
        }
        uVar9 = func_0x0045509c();
        goto joined_r0x0045666c;
      }
      puVar12 = (undefined8 *)unaff_x19[4];
      if (puVar12 == (undefined8 *)0x0) goto code_r0x0045663c;
      uVar20 = 0x19;
      if (uStack00000000000000a0._1_1_ == 0) {
        uVar20 = 0x10;
      }
      puVar19 = &UNK_00890c17;
      if (uStack00000000000000a0._1_1_ == 0) {
        puVar19 = &UNK_00890e30;
      }
code_r0x00456634:
      auVar31._8_8_ = uVar20;
      auVar31._0_8_ = puVar19;
      unaff_x20 = (undefined8 *)(ulong)uStack00000000000000a0._1_1_;
      puVar19 = &UNK_00456638;
      puVar6 = &uStack00000000000000a0;
      goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
    }
    if (uVar16 - 0x4f < 2) {
      if (unaff_x19[4] != 0) {
        unaff_x21 = (undefined *)0x1;
        uVar9 = func_0x0046adc0(&UNK_00890ada,1);
        if ((uVar9 & 1) != 0) {
          return 1;
        }
      }
      if (uVar13 != 0x50) goto code_r0x004566c8;
      puVar12 = (undefined8 *)unaff_x19[4];
      if (puVar12 == (undefined8 *)0x0) goto code_r0x004566e4;
      puVar19 = &UNK_00890c45;
      uVar20 = 6;
      goto code_r0x004566dc;
    }
    if (uVar16 == 0x46) {
      uVar9 = func_0x004551b0();
    }
    else {
code_r0x00456674:
      unaff_x19[2] = (long)unaff_x21;
      uVar9 = func_0x00455c78();
    }
  }
  else {
    if (1 < uVar13 - 0x51) {
      if (uVar13 == 0x53) {
code_r0x00456520:
        puVar12 = (undefined8 *)unaff_x19[4];
        if (puVar12 != (undefined8 *)0x0) {
          unaff_x21 = (undefined *)0x1;
          auVar31._8_8_ = 1;
          auVar31._0_8_ = &UNK_00890c36;
          puVar19 = &UNK_0045653c;
          puVar6 = &uStack00000000000000a0;
          goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
        }
        uVar9 = func_0x004562a0();
        if ((uVar9 & 1) != 0) {
          return 1;
        }
        if (uVar13 == 0x41) {
          puVar12 = (undefined8 *)unaff_x19[4];
          if (puVar12 != (undefined8 *)0x0) {
            auVar31._8_8_ = 2;
            auVar31._0_8_ = &UNK_00890c4b;
            puVar19 = &UNK_0045656c;
            puVar6 = &uStack00000000000000a0;
            goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
          }
          uVar9 = func_0x00456c04();
          if ((uVar9 & 1) != 0) {
            return 1;
          }
        }
        puVar12 = (undefined8 *)unaff_x19[4];
        if (puVar12 == (undefined8 *)0x0) goto code_r0x004566f0;
        puVar19 = &UNK_00890c37;
      }
      else {
        if (uVar13 != 0x54) goto code_r0x00456674;
        puVar12 = (undefined8 *)unaff_x19[4];
        if (puVar12 != (undefined8 *)0x0) {
          unaff_x21 = (undefined *)0x1;
          auVar31._8_8_ = 1;
          auVar31._0_8_ = &UNK_00890ad6;
          puVar19 = &UNK_00456488;
          puVar6 = &uStack00000000000000a0;
          goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
        }
        auVar31 = func_0x00455b1c();
        if ((auVar31._0_8_ & 1) != 0) {
          return 1;
        }
        if (auVar31._8_8_ == 1) {
          puVar12 = (undefined8 *)unaff_x19[4];
          if (puVar12 != (undefined8 *)0x0) {
            unaff_x21 = (undefined *)0x1;
            auVar31._8_8_ = 1;
            auVar31._0_8_ = &UNK_00890ad4;
            puVar19 = &UNK_004564bc;
            puVar6 = &uStack00000000000000a0;
            goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
          }
          goto code_r0x004566f0;
        }
        puVar12 = (undefined8 *)unaff_x19[4];
        if (puVar12 == (undefined8 *)0x0) goto code_r0x004566f0;
        puVar19 = &UNK_00890ad5;
      }
      unaff_x21 = (undefined *)0x1;
      auVar31._8_8_ = 1;
      auVar31._0_8_ = puVar19;
      puVar19 = &UNK_004565a0;
      puVar6 = &uStack00000000000000a0;
      goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
    }
    if (unaff_x19[4] == 0) {
code_r0x004565d0:
      uVar9 = unaff_x19[2];
      if ((uVar9 < (ulong)unaff_x19[1]) && (*(char *)(unaff_x22 + uVar9) == 'L')) {
        unaff_x19[2] = uVar9 + 1;
        func_0x00454618(&uStack00000000000000a0);
        if (((byte)uStack00000000000000a0 & 1) != 0) {
          puVar12 = (undefined8 *)unaff_x19[4];
          if (puVar12 == (undefined8 *)0x0) {
code_r0x0045663c:
            *unaff_x19 = 0;
            *(byte *)(unaff_x19 + 1) = uStack00000000000000a0._1_1_;
            return 0;
          }
          puVar19 = &UNK_00890c17;
          if (uStack00000000000000a0._1_1_ == 0) {
            puVar19 = &UNK_00890e30;
          }
          uVar20 = 0x19;
          if (uStack00000000000000a0._1_1_ == 0) {
            uVar20 = 0x10;
          }
          goto code_r0x00456634;
        }
        if (in_stack_000000a8 != 0) {
          uVar9 = func_0x0045509c();
          if ((uVar9 & 1) != 0) {
            return 1;
          }
          puVar12 = (undefined8 *)unaff_x19[4];
          if (puVar12 != (undefined8 *)0x0) {
            unaff_x21 = (undefined *)0x1;
            auVar31._8_8_ = 1;
            auVar31._0_8_ = &UNK_00890c44;
            puVar19 = &UNK_004566bc;
            goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
          }
        }
      }
    }
    else {
      unaff_x21 = (undefined *)0x1;
      uVar9 = func_0x0046adc0(&UNK_00890ad9,1);
      if ((uVar9 & 1) != 0) {
        return 1;
      }
      unaff_x22 = *unaff_x19;
      if (unaff_x22 != 0) goto code_r0x004565d0;
    }
    if (uVar13 != 0x52) {
code_r0x004566c8:
      puVar12 = (undefined8 *)unaff_x19[4];
      if (puVar12 != (undefined8 *)0x0) {
        puVar19 = &UNK_00890e64;
        uVar20 = 4;
code_r0x004566dc:
        auVar31._8_8_ = uVar20;
        auVar31._0_8_ = puVar19;
        puVar19 = &UNK_004566e0;
        puVar6 = &uStack00000000000000a0;
__ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E:
        pbVar17 = auVar31._8_8_;
        pbVar11 = auVar31._0_8_;
        *(undefined8 **)((long)puVar6 + -0x10) = unaff_x29;
        *(undefined **)((long)puVar6 + -8) = puVar19;
        *(undefined8 *)((long)puVar6 + -0x50) = unaff_x26;
        *(undefined8 *)((long)puVar6 + -0x48) = unaff_x25;
        *(undefined8 *)((long)puVar6 + -0x40) = unaff_x24;
        *(long *)((long)puVar6 + -0x38) = unaff_x23;
        *(long *)((long)puVar6 + -0x30) = unaff_x22;
        *(undefined **)((long)puVar6 + -0x28) = unaff_x21;
        *(undefined8 **)((long)puVar6 + -0x20) = unaff_x20;
        *(long **)((long)puVar6 + -0x18) = plVar10;
        *(undefined8 *)((long)puVar6 + -0x10) = *(undefined8 *)((long)puVar6 + -0x10);
        *(undefined8 *)((long)puVar6 + -8) = *(undefined8 *)((long)puVar6 + -8);
        uVar13 = *(uint *)(puVar12 + 2);
        if ((uVar13 & 0x18000000) != 0) {
          if ((uVar13 >> 0x1c & 1) == 0) {
            if (pbVar17 < (byte *)0x20) {
              if (pbVar17 == (byte *)0x0) {
                uVar9 = 0;
              }
              else {
                if ((byte *)0x7 < pbVar17) {
                  pbVar14 = (byte *)((ulong)pbVar17 & 0x18);
                  uVar20 = *(undefined8 *)pbVar11;
                  uVar9 = (ulong)(-(-0x41 < (char)((ulong)uVar20 >> 0x30)) & 1);
                  uVar21 = (ulong)(-(-0x41 < (char)((ulong)uVar20 >> 0x38)) & 1);
                  uVar23 = (ulong)(-(-0x41 < (char)((ulong)uVar20 >> 0x20)) & 1);
                  uVar25 = (ulong)(-(-0x41 < (char)((ulong)uVar20 >> 0x28)) & 1);
                  uVar26 = (ulong)(-(-0x41 < (char)((ulong)uVar20 >> 0x10)) & 1);
                  uVar27 = (ulong)(-(-0x41 < (char)((ulong)uVar20 >> 0x18)) & 1);
                  uVar28 = (ulong)(-(-0x41 < (char)uVar20) & 1);
                  uVar29 = (ulong)(-(-0x41 < (char)((ulong)uVar20 >> 8)) & 1);
                  if (pbVar14 != (byte *)0x8) {
                    uVar20 = *(undefined8 *)(pbVar11 + 8);
                    bVar30 = -(-0x41 < (char)((ulong)uVar20 >> 0x28));
                    uVar9 = uVar9 + (-(-0x41 < (char)((ulong)uVar20 >> 0x30)) & 1);
                    uVar21 = uVar21 + (-(-0x41 < (char)((ulong)uVar20 >> 0x38)) & 1);
                    uVar23 = uVar23 + ((ulong)((uint6)CONCAT14(bVar30,(uint)CONCAT12(bVar30,(ushort)
                                                  (byte)-(-0x41 < (char)((ulong)uVar20 >> 0x20)))) &
                                              0xffff0000ffff) & 0xffffff01);
                    uVar25 = uVar25 + ((ulong)bVar30 & 0xffffff01);
                    uVar26 = uVar26 + (-(-0x41 < (char)((ulong)uVar20 >> 0x10)) & 1);
                    uVar27 = uVar27 + (-(-0x41 < (char)((ulong)uVar20 >> 0x18)) & 1);
                    uVar28 = uVar28 + (-(-0x41 < (char)uVar20) & 1);
                    uVar29 = uVar29 + (-(-0x41 < (char)((ulong)uVar20 >> 8)) & 1);
                    if (pbVar14 != (byte *)0x10) {
                      uVar20 = *(undefined8 *)(pbVar11 + 0x10);
                      bVar30 = -(-0x41 < (char)((ulong)uVar20 >> 0x28));
                      uVar9 = uVar9 + (-(-0x41 < (char)((ulong)uVar20 >> 0x30)) & 1);
                      uVar21 = uVar21 + (-(-0x41 < (char)((ulong)uVar20 >> 0x38)) & 1);
                      uVar23 = uVar23 + ((ulong)((uint6)CONCAT14(bVar30,(uint)CONCAT12(bVar30,(
                                                  ushort)(byte)-(-0x41 < (char)((ulong)uVar20 >>
                                                                               0x20)))) &
                                                0xffff0000ffff) & 0xffffff01);
                      uVar25 = uVar25 + ((ulong)bVar30 & 0xffffff01);
                      uVar26 = uVar26 + (-(-0x41 < (char)((ulong)uVar20 >> 0x10)) & 1);
                      uVar27 = uVar27 + (-(-0x41 < (char)((ulong)uVar20 >> 0x18)) & 1);
                      uVar28 = uVar28 + (-(-0x41 < (char)uVar20) & 1);
                      uVar29 = uVar29 + (-(-0x41 < (char)((ulong)uVar20 >> 8)) & 1);
                    }
                  }
                  uVar9 = uVar28 + uVar23 + uVar26 + uVar9 + uVar29 + uVar25 + uVar27 + uVar21;
                  goto code_r0x00468ca4;
                }
                uVar9 = 0;
                pbVar14 = (byte *)0x0;
                do {
                  if (-0x41 < (char)pbVar11[(long)pbVar14]) {
                    uVar9 = uVar9 + 1;
                  }
                  pbVar14 = pbVar14 + 1;
code_r0x00468ca4:
                } while (pbVar17 != pbVar14);
              }
            }
            else {
              uVar9 = func_0x0046bd58(pbVar11,pbVar17);
            }
          }
          else {
            uVar9 = (ulong)*(ushort *)((long)puVar12 + 0x16);
            if (uVar9 == 0) {
              pbVar17 = (byte *)0x0;
              uVar21 = 0;
            }
            else {
              pbVar14 = pbVar11 + (long)pbVar17;
              pbVar17 = (byte *)0x0;
              uVar21 = uVar9;
              pbVar15 = pbVar11;
              do {
                if (pbVar15 == pbVar14) break;
                bVar30 = *pbVar15;
                pbVar3 = pbVar15 + 3;
                if (0xef < bVar30) {
                  pbVar3 = pbVar15 + 4;
                }
                pbVar2 = pbVar15 + 2;
                if (0xdf < bVar30) {
                  pbVar2 = pbVar3;
                }
                pbVar3 = pbVar15 + 1;
                if (((int)(char)bVar30 & 0x80000000U) != 0) {
                  pbVar3 = pbVar2;
                }
                pbVar17 = pbVar3 + ((long)pbVar17 - (long)pbVar15);
                uVar21 = uVar21 - 1;
                pbVar15 = pbVar3;
              } while (uVar21 != 0);
            }
            uVar9 = uVar9 - uVar21;
          }
          if (uVar9 < *(ushort *)((long)puVar12 + 0x14)) {
            uVar4 = (uint)*(ushort *)((long)puVar12 + 0x14) - (int)uVar9;
            uVar18 = uVar13 >> 0x1d & 3;
            uVar16 = uVar4 >> 1 & 0x7fff;
            if (uVar18 != 2) {
              uVar16 = 0;
            }
            uVar1 = 0;
            if (uVar18 != 0) {
              uVar1 = uVar4;
            }
            if (uVar18 < 2) {
              uVar16 = uVar1;
            }
            uVar18 = 0;
            uVar20 = *puVar12;
            lVar8 = puVar12[1];
            do {
              if ((uVar16 & 0xffff) <= (uVar18 & 0xffff)) {
                uVar9 = (**(code **)(lVar8 + 0x18))(uVar20,pbVar11,pbVar17);
                if ((uVar9 & 1) != 0) {
                  return 1;
                }
                uVar18 = 0;
                do {
                  if ((uVar4 - uVar16 & 0xffff) <= (uVar18 & 0xffff)) {
                    return 0;
                  }
                  uVar18 = uVar18 + 1;
                  uVar9 = (**(code **)(lVar8 + 0x20))(uVar20,uVar13 & 0x1fffff);
                } while ((uVar9 & 1) == 0);
                return 1;
              }
              uVar18 = uVar18 + 1;
              uVar9 = (**(code **)(lVar8 + 0x20))(uVar20,uVar13 & 0x1fffff);
            } while ((uVar9 & 1) == 0);
            return 1;
          }
        }
                    /* WARNING: Could not recover jumptable at 0x00468d48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar9 = (**(code **)(puVar12[1] + 0x18))(*puVar12,pbVar11,pbVar17);
        return uVar9;
      }
    }
code_r0x004566e4:
    uVar9 = func_0x004562a0();
  }
joined_r0x0045666c:
  if ((uVar9 & 1) != 0) {
    return 1;
  }
code_r0x004566f0:
  if (*unaff_x19 == 0) {
    return 0;
  }
  *(int *)(unaff_x19 + 3) = (int)unaff_x19[3] + -1;
  return 0;
}

