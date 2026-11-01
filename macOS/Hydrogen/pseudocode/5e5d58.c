
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005e5d58(void)

{
  long lVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
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
  code *pcVar17;
  bool bVar18;
  long *plVar19;
  ulong uVar20;
  undefined8 *extraout_x8;
  ulong uVar21;
  long lVar22;
  long lVar23;
  long lVar24;
  long lVar25;
  ulong *puVar26;
  long *plVar27;
  long lVar28;
  
  __Unwind_Resume();
  lVar22 = lRam0000000000a3c0d0 + 1;
  lRam0000000000a3c0d0 = lRam0000000000a3c0d0 + 1;
code_r0x005e5da8:
  if (___ZN16parking_lot_core11parking_lot9HASHTABLE17hce05feacc4d0b3c3E == (long *)0x0) {
    plVar19 = (long *)func_0x007b0c50();
    uVar21 = plVar19[1];
  }
  else {
    uVar21 = ___ZN16parking_lot_core11parking_lot9HASHTABLE17hce05feacc4d0b3c3E[1];
    plVar19 = ___ZN16parking_lot_core11parking_lot9HASHTABLE17hce05feacc4d0b3c3E;
  }
  if ((ulong)(lVar22 * 3) <= uVar21) goto code_r0x005e5f78;
  if (uVar21 != 0) {
    plVar27 = (long *)*plVar19;
    lVar28 = uVar21 << 6;
    do {
      while (*plVar27 != 0) {
        func_0x007b0d40(plVar27);
        plVar27 = plVar27 + 8;
        lVar28 = lVar28 + -0x40;
        if (lVar28 == 0) goto code_r0x005e5dfc;
      }
      *plVar27 = 1;
      plVar27 = plVar27 + 8;
      lVar28 = lVar28 + -0x40;
    } while (lVar28 != 0);
  }
code_r0x005e5dfc:
  if (___ZN16parking_lot_core11parking_lot9HASHTABLE17hce05feacc4d0b3c3E != plVar19) {
    if (plVar19[1] != 0) {
      puVar26 = (ulong *)*plVar19;
      lVar28 = plVar19[1] << 6;
      do {
        while( true ) {
          uVar21 = *puVar26;
          *puVar26 = uVar21 - 1;
          LORelease();
          if (3 < uVar21 && (uVar21 & 2) == 0) break;
          puVar26 = puVar26 + 8;
          lVar28 = lVar28 + -0x40;
          if (lVar28 == 0) goto code_r0x005e5da8;
        }
        func_0x007b0f88(puVar26);
        puVar26 = puVar26 + 8;
        lVar28 = lVar28 + -0x40;
      } while (lVar28 != 0);
    }
    goto code_r0x005e5da8;
  }
  plVar27 = (long *)func_0x005e5b38(lVar22,plVar19);
  lVar22 = plVar19[1];
  if (lVar22 == 0) {
    ___ZN16parking_lot_core11parking_lot9HASHTABLE17hce05feacc4d0b3c3E = plVar27;
  }
  else {
    lVar23 = *plVar19;
    lVar28 = lVar23;
    lVar24 = lVar23 + 0x40;
    do {
      if (*(long *)(lVar28 + 8) != 0) {
        lVar3 = plVar27[3];
        lVar2 = *plVar27;
        uVar21 = plVar27[1];
        lVar28 = *(long *)(lVar28 + 8);
        do {
          while( true ) {
            lVar25 = *(long *)(lVar28 + 0x80);
            uVar20 = (ulong)(*(long *)(lVar28 + 0x78) * -0x61c8864680b583eb) >>
                     (-(int)lVar3 & 0x3fU);
            if (uVar21 <= uVar20) {
              func_0x007a2570(uVar20,uVar21,&UNK_009f3960);
                    /* WARNING: Does not return */
              pcVar17 = (code *)SoftwareBreakpoint(1,0x5e5ffc);
              (*pcVar17)();
            }
            lVar1 = lVar2 + uVar20 * 0x40;
            if (*(long *)(lVar1 + 0x10) != 0) break;
            *(long *)(lVar1 + 8) = lVar28;
            *(long *)(lVar1 + 0x10) = lVar28;
            *(undefined8 *)(lVar28 + 0x80) = 0;
            lVar28 = lVar25;
            if (lVar25 == 0) goto code_r0x005e5ea4;
          }
          *(long *)(*(long *)(lVar1 + 0x10) + 0x80) = lVar28;
          *(long *)(lVar1 + 0x10) = lVar28;
          *(undefined8 *)(lVar28 + 0x80) = 0;
          lVar28 = lVar25;
        } while (lVar25 != 0);
      }
code_r0x005e5ea4:
      bVar18 = lVar24 != lVar23 + lVar22 * 0x40;
      lVar28 = lVar24;
      lVar24 = lVar24 + (ulong)bVar18 * 0x40;
    } while (bVar18);
    ___ZN16parking_lot_core11parking_lot9HASHTABLE17hce05feacc4d0b3c3E = plVar27;
    if (plVar19[1] != 0) {
      puVar26 = (ulong *)*plVar19;
      lVar22 = plVar19[1] << 6;
      do {
        while( true ) {
          uVar21 = *puVar26;
          *puVar26 = uVar21 - 1;
          LORelease();
          if (3 < uVar21 && (uVar21 & 2) == 0) break;
          puVar26 = puVar26 + 8;
          lVar22 = lVar22 + -0x40;
          if (lVar22 == 0) goto code_r0x005e5f78;
        }
        func_0x007b0f88(puVar26);
        puVar26 = puVar26 + 8;
        lVar22 = lVar22 + -0x40;
      } while (lVar22 != 0);
    }
  }
code_r0x005e5f78:
  uVar16 = _UNK_008b9818;
  uVar15 = _UNK_008b9810;
  uVar14 = _UNK_008b9808;
  uVar13 = _UNK_008b9800;
  uVar12 = _UNK_008b97f8;
  uVar11 = _UNK_008b97f0;
  uVar10 = _UNK_008b97e8;
  uVar9 = _UNK_008b97e0;
  uVar8 = _UNK_008b97d8;
  uVar7 = _UNK_008b97d0;
  uVar6 = _UNK_008b97c8;
  uVar5 = _UNK_008b97c0;
  uVar4 = _UNK_008b97b0;
  extraout_x8[1] = _UNK_008b97b8;
  *extraout_x8 = uVar4;
  extraout_x8[3] = uVar6;
  extraout_x8[2] = uVar5;
  extraout_x8[0xb] = uVar14;
  extraout_x8[10] = uVar13;
  extraout_x8[0xd] = uVar16;
  extraout_x8[0xc] = uVar15;
  extraout_x8[7] = uVar10;
  extraout_x8[6] = uVar9;
  extraout_x8[9] = uVar12;
  extraout_x8[8] = uVar11;
  extraout_x8[5] = uVar8;
  extraout_x8[4] = uVar7;
  *(undefined2 *)(extraout_x8 + 0xe) = 0;
  extraout_x8[0x10] = 0;
  extraout_x8[0xf] = 0;
  extraout_x8[0x12] = 0;
  extraout_x8[0x11] = 0;
  *(undefined1 *)(extraout_x8 + 0x13) = 0;
  return;
}

