
/* WARNING: Possible PIC construction at 0x00564e54: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00565168: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005652a0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00564a30: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056570c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00565958: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056597c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00564af0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00564bd0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00564c64: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00564b5c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00564bec: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2b04: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005651d4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005652cc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2cc4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00565240: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056583c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005650f8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00565108: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00565064: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00564fac: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00565af4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00565ad8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00565ab8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00565078: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00564ff8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00565adc) */
/* WARNING: Removing unreachable block (ram,0x00564fb0) */
/* WARNING: Removing unreachable block (ram,0x00565068) */
/* WARNING: Removing unreachable block (ram,0x0056510c) */
/* WARNING: Removing unreachable block (ram,0x00565124) */
/* WARNING: Removing unreachable block (ram,0x00565130) */
/* WARNING: Removing unreachable block (ram,0x00565140) */
/* WARNING: Removing unreachable block (ram,0x005650fc) */
/* WARNING: Removing unreachable block (ram,0x005651d8) */
/* WARNING: Removing unreachable block (ram,0x005d2b08) */
/* WARNING: Removing unreachable block (ram,0x00564bf0) */
/* WARNING: Removing unreachable block (ram,0x00564c08) */
/* WARNING: Removing unreachable block (ram,0x00564cd4) */
/* WARNING: Removing unreachable block (ram,0x00564cdc) */
/* WARNING: Removing unreachable block (ram,0x00564c10) */
/* WARNING: Removing unreachable block (ram,0x00564b60) */
/* WARNING: Removing unreachable block (ram,0x00564b68) */
/* WARNING: Removing unreachable block (ram,0x00564b74) */
/* WARNING: Removing unreachable block (ram,0x00564b7c) */
/* WARNING: Removing unreachable block (ram,0x00564cc4) */
/* WARNING: Removing unreachable block (ram,0x00564ccc) */
/* WARNING: Removing unreachable block (ram,0x00564ce0) */
/* WARNING: Removing unreachable block (ram,0x00564b84) */
/* WARNING: Removing unreachable block (ram,0x00564bd4) */
/* WARNING: Removing unreachable block (ram,0x00564af4) */
/* WARNING: Removing unreachable block (ram,0x0056595c) */
/* WARNING: Removing unreachable block (ram,0x00565980) */
/* WARNING: Removing unreachable block (ram,0x0056598c) */
/* WARNING: Removing unreachable block (ram,0x005659a4) */
/* WARNING: Removing unreachable block (ram,0x005659cc) */
/* WARNING: Removing unreachable block (ram,0x005659ac) */
/* WARNING: Removing unreachable block (ram,0x00565994) */
/* WARNING: Removing unreachable block (ram,0x00565974) */
/* WARNING: Removing unreachable block (ram,0x00565710) */
/* WARNING: Removing unreachable block (ram,0x0056572c) */
/* WARNING: Removing unreachable block (ram,0x00565744) */
/* WARNING: Removing unreachable block (ram,0x0056576c) */
/* WARNING: Removing unreachable block (ram,0x0056574c) */
/* WARNING: Removing unreachable block (ram,0x00565734) */
/* WARNING: Removing unreachable block (ram,0x00564a34) */
/* WARNING: Removing unreachable block (ram,0x00564c68) */
/* WARNING: Removing unreachable block (ram,0x00564e58) */
/* WARNING: Removing unreachable block (ram,0x00565abc) */
/* WARNING: Type propagation algorithm not settling */

void FUN_00564e3c(long *param_1)

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
  ulong *unaff_x22;
  ulong *puVar14;
  long unaff_x23;
  long unaff_x24;
  undefined8 *******pppppppuVar15;
  undefined8 *******unaff_x29;
  undefined *puVar16;
  undefined1 auStack_e0 [128];
  undefined8 *******pppppppuStack_50;
  undefined8 uStack_48;
  undefined *puStack_8;
  
