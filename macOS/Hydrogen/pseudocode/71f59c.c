
/* WARNING: Possible PIC construction at 0x0071ff9c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0071ffa0) */
/* WARNING: Removing unreachable block (ram,0x0071ffc4) */
/* WARNING: Removing unreachable block (ram,0x0071ffa8) */

long * FUN_0071f59c(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  uint uVar1;
  int *piVar2;
  undefined1 *puVar3;
  int iVar4;
  long lVar5;
  long *plVar6;
  long *plVar7;
  undefined1 *puVar8;
  long lVar9;
  undefined8 uVar10;
  ulong uVar11;
  undefined8 *puVar12;
  long lVar13;
  undefined8 *puVar14;
  long lVar15;
  ulong uVar16;
  long *plVar17;
  undefined8 unaff_x19;
  long *unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  undefined8 *unaff_x23;
  ulong unaff_x24;
  undefined8 *unaff_x25;
  ulong unaff_x26;
  long unaff_x27;
  ulong unaff_x28;
  undefined1 *unaff_x29;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined1 auVar25 [16];
  undefined1 auVar26 [16];
  undefined1 uStack0000000000000070;
  long *in_stack_00000088;
  long in_stack_00000090;
  
  func_0x0071ab00(&uStack0000000000000070);
  lVar5 = *in_stack_00000088 + in_stack_00000090 * 8;
  if (lVar5 != in_stack_00000088[1]) {
    in_stack_00000088[1] = lVar5;
  }
  uVar18 = 0x71f5c8;
  auVar25 = __Unwind_Resume();
  puVar3 = (undefined1 *)register0x00000008;
  do {
    lVar5 = auVar25._0_8_;
    *(ulong *)(puVar3 + -0x60) = unaff_x28;
    *(long *)(puVar3 + -0x58) = unaff_x27;
    *(ulong *)(puVar3 + -0x50) = unaff_x26;
    *(undefined8 **)(puVar3 + -0x48) = unaff_x25;
    *(ulong *)(puVar3 + -0x40) = unaff_x24;
    *(undefined8 **)(puVar3 + -0x38) = unaff_x23;
    *(ulong *)(puVar3 + -0x30) = unaff_x22;
    *(ulong *)(puVar3 + -0x28) = unaff_x21;
    *(long **)(puVar3 + -0x20) = unaff_x20;
    *(undefined8 *)(puVar3 + -0x18) = unaff_x19;
    *(undefined1 **)(puVar3 + -0x10) = unaff_x29;
    *(undefined8 *)(puVar3 + -8) = uVar18;
    *(undefined8 *)(puVar3 + -0x78) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
    uVar1 = *(int *)(lVar5 + 0x114) + 1;
    *(uint *)(lVar5 + 0x114) = uVar1;
    if (uRam0000000000a33728 < uVar1) {
      *(char **)(puVar3 + -0x130) = "type annotation";
      auVar26 = func_0x0070f408(lVar5 + 0x84,
                                "Exceeded allowed recursion depth; simplify your %s to make the code compile"
                               );
      plVar6 = unaff_x20;
      goto LAB_0071ff0c;
    }
    uVar18 = *(undefined8 *)(lVar5 + 0x84);
    *(undefined8 *)(puVar3 + -0xa8) = *(undefined8 *)(lVar5 + 0x8c);
    *(undefined8 *)(puVar3 + -0xb0) = uVar18;
    iVar4 = *(int *)(lVar5 + 0x80);
    *(undefined8 *)(puVar3 + -0xc0) = 0;
    *(undefined8 *)(puVar3 + -0xb8) = 0;
    if (iVar4 < 0x10a) {
      if ((iVar4 != 0x28) && (iVar4 != 0x3c)) {
        if (iVar4 == 0x7b) {
          plVar7 = (long *)func_0x0071dad8(lVar5,param_3);
          goto LAB_0071faa0;
        }
        goto LAB_0071f8b4;
      }
      *(undefined8 *)(puVar3 + -0xd8) = 0;
      *(undefined8 *)(puVar3 + -0xd0) = 0;
      auVar26 = func_0x0071ea2c(lVar5,auVar25._8_8_,puVar3 + -0xd8);
code_r0x0071f714:
      plVar6 = auVar26._0_8_;
      goto LAB_0071faa8;
    }
    if (0x2b < iVar4 - 0x10aU) {
LAB_0071f8b4:
      uVar18 = *(undefined8 *)(lVar5 + 0xa8);
      *(undefined8 *)(puVar3 + -0x110) = uVar18;
      *(undefined8 *)(puVar3 + -0x108) = *(undefined8 *)(puVar3 + -0xb0);
      *(undefined8 *)(puVar3 + -0xa0) = uVar18;
      *(undefined8 *)(puVar3 + -0x98) = *(undefined8 *)(puVar3 + -0xa8);
      func_0x0070aa74(puVar3 + -0xd8);
      puVar8 = *(undefined1 **)(puVar3 + -0xd8);
      if (-1 < (char)puVar3[-0xc1]) {
        puVar8 = puVar3 + -0xd8;
      }
      *(undefined1 **)(puVar3 + -0x130) = puVar8;
      plVar6 = (long *)func_0x00721134(lVar5,puVar3 + -0xa0,puVar3 + -0x110,"Expected type, got %s")
      ;
      plVar7 = plVar6;
      if ((char)puVar3[-0xc1] < '\0') {
        plVar7 = (long *)__ZdlPv(*(undefined8 *)(puVar3 + -0xd8));
      }
      goto LAB_0071faa4;
    }
    unaff_x25 = (undefined8 *)(puVar3 + -0xa0);
    switch(iVar4) {
    case 0x10a:
    case 0x10d:
      func_0x0071fff4(lVar5);
      *(undefined8 *)(puVar3 + -0xd8) = 0;
      *(undefined8 *)(puVar3 + -0xd0) = 0;
      plVar7 = (long *)func_0x0071a964(lVar5,puVar3 + -0xb0,puVar3 + -0xd8,
                                       "Interpolated string literals cannot be used as types");
      goto LAB_0071faa0;
    default:
      goto LAB_0071f8b4;
    case 0x116:
    case 0x117:
      if (*(char *)(lVar5 + 0x58) == '\0') {
        unaff_x22 = 0;
        puVar8 = (undefined1 *)0x0;
      }
      else {
        if (iVar4 == 0x116) {
          unaff_x22 = func_0x0070b9b4();
          unaff_x23 = (undefined8 *)((long)&MACH_HEADER.magic + 2);
        }
        else if (iVar4 == 0x117) {
          iVar4 = func_0x0070b9dc();
          unaff_x22 = 0;
          unaff_x23 = (undefined8 *)(ulong)(iVar4 == 1);
        }
        else {
          unaff_x22 = 0;
          unaff_x23 = (undefined8 *)((long)&MACH_HEADER.magic + 3);
        }
        puVar8 = (undefined1 *)0x0;
        if (*(char *)(lVar5 + 0x58) != '\0') {
          puVar8 = puVar3 + -0x110;
        }
      }
      *(undefined8 *)(puVar3 + -0x110) = 0;
      *(undefined8 *)(puVar3 + -0x108) = 0;
      func_0x0071af20(puVar3 + -0xd8,lVar5,puVar8);
      if (puVar3[-200] == '\0') {
        *(undefined8 *)(puVar3 + -0xa0) = 0;
        *(undefined8 *)(puVar3 + -0x98) = 0;
        plVar7 = (long *)func_0x0071a964(lVar5,puVar3 + -0xb0,puVar3 + -0xa0,
                                         "String literal contains malformed escape sequence");
        goto LAB_0071faa0;
      }
      *(undefined8 *)(puVar3 + -0x98) = *(undefined8 *)(puVar3 + -0xd0);
      *unaff_x25 = *(undefined8 *)(puVar3 + -0xd8);
      plVar6 = (long *)func_0x00704c24(*(undefined8 *)(lVar5 + 0xd8),0x30);
      plVar7 = (long *)func_0x00708340(plVar6,puVar3 + -0xb0,puVar3 + -0xa0);
      if (*(char *)(lVar5 + 0x58) != '\0') {
        unaff_x21 = func_0x00704c24(*(undefined8 *)(lVar5 + 0xd8),0x20);
        plVar7 = (long *)func_0x00709774(unaff_x21,*(undefined8 *)(puVar3 + -0x110),
                                         *(undefined8 *)(puVar3 + -0x108),unaff_x23,unaff_x22);
        lVar9 = *(long *)(lVar5 + 0x420);
        unaff_x22 = (ulong)plVar6 >> 4;
        if ((ulong)(lVar9 * 3) >> 2 <= *(ulong *)(lVar5 + 0x428)) {
          plVar7 = (long *)(lVar5 + 0x418);
          if ((*(ulong *)(lVar5 + 0x428) != 0) && (plVar6 != *(long **)(lVar5 + 0x430))) {
            uVar11 = 0;
            uVar16 = unaff_x22 ^ (ulong)plVar6 >> 9;
            do {
              uVar16 = uVar16 & lVar9 - 1U;
              plVar17 = *(long **)(*plVar7 + uVar16 * 0x10);
              if (plVar17 == plVar6) goto code_r0x0071fa18;
              uVar11 = uVar11 + 1;
              uVar16 = uVar11 + uVar16;
            } while (plVar17 != *(long **)(lVar5 + 0x430) && uVar11 <= lVar9 - 1U);
          }
          plVar7 = (long *)func_0x006db93c();
          lVar9 = *(long *)(lVar5 + 0x420);
        }
code_r0x0071fa18:
        lVar13 = *(long *)(lVar5 + 0x418);
        uVar11 = (unaff_x22 ^ (ulong)plVar6 >> 9) & lVar9 - 1U;
        plVar17 = *(long **)(lVar13 + uVar11 * 0x10);
        if (plVar17 != *(long **)(lVar5 + 0x430)) {
          lVar15 = 1;
          do {
            if (plVar17 == plVar6) goto code_r0x0071fa78;
            uVar11 = uVar11 + lVar15 & lVar9 - 1U;
            plVar17 = *(long **)(lVar13 + uVar11 * 0x10);
            lVar15 = lVar15 + 1;
          } while (plVar17 != *(long **)(lVar5 + 0x430));
        }
        *(long **)(lVar13 + uVar11 * 0x10) = plVar6;
        *(long *)(lVar5 + 0x428) = *(long *)(lVar5 + 0x428) + 1;
code_r0x0071fa78:
        *(ulong *)(lVar13 + uVar11 * 0x10 + 8) = unaff_x21;
      }
      break;
    case 0x119:
      piVar2 = (int *)(lVar5 + 0x84);
      unaff_x24 = *(ulong *)(lVar5 + 0x98);
      unaff_x23 = (undefined8 *)(puVar3 + -0xd0);
      uVar18 = *(undefined8 *)piVar2;
      *(undefined8 *)(puVar3 + -200) = *(undefined8 *)(lVar5 + 0x8c);
      *(undefined8 *)(puVar3 + -0xd0) = uVar18;
      func_0x00710d48(lVar5);
      *(ulong *)(puVar3 + -0xd8) = unaff_x24;
      uVar1 = *(uint *)(lVar5 + 0x80);
      unaff_x26 = (ulong)uVar1;
      if (uVar1 == 0x106) {
        func_0x007181dc(lVar5,piVar2,
                        "Unexpected \'...\' after type name; type pack is not allowed in this context"
                       );
        func_0x00710d48(lVar5);
code_r0x0071fb1c:
        unaff_x24 = 0;
code_r0x0071fb20:
        unaff_x21 = 0;
        unaff_x27 = 0;
        unaff_x26 = 0;
        unaff_x22 = 0;
      }
      else {
        if (uVar1 != 0x2e) {
          if (unaff_x24 != 0) {
            iVar4 = _strcmp(unaff_x24,"typeof");
            if (iVar4 == 0) {
              unaff_x21 = *(ulong *)(lVar5 + 0x84);
              func_0x007170a8(lVar5,0x28,"typeof type");
              unaff_x23 = (undefined8 *)func_0x007168a8(lVar5,0);
              unaff_x22 = *(ulong *)(lVar5 + 0x84);
              uVar10 = *(undefined8 *)(lVar5 + 0x8c);
              *(uint *)(puVar3 + -0x110) = uVar1;
              *(ulong *)(puVar3 + -0x10c) = unaff_x21;
              func_0x00718864(lVar5,0x29,puVar3 + -0x110,0);
              uVar18 = *(undefined8 *)(lVar5 + 0xd8);
              *(undefined8 *)(puVar3 + -0x110) = *(undefined8 *)(puVar3 + -0xb0);
              *(undefined8 *)(puVar3 + -0x108) = uVar10;
              plVar6 = (long *)func_0x00704c24(uVar18,0x28);
              plVar7 = (long *)func_0x007080dc(plVar6,puVar3 + -0x110,unaff_x23);
              if (*(char *)(lVar5 + 0x58) != '\0') {
                unaff_x23 = (undefined8 *)func_0x00704c24(*(undefined8 *)(lVar5 + 0xd8),0x14);
                func_0x00709724(unaff_x23,unaff_x21,unaff_x22);
                *(long **)(puVar3 + -0x110) = plVar6;
                plVar7 = (long *)func_0x006db828(lVar5 + 0x418,puVar3 + -0x110);
                *plVar7 = (long)unaff_x23;
              }
              break;
            }
            goto code_r0x0071fb1c;
          }
          goto code_r0x0071fb20;
        }
        unaff_x21 = *(ulong *)(lVar5 + 0x84);
        func_0x00710d48(lVar5);
        unaff_x26 = (ulong)(byte)puVar3[-0xd0];
        *(undefined8 *)(puVar3 + -0x88) = *(undefined8 *)(puVar3 + -0xcf);
        *(undefined8 *)(puVar3 + -0x81) = *(undefined8 *)(puVar3 + -200);
        if (*(int *)(lVar5 + 0x80) == 0x119) {
          uVar18 = *(undefined8 *)(lVar5 + 0x98);
          uVar10 = *(undefined8 *)piVar2;
          *(undefined8 *)(puVar3 + -200) = *(undefined8 *)(lVar5 + 0x8c);
          *unaff_x23 = uVar10;
          func_0x00710d48(lVar5);
          *(undefined8 *)(puVar3 + -0xd8) = uVar18;
code_r0x0071f7b8:
          unaff_x22 = 1;
          unaff_x27 = 1;
        }
        else {
          func_0x0072415c(lVar5,"field name");
          if ((*(int *)(lVar5 + 0x80) - 0x123U < 0x15) && (*piVar2 == (int)unaff_x21)) {
            *(undefined8 *)(puVar3 + -0xd8) = *(undefined8 *)(lVar5 + 0x98);
            uVar18 = *(undefined8 *)piVar2;
            *(undefined8 *)(puVar3 + -200) = *(undefined8 *)(lVar5 + 0x8c);
            *unaff_x23 = uVar18;
            func_0x00710d48(lVar5);
            goto code_r0x0071f7b8;
          }
          uVar18 = *(undefined8 *)(lVar5 + 0x84);
          *(undefined8 *)(puVar3 + -0xd8) = *(undefined8 *)(lVar5 + 0x128);
          *(undefined8 *)(puVar3 + -0xd0) = uVar18;
          *(undefined8 *)(puVar3 + -200) = uVar18;
          unaff_x27 = 1;
          unaff_x22 = 1;
        }
      }
      *(undefined8 *)(puVar3 + -0xf0) = 0;
      *(undefined8 *)(puVar3 + -0xe8) = 0;
      *(undefined8 *)(puVar3 + -0xf8) = 0;
      lVar9 = *(long *)(lVar5 + 0x3d8);
      lVar13 = *(long *)(lVar5 + 0x3d0);
      *(long *)(puVar3 + -0x110) = lVar5 + 0x3d0;
      *(long *)(puVar3 + -0x108) = lVar9 - lVar13 >> 3;
      *(undefined8 *)(puVar3 + -0x100) = 0;
      *(undefined8 *)(puVar3 + -0x118) = 0;
      uVar1 = *(uint *)(lVar5 + 0x80);
      unaff_x28 = (ulong)uVar1;
      if (uVar1 == 0x3c) {
        if (*(char *)(lVar5 + 0x58) == '\0') {
          auVar25 = func_0x00720d9c(lVar5,0,0,0);
        }
        else {
          auVar25 = func_0x00720d9c(lVar5,puVar3 + -0xf8,puVar3 + -0x110,puVar3 + -0x118);
        }
        *(undefined1 (*) [16])(puVar3 + -0xf0) = auVar25;
      }
      uVar10 = *(undefined8 *)(lVar5 + 0xa8);
      uVar18 = *(undefined8 *)(lVar5 + 0xd8);
      *(undefined8 *)(puVar3 + -0x128) = *(undefined8 *)(puVar3 + -0xb0);
      *(undefined8 *)(puVar3 + -0x120) = uVar10;
      plVar6 = (long *)func_0x00704c24(uVar18,0x70);
      puVar3[-0xa0] = (char)unaff_x26;
      *(undefined8 *)(puVar3 + -0x9f) = *(undefined8 *)(puVar3 + -0x88);
      *(undefined8 *)(puVar3 + -0x98) = *(undefined8 *)(puVar3 + -0x81);
      puVar3[-0x90] = (char)unaff_x27;
      *(undefined2 *)(puVar3 + -0x8f) = *(undefined2 *)(puVar3 + -0xdb);
      puVar3[-0x8d] = puVar3[-0xd9];
      *(undefined1 **)(puVar3 + -0x130) = puVar3 + -0xf0;
      plVar7 = (long *)func_0x00707d58(plVar6,puVar3 + -0x128,unaff_x24,unaff_x22,
                                       *(undefined8 *)(puVar3 + -0xd8),puVar3 + -0xa0,unaff_x23,
                                       uVar1 == 0x3c);
      if (*(char *)(lVar5 + 0x58) != '\0') {
        uVar18 = *(undefined8 *)(lVar5 + 0xd8);
        unaff_x24 = *(ulong *)(puVar3 + -0x100);
        if (unaff_x24 == 0) {
          unaff_x25 = (undefined8 *)0x0;
        }
        else {
          unaff_x26 = *(ulong *)(puVar3 + -0x108);
          unaff_x27 = **(long **)(puVar3 + -0x110);
          unaff_x25 = (undefined8 *)func_0x00704c24(uVar18,unaff_x24 << 3);
          if ((unaff_x24 < 8) ||
             ((undefined1 *)((long)unaff_x25 + (unaff_x26 * -8 - unaff_x27)) < (undefined1 *)0x40))
          {
            uVar11 = 0;
          }
          else {
            uVar11 = unaff_x24 & 0xfffffffffffffff8;
            puVar12 = unaff_x25 + 4;
            puVar14 = (undefined8 *)(unaff_x26 * 8 + unaff_x27 + 0x20);
            uVar16 = uVar11;
            do {
              uVar10 = puVar14[-4];
              uVar20 = puVar14[-1];
              uVar19 = puVar14[-2];
              uVar22 = puVar14[1];
              uVar21 = *puVar14;
              uVar24 = puVar14[3];
              uVar23 = puVar14[2];
              puVar12[-3] = puVar14[-3];
              puVar12[-4] = uVar10;
              puVar12[-1] = uVar20;
              puVar12[-2] = uVar19;
              puVar12[1] = uVar22;
              *puVar12 = uVar21;
              puVar12[3] = uVar24;
              puVar12[2] = uVar23;
              uVar16 = uVar16 - 8;
              puVar12 = puVar12 + 8;
              puVar14 = puVar14 + 8;
            } while (uVar16 != 0);
            if (unaff_x24 == uVar11) goto code_r0x0071fc88;
          }
          lVar9 = unaff_x24 - uVar11;
          puVar12 = (undefined8 *)(unaff_x27 + uVar11 * 8 + unaff_x26 * 8);
          puVar14 = unaff_x25 + uVar11;
          do {
            *puVar14 = *puVar12;
            lVar9 = lVar9 + -1;
            puVar12 = puVar12 + 1;
            puVar14 = puVar14 + 1;
          } while (lVar9 != 0);
        }
code_r0x0071fc88:
        unaff_x23 = (undefined8 *)func_0x00704c24(uVar18,0x30);
        plVar7 = (long *)func_0x007096bc(unaff_x23,unaff_x21,unaff_x22,
                                         *(undefined8 *)(puVar3 + -0xf8),unaff_x25,unaff_x24,
                                         *(undefined8 *)(puVar3 + -0x118));
        lVar9 = *(long *)(lVar5 + 0x420);
        unaff_x21 = (ulong)plVar6 >> 4;
        if ((ulong)(lVar9 * 3) >> 2 <= *(ulong *)(lVar5 + 0x428)) {
          plVar7 = (long *)(lVar5 + 0x418);
          if ((*(ulong *)(lVar5 + 0x428) != 0) && (plVar6 != *(long **)(lVar5 + 0x430))) {
            uVar11 = 0;
            uVar16 = unaff_x21 ^ (ulong)plVar6 >> 9;
            do {
              uVar16 = uVar16 & lVar9 - 1U;
              plVar17 = *(long **)(*plVar7 + uVar16 * 0x10);
              if (plVar17 == plVar6) goto code_r0x0071fd20;
              uVar11 = uVar11 + 1;
              uVar16 = uVar11 + uVar16;
            } while (plVar17 != *(long **)(lVar5 + 0x430) && uVar11 <= lVar9 - 1U);
          }
          plVar7 = (long *)func_0x006db93c();
          lVar9 = *(long *)(lVar5 + 0x420);
        }
code_r0x0071fd20:
        lVar13 = *(long *)(lVar5 + 0x418);
        uVar11 = (unaff_x21 ^ (ulong)plVar6 >> 9) & lVar9 - 1U;
        plVar17 = *(long **)(lVar13 + uVar11 * 0x10);
        if (plVar17 != *(long **)(lVar5 + 0x430)) {
          lVar15 = 1;
          do {
            if (plVar17 == plVar6) goto code_r0x0071fd80;
            uVar11 = uVar11 + lVar15 & lVar9 - 1U;
            plVar17 = *(long **)(lVar13 + uVar11 * 0x10);
            lVar15 = lVar15 + 1;
          } while (plVar17 != *(long **)(lVar5 + 0x430));
        }
        *(long **)(lVar13 + uVar11 * 0x10) = plVar6;
        *(long *)(lVar5 + 0x428) = *(long *)(lVar5 + 0x428) + 1;
code_r0x0071fd80:
        *(undefined8 **)(lVar13 + uVar11 * 0x10 + 8) = unaff_x23;
      }
      plVar17 = *(long **)(puVar3 + -0x110);
      if (*plVar17 + *(long *)(puVar3 + -0x108) * 8 != plVar17[1]) {
        plVar17[1] = *plVar17 + *(long *)(puVar3 + -0x108) * 8;
      }
      break;
    case 0x11c:
    case 0x11d:
      if ((param_3 & 1) != 0) {
        auVar26 = func_0x007188d4(lVar5);
        *(undefined1 (*) [16])(puVar3 + -0xc0) = auVar26;
        auVar26 = func_0x0071ea2c(lVar5,auVar25._8_8_,puVar3 + -0xc0);
        goto code_r0x0071f714;
      }
      *(undefined8 *)(puVar3 + -0xd8) = 0;
      *(undefined8 *)(puVar3 + -0xd0) = 0;
      plVar7 = (long *)func_0x0071a964(lVar5,puVar3 + -0xb0,puVar3 + -0xd8,
                                       "attributes are not allowed in declaration context");
      goto LAB_0071faa0;
    case 0x11e:
      func_0x00710d48(lVar5);
      *(undefined8 *)(puVar3 + -0xd8) = 0;
      *(undefined8 *)(puVar3 + -0xd0) = 0;
      plVar7 = (long *)func_0x0071a964(lVar5,puVar3 + -0xb0,puVar3 + -0xd8,
                                       "Malformed string; did you forget to finish it?");
      goto LAB_0071faa0;
    case 0x129:
      func_0x00710d48(lVar5);
      plVar6 = (long *)func_0x00704c24(*(undefined8 *)(lVar5 + 0xd8),0x20);
      plVar7 = (long *)func_0x007082f4(plVar6,puVar3 + -0xb0,0);
      break;
    case 299:
      func_0x00710d48(lVar5);
      *(undefined8 *)(puVar3 + -0xd8) = 0;
      *(undefined8 *)(puVar3 + -0xd0) = 0;
      plVar7 = (long *)func_0x0071a964(lVar5,puVar3 + -0xb0,puVar3 + -0xd8,
                                       "Using \'function\' as a type annotation is not supported, consider replacing with a function type annotation e.g. \'(...any) -> ...any\'"
                                      );
LAB_0071faa0:
      plVar6 = plVar7;
      break;
    case 0x12f:
      func_0x00710d48(lVar5);
      plVar6 = (long *)func_0x00704c24(*(undefined8 *)(lVar5 + 0xd8),0x70);
      uVar18 = *(undefined8 *)(lVar5 + 0x130);
      puVar3[-0xd8] = 0;
      puVar3[-200] = 0;
      *(undefined8 *)(puVar3 + -0x110) = 0;
      *(undefined8 *)(puVar3 + -0x108) = 0;
      *(undefined1 **)(puVar3 + -0x130) = puVar3 + -0x110;
      plVar7 = (long *)func_0x00707d58(plVar6,puVar3 + -0xb0,0,0,uVar18,puVar3 + -0xd8,
                                       puVar3 + -0xb0,0);
      break;
    case 0x135:
      func_0x00710d48(lVar5);
      plVar6 = (long *)func_0x00704c24(*(undefined8 *)(lVar5 + 0xd8),0x20);
      plVar7 = (long *)func_0x007082f4(plVar6,puVar3 + -0xb0,1);
    }
LAB_0071faa4:
    auVar26._8_8_ = 0;
    auVar26._0_8_ = plVar7;
LAB_0071faa8:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(puVar3 + -0x78)) {
      return plVar6;
    }
LAB_0071ff0c:
    unaff_x19 = ___stack_chk_fail(auVar26._0_8_,auVar26._8_8_);
    plVar7 = *(long **)(puVar3 + -0x110);
    if (*plVar7 + *(long *)(puVar3 + -0x108) * 8 != plVar7[1]) {
      plVar7[1] = *plVar7 + *(long *)(puVar3 + -0x108) * 8;
      unaff_x19 = __Unwind_Resume(unaff_x19);
    }
    unaff_x20 = (long *)__Unwind_Resume(unaff_x19);
    *(ulong *)(puVar3 + -0x160) = unaff_x22;
    *(ulong *)(puVar3 + -0x158) = unaff_x21;
    *(long **)(puVar3 + -0x150) = plVar6;
    *(undefined8 *)(puVar3 + -0x148) = unaff_x19;
    *(undefined1 **)(puVar3 + -0x140) = puVar3 + -0x10;
    *(undefined8 *)(puVar3 + -0x138) = 0x71ff70;
    unaff_x29 = puVar3 + -0x140;
    unaff_x21 = (ulong)*(uint *)((long)unaff_x20 + 0x114);
    uVar18 = *(undefined8 *)((long)unaff_x20 + 0x84);
    *(undefined8 *)(puVar3 + -0x168) = *(undefined8 *)((long)unaff_x20 + 0x8c);
    *(undefined8 *)(puVar3 + -0x170) = uVar18;
    auVar25._8_8_ = 1;
    auVar25._0_8_ = unaff_x20;
    param_3 = 0;
    uVar18 = 0x71ffa0;
    puVar3 = puVar3 + -0x170;
  } while( true );
}

