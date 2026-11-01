
/* WARNING: Possible PIC construction at 0x007120b0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x007120b4) */

void FUN_00711e10(long param_1)

{
  int iVar1;
  undefined1 *puVar2;
  undefined1 uVar3;
  long lVar4;
  long lVar5;
  long extraout_x1;
  long lVar6;
  ulong in_x9;
  long *plVar7;
  ulong in_x10;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  ulong uVar13;
  long unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  long *unaff_x22;
  long *plVar14;
  long *unaff_x23;
  long lVar15;
  ulong unaff_x24;
  undefined8 uVar16;
  long *unaff_x25;
  undefined8 uVar17;
  undefined8 uVar18;
  long unaff_x26;
  uint uVar19;
  ulong unaff_x28;
  undefined8 uVar20;
  undefined1 *unaff_x29;
  undefined *puVar21;
  long lVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined1 auVar26 [16];
  
  uVar9 = param_1 - (long)unaff_x23 >> 2;
  if (uVar9 <= in_x9) {
    uVar9 = in_x9;
  }
  if (in_x10 <= (ulong)(param_1 - (long)unaff_x23)) {
    uVar9 = 0x1fffffffffffffff;
  }
  if (uVar9 == 0) {
    lVar4 = 0;
  }
  else {
    if (uVar9 >> 0x3d != 0) {
      puVar21 = &DAT_00711f30;
      auVar26 = func_0x00017514();
      lVar4 = auVar26._8_8_;
      plVar7 = auVar26._0_8_;
      puVar2 = (undefined1 *)register0x00000008;
      while( true ) {
        *(ulong *)(puVar2 + -0x60) = unaff_x28;
        *(ulong *)(puVar2 + -0x58) = uVar9;
        *(long *)(puVar2 + -0x50) = unaff_x26;
        *(long **)(puVar2 + -0x48) = unaff_x25;
        *(ulong *)(puVar2 + -0x40) = unaff_x24;
        *(long **)(puVar2 + -0x38) = unaff_x23;
        *(long **)(puVar2 + -0x30) = unaff_x22;
        *(long **)(puVar2 + -0x28) = unaff_x21;
        *(long **)(puVar2 + -0x20) = unaff_x20;
        *(long *)(puVar2 + -0x18) = unaff_x19;
        *(undefined1 **)(puVar2 + -0x10) = unaff_x29;
        *(undefined **)(puVar2 + -8) = puVar21;
        unaff_x29 = puVar2 + -0x10;
        unaff_x23 = (long *)((long)plVar7 + 0x84);
        unaff_x19 = *unaff_x23;
        func_0x00710d48(plVar7,lVar4);
        unaff_x25 = (long *)func_0x007168a8(plVar7,0);
        uVar19 = *(uint *)(plVar7 + 0x10);
        uVar9 = (ulong)uVar19;
        lVar4 = *unaff_x23;
        unaff_x21 = *(long **)((long)plVar7 + 0x8c);
        puVar2[-0x78] = 0;
        puVar2[-0x68] = 0;
        *(long *)(puVar2 + -0xa8) = lVar4;
        if (uVar19 == 0x134) {
          func_0x00710d48(plVar7);
          *(long *)(puVar2 + -0x78) = lVar4;
          *(long **)(puVar2 + -0x70) = unaff_x21;
          puVar2[-0x68] = 1;
        }
        else {
          func_0x0072447c(plVar7,0x134,"if statement");
        }
        unaff_x22 = plVar7 + 0x32;
        lVar4 = plVar7[0x32];
        lVar6 = plVar7[0x33];
        unaff_x26 = func_0x00711360(plVar7);
        lVar22 = plVar7[0x32];
        uVar8 = plVar7[0x33] - lVar22 >> 3;
        unaff_x28 = (ulong)(lVar6 - lVar4) >> 3 & 0xffffffff;
        if (unaff_x28 < uVar8) {
          *(long *)(puVar2 + -0xb0) = unaff_x26;
          do {
            uVar13 = uVar8 - 1;
            uVar17 = *(undefined8 *)(*(long *)(*unaff_x22 + uVar8 * 8 + -8) + 0x18);
            puVar11 = (undefined8 *)func_0x006db828(plVar7 + 0x2d);
            *puVar11 = uVar17;
            uVar8 = uVar13;
          } while (unaff_x28 < uVar13);
          lVar22 = plVar7[0x32];
          uVar8 = plVar7[0x33] - lVar22 >> 3;
          unaff_x26 = *(long *)(puVar2 + -0xb0);
          unaff_x21 = unaff_x25;
        }
        lVar4 = unaff_x28 - uVar8;
        if (unaff_x28 < uVar8 || lVar4 == 0) {
          if (unaff_x28 < uVar8) {
            plVar7[0x33] = lVar22 + unaff_x28 * 8;
          }
        }
        else {
          func_0x006cfeb0(unaff_x22);
          lVar4 = extraout_x1;
        }
        puVar2[-0x90] = 0;
        puVar2[-0x80] = 0;
        if ((int)plVar7[0x10] == 0x126) break;
        if ((int)plVar7[0x10] != 0x127) {
          lVar15 = 0;
          goto code_r0x00712194;
        }
        *(undefined1 *)(unaff_x26 + 0x30) = 1;
        unaff_x24 = (ulong)*(uint *)((long)plVar7 + 0x114);
        uVar19 = *(uint *)((long)plVar7 + 0x114) + 1;
        *(uint *)((long)plVar7 + 0x114) = uVar19;
        if (uRam0000000000a33728 < uVar19) {
          *(char **)(puVar2 + -0xc0) = "elseif";
          lVar4 = func_0x0070f408(unaff_x23,
                                  "Exceeded allowed recursion depth; simplify your %s to make the code compile"
                                 );
          *(ulong *)(puVar2 + -0x120) = unaff_x28;
          *(ulong *)(puVar2 + -0x118) = uVar9;
          *(long *)(puVar2 + -0x110) = unaff_x26;
          *(long **)(puVar2 + -0x108) = unaff_x25;
          *(ulong *)(puVar2 + -0x100) = unaff_x24;
          *(long **)(puVar2 + -0xf8) = unaff_x23;
          *(long **)(puVar2 + -0xf0) = unaff_x22;
          *(long **)(puVar2 + -0xe8) = unaff_x21;
          *(long **)(puVar2 + -0xe0) = plVar7;
          *(long *)(puVar2 + -0xd8) = unaff_x19;
          *(undefined1 **)(puVar2 + -0xd0) = unaff_x29;
          *(undefined **)(puVar2 + -200) = &DAT_00712240;
          uVar16 = *(undefined8 *)(lVar4 + 0x84);
          func_0x00710d48();
          uVar17 = func_0x007168a8(lVar4,0);
          uVar20 = *(undefined8 *)(lVar4 + 0x80);
          uVar23 = *(undefined8 *)(lVar4 + 0x98);
          uVar18 = *(undefined8 *)(lVar4 + 0x90);
          *(undefined8 *)(puVar2 + -0x138) = *(undefined8 *)(lVar4 + 0x88);
          *(undefined8 *)(puVar2 + -0x140) = uVar20;
          *(undefined8 *)(puVar2 + -0x128) = uVar23;
          *(undefined8 *)(puVar2 + -0x130) = uVar18;
          iVar1 = *(int *)(lVar4 + 0x80);
          if (iVar1 == 0x125) {
            func_0x00710d48(lVar4);
          }
          else {
            func_0x0072447c(lVar4,0x125,"while loop");
          }
          *(int *)(*(long *)(lVar4 + 0x150) + -4) = *(int *)(*(long *)(lVar4 + 0x150) + -4) + 1;
          lVar22 = *(long *)(lVar4 + 400);
          lVar15 = *(long *)(lVar4 + 0x198);
          lVar5 = func_0x00711360(lVar4);
          lVar6 = *(long *)(lVar4 + 400);
          uVar9 = *(long *)(lVar4 + 0x198) - lVar6 >> 3;
          uVar8 = (ulong)(lVar15 - lVar22) >> 3 & 0xffffffff;
          if (uVar8 < uVar9) {
            do {
              uVar13 = uVar9 - 1;
              uVar20 = *(undefined8 *)(*(long *)(*(long *)(lVar4 + 400) + uVar9 * 8 + -8) + 0x18);
              puVar11 = (undefined8 *)func_0x006db828(lVar4 + 0x168);
              *puVar11 = uVar20;
              uVar9 = uVar13;
            } while (uVar8 < uVar13);
            lVar6 = *(long *)(lVar4 + 400);
            uVar9 = *(long *)(lVar4 + 0x198) - lVar6 >> 3;
          }
          if (uVar8 < uVar9 || uVar8 - uVar9 == 0) {
            if (uVar8 < uVar9) {
              *(ulong *)(lVar4 + 0x198) = lVar6 + uVar8 * 8;
            }
          }
          else {
            func_0x006cfeb0((long *)(lVar4 + 400),uVar8 - uVar9);
          }
          *(int *)(*(long *)(lVar4 + 0x150) + -4) = *(int *)(*(long *)(lVar4 + 0x150) + -4) + -1;
          uVar18 = *(undefined8 *)(lVar4 + 0x8c);
          *(undefined4 *)(puVar2 + -0x150) = *(undefined4 *)(puVar2 + -0x140);
          *(undefined8 *)(puVar2 + -0x14c) = *(undefined8 *)(puVar2 + -0x13c);
          uVar3 = func_0x00716f30(lVar4,0x128,puVar2 + -0x150);
          *(undefined1 *)(lVar5 + 0x30) = uVar3;
          uVar20 = *(undefined8 *)(lVar4 + 0xd8);
          *(undefined8 *)(puVar2 + -0x150) = uVar16;
          *(undefined8 *)(puVar2 + -0x148) = uVar18;
          uVar16 = func_0x00704c24(uVar20,0x48);
          func_0x00706e70(uVar16,puVar2 + -0x150,uVar17,lVar5,iVar1 == 0x125,
                          (ulong)(puVar2 + -0x140) | 4);
          return;
        }
        lVar22 = *unaff_x23;
        *(undefined8 *)(puVar2 + -0x88) = *(undefined8 *)((long)plVar7 + 0x8c);
        *(long *)(puVar2 + -0x90) = lVar22;
        puVar2[-0x80] = 1;
        puVar21 = &UNK_007120b4;
        puVar2 = puVar2 + -0xc0;
        unaff_x20 = plVar7;
      }
      *(undefined1 *)(unaff_x26 + 0x30) = 1;
      lVar22 = *unaff_x23;
      *(undefined8 *)(puVar2 + -0x88) = *(undefined8 *)((long)plVar7 + 0x8c);
      *(long *)(puVar2 + -0x90) = lVar22;
      puVar2[-0x80] = 1;
      *(undefined8 *)(puVar2 + -0xa8) = *(undefined8 *)((long)plVar7 + 0x84);
      uVar17 = *(undefined8 *)((long)plVar7 + 0x8c);
      func_0x00710d48(plVar7,lVar4);
      lVar4 = plVar7[0x32];
      lVar6 = plVar7[0x33];
      lVar15 = func_0x00711360(plVar7);
      lVar22 = plVar7[0x32];
      uVar9 = plVar7[0x33] - lVar22 >> 3;
      uVar8 = (ulong)(lVar6 - lVar4) >> 3 & 0xffffffff;
      if (uVar8 < uVar9) {
        *(long **)(puVar2 + -0xb0) = unaff_x25;
        do {
          uVar13 = uVar9 - 1;
          uVar16 = *(undefined8 *)(*(long *)(*unaff_x22 + uVar9 * 8 + -8) + 0x18);
          puVar11 = (undefined8 *)func_0x006db828(plVar7 + 0x2d);
          *puVar11 = uVar16;
          uVar9 = uVar13;
        } while (uVar8 < uVar13);
        lVar22 = plVar7[0x32];
        uVar9 = plVar7[0x33] - lVar22 >> 3;
        unaff_x25 = *(long **)(puVar2 + -0xb0);
      }
      if (uVar8 < uVar9 || uVar8 - uVar9 == 0) {
        if (uVar8 < uVar9) {
          plVar7[0x33] = lVar22 + uVar8 * 8;
        }
      }
      else {
        func_0x006cfeb0(unaff_x22,uVar8 - uVar9);
      }
      *(undefined8 *)(lVar15 + 0xc) = uVar17;
      uVar19 = 0x126;
code_r0x00712194:
      uVar17 = *(undefined8 *)((long)plVar7 + 0x8c);
      *(uint *)(puVar2 + -0xa0) = uVar19;
      *(undefined8 *)(puVar2 + -0x9c) = *(undefined8 *)(puVar2 + -0xa8);
      uVar3 = func_0x00716f30(plVar7,0x128,puVar2 + -0xa0);
      if (lVar15 == 0) {
        *(undefined1 *)(unaff_x26 + 0x30) = uVar3;
      }
      else if (*(int *)(lVar15 + 8) == iRam0000000000a27b78) {
        *(undefined1 *)(lVar15 + 0x30) = uVar3;
      }
      lVar4 = plVar7[0x1b];
      *(long *)(puVar2 + -0xa0) = unaff_x19;
      *(undefined8 *)(puVar2 + -0x98) = uVar17;
      uVar17 = func_0x00704c24(lVar4,0x60);
      func_0x00706d94(uVar17,puVar2 + -0xa0,unaff_x25,unaff_x26,lVar15,puVar2 + -0x78,puVar2 + -0x90
                     );
      return;
    }
    lVar4 = __Znwm(uVar9 << 3);
  }
  plVar7 = (long *)(lVar4 + (long)unaff_x25 * 8);
  plVar14 = plVar7 + 1;
  *plVar7 = *unaff_x22;
  if (unaff_x24 - (long)unaff_x23 == 0) goto FUN_00711ee4;
  uVar8 = (unaff_x24 - (long)unaff_x23) - 8;
  if ((uVar8 < 0x58) || ((unaff_x24 - lVar4) - unaff_x26 < 0x40)) {
code_r0x00711ed0:
    do {
      unaff_x21 = unaff_x21 + -1;
      plVar7 = plVar7 + -1;
      *plVar7 = *unaff_x21;
    } while (unaff_x21 != unaff_x23);
  }
  else {
    uVar8 = (uVar8 >> 3) + 1;
    uVar10 = uVar8 & 0x3ffffffffffffff8;
    unaff_x21 = (long *)(unaff_x24 + uVar10 * -8);
    plVar7 = plVar7 + -uVar10;
    puVar11 = (undefined8 *)(unaff_x24 - 0x20);
    puVar12 = (undefined8 *)(lVar4 + (long)unaff_x25 * 8 + -0x20);
    uVar13 = uVar10;
    do {
      uVar20 = *puVar11;
      uVar16 = puVar11[3];
      uVar17 = puVar11[2];
      uVar25 = puVar11[-3];
      uVar24 = puVar11[-4];
      uVar23 = puVar11[-1];
      uVar18 = puVar11[-2];
      puVar12[1] = puVar11[1];
      *puVar12 = uVar20;
      puVar12[3] = uVar16;
      puVar12[2] = uVar17;
      puVar12[-3] = uVar25;
      puVar12[-4] = uVar24;
      puVar12[-1] = uVar23;
      puVar12[-2] = uVar18;
      puVar11 = puVar11 + -8;
      puVar12 = puVar12 + -8;
      uVar13 = uVar13 - 8;
    } while (uVar13 != 0);
    if (uVar8 != uVar10) goto code_r0x00711ed0;
  }
  unaff_x21 = (long *)*unaff_x20;
FUN_00711ee4:
  *unaff_x20 = (long)plVar7;
  unaff_x20[1] = (long)plVar14;
  unaff_x20[2] = lVar4 + uVar9 * 8;
  if (unaff_x21 != (long *)0x0) {
    __ZdlPv(unaff_x21);
  }
  unaff_x20[1] = (long)plVar14;
  *(long *)(unaff_x19 + 0x10) = *(long *)(unaff_x19 + 0x10) + 1;
  return;
}

