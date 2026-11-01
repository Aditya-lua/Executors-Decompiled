
/* WARNING: Possible PIC construction at 0x0071df00: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0071e260: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0071e304: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0071e07c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0071e308) */
/* WARNING: Removing unreachable block (ram,0x0071e264) */
/* WARNING: Removing unreachable block (ram,0x0071e26c) */
/* WARNING: Removing unreachable block (ram,0x0071e2ac) */
/* WARNING: Removing unreachable block (ram,0x0071e298) */
/* WARNING: Removing unreachable block (ram,0x0071e2b8) */
/* WARNING: Removing unreachable block (ram,0x0071e2a0) */
/* WARNING: Removing unreachable block (ram,0x0071e2c0) */
/* WARNING: Removing unreachable block (ram,0x0071df04) */
/* WARNING: Removing unreachable block (ram,0x0071df0c) */
/* WARNING: Removing unreachable block (ram,0x0071dfbc) */
/* WARNING: Removing unreachable block (ram,0x0071df2c) */
/* WARNING: Removing unreachable block (ram,0x0071dfc8) */
/* WARNING: Removing unreachable block (ram,0x0071df34) */
/* WARNING: Removing unreachable block (ram,0x0071dfd0) */
/* WARNING: Removing unreachable block (ram,0x0071e080) */

uint * FUN_0071dcd8(void)

