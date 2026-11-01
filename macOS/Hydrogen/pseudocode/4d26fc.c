
/* WARNING: Possible PIC construction at 0x004d2ac8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d2c00: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d242c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d306c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d32b8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d32dc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d24ec: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d25cc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d262c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d2558: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2b04: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d2b34: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d2c2c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2cc4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d2ba0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d319c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d2a58: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d2a68: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d29c4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d290c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d3454: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d3438: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d3418: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d29d8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004d2958: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004d343c) */
/* WARNING: Removing unreachable block (ram,0x004d2910) */
/* WARNING: Removing unreachable block (ram,0x004d29c8) */
/* WARNING: Removing unreachable block (ram,0x004d2a6c) */
/* WARNING: Removing unreachable block (ram,0x004d2a84) */
/* WARNING: Removing unreachable block (ram,0x004d2a90) */
/* WARNING: Removing unreachable block (ram,0x004d2aa0) */
/* WARNING: Removing unreachable block (ram,0x004d2a5c) */
/* WARNING: Removing unreachable block (ram,0x004d2b38) */
/* WARNING: Removing unreachable block (ram,0x005d2b08) */
/* WARNING: Removing unreachable block (ram,0x004d255c) */
/* WARNING: Removing unreachable block (ram,0x004d2564) */
/* WARNING: Removing unreachable block (ram,0x004d2570) */
/* WARNING: Removing unreachable block (ram,0x004d2578) */
/* WARNING: Removing unreachable block (ram,0x004d26a0) */
/* WARNING: Removing unreachable block (ram,0x004d26a8) */
/* WARNING: Removing unreachable block (ram,0x004d2580) */
/* WARNING: Removing unreachable block (ram,0x004d25d0) */
/* WARNING: Removing unreachable block (ram,0x004d24f0) */
/* WARNING: Removing unreachable block (ram,0x004d32bc) */
/* WARNING: Removing unreachable block (ram,0x004d32e0) */
/* WARNING: Removing unreachable block (ram,0x004d32ec) */
/* WARNING: Removing unreachable block (ram,0x004d3304) */
/* WARNING: Removing unreachable block (ram,0x004d332c) */
/* WARNING: Removing unreachable block (ram,0x004d330c) */
/* WARNING: Removing unreachable block (ram,0x004d32f4) */
/* WARNING: Removing unreachable block (ram,0x004d32d4) */
/* WARNING: Removing unreachable block (ram,0x004d3070) */
/* WARNING: Removing unreachable block (ram,0x004d308c) */
/* WARNING: Removing unreachable block (ram,0x004d30a4) */
/* WARNING: Removing unreachable block (ram,0x004d30cc) */
/* WARNING: Removing unreachable block (ram,0x004d30ac) */
/* WARNING: Removing unreachable block (ram,0x004d3094) */
/* WARNING: Removing unreachable block (ram,0x004d2430) */
/* WARNING: Removing unreachable block (ram,0x004d2630) */
/* WARNING: Removing unreachable block (ram,0x004d341c) */

