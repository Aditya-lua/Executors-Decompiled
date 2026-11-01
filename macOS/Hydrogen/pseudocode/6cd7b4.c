
void FUN_006cd7b4(void)

{
  undefined8 *puVar1;
  code *pcVar2;
  int iVar3;
  long lVar4;
  ulong *puVar5;
  undefined8 uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong *puVar9;
  long *plVar10;
  byte bVar11;
  byte bVar12;
  long in_x10;
  ulong uVar13;
  long lVar14;
  long lVar15;
  bool bVar16;
  long lVar17;
  ulong uVar18;
  undefined8 *unaff_x19;
  undefined4 unaff_w21;
  long lVar19;
  int unaff_w22;
  undefined8 *puVar20;
  int unaff_w23;
  ulong *unaff_x24;
  ulong *puVar21;
  ulong uVar22;
  int unaff_w26;
  ulong unaff_x27;
  ulong unaff_x28;
  long unaff_x29;
  ulong uVar23;
  ulong uVar24;
  int in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  undefined8 in_stack_00000038;
  int iStack0000000000000040;
  undefined4 uStack0000000000000044;
  long in_stack_00000048;
  long in_stack_00000050;
  undefined8 uStack0000000000000058;
  ulong *puStack0000000000000060;
  ulong *in_stack_00000068;
  undefined8 uStack0000000000000070;
  ulong in_stack_00000078;
  undefined2 in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  undefined8 in_stack_00000098;
  
code_r0x006cd7b4:
  *unaff_x24 = unaff_x27;
  *(char *)(unaff_x24 + 1) = (char)unaff_w26;
  unaff_x24[2] = 0;
  unaff_x24[3] = 0;
  *(undefined4 *)(unaff_x24 + 5) = unaff_w21;
  unaff_x24[6] = 0;
  puVar9 = unaff_x24;
  while( true ) {
    puVar21 = uStack0000000000000058;
    unaff_x24 = puVar9 + 7;
    unaff_x28 = unaff_x28 + 1;
    uVar22 = *(ulong *)(in_stack_00000048 + 0x60);
    puStack0000000000000060 = unaff_x24;
    if (uVar22 <= unaff_x28) break;
    unaff_x27 = *(ulong *)(*(long *)(in_stack_00000048 + 0x58) + unaff_x28 * 8);
    unaff_w26 = ((int)unaff_x28 - unaff_w23) + unaff_w22;
    if (unaff_x24 < in_stack_00000068) goto code_r0x006cd7b4;
    lVar19 = ((long)unaff_x24 - (long)uStack0000000000000058 >> 3) * in_x10;
    uVar22 = lVar19 + 1;
    if (0x492492492492492 < uVar22) {
      func_0x00017f90(&uStack0000000000000058);
      goto code_r0x006ce104;
    }
    uVar8 = ((long)in_stack_00000068 - (long)uStack0000000000000058 >> 3) * in_x10;
    uVar13 = uVar8 * 2;
    if (uVar13 <= uVar22) {
      uVar13 = uVar22;
    }
    if (0x249249249249248 < uVar8) {
      uVar13 = 0x492492492492492;
    }
    if (uVar13 == 0) {
      lVar4 = 0;
    }
    else {
      if (0x492492492492492 < uVar13) {
        func_0x00017514();
        goto code_r0x006ce104;
      }
      lVar4 = __Znwm(uVar13 * 0x38);
    }
    puVar9 = (ulong *)(lVar4 + lVar19 * 0x38);
    *puVar9 = unaff_x27;
    *(char *)(puVar9 + 1) = (char)unaff_w26;
    puVar9[2] = 0;
    puVar9[3] = 0;
    *(undefined4 *)(puVar9 + 5) = unaff_w21;
    puVar9[6] = 0;
    uStack0000000000000058 = puVar9;
    puVar5 = unaff_x24;
    for (; unaff_x24 != puVar21; unaff_x24 = unaff_x24 + -7) {
      uVar8 = unaff_x24[-6];
      uVar22 = unaff_x24[-7];
      uVar7 = unaff_x24[-4];
      uVar18 = unaff_x24[-5];
      uVar24 = unaff_x24[-2];
      uVar23 = unaff_x24[-3];
      uStack0000000000000058[-1] = unaff_x24[-1];
      uStack0000000000000058[-2] = uVar24;
      uStack0000000000000058[-3] = uVar23;
      uStack0000000000000058[-4] = uVar7;
      uStack0000000000000058[-5] = uVar18;
      uStack0000000000000058[-6] = uVar8;
      uStack0000000000000058[-7] = uVar22;
      uStack0000000000000058 = uStack0000000000000058 + -7;
      puVar5 = puVar21;
    }
    in_stack_00000068 = (ulong *)(lVar4 + uVar13 * 0x38);
    if (puVar5 != (ulong *)0x0) {
      __ZdlPv(puVar5);
    }
    in_x10 = 0x6db6db6db6db6db7;
    unaff_w22 = in_stack_00000020;
  }
  if (uVar22 < *(ulong *)(in_stack_00000050 + 0x40)) {
    do {
      func_0x006c27d4();
      uVar22 = uVar22 + 1;
    } while (uVar22 < *(ulong *)(in_stack_00000050 + 0x40));
  }
  puVar9 = puStack0000000000000060;
  if (uStack0000000000000058 != puStack0000000000000060) {
    puVar21 = uStack0000000000000058;
    do {
      if ((int)puVar21[2] == 0) {
        func_0x006bea90();
        if ((puVar21[6] != 0) && (unaff_x19[0x1d] != 0)) {
          uVar22 = *puVar21;
          if (uVar22 != unaff_x19[0x1e]) {
            uVar13 = 0;
            uVar8 = uVar22 >> 4 ^ uVar22 >> 9;
            do {
              uVar8 = uVar8 & unaff_x19[0x1c] - 1;
              uVar18 = *(ulong *)(unaff_x19[0x1b] + uVar8 * 0x18);
              if (uVar18 == uVar22) {
                *(ulong *)(unaff_x19[0x1b] + uVar8 * 0x18 + 8) = puVar21[6];
                break;
              }
              uVar13 = uVar13 + 1;
              uVar8 = uVar13 + uVar8;
            } while (uVar18 != unaff_x19[0x1e] && uVar13 <= unaff_x19[0x1c] - 1);
          }
        }
      }
      else {
        puVar5 = (ulong *)func_0x006ce3fc(unaff_x19 + 0x25,puVar21);
        uVar13 = puVar21[3];
        uVar22 = puVar21[2];
        puVar5[2] = puVar21[4];
        puVar5[1] = uVar13;
        *puVar5 = uVar22;
      }
      puVar21 = puVar21 + 7;
    } while (puVar21 != puVar9);
  }
  uVar22 = in_stack_00000030 - in_stack_00000028 >> 3;
  uStack0000000000000070 = in_stack_00000048;
  in_stack_00000080 =
       CONCAT11((char)((ulong)in_stack_00000038 >> 0x20),(char)_iStack0000000000000040);
  in_stack_00000090 = 0;
  in_stack_00000098 = 0;
  in_stack_00000088 = 0;
  plVar10 = (long *)unaff_x19[0xa1];
  in_stack_00000078 = uVar22;
  if (plVar10 < (long *)unaff_x19[0xa2]) {
    *(undefined2 *)(plVar10 + 2) = in_stack_00000080;
    plVar10[1] = uVar22;
    *plVar10 = in_stack_00000048;
    plVar10[4] = 0;
    plVar10[5] = 0;
    plVar10[3] = 0;
    plVar10[4] = 0;
    plVar10[3] = 0;
    plVar10[5] = 0;
    unaff_x19[0xa1] = plVar10 + 6;
  }
  else {
    uVar6 = func_0x006ce644(unaff_x19 + 0xa0,&uStack0000000000000070);
    unaff_x19[0xa1] = uVar6;
    if (in_stack_00000088 != 0) {
      in_stack_00000090 = in_stack_00000088;
      __ZdlPv();
    }
  }
  func_0x006d621c(unaff_x19 + 0x20,unaff_x19 + 0x1b,unaff_x19 + 0x25,unaff_x19[0x8f],
                  *(undefined1 *)(unaff_x19 + 0x90),unaff_x19[10],
                  *(undefined8 *)(in_stack_00000048 + 0x90),unaff_x19[0x8e]);
  lVar19 = *(long *)(in_stack_00000048 + 0x90);
  if (cRam0000000000a33610 == '\0') {
    if (*(long *)(lVar19 + 0x28) != 0) {
      uVar13 = 0;
      do {
        lVar19 = *(long *)(*(long *)(lVar19 + 0x20) + uVar13 * 8);
        if (lVar19 != 0 && *(int *)(lVar19 + 8) == iRam0000000000a27bd8) {
          func_0x006c0ef4();
          goto LAB_006cde28;
        }
        func_0x006bed0c();
        uVar13 = uVar13 + 1;
        lVar19 = *(long *)(in_stack_00000048 + 0x90);
      } while (uVar13 < *(ulong *)(lVar19 + 0x28));
    }
    uVar13 = func_0x006bf528();
    if ((uVar13 & 1) == 0) {
      if (in_stack_00000038._4_4_ != 0) {
        uVar13 = 0;
        do {
          func_0x006b1ccc(*unaff_x19,2,(int)uVar13 + iStack0000000000000040 & 0xff,0,0);
          uVar13 = uVar13 + 1;
        } while (in_stack_00000038._4_4_ != uVar13);
      }
      uVar13 = (long)(unaff_x19[0x95] - unaff_x19[0x94]) >> 3;
      if ((uVar22 < uVar13) && (unaff_x19[0x13] != 0)) {
        bVar16 = false;
        bVar11 = 0xff;
LAB_006cdd1c:
        do {
          uVar8 = *(ulong *)(unaff_x19[0x94] + uVar22 * 8);
          if (uVar8 != unaff_x19[0x14]) {
            uVar18 = 0;
            uVar7 = uVar8 >> 4 ^ uVar8 >> 9;
            while( true ) {
              uVar7 = uVar7 & unaff_x19[0x12] - 1;
              puVar9 = (ulong *)(unaff_x19[0x11] + uVar7 * 0x18);
              if (*puVar9 == uVar8) goto LAB_006cdd6c;
              if (*puVar9 == unaff_x19[0x14]) break;
              uVar18 = uVar18 + 1;
              uVar7 = uVar18 + uVar7;
              if (unaff_x19[0x12] - 1 < uVar18) break;
            }
          }
          puVar9 = (ulong *)0x0;
LAB_006cdd6c:
          puVar21 = (ulong *)0x0;
          if (puVar9 != (ulong *)0x0) {
            puVar21 = puVar9 + 1;
          }
          if (*(byte *)((long)puVar21 + 2) == 0) {
            uVar22 = uVar22 + 1;
            if (uVar22 == uVar13) {
              bVar12 = bVar11;
              if (!bVar16) goto LAB_006cde28;
              break;
            }
            goto LAB_006cdd1c;
          }
          bVar12 = (byte)*puVar21;
          if (bVar11 <= (byte)*puVar21) {
            bVar12 = bVar11;
          }
          uVar22 = uVar22 + 1;
          bVar16 = true;
          bVar11 = bVar12;
        } while (uVar22 != uVar13);
        func_0x006b1ccc(*unaff_x19,0xb,bVar12,0,0);
      }
    }
  }
  else {
    if (*(long *)(lVar19 + 0x28) != 0) {
      uVar13 = 0;
      do {
        func_0x006bed0c();
        iVar3 = func_0x006bf528();
        if (iVar3 != 0) {
          lVar19 = unaff_x19[0xa1];
          if ((*(long *)(lVar19 + -0x18) != *(long *)(lVar19 + -0x10)) &&
             (lVar14 = *(long *)(*(long *)(lVar19 + -0x10) + -8),
             lVar4 = func_0x006b2784(*unaff_x19), lVar14 == lVar4 + -1)) {
            func_0x006b2768(*unaff_x19,0x17);
            *(long *)(lVar19 + -0x10) = *(long *)(lVar19 + -0x10) + -8;
          }
          goto LAB_006cde28;
        }
        uVar13 = uVar13 + 1;
      } while (uVar13 < *(ulong *)(*(long *)(in_stack_00000048 + 0x90) + 0x28));
    }
    if (in_stack_00000038._4_4_ != 0) {
      uVar13 = 0;
      do {
        func_0x006b1ccc(*unaff_x19,2,(int)uVar13 + iStack0000000000000040 & 0xff,0,0);
        uVar13 = uVar13 + 1;
      } while (in_stack_00000038._4_4_ != uVar13);
    }
    uVar13 = (long)(unaff_x19[0x95] - unaff_x19[0x94]) >> 3;
    if ((uVar13 <= uVar22) || (unaff_x19[0x13] == 0)) goto LAB_006cde28;
    bVar16 = false;
    bVar11 = 0xff;
LAB_006cdbcc:
    do {
      uVar8 = *(ulong *)(unaff_x19[0x94] + uVar22 * 8);
      if (uVar8 != unaff_x19[0x14]) {
        uVar18 = 0;
        uVar7 = uVar8 >> 4 ^ uVar8 >> 9;
        while( true ) {
          uVar7 = uVar7 & unaff_x19[0x12] - 1;
          puVar9 = (ulong *)(unaff_x19[0x11] + uVar7 * 0x18);
          if (*puVar9 == uVar8) goto LAB_006cdc1c;
          if (*puVar9 == unaff_x19[0x14]) break;
          uVar18 = uVar18 + 1;
          uVar7 = uVar18 + uVar7;
          if (unaff_x19[0x12] - 1 < uVar18) break;
        }
      }
      puVar9 = (ulong *)0x0;
LAB_006cdc1c:
      puVar21 = (ulong *)0x0;
      if (puVar9 != (ulong *)0x0) {
        puVar21 = puVar9 + 1;
      }
      if (*(byte *)((long)puVar21 + 2) == 0) {
        uVar22 = uVar22 + 1;
        if (uVar22 == uVar13) {
          bVar12 = bVar11;
          if (!bVar16) goto LAB_006cde28;
          break;
        }
        goto LAB_006cdbcc;
      }
      bVar12 = (byte)*puVar21;
      if (bVar11 <= (byte)*puVar21) {
        bVar12 = bVar11;
      }
      uVar22 = uVar22 + 1;
      bVar16 = true;
      bVar11 = bVar12;
    } while (uVar22 != uVar13);
    func_0x006b1ccc(*unaff_x19,0xb,bVar12,0,0);
  }
LAB_006cde28:
  func_0x006bf744();
  uVar6 = func_0x006b2784(*unaff_x19);
  lVar19 = unaff_x19[0xa1];
  puVar20 = *(undefined8 **)(lVar19 + -0x18);
  puVar1 = *(undefined8 **)(lVar19 + -0x10);
  if (puVar20 != puVar1) {
    do {
      uVar22 = func_0x006b2794(*unaff_x19,*puVar20,uVar6);
      if ((uVar22 & 1) == 0) {
        func_0x006bc388(in_stack_00000050 + 0xc,
                        "Exceeded jump distance limit; simplify the code to compile");
        goto code_r0x006ce104;
      }
      puVar20 = puVar20 + 1;
    } while (puVar20 != puVar1);
    lVar19 = unaff_x19[0xa1];
    puVar20 = *(undefined8 **)(lVar19 + -0x18);
  }
  if (puVar20 != (undefined8 *)0x0) {
    *(undefined8 **)(lVar19 + -0x10) = puVar20;
    __ZdlPv(puVar20);
  }
  unaff_x19[0xa1] = lVar19 + -0x30;
  lVar19 = *(long *)(in_stack_00000048 + 0x60);
  if (lVar19 != 0) {
    lVar4 = 0;
    lVar14 = *(long *)(in_stack_00000048 + 0x58);
    lVar15 = unaff_x19[0x27];
    lVar17 = unaff_x19[0x1d];
    do {
      uVar22 = *(ulong *)(lVar14 + lVar4 * 8);
      if ((lVar15 != 0) && (uVar22 != unaff_x19[0x28])) {
        uVar13 = 0;
        uVar8 = uVar22 >> 4 ^ uVar22 >> 9;
        do {
          uVar8 = uVar8 & unaff_x19[0x26] - 1;
          uVar18 = *(ulong *)(unaff_x19[0x25] + uVar8 * 0x20);
          if (uVar18 == uVar22) {
            *(undefined4 *)(unaff_x19[0x25] + uVar8 * 0x20 + 8) = 0;
            break;
          }
          uVar13 = uVar13 + 1;
          uVar8 = uVar13 + uVar8;
        } while (uVar18 != unaff_x19[0x28] && uVar13 <= unaff_x19[0x26] - 1);
      }
      if ((lVar17 != 0) && (uVar22 != unaff_x19[0x1e])) {
        uVar13 = 0;
        uVar8 = uVar22 >> 4 ^ uVar22 >> 9;
        do {
          uVar8 = uVar8 & unaff_x19[0x1c] - 1;
          uVar18 = *(ulong *)(unaff_x19[0x1b] + uVar8 * 0x18);
          if (uVar18 == uVar22) {
            *(undefined8 *)(unaff_x19[0x1b] + uVar8 * 0x18 + 8) = 0;
            break;
          }
          uVar13 = uVar13 + 1;
          uVar8 = uVar13 + uVar8;
        } while (uVar18 != unaff_x19[0x1e] && uVar13 <= unaff_x19[0x1c] - 1);
      }
      lVar4 = lVar4 + 1;
    } while (lVar4 != lVar19);
  }
  func_0x006d621c(unaff_x19 + 0x20,unaff_x19 + 0x1b,unaff_x19 + 0x25,unaff_x19[0x8f],
                  *(undefined1 *)(unaff_x19 + 0x90),unaff_x19[10],
                  *(undefined8 *)(in_stack_00000048 + 0x90),unaff_x19[0x8e]);
  if (uStack0000000000000058 != (ulong *)0x0) {
    puStack0000000000000060 = uStack0000000000000058;
    __ZdlPv();
  }
  *(undefined4 *)((long)unaff_x19 + 0x484) = uStack0000000000000044;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
    return;
  }
  ___stack_chk_fail();
  func_0x00017f90(&uStack0000000000000058);
code_r0x006ce104:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x6ce108);
  (*pcVar2)();
}