{
  ulong *puVar1;
  undefined4 uVar2;
  undefined1 uVar4;
  undefined1 uVar3;
  int iVar5;
  undefined8 *puVar6;
  undefined8 uVar7;
  long lVar8;
  uint *puVar9;
  ulong *puVar10;
  uint uVar11;
  undefined8 *puVar12;
  long lVar13;
  long *extraout_x8;
  long *plVar14;
  ulong uVar15;
  long extraout_x9;
  ulong *puVar16;
  uint *puVar17;
  uint *puVar18;
  long lVar19;
  ulong uVar20;
  uint *puVar21;
  long unaff_x19;
  ulong *unaff_x20;
  ulong *puVar22;
  ulong *unaff_x21;
  ulong *puVar23;
  uint *unaff_x22;
  uint *puVar24;
  ulong uVar25;
  ulong *unaff_x23;
  ulong *puVar26;
  undefined8 *puVar27;
  undefined8 *unaff_x24;
  ulong unaff_x25;
  long unaff_x26;
  undefined1 *unaff_x29;
  undefined *puVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  ulong uVar33;
  ulong uVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  ulong uVar37;
  ulong uVar38;
  undefined8 uVar39;
  undefined1 auVar40 [16];
  undefined1 auVar41 [16];
  undefined1 *in_stack_00000000;
  undefined8 in_stack_00000010;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 *in_stack_00000038;
  undefined8 *in_stack_00000040;
  undefined8 *in_stack_00000048;
  undefined8 *in_stack_00000050;
  ulong *in_stack_00000060;
  undefined8 *in_stack_00000070;
  undefined8 *in_stack_00000078;
  undefined8 *in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c8;
  undefined8 uStack00000000000000d0;
  undefined8 in_stack_000000d8;
  char cStack00000000000000e0;
  undefined7 uStack00000000000000e1;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000118;
  undefined8 in_stack_00000128;
  undefined8 uStack0000000000000130;
  ulong in_stack_00000138;
  undefined1 in_stack_00000140;
  undefined8 in_stack_00000148;
  undefined4 uStack0000000000000150;
  undefined1 uStack0000000000000154;
  undefined8 in_stack_00000158;
  undefined8 in_stack_00000160;
  undefined8 in_stack_000001ef;
  long lStack_50;
  ulong uStack_48;
  undefined8 *puStack_40;
  ulong *puStack_38;
  uint *puStack_30;
  ulong *puStack_28;
  ulong *puStack_20;
  undefined1 auStack_6 [6];
  
  auVar40._8_8_ = unaff_x22;
  auVar40._0_8_ = unaff_x19;
  do {
    func_0x00710d48();
    uVar3 = (undefined1)unaff_x25;
    uVar4 = SUB81(unaff_x23,0);
    if ((*unaff_x22 & 0xfffffffe) == 0x116) {
      func_0x0070c3d0(&uStack0000000000000130,in_stack_00000088);
      if ((int)uStack0000000000000130 != 0x5d) goto LAB_0071ddac;
      if (*(char *)(unaff_x19 + 0x58) == '\0') {
        in_stack_00000030._4_4_ = 0;
        in_stack_00000028 = *unaff_x21;
        *(undefined8 *)(unaff_x29 + -0xf0) = 0;
        *(undefined8 *)(unaff_x29 + -0xe8) = 0;
      }
      else {
        if (*unaff_x22 == 0x116) {
          in_stack_00000030._4_4_ = func_0x0070b9b4();
          in_stack_00000010._4_4_ = 2;
        }
        else {
          if (*unaff_x22 != 0x117) {
            in_stack_00000030._4_4_ = 0;
            in_stack_00000028 = *unaff_x21;
            in_stack_00000010._4_4_ = 3;
            *(undefined8 *)(unaff_x29 + -0xf0) = 0;
            *(undefined8 *)(unaff_x29 + -0xe8) = 0;
            goto LAB_0071e0dc;
          }
          iVar5 = func_0x0070b9dc();
          in_stack_00000030._4_4_ = 0;
          in_stack_00000010._4_4_ = (uint)(iVar5 == 1);
        }
        in_stack_00000028 = *(ulong *)(unaff_x19 + 0x84);
        *(undefined8 *)(unaff_x29 + -0xf0) = 0;
        *(undefined8 *)(unaff_x29 + -0xe8) = 0;
      }
LAB_0071e0dc:
      func_0x0071af20(&uStack00000000000000d0);
      in_stack_00000020 = *unaff_x21;
      uStack0000000000000130 =
           (ulong *)CONCAT44(uStack0000000000000130._4_4_,*(undefined4 *)(unaff_x29 + -0xe0));
      *(undefined8 *)((long)unaff_x24 + 4) = *(undefined8 *)((long)unaff_x24 + 0x54);
      if (*unaff_x22 == 0x5d) {
        func_0x00710d48();
      }
      else {
        func_0x00721808();
        func_0x007244d4();
      }
      in_stack_00000018 = *unaff_x21;
      if (*unaff_x22 == 0x3a) {
        func_0x00710d48();
      }
      else {
        func_0x0072447c();
      }
      uVar2 = *(undefined4 *)(unaff_x19 + 0x114);
      in_stack_00000138 = unaff_x21[1];
      uStack0000000000000130 = (ulong *)*unaff_x21;
      if ((*(int *)(unaff_x19 + 0x80) != 0x26) && (*(int *)(unaff_x19 + 0x80) != 0x7c)) {
        func_0x0071f5c8();
        *(undefined4 *)(unaff_x19 + 0x114) = uVar2;
      }
      uVar7 = func_0x0071cf0c();
      puVar22 = uStack00000000000000d0;
      *(undefined4 *)(unaff_x19 + 0x114) = uVar2;
      if ((cStack00000000000000e0 != '\0') &&
         (lVar8 = _memchr(uStack00000000000000d0,0,in_stack_000000d8), lVar8 == 0)) {
        uVar29 = *in_stack_00000040;
        in_stack_00000080[1] = in_stack_00000040[1];
        *in_stack_00000080 = uVar29;
        uStack0000000000000130 = puVar22;
        in_stack_00000148 = uVar7;
        uStack0000000000000150 = (int)unaff_x26;
        uStack0000000000000154 = uVar3;
        *in_stack_00000078 = *(undefined8 *)(unaff_x29 + -0x78);
        unaff_x24 = &uStack0000000000000130;
        *(undefined8 *)((long)in_stack_00000078 + 7) = in_stack_000001ef;
        in_stack_00000160._4_1_ = uVar4;
        auVar40._8_8_ = &uStack0000000000000130;
        auVar40._0_8_ = unaff_x29 + -0x90;
        goto code_r0x0071e744;
      }
      func_0x007181dc();
      unaff_x24 = &uStack0000000000000130;
    }
    else {
LAB_0071ddac:
      if (unaff_x20 == (ulong *)0x0) {
        *in_stack_00000048 = *(undefined8 *)(unaff_x29 + -0x78);
        *(undefined8 *)((long)in_stack_00000048 + 7) = *(undefined8 *)((long)unaff_x24 + 0xbf);
        in_stack_00000098 = *(undefined8 *)(unaff_x29 + -0xd8);
        in_stack_00000090 = *(undefined8 *)(unaff_x29 + -0xe0);
        in_stack_000000a8 = *(undefined8 *)(unaff_x29 + -200);
        in_stack_000000a0 = *(undefined8 *)(unaff_x29 + -0xd0);
        in_stack_000000b8._4_1_ = uVar3;
        in_stack_000000c8._4_1_ = uVar4;
        func_0x0071b1d4(&uStack00000000000000d0);
        unaff_x20 = uStack00000000000000d0;
        if (*(char *)(unaff_x19 + 0x58) != '\0') {
          uStack0000000000000130 = (ulong *)((ulong)uStack0000000000000130 & 0xffffffff00000000);
          *(ulong *)((long)unaff_x24 + 0xc) =
               CONCAT71(uStack00000000000000e1,cStack00000000000000e0);
          *(undefined8 *)((long)unaff_x24 + 4) = in_stack_000000d8;
          *(undefined8 *)((long)unaff_x24 + 0x14) = in_stack_000000e8;
          if (*unaff_x22 == 0x2c) {
            uVar20 = 0;
            uVar25 = 0x100000000;
          }
          else if (*unaff_x22 == 0x3b) {
            uVar25 = 0x100000000;
            uVar20 = 1;
          }
          else {
            uVar25 = 0;
            uVar20 = 0;
          }
          *(ulong *)((long)unaff_x24 + 0x1c) = uVar20 | uVar25;
          *(ulong *)((long)unaff_x24 + 0x24) = *unaff_x21;
          in_stack_00000158._4_1_ = 1;
          *in_stack_00000070 = 0;
          in_stack_00000070[1] = 0;
          auVar41._8_8_ = &uStack0000000000000130;
          auVar41._0_8_ = unaff_x29 + -0xa8;
          puVar28 = (undefined *)0x71e080;
          puVar22 = uStack00000000000000d0;
          goto code_r0x0071e8d0;
        }
      }
      else {
        *in_stack_00000050 = *(undefined8 *)(unaff_x29 + -0x78);
        *(undefined8 *)((long)in_stack_00000050 + 7) = *(undefined8 *)((long)unaff_x24 + 0xbf);
        in_stack_000000f8 = *(undefined8 *)(unaff_x29 + -0xd8);
        in_stack_000000f0 = *(undefined8 *)(unaff_x29 + -0xe0);
        in_stack_00000108 = *(undefined8 *)(unaff_x29 + -200);
        in_stack_00000100 = *(undefined8 *)(unaff_x29 + -0xd0);
        in_stack_00000118._4_1_ = uVar3;
        in_stack_00000128._4_1_ = uVar4;
        func_0x0071b1d4(&uStack0000000000000130);
        func_0x007181dc();
      }
    }
    uVar11 = *unaff_x22;
    if ((uVar11 != 0x2c) && (uVar11 != 0x3b)) {
      if (uVar11 == 0x7d) {
code_r0x0071dbd0:
        unaff_x21 = (ulong *)0x0;
        uVar25 = *(ulong *)(unaff_x19 + 0x8c);
        goto code_r0x0071dbd8;
      }
      unaff_x21 = (ulong *)0x0;
      uVar25 = *(ulong *)(unaff_x19 + 0x8c);
      goto code_r0x0071e620;
    }
    func_0x00710d48();
    if (*unaff_x22 == 0x7d) goto code_r0x0071dbd0;
    if (*unaff_x22 == 0x119) {
      func_0x0070c3d0(&uStack0000000000000130,in_stack_00000088);
      if (((int)uStack0000000000000130 == 0x3a) || (lVar8 = *(long *)(unaff_x19 + 0x98), lVar8 == 0)
         ) goto code_r0x0071dcb8;
      iVar5 = _strcmp(lVar8,"read");
      if (iVar5 == 0) {
        unaff_x25 = (ulong)(byte)*unaff_x21;
        *(undefined8 *)(unaff_x29 + -0x78) = *in_stack_00000038;
        *(undefined8 *)((long)unaff_x24 + 0xbf) = *(undefined8 *)((long)in_stack_00000038 + 7);
        func_0x0070ba44(in_stack_00000088);
        unaff_x23 = (ulong *)((long)&MACH_HEADER.magic + 1);
        unaff_x26 = 1;
      }
      else {
        iVar5 = _strcmp(lVar8,"write");
        if (iVar5 != 0) goto code_r0x0071dcb8;
        unaff_x25 = (ulong)(byte)*unaff_x21;
        *(undefined8 *)(unaff_x29 + -0x78) = *in_stack_00000038;
        *(undefined8 *)((long)unaff_x24 + 0xbf) = *(undefined8 *)((long)in_stack_00000038 + 7);
        func_0x0070ba44(in_stack_00000088);
        unaff_x26 = 2;
        unaff_x23 = (ulong *)((long)&MACH_HEADER.magic + 1);
      }
    }
    else {
code_r0x0071dcb8:
      unaff_x25 = 0;
      unaff_x23 = (ulong *)0x0;
      unaff_x26 = 3;
    }
    uVar11 = *unaff_x22;
    if (uVar11 != 0x5b) break;
    uVar7 = *(undefined8 *)unaff_x22;
    uVar30 = *(undefined8 *)(unaff_x22 + 6);
    uVar29 = *(undefined8 *)(unaff_x22 + 4);
    *(undefined8 *)(unaff_x29 + -0xd8) = *(undefined8 *)(unaff_x22 + 2);
    *(undefined8 *)(unaff_x29 + -0xe0) = uVar7;
    *(undefined8 *)(unaff_x29 + -200) = uVar30;
    *(undefined8 *)(unaff_x29 + -0xd0) = uVar29;
  } while( true );
  if (*(long *)(unaff_x29 + -0x80) == 0 && unaff_x20 == (ulong *)0x0) {
    if (uVar11 == 0x119) {
      func_0x0070c3d0(&uStack0000000000000130,in_stack_00000088);
      uVar11 = *unaff_x22;
      if ((int)uStack0000000000000130 == 0x3a) goto code_r0x0071dd6c;
    }
    uVar2 = *(undefined4 *)(unaff_x19 + 0x114);
    in_stack_00000138 = unaff_x21[1];
    uStack0000000000000130 = (ulong *)*unaff_x21;
    if ((uVar11 != 0x26) && (uVar11 != 0x7c)) {
      func_0x0071f5c8();
      *(undefined4 *)(unaff_x19 + 0x114) = uVar2;
    }
    uVar25 = func_0x0071cf0c();
    *(undefined4 *)(unaff_x19 + 0x114) = uVar2;
    uVar20 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x70);
    puVar22 = (ulong *)(uVar25 + 0xc);
    uVar7 = *(undefined8 *)(unaff_x19 + 0x120);
    uStack0000000000000130 = (ulong *)((ulong)uStack0000000000000130 & 0xffffffffffffff00);
    in_stack_00000140 = 0;
    *(undefined8 *)(unaff_x29 + -0xe0) = 0;
    *(undefined8 *)(unaff_x29 + -0xd8) = 0;
    in_stack_00000000 = unaff_x29 + -0xe0;
    func_0x00707d58(uVar20,puVar22,0,0,uVar7,&uStack0000000000000130,puVar22,0);
    in_stack_00000138 = *(ulong *)(uVar25 + 0x14);
    uStack0000000000000130 = (ulong *)*puVar22;
    unaff_x20 = (ulong *)func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x38);
    *unaff_x20 = uVar20;
    unaff_x20[1] = uVar25;
    unaff_x20[3] = in_stack_00000138;
    unaff_x20[2] = (ulong)uStack0000000000000130;
    *(int *)(unaff_x20 + 4) = (int)unaff_x26;
    *(char *)((long)unaff_x20 + 0x24) = (char)unaff_x25;
    *(undefined8 *)((long)unaff_x20 + 0x25) = *(undefined8 *)(unaff_x29 + -0x78);
    *(undefined8 *)((long)unaff_x20 + 0x2c) = *(undefined8 *)((long)unaff_x24 + 0xbf);
    *(char *)((long)unaff_x20 + 0x34) = (char)unaff_x23;
    unaff_x21 = (ulong *)((long)&MACH_HEADER.magic + 1);
    iVar5 = *(int *)(unaff_x19 + 0x80);
    uVar25 = *(ulong *)(unaff_x19 + 0x8c);