code_r0x00564e3c:
  lVar5 = *param_1;
  *param_1 = lVar5 + unaff_x24;
  LORelease();
  if (lVar5 == 1) goto code_r0x00564e48;
  puVar14 = unaff_x22 + 2;
  unaff_x23 = unaff_x23 + -1;
  if (unaff_x23 != 0) goto code_r0x00564e38;
  if (*unaff_x21 != 0) {
    func_0x00187bd4(unaff_x19[2],*unaff_x21 << 4,8);
  }
  __Unwind_Resume();
  puVar6 = (ulong *)func_0x007a2668();
  puVar2 = auStack_e0 + 0xa0;
  puVar3 = auStack_e0 + 0xa0;
  puStack_8 = &DAT_00564f24;
  pppppppuVar15 = (undefined8 *******)(auStack_e0 + 0xd0);
  uVar10 = puVar6[3] - 0xc;
  if (0x14 < uVar10) {
    uVar10 = 9;
  }
  uVar9 = 0;
  puVar1 = (undefined1 *)register0x00000008;
  switch(uVar10) {
  case 0:
  case 0x10:
  case 0x11:
    goto LAB_00565304;
  case 1:
    puVar6 = puVar6 + 4;
    puVar16 = &DAT_00564f24;
    do {
      *(long *)((long)register0x00000008 + -0x40) = unaff_x24;
      *(undefined8 *)((long)register0x00000008 + -0x38) = uVar9;
      *(ulong **)((long)register0x00000008 + -0x30) = puVar14;
      *(ulong **)((long)register0x00000008 + -0x28) = unaff_x21;
      *(ulong **)((long)register0x00000008 + -0x20) = unaff_x20;
      *(ulong **)((long)register0x00000008 + -0x18) = unaff_x19;
      *(undefined8 ********)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined **)((long)register0x00000008 + -8) = puVar16;
      pppppppuVar15 = (undefined8 *******)((long)register0x00000008 + -0x10);
      unaff_x20 = (ulong *)puVar6[3];
      puStack_8 = (undefined *)0x565710;
      register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
      puVar7 = unaff_x20;
code_r0x005649d4:
      unaff_x19 = puVar7;
      *(long *)((long)register0x00000008 + -0x40) = unaff_x24;
      *(undefined8 *)((long)register0x00000008 + -0x38) = uVar9;
      *(ulong **)((long)register0x00000008 + -0x30) = puVar14;
      *(ulong **)((long)register0x00000008 + -0x28) = unaff_x21;
      *(ulong **)((long)register0x00000008 + -0x20) = unaff_x20;
      *(ulong **)((long)register0x00000008 + -0x18) = puVar6;
      *(undefined8 ********)((long)register0x00000008 + -0x10) = pppppppuVar15;
      *(undefined **)((long)register0x00000008 + -8) = puStack_8;
      pppppppuVar15 = (undefined8 *******)((long)register0x00000008 + -0x10);
      uVar10 = *unaff_x19;
      unaff_x29 = pppppppuVar15;
      if ((long)uVar10 < 5) {
        if (1 < (long)uVar10) {
          if (uVar10 == 2) goto code_r0x00564be4;
          if (uVar10 != 3) {
            if (uVar10 == 4) {
              return;
            }
            goto code_r0x00564c74;
          }
          uVar10 = unaff_x19[7];
          func_0x005649d4(uVar10);
          uVar8 = 0x40;
          uVar9 = 8;
          puStack_8 = &UNK_00564b60;
          puVar1 = (undefined1 *)((long)register0x00000008 + -0x40);
          break;
        }
        if (uVar10 != 0) {
          if (uVar10 == 1) {
            uVar8 = unaff_x19[1];
            if (uVar8 == 0) {
              return;
            }
            goto code_r0x00564bac;
          }
          goto code_r0x00564c74;
        }
        unaff_x22 = unaff_x19 + 1;
        lVar5 = *(long *)*unaff_x22;
        *(long *)*unaff_x22 = lVar5 + -1;
        LORelease();
        if (lVar5 != 1) {
          return;
        }
        puStack_8 = *(undefined **)((long)register0x00000008 + -8);
        puVar2 = (undefined1 *)register0x00000008;
        unaff_x19 = *(ulong **)((long)register0x00000008 + -0x18);
        unaff_x20 = *(ulong **)((long)register0x00000008 + -0x20);
        unaff_x29 = *(undefined8 ********)((long)register0x00000008 + -0x10);
        goto code_r0x005d2ac4;
      }
      if ((long)uVar10 < 8) {
        if (uVar10 == 5) {
          plVar11 = (long *)unaff_x19[2];
          for (uVar10 = unaff_x19[3]; uVar10 != 0; uVar10 = uVar10 - 1) {
            if (*plVar11 != 0xc) {
              func_0x00553cb8(plVar11);
            }
            func_0x00553cb8(plVar11 + 8);
            plVar11 = plVar11 + 0x10;
          }
          if (unaff_x19[1] == 0) {
            return;
          }
          uVar10 = unaff_x19[2];
          uVar8 = unaff_x19[1] << 7;
          goto code_r0x00564cf8;
        }
        if (uVar10 != 6) {
          if (uVar10 != 7) goto code_r0x00564c74;
          uVar10 = unaff_x19[1];
          func_0x005649d4(uVar10);
          uVar8 = 0x40;
          uVar9 = 8;
          puStack_8 = &UNK_00564a34;
          puVar1 = (undefined1 *)((long)register0x00000008 + -0x40);
          break;
        }
        uVar8 = unaff_x19[1];
        if ((long)uVar8 < -0x7ffffffffffffffb) {
          return;
        }
        if (uVar8 == 0) {
          return;
        }
code_r0x00564bac:
        uVar10 = unaff_x19[2];
        uVar9 = 1;
        goto code_r0x00564cfc;
      }
      if (uVar10 == 8) {
        puStack_8 = &UNK_00564c68;
        register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
        puVar7 = (ulong *)unaff_x19[1];
        puVar6 = (ulong *)unaff_x19[1];
        goto code_r0x005649d4;
      }
      if (uVar10 == 9) {
        uVar10 = unaff_x19[1];
        func_0x005649d4(uVar10);
        uVar8 = 0x40;
        uVar9 = 8;
        puStack_8 = &UNK_00564bd4;
        puVar1 = (undefined1 *)((long)register0x00000008 + -0x40);
        break;
      }
      if (uVar10 == 10) {
        lVar5 = *(long *)unaff_x19[4];
        *(long *)unaff_x19[4] = lVar5 + -1;
        LORelease();
        if (lVar5 == 1) {
          func_0x005d2b20();
        }
        uVar10 = unaff_x19[3];
        if (uVar10 == 0) goto code_r0x00564cb0;
        lVar5 = unaff_x19[2] + 0x18;
        goto code_r0x00564ad4;
      }
code_r0x00564c74:
      puVar6 = unaff_x19 + 1;
      uVar10 = *puVar6 ^ 0x8000000000000000;
      if (1 < uVar10) {
        uVar10 = 2;
      }
      if (uVar10 == 0) {
        return;
      }
      if (uVar10 != 1) {
        unaff_x29 = *(undefined8 ********)((long)register0x00000008 + -0x10);
        puVar16 = *(undefined **)((long)register0x00000008 + -8);
        unaff_x20 = *(ulong **)((long)register0x00000008 + -0x20);
        unaff_x19 = *(ulong **)((long)register0x00000008 + -0x18);
        puVar14 = *(ulong **)((long)register0x00000008 + -0x30);
        unaff_x21 = *(ulong **)((long)register0x00000008 + -0x28);
        unaff_x24 = *(long *)((long)register0x00000008 + -0x40);
        uVar9 = *(undefined8 *)((long)register0x00000008 + -0x38);
SUB_00565938:
        *(long *)((long)register0x00000008 + -0x40) = unaff_x24;
        *(undefined8 *)((long)register0x00000008 + -0x38) = uVar9;
        *(ulong **)((long)register0x00000008 + -0x30) = puVar14;
        *(ulong **)((long)register0x00000008 + -0x28) = unaff_x21;
        *(ulong **)((long)register0x00000008 + -0x20) = unaff_x20;
        *(ulong **)((long)register0x00000008 + -0x18) = unaff_x19;
        *(undefined8 ********)((long)register0x00000008 + -0x10) = unaff_x29;
        *(undefined **)((long)register0x00000008 + -8) = puVar16;
        pppppppuVar15 = (undefined8 *******)((long)register0x00000008 + -0x10);
        unaff_x21 = (ulong *)puVar6[6];
        puStack_8 = &UNK_0056595c;
        register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
        puVar7 = unaff_x21;
        goto code_r0x005649d4;
      }
      puVar6 = unaff_x19 + 2;
      unaff_x29 = *(undefined8 ********)((long)register0x00000008 + -0x10);
      puVar16 = *(undefined **)((long)register0x00000008 + -8);
      unaff_x20 = *(ulong **)((long)register0x00000008 + -0x20);
      unaff_x19 = *(ulong **)((long)register0x00000008 + -0x18);
      puVar14 = *(ulong **)((long)register0x00000008 + -0x30);
      unaff_x21 = *(ulong **)((long)register0x00000008 + -0x28);
      unaff_x24 = *(long *)((long)register0x00000008 + -0x40);
      uVar9 = *(undefined8 *)((long)register0x00000008 + -0x38);
    } while( true );
  case 2:
    puVar6 = puVar6 + 4;
    puVar16 = &DAT_00564f24;
    goto SUB_00565938;
  case 3:
  case 0xc:
    puStack_8 = &DAT_00564f24;
    uVar10 = puVar6[5];
    lVar5 = puVar6[6] + 1;
    uVar8 = uVar10;
    while (lVar5 = lVar5 + -1, lVar5 != 0) {
      func_0x00553bbc(uVar8);
      uVar8 = uVar8 + 0x18;
    }
    if (puVar6[4] == 0) {
      uVar10 = puVar6[8];
      lVar5 = puVar6[9] + 1;
      uVar8 = uVar10;
      while (lVar5 = lVar5 + -1, lVar5 != 0) {
        func_0x00553cb8(uVar8);
        uVar8 = uVar8 + 0x40;
      }
      if (puVar6[7] == 0) {
        return;
      }
      uVar8 = puVar6[7] << 6;
      uVar9 = 8;
    }
    else {
      uVar8 = puVar6[4] * 0x18;
      uVar9 = 8;
      puStack_8 = &UNK_00565840;
      puVar1 = auStack_e0 + 0xa0;
      unaff_x29 = (undefined8 *******)(auStack_e0 + 0xd0);
    }
    break;
  case 4:
    func_0x005649d4(puVar6 + 4);
    puVar7 = puVar6 + 0xc;
    puVar12 = (ulong *)0xffffffffffffffff;
    lVar5 = *(long *)*puVar7;
    *(long *)*puVar7 = lVar5 + -1;
    LORelease();
    if (lVar5 == 1) {
      puStack_8 = &UNK_00564ffc;
      goto code_r0x005d2c74;
    }
    puVar7 = puVar6 + 0xd;
    lVar5 = *(long *)*puVar7;
    *(long *)*puVar7 = lVar5 + -1;
    LORelease();
    if (lVar5 != 1) {
      return;
    }
    goto code_r0x005652e4;
  default:
    uVar8 = *puVar6;
    if (uVar8 == 0) {
      return;
    }
    uVar10 = puVar6[1];
    uVar9 = 1;
    goto code_r0x00565278;
  case 7:
    puStack_8 = &UNK_0056507c;
    register0x00000008 = (BADSPACEBASE *)(auStack_e0 + 0xa0);
    puVar7 = puVar6 + 4;
    goto code_r0x005649d4;
  case 8:
    func_0x005649d4(puVar6 + 4);
    puVar7 = puVar6 + 0xc;
    plVar11 = (long *)*puVar7;
    goto code_r0x005652d4;
  case 9:
    puStack_8 = &UNK_00564fb0;
    unaff_x19 = puVar6;
    goto code_r0x00565a5c;
  case 10:
    puStack_8 = &UNK_00565068;
    unaff_x19 = puVar6 + 0x14;
