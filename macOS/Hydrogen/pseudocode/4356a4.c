
void FUN_004356a4(void)

{
  ulong uVar1;
  char *pcVar2;
  long lVar3;
  code *pcVar4;
  undefined1 in_ZR;
  undefined1 in_CY;
  undefined8 uVar5;
  undefined8 extraout_x1;
  undefined8 uVar6;
  long lVar7;
  long unaff_x19;
  char unaff_w20;
  long unaff_x21;
  undefined8 unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  char *unaff_x25;
  ulong unaff_x26;
  ulong unaff_x27;
  ulong uVar8;
  long unaff_x28;
  long unaff_x29;
  undefined1 auVar9 [16];
  long *in_stack_00000008;
  long in_stack_00000010;
  undefined4 uStack0000000000000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 uStack00000000000000b0;
  long in_stack_000000b8;
  long in_stack_000000c0;
  undefined8 uStack00000000000000c8;
  long in_stack_000000d0;
  long in_stack_000000d8;
  
  do {
    if ((bool)in_CY && !(bool)in_ZR) {
      func_0x007a0000(unaff_x29 + -0x70,unaff_x28,unaff_x26,1,1);
      unaff_x25 = *(char **)(unaff_x29 + -0x68);
      unaff_x28 = *(long *)(unaff_x29 + -0x60);
      unaff_x27 = *(ulong *)(unaff_x29 + -0x70);
    }
    _memcpy(unaff_x25 + unaff_x28,unaff_x22,unaff_x26);
    uVar1 = unaff_x28 + unaff_x26;
    auVar9._8_8_ = uVar1;
    auVar9._0_8_ = unaff_x25;
    *(ulong *)(unaff_x29 + -0x60) = uVar1;
    uVar8 = uVar1;
    pcVar2 = unaff_x25;
    if (uVar1 < 0x10) {
      for (; uVar8 != 0; uVar8 = uVar8 - 1) {
        if (*pcVar2 == '\0') goto code_r0x004356fc;
        pcVar2 = pcVar2 + 1;
      }
LAB_0043572c:
      *(ulong *)(unaff_x29 + -0xf0) = unaff_x27;
      *(char **)(unaff_x29 + -0xe8) = unaff_x25;
      *(ulong *)(unaff_x29 + -0xe0) = uVar1;
      auVar9 = func_0x004596b8(unaff_x29 + -0xf0);
code_r0x00435748:
      lVar7 = in_stack_000000d8;
      if (in_stack_000000d8 == 0) {
        func_0x007a2570(0xffffffffffffffff,0,&UNK_009dbdd0);
        goto code_r0x00435984;
      }
      *(long *)(in_stack_000000d0 + (in_stack_000000d8 + -1) * 8) = auVar9._0_8_;
      if (in_stack_000000d8 == uStack00000000000000c8) {
        func_0x00404210(&uStack00000000000000c8,&UNK_009dbde8);
      }
      lVar3 = in_stack_000000c0;
      *(undefined8 *)(in_stack_000000d0 + lVar7 * 8) = 0;
      in_stack_000000d8 = lVar7 + 1;
      if (in_stack_000000c0 == uStack00000000000000b0) {
        func_0x00403e60(&uStack00000000000000b0,&UNK_009dbe00);
      }
      *(undefined1 (*) [16])(in_stack_000000b8 + lVar3 * 0x10) = auVar9;
      in_stack_000000c0 = lVar3 + 1;
    }
    else {
      uVar8 = func_0x0046b0fc(0,unaff_x25,uVar1);
      if ((uVar8 & 1) == 0) goto LAB_0043572c;
code_r0x004356fc:
      if (unaff_x27 == unaff_x24) goto code_r0x00435748;
      if (unaff_x27 != 0) {
        func_0x00187bd4(unaff_x25,unaff_x27,1);
      }
      *(undefined1 *)(in_stack_00000010 + 200) = 1;
    }
    if (unaff_x21 != 0) {
      func_0x00187bd4(unaff_x22,unaff_x21,1);
    }
    func_0x004015e4(unaff_x29 + -0xf0,unaff_x29 + -0xc0);
    if (*(long *)(unaff_x29 + -0xf0) == 0) {
code_r0x0043585c:
      while( true ) {
        func_0x004015e4(unaff_x29 + -0xf0,unaff_x29 + -0xc0);
        if (*(long *)(unaff_x29 + -0xf0) == 0) break;
        lVar7 = *(long *)(unaff_x29 + -0xf0) + *(long *)(unaff_x29 + -0xe0) * 0x18;
        if (*(long *)(lVar7 + 8) != 0) {
          func_0x00187bd4(*(undefined8 *)(lVar7 + 0x10),*(long *)(lVar7 + 8),1);
        }
        if (*(long *)(lVar7 + 0x110) != 0) {
          func_0x00187bd4(*(undefined8 *)(lVar7 + 0x118),*(long *)(lVar7 + 0x110),1);
        }
      }
      in_stack_00000008[1] = in_stack_000000b8;
      *in_stack_00000008 = uStack00000000000000b0;
      in_stack_00000008[3] = uStack00000000000000c8;
      in_stack_00000008[2] = in_stack_000000c0;
      in_stack_00000008[5] = in_stack_000000d8;
      in_stack_00000008[4] = in_stack_000000d0;
      return;
    }
    lVar7 = *(long *)(unaff_x29 + -0xf0) + *(long *)(unaff_x29 + -0xe0) * unaff_x23;
    unaff_x27 = *(ulong *)(lVar7 + 8);
    if (unaff_x27 == unaff_x24) goto code_r0x0043585c;
    unaff_x21 = *(long *)(lVar7 + 0x110);
    unaff_x22 = *(undefined8 *)(lVar7 + 0x118);
    unaff_x26 = *(ulong *)(lVar7 + 0x120);
    *(ulong *)(unaff_x29 + -0x70) = unaff_x27;
    uVar5 = *(undefined8 *)(lVar7 + 0x10);
    *(undefined8 *)(unaff_x19 + 0x10) = *(undefined8 *)(lVar7 + 0x18);
    *(undefined8 *)(unaff_x19 + 8) = uVar5;
    uVar1 = unaff_x26 + 2;
    uVar8 = *(ulong *)(unaff_x29 + -0x60);
    if (unaff_x27 - uVar8 < uVar1) {
      if ((CARRY8(uVar8,uVar1)) || (uVar1 = uVar8 + uVar1, (long)uVar1 < 0)) {
        uVar5 = 0;
        uVar6 = extraout_x1;
        goto code_r0x004358f4;
      }
      if (unaff_x27 != 0) {
        *(undefined8 *)(unaff_x29 + -0xf0) = *(undefined8 *)(unaff_x29 + -0x68);
        *(ulong *)(unaff_x29 + -0xe0) = unaff_x27;
      }
      *(ulong *)(unaff_x29 + -0xe8) = (ulong)(unaff_x27 != 0);
      func_0x0079a108(&uStack0000000000000058,1,uVar1,unaff_x29 + -0xf0);
      if (uStack0000000000000058 == 1) {
        uVar5 = in_stack_00000060;
        uVar6 = in_stack_00000068;
code_r0x004358f4:
        func_0x007a1f00(uVar5,uVar6,&UNK_009daad0);
code_r0x00435984:
                    /* WARNING: Does not return */
        pcVar4 = (code *)SoftwareBreakpoint(1,0x435988);
        (*pcVar4)();
      }
      *(ulong *)(unaff_x29 + -0x70) = uVar1;
      *(undefined8 *)(unaff_x29 + -0x68) = in_stack_00000060;
      unaff_x27 = uVar1;
    }
    if (unaff_x27 == uVar8) {
      func_0x007a0000(unaff_x29 + -0x70,uVar8,1,1,1);
      uVar8 = *(ulong *)(unaff_x29 + -0x60);
      unaff_x27 = *(ulong *)(unaff_x29 + -0x70);
    }
    unaff_x25 = *(char **)(unaff_x29 + -0x68);
    unaff_x25[uVar8] = unaff_w20;
    unaff_x28 = uVar8 + 1;
    *(long *)(unaff_x29 + -0x60) = unaff_x28;
    in_CY = unaff_x27 - unaff_x28 <= unaff_x26;
    in_ZR = unaff_x26 == unaff_x27 - unaff_x28;
  } while( true );
}