joined_r0x0071e61c:
    if (iVar5 == 0x7d) {
code_r0x0071dbd8:
      func_0x00710d48();
    }
    else {
code_r0x0071e620:
      func_0x00721808();
      uVar20 = func_0x007244d4();
      if ((uVar20 & 1) == 0) {
        uVar25 = *(ulong *)(unaff_x19 + 0xa8);
      }
    }
    uVar7 = *(undefined8 *)(unaff_x19 + 0xd8);
    uStack0000000000000130 = in_stack_00000060;
    unaff_x23 = *(ulong **)(unaff_x29 + -0x80);
    in_stack_00000138 = uVar25;
    if (unaff_x23 == (ulong *)0x0) {
      puVar6 = (undefined8 *)0x0;
    }
    else {
      unaff_x24 = *(undefined8 **)(unaff_x29 + -0x88);
      unaff_x25 = **(ulong **)(unaff_x29 + -0x90);
      puVar6 = (undefined8 *)func_0x00704c24(uVar7,(long)unaff_x23 * 0x38);
      puVar12 = (undefined8 *)(unaff_x25 + (long)unaff_x24 * 0x38);
      puVar27 = puVar6;
      puVar22 = unaff_x23;
      do {
        uVar30 = puVar12[1];
        uVar29 = *puVar12;
        uVar32 = puVar12[3];
        uVar31 = puVar12[2];
        uVar36 = puVar12[5];
        uVar35 = puVar12[4];
        puVar27[6] = puVar12[6];
        puVar27[3] = uVar32;
        puVar27[2] = uVar31;
        puVar27[5] = uVar36;
        puVar27[4] = uVar35;
        puVar27[1] = uVar30;
        *puVar27 = uVar29;
        puVar12 = puVar12 + 7;
        puVar22 = (ulong *)((long)puVar22 - 1);
        puVar27 = puVar27 + 7;
      } while (puVar22 != (ulong *)0x0);
    }
    *(undefined8 **)(unaff_x29 + -0xe0) = puVar6;
    *(ulong **)(unaff_x29 + -0xd8) = unaff_x23;
    unaff_x22 = (uint *)func_0x00704c24(uVar7,0x38);
    func_0x00707e84(unaff_x22,&uStack0000000000000130,unaff_x29 + -0xe0,unaff_x20);
    if (*(char *)(unaff_x19 + 0x58) != '\0') {
      uVar7 = *(undefined8 *)(unaff_x19 + 0xd8);
      unaff_x23 = *(ulong **)(unaff_x29 + -0x98);
      if (unaff_x23 == (ulong *)0x0) {
        unaff_x24 = (undefined8 *)0x0;
      }
      else {
        unaff_x25 = *(ulong *)(unaff_x29 + -0xa0);
        unaff_x26 = **(long **)(unaff_x29 + -0xa8);
        unaff_x24 = (undefined8 *)func_0x00704c24(uVar7,(long)unaff_x23 << 6);
        puVar6 = (undefined8 *)(unaff_x26 + unaff_x25 * 0x40);
        puVar12 = unaff_x24;
        puVar22 = unaff_x23;
        do {
          uVar30 = puVar6[1];
          uVar29 = *puVar6;
          uVar32 = puVar6[3];
          uVar31 = puVar6[2];
          uVar35 = puVar6[4];
          uVar39 = puVar6[7];
          uVar36 = puVar6[6];
          puVar12[5] = puVar6[5];
          puVar12[4] = uVar35;
          puVar12[7] = uVar39;
          puVar12[6] = uVar36;
          puVar12[1] = uVar30;
          *puVar12 = uVar29;
          puVar12[3] = uVar32;
          puVar12[2] = uVar31;
          puVar6 = puVar6 + 8;
          puVar22 = (ulong *)((long)puVar22 - 1);
          puVar12 = puVar12 + 8;
        } while (puVar22 != (ulong *)0x0);
      }
      unaff_x20 = (ulong *)func_0x00704c24(uVar7,0x20);
      func_0x007096dc(unaff_x20,unaff_x24,unaff_x23,unaff_x21);
      lVar8 = *(long *)(unaff_x19 + 0x420);
      unaff_x21 = (ulong *)((ulong)unaff_x22 >> 4);
      if ((ulong)(lVar8 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
        if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (unaff_x22 != *(uint **)(unaff_x19 + 0x430))) {
          uVar25 = 0;
          uVar20 = (ulong)unaff_x21 ^ (ulong)unaff_x22 >> 9;
          do {
            uVar20 = uVar20 & lVar8 - 1U;
            puVar21 = *(uint **)(*(long *)(unaff_x19 + 0x418) + uVar20 * 0x10);
            if (puVar21 == unaff_x22) goto code_r0x0071e41c;
            uVar25 = uVar25 + 1;
            uVar20 = uVar25 + uVar20;
          } while (puVar21 != *(uint **)(unaff_x19 + 0x430) && uVar25 <= lVar8 - 1U);
        }
        func_0x006db93c();
        lVar8 = *(long *)(unaff_x19 + 0x420);
      }
code_r0x0071e41c:
      lVar13 = *(long *)(unaff_x19 + 0x418);
      uVar25 = ((ulong)unaff_x21 ^ (ulong)unaff_x22 >> 9) & lVar8 - 1U;
      puVar21 = *(uint **)(lVar13 + uVar25 * 0x10);
      if (puVar21 != *(uint **)(unaff_x19 + 0x430)) {
        lVar19 = 1;
        do {
          if (puVar21 == unaff_x22) goto code_r0x0071e47c;
          uVar25 = uVar25 + lVar19 & lVar8 - 1U;
          puVar21 = *(uint **)(lVar13 + uVar25 * 0x10);
          lVar19 = lVar19 + 1;
        } while (puVar21 != *(uint **)(unaff_x19 + 0x430));
      }
      *(uint **)(lVar13 + uVar25 * 0x10) = unaff_x22;
      *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
code_r0x0071e47c:
      *(ulong **)(lVar13 + uVar25 * 0x10 + 8) = unaff_x20;
    }
    plVar14 = *(long **)(unaff_x29 + -0xa8);
    lVar8 = *plVar14 + *(long *)(unaff_x29 + -0xa0) * 0x40;
    if (lVar8 != plVar14[1]) {
      plVar14[1] = lVar8;
    }
    plVar14 = *(long **)(unaff_x29 + -0x90);
    lVar8 = *plVar14 + *(long *)(unaff_x29 + -0x88) * 0x38;
    if (lVar8 != plVar14[1]) {
      plVar14[1] = lVar8;
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
      return unaff_x22;
    }
    ___stack_chk_fail();
    plVar14 = *(long **)(unaff_x29 + -0xa8);
    lVar8 = *plVar14 + *(long *)(unaff_x29 + -0xa0) * 0x40;
    if (lVar8 != plVar14[1]) goto code_r0x0071e718;
    plVar14 = *(long **)(unaff_x29 + -0x90);
    lVar8 = *plVar14 + *(long *)(unaff_x29 + -0x88) * 0x38;
    if (lVar8 == plVar14[1]) {
      do {
        __Unwind_Resume();
        plVar14 = extraout_x8;
        lVar8 = extraout_x9;
code_r0x0071e718:
        plVar14[1] = lVar8;
        plVar14 = *(long **)(unaff_x29 + -0x90);
        lVar8 = *plVar14 + *(long *)(unaff_x29 + -0x88) * 0x38;
      } while (lVar8 == plVar14[1]);
    }
    plVar14[1] = lVar8;
    auVar40 = __Unwind_Resume();
  }
  else {
code_r0x0071dd6c:
    if (uVar11 != 0x119) {
      func_0x0072415c();
      unaff_x21 = (ulong *)0x0;
      iVar5 = *(int *)(unaff_x19 + 0x80);
      uVar25 = *(ulong *)(unaff_x19 + 0x8c);
      goto joined_r0x0071e61c;
    }
    puVar22 = *(ulong **)(unaff_x19 + 0x98);
    in_stack_00000138 = unaff_x21[1];
    uStack0000000000000130 = (ulong *)*unaff_x21;
    func_0x00710d48();
    *(ulong *)(unaff_x29 + -0xd8) = in_stack_00000138;
    *(ulong **)(unaff_x29 + -0xe0) = uStack0000000000000130;
    if (*unaff_x22 == 0x3a) {
      func_0x00710d48();
    }
    else {
      func_0x0072447c();
    }
    uVar2 = *(undefined4 *)(unaff_x19 + 0x114);
    in_stack_00000138 = unaff_x21[1];
    uStack0000000000000130 = (ulong *)*unaff_x21;
    if ((*(int *)(unaff_x19 + 0x80) != 0x26) && (*(int *)(unaff_x19 + 0x80) != 0x7c)) {
      func_0x0071f5c8();
      *(undefined4 *)(unaff_x19 + 0x114) = uVar2;
    }
    in_stack_00000148 = func_0x0071cf0c();
    *(undefined4 *)(unaff_x19 + 0x114) = uVar2;
    uVar7 = *(undefined8 *)(unaff_x29 + -0xe0);
    in_stack_00000080[1] = *(undefined8 *)(unaff_x29 + -0xd8);
    *in_stack_00000080 = uVar7;
    uStack0000000000000130 = puVar22;
    uStack0000000000000150 = (int)unaff_x26;
    uStack0000000000000154 = (char)unaff_x25;
    *in_stack_00000078 = *(undefined8 *)(unaff_x29 + -0x78);
    unaff_x24 = &uStack0000000000000130;
    *(undefined8 *)((long)in_stack_00000078 + 7) = in_stack_000001ef;
    in_stack_00000160._4_1_ = (char)unaff_x23;
    auVar40._8_8_ = &uStack0000000000000130;
    auVar40._0_8_ = unaff_x29 + -0x90;
  }
