
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0024ab28(void)

{
  ulong uVar1;
  code *pcVar2;
  undefined1 in_ZR;
  bool bVar3;
  ulong uVar4;
  long *plVar5;
  long lVar6;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  undefined8 uVar7;
  long unaff_x25;
  long unaff_x26;
  long *unaff_x27;
  undefined8 *puVar8;
  undefined8 unaff_x28;
  long unaff_x29;
  long lVar9;
  long lVar10;
  undefined1 auVar11 [16];
  undefined8 *in_stack_00000000;
  long *in_stack_00000008;
  undefined8 in_stack_00000010;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  undefined8 uStack0000000000000068;
  undefined8 in_stack_00000070;
  long in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  long in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_00000118;
  undefined8 in_stack_00000120;
  undefined8 in_stack_00000128;
  undefined8 in_stack_00000130;
  undefined8 in_stack_00000138;
  undefined8 in_stack_00000140;
  
  do {
    lVar6 = in_stack_00000078;
    uVar7 = in_stack_00000070;
    uVar1 = in_stack_00000028;
    if (!(bool)in_ZR) {
      in_stack_000000a8 = in_stack_00000070;
      uStack00000000000000a0 = uStack0000000000000068;
      in_stack_000000b8 = in_stack_00000080;
      in_stack_000000b0 = in_stack_00000078;
      in_stack_000000c8 = in_stack_00000090;
      in_stack_000000c0 = in_stack_00000088;
      in_stack_000000d0 = in_stack_00000098;
      func_0x00253cc8(unaff_x29 + -0x98,&uStack00000000000000a0);
      *(undefined8 *)(unaff_x29 + -200) = in_stack_00000120;
      *(undefined8 *)(unaff_x29 + -0xd0) = in_stack_00000118;
      *(undefined8 *)(unaff_x29 + -0xb8) = in_stack_00000130;
      *(undefined8 *)(unaff_x29 + -0xc0) = in_stack_00000128;
      *(undefined8 *)(unaff_x29 + -0xa8) = in_stack_00000140;
      *(undefined8 *)(unaff_x29 + -0xb0) = in_stack_00000138;
      *(undefined8 *)(unaff_x29 + -0xa0) = *(undefined8 *)(unaff_x29 + -0x68);
      if (*unaff_x27 == unaff_x26) {
        uVar7 = *(undefined8 *)(unaff_x21 + 0x3f0);
        puVar8 = *(undefined8 **)(unaff_x21 + 0x3f8);
        if ((code *)*puVar8 != (code *)0x0) {
          (*(code *)*puVar8)(uVar7);
        }
LAB_0024ad04:
        if (puVar8[1] != 0) {
          func_0x00187bd4(uVar7,puVar8[1],puVar8[2]);
        }
      }
      else {
        func_0x00245b38(unaff_x27);
      }
LAB_0024ad84:
      lVar6 = *(long *)(unaff_x29 + -0xd0);
      lVar10 = *(long *)(unaff_x29 + -0xb8);
      lVar9 = *(long *)(unaff_x29 + -0xc0);
      unaff_x27[1] = *(long *)(unaff_x29 + -200);
      *unaff_x27 = lVar6;
      unaff_x27[3] = lVar10;
      unaff_x27[2] = lVar9;
      lVar6 = *(long *)(unaff_x29 + -0xb0);
      unaff_x27[5] = *(long *)(unaff_x29 + -0xa8);
      unaff_x27[4] = lVar6;
      unaff_x19[2] = in_stack_000000a8;
      unaff_x19[1] = uStack00000000000000a0;
      unaff_x27[6] = *(long *)(unaff_x29 + -0xa0);
      unaff_x19[4] = in_stack_000000b8;
      unaff_x19[3] = in_stack_000000b0;
      unaff_x19[6] = in_stack_000000c8;
      unaff_x19[5] = in_stack_000000c0;
      unaff_x19[7] = in_stack_000000d0;
      unaff_x19[8] = in_stack_00000028 + unaff_x20;
code_r0x0024adbc:
      *unaff_x19 = 1;
      return;
    }
    bVar3 = in_stack_00000028 <= in_stack_00000020;
    in_stack_00000028 = in_stack_00000020 - in_stack_00000028;
    in_stack_00000020 = 0;
    if (bVar3) {
      in_stack_00000020 = in_stack_00000028;
    }
    in_stack_00000028 = 0;
    if (*unaff_x27 == unaff_x26) {
      unaff_x25 = *(long *)(unaff_x21 + 0x3f0);
      puVar8 = *(undefined8 **)(unaff_x21 + 0x3f8);
      if ((code *)*puVar8 != (code *)0x0) {
        (*(code *)*puVar8)(unaff_x25);
      }
      if (puVar8[1] != 0) {
        func_0x00187bd4(unaff_x25,puVar8[1],puVar8[2]);
      }
    }
    else {
      func_0x00245b38(unaff_x27);
    }
    unaff_x20 = uVar1 + unaff_x20;
    *(long *)(unaff_x21 + 1000) = unaff_x26;
    *(undefined8 *)(unaff_x21 + 0x3f0) = uVar7;
    *(long *)(unaff_x21 + 0x3f8) = lVar6;
    uVar7 = _UNK_00829c30;
    if ((2 < *(long *)(unaff_x21 + 0x340) - 2U) && (*(long *)(unaff_x21 + 0x368) != 0)) {
      unaff_x19[1] = _UNK_00829c38;
      *unaff_x19 = uVar7;
      unaff_x19[2] = 0x8000000000000000;
      unaff_x19[5] = unaff_x21;
      unaff_x19[6] = in_stack_00000010;
      unaff_x19[8] = unaff_x20;
      goto LAB_0024ae00;
    }
    if (*(long *)(unaff_x21 + 0x78) != 0) {
      uVar7 = 0;
      unaff_x25 = -0x8000000000000000;
      goto code_r0x0024ade8;
    }
    if (*(long *)(unaff_x21 + 0xb0) != 0) {
      lVar9 = *(long *)(unaff_x21 + 0xa8);
      uVar1 = lVar9 + 1;
      uVar4 = 0;
      if (*(ulong *)(unaff_x21 + 0x98) <= uVar1) {
        uVar4 = *(ulong *)(unaff_x21 + 0x98);
      }
      *(ulong *)(unaff_x21 + 0xa8) = uVar1 - uVar4;
      *(long *)(unaff_x21 + 0xb0) = *(long *)(unaff_x21 + 0xb0) + -1;
      plVar5 = (long *)(*(long *)(unaff_x21 + 0xa0) + lVar9 * 0x18);
      unaff_x25 = *plVar5;
      if (unaff_x25 != -0x8000000000000000) {
        lVar6 = plVar5[1];
        uVar1 = plVar5[2];
        uVar4 = *(ulong *)(unaff_x21 + 0xb8);
        auVar11._8_8_ = uVar1;
        auVar11._0_8_ = uVar4;
        *(undefined8 *)(unaff_x21 + 0xb8) = 0;
        unaff_x26 = uVar1 - uVar4;
        if (uVar1 < uVar4) goto code_r0x0024ae3c;
        if ((uVar4 != 0) && (unaff_x26 != 0)) {
          _memmove(lVar6,lVar6 + uVar4,unaff_x26);
        }
        uVar7 = 4;
        goto code_r0x0024ade8;
      }
    }
    if (in_stack_00000018 < unaff_x20) {
      auVar11 = func_0x007a28a4(unaff_x20,in_stack_00000018,&UNK_009c9c70);
code_r0x0024ae3c:
      func_0x007a28b0(auVar11._0_8_,auVar11._8_8_,&UNK_009c2450);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x24ae4c);
      (*pcVar2)();
    }
    func_0x0024cfa4(unaff_x29 + -0x98);
    if (*(long *)(unaff_x29 + -0x98) != unaff_x26) {
      unaff_x19[2] = in_stack_00000120;
      unaff_x19[1] = in_stack_00000118;
      unaff_x19[4] = in_stack_00000130;
      unaff_x19[3] = in_stack_00000128;
      unaff_x19[6] = in_stack_00000140;
      unaff_x19[5] = in_stack_00000138;
      unaff_x19[7] = *(undefined8 *)(unaff_x29 + -0x68);
      unaff_x19[8] = unaff_x20;
      goto code_r0x0024adbc;
    }
    if (*(short *)(unaff_x29 + -0x7e) == 10) {
      if ((*(byte *)(unaff_x21 + 0x428) & 1) == 0) {
        if ((*(byte *)(unaff_x21 + 0x337) & 1) == 0) {
code_r0x0024adc8:
          uVar7 = 6;
          if (*(char *)(unaff_x21 + 0x332) != '\0') {
            uVar7 = 7;
          }
          unaff_x25 = unaff_x21;
        }
        else if ((*(byte *)(unaff_x21 + 0x429) & 1) == 0) {
          uVar7 = 1;
          *(undefined1 *)(unaff_x21 + 0x429) = 1;
        }
        else {
          if ((*(byte *)(unaff_x21 + 0x336) & 1) == 0) goto code_r0x0024adc8;
          uVar7 = 2;
        }
      }
      else {
        uVar7 = 5;
        unaff_x25 = unaff_x21;
      }
code_r0x0024ade8:
      unaff_x19[8] = unaff_x20;
      *unaff_x19 = 0;
      unaff_x19[1] = uVar7;
      unaff_x19[2] = unaff_x25;
      unaff_x19[3] = lVar6;
      unaff_x19[4] = unaff_x26;
      unaff_x19[5] = unaff_x21;
      unaff_x19[6] = in_stack_00000010;
LAB_0024ae00:
      unaff_x19[7] = in_stack_00000018;
      return;
    }
    lVar6 = *(long *)(unaff_x21 + 1000);
    *(undefined8 *)(unaff_x21 + 1000) = unaff_x28;
    unaff_x27 = in_stack_00000008;
    if (lVar6 != unaff_x26) {
      in_stack_000000c0 = in_stack_00000000[1];
      in_stack_000000b8 = *in_stack_00000000;
      in_stack_000000d0 = in_stack_00000000[3];
      in_stack_000000c8 = in_stack_00000000[2];
      uStack00000000000000a0 = lVar6;
      in_stack_000000a8 = *(undefined8 *)(unaff_x21 + 0x3f0);
      in_stack_000000b0 = *(long *)(unaff_x21 + 0x3f8);
      func_0x00253cc8(unaff_x29 + -0x98,&uStack00000000000000a0);
      *(undefined8 *)(unaff_x29 + -200) = in_stack_00000120;
      *(undefined8 *)(unaff_x29 + -0xd0) = in_stack_00000118;
      *(undefined8 *)(unaff_x29 + -0xb8) = in_stack_00000130;
      *(undefined8 *)(unaff_x29 + -0xc0) = in_stack_00000128;
      *(undefined8 *)(unaff_x29 + -0xa8) = in_stack_00000140;
      *(undefined8 *)(unaff_x29 + -0xb0) = in_stack_00000138;
      *(undefined8 *)(unaff_x29 + -0xa0) = *(undefined8 *)(unaff_x29 + -0x68);
      if (*in_stack_00000008 != unaff_x26) {
        func_0x00245b38(in_stack_00000008);
        goto LAB_0024ad84;
      }
      uVar7 = *(undefined8 *)(unaff_x21 + 0x3f0);
      puVar8 = *(undefined8 **)(unaff_x21 + 0x3f8);
      if ((code *)*puVar8 != (code *)0x0) {
        (*(code *)*puVar8)(uVar7);
      }
      goto LAB_0024ad04;
    }
    func_0x0024eec8(&uStack0000000000000068);
    in_ZR = uStack0000000000000068 == unaff_x26;
  } while( true );
}

