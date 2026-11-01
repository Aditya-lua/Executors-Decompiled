
/* WARNING: Possible PIC construction at 0x0056df04: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056e03c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056d7b8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056e4f8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056e744: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056e768: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056d878: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056d958: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056d9ec: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056d8e4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056d974: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2b04: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056df70: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056e068: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2cc4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056dfdc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056e628: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056de94: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056dea4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056de00: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056dd40: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056dd50: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056dd2c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056dd68: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0056dd30) */
/* WARNING: Removing unreachable block (ram,0x0056dd54) */
/* WARNING: Removing unreachable block (ram,0x0056dd44) */
/* WARNING: Removing unreachable block (ram,0x0056de04) */
/* WARNING: Removing unreachable block (ram,0x0056dea8) */
/* WARNING: Removing unreachable block (ram,0x0056dec0) */
/* WARNING: Removing unreachable block (ram,0x0056decc) */
/* WARNING: Removing unreachable block (ram,0x0056dedc) */
/* WARNING: Removing unreachable block (ram,0x0056de98) */
/* WARNING: Removing unreachable block (ram,0x0056df74) */
/* WARNING: Removing unreachable block (ram,0x005d2b08) */
/* WARNING: Removing unreachable block (ram,0x0056d978) */
/* WARNING: Removing unreachable block (ram,0x0056d990) */
/* WARNING: Removing unreachable block (ram,0x0056da5c) */
/* WARNING: Removing unreachable block (ram,0x0056da64) */
/* WARNING: Removing unreachable block (ram,0x0056d998) */
/* WARNING: Removing unreachable block (ram,0x0056d8e8) */
/* WARNING: Removing unreachable block (ram,0x0056d8f0) */
/* WARNING: Removing unreachable block (ram,0x0056d8fc) */
/* WARNING: Removing unreachable block (ram,0x0056d904) */
/* WARNING: Removing unreachable block (ram,0x0056da4c) */
/* WARNING: Removing unreachable block (ram,0x0056da54) */
/* WARNING: Removing unreachable block (ram,0x0056da68) */
/* WARNING: Removing unreachable block (ram,0x0056d90c) */
/* WARNING: Removing unreachable block (ram,0x0056d95c) */
/* WARNING: Removing unreachable block (ram,0x0056d87c) */
/* WARNING: Removing unreachable block (ram,0x0056e748) */
/* WARNING: Removing unreachable block (ram,0x0056e76c) */
/* WARNING: Removing unreachable block (ram,0x0056e778) */
/* WARNING: Removing unreachable block (ram,0x0056e790) */
/* WARNING: Removing unreachable block (ram,0x0056e7b8) */
/* WARNING: Removing unreachable block (ram,0x0056e798) */
/* WARNING: Removing unreachable block (ram,0x0056e780) */
/* WARNING: Removing unreachable block (ram,0x0056e760) */
/* WARNING: Removing unreachable block (ram,0x0056e4fc) */
/* WARNING: Removing unreachable block (ram,0x0056e518) */
/* WARNING: Removing unreachable block (ram,0x0056e530) */
/* WARNING: Removing unreachable block (ram,0x0056e558) */
/* WARNING: Removing unreachable block (ram,0x0056e538) */
/* WARNING: Removing unreachable block (ram,0x0056e520) */
/* WARNING: Removing unreachable block (ram,0x0056d7bc) */
/* WARNING: Removing unreachable block (ram,0x0056d9f0) */
/* WARNING: Removing unreachable block (ram,0x0056dd6c) */
/* WARNING: Removing unreachable block (ram,0x0056dd84) */
/* WARNING: Removing unreachable block (ram,0x0056dd90) */
/* WARNING: Removing unreachable block (ram,0x0056dda0) */

void thunk_FUN_0056dca0(void)