code_r0x0071e744:
  puVar10 = auVar40._8_8_;
  puVar21 = auVar40._0_8_;
  unaff_x29 = auStack_6 + -10;
  puVar22 = *(ulong **)puVar21;
  puVar23 = (ulong *)puVar22[1];
  if (puVar23 < puVar22[2]) {
    uVar20 = puVar10[1];
    uVar25 = *puVar10;
    uVar33 = puVar10[3];
    uVar15 = puVar10[2];
    uVar37 = puVar10[5];
    uVar34 = puVar10[4];
    puVar23[6] = puVar10[6];
    puVar23[3] = uVar33;
    puVar23[2] = uVar15;
    puVar23[5] = uVar37;
    puVar23[4] = uVar34;
    puVar23[1] = uVar20;
    *puVar23 = uVar25;
    puVar10 = puVar23 + 7;
    puVar9 = puVar21;
    goto code_r0x0071e89c;
  }
  puVar26 = (ulong *)*puVar22;
  lVar8 = (long)puVar23 - (long)puVar26 >> 3;
  puVar6 = (undefined8 *)(lVar8 * 0x6db6db6db6db6db7);
  uVar25 = (long)puVar6 + 1;
  lStack_50 = unaff_x26;
  uStack_48 = unaff_x25;
  puStack_40 = unaff_x24;
  puStack_38 = unaff_x23;
  puStack_30 = unaff_x22;
  puStack_28 = unaff_x21;
  puStack_20 = unaff_x20;
  if (uVar25 < 0x492492492492493) {
    lVar13 = (long)(puVar22[2] - (long)puVar26) >> 3;
    uVar20 = lVar13 * -0x2492492492492492;
    if (uVar20 <= uVar25) {
      uVar20 = uVar25;
    }
    if (0x249249249249248 < (ulong)(lVar13 * 0x6db6db6db6db6db7)) {
      uVar20 = 0x492492492492492;
    }
    if (uVar20 == 0) {
      puVar9 = (uint *)0x0;
    }
    else {
      if (0x492492492492492 < uVar20) goto code_r0x0071e8cc;
      puVar9 = (uint *)__Znwm(uVar20 * 0x38);
    }
    puVar16 = (ulong *)(puVar9 + lVar8 * 2);
    uVar25 = *puVar10;
    uVar33 = puVar10[3];
    uVar15 = puVar10[2];
    puVar16[1] = puVar10[1];
    *puVar16 = uVar25;
    puVar16[3] = uVar33;
    puVar16[2] = uVar15;
    uVar25 = puVar10[4];
    puVar16[5] = puVar10[5];
    puVar16[4] = uVar25;
    puVar16[6] = puVar10[6];
    puVar10 = puVar16 + 7;
    if (puVar23 != puVar26) {
      do {
        uVar15 = puVar23[-6];
        uVar25 = puVar23[-7];
        uVar34 = puVar23[-4];
        uVar33 = puVar23[-5];
        uVar38 = puVar23[-2];
        uVar37 = puVar23[-3];
        puVar1 = puVar23 + -1;
        puVar23 = puVar23 + -7;
        puVar16[-1] = *puVar1;
        puVar16[-2] = uVar38;
        puVar16[-3] = uVar37;
        puVar16[-4] = uVar34;
        puVar16[-5] = uVar33;
        puVar16[-6] = uVar15;
        puVar16[-7] = uVar25;
        puVar16 = puVar16 + -7;
      } while (puVar23 != puVar26);
      puVar23 = (ulong *)*puVar22;
    }
    *puVar22 = (ulong)puVar16;
    puVar22[1] = (ulong)puVar10;
    puVar22[2] = (ulong)(puVar9 + uVar20 * 0xe);
    if (puVar23 != (ulong *)0x0) {
      puVar9 = (uint *)__ZdlPv(puVar23);
    }
code_r0x0071e89c:
    puVar22[1] = (ulong)puVar10;
    *(long *)(puVar21 + 4) = *(long *)(puVar21 + 4) + 1;
    return puVar9;
  }
  func_0x00017f90(puVar22);
  uVar20 = unaff_x25;