code_r0x00565a5c:
    puVar2 = auStack_e0 + 0x80;
    puVar1 = auStack_e0 + 0x80;
    pppppppuStack_50 = pppppppuVar15;
    uStack_48 = puStack_8;
    unaff_x29 = &pppppppuStack_50;
    uVar8 = *unaff_x19;
    uVar10 = uVar8 ^ 0x8000000000000000;
    if (2 < uVar10) {
      uVar10 = 1;
    }
    if (uVar10 == 0) {
      unaff_x22 = unaff_x19 + 1;
      lVar5 = *(long *)*unaff_x22;
      *(long *)*unaff_x22 = lVar5 + -1;
      LORelease();
      if (lVar5 == 1) {
        puStack_8 = &UNK_00565abc;
        goto code_r0x005d2ac4;
      }
    }
    else {
      if (uVar10 != 1) {
        uVar10 = unaff_x19[1];
        func_0x005649d4(uVar10);
        uVar8 = 0x40;
        uVar9 = 8;
        puStack_8 = &UNK_00565adc;
        break;
      }
      if (uVar8 != 0) {
        uVar10 = unaff_x19[1];
        uVar9 = 1;
        puStack_8 = &UNK_00565af8;
        puVar1 = auStack_e0 + 0x80;
        break;
      }
    }
    register0x00000008 = (BADSPACEBASE *)(auStack_e0 + 0xa0);
    puVar7 = unaff_x19 + 3;
    goto code_r0x005649d4;
  case 0xb:
    puStack_8 = &UNK_005650fc;
    register0x00000008 = (BADSPACEBASE *)(auStack_e0 + 0xa0);
    puVar7 = puVar6 + 4;
    goto code_r0x005649d4;
  case 0xd:
    lVar5 = puVar6[0x16] + 1;
    uVar10 = puVar6[0x15];
    while (lVar5 = lVar5 + -1, lVar5 != 0) {
      func_0x00553bbc(uVar10);
      uVar10 = uVar10 + 0x18;
    }
    if (puVar6[0x14] == 0) {
      func_0x005649d4(puVar6 + 4);
      puVar7 = puVar6 + 0xc;
code_r0x00565250:
      puVar6 = unaff_x19;
      pppppppuVar15 = unaff_x29;
      goto code_r0x005649d4;
    }
    uVar10 = puVar6[0x15];
    uVar8 = puVar6[0x14] * 0x18;
    uVar9 = 8;
    puStack_8 = &UNK_00565244;
    puVar1 = auStack_e0 + 0xa0;
    unaff_x29 = pppppppuVar15;
    break;
  case 0xe:
    if (puVar6[6] == 0) goto code_r0x005651f0;
    unaff_x22 = (ulong *)puVar6[5];
    lVar5 = 1 - puVar6[6];
    goto code_r0x005651b8;
  case 0xf:
    lVar5 = puVar6[2] + 1;
    uVar10 = puVar6[1];
    while (lVar5 = lVar5 + -1, lVar5 != 0) {
      func_0x00553cb8(uVar10);
      uVar10 = uVar10 + 0x40;
    }
    if (*puVar6 == 0) {
      return;
    }
    uVar10 = puVar6[1];
    uVar8 = *puVar6 << 6;
    goto code_r0x00565274;
  case 0x12:
    if (puVar6[2] != 0) {
      puVar13 = (undefined8 *)puVar6[1];
      lVar5 = 1 - puVar6[2];
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
    if (*puVar6 == 0) {
      return;
    }
    uVar10 = puVar6[1];
    uVar8 = *puVar6 << 3;
code_r0x00565274:
    uVar9 = 8;
code_r0x00565278:
    break;
  case 0x13:
    unaff_x22 = puVar6 + 0xf;
    puVar7 = puVar6 + 4;
    lVar5 = *(long *)*unaff_x22;
    *(long *)*unaff_x22 = lVar5 + -1;
    LORelease();
    if (lVar5 == 1) {
      puStack_8 = &UNK_0056516c;
      puVar2 = auStack_e0 + 0xa0;
      unaff_x19 = puVar6;
      unaff_x29 = pppppppuVar15;
      goto code_r0x005d2ac4;
    }
    lVar5 = puVar6[0xe] + 1;
    uVar10 = puVar6[0xd];
    while (lVar5 = lVar5 + -1, lVar5 != 0) {
      func_0x00553cb8(uVar10);
      uVar10 = uVar10 + 0x40;
    }
    if (puVar6[0xc] == 0) {
      if (*puVar7 == 0xc) {
        return;
      }
      goto code_r0x00565250;
    }
    uVar10 = puVar6[0xd];
    uVar8 = puVar6[0xc] << 6;
    uVar9 = 8;
    puStack_8 = &UNK_005652a4;
    puVar1 = auStack_e0 + 0xa0;
    unaff_x29 = pppppppuVar15;
  }
  goto code_r0x00187bd4;