void thunk_FUN_004d2878(void)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  undefined1 *puVar3;
  long lVar4;
  long lVar5;
  ulong *puVar6;
  ulong *puVar7;
  ulong uVar8;
  undefined8 uVar9;
  ulong uVar10;
  long *plVar11;
  ulong *unaff_x19;
  ulong *unaff_x20;
  ulong *puVar12;
  ulong *unaff_x21;
  undefined8 *puVar13;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined8 *******pppppppuVar14;
  undefined8 *******unaff_x29;
  undefined1 auStack_e0 [128];
  undefined8 *******pppppppuStack_50;
  undefined8 uStack_48;
  undefined *puStack_8;
  
  __Unwind_Resume();
  puVar7 = (ulong *)func_0x007a2668();
  puVar2 = auStack_e0 + 0xa0;
  puVar3 = auStack_e0 + 0xa0;
  puStack_8 = (undefined *)0x4d2884;
  pppppppuVar14 = (undefined8 *******)(auStack_e0 + 0xd0);
  uVar10 = puVar7[3] - 0xc;
  if (0x14 < uVar10) {
    uVar10 = 9;
  }
  puVar1 = (undefined1 *)register0x00000008;
  puVar12 = puVar7;
  switch(uVar10) {
  case 0:
  case 0x10:
  case 0x11:
    goto LAB_004d2c64;
  case 1:
    puVar7 = puVar7 + 4;
    uVar9 = 0x4d2884;
    do {
      *(undefined8 *)((long)register0x00000008 + -0x40) = unaff_x24;
      *(undefined8 *)((long)register0x00000008 + -0x38) = unaff_x23;
      *(undefined8 *)((long)register0x00000008 + -0x30) = unaff_x22;
      *(ulong **)((long)register0x00000008 + -0x28) = unaff_x21;
      *(ulong **)((long)register0x00000008 + -0x20) = unaff_x20;
      *(ulong **)((long)register0x00000008 + -0x18) = unaff_x19;
      *(undefined8 ********)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined8 *)((long)register0x00000008 + -8) = uVar9;
      pppppppuVar14 = (undefined8 *******)((long)register0x00000008 + -0x10);
      puVar12 = (ulong *)puVar7[3];
      puStack_8 = &UNK_004d3070;
      register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
      unaff_x20 = puVar12;
code_r0x004d23d0:
      *(undefined8 *)((long)register0x00000008 + -0x40) = unaff_x24;
      *(undefined8 *)((long)register0x00000008 + -0x38) = unaff_x23;
      *(undefined8 *)((long)register0x00000008 + -0x30) = unaff_x22;
      *(ulong **)((long)register0x00000008 + -0x28) = unaff_x21;
      *(ulong **)((long)register0x00000008 + -0x20) = unaff_x20;
      *(ulong **)((long)register0x00000008 + -0x18) = puVar7;
      *(undefined8 ********)((long)register0x00000008 + -0x10) = pppppppuVar14;
      *(undefined **)((long)register0x00000008 + -8) = puStack_8;
      pppppppuVar14 = (undefined8 *******)((long)register0x00000008 + -0x10);
      uVar10 = *puVar12;
      unaff_x29 = pppppppuVar14;
      if (4 < (long)uVar10) {
        if ((long)uVar10 < 8) {
          if (uVar10 == 5) {
            plVar11 = (long *)puVar12[2];
            for (uVar10 = puVar12[3]; uVar10 != 0; uVar10 = uVar10 - 1) {
              if (*plVar11 != 0xc) {
                func_0x004ca6d8(plVar11);
              }
              func_0x004ca6d8(plVar11 + 8);
              plVar11 = plVar11 + 0x10;
            }
            if (puVar12[1] == 0) {
              return;
            }
            uVar10 = puVar12[2];
            uVar8 = puVar12[1] << 7;
            goto code_r0x004d2638;
          }
          if (uVar10 == 6) {
            uVar8 = puVar12[1];
            if ((long)uVar8 < -0x7ffffffffffffffb) {
              return;
            }
            if (uVar8 == 0) {
              return;
            }
            goto code_r0x004d25a8;
          }
          if (uVar10 != 7) goto code_r0x004d2650;
          uVar10 = puVar12[1];
          func_0x004d23d0(uVar10);
          uVar8 = 0x40;
          uVar9 = 8;
          puStack_8 = &UNK_004d2430;
          puVar1 = (undefined1 *)((long)register0x00000008 + -0x40);
          goto code_r0x00187bd4;
        }
        if (uVar10 == 8) goto code_r0x004d2624;
        if (uVar10 == 9) {
          uVar10 = puVar12[1];
          func_0x004d23d0(uVar10);
          uVar8 = 0x40;
          uVar9 = 8;
          puStack_8 = &UNK_004d25d0;
          puVar1 = (undefined1 *)((long)register0x00000008 + -0x40);
          goto code_r0x00187bd4;
        }
        if (uVar10 != 10) goto code_r0x004d2650;
        lVar5 = *(long *)puVar12[4];
        *(long *)puVar12[4] = lVar5 + -1;
        LORelease();
        if (lVar5 == 1) {
          func_0x005d2b20();
        }
        uVar10 = puVar12[3];
        if (uVar10 == 0) goto code_r0x004d268c;
        lVar5 = puVar12[2] + 0x18;
        goto code_r0x004d24d0;
      }
      if ((long)uVar10 < 2) {
        if (uVar10 == 0) {
          puVar6 = puVar12 + 1;
          lVar5 = *(long *)*puVar6;
          *(long *)*puVar6 = lVar5 + -1;
          LORelease();
          if (lVar5 != 1) {
            return;
          }
          puStack_8 = *(undefined **)((long)register0x00000008 + -8);
          puVar2 = (undefined1 *)register0x00000008;
          puVar12 = *(ulong **)((long)register0x00000008 + -0x18);
          unaff_x20 = *(ulong **)((long)register0x00000008 + -0x20);
          unaff_x29 = *(undefined8 ********)((long)register0x00000008 + -0x10);
          goto code_r0x005d2ac4;
        }
        if (uVar10 == 1) {
          uVar8 = puVar12[1];
          if (uVar8 == 0) {
            return;
          }
code_r0x004d25a8:
          uVar10 = puVar12[2];
          uVar9 = 1;
          goto code_r0x004d263c;
        }
      }
      else {
        if (uVar10 == 2) {
          puVar7 = puVar12 + 1;
          goto code_r0x004d2678;
        }
        if (uVar10 == 3) {
          uVar10 = puVar12[7];
          func_0x004d23d0(uVar10);
          uVar8 = 0x40;
          uVar9 = 8;
          puStack_8 = &UNK_004d255c;
          puVar1 = (undefined1 *)((long)register0x00000008 + -0x40);
          goto code_r0x00187bd4;
        }
        if (uVar10 == 4) {
          return;
        }
      }
code_r0x004d2650:
      puVar7 = puVar12 + 1;
      uVar10 = *puVar7 ^ 0x8000000000000000;
      if (1 < uVar10) {
        uVar10 = 2;
      }
      if (uVar10 == 0) {
        return;
      }
      if (uVar10 != 1) {
        unaff_x29 = *(undefined8 ********)((long)register0x00000008 + -0x10);
        uVar9 = *(undefined8 *)((long)register0x00000008 + -8);
        unaff_x20 = *(ulong **)((long)register0x00000008 + -0x20);
        unaff_x19 = *(ulong **)((long)register0x00000008 + -0x18);
        unaff_x22 = *(undefined8 *)((long)register0x00000008 + -0x30);
        unaff_x21 = *(ulong **)((long)register0x00000008 + -0x28);
        unaff_x24 = *(undefined8 *)((long)register0x00000008 + -0x40);
        unaff_x23 = *(undefined8 *)((long)register0x00000008 + -0x38);
DAT_004d3298:
        *(undefined8 *)((long)register0x00000008 + -0x40) = unaff_x24;
        *(undefined8 *)((long)register0x00000008 + -0x38) = unaff_x23;
        *(undefined8 *)((long)register0x00000008 + -0x30) = unaff_x22;
        *(ulong **)((long)register0x00000008 + -0x28) = unaff_x21;
        *(ulong **)((long)register0x00000008 + -0x20) = unaff_x20;
        *(ulong **)((long)register0x00000008 + -0x18) = unaff_x19;
        *(undefined8 ********)((long)register0x00000008 + -0x10) = unaff_x29;
        *(undefined8 *)((long)register0x00000008 + -8) = uVar9;
        pppppppuVar14 = (undefined8 *******)((long)register0x00000008 + -0x10);
        puVar12 = (ulong *)puVar7[6];
        puStack_8 = &UNK_004d32bc;
        register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
        unaff_x21 = puVar12;
        goto code_r0x004d23d0;
      }
      puVar7 = puVar12 + 2;
code_r0x004d2678:
      unaff_x29 = *(undefined8 ********)((long)register0x00000008 + -0x10);
      uVar9 = *(undefined8 *)((long)register0x00000008 + -8);
      unaff_x20 = *(ulong **)((long)register0x00000008 + -0x20);
      unaff_x19 = *(ulong **)((long)register0x00000008 + -0x18);
      unaff_x22 = *(undefined8 *)((long)register0x00000008 + -0x30);
      unaff_x21 = *(ulong **)((long)register0x00000008 + -0x28);
      unaff_x24 = *(undefined8 *)((long)register0x00000008 + -0x40);
      unaff_x23 = *(undefined8 *)((long)register0x00000008 + -0x38);
    } while( true );
  case 2:
    puVar7 = puVar7 + 4;
    uVar9 = 0x4d2884;
    goto DAT_004d3298;
  case 3:
  case 0xc:
    puStack_8 = (undefined *)0x4d2884;
    uVar10 = puVar7[5];
    lVar5 = puVar7[6] + 1;
    uVar8 = uVar10;
    while (lVar5 = lVar5 + -1, lVar5 != 0) {
      func_0x004ca5dc(uVar8);
      uVar8 = uVar8 + 0x18;
    }
    if (puVar7[4] == 0) {
      uVar10 = puVar7[8];
      lVar5 = puVar7[9] + 1;
      uVar8 = uVar10;
      while (lVar5 = lVar5 + -1, lVar5 != 0) {
        func_0x004ca6d8(uVar8);
        uVar8 = uVar8 + 0x40;
      }
      if (puVar7[7] == 0) {
        return;
      }
      uVar8 = puVar7[7] << 6;
      uVar9 = 8;
    }
    else {
      uVar8 = puVar7[4] * 0x18;
      uVar9 = 8;
      puStack_8 = &UNK_004d31a0;
      puVar1 = auStack_e0 + 0xa0;
      unaff_x29 = (undefined8 *******)(auStack_e0 + 0xd0);
    }
    goto code_r0x00187bd4;
  case 4:
    func_0x004d23d0(puVar7 + 4);
    puVar12 = puVar7 + 0xc;
    puVar6 = (ulong *)0xffffffffffffffff;
    lVar5 = *(long *)*puVar12;
    *(long *)*puVar12 = lVar5 + -1;
    LORelease();
    if (lVar5 != 1) {
      puVar12 = puVar7 + 0xd;
      lVar5 = *(long *)*puVar12;
      *(long *)*puVar12 = lVar5 + -1;
      LORelease();
      goto joined_r0x004d2c40;
    }
    puStack_8 = &UNK_004d295c;
    goto code_r0x005d2c74;
  default:
    uVar8 = *puVar7;
    if (uVar8 == 0) {
      return;
    }
    uVar10 = puVar7[1];
    uVar9 = 1;
    goto LAB_004d2bd8;
  case 7:
    puVar12 = puVar7 + 4;
    puStack_8 = &UNK_004d29dc;
    register0x00000008 = (BADSPACEBASE *)(auStack_e0 + 0xa0);
    goto code_r0x004d23d0;
  case 8:
    func_0x004d23d0(puVar7 + 4);
    puVar12 = puVar7 + 0xc;
    plVar11 = (long *)*puVar12;
    break;
  case 9:
    puStack_8 = &UNK_004d2910;
    goto code_r0x004d33bc;
  case 10:
    puStack_8 = &UNK_004d29c8;
    puVar12 = puVar7 + 0x14;