{
  undefined1 *puVar1;
  long lVar2;
  long lVar3;
  ulong *puVar4;
  ulong *puVar5;
  ulong *puVar6;
  ulong uVar7;
  undefined8 uVar8;
  ulong uVar9;
  long *plVar10;
  ulong *unaff_x19;
  ulong *unaff_x20;
  ulong *unaff_x21;
  undefined8 *puVar11;
  ulong *puVar12;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined1 *unaff_x29;
  undefined1 *puVar13;
  undefined1 auStack_c0 [128];
  undefined8 uStack_8;
  
  __Unwind_Resume();
  puVar4 = (ulong *)func_0x007a2668();
  puVar1 = auStack_c0 + 0x80;
  uStack_8 = (undefined *)0x56dcac;
  puVar13 = auStack_c0 + 0xb0;
  puVar12 = puVar4 + 3;
  uVar9 = *puVar12 - 0xc;
  if (0x14 < uVar9) {
    uVar9 = 9;
  }
  switch(uVar9) {
  case 0:
  case 0x10:
  case 0x11:
    goto LAB_0056e0a0;
  case 1:
    puVar4 = puVar4 + 4;
    uVar8 = 0x56dcac;
    do {
      *(undefined8 *)((long)register0x00000008 + -0x40) = unaff_x24;
      *(undefined8 *)((long)register0x00000008 + -0x38) = unaff_x23;
      *(undefined8 *)((long)register0x00000008 + -0x30) = unaff_x22;
      *(ulong **)((long)register0x00000008 + -0x28) = unaff_x21;
      *(ulong **)((long)register0x00000008 + -0x20) = unaff_x20;
      *(ulong **)((long)register0x00000008 + -0x18) = unaff_x19;
      *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined8 *)((long)register0x00000008 + -8) = uVar8;
      puVar13 = (undefined1 *)((long)register0x00000008 + -0x10);
      unaff_x20 = (ulong *)puVar4[3];
      uStack_8 = (undefined *)0x56e4fc;
      register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
      puVar5 = unaff_x20;
      unaff_x19 = puVar4;
      puVar12 = unaff_x21;
code_r0x0056d75c:
      puVar4 = puVar5;
      *(undefined8 *)((long)register0x00000008 + -0x40) = unaff_x24;
      *(undefined8 *)((long)register0x00000008 + -0x38) = unaff_x23;
      *(undefined8 *)((long)register0x00000008 + -0x30) = unaff_x22;
      *(ulong **)((long)register0x00000008 + -0x28) = puVar12;
      *(ulong **)((long)register0x00000008 + -0x20) = unaff_x20;
      *(ulong **)((long)register0x00000008 + -0x18) = unaff_x19;
      *(undefined1 **)((long)register0x00000008 + -0x10) = puVar13;
      *(undefined **)((long)register0x00000008 + -8) = uStack_8;
      puVar13 = (undefined1 *)((long)register0x00000008 + -0x10);
      uVar9 = *puVar4;
      unaff_x29 = puVar13;
      if ((long)uVar9 < 5) {
        if (1 < (long)uVar9) {
          if (uVar9 == 2) goto code_r0x0056d96c;
          if (uVar9 != 3) {
            if (uVar9 == 4) {
              return;
            }
            goto code_r0x0056d9fc;
          }
          uVar9 = puVar4[7];
          func_0x0056d75c(uVar9);
          uVar7 = 0x40;
          uVar8 = 8;
          uStack_8 = &UNK_0056d8e8;
          register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
          break;
        }
        if (uVar9 != 0) {
          if (uVar9 == 1) {
            uVar7 = puVar4[1];
            if (uVar7 == 0) {
              return;
            }
            goto code_r0x0056d934;
          }
          goto code_r0x0056d9fc;
        }
        puVar12 = puVar4 + 1;
        lVar3 = *(long *)*puVar12;
        *(long *)*puVar12 = lVar3 + -1;
        LORelease();
        if (lVar3 != 1) {
          return;
        }
        puVar13 = *(undefined1 **)((long)register0x00000008 + -0x10);
        uStack_8 = *(undefined **)((long)register0x00000008 + -8);
        unaff_x20 = *(ulong **)((long)register0x00000008 + -0x20);
        puVar4 = *(ulong **)((long)register0x00000008 + -0x18);
        puVar1 = (undefined1 *)register0x00000008;
        goto code_r0x005d2ac4;
      }
      if ((long)uVar9 < 8) {
        if (uVar9 == 5) {
          plVar10 = (long *)puVar4[2];
          for (uVar9 = puVar4[3]; uVar9 != 0; uVar9 = uVar9 - 1) {
            if (*plVar10 != 0xc) {
              func_0x00553cb8(plVar10);
            }
            func_0x00553cb8(plVar10 + 8);
            plVar10 = plVar10 + 0x10;
          }
          if (puVar4[1] == 0) {
            return;
          }
          uVar9 = puVar4[2];
          uVar7 = puVar4[1] << 7;
          goto code_r0x0056da80;
        }
        if (uVar9 != 6) {
          if (uVar9 != 7) goto code_r0x0056d9fc;
          uVar9 = puVar4[1];
          func_0x0056d75c(uVar9);
          uVar7 = 0x40;
          uVar8 = 8;
          uStack_8 = &UNK_0056d7bc;
          register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
          break;
        }
        uVar7 = puVar4[1];
        if ((long)uVar7 < -0x7ffffffffffffffb) {
          return;
        }
        if (uVar7 == 0) {
          return;
        }
code_r0x0056d934:
        uVar9 = puVar4[2];
        uVar8 = 1;
        goto code_r0x0056da84;
      }
      if (uVar9 == 8) {
        uStack_8 = &UNK_0056d9f0;
        register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
        puVar5 = (ulong *)puVar4[1];
        unaff_x19 = (ulong *)puVar4[1];
        goto code_r0x0056d75c;
      }
      if (uVar9 == 9) {
        uVar9 = puVar4[1];
        func_0x0056d75c(uVar9);
        uVar7 = 0x40;
        uVar8 = 8;
        uStack_8 = &UNK_0056d95c;
        register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
        break;
      }
      if (uVar9 == 10) {
        lVar3 = *(long *)puVar4[4];
        *(long *)puVar4[4] = lVar3 + -1;
        LORelease();
        if (lVar3 == 1) {
          func_0x005d2b20();
        }
        uVar9 = puVar4[3];
        if (uVar9 == 0) goto code_r0x0056da38;
        lVar3 = puVar4[2] + 0x18;
        unaff_x20 = (ulong *)0xffffffffffffffff;
        goto code_r0x0056d85c;
      }
code_r0x0056d9fc:
      puVar6 = puVar4 + 1;
      uVar9 = *puVar6 ^ 0x8000000000000000;
      if (1 < uVar9) {
        uVar9 = 2;
      }
      if (uVar9 == 0) {
        return;
      }
      if (uVar9 != 1) {
        unaff_x29 = *(undefined1 **)((long)register0x00000008 + -0x10);
        uVar8 = *(undefined8 *)((long)register0x00000008 + -8);
        unaff_x20 = *(ulong **)((long)register0x00000008 + -0x20);
        unaff_x19 = *(ulong **)((long)register0x00000008 + -0x18);
        unaff_x22 = *(undefined8 *)((long)register0x00000008 + -0x30);
        unaff_x21 = *(ulong **)((long)register0x00000008 + -0x28);
        unaff_x24 = *(undefined8 *)((long)register0x00000008 + -0x40);
        unaff_x23 = *(undefined8 *)((long)register0x00000008 + -0x38);
LAB_0056e724:
        *(undefined8 *)((long)register0x00000008 + -0x40) = unaff_x24;
        *(undefined8 *)((long)register0x00000008 + -0x38) = unaff_x23;
        *(undefined8 *)((long)register0x00000008 + -0x30) = unaff_x22;
        *(ulong **)((long)register0x00000008 + -0x28) = unaff_x21;
        *(ulong **)((long)register0x00000008 + -0x20) = unaff_x20;
        *(ulong **)((long)register0x00000008 + -0x18) = unaff_x19;
        *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
        *(undefined8 *)((long)register0x00000008 + -8) = uVar8;
        puVar13 = (undefined1 *)((long)register0x00000008 + -0x10);
        puVar12 = (ulong *)puVar6[6];
        uStack_8 = (undefined *)0x56e748;
        register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
        puVar5 = puVar12;
        unaff_x19 = puVar6;
        goto code_r0x0056d75c;
      }
      puVar4 = puVar4 + 2;
      unaff_x29 = *(undefined1 **)((long)register0x00000008 + -0x10);
      uVar8 = *(undefined8 *)((long)register0x00000008 + -8);
      unaff_x20 = *(ulong **)((long)register0x00000008 + -0x20);
      unaff_x19 = *(ulong **)((long)register0x00000008 + -0x18);
      unaff_x22 = *(undefined8 *)((long)register0x00000008 + -0x30);
      unaff_x21 = *(ulong **)((long)register0x00000008 + -0x28);
      unaff_x24 = *(undefined8 *)((long)register0x00000008 + -0x40);
      unaff_x23 = *(undefined8 *)((long)register0x00000008 + -0x38);
    } while( true );
  case 2:
    puVar6 = puVar4 + 4;
    uVar8 = 0x56dcac;
    goto LAB_0056e724;
  case 3:
  case 0xc:
    uStack_8 = (undefined *)0x56dcac;
    puVar13 = auStack_c0;
    uVar9 = puVar4[5];
    lVar3 = puVar4[6] + 1;
    uVar7 = uVar9;
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      func_0x00553bbc(uVar7);
      uVar7 = uVar7 + 0x18;
    }
    if (puVar4[4] == 0) {
      uVar9 = puVar4[8];
      lVar3 = puVar4[9] + 1;
      uVar7 = uVar9;
      while (lVar3 = lVar3 + -1, lVar3 != 0) {
        func_0x00553cb8(uVar7);
        uVar7 = uVar7 + 0x40;
      }
      if (puVar4[7] == 0) {
        return;
      }
      uVar7 = puVar4[7] << 6;
      uVar8 = 8;
    }
    else {
      uVar7 = puVar4[4] * 0x18;
      uVar8 = 8;
      uStack_8 = (undefined *)0x56e62c;
      register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
      unaff_x29 = puVar13 + 0xb0;
    }
    break;
  case 4:
    uStack_8 = &UNK_0056dd6c;
    register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
    puVar5 = puVar4 + 4;
    unaff_x19 = puVar4;
    goto code_r0x0056d75c;
  default:
    uVar7 = *puVar4;
    if (uVar7 == 0) {
      return;
    }
    uVar9 = puVar4[1];
    uVar8 = 1;
    goto code_r0x0056e014;
  case 7:
    func_0x0056d75c(puVar4 + 4);
    puVar4 = puVar4 + 0xc;
    plVar10 = (long *)*puVar4;
    goto code_r0x0056e070;
  case 8:
    uStack_8 = &UNK_0056dd30;
    register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
    puVar5 = puVar4 + 4;
    unaff_x19 = puVar4;
    goto code_r0x0056d75c;
  case 9:
    func_0x0056d660(puVar4);
    uStack_8 = &UNK_0056dd44;
    register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
    puVar5 = puVar12;
    unaff_x19 = puVar4;
    goto code_r0x0056d75c;
  case 10:
    func_0x0056d660(puVar4 + 0x14);
    uStack_8 = &UNK_0056de04;
    register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
    puVar5 = puVar4 + 0x17;
    unaff_x19 = puVar4;
    goto code_r0x0056d75c;
  case 0xb:
    uStack_8 = &UNK_0056de98;
    register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
    puVar5 = puVar4 + 4;
    unaff_x19 = puVar4;
    goto code_r0x0056d75c;
  case 0xd:
    lVar3 = puVar4[0x16] + 1;
    uVar9 = puVar4[0x15];
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      func_0x00553bbc(uVar9);
      uVar9 = uVar9 + 0x18;
    }
    if (puVar4[0x14] == 0) {
      func_0x0056d75c(puVar4 + 4);
      puVar5 = puVar4 + 0xc;
code_r0x0056dfec:
      puVar12 = unaff_x21;
      puVar13 = unaff_x29;
      goto code_r0x0056d75c;
    }
    uVar9 = puVar4[0x15];
    uVar7 = puVar4[0x14] * 0x18;
    uVar8 = 8;
    uStack_8 = &UNK_0056dfe0;
    register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
    unaff_x29 = puVar13;
    break;
  case 0xe:
    if (puVar4[6] != 0) {
      puVar12 = (ulong *)puVar4[5];
      lVar3 = 1 - puVar4[6];
      unaff_x20 = (ulong *)0xffffffffffffffff;
      do {
        lVar2 = *(long *)*puVar12;
        *(long *)*puVar12 = lVar2 + -1;
        LORelease();
        if (lVar2 == 1) {
          uStack_8 = &UNK_0056df74;
          goto code_r0x005d2ac4;
        }
        puVar12 = puVar12 + 1;
        lVar3 = lVar3 + 1;
      } while (lVar3 != 1);
    }
    if (puVar4[4] != 0) {
      func_0x00187bd4(puVar4[5],puVar4[4] << 3,8);
    }
    lVar3 = puVar4[9] + 1;
    uVar9 = puVar4[8];
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      func_0x00553cb8(uVar9);
      uVar9 = uVar9 + 0x40;
    }
    if (puVar4[7] != 0) {
      uVar9 = puVar4[8];
      uVar7 = puVar4[7] << 6;
      uVar8 = 8;
      uStack_8 = &UNK_0056e06c;
      register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
      unaff_x29 = puVar13;
      break;
    }
    puVar4 = puVar4 + 10;
    plVar10 = (long *)*puVar4;
