
/* WARNING: Removing unreachable block (ram,0x001d35fc) */
/* WARNING: Removing unreachable block (ram,0x001d3e1c) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_001d3208(undefined8 param_1,long *param_2)

{
  long *plVar1;
  undefined8 *puVar2;
  undefined1 uVar3;
  undefined1 uVar4;
  bool bVar5;
  long lVar6;
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
  char cVar28;
  uint uVar29;
  uint uVar30;
  undefined2 *puVar31;
  undefined8 *puVar32;
  long lVar33;
  undefined8 *puVar34;
  undefined8 *puVar35;
  long lVar36;
  undefined *puVar37;
  code *pcVar38;
  long lVar39;
  char *pcVar40;
  undefined8 uVar41;
  undefined8 *puVar42;
  long lVar43;
  long lVar44;
  char *pcVar45;
  long unaff_x23;
  long unaff_x24;
  long lVar46;
  long *unaff_x25;
  ulong unaff_x26;
  ulong uVar47;
  long lVar48;
  long unaff_x29;
  undefined8 uVar49;
  undefined8 uStack0000000000000028;
  ulong in_stack_00000030;
  undefined1 uStack00000000000000b8;
  undefined8 uStack0000000000000100;
  undefined8 *in_stack_00000108;
  long in_stack_00000110;
  long in_stack_00000118;
  long in_stack_00000120;
  long in_stack_00000128;
  long in_stack_00000130;
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
  char cStack00000000000001f0;
  undefined8 in_stack_00000238;
  undefined8 uVar50;
  undefined8 *in_stack_00000240;
  long in_stack_00000248;
  long in_stack_00000250;
  long in_stack_00000258;
  long in_stack_00000260;
  long in_stack_00000268;
  undefined4 in_stack_00000270;
  undefined4 in_stack_00000274;
  undefined8 in_stack_00000278;
  undefined8 in_stack_00000280;
  undefined8 in_stack_00000288;
  undefined8 in_stack_00000290;
  undefined8 in_stack_00000298;
  undefined8 in_stack_000002a0;
  undefined8 in_stack_000002a8;
  undefined8 in_stack_000002b0;
  undefined8 in_stack_000002b8;
  undefined8 in_stack_000002c0;
  undefined8 in_stack_000002c8;
  undefined8 in_stack_000002d0;
  undefined8 in_stack_000002d8;
  undefined8 in_stack_000002e0;
  undefined8 in_stack_000002e8;
  undefined8 in_stack_000002f0;
  undefined8 in_stack_000002f8;
  undefined8 in_stack_00000300;
  undefined8 in_stack_00000308;
  undefined8 in_stack_00000310;
  undefined8 in_stack_00000318;
  undefined8 in_stack_00000320;
  ulong in_stack_00000368;
  ulong in_stack_000004e8;
  undefined7 in_stack_00000561;
  long in_stack_00000568;
  long in_stack_00000570;
  long in_stack_00000578;
  long in_stack_00000580;
  undefined1 auStack_7ffffffe [2147483646];
  
  uVar47 = unaff_x26 & 0xffffffffffff | 0x8000000000000000;
  if (*(long *)(unaff_x23 + 0x18) == uVar47 + 1) {
    (**(code **)(*(long *)(unaff_x24 + 0x30) + 0x18))
              (&uStack00000000000000b8,*(undefined8 *)(unaff_x24 + 0x28));
    _memcpy(auStack_7ffffffe + 0x8000036e,unaff_x24 + 0x48,0x138);
    lVar48 = *param_2;
    func_0x00235894(auStack_7ffffffe + 0x80000236,auStack_7ffffffe + 0x8000036e,
                    &uStack00000000000000b8,lVar48);
    in_stack_00000138 = CONCAT44(in_stack_00000274,in_stack_00000270);
    uStack0000000000000100 = in_stack_00000238;
    in_stack_00000108 = in_stack_00000240;
    in_stack_00000110 = in_stack_00000248;
    in_stack_00000118 = in_stack_00000250;
    in_stack_00000120 = in_stack_00000258;
    in_stack_00000128 = in_stack_00000260;
    in_stack_00000130 = in_stack_00000268;
    in_stack_00000140 = in_stack_00000278;
    in_stack_00000148 = in_stack_00000280;
    in_stack_00000150 = in_stack_00000288;
    in_stack_00000158 = in_stack_00000290;
    in_stack_00000160 = in_stack_00000298;
    in_stack_00000168 = in_stack_000002a0;
    in_stack_00000170 = in_stack_000002a8;
    in_stack_00000178 = in_stack_000002b0;
    in_stack_00000180 = in_stack_000002b8;
    in_stack_00000188 = in_stack_000002c0;
    in_stack_00000190 = in_stack_000002c8;
    in_stack_00000198 = in_stack_000002d0;
    in_stack_000001a0 = in_stack_000002d8;
    in_stack_000001a8 = in_stack_000002e0;
    in_stack_000001b0 = in_stack_000002e8;
    in_stack_000001b8 = in_stack_000002f0;
    in_stack_000001c0 = in_stack_000002f8;
    in_stack_000001c8 = in_stack_00000300;
    in_stack_000001d0 = in_stack_00000308;
    in_stack_000001d8 = in_stack_00000310;
    in_stack_000001e0 = in_stack_00000318;
    in_stack_000001e8 = in_stack_00000320;
    if (0x40 < in_stack_00000368) {
      puVar37 = &UNK_009c9cd0;
code_r0x001d3f04:
      func_0x007a28b0(in_stack_00000368,0x40,puVar37);
code_r0x001d3fd0:
                    /* WARNING: Does not return */
      pcVar38 = (code *)SoftwareBreakpoint(1,0x1d3fd4);
      (*pcVar38)();
    }
    if (in_stack_00000368 == *(ulong *)(unaff_x23 + 0x30)) {
      if (in_stack_00000368 == 0) {
        uVar30 = 1;
      }
      else {
        uVar30 = 1;
        pcVar40 = *(char **)(unaff_x23 + 0x28);
        pcVar45 = &cStack00000000000001f0;
        do {
          uVar29 = func_0x00231d40(*pcVar45 == *pcVar40);
          uVar30 = uVar29 & uVar30;
          in_stack_00000368 = in_stack_00000368 - 1;
          pcVar40 = pcVar40 + 1;
          pcVar45 = pcVar45 + 1;
        } while (in_stack_00000368 != 0);
      }
    }
    else {
      uVar30 = 0;
    }
    cVar28 = func_0x00231d40(uVar30);
    if (cVar28 == '\0') {
      func_0x00248ae4(lVar48,auStack_7ffffffe + 0x8000036e,*(char *)(lVar48 + 0x49) == '\x02');
      *(undefined1 *)(lVar48 + 0x335) = 1;
      unaff_x25[1] = (long)in_stack_00000240;
      *unaff_x25 = uVar47 + 6;
      unaff_x25[3] = in_stack_00000250;
      unaff_x25[2] = in_stack_00000248;
      unaff_x25[5] = in_stack_00000260;
      unaff_x25[4] = in_stack_00000258;
      unaff_x25[6] = in_stack_00000268;
    }
    else {
      func_0x001d9854();
      if ((*(byte *)(lVar48 + 0x331) & 1) != 0) {
        (**(code **)(*(long *)(unaff_x24 + 0x30) + 0x18))
                  (auStack_7ffffffe + 0x800004a6,*(undefined8 *)(unaff_x24 + 0x28));
        puVar42 = in_stack_00000108;
        uVar49 = uStack0000000000000100;
        if (in_stack_000004e8 < 0x41) {
          (*(code *)in_stack_00000108[5])(uStack0000000000000100);
          pcVar38 = (code *)puVar42[4];
          *(char *)(unaff_x29 + -0xf8) = (char)in_stack_000004e8;
          (*pcVar38)(auStack_7ffffffe + 0x800004f6,uVar49,auStack_7ffffffe + 0x8000036e,6);
          lVar6 = _UNK_0081e890;
          lVar39 = *(long *)(unaff_x24 + 0x180);
          if (lVar39 != 0) {
            lVar36 = param_2[1];
            uStack0000000000000028 = 1;
            do {
              lVar44 = *(long *)(unaff_x24 + 0x38);
              uVar49 = *(undefined8 *)(*(long *)(lVar44 + 0x68) + 0x60);
              puVar42 = *(undefined8 **)(*(long *)(lVar44 + 0x68) + 0x68);
              puVar32 = (undefined8 *)func_0x00187bdc(0x20,1);
              if (puVar32 == (undefined8 *)0x0) {
                func_0x007a1f00(1,0x20,&UNK_009c6bf0);
                goto code_r0x001d3fd0;
              }
              pcVar38 = (code *)puVar42[4];
              uVar47 = (*pcVar38)(uVar49,puVar32,0x20);
              if (((uVar47 & 1) != 0) ||
                 (uVar47 = (*pcVar38)(uVar49,auStack_7ffffffe + 0x80000236,4), (uVar47 & 1) != 0)) {
                lVar44 = -0x7fffffffffffffe0;
code_r0x001d3de4:
                func_0x00187bd4(puVar32,0x20,1);
code_r0x001d3df4:
                unaff_x25[3] = in_stack_00000568;
                unaff_x25[2] = CONCAT71(in_stack_00000561,0x10);
                unaff_x25[5] = in_stack_00000578;
                unaff_x25[4] = in_stack_00000570;
                unaff_x25[6] = in_stack_00000580;
                *unaff_x25 = lVar44;
                unaff_x25[1] = (long)puVar42;
                func_0x00252db4(auStack_7ffffffe + 0x800004f6);
                goto LAB_001d3e3c;
              }
              uVar47 = (**(code **)(*(long *)(lVar44 + 200) + 0x20))
                                 (*(long *)(lVar44 + 0xc0) +
                                  (*(long *)(*(long *)(lVar44 + 200) + 0x10) - 1U &
                                  0xfffffffffffffff0) + 0x10);
              uVar50 = 0x800000000000001f;
              if ((uVar47 & 1) == 0) {
                lVar44 = -0x7fffffffffffffe1;
                puVar42 = in_stack_00000240;
                goto code_r0x001d3de4;
              }
              func_0x001f81dc(auStack_7ffffffe + 0x80000236);
              func_0x00236d38(unaff_x29 + -0xf8,auStack_7ffffffe + 0x800004ee,puVar32,0x20);
              plVar1 = (long *)0x0;
              if (*(long *)(lVar36 + 0x70) != -0x7fffffffffffffff) {
                plVar1 = (long *)(lVar36 + 0x70);
              }
              if (0x40 < *(ulong *)(unaff_x29 + -0xb8)) {
                func_0x007a28b0(*(ulong *)(unaff_x29 + -0xb8),0x40,&UNK_009ca5f0);
                goto code_r0x001d3fd0;
              }
              if (*(long *)(lVar48 + 0x2f0) == -0x8000000000000000) {
                *(undefined8 *)(unaff_x29 + -0xb0) = 0x8000000000000000;
                if (*(long *)(lVar48 + 0x2d8) != -0x8000000000000000) goto code_r0x001d37a4;
code_r0x001d3760:
                *(undefined8 *)(unaff_x29 + -0x90) = 0x8000000000000000;
              }
              else {
                func_0x001a37dc(auStack_7ffffffe + 0x80000236,(long *)(lVar48 + 0x2f0),&UNK_009c2e28
                               );
                *(long *)(unaff_x29 + -0xa0) = in_stack_00000248;
                if (*(long *)(lVar48 + 0x2d8) == -0x8000000000000000) goto code_r0x001d3760;
code_r0x001d37a4:
                lVar46 = *(long *)(lVar48 + 0x2e8);
                if (lVar46 < 0) {
                  uStack0000000000000028 = 0;
code_r0x001d3fa4:
                  func_0x007a1f00(uStack0000000000000028,lVar46,&UNK_009c24c0);
                  goto code_r0x001d3fd0;
                }
                uVar41 = *(undefined8 *)(lVar48 + 0x2e0);
                if (lVar46 == 0) {
                  lVar33 = 1;
                }
                else {
                  lVar33 = func_0x00187bd0(lVar46,1);
                  if (lVar33 == 0) goto code_r0x001d3fa4;
                }
                _memcpy(lVar33,uVar41,lVar46);
                *(long *)(unaff_x29 + -0x90) = lVar46;
                *(long *)(unaff_x29 + -0x88) = lVar33;
                *(long *)(unaff_x29 + -0x80) = lVar46;
              }
              lVar46 = *(long *)(lVar36 + 0x50);
              if (lVar46 < 0) {
                uStack0000000000000028 = 0;
code_r0x001d3f70:
                func_0x007a1f00(uStack0000000000000028,lVar46,&UNK_009c24c0);
                goto code_r0x001d3fd0;
              }
              uVar41 = *(undefined8 *)(lVar36 + 0x48);
              if (lVar46 == 0) {
                lVar33 = 1;
              }
              else {
                lVar33 = func_0x00187bd0(lVar46,1);
                if (lVar33 == 0) goto code_r0x001d3f70;
              }
              _memcpy(lVar33,uVar41,lVar46);
              *(long *)(unaff_x29 + -0x78) = lVar46;
              *(long *)(unaff_x29 + -0x70) = lVar33;
              *(long *)(unaff_x29 + -0x68) = lVar46;
              func_0x00225bc8(auStack_7ffffffe + 0x80000236,plVar1,5);
              func_0x00252db4(unaff_x29 + -0xf8);
              *(undefined8 *)(unaff_x29 + -0xf8) = 0;
              *(undefined8 *)(unaff_x29 + -0xf0) = 1;
              *(undefined8 *)(unaff_x29 + -0xe8) = 0;
              func_0x00224e64(auStack_7ffffffe + 0x80000236,unaff_x29 + -0xf8);
              puVar42 = *(undefined8 **)(unaff_x29 + -0xf8);
              puVar2 = *(undefined8 **)(unaff_x29 + -0xf0);
              lVar43 = *(long *)(unaff_x29 + -0xe8);
              func_0x001bf1c4(auStack_7ffffffe + 0x80000236);
              lVar33 = *(long *)(lVar44 + 0x88);
              lVar46 = *(long *)(lVar44 + 0x80) +
                       (*(long *)(lVar33 + 0x10) - 1U & 0xfffffffffffffff0);
              uVar30 = (**(code **)(lVar33 + 0x20))(lVar46 + 0x10);
              if ((uVar30 & 1) != 0) {
                (**(code **)(lVar33 + 0x30))
                          (auStack_7ffffffe + 0x80000236,lVar46 + 0x10,puVar2,lVar43);
                (**(code **)(lVar33 + 0x28))(lVar46 + 0x10);
                puVar34 = in_stack_00000240;
code_r0x001d3a00:
                puVar35 = (undefined8 *)func_0x00187bd0(0x28,8);
                if (puVar35 != (undefined8 *)0x0) {
                  puVar35[1] = 1;
                  *puVar35 = 1;
                  puVar35[2] = uVar50;
                  puVar35[3] = puVar34;
                  puVar35[4] = in_stack_00000248;
                  uVar29 = *(uint *)(lVar44 + 0xf0);
                  if (((uint)((ulong)uVar29 != 0) & (uVar30 ^ 0xffffffff)) != 0) {
                    func_0x001d8840(auStack_7ffffffe + 0x8000024e,&UNK_009c3008);
                    in_stack_00000030 = in_stack_00000030 & 0xffffffff00000000 | (ulong)uVar29;
                    MACH_HEADER.cpusubtype = 1;
                    MACH_HEADER.filetype = 0x80000000;
                    MACH_HEADER._16_8_ = in_stack_00000030;
                  }
                  func_0x0024a370(auStack_7ffffffe + 0x8000053e,auStack_7ffffffe + 0x8000036e);
                  uVar29 = 0;
                  if (puVar42 != (undefined8 *)0x0) {
                    uVar29 = uVar30;
                  }
                  in_stack_00000240 = puVar32;
                  lVar43 = lVar6;
                  if (uVar29 == 1) {
                    func_0x00187bd4(puVar2,puVar42,1);
                  }
                  goto code_r0x001d3634;
                }
                func_0x007a1f18(8,0x28);
                goto code_r0x001d3fd0;
              }
              puVar34 = (undefined8 *)func_0x00187bdc(0x20,1);
              if (puVar34 == (undefined8 *)0x0) {
                func_0x007a1f00(1,0x20,&UNK_009c6bf0);
                goto code_r0x001d3fd0;
              }
              uVar47 = (*pcVar38)(uVar49,puVar34,0x20);
              if ((uVar47 & 1) != 0) {
                func_0x00187bd4(puVar34,0x20,1);
                lVar44 = -0x7fffffffffffffe0;
                if (puVar42 != (undefined8 *)0x0) {
                  func_0x00187bd4(puVar2,puVar42,1);
                }
                func_0x00187bd4(puVar32,0x20,1);
                lVar43 = in_stack_00000248;
                if ((uVar30 & 1) != 0) goto code_r0x001d3634;
                goto code_r0x001d3df4;
              }
              lVar46 = *(long *)(lVar44 + 0x70);
              lVar33 = *(long *)(lVar44 + 0x78);
              puVar35 = (undefined8 *)func_0x00187bd0(0x20,1);
              if (puVar35 == (undefined8 *)0x0) {
                func_0x007a1f00(1,0x20,&UNK_009c24c0);
                goto code_r0x001d3fd0;
              }
              uVar49 = *puVar34;
              uVar41 = puVar34[3];
              uVar50 = puVar34[2];
              puVar35[1] = puVar34[1];
              *puVar35 = uVar49;
              puVar35[3] = uVar41;
              puVar35[2] = uVar50;
              *(undefined8 *)(unaff_x29 + -0xf8) = 0x20;
              *(undefined8 **)(unaff_x29 + -0xf0) = puVar35;
              *(undefined8 *)(unaff_x29 + -0xe8) = 0x20;
              uVar47 = (**(code **)(lVar33 + 0x20))
                                 (lVar46 + (*(long *)(lVar33 + 0x10) - 1U & 0xfffffffffffffff0) +
                                  0x10,unaff_x29 + -0xf8,auStack_7ffffffe + 0x80000236);
              if ((uVar47 & 1) != 0) {
                uVar50 = 0x20;
                in_stack_00000248 = 0x20;
                goto code_r0x001d3a00;
              }
              func_0x00187bd4(puVar34,0x20,1);
              func_0x00187bd4(puVar32,0x20,1);
              in_stack_00000240 = puVar2;
code_r0x001d3634:
              lVar39 = lVar39 + -1;
              in_stack_00000248 = lVar43;
            } while (lVar39 != 0);
          }
          func_0x00248ae4(lVar48,auStack_7ffffffe + 0x8000036e,1);
          *(undefined1 *)(lVar48 + 0x333) = 1;
          func_0x00248970(lVar48,param_2 + 2);
          uVar27 = in_stack_000001e8;
          uVar26 = in_stack_000001e0;
          uVar25 = in_stack_000001d8;
          uVar24 = in_stack_000001d0;
          uVar23 = in_stack_000001c8;
          uVar22 = in_stack_000001c0;
          uVar21 = in_stack_000001b8;
          uVar20 = in_stack_000001b0;
          uVar19 = in_stack_000001a8;
          uVar18 = in_stack_000001a0;
          uVar17 = in_stack_00000198;
          uVar16 = in_stack_00000190;
          uVar15 = in_stack_00000188;
          uVar14 = in_stack_00000180;
          uVar13 = in_stack_00000178;
          uVar12 = in_stack_00000170;
          uVar11 = in_stack_00000168;
          uVar10 = in_stack_00000160;
          uVar9 = in_stack_00000158;
          uVar8 = in_stack_00000150;
          uVar7 = in_stack_00000148;
          uVar41 = in_stack_00000140;
          uVar50 = in_stack_00000138;
          lVar46 = in_stack_00000130;
          lVar44 = in_stack_00000128;
          lVar36 = in_stack_00000120;
          lVar6 = in_stack_00000118;
          lVar39 = in_stack_00000110;
          puVar42 = in_stack_00000108;
          uVar49 = uStack0000000000000100;
          if (*(char *)(lVar48 + 0x339) == '\x01') {
            puVar32 = (undefined8 *)func_0x00187bd0(0xf0,8);
            if (puVar32 == (undefined8 *)0x0) {
              func_0x007a1f18(8,0xf0);
              goto code_r0x001d3fd0;
            }
            puVar32[0x19] = uVar23;
            puVar32[0x18] = uVar22;
            puVar32[0x1b] = uVar25;
            puVar32[0x1a] = uVar24;
            puVar32[0x1d] = uVar27;
            puVar32[0x1c] = uVar26;
            puVar32[0x11] = uVar15;
            puVar32[0x10] = uVar14;
            puVar32[0x13] = uVar17;
            puVar32[0x12] = uVar16;
            puVar32[0x15] = uVar19;
            puVar32[0x14] = uVar18;
            puVar32[0x17] = uVar21;
            puVar32[0x16] = uVar20;
            puVar32[9] = uVar7;
            puVar32[8] = uVar41;
            puVar32[0xb] = uVar9;
            puVar32[10] = uVar8;
            puVar32[0xd] = uVar11;
            puVar32[0xc] = uVar10;
            puVar32[0xf] = uVar13;
            puVar32[0xe] = uVar12;
            puVar32[1] = puVar42;
            *puVar32 = uVar49;
            puVar32[3] = lVar6;
            puVar32[2] = lVar39;
            puVar37 = &UNK_009c3020;
          }
          else {
            puVar32 = (undefined8 *)func_0x00187bd0(0xf0,8);
            if (puVar32 == (undefined8 *)0x0) {
              func_0x007a1f18(8,0xf0);
              goto code_r0x001d3fd0;
            }
            puVar32[0x19] = uVar23;
            puVar32[0x18] = uVar22;
            puVar32[0x1b] = uVar25;
            puVar32[0x1a] = uVar24;
            puVar32[0x1d] = uVar27;
            puVar32[0x1c] = uVar26;
            puVar32[0x11] = uVar15;
            puVar32[0x10] = uVar14;
            puVar32[0x13] = uVar17;
            puVar32[0x12] = uVar16;
            puVar32[0x15] = uVar19;
            puVar32[0x14] = uVar18;
            puVar32[0x17] = uVar21;
            puVar32[0x16] = uVar20;
            puVar32[9] = uVar7;
            puVar32[8] = uVar41;
            puVar32[0xb] = uVar9;
            puVar32[10] = uVar8;
            puVar32[0xd] = uVar11;
            puVar32[0xc] = uVar10;
            puVar32[0xf] = uVar13;
            puVar32[0xe] = uVar12;
            puVar32[1] = puVar42;
            *puVar32 = uVar49;
            puVar32[3] = lVar6;
            puVar32[2] = lVar39;
            puVar37 = &UNK_009c3068;
          }
          puVar32[5] = lVar44;
          puVar32[4] = lVar36;
          puVar32[7] = uVar50;
          puVar32[6] = lVar46;
          unaff_x25[1] = (long)puVar32;
          unaff_x25[2] = (long)puVar37;
          *unaff_x25 = -0x7fffffffffffffd9;
          func_0x00252db4(auStack_7ffffffe + 0x800004f6);
          func_0x00240a1c(&cStack00000000000001f0);
          func_0x001be974(unaff_x23);
          lVar48 = **(long **)(unaff_x24 + 0x38);
          **(long **)(unaff_x24 + 0x38) = lVar48 + -1;
          LORelease();
          if (lVar48 == 1) {
            DataMemoryBarrier(2,1);
            func_0x001fa1d4();
          }
          func_0x001be5e4(unaff_x24);
          goto code_r0x001d3e98;
        }
        puVar37 = &UNK_009c9ca0;
        in_stack_00000368 = in_stack_000004e8;
        goto code_r0x001d3f04;
      }
      func_0x00248ae4(lVar48,auStack_7ffffffe + 0x8000036e,*(char *)(lVar48 + 0x49) == '\x02');
      *(undefined1 *)(lVar48 + 0x335) = 1;
      *(undefined1 *)(unaff_x25 + 1) = 0x1b;
      *unaff_x25 = uVar47 + 9;
    }