code_r0x004d33bc:
    puVar2 = auStack_e0 + 0x80;
    puVar1 = auStack_e0 + 0x80;
    pppppppuStack_50 = pppppppuVar14;
    uStack_48 = puStack_8;
    unaff_x29 = &pppppppuStack_50;
    uVar8 = *puVar12;
    uVar10 = uVar8 ^ 0x8000000000000000;
    if (2 < uVar10) {
      uVar10 = 1;
    }
    if (uVar10 == 0) {
      puVar6 = puVar12 + 1;
      lVar5 = *(long *)*puVar6;
      *(long *)*puVar6 = lVar5 + -1;
      LORelease();
      if (lVar5 != 1) {
code_r0x004d3458:
        puVar12 = puVar12 + 3;
        register0x00000008 = (BADSPACEBASE *)(auStack_e0 + 0xa0);
        goto code_r0x004d23d0;
      }
      puStack_8 = &UNK_004d341c;
code_r0x005d2ac4:
      uVar10 = *puVar6;
      uVar8 = *(ulong *)(uVar10 + 0x10);
      if (uVar8 == 0x8000000000000000 || uVar8 == 0) {
        uVar8 = 0x28;
        uVar9 = 8;
        puVar1 = puVar2;
      }
      else {
        *(ulong **)(puVar2 + -0x20) = unaff_x20;
        *(ulong **)(puVar2 + -0x18) = puVar12;
        *(undefined8 ********)(puVar2 + -0x10) = unaff_x29;
        *(undefined **)(puVar2 + -8) = puStack_8;
        uVar10 = *(ulong *)(uVar10 + 0x18);
        uVar9 = 1;
        puStack_8 = &UNK_005d2b08;
        puVar1 = puVar2 + -0x20;
        unaff_x29 = (undefined8 *******)(puVar2 + -0x10);
      }
    }
    else if (uVar10 == 1) {
      if (uVar8 == 0) goto code_r0x004d3458;
      uVar10 = puVar12[1];
      uVar9 = 1;
      puStack_8 = &UNK_004d3458;
      puVar1 = auStack_e0 + 0x80;
    }
    else {
      uVar10 = puVar12[1];
      func_0x004d23d0(uVar10);
      uVar8 = 0x40;
      uVar9 = 8;
      puStack_8 = &UNK_004d343c;
    }
    goto code_r0x00187bd4;
  case 0xb:
    puVar12 = puVar7 + 4;
    puStack_8 = &UNK_004d2a5c;
    register0x00000008 = (BADSPACEBASE *)(auStack_e0 + 0xa0);
    goto code_r0x004d23d0;
  case 0xd:
    lVar5 = puVar7[0x16] + 1;
    uVar10 = puVar7[0x15];
    while (lVar5 = lVar5 + -1, lVar5 != 0) {
      func_0x004ca5dc(uVar10);
      uVar10 = uVar10 + 0x18;
    }
    if (puVar7[0x14] == 0) {
      func_0x004d23d0(puVar7 + 4);
      puVar12 = puVar7 + 0xc;
code_r0x004d2bb0:
      puVar7 = unaff_x19;
      pppppppuVar14 = unaff_x29;
      goto code_r0x004d23d0;
    }
    uVar10 = puVar7[0x15];
    uVar8 = puVar7[0x14] * 0x18;
    uVar9 = 8;
    puStack_8 = &UNK_004d2ba4;
    puVar1 = auStack_e0 + 0xa0;
    unaff_x29 = pppppppuVar14;
    goto code_r0x00187bd4;
  case 0xe:
    if (puVar7[6] != 0) {
      puVar6 = (ulong *)puVar7[5];
      lVar5 = 1 - puVar7[6];
      do {
        lVar4 = *(long *)*puVar6;
        *(long *)*puVar6 = lVar4 + -1;
        LORelease();
        if (lVar4 == 1) {
          puStack_8 = &UNK_004d2b38;
          unaff_x20 = (ulong *)0xffffffffffffffff;
          unaff_x29 = pppppppuVar14;
          goto code_r0x005d2ac4;
        }
        puVar6 = puVar6 + 1;
        lVar5 = lVar5 + 1;
      } while (lVar5 != 1);
    }
    if (puVar7[4] != 0) {
      func_0x00187bd4(puVar7[5],puVar7[4] << 3,8);
    }
    lVar5 = puVar7[9] + 1;
    uVar10 = puVar7[8];
    while (lVar5 = lVar5 + -1, lVar5 != 0) {
      func_0x004ca6d8(uVar10);
      uVar10 = uVar10 + 0x40;
    }
    if (puVar7[7] != 0) {
      uVar10 = puVar7[8];
      uVar8 = puVar7[7] << 6;
      uVar9 = 8;
      puStack_8 = &UNK_004d2c30;
      puVar1 = auStack_e0 + 0xa0;
      unaff_x29 = pppppppuVar14;
      goto code_r0x00187bd4;
    }
    puVar12 = puVar7 + 10;
    plVar11 = (long *)*puVar12;
    break;
  case 0xf:
    lVar5 = puVar7[2] + 1;
    uVar10 = puVar7[1];
    while (lVar5 = lVar5 + -1, lVar5 != 0) {
      func_0x004ca6d8(uVar10);
      uVar10 = uVar10 + 0x40;
    }
    if (*puVar7 == 0) {
      return;
    }
    uVar10 = puVar7[1];
    uVar8 = *puVar7 << 6;
    goto code_r0x004d2bd4;
  case 0x12:
    if (puVar7[2] != 0) {
      puVar13 = (undefined8 *)puVar7[1];
      lVar5 = 1 - puVar7[2];
      do {
        lVar4 = *(long *)*puVar13;
        *(long *)*puVar13 = lVar4 + -1;
        LORelease();
        if (lVar4 == 1) {
          func_0x005d2ac4(puVar13);
        }
        puVar13 = puVar13 + 1;
        lVar5 = lVar5 + 1;
      } while (lVar5 != 1);
    }
    if (*puVar7 == 0) {
      return;
    }
    uVar10 = puVar7[1];
    uVar8 = *puVar7 << 3;