code_r0x0056e070:
    lVar3 = *plVar10;
    *plVar10 = lVar3 + -1;
    LORelease();
    if (lVar3 != 1) {
LAB_0056e0a0:
      return;
    }
    puVar13 = auStack_c0;
    uVar9 = *puVar4;
    lVar3 = *(long *)(uVar9 + 0x20) + 1;
    lVar2 = *(long *)(uVar9 + 0x18);
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      func_0x0059d298(lVar2);
      lVar2 = lVar2 + 0x108;
    }
    plVar10 = (long *)(uVar9 + 0x10);
    if (*plVar10 == 0) {
      uVar7 = 0x28;
      uVar8 = 8;
    }
    else {
      uVar9 = *(ulong *)(uVar9 + 0x18);
      uVar7 = *plVar10 * 0x108;
      uVar8 = 8;
      uStack_8 = &UNK_005d2cc8;
      register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
      unaff_x29 = puVar13 + 0xb0;
    }
    break;
  case 0xf:
    lVar3 = puVar4[2] + 1;
    uVar9 = puVar4[1];
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      func_0x00553cb8(uVar9);
      uVar9 = uVar9 + 0x40;
    }
    if (*puVar4 == 0) {
      return;
    }
    uVar9 = puVar4[1];
    uVar7 = *puVar4 << 6;
    goto code_r0x0056e010;
  case 0x12:
    if (puVar4[2] != 0) {
      puVar11 = (undefined8 *)puVar4[1];
      lVar3 = 1 - puVar4[2];
      do {
        lVar2 = *(long *)*puVar11;
        *(long *)*puVar11 = lVar2 + -1;
        LORelease();
        if (lVar2 == 1) {
          func_0x005d2ac4(puVar11);
        }
        puVar11 = puVar11 + 1;
        lVar3 = lVar3 + 1;
      } while (lVar3 != 1);
    }
    if (*puVar4 == 0) {
      return;
    }
    uVar9 = puVar4[1];
    uVar7 = *puVar4 << 3;