code_r0x00564e48:
  puStack_8 = (undefined *)0x564e58;
  puVar2 = (undefined1 *)register0x00000008;
code_r0x005d2ac4:
  uVar10 = *unaff_x22;
  uVar8 = *(ulong *)(uVar10 + 0x10);
  if (uVar8 == 0x8000000000000000 || uVar8 == 0) {
    uVar8 = 0x28;
    uVar9 = 8;
    puVar1 = puVar2;
  }
  else {
    *(ulong **)(puVar2 + -0x20) = unaff_x20;
    *(ulong **)(puVar2 + -0x18) = unaff_x19;
    *(undefined8 ********)(puVar2 + -0x10) = unaff_x29;
    *(undefined **)(puVar2 + -8) = puStack_8;
    uVar10 = *(ulong *)(uVar10 + 0x18);
    uVar9 = 1;
    puStack_8 = &UNK_005d2b08;
    puVar1 = puVar2 + -0x20;
    unaff_x29 = (undefined8 *******)(puVar2 + -0x10);
  }
  goto code_r0x00187bd4;
code_r0x00564e38:
  param_1 = (long *)*puVar14;
  unaff_x22 = puVar14;
  goto code_r0x00564e3c;
  while( true ) {
    unaff_x22 = unaff_x22 + 1;
    lVar5 = lVar5 + 1;
    if (lVar5 == 1) break;
code_r0x005651b8:
    lVar4 = *(long *)*unaff_x22;
    *(long *)*unaff_x22 = lVar4 + -1;
    LORelease();
    if (lVar4 == 1) {
      puStack_8 = &UNK_005651d8;
      unaff_x19 = puVar6;
      unaff_x20 = (ulong *)0xffffffffffffffff;
      unaff_x29 = pppppppuVar15;
      goto code_r0x005d2ac4;
    }
  }