code_r0x004d2bd4:
    uVar9 = 8;
LAB_004d2bd8:
    goto code_r0x00187bd4;
  case 0x13:
    puVar6 = puVar7 + 0xf;
    puVar12 = puVar7 + 4;
    lVar5 = *(long *)*puVar6;
    *(long *)*puVar6 = lVar5 + -1;
    LORelease();
    if (lVar5 != 1) {
      lVar5 = puVar7[0xe] + 1;
      uVar10 = puVar7[0xd];
      while (lVar5 = lVar5 + -1, lVar5 != 0) {
        func_0x004ca6d8(uVar10);
        uVar10 = uVar10 + 0x40;
      }
      if (puVar7[0xc] == 0) {
        if (*puVar12 == 0xc) {
          return;
        }
        goto code_r0x004d2bb0;
      }
      uVar10 = puVar7[0xd];
      uVar8 = puVar7[0xc] << 6;
      uVar9 = 8;
      puStack_8 = &UNK_004d2c04;
      puVar1 = auStack_e0 + 0xa0;
      unaff_x29 = pppppppuVar14;
      goto code_r0x00187bd4;
    }
    puStack_8 = &UNK_004d2acc;
    puVar2 = auStack_e0 + 0xa0;
    puVar12 = puVar7;
    unaff_x29 = pppppppuVar14;
    goto code_r0x005d2ac4;
  }
  lVar5 = *plVar11;
  *plVar11 = lVar5 + -1;
  LORelease();