code_r0x0056e010:
    uVar8 = 8;
code_r0x0056e014:
    break;
  case 0x13:
    puVar12 = puVar4 + 0xf;
    puVar5 = puVar4 + 4;
    lVar3 = *(long *)*puVar12;
    *(long *)*puVar12 = lVar3 + -1;
    LORelease();
    if (lVar3 == 1) {
      uStack_8 = &UNK_0056df08;
      puVar1 = auStack_c0 + 0x80;
code_r0x005d2ac4:
      uVar9 = *puVar12;
      uVar7 = *(ulong *)(uVar9 + 0x10);
      if (uVar7 == 0x8000000000000000 || uVar7 == 0) {
        uVar7 = 0x28;
        uVar8 = 8;
        register0x00000008 = (BADSPACEBASE *)puVar1;
        unaff_x29 = puVar13;
      }
      else {
        *(ulong **)(puVar1 + -0x20) = unaff_x20;
        *(ulong **)(puVar1 + -0x18) = puVar4;
        *(undefined1 **)(puVar1 + -0x10) = puVar13;
        *(undefined **)(puVar1 + -8) = uStack_8;
        uVar9 = *(ulong *)(uVar9 + 0x18);
        uVar8 = 1;
        uStack_8 = &UNK_005d2b08;
        register0x00000008 = (BADSPACEBASE *)(puVar1 + -0x20);
        unaff_x29 = puVar1 + -0x10;
      }
    }
    else {
      lVar3 = puVar4[0xe] + 1;
      uVar9 = puVar4[0xd];
      while (lVar3 = lVar3 + -1, lVar3 != 0) {
        func_0x00553cb8(uVar9);
        uVar9 = uVar9 + 0x40;
      }
      if (puVar4[0xc] == 0) {
        if (*puVar5 == 0xc) {
          return;
        }
        goto code_r0x0056dfec;
      }
      uVar9 = puVar4[0xd];
      uVar7 = puVar4[0xc] << 6;
      uVar8 = 8;
      uStack_8 = &UNK_0056e040;
      register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
      unaff_x29 = puVar13;
    }
  }
code_r0x00187bd4:
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar9,uVar7,uVar8);
  return;
code_r0x0056d96c:
  puVar12 = (ulong *)puVar4[4];
  uStack_8 = &UNK_0056d978;
  register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
  puVar5 = puVar12;
  unaff_x19 = puVar4;
  goto code_r0x0056d75c;
  while (lVar3 = lVar3 + 0x10, uVar9 != 0) {
code_r0x0056d85c:
    uVar9 = uVar9 - 1;
    puVar12 = (ulong *)(lVar3 + -0x10);
    lVar2 = *(long *)*puVar12;
    *(long *)*puVar12 = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      uStack_8 = &UNK_0056d87c;
      puVar1 = (undefined1 *)((long)register0x00000008 + -0x40);
      goto code_r0x005d2ac4;
    }
  }
code_r0x0056da38:
  if (puVar4[1] == 0) {
    return;
  }
  uVar9 = puVar4[2];
  uVar7 = puVar4[1] << 4;
code_r0x0056da80:
  uVar8 = 8;
code_r0x0056da84:
  uStack_8 = *(undefined **)((long)register0x00000008 + -8);
  unaff_x29 = *(undefined1 **)((long)register0x00000008 + -0x10);
  goto code_r0x00187bd4;
}

