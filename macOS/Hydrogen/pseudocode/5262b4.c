
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005262b4(long param_1,long param_2,undefined8 param_3,undefined8 param_4,long param_5)

{
  undefined *puVar1;
  long lVar2;
  long *plVar3;
  undefined1 uVar4;
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  code *pcVar7;
  bool bVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  uint uVar12;
  undefined *puVar13;
  long lVar14;
  uint *puVar15;
  undefined1 *puVar16;
  ulong uVar17;
  undefined8 *puVar18;
  long in_x9;
  undefined8 uVar19;
  ulong uVar20;
  long lVar21;
  long *plVar22;
  long *unaff_x19;
  undefined8 *puVar23;
  ulong uVar24;
  ulong unaff_x23;
  ulong uVar25;
  undefined8 uVar26;
  long unaff_x28;
  long unaff_x29;
  undefined8 uVar27;
  undefined1 auVar28 [16];
  undefined *in_stack_00000200;
  undefined8 in_stack_00000208;
  long in_stack_00000210;
  long in_stack_00000520;
  undefined1 auStack_7ffffffe [2147483646];
  
  if (param_1 != in_x9) {
    uVar19 = *(undefined8 *)(unaff_x28 + 0x1d8);
    uVar24 = *(ulong *)(unaff_x28 + 0x1e0);
    lVar14 = unaff_x19[2];
    if ((ulong)(*unaff_x19 - lVar14) < uVar24) {
      func_0x007a5594();
      lVar14 = unaff_x19[2];
    }
    _memcpy(unaff_x19[1] + lVar14,uVar19,uVar24);
    unaff_x19[2] = lVar14 + uVar24;
    return;
  }
  if (param_5 == 0) {
    if (*(long *)(unaff_x28 + 0xc0) != 0) {
      puVar15 = (uint *)(*(long *)(unaff_x28 + 0xb8) + 0x2c0);
      lVar14 = *(long *)(unaff_x28 + 0xc0) * 0x2c8;
      do {
        if (((*(long *)(puVar15 + -0x22) != 4) || (**(int **)(puVar15 + -0x24) != _UNK_008a4611)) &&
           (((puVar15[-1] | *puVar15) >> 0x17 & 1) == 0)) {
          uVar12 = *(uint *)(unaff_x28 + 700);
          if (((uVar12 >> 0xf & 1) != 0) || (*(char *)(unaff_x28 + 0x2c1) < '\0')) {
            if ((uVar12 >> 9 & 1) == 0) {
              if (((uVar12 >> 0xd & 1) == 0) &&
                 (uVar12 = *(uint *)(unaff_x28 + 0x2c0), (uVar12 >> 9 & 1) != 0))
              goto code_r0x00526754;
code_r0x00526758:
              func_0x005277b0();
              lVar14 = unaff_x19[1];
              auVar28 = func_0x004af770(lVar14,unaff_x19[2]);
              lVar10 = auVar28._8_8_;
              if (lVar10 < 0) {
                uVar19 = 0;
LAB_005273f8:
                auVar28 = func_0x007a1f00(uVar19,lVar10,&UNK_009e95a8);
                goto code_r0x0052740c;
              }
              if (lVar10 == 0) {
                lVar9 = 1;
              }
              else {
                uVar19 = 1;
                lVar9 = func_0x00187bd0(lVar10,1);
                if (lVar9 == 0) goto LAB_005273f8;
              }
              _memcpy(lVar9,auVar28._0_8_,lVar10);
              if (*unaff_x19 != 0) {
                func_0x00187bd4(lVar14,*unaff_x19,1);
              }
              *unaff_x19 = lVar10;
              unaff_x19[1] = lVar9;
              unaff_x19[2] = lVar10;
              *(undefined **)(unaff_x29 + -0xf0) = &UNK_009ea698;
              *(undefined **)(unaff_x29 + -0xe8) = &DAT_00519924;
              in_stack_00000200 = &UNK_007fc120;
              in_stack_00000208 = 1;
              in_stack_00000210 = unaff_x29 + -0xf0;
              func_0x0046849c();
            }
            else {
              if ((uVar12 >> 0xd & 1) != 0) goto code_r0x00526758;
              uVar12 = *(uint *)(unaff_x28 + 0x2c0);
code_r0x00526754:
              if ((uVar12 >> 0xd & 1) != 0) goto code_r0x00526758;
            }
            if (*(long *)(unaff_x28 + 0x110) != -0x8000000000000000) {
              func_0x0045cd08(auStack_7ffffffe + 0x800004c6,unaff_x28 + 0x110);
            }
            if (*(long *)(unaff_x28 + 0x128) != -0x8000000000000000) {
              func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x128);
            }
            if (*(long *)(unaff_x28 + 0x140) != -0x8000000000000000) {
              func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x140);
            }
            if (*(long *)(unaff_x28 + 0x158) != -0x8000000000000000) {
              func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x158);
            }
            if (*(long *)(unaff_x28 + 0x170) != -0x8000000000000000) {
              func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x170);
            }
            if (*(long *)(unaff_x28 + 0x188) != -0x8000000000000000) {
              func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x188);
            }
            if (*(long *)(unaff_x28 + 0x1a0) != -0x8000000000000000) {
              func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x1a0);
            }
            if (*(long *)(unaff_x28 + 0x1b8) != -0x8000000000000000) {
              func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x1b8);
            }
            lVar14 = 0;
            uVar24 = *(ulong *)(unaff_x28 + 0x48);
            auVar5._8_8_ = 0;
            auVar5._0_8_ = uVar24;
            unaff_x23 = uVar24 * 0x18;
            if ((SUB168(auVar5 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < unaff_x23))
            goto LAB_00527360;
            if (unaff_x23 == 0) goto LAB_00526ad8;
            puVar23 = *(undefined8 **)(unaff_x28 + 0x40);
            lVar14 = 8;
            lVar10 = func_0x00187bd0(unaff_x23,8);
            if (lVar10 == 0) goto LAB_00527360;
            if (uVar24 == 0) goto LAB_00526ad8;
            puVar16 = (undefined1 *)(lVar10 + 0x10);
            goto LAB_00526aa8;
          }
          break;
        }
        puVar15 = puVar15 + 0xb2;
        lVar14 = lVar14 + -0x2c8;
      } while (lVar14 != 0);
    }
    func_0x005277b0();
    if (*(long *)(unaff_x28 + 0xc0) != 0) {
      puVar15 = (uint *)(*(long *)(unaff_x28 + 0xb8) + 0x2c0);
      lVar14 = *(long *)(unaff_x28 + 0xc0) * 0x2c8;
      do {
        if (((*(long *)(puVar15 + -0x22) != 4) || (**(int **)(puVar15 + -0x24) != _UNK_008a4611)) &&
           (((puVar15[-1] | *puVar15) >> 0x17 & 1) == 0)) goto LAB_00526468;
        puVar15 = puVar15 + 0xb2;
        lVar14 = lVar14 + -0x2c8;
      } while (lVar14 != 0);
    }
    if (((*(byte *)(unaff_x28 + 0x2bd) >> 2 & 1) == 0) &&
       ((*(byte *)(unaff_x28 + 0x2c1) >> 2 & 1) == 0)) {
      return;
    }
