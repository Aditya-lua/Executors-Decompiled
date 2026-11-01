
void FUN_001dc3c8(void)

{
  undefined8 *puVar1;
  bool bVar2;
  byte bVar3;
  undefined1 *puVar4;
  undefined1 *puVar5;
  undefined1 *puVar6;
  undefined1 *puVar7;
  undefined1 *puVar8;
  undefined1 *puVar9;
  undefined1 *puVar10;
  undefined1 *puVar11;
  long lVar12;
  code *pcVar13;
  undefined4 uVar14;
  long lVar15;
  long lVar16;
  undefined1 *puVar17;
  long lVar18;
  ulong *puVar19;
  undefined *puVar20;
  uint *puVar21;
  undefined8 *puVar22;
  ulong *puVar23;
  long *plVar24;
  ulong uVar25;
  undefined1 *puVar26;
  uint uVar27;
  ulong uVar28;
  long unaff_x22;
  long *unaff_x23;
  long *unaff_x24;
  undefined8 uVar29;
  bool bVar30;
  long *unaff_x26;
  long unaff_x27;
  undefined4 *puVar31;
  long *unaff_x28;
  undefined1 *puVar32;
  long unaff_x29;
  undefined1 *puVar33;
  undefined8 uVar34;
  undefined1 *puVar35;
  undefined8 uVar36;
  undefined1 *puVar37;
  undefined1 *puVar38;
  undefined8 uVar39;
  undefined1 *puVar40;
  undefined1 *puVar41;
  undefined8 uVar42;
  undefined8 uVar43;
  undefined8 uVar44;
  undefined8 uVar45;
  undefined8 uVar46;
  undefined8 uVar47;
  undefined8 uVar48;
  undefined8 uVar49;
  undefined8 uVar50;
  undefined8 uVar51;
  undefined8 uVar52;
  long in_stack_00000008;
  long in_stack_00000028;
  undefined8 *in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  long *in_stack_00000048;
  undefined8 *in_stack_00000050;
  uint in_stack_00000058;
  long *in_stack_00000060;
  long in_stack_00000068;
  undefined8 uStack00000000000000a0;
  undefined1 *in_stack_000000a8;
  undefined1 *in_stack_000000b0;
  long in_stack_000000f8;
  undefined8 uStack0000000000000108;
  undefined1 *in_stack_00000110;
  undefined1 *in_stack_00000118;
  undefined8 uStack0000000000000120;
  undefined1 *in_stack_00000128;
  undefined1 *in_stack_00000130;
  undefined1 *in_stack_00000138;
  undefined1 *in_stack_00000140;
  undefined1 *in_stack_00000148;
  undefined8 uStack0000000000000150;
  undefined1 *in_stack_00000158;
  undefined1 *in_stack_00000160;
  undefined1 *in_stack_00000168;
  undefined1 *in_stack_00000170;
  undefined1 *in_stack_00000178;
  undefined1 *in_stack_00000180;
  undefined1 *in_stack_00000188;
  undefined1 *in_stack_00000190;
  undefined1 *in_stack_00000198;
  undefined1 *in_stack_000001a0;
  long in_stack_000001a8;
  undefined8 in_stack_000001b0;
  undefined8 uStack00000000000001c0;
  undefined8 uStack00000000000001c8;
  undefined1 *in_stack_000001d0;
  long in_stack_000001d8;
  long in_stack_000001e0;
  long in_stack_000001e8;
  long in_stack_000001f0;
  long in_stack_000001f8;
  undefined1 *in_stack_000002e0;
  undefined1 *in_stack_000002e8;
  undefined1 *in_stack_000002f0;
  undefined1 *in_stack_000002f8;
  undefined1 *in_stack_00000300;
  undefined1 *in_stack_00000308;
  undefined1 *in_stack_00000310;
  undefined1 *in_stack_00000318;
  undefined1 *in_stack_00000320;
  undefined1 *in_stack_00000328;
  undefined1 *in_stack_00000330;
  undefined1 *in_stack_00000338;
  undefined1 *in_stack_00000340;
  long in_stack_00000348;
  undefined8 in_stack_00000350;
  undefined1 *puVar53;
  undefined1 *puVar54;
  undefined8 in_stack_00000450;
  undefined8 in_stack_00000458;
  undefined8 in_stack_00000460;
  undefined8 in_stack_00000468;
  undefined1 auStack_7ffffffe [6];
  ulong auStack_7ffffff8 [268435455];
  
  uVar29 = 1;
  lVar15 = func_0x00187bd0();
  if (lVar15 == 0) {
    puVar20 = &UNK_009c3208;
  }
  else {
    _memcpy();
    puVar40 = in_stack_000000b0;
    if (in_stack_000000b0 == uStack00000000000000a0) {
      func_0x001d89b8(&uStack00000000000000a0,&UNK_009c3548);
    }
    puVar33 = in_stack_000000a8;
    puVar22 = (undefined8 *)(in_stack_000000a8 + (long)puVar40 * 0x40);
    puVar22[5] = in_stack_00000458;
    puVar22[4] = in_stack_00000450;
    puVar22[7] = in_stack_00000468;
    puVar22[6] = in_stack_00000460;
    puVar22[1] = unaff_x22;
    *puVar22 = 0x8000000000000005;
    puVar22[3] = unaff_x22;
    puVar22[2] = lVar15;
    puVar40 = puVar40 + 1;
    in_stack_000000f8 = 0;
    in_stack_000000b0 = puVar40;
    if (puVar40 < (undefined1 *)((long)&MACH_HEADER.magic + 2)) {
LAB_001dc680:
      func_0x001a4ea8(&uStack0000000000000108,auStack_7ffffffe + 0x8000042e,&UNK_009c30f0);
      puVar40 = in_stack_00000118;
      if (in_stack_00000118 == uStack0000000000000108) {
        func_0x001d8d34(&uStack0000000000000108,&UNK_009c3488);
      }
      *(undefined2 *)(in_stack_00000110 + (long)puVar40 * 4) = 3;
      in_stack_00000118 = puVar40 + 1;
      puVar32 = (undefined1 *)unaff_x23[0x25];
      puVar33 = (undefined1 *)unaff_x23[0x24];
      puVar40 = (undefined1 *)unaff_x23[0x27];
      puVar37 = (undefined1 *)unaff_x23[0x26];
      puVar35 = (undefined1 *)unaff_x23[0x29];
      puVar26 = (undefined1 *)unaff_x23[0x28];
      puVar41 = (undefined1 *)unaff_x23[0x2b];
      puVar38 = (undefined1 *)unaff_x23[0x2a];
      lVar15 = unaff_x23[0x2c];
      puVar17 = (undefined1 *)func_0x00187bd0(2,1);
      if (puVar17 == (undefined1 *)0x0) {
        func_0x007a1f18(1,2);
        goto code_r0x001dd404;
      }
      *puVar17 = 0;
      in_stack_00000158 = in_stack_000000a8;
      uStack0000000000000150 = uStack00000000000000a0;
      in_stack_000001b0 = CONCAT62(in_stack_000001b0._2_6_,4);
      in_stack_00000160 = in_stack_000000b0;
      in_stack_00000128 = in_stack_00000110;
      uStack0000000000000120 = uStack0000000000000108;
      in_stack_00000130 = in_stack_00000118;
      in_stack_00000138 = (undefined1 *)((long)&MACH_HEADER.magic + 1);
      in_stack_00000148 = (undefined1 *)((long)&MACH_HEADER.magic + 1);
      lVar16 = unaff_x23[0x23];
      in_stack_00000140 = puVar17;
      in_stack_00000168 = puVar33;
      in_stack_00000170 = puVar32;
      in_stack_00000178 = puVar37;
      in_stack_00000180 = puVar40;
      in_stack_00000188 = puVar26;
      in_stack_00000190 = puVar35;
      in_stack_00000198 = puVar38;
      in_stack_000001a0 = puVar41;
      in_stack_000001a8 = lVar15;
      if ((*(long *)(lVar16 + 0x68) == in_stack_00000038) ||
         (*(long *)(lVar16 + 0x68) != -0x7fffffffffffffff)) {
        uStack00000000000001c0 = (undefined1 *)0x8000000000000019;
      }
      else {
        uVar29 = *(undefined8 *)(*(long *)(lVar16 + 0x130) + 0x60);
        uVar34 = *(undefined8 *)(*(long *)(lVar16 + 0x130) + 0x68);
        if ((*(byte *)(unaff_x23 + 0x1f) & 1) == 0) {
          if (unaff_x23[0x20] == -0x8000000000000000) {
            puVar33 = (undefined1 *)unaff_x23[0x20];
            puVar32 = (undefined1 *)unaff_x23[0x21];
            puVar37 = (undefined1 *)unaff_x23[0x22];
          }
          else {
            func_0x0045cd08(auStack_7ffffffe + 0x800002be,unaff_x23 + 0x20);
          }
          puVar26 = (undefined1 *)((ulong)puVar26 & 0xffffffffffffff00);
          puVar35 = puVar33;
          puVar38 = puVar32;
          puVar41 = puVar37;
        }
        else {
          puVar26 = (undefined1 *)unaff_x23[0x1f];
          puVar35 = (undefined1 *)unaff_x23[0x20];
          puVar38 = (undefined1 *)unaff_x23[0x21];
          puVar41 = (undefined1 *)unaff_x23[0x22];
        }
        func_0x0021bc40(&uStack00000000000001c0,lVar16 + 0x70,uVar29,uVar34,
                        auStack_7ffffffe + 0x8000042e,&uStack0000000000000120);
      }
      lVar12 = in_stack_000001e8;
      lVar18 = in_stack_000001e0;
      lVar16 = in_stack_000001d8;
      puVar11 = in_stack_000001d0;
      puVar10 = uStack00000000000001c8;
      puVar9 = uStack00000000000001c0;
      puVar8 = in_stack_00000158;
      puVar7 = uStack0000000000000150;
      puVar6 = in_stack_00000148;
      puVar5 = in_stack_00000140;
      puVar4 = in_stack_00000138;
      puVar54 = in_stack_00000130;
      puVar53 = in_stack_00000128;
      puVar17 = uStack0000000000000120;
      if (*unaff_x24 == -0x8000000000000000) {
        if ((*(byte *)(unaff_x26[1] + 0x20) != 0) ||
           (uStack00000000000001c0 == (undefined1 *)0x8000000000000019)) goto LAB_001dc9a0;
        if (uStack00000000000001c0 == (undefined1 *)0x8000000000000018) {
          in_stack_00000030[1] = in_stack_000001d0;
          *in_stack_00000030 = uStack00000000000001c8;
          in_stack_00000030[3] = in_stack_000001e0;
          in_stack_00000030[2] = in_stack_000001d8;
          in_stack_00000030[5] = in_stack_000001f0;
          in_stack_00000030[4] = in_stack_000001e8;
          in_stack_00000030[6] = in_stack_000001f8;
          func_0x001d5778(&uStack0000000000000120);
          goto LAB_001dca94;
        }
        func_0x001e0040(auStack_7ffffffe + 0x8000042e,auStack_7ffffffe + 0x800002be);
        puVar40 = in_stack_00000160;
        if (in_stack_00000160 == uStack0000000000000150) {
          func_0x001d89b8(&uStack0000000000000150,&UNK_009c34a0);
        }
        puVar22 = (undefined8 *)(in_stack_00000158 + (long)puVar40 * 0x40);
        puVar22[5] = in_stack_00000458;
        puVar22[4] = lVar15;
        puVar22[7] = in_stack_00000468;
        puVar22[6] = in_stack_00000460;
        puVar22[1] = puVar35;
        *puVar22 = puVar26;
        puVar22[3] = puVar41;
        puVar22[2] = puVar38;
        in_stack_00000160 = puVar40 + 1;
        *(undefined1 *)(unaff_x26[1] + 0x20) = 1;
        plVar24 = unaff_x23 + 0x17;
        if (*plVar24 != -0x7fffffffffffffe8) {
          func_0x001d5248(plVar24);
        }
        bVar30 = false;
        unaff_x23[0x18] = (long)puVar10;
        *plVar24 = (long)puVar9;
        unaff_x23[0x1a] = lVar16;
        unaff_x23[0x19] = (long)puVar11;
        unaff_x23[0x1c] = lVar12;
        unaff_x23[0x1b] = lVar18;
        unaff_x23[0x1e] = in_stack_000001f8;
        unaff_x23[0x1d] = in_stack_000001f0;
        puVar17 = puVar9;
        puVar53 = puVar10;
        puVar54 = puVar11;
      }
      else if ((*(byte *)(unaff_x26[1] + 0x20) | 2) == 2) {
        bVar30 = true;
        func_0x0021c978(auStack_7ffffffe + 0x800002be);
        if (puVar33 == (undefined1 *)0x8000000000000000) {
          in_stack_00000030[1] = puVar37;
          *in_stack_00000030 = puVar32;
          in_stack_00000030[3] = in_stack_000002e0;
          in_stack_00000030[2] = puVar40;
          in_stack_00000030[5] = in_stack_000002f0;
          in_stack_00000030[4] = in_stack_000002e8;
          in_stack_00000030[6] = in_stack_000002f8;
          if (uStack00000000000001c0 == (undefined1 *)0x8000000000000018) {
            func_0x001d4a90(&uStack00000000000001c8);
          }
          else if (uStack00000000000001c0 != (undefined1 *)0x8000000000000019) {
            func_0x001d5248(&uStack00000000000001c0);
          }
LAB_001dca94:
          func_0x001d5f88();
          func_0x001d4e60();
          in_stack_00000008 = in_stack_00000008 + 1;
          lVar15 = in_stack_00000028;
          while (in_stack_00000008 = in_stack_00000008 + -1, in_stack_00000008 != 0) {
            func_0x001a09ec(lVar15);
            lVar15 = lVar15 + 0x40;
          }
          if (*in_stack_00000048 != 0) {
            func_0x00187bd4(in_stack_00000028,*in_stack_00000048 << 6,8);
          }
          if (unaff_x27 != 0) {
            if ((code *)*in_stack_00000050 != (code *)0x0) {
              (*(code *)*in_stack_00000050)(unaff_x27);
            }
            if (in_stack_00000050[1] != 0) {
              func_0x00187bd4(unaff_x27,in_stack_00000050[1],in_stack_00000050[2]);
            }
          }
          lVar15 = *unaff_x28;
          if (lVar15 == 0) {
            return;
          }
          in_stack_00000028 = unaff_x28[1];
          uVar29 = 1;
          goto LAB_001dd228;
        }
        *(undefined1 *)(in_stack_00000060[1] + 0x20) = 2;
        uStack0000000000000120 = puVar33;
        in_stack_00000128 = puVar32;
        in_stack_00000130 = puVar37;
        in_stack_00000138 = puVar40;
        in_stack_00000140 = in_stack_000002e0;
        in_stack_00000148 = in_stack_000002e8;
        uStack0000000000000150 = in_stack_000002f0;
        in_stack_00000158 = in_stack_000002f8;
        in_stack_00000160 = in_stack_00000300;
        in_stack_00000168 = in_stack_00000308;
        in_stack_00000170 = in_stack_00000310;
        in_stack_00000178 = in_stack_00000318;
        in_stack_00000180 = in_stack_00000320;
        in_stack_00000188 = in_stack_00000328;
        in_stack_00000190 = in_stack_00000330;
        in_stack_00000198 = in_stack_00000338;
        in_stack_000001a0 = in_stack_00000340;
        in_stack_000001a8 = in_stack_00000348;
        in_stack_000001b0 = in_stack_00000350;
        if (in_stack_00000300 == (undefined1 *)0x0) {
          puVar26 = (undefined1 *)0x8000000000000018;
          lVar15 = unaff_x23[0x17];
        }
        else {
          puVar26 = (undefined1 *)0x8000000000000018;
          if ((qword *)(in_stack_000002f8 + (long)in_stack_00000300 * 0x40) !=
              &segment_command_00000020.vmsize) {
            func_0x001e0040(auStack_7ffffffe + 0x8000042e);
            puVar26 = puVar17;
            puVar33 = puVar53;
            puVar32 = puVar54;
            puVar37 = puVar4;
            puVar40 = puVar5;
            in_stack_000002e0 = puVar6;
            in_stack_000002e8 = puVar7;
            in_stack_000002f0 = puVar8;
          }
          lVar15 = unaff_x23[0x17];
        }
        if (lVar15 != -0x7fffffffffffffe8) {
          func_0x001d5248();
        }
        unaff_x23[0x17] = (long)puVar26;
        unaff_x23[0x19] = (long)puVar32;
        unaff_x23[0x18] = (long)puVar33;
        unaff_x23[0x1b] = (long)puVar40;
        unaff_x23[0x1a] = (long)puVar37;
        unaff_x23[0x1d] = (long)in_stack_000002e8;
        unaff_x23[0x1c] = (long)in_stack_000002e0;
        unaff_x23[0x1e] = (long)in_stack_000002f0;
      }
      else {
LAB_001dc9a0:
        bVar30 = true;
        puVar17 = puVar26;
        puVar53 = puVar35;
        puVar54 = puVar38;
      }
      func_0x001a56ac(auStack_7ffffffe + 0x8000042e,in_stack_00000158,
                      in_stack_00000158 + (long)in_stack_00000160 * 0x40,&UNK_009c30f0);
      if (*unaff_x23 != 0) {
        func_0x00187bd4(unaff_x23[1],*unaff_x23 << 2,2);
      }
      unaff_x23[1] = (long)puVar53;
      *unaff_x23 = (long)puVar17;
      unaff_x23[2] = (long)puVar54;
      if (*unaff_x24 == -0x8000000000000000) {
        if (in_stack_000000f8 == 0) goto code_r0x001dccec;
        lVar15 = *(long *)(in_stack_000000f8 + 0x70);
        func_0x0020ebb8(auStack_7ffffffe + 0x8000042e,in_stack_000000f8,unaff_x28,
                        auStack_7ffffffe + 0x800001fe);
      }
      else if ((in_stack_000000f8 == 0) ||
              (lVar15 = unaff_x24[0x16], unaff_x24[0x16] = 0, lVar15 == 0)) {
code_r0x001dccec:
        lVar15 = 0;
      }
      else {
        lVar15 = *(long *)(in_stack_000000f8 + 0x70);
      }
      *(undefined8 *)(unaff_x29 + -0x78) = 0;
      *(undefined8 *)(unaff_x29 + -0x70) = 1;
      *(undefined8 *)(unaff_x29 + -0x68) = 0;
      func_0x001bb074(auStack_7ffffffe + 0x8000037e,unaff_x29 + -0x78,auStack_7ffffffe + 0x8000042e)
      ;
      lVar16 = *(long *)(unaff_x29 + -0x78);
      if (((in_stack_00000068 != 0) &&
          (lVar18 = *in_stack_00000060, (*(byte *)(lVar18 + 0x339) & 1) == 0)) &&
         (bVar3 = *(byte *)((long)unaff_x23 + 0x169), *(undefined1 *)((long)unaff_x23 + 0x169) = 1,
         (bVar3 & 1) == 0)) {
        func_0x00248ae4(lVar18,auStack_7ffffffe + 0x8000042e,0);
      }
      puVar23 = (ulong *)(auStack_7ffffffe + 0x800002ce);
      uVar25 = lVar16 + 0x7fffffffffffffff;
      if (4 < uVar25) {
        uVar25 = 1;
      }
      if (uVar25 == 2) {
        puVar19 = (ulong *)(auStack_7ffffffe + 0x800002d6);
code_r0x001dce84:
        uVar28 = *puVar23;
        uVar25 = *puVar19;
        lVar16 = unaff_x28[2];
        if ((ulong)(*unaff_x28 - lVar16) < uVar25) {
          func_0x0079b61c(unaff_x28,lVar16,uVar25,1,1);
          lVar16 = unaff_x28[2];
        }
        _memcpy(unaff_x28[1] + lVar16,uVar28,uVar25);
        unaff_x28[2] = lVar16 + uVar25;
      }
      else if (uVar25 == 1) {
        puVar19 = puVar23;
        puVar23 = (ulong *)(auStack_7ffffffe + 0x800002c6);
        goto code_r0x001dce84;
      }
      func_0x00248ae4(*in_stack_00000060,auStack_7ffffffe + 0x8000042e,0);
      if (lVar15 == 0) {
        uVar27 = 0;
        if (in_stack_00000068 == 0) {
          uVar27 = in_stack_00000058;
        }
        if ((uVar27 & 1) != 0) goto code_r0x001dcfb0;
code_r0x001dd0c0:
        _memcpy(auStack_7ffffffe + 0x8000043e);
        lVar15 = func_0x00187bd0(0x2b8,8);
        if (lVar15 == 0) {
          func_0x007a1f18(8,0x2b8);
          goto code_r0x001dd404;
        }
        _memcpy(lVar15,auStack_7ffffffe + 0x8000042e,0x2b8);
        puVar20 = &UNK_009c34b8;
      }
      else {
        if (*(byte *)(in_stack_00000060[1] + 0x18) - 1 < 2) {
          plVar24 = unaff_x23 + 0x24;
          if (*unaff_x24 != -0x8000000000000000) {
            unaff_x28 = unaff_x24;
            plVar24 = unaff_x24 + 0x19;
          }
          lVar16 = *(long *)(unaff_x23[0x23] + 0x118);
          func_0x0020f000(*(long *)(unaff_x23[0x23] + 0x110) +
                          (*(long *)(lVar16 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10,lVar16,
                          in_stack_00000060,lVar15,auStack_7ffffffe + 0x8000042e,
                          (long)unaff_x23 + 0x169,unaff_x28,plVar24);
        }
        uVar27 = 0;
        if (in_stack_00000068 == 0) {
          uVar27 = in_stack_00000058;
        }
        if ((uVar27 & 1) == 0) goto code_r0x001dd0c0;
code_r0x001dcfb0:
        _memcpy(auStack_7ffffffe + 0x8000043e);
        lVar15 = func_0x00187bd0(0x2d0,8);
        if (lVar15 == 0) {
          func_0x007a1f18(8,0x2d0);
          goto code_r0x001dd404;
        }
        _memcpy(lVar15,auStack_7ffffffe + 0x8000042e,0x2d0);
        puVar20 = &UNK_009c3500;
      }
      in_stack_00000030[1] = lVar15;
      in_stack_00000030[2] = puVar20;
      *in_stack_00000030 = 0x8000000000000027;
      bVar2 = false;
      if (uStack00000000000001c0 != (undefined1 *)0x8000000000000019) {
        bVar2 = bVar30;
      }
      if (bVar2) {
        if (uStack00000000000001c0 == (undefined1 *)0x8000000000000018) {
          func_0x001d4a90(&uStack00000000000001c8);
        }
        else {
          func_0x001d5248(&uStack00000000000001c0);
        }
      }
      if ((uVar27 & 1) != 0) {
        return;
      }
      in_stack_00000008 = in_stack_00000008 + 1;
      lVar15 = in_stack_00000028;
      while (in_stack_00000008 = in_stack_00000008 + -1, in_stack_00000008 != 0) {
        func_0x001a09ec(lVar15);
        lVar15 = lVar15 + 0x40;
      }
      if (*in_stack_00000048 == 0) {
        return;
      }
      lVar15 = *in_stack_00000048 << 6;
      uVar29 = 8;
LAB_001dd228:
      func_0x00187bd4(in_stack_00000028,lVar15,uVar29);
      return;
    }
    lVar15 = unaff_x26[1];
    if ((ulong)puVar40 >> 0x20 == 0) {
      unaff_x22 = (long)puVar40 * 8;
      uVar29 = 4;
      lVar16 = func_0x00187bd0(unaff_x22,4);
      if (lVar16 != 0) {
        puVar32 = (undefined1 *)0x0;
        puVar31 = (undefined4 *)(lVar16 + 4);
        puVar37 = puVar33;
        do {
          uVar14 = func_0x0025a330(lVar15 + 0x20,unaff_x23 + 3,puVar37);
          puVar31[-1] = uVar14;
          *puVar31 = (int)puVar32;
          puVar32 = puVar32 + 1;
          puVar31 = puVar31 + 2;
          puVar37 = puVar37 + 0x40;
        } while (puVar40 != puVar32);
        if (&MACH_HEADER.sizeofcmds < puVar40) {
          func_0x00241f58(lVar16,puVar40,auStack_7ffffffe + 0x8000042e);
        }
        else {
          func_0x001d824c(lVar16,puVar40,1);
        }
        puVar32 = (undefined1 *)0x0;
        puVar37 = (undefined1 *)((long)&MACH_HEADER.magic + 1);
        while (puVar26 = puVar32, puVar32 < puVar40) {
          puVar21 = (uint *)(lVar16 + (long)puVar32 * 8 + 4);
          uVar27 = *puVar21;
          while (puVar26 = (undefined1 *)(ulong)uVar27, puVar26 < puVar32) {
            uVar27 = *(uint *)(lVar16 + (long)puVar26 * 8 + 4);
          }
          *puVar21 = uVar27;
          if (puVar40 <= puVar26) break;
          puVar22 = (undefined8 *)(puVar33 + (long)puVar32 * 0x40);
          uVar39 = puVar22[5];
          uVar36 = puVar22[4];
          uVar34 = puVar22[7];
          uVar29 = puVar22[6];
          uVar45 = puVar22[1];
          uVar44 = *puVar22;
          uVar43 = puVar22[3];
          uVar42 = puVar22[2];
          puVar1 = (undefined8 *)(puVar33 + (long)puVar26 * 0x40);
          uVar46 = puVar1[4];
          uVar48 = puVar1[7];
          uVar47 = puVar1[6];
          uVar52 = puVar1[1];
          uVar51 = *puVar1;
          uVar50 = puVar1[3];
          uVar49 = puVar1[2];
          puVar22[5] = puVar1[5];
          puVar22[4] = uVar46;
          puVar22[7] = uVar48;
          puVar22[6] = uVar47;
          puVar22[1] = uVar52;
          *puVar22 = uVar51;
          puVar22[3] = uVar50;
          puVar22[2] = uVar49;
          puVar1[1] = uVar45;
          *puVar1 = uVar44;
          puVar1[3] = uVar43;
          puVar1[2] = uVar42;
          puVar1[5] = uVar39;
          puVar1[4] = uVar36;
          puVar1[7] = uVar34;
          puVar1[6] = uVar29;
          if (puVar40 <= puVar37) {
            uVar29 = 4;
            goto LAB_001dc678;
          }
          puVar32 = puVar37;
          puVar37 = puVar37 + 1;
        }
        func_0x007a2570(puVar26,puVar40,&UNK_009c31a0);
        goto code_r0x001dd404;
      }
    }
    else {
      unaff_x22 = (long)puVar40 * 0x10;
      uVar29 = 8;
      lVar16 = func_0x00187bd0(unaff_x22,8);
      if (lVar16 != 0) {
        puVar32 = (undefined1 *)0x0;
        puVar37 = puVar33;
        puVar22 = (undefined8 *)(lVar16 + 8);
        do {
          uVar14 = func_0x0025a330(lVar15 + 0x20,unaff_x23 + 3,puVar37);
          *(undefined4 *)(puVar22 + -1) = uVar14;
          *puVar22 = puVar32;
          puVar32 = puVar32 + 1;
          puVar37 = puVar37 + 0x40;
          puVar22 = puVar22 + 2;
        } while (puVar40 != puVar32);
        func_0x00241e30(lVar16,puVar40,auStack_7ffffffe + 0x8000042e);
        puVar32 = (undefined1 *)((long)&MACH_HEADER.magic + 1);
        puVar37 = (undefined1 *)0x0;
        while( true ) {
          puVar26 = puVar32;
          puVar22 = (undefined8 *)(lVar16 + (long)puVar37 * 0x10 + 8);
          for (puVar32 = (undefined1 *)*puVar22; puVar32 < puVar37;
              puVar32 = *(undefined1 **)(lVar16 + (long)puVar32 * 0x10 + 8)) {
          }
          *puVar22 = puVar32;
          if (puVar40 <= puVar32) {
            func_0x007a2570(puVar32,puVar40,&UNK_009c3188);
            goto code_r0x001dd404;
          }
          puVar22 = (undefined8 *)(puVar33 + (long)puVar37 * 0x40);
          uVar39 = puVar22[5];
          uVar36 = puVar22[4];
          uVar34 = puVar22[7];
          uVar29 = puVar22[6];
          uVar45 = puVar22[1];
          uVar44 = *puVar22;
          uVar43 = puVar22[3];
          uVar42 = puVar22[2];
          puVar1 = (undefined8 *)(puVar33 + (long)puVar32 * 0x40);
          uVar46 = puVar1[4];
          uVar48 = puVar1[7];
          uVar47 = puVar1[6];
          uVar52 = puVar1[1];
          uVar51 = *puVar1;
          uVar50 = puVar1[3];
          uVar49 = puVar1[2];
          puVar22[5] = puVar1[5];
          puVar22[4] = uVar46;
          puVar22[7] = uVar48;
          puVar22[6] = uVar47;
          puVar22[1] = uVar52;
          *puVar22 = uVar51;
          puVar22[3] = uVar50;
          puVar22[2] = uVar49;
          puVar1[1] = uVar45;
          *puVar1 = uVar44;
          puVar1[3] = uVar43;
          puVar1[2] = uVar42;
          puVar1[5] = uVar39;
          puVar1[4] = uVar36;
          puVar1[7] = uVar34;
          puVar1[6] = uVar29;
          if (puVar40 <= puVar26) break;
          puVar32 = puVar26 + 1;
          puVar37 = puVar26;
        }
        uVar29 = 8;
LAB_001dc678:
        func_0x00187bd4(lVar16,unaff_x22,uVar29);
        unaff_x26 = in_stack_00000060;
        unaff_x27 = in_stack_00000040;
        goto LAB_001dc680;
      }
    }
    puVar20 = &UNK_009c30f0;
  }
  func_0x007a1f00(uVar29,unaff_x22,puVar20);
code_r0x001dd404:
                    /* WARNING: Does not return */
  pcVar13 = (code *)SoftwareBreakpoint(1,0x1dd408);
  (*pcVar13)();
}