code_r0x0071e8cc:
  puVar28 = &SUB_0071e8d0;
  auVar41 = func_0x00017514();
  register0x00000008 = (BADSPACEBASE *)&lStack_50;
  unaff_x21 = puVar23;
  unaff_x23 = puVar26;
  unaff_x24 = puVar6;
  unaff_x25 = uVar20;
code_r0x0071e8d0:
  puVar12 = auVar41._8_8_;
  puVar21 = auVar41._0_8_;
  *(long *)((long)register0x00000008 + -0x50) = unaff_x26;
  *(ulong *)((long)register0x00000008 + -0x48) = unaff_x25;
  *(undefined8 **)((long)register0x00000008 + -0x40) = unaff_x24;
  *(ulong **)((long)register0x00000008 + -0x38) = unaff_x23;
  *(long *)((long)register0x00000008 + -0x30) = auVar40._8_8_;
  *(ulong **)((long)register0x00000008 + -0x28) = unaff_x21;
  *(ulong **)((long)register0x00000008 + -0x20) = puVar22;
  *(long *)((long)register0x00000008 + -0x18) = auVar40._0_8_;
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar28;
  puVar22 = *(ulong **)puVar21;
  puVar6 = (undefined8 *)puVar22[1];
  if (puVar6 < (undefined8 *)puVar22[2]) {
    uVar29 = puVar12[1];
    uVar7 = *puVar12;
    uVar31 = puVar12[3];
    uVar30 = puVar12[2];
    uVar32 = puVar12[4];
    uVar36 = puVar12[7];
    uVar35 = puVar12[6];
    puVar6[5] = puVar12[5];
    puVar6[4] = uVar32;
    puVar6[7] = uVar36;
    puVar6[6] = uVar35;
    puVar6[1] = uVar29;
    *puVar6 = uVar7;
    puVar6[3] = uVar31;
    puVar6[2] = uVar30;
    puVar24 = (uint *)(puVar6 + 8);
    puVar9 = puVar21;
  }
  else {
    puVar27 = (undefined8 *)*puVar22;
    lVar8 = (long)puVar6 - (long)puVar27 >> 6;
    uVar25 = lVar8 + 1;
    if (uVar25 >> 0x3a != 0) {
      func_0x00017f90(puVar22);
code_r0x0071e9f8:
      lVar8 = func_0x00017514();
      iVar5 = *(int *)(lVar8 + 0x80);
      uVar25 = 0x100000000;
      if (iVar5 != 0x3b) {
        uVar25 = 0;
      }
      uVar20 = 0x100000000;
      if (iVar5 != 0x2c) {
        uVar20 = uVar25;
      }
      uVar25 = 0;
      if (iVar5 != 0x2c) {
        uVar25 = (ulong)(iVar5 == 0x3b);
      }
      return (uint *)(uVar25 | uVar20);
    }
    uVar15 = (long)puVar22[2] - (long)puVar27;
    uVar20 = (long)uVar15 >> 5;
    if (uVar20 <= uVar25) {
      uVar20 = uVar25;
    }
    if (0x7fffffffffffffbf < uVar15) {
      uVar20 = 0x3ffffffffffffff;
    }
    if (uVar20 == 0) {
      puVar9 = (uint *)0x0;
    }
    else {
      if (uVar20 >> 0x3a != 0) goto code_r0x0071e9f8;
      puVar9 = (uint *)__Znwm(uVar20 << 6);
    }
    puVar18 = puVar9 + lVar8 * 0x10;
    uVar7 = *puVar12;
    uVar30 = puVar12[3];
    uVar29 = puVar12[2];
    *(undefined8 *)(puVar18 + 2) = puVar12[1];
    *(undefined8 *)puVar18 = uVar7;
    *(undefined8 *)(puVar18 + 6) = uVar30;
    *(undefined8 *)(puVar18 + 4) = uVar29;
    uVar7 = puVar12[4];
    uVar30 = puVar12[7];
    uVar29 = puVar12[6];
    *(undefined8 *)(puVar18 + 10) = puVar12[5];
    *(undefined8 *)(puVar18 + 8) = uVar7;
    *(undefined8 *)(puVar18 + 0xe) = uVar30;
    *(undefined8 *)(puVar18 + 0xc) = uVar29;
    puVar24 = puVar18 + 0x10;
    puVar17 = puVar18;
    if (puVar6 != puVar27) {
      do {
        uVar29 = puVar6[-7];
        uVar7 = puVar6[-8];
        uVar31 = puVar6[-5];
        uVar30 = puVar6[-6];
        puVar12 = puVar6 + -3;
        uVar32 = puVar6[-4];
        uVar36 = puVar6[-1];
        uVar35 = puVar6[-2];
        puVar6 = puVar6 + -8;
        *(undefined8 *)(puVar17 + -6) = *puVar12;
        *(undefined8 *)(puVar17 + -8) = uVar32;
        *(undefined8 *)(puVar17 + -2) = uVar36;
        *(undefined8 *)(puVar17 + -4) = uVar35;
        puVar18 = puVar17 + -0x10;
        *(undefined8 *)(puVar17 + -0xe) = uVar29;
        *(undefined8 *)puVar18 = uVar7;
        *(undefined8 *)(puVar17 + -10) = uVar31;
        *(undefined8 *)(puVar17 + -0xc) = uVar30;
        puVar17 = puVar18;
      } while (puVar6 != puVar27);
      puVar6 = (undefined8 *)*puVar22;
    }
    *puVar22 = (ulong)puVar18;
    puVar22[1] = (ulong)puVar24;
    puVar22[2] = (ulong)(puVar9 + uVar20 * 0x10);
    if (puVar6 != (undefined8 *)0x0) {
      puVar9 = (uint *)__ZdlPv(puVar6);
    }
  }
  puVar22[1] = (ulong)puVar24;
  *(long *)(puVar21 + 4) = *(long *)(puVar21 + 4) + 1;
  return puVar9;
}