LAB_001d3e3c:
    func_0x00240a1c(&cStack00000000000001f0);
    func_0x001bf718(&uStack0000000000000100);
    bVar5 = false;
  }
  else {
    puVar31 = (undefined2 *)func_0x00187bd0(2,1);
    if (puVar31 == (undefined2 *)0x0) {
      func_0x007a1f00(1,2,&UNK_009c64a8);
      goto code_r0x001d3fd0;
    }
    *puVar31 = 0xe;
    uVar3 = *(undefined1 *)(unaff_x23 + 0xb0);
    uVar4 = *(undefined1 *)(unaff_x23 + 0xb1);
    bVar5 = true;
    unaff_x25[2] = (long)puVar31;
    unaff_x25[3] = 1;
    *(undefined1 *)(unaff_x25 + 4) = uVar3;
    *(undefined1 *)((long)unaff_x25 + 0x21) = uVar4;
    *unaff_x25 = uVar47 + 1;
    unaff_x25[1] = 1;
  }
  func_0x001be974(unaff_x23);
  lVar48 = **(long **)(unaff_x24 + 0x38);
  **(long **)(unaff_x24 + 0x38) = lVar48 + -1;
  LORelease();
  if (lVar48 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001fa1d4();
  }
  func_0x001be5e4(unaff_x24);
  if (bVar5) {
    func_0x00252db4(unaff_x24 + 0x138);
    func_0x001bf718(unaff_x24 + 0x48);
  }
code_r0x001d3e98:
  func_0x00187bd4(unaff_x24,0x188,8);
  return;
}