code_r0x005651f0:
  if (puVar6[4] != 0) {
    func_0x00187bd4(puVar6[5],puVar6[4] << 3,8);
  }
  lVar5 = puVar6[9] + 1;
  uVar10 = puVar6[8];
  while (lVar5 = lVar5 + -1, lVar5 != 0) {
    func_0x00553cb8(uVar10);
    uVar10 = uVar10 + 0x40;
  }
  if (puVar6[7] == 0) {
    puVar7 = puVar6 + 10;
    plVar11 = (long *)*puVar7;
code_r0x005652d4:
    lVar5 = *plVar11;
    *plVar11 = lVar5 + -1;
    LORelease();
    if (lVar5 != 1) {
LAB_00565304:
      return;
    }
code_r0x005652e4:
    puVar3 = (undefined1 *)register0x00000008;
    puVar6 = unaff_x19;
    puVar12 = unaff_x20;
    pppppppuVar15 = unaff_x29;
code_r0x005d2c74:
    *(long *)(puVar3 + -0x40) = unaff_x24;
    *(undefined8 *)(puVar3 + -0x38) = 0;
    *(ulong **)(puVar3 + -0x30) = puVar14;
    *(ulong **)(puVar3 + -0x28) = unaff_x21;
    *(ulong **)(puVar3 + -0x20) = puVar12;
    *(ulong **)(puVar3 + -0x18) = puVar6;
    *(undefined8 ********)(puVar3 + -0x10) = pppppppuVar15;
    *(undefined **)(puVar3 + -8) = puStack_8;
    uVar10 = *puVar7;
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
  }
  else {
    uVar10 = puVar6[8];
    uVar8 = puVar6[7] << 6;
    uVar9 = 8;
    puStack_8 = (undefined *)0x5652d0;
    puVar1 = auStack_e0 + 0xa0;
    unaff_x29 = pppppppuVar15;
  }
  goto code_r0x00187bd4;