LAB_00526468:
    lVar14 = *(long *)(param_2 + 8);
    *(long *)(unaff_x29 + -0x70) = unaff_x29 + -0x68;
    *(long *)(unaff_x29 + -0x68) = lVar14 + 0x2a;
    *(long *)(unaff_x29 + -0xb8) = lVar14 + 0x38;
    if (*(long *)(unaff_x28 + 0x290) == 0) {
      *(undefined **)(unaff_x29 + -0xa0) = &UNK_008a7b5b;
      *(undefined8 *)(unaff_x29 + -0x98) = 7;
      uVar12 = *(uint *)(unaff_x28 + 700);
    }
    else {
      uVar19 = *(undefined8 *)(unaff_x28 + 0x298);
      *(long *)(unaff_x29 + -0xa0) = *(long *)(unaff_x28 + 0x290);
      *(undefined8 *)(unaff_x29 + -0x98) = uVar19;
      uVar12 = *(uint *)(unaff_x28 + 700);
    }
    if (((uVar12 >> 0xc & 1) != 0) ||
       ((*(uint *)(unaff_x28 + 0x2c0) & 0x3000) != 0 || (uVar12 & 0x2000) != 0)) {
      lVar10 = unaff_x19[1];
      auVar28 = func_0x004af770(lVar10,unaff_x19[2]);
      lVar14 = auVar28._8_8_;
      if (lVar14 < 0) {
        uVar19 = 0;
LAB_0052734c:
        func_0x007a1f00(uVar19,lVar14,&UNK_009e95a8);
LAB_00527360:
        func_0x007a1f00(lVar14,unaff_x23,&UNK_009e7fc8);
        goto LAB_00527418;
      }
      if (lVar14 == 0) {
        lVar9 = 1;
        _memcpy(1,auVar28._0_8_,0);
        lVar11 = *unaff_x19;
      }
      else {
        uVar19 = 1;
        lVar9 = func_0x00187bd0(lVar14,1);
        if (lVar9 == 0) goto LAB_0052734c;
        _memcpy(lVar9,auVar28._0_8_,lVar14);
        lVar11 = *unaff_x19;
      }
      if (lVar11 != 0) {
        func_0x00187bd4(lVar10,lVar11,1);
      }
      *unaff_x19 = lVar14;
      unaff_x19[1] = lVar9;
      unaff_x19[2] = lVar14;
      *(undefined **)(unaff_x29 + -0xf0) = &UNK_009ea698;
      *(undefined **)(unaff_x29 + -0xe8) = &DAT_00519924;
      func_0x0046849c();
      if (((*(byte *)(unaff_x28 + 0x2bd) >> 5 & 1) == 0) &&
         ((*(byte *)(unaff_x28 + 0x2c1) >> 5 & 1) == 0)) {
        func_0x005277b0(param_2);
      }
      else {
        bVar8 = *(long *)(unaff_x28 + 0x128) != -0x8000000000000000;
        lVar14 = 0x230;
        if (bVar8) {
          lVar14 = 0x130;
        }
        lVar10 = 0x238;
        if (bVar8) {
          lVar10 = 0x138;
        }
        if (*(long *)(unaff_x28 + 0x1e8) != -0x8000000000000000) {
          lVar10 = 0x1f8;
          lVar14 = 0x1f0;
        }
        uVar19 = *(undefined8 *)(unaff_x28 + lVar10);
        *(undefined8 *)(unaff_x29 + -0x88) = *(undefined8 *)(unaff_x28 + lVar14);
        *(undefined8 *)(unaff_x29 + -0x80) = uVar19;
        *(long *)(unaff_x29 + -0xf0) = unaff_x29 + -0x70;
        *(undefined **)(unaff_x29 + -0xe8) = &DAT_00524310;
        *(long *)(unaff_x29 + -0xe0) = unaff_x29 + -0x88;
        *(undefined **)(unaff_x29 + -0xd8) = &DAT_00519924;
        func_0x0046849c();
      }
      *(undefined1 **)(unaff_x29 + -0xf0) = auStack_7ffffffe + 0x800004c6;
      *(undefined **)(unaff_x29 + -0xe8) = &DAT_00524310;
      *(long *)(unaff_x29 + -0xe0) = unaff_x29 + -0xa0;
      *(undefined **)(unaff_x29 + -0xd8) = &DAT_00519924;
      goto LAB_00526680;
    }
    if (((*(uint *)(unaff_x28 + 0x2c0) | uVar12) >> 9 & 1) == 0) {
      *(undefined1 **)(unaff_x29 + -0xf0) = auStack_7ffffffe + 0x800004c6;
      *(undefined **)(unaff_x29 + -0xe8) = &DAT_00524310;
      lVar14 = unaff_x29 + -0xa0;
    }
    else {
      *(undefined1 **)(unaff_x29 + -0xf0) = auStack_7ffffffe + 0x800004c6;
      *(undefined **)(unaff_x29 + -0xe8) = &DAT_00524310;
      lVar14 = unaff_x29 + -0xa0;
    }
  }
  else {
    *(long *)(unaff_x29 + -0xa0) = *(long *)(param_2 + 8) + 0x38;
    *(long *)(unaff_x29 + -0xb8) = unaff_x29 + -0xa0;
    func_0x005277b0();
    if (((*(byte *)(unaff_x28 + 0x2bd) >> 1 & 1) == 0) &&
       ((*(byte *)(unaff_x28 + 0x2c1) >> 1 & 1) == 0)) {
      return;
    }
    puVar13 = *(undefined **)(unaff_x28 + 0x290);
    if (puVar13 == (undefined *)0x0) {
      puVar13 = &UNK_008a7b5b;
      uVar19 = 7;
    }
    else {
      uVar19 = *(undefined8 *)(unaff_x28 + 0x298);
    }
    *(undefined **)(unaff_x29 + -0x88) = puVar13;
    *(undefined8 *)(unaff_x29 + -0x80) = uVar19;
    *(long *)(unaff_x29 + -0xf0) = unaff_x29 + -0xb8;
    *(undefined **)(unaff_x29 + -0xe8) = &DAT_00524310;
    lVar14 = unaff_x29 + -0x88;
  }
  *(long *)(unaff_x29 + -0xe0) = lVar14;
  *(undefined **)(unaff_x29 + -0xd8) = &DAT_00519924;
