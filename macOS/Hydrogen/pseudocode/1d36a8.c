
/* WARNING: Removing unreachable block (ram,0x001d3e88) */
/* WARNING: Removing unreachable block (ram,0x001d35fc) */

void FUN_001d36a8(void)

{
  long *plVar1;
  uint uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  code *pcVar29;
  uint uVar30;
  ulong uVar31;
  long lVar32;
  undefined8 *puVar33;
  undefined8 *puVar34;
  undefined8 *puVar35;
  undefined *puVar36;
  undefined8 *unaff_x19;
  undefined8 uVar37;
  long unaff_x20;
  undefined8 unaff_x21;
  undefined8 *unaff_x22;
  long lVar38;
  code *unaff_x27;
  long unaff_x29;
  undefined8 uVar39;
  undefined8 uVar40;
  undefined8 in_stack_00000028;
  ulong in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  long in_stack_00000058;
  long *in_stack_00000060;
  long *in_stack_00000068;
  undefined8 *in_stack_00000070;
  long in_stack_00000080;
  undefined8 *puStack0000000000000088;
  long in_stack_00000090;
  long in_stack_000000a0;
  long in_stack_000000a8;
  long in_stack_000000b0;
  undefined8 uStack0000000000000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  undefined8 in_stack_00000120;
  undefined8 in_stack_00000128;
  undefined8 in_stack_00000130;
  undefined8 in_stack_00000138;
  undefined8 in_stack_00000140;
  undefined8 in_stack_00000148;
  undefined8 in_stack_00000150;
  undefined8 in_stack_00000158;
  undefined8 in_stack_00000160;
  undefined8 in_stack_00000168;
  undefined8 in_stack_00000170;
  undefined8 in_stack_00000178;
  undefined8 in_stack_00000180;
  undefined8 in_stack_00000188;
  undefined8 in_stack_00000190;
  undefined8 in_stack_00000198;
  undefined8 in_stack_000001a0;
  undefined8 in_stack_000001a8;
  undefined8 in_stack_000001b0;
  undefined8 in_stack_000001b8;
  undefined8 in_stack_000001c0;
  undefined8 in_stack_000001c8;
  undefined8 in_stack_000001d0;
  undefined8 in_stack_000001d8;
  undefined8 in_stack_000001e0;
  undefined8 in_stack_000001e8;
  undefined1 uStack00000000000001f0;
  undefined8 uVar41;
  undefined8 *in_stack_00000240;
  undefined8 in_stack_00000248;
  long in_stack_00000540;
  undefined8 in_stack_00000548;
  undefined8 in_stack_00000560;
  undefined8 in_stack_00000568;
  undefined8 in_stack_00000570;
  undefined8 in_stack_00000578;
  undefined8 in_stack_00000580;
  undefined1 auStack_7ffffffe [2147483646];
  
  do {
    puStack0000000000000088 = unaff_x22;
    uVar31 = (*unaff_x27)(unaff_x21,auStack_7ffffffe + 0x80000236,4);
    if ((uVar31 & 1) != 0) break;
    uVar31 = (**(code **)(*(long *)(in_stack_000000b0 + 200) + 0x20))
                       (*(long *)(in_stack_000000b0 + 0xc0) +
                        (*(long *)(*(long *)(in_stack_000000b0 + 200) + 0x10) - 1U &
                        0xfffffffffffffff0) + 0x10);
    uVar41 = 0x800000000000001f;
    if ((uVar31 & 1) == 0) {
      uVar41 = 0x800000000000001f;
      unaff_x19 = in_stack_00000240;
      goto code_r0x001d3de4;
    }
    func_0x001f81dc(auStack_7ffffffe + 0x80000236);
    func_0x00236d38(unaff_x29 + -0xf8,auStack_7ffffffe + 0x800004ee,unaff_x22,0x20);
    plVar1 = (long *)0x0;
    if (*in_stack_00000068 != -0x7fffffffffffffff) {
      plVar1 = in_stack_00000068;
    }
    if (0x40 < *(ulong *)(unaff_x29 + -0xb8)) {
      func_0x007a28b0(*(ulong *)(unaff_x29 + -0xb8),0x40,&UNK_009ca5f0);
      goto LAB_001d3fd0;
    }
    if (*in_stack_00000060 == unaff_x20) {
      *(long *)(unaff_x29 + -0xb0) = unaff_x20;
      if (*(long *)(in_stack_000000a0 + 0x2d8) == unaff_x20) goto LAB_001d3760;
LAB_001d37a4:
      lVar38 = *(long *)(in_stack_000000a0 + 0x2e8);
      if (lVar38 < 0) {
        in_stack_00000028 = 0;
FUN_001d3fa4:
        func_0x007a1f00(in_stack_00000028,lVar38,&UNK_009c24c0);
        goto LAB_001d3fd0;
      }
      uVar37 = *(undefined8 *)(in_stack_000000a0 + 0x2e0);
      if (lVar38 == 0) {
        lVar32 = 1;
      }
      else {
        lVar32 = func_0x00187bd0(lVar38,1);
        if (lVar32 == 0) goto FUN_001d3fa4;
      }
      _memcpy(lVar32,uVar37,lVar38);
      *(long *)(unaff_x29 + -0x90) = lVar38;
      *(long *)(unaff_x29 + -0x88) = lVar32;
      *(long *)(unaff_x29 + -0x80) = lVar38;
    }
    else {
      func_0x001a37dc(auStack_7ffffffe + 0x80000236,in_stack_00000060,&UNK_009c2e28);
      *(undefined8 *)(unaff_x29 + -0xa0) = in_stack_00000248;
      if (*(long *)(in_stack_000000a0 + 0x2d8) != unaff_x20) goto LAB_001d37a4;
LAB_001d3760:
      *(undefined8 *)(unaff_x29 + -0x90) = 0x8000000000000000;
    }
    lVar38 = *(long *)(in_stack_00000058 + 0x50);
    if (lVar38 < 0) {
      in_stack_00000028 = 0;
LAB_001d3f70:
      func_0x007a1f00(in_stack_00000028,lVar38,&UNK_009c24c0);
      goto LAB_001d3fd0;
    }
    uVar37 = *(undefined8 *)(in_stack_00000058 + 0x48);
    if (lVar38 == 0) {
      lVar32 = 1;
    }
    else {
      lVar32 = func_0x00187bd0(lVar38,1);
      if (lVar32 == 0) goto LAB_001d3f70;
    }
    _memcpy(lVar32,uVar37,lVar38);
    *(long *)(unaff_x29 + -0x78) = lVar38;
    *(long *)(unaff_x29 + -0x70) = lVar32;
    *(long *)(unaff_x29 + -0x68) = lVar38;
    func_0x00225bc8(auStack_7ffffffe + 0x80000236,plVar1,5);
    func_0x00252db4(unaff_x29 + -0xf8);
    *(undefined8 *)(unaff_x29 + -0xf8) = 0;
    *(undefined8 *)(unaff_x29 + -0xf0) = 1;
    *(undefined8 *)(unaff_x29 + -0xe8) = 0;
    func_0x00224e64(auStack_7ffffffe + 0x80000236,unaff_x29 + -0xf8);
    unaff_x19 = *(undefined8 **)(unaff_x29 + -0xf8);
    puVar35 = *(undefined8 **)(unaff_x29 + -0xf0);
    uVar37 = *(undefined8 *)(unaff_x29 + -0xe8);
    func_0x001bf1c4(auStack_7ffffffe + 0x80000236);
    lVar32 = *(long *)(in_stack_000000b0 + 0x88);
    lVar38 = *(long *)(in_stack_000000b0 + 0x80) +
             (*(long *)(lVar32 + 0x10) - 1U & 0xfffffffffffffff0);
    uVar30 = (**(code **)(lVar32 + 0x20))(lVar38 + 0x10);
    if ((uVar30 & 1) == 0) {
      puVar33 = (undefined8 *)func_0x00187bdc(0x20,1);
      if (puVar33 == (undefined8 *)0x0) {
        func_0x007a1f00(1,0x20,&UNK_009c6bf0);
        goto LAB_001d3fd0;
      }
      uVar31 = (*unaff_x27)(unaff_x21,puVar33,0x20);
      if ((uVar31 & 1) == 0) {
        lVar38 = *(long *)(in_stack_000000b0 + 0x70);
        lVar32 = *(long *)(in_stack_000000b0 + 0x78);
        puVar34 = (undefined8 *)func_0x00187bd0(0x20,1);
        if (puVar34 == (undefined8 *)0x0) {
          func_0x007a1f00(1,0x20,&UNK_009c24c0);
          goto LAB_001d3fd0;
        }
        uVar41 = *puVar33;
        uVar40 = puVar33[3];
        uVar39 = puVar33[2];
        puVar34[1] = puVar33[1];
        *puVar34 = uVar41;
        puVar34[3] = uVar40;
        puVar34[2] = uVar39;
        *(undefined8 *)(unaff_x29 + -0xf8) = 0x20;
        *(undefined8 **)(unaff_x29 + -0xf0) = puVar34;
        *(undefined8 *)(unaff_x29 + -0xe8) = 0x20;
        uVar31 = (**(code **)(lVar32 + 0x20))
                           (lVar38 + (*(long *)(lVar32 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10,
                            unaff_x29 + -0xf8,auStack_7ffffffe + 0x80000236);
        if ((uVar31 & 1) != 0) {
          uVar41 = 0x20;
          in_stack_00000248 = 0x20;
          goto LAB_001d3a00;
        }
        func_0x00187bd4(puVar33,0x20,1);
        func_0x00187bd4(puStack0000000000000088,0x20,1);
        in_stack_00000240 = puVar35;
      }
      else {
        func_0x00187bd4(puVar33,0x20,1);
        uVar41 = 0x8000000000000020;
        if (unaff_x19 != (undefined8 *)0x0) {
          func_0x00187bd4(puVar35,unaff_x19,1);
        }
        func_0x00187bd4(puStack0000000000000088,0x20,1);
        uVar37 = in_stack_00000248;
        if ((uVar30 & 1) == 0) goto code_r0x001d3df4;
      }
    }
    else {
      (**(code **)(lVar32 + 0x30))(auStack_7ffffffe + 0x80000236,lVar38 + 0x10,puVar35,uVar37);
      (**(code **)(lVar32 + 0x28))(lVar38 + 0x10);
      puVar33 = in_stack_00000240;
LAB_001d3a00:
      puVar34 = (undefined8 *)func_0x00187bd0(0x28,8);
      in_stack_00000240 = puStack0000000000000088;
      if (puVar34 == (undefined8 *)0x0) {
        func_0x007a1f18(8,0x28);
        goto LAB_001d3fd0;
      }
      puVar34[1] = 1;
      *puVar34 = 1;
      puVar34[2] = uVar41;
      puVar34[3] = puVar33;
      puVar34[4] = in_stack_00000248;
      uVar2 = *(uint *)(in_stack_000000b0 + 0xf0);
      if (((uint)((ulong)uVar2 != 0) & (uVar30 ^ 0xffffffff)) != 0) {
        func_0x001d8840(auStack_7ffffffe + 0x8000024e,&UNK_009c3008);
        in_stack_00000030 = in_stack_00000030 & 0xffffffff00000000 | (ulong)uVar2;
        MACH_HEADER.cpusubtype = 1;
        MACH_HEADER.filetype = 0x80000000;
        MACH_HEADER._16_8_ = in_stack_00000030;
      }
      func_0x0024a370(auStack_7ffffffe + 0x8000053e,auStack_7ffffffe + 0x8000036e);
      uVar2 = 0;
      if (unaff_x19 != (undefined8 *)0x0) {
        uVar2 = uVar30;
      }
      uVar37 = in_stack_00000040;
      if (uVar2 == 1) {
        func_0x00187bd4(puVar35,unaff_x19,1);
      }
    }
    in_stack_00000090 = in_stack_00000090 + -1;
    unaff_x20 = -0x8000000000000000;
    if (in_stack_00000090 == 0) {
      func_0x00248ae4(in_stack_000000a0,auStack_7ffffffe + 0x8000036e,1);
      *(undefined1 *)(in_stack_000000a0 + 0x333) = 1;
      func_0x00248970(in_stack_000000a0,in_stack_00000080 + 0x10);
      uVar28 = in_stack_000001e8;
      uVar27 = in_stack_000001e0;
      uVar26 = in_stack_000001d8;
      uVar25 = in_stack_000001d0;
      uVar24 = in_stack_000001c8;
      uVar23 = in_stack_000001c0;
      uVar22 = in_stack_000001b8;
      uVar21 = in_stack_000001b0;
      uVar20 = in_stack_000001a8;
      uVar19 = in_stack_000001a0;
      uVar18 = in_stack_00000198;
      uVar17 = in_stack_00000190;
      uVar16 = in_stack_00000188;
      uVar15 = in_stack_00000180;
      uVar14 = in_stack_00000178;
      uVar13 = in_stack_00000170;
      uVar12 = in_stack_00000168;
      uVar11 = in_stack_00000160;
      uVar10 = in_stack_00000158;
      uVar9 = in_stack_00000150;
      uVar8 = in_stack_00000148;
      uVar7 = in_stack_00000140;
      uVar6 = in_stack_00000138;
      uVar5 = in_stack_00000130;
      uVar4 = in_stack_00000128;
      uVar3 = in_stack_00000120;
      uVar40 = in_stack_00000118;
      uVar39 = in_stack_00000110;
      uVar37 = in_stack_00000108;
      uVar41 = uStack0000000000000100;
      if (*(char *)(in_stack_000000a0 + 0x339) == '\x01') {
        puVar35 = (undefined8 *)func_0x00187bd0(0xf0,8);
        if (puVar35 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0xf0);
          goto LAB_001d3fd0;
        }
        puVar35[0x19] = uVar24;
        puVar35[0x18] = uVar23;
        puVar35[0x1b] = uVar26;
        puVar35[0x1a] = uVar25;
        puVar35[0x1d] = uVar28;
        puVar35[0x1c] = uVar27;
        puVar35[0x11] = uVar16;
        puVar35[0x10] = uVar15;
        puVar35[0x13] = uVar18;
        puVar35[0x12] = uVar17;
        puVar35[0x15] = uVar20;
        puVar35[0x14] = uVar19;
        puVar35[0x17] = uVar22;
        puVar35[0x16] = uVar21;
        puVar35[9] = uVar8;
        puVar35[8] = uVar7;
        puVar35[0xb] = uVar10;
        puVar35[10] = uVar9;
        puVar35[0xd] = uVar12;
        puVar35[0xc] = uVar11;
        puVar35[0xf] = uVar14;
        puVar35[0xe] = uVar13;
        puVar35[1] = uVar37;
        *puVar35 = uVar41;
        puVar35[3] = uVar40;
        puVar35[2] = uVar39;
        puVar36 = &UNK_009c3020;
      }
      else {
        puVar35 = (undefined8 *)func_0x00187bd0(0xf0,8);
        if (puVar35 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0xf0);
LAB_001d3fd0:
                    /* WARNING: Does not return */
          pcVar29 = (code *)SoftwareBreakpoint(1,0x1d3fd4);
          (*pcVar29)();
        }
        puVar35[0x19] = uVar24;
        puVar35[0x18] = uVar23;
        puVar35[0x1b] = uVar26;
        puVar35[0x1a] = uVar25;
        puVar35[0x1d] = uVar28;
        puVar35[0x1c] = uVar27;
        puVar35[0x11] = uVar16;
        puVar35[0x10] = uVar15;
        puVar35[0x13] = uVar18;
        puVar35[0x12] = uVar17;
        puVar35[0x15] = uVar20;
        puVar35[0x14] = uVar19;
        puVar35[0x17] = uVar22;
        puVar35[0x16] = uVar21;
        puVar35[9] = uVar8;
        puVar35[8] = uVar7;
        puVar35[0xb] = uVar10;
        puVar35[10] = uVar9;
        puVar35[0xd] = uVar12;
        puVar35[0xc] = uVar11;
        puVar35[0xf] = uVar14;
        puVar35[0xe] = uVar13;
        puVar35[1] = uVar37;
        *puVar35 = uVar41;
        puVar35[3] = uVar40;
        puVar35[2] = uVar39;
        puVar36 = &UNK_009c3068;
      }
      puVar35[5] = uVar4;
      puVar35[4] = uVar3;
      puVar35[7] = uVar6;
      puVar35[6] = uVar5;
      in_stack_00000070[1] = puVar35;
      in_stack_00000070[2] = puVar36;
      *in_stack_00000070 = 0x8000000000000027;
      func_0x00252db4(auStack_7ffffffe + 0x800004f6);
      func_0x00240a1c(&uStack00000000000001f0);
      func_0x001be974(in_stack_00000038);
      lVar38 = **(long **)(in_stack_000000a8 + 0x38);
      **(long **)(in_stack_000000a8 + 0x38) = lVar38 + -1;
      LORelease();
      if (lVar38 == 1) {
        DataMemoryBarrier(2,1);
        func_0x001fa1d4();
      }
      func_0x001be5e4(in_stack_000000a8);
      goto code_r0x001d3e98;
    }
    in_stack_000000b0 = *(long *)(in_stack_000000a8 + 0x38);
    unaff_x21 = *(undefined8 *)(*(long *)(in_stack_000000b0 + 0x68) + 0x60);
    unaff_x19 = *(undefined8 **)(*(long *)(in_stack_000000b0 + 0x68) + 0x68);
    unaff_x22 = (undefined8 *)func_0x00187bdc(0x20,1);
    if (unaff_x22 == (undefined8 *)0x0) {
      func_0x007a1f00(1,0x20,&UNK_009c6bf0);
      goto LAB_001d3fd0;
    }
    unaff_x27 = (code *)unaff_x19[4];
    uVar31 = (*unaff_x27)(unaff_x21,unaff_x22,0x20);
    in_stack_00000248 = uVar37;
  } while ((uVar31 & 1) == 0);
  uVar41 = 0x8000000000000020;
code_r0x001d3de4:
  func_0x00187bd4(unaff_x22,0x20,1);
code_r0x001d3df4:
  in_stack_00000070[3] = in_stack_00000568;
  in_stack_00000070[2] = in_stack_00000560;
  in_stack_00000070[5] = in_stack_00000578;
  in_stack_00000070[4] = in_stack_00000570;
  in_stack_00000070[6] = in_stack_00000580;
  *in_stack_00000070 = uVar41;
  in_stack_00000070[1] = unaff_x19;
  if (in_stack_00000540 != 0) {
    func_0x00187bd4(in_stack_00000548,in_stack_00000540,1);
  }
  func_0x00252db4(auStack_7ffffffe + 0x800004f6);
  func_0x00240a1c(&uStack00000000000001f0);
  func_0x001bf718(&uStack0000000000000100);
  func_0x001be974(in_stack_00000038);
  lVar38 = **(long **)(in_stack_000000a8 + 0x38);
  **(long **)(in_stack_000000a8 + 0x38) = lVar38 + -1;
  LORelease();
  if (lVar38 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001fa1d4();
  }
  func_0x001be5e4(in_stack_000000a8);
code_r0x001d3e98:
  func_0x00187bd4(in_stack_000000a8,0x188,8);
  return;
}