code_r0x00564be4:
  unaff_x21 = (ulong *)unaff_x19[4];
  puStack_8 = &UNK_00564bf0;
  register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x40);
  puVar7 = unaff_x21;
  puVar6 = unaff_x19;
  goto code_r0x005649d4;
  while (lVar5 = lVar5 + 0x10, uVar10 != 0) {
code_r0x00564ad4:
    uVar10 = uVar10 - 1;
    unaff_x22 = (ulong *)(lVar5 + -0x10);
    lVar4 = *(long *)*unaff_x22;
    *(long *)*unaff_x22 = lVar4 + -1;
    LORelease();
    if (lVar4 == 1) {
      puStack_8 = &UNK_00564af4;
      puVar2 = (undefined1 *)((long)register0x00000008 + -0x40);
      unaff_x20 = (ulong *)0xffffffffffffffff;
      goto code_r0x005d2ac4;
    }
  }
code_r0x00564cb0:
  if (unaff_x19[1] == 0) {
    return;
  }
  uVar10 = unaff_x19[2];
  uVar8 = unaff_x19[1] << 4;
code_r0x00564cf8:
  uVar9 = 8;
code_r0x00564cfc:
  puStack_8 = *(undefined **)((long)register0x00000008 + -8);
  puVar1 = (undefined1 *)register0x00000008;
  unaff_x29 = *(undefined8 ********)((long)register0x00000008 + -0x10);
code_r0x00187bd4:
  *(undefined8 ********)(puVar1 + -0x10) = unaff_x29;
  *(undefined **)(puVar1 + -8) = puStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar10,uVar8,uVar9);
  return;
}