LAB_00526680:
  func_0x0046849c();
  return;
code_r0x0052740c:
  func_0x007a2570(auVar28._0_8_,auVar28._8_8_,&UNK_009e9b68);
  goto LAB_00527418;
  while( true ) {
    uVar19 = *puVar23;
    uVar26 = puVar23[1];
    uVar4 = *(undefined1 *)(puVar23 + 2);
    puVar23 = puVar23 + 3;
    *(undefined8 *)(puVar16 + -0x10) = uVar19;
    *(undefined8 *)(puVar16 + -8) = uVar26;
    *puVar16 = uVar4;
    unaff_x23 = unaff_x23 - 0x18;
    uVar24 = uVar24 - 1;
    puVar16 = puVar16 + 0x18;
    if (uVar24 == 0) break;
LAB_00526aa8:
    if (unaff_x23 == 0) break;
  }
LAB_00526ad8:
  uVar24 = *(ulong *)(unaff_x28 + 0x60) * 8;
  if (*(ulong *)(unaff_x28 + 0x60) >> 0x3d != 0 || 0x7ffffffffffffffc < uVar24) {
    uVar19 = 0;
LAB_005273dc:
    func_0x007a1f00(uVar19,uVar24,&UNK_009e7fe0);
    goto LAB_00527418;
  }
  uVar26 = *(undefined8 *)(unaff_x28 + 0x58);
  if (uVar24 == 0) {
    lVar14 = 4;
  }
  else {
    uVar19 = 4;
    lVar14 = func_0x00187bd0(uVar24,4);
    if (lVar14 == 0) goto LAB_005273dc;
  }
  _memcpy(lVar14,uVar26,uVar24);
  uVar19 = 0;
  uVar25 = *(ulong *)(unaff_x28 + 0x78);
  auVar6._8_8_ = 0;
  auVar6._0_8_ = uVar25;
  uVar24 = uVar25 * 0x18;
  if ((SUB168(auVar6 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar24)) {
LAB_00527378:
    func_0x007a1f00(uVar19,uVar24,&UNK_009e7fc8);
    goto LAB_00527418;
  }
  if (uVar24 != 0) {
    puVar23 = *(undefined8 **)(unaff_x28 + 0x70);
    uVar19 = 8;
    lVar14 = func_0x00187bd0(uVar24,8);
    if (lVar14 == 0) goto LAB_00527378;
    if (uVar25 != 0) {
      puVar16 = (undefined1 *)(lVar14 + 0x10);
      do {
        if (uVar24 == 0) break;
        uVar19 = *puVar23;
        uVar26 = puVar23[1];
        uVar4 = *(undefined1 *)(puVar23 + 2);
        puVar23 = puVar23 + 3;
        *(undefined8 *)(puVar16 + -0x10) = uVar19;
        *(undefined8 *)(puVar16 + -8) = uVar26;
        *puVar16 = uVar4;
        uVar24 = uVar24 - 0x18;
        uVar25 = uVar25 - 1;
        puVar16 = puVar16 + 0x18;
      } while (uVar25 != 0);
    }
  }
  if (*(long *)(unaff_x28 + 0x1d0) != -0x8000000000000000) {
    func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x1d0);
  }
  if (*(long *)(unaff_x28 + 0x1e8) != -0x8000000000000000) {
    func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x1e8);
  }
  if (*(long *)(unaff_x28 + 0x200) != -0x8000000000000000) {
    func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x200);
  }
  if (*(long *)(unaff_x28 + 0x218) != -0x8000000000000000) {
    func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x218);
  }
  func_0x004e2918(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x80,&UNK_009ea9d8);
  uVar19 = 0;
  uVar24 = *(ulong *)(unaff_x28 + 0xa8);
  uVar25 = uVar24 * 0x20;
  if ((uVar24 >> 0x3b != 0) || (0x7ffffffffffffff8 < uVar25)) {
code_r0x00527390:
    func_0x007a1f00(uVar19,uVar25,&UNK_009e7fc8);
    goto LAB_00527418;
  }
  if (uVar25 == 0) {
    lVar14 = 8;
  }
  else {
    lVar10 = *(long *)(unaff_x28 + 0xa0);
    uVar19 = 8;
    lVar14 = func_0x00187bd0(uVar25,8);
    if (lVar14 == 0) goto code_r0x00527390;
    if (uVar24 != 0) {
      uVar17 = 0;
      uVar20 = uVar24;
      do {
        if (uVar25 == uVar17) break;
        puVar23 = (undefined8 *)(lVar10 + uVar17);
        puVar18 = (undefined8 *)(lVar14 + uVar17);
        uVar19 = *puVar23;
        uVar27 = puVar23[3];
        uVar26 = puVar23[2];
        puVar18[1] = puVar23[1];
        *puVar18 = uVar19;
        puVar18[3] = uVar27;
        puVar18[2] = uVar26;
        uVar17 = uVar17 + 0x20;
        uVar20 = uVar20 - 1;
      } while (uVar20 != 0);
    }
  }
  *(undefined8 *)(unaff_x29 + -0xe8) = in_stack_00000208;
  *(undefined **)(unaff_x29 + -0xf0) = in_stack_00000200;
  *(long *)(unaff_x29 + -0xe0) = in_stack_00000210;
  *(ulong *)(unaff_x29 + -0xd8) = uVar24;
  *(long *)(unaff_x29 + -0xd0) = lVar14;
  *(ulong *)(unaff_x29 + -200) = uVar24;
  func_0x004e17b4(unaff_x29 + -0xb8,unaff_x28 + 0xb0,&UNK_009ea9c0);
  auVar28 = func_0x004e4980(unaff_x29 + -0xa0,unaff_x28 + 200,&UNK_009ea9c0);
  uVar24 = *(ulong *)(unaff_x28 + 0x20);
  if (uVar24 == 5) {
    *(undefined8 *)(unaff_x29 + -0x88) = 5;
  }
  else {
    if (3 < uVar24) {
      auVar28 = (**(code **)(*(long *)(unaff_x28 + 0x30) + 0x38))(*(undefined8 *)(unaff_x28 + 0x28))
      ;
    }
    *(ulong *)(unaff_x29 + -0x88) = uVar24;
    *(undefined1 (*) [16])(unaff_x29 + -0x80) = auVar28;
  }
  uVar19 = 0;
  uVar24 = *(ulong *)(unaff_x28 + 0xf0) * 0x10;
  if ((*(ulong *)(unaff_x28 + 0xf0) >> 0x3c == 0) && (uVar24 < 0x7ffffffffffffff9)) {
    uVar26 = *(undefined8 *)(unaff_x28 + 0xe8);
    if (uVar24 == 0) {
      lVar14 = 8;
    }
    else {
      uVar19 = 8;
      lVar14 = func_0x00187bd0(uVar24,8);
      if (lVar14 == 0) goto LAB_005273a8;
    }
    _memcpy(lVar14,uVar26,uVar24);
    uVar19 = 0;
    uVar24 = *(ulong *)(unaff_x28 + 0x108);
    uVar25 = uVar24 * 0x20;
    if ((uVar24 >> 0x3b == 0) && (uVar25 < 0x7ffffffffffffff9)) {
      if (uVar25 == 0) {
LAB_00526f28:
        lVar14 = *(long *)(unaff_x29 + -0xa8);
        func_0x00500404(auStack_7ffffffe + 0x800001fe);
        func_0x005045fc(auStack_7ffffffe + 0x800001fe);
        if (lVar14 != 0) {
          lVar10 = 0;
          lVar14 = in_stack_00000520 + lVar14 * 0x2c8;
          do {
            lVar9 = in_stack_00000520;
            while ((*(char *)(lVar9 + 0x2be) < '\0' || (*(char *)(lVar9 + 0x2c2) < '\0'))) {
              lVar9 = lVar9 + 0x2c8;
              if (lVar9 == lVar14) goto code_r0x005272f8;
            }
            if (lVar10 != 0) {
              func_0x005115a8();
              *(undefined **)(unaff_x29 + -0x88) = &UNK_009ea698;
              *(undefined **)(unaff_x29 + -0x80) = &DAT_00519924;
              *(undefined **)(unaff_x29 + -0xf0) = &UNK_007fc120;
              *(undefined8 *)(unaff_x29 + -0xe8) = 1;
              *(undefined8 *)(unaff_x29 + -0xd8) = 1;
              *(undefined8 *)(unaff_x29 + -0xd0) = 0;
              *(long *)(unaff_x29 + -0xe0) = unaff_x29 + -0x88;
              func_0x0046849c();
            }
            lVar11 = 0;
            lVar10 = lVar10 + 1;
            in_stack_00000520 = lVar9 + 0x2c8;
            lVar21 = *(long *)(lVar9 + 0xf0) << 4;
            uVar24 = 0xffffffffffffffff;
            plVar22 = *(long **)(lVar9 + 0xe8);
            do {
              if (lVar21 == 0) {
                puVar13 = (undefined *)0x0;
                goto code_r0x005272cc;
              }
              lVar2 = *plVar22;
              plVar3 = plVar22 + 1;
              uVar24 = uVar24 + 1;
              lVar11 = lVar11 + 0x20;
              lVar21 = lVar21 + -0x10;
              plVar22 = plVar22 + 2;
            } while (lVar2 != 0x1414db8803bc16e0 || *plVar3 != 0x4f7557bbe08e4383);
            auVar28._8_8_ = *(ulong *)(lVar9 + 0x108);
            auVar28._0_8_ = uVar24;
            if (*(ulong *)(lVar9 + 0x108) <= uVar24) goto code_r0x0052740c;
            lVar11 = *(long *)(lVar9 + 0x100) + lVar11;
            lVar21 = *(long *)(lVar11 + -0x18);
            puVar13 = (undefined *)
                      (*(long *)(lVar11 + -0x20) +
                       (*(long *)(lVar21 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
            auVar28 = (**(code **)(lVar21 + 0x18))(puVar13);
            if (auVar28._0_8_ != 0x1414db8803bc16e0 || auVar28._8_8_ != 0x4f7557bbe08e4383) {
              func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
              goto LAB_00527418;
            }
code_r0x005272cc:
            puVar1 = &UNK_008a7b62;
            if (puVar13 != (undefined *)0x0) {
              puVar1 = puVar13;
            }
            *(long *)(unaff_x29 + -0xf0) = lVar9;
            *(undefined **)(unaff_x29 + -0xe8) = puVar1;
            *(undefined8 *)(unaff_x29 + -0xe0) = 0;
            func_0x00526280(unaff_x29 + -0xf0);
          } while (in_stack_00000520 != lVar14);
        }
code_r0x005272f8:
        func_0x00524d6c(auStack_7ffffffe + 0x800001fe);
        return;
      }
      puVar23 = *(undefined8 **)(unaff_x28 + 0x100);
      uVar19 = 8;
      lVar14 = func_0x00187bd0(uVar25,8);
      if (lVar14 != 0) {
        if (uVar24 != 0) {
          puVar18 = (undefined8 *)(lVar14 + 0x10);
          do {
            if (uVar25 == 0) break;
            plVar22 = (long *)*puVar23;
            lVar14 = *plVar22;
            *plVar22 = lVar14 + 1;
            if (lVar14 < 0) goto LAB_00527418;
            uVar19 = puVar23[1];
            uVar27 = puVar23[3];
            uVar26 = puVar23[2];
            puVar23 = puVar23 + 4;
            puVar18[-2] = plVar22;
            puVar18[-1] = uVar19;
            puVar18[1] = uVar27;
            *puVar18 = uVar26;
            uVar25 = uVar25 - 0x20;
            uVar24 = uVar24 - 1;
            puVar18 = puVar18 + 4;
          } while (uVar24 != 0);
        }
        goto LAB_00526f28;
      }
    }
    func_0x007a1f00(uVar19,uVar25,&UNK_009e7fc8);
  }
  else {
LAB_005273a8:
    func_0x007a1f00(uVar19,uVar24,&UNK_009e7fe0);
  }
LAB_00527418:
                    /* WARNING: Does not return */
  pcVar7 = (code *)SoftwareBreakpoint(1,0x52741c);
  (*pcVar7)();
}