joined_r0x004d2c40:
  if (lVar5 != 1) {
LAB_004d2c64:
    return;
  }
  puVar3 = (undefined1 *)register0x00000008;
  puVar7 = unaff_x19;
  puVar6 = unaff_x20;
  pppppppuVar14 = unaff_x29;
code_r0x005d2c74:
  *(undefined8 *)(puVar3 + -0x40) = unaff_x24;
  *(undefined8 *)(puVar3 + -0x38) = unaff_x23;
  *(undefined8 *)(puVar3 + -0x30) = unaff_x22;
  *(ulong **)(puVar3 + -0x28) = unaff_x21;
  *(ulong **)(puVar3 + -0x20) = puVar6;
  *(ulong **)(puVar3 + -0x18) = puVar7;
  *(undefined8 ********)(puVar3 + -0x10) = pppppppuVar14;
  *(undefined **)(puVar3 + -8) = puStack_8;
  uVar10 = *puVar12;
  lVar5 = *(long *)(uVar10 + 0x20) + 1;
  lVar4 = *(long *)(uVar10 + 0x18);
  while (lVar5 = lVar5 + -1, lVar5 != 0) {
    func_0x0059d298(lVar4);
    lVar4 = lVar4 + 0x108;
  }
  plVar11 = (long *)(uVar10 + 0x10);
  if (*plVar11 == 0) {
    uVar8 = 0x28;
    uVar9 = 8;
    puStack_8 = *(undefined **)(puVar3 + -8);
    puVar1 = puVar3;
    unaff_x29 = *(undefined8 ********)(puVar3 + -0x10);
  }
  else {
    uVar10 = *(ulong *)(uVar10 + 0x18);
    uVar8 = *plVar11 * 0x108;
    uVar9 = 8;
    puStack_8 = &UNK_005d2cc8;
    puVar1 = puVar3 + -0x40;
    unaff_x29 = (undefined8 *******)(puVar3 + -0x10);
  }
code_r0x00187bd4:
  *(undefined8 ********)(puVar1 + -0x10) = unaff_x29;
  *(undefined **)(puVar1 + -8) = puStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar10,uVar8,uVar9);
  return;
code_r0x004d2624:
  puVar12 = (ulong *)puVar12[1];
  puStack_8 = &UNK_004d2630;
  register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
  puVar7 = puVar12;
  goto code_r0x004d23d0;
  while (lVar5 = lVar5 + 0x10, uVar10 != 0) {
code_r0x004d24d0:
    uVar10 = uVar10 - 1;
    puVar6 = (ulong *)(lVar5 + -0x10);
    lVar4 = *(long *)*puVar6;
    *(long *)*puVar6 = lVar4 + -1;
    LORelease();
    if (lVar4 == 1) {
      puStack_8 = &UNK_004d24f0;
      puVar2 = (undefined1 *)((long)register0x00000008 + -0x40);
      unaff_x20 = (ulong *)0xffffffffffffffff;
      goto code_r0x005d2ac4;
    }
  }
code_r0x004d268c:
  if (puVar12[1] == 0) {
    return;
  }
  uVar10 = puVar12[2];
  uVar8 = puVar12[1] << 4;
code_r0x004d2638:
  uVar9 = 8;
code_r0x004d263c:
  puStack_8 = *(undefined **)((long)register0x00000008 + -8);
  puVar1 = (undefined1 *)register0x00000008;
  unaff_x29 = *(undefined8 ********)((long)register0x00000008 + -0x10);
  goto code_r0x00187bd4;
}

