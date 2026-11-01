
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void thunk_FUN_001c94dc(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  undefined *puVar1;
  undefined *puVar2;
  undefined1 *puVar3;
  ulong uVar4;
  undefined8 uVar5;
  undefined *puVar6;
  undefined *puVar7;
  undefined *puVar8;
  undefined *puVar9;
  undefined *puVar10;
  undefined *puVar11;
  undefined1 *puVar12;
  ulong uVar13;
  code *pcVar14;
  ulong *puVar15;
  ulong uVar16;
  undefined8 *extraout_x8;
  undefined1 *puVar17;
  ulong uVar18;
  undefined1 *puVar19;
  ulong extraout_x10;
  ulong extraout_x11;
  ulong uVar20;
  undefined1 auVar21 [16];
  undefined *puStack_100;
  long lStack_f8;
  long lStack_f0;
  undefined1 *puStack_e8;
  ulong uStack_e0;
  ulong uStack_d8;
  undefined8 uStack_d0;
  undefined *puStack_c0;
  undefined *puStack_b8;
  undefined *puStack_b0;
  undefined *puStack_a8;
  undefined1 *puStack_a0;
  ulong uStack_98;
  ulong uStack_90;
  undefined8 uStack_88;
  long lStack_78;
  undefined1 *puStack_70;
  ulong uStack_68;
  
  func_0x001bfe00();
  __Unwind_Resume();
  auVar21 = func_0x007a2668();
  puVar15 = auVar21._0_8_;
  uVar20 = *puVar15;
  uVar18 = puVar15[1];
  if (param_3 != uVar20 + uVar18) {
LAB_001c9584:
    extraout_x8[6] = 0;
    extraout_x8[7] = 0;
    extraout_x8[2] = 0x1a;
    extraout_x8[3] = 0;
    extraout_x8[4] = 0;
    extraout_x8[5] = 0;
    uVar5 = _UNK_0081e800;
    extraout_x8[1] = _UNK_0081e808;
    *extraout_x8 = uVar5;
    return;
  }
  uVar4 = puVar15[3];
  if ((uVar4 & 1) == 0) {
    if (uVar20 <= param_3) goto code_r0x001c95ac;
    puStack_c0 = &UNK_009c28c0;
    puStack_b8 = (undefined *)0x1;
    puStack_a8 = (undefined *)0x0;
    puStack_a0 = (undefined1 *)0x0;
    puStack_b0 = (undefined *)0x8;
    func_0x007a2420(&puStack_c0,&UNK_009c2a10);
    uVar13 = extraout_x10;
    uVar18 = extraout_x11;
  }
  else {
    uVar20 = uVar18;
    if (param_3 < uVar18) {
      puStack_c0 = &UNK_009c28c0;
      puStack_b8 = (undefined *)0x1;
      puStack_a8 = (undefined *)0x0;
      puStack_a0 = (undefined1 *)0x0;
      puStack_b0 = (undefined *)0x8;
      func_0x007a2420(&puStack_c0,&UNK_009c2a28);
      goto LAB_001c9584;
    }
code_r0x001c95ac:
    uStack_90 = 0;
    puStack_b8 = _UNK_0081e2a8;
    puStack_c0 = _UNK_0081e2a0;
    puStack_a8 = (undefined *)_UNK_0081e2b8;
    puStack_b0 = (undefined *)_UNK_0081e2b0;
    uStack_98 = _UNK_0081e2c8;
    puStack_a0 = _UNK_0081e2c0;
    func_0x001be268(&puStack_c0);
    (**(code **)(puVar15[5] + 0x28))(&puStack_c0,puVar15[4],auVar21._8_8_ + uVar20,param_3 - uVar20)
    ;
    uVar13 = uStack_90;
    uVar18 = uStack_98;
    puVar12 = puStack_a0;
    puVar10 = puStack_a8;
    puVar1 = puStack_b0;
    puVar7 = puStack_b8;
    puVar2 = puStack_c0;
    if (puStack_c0 == (undefined1 *)0x8000000000000000) {
      extraout_x8[2] = puStack_b0;
      extraout_x8[1] = puStack_b8;
      extraout_x8[4] = puStack_a0;
      extraout_x8[3] = puStack_a8;
      extraout_x8[6] = uStack_90;
      extraout_x8[5] = uStack_98;
      extraout_x8[7] = uStack_88;
      *extraout_x8 = 0x8000000000000000;
      return;
    }
    (**(code **)(puVar15[7] + 0x28))(&puStack_c0,puVar15[6],auVar21._8_8_,uVar20);
    uVar16 = uStack_90;
    uVar20 = uStack_98;
    puVar3 = puStack_a0;
    puVar11 = puStack_a8;
    puVar9 = puStack_b0;
    puVar8 = puStack_b8;
    puVar6 = puStack_c0;
    lStack_f8 = (long)puStack_b0;
    puStack_100 = puStack_b8;
    puStack_e8 = puStack_a0;
    lStack_f0 = (long)puStack_a8;
    uStack_d8 = uStack_90;
    uStack_e0 = uStack_98;
    uStack_d0 = uStack_88;
    if (puStack_c0 == (undefined1 *)0x8000000000000000) {
      extraout_x8[2] = puStack_b0;
      extraout_x8[1] = puStack_b8;
      extraout_x8[4] = puStack_a0;
      extraout_x8[3] = puStack_a8;
      extraout_x8[6] = uStack_90;
      extraout_x8[5] = uStack_98;
      extraout_x8[7] = uStack_88;
      *extraout_x8 = 0x8000000000000000;
      if (puVar2 != (undefined1 *)0x0) {
        func_0x00187bd4(puVar7,puVar2,1);
      }
      puVar2 = puVar10;
      puVar3 = puVar12;
      if (uVar18 != 0) {
        puVar19 = puVar12;
        do {
          *puVar19 = 0;
          uVar18 = uVar18 - 1;
          puVar19 = puVar19 + 1;
        } while (uVar18 != 0);
      }
      for (; puVar2 != (undefined *)0x0; puVar2 = (undefined *)((long)puVar2 + -1)) {
        *puVar3 = 0;
        puVar3 = puVar3 + 1;
      }
code_r0x001c9898:
      if (puVar10 == (undefined *)0x0) {
        return;
      }
      func_0x00187bd4(puVar12,puVar10,1);
      return;
    }
    if ((uVar4 & 1) == 0) {
      puStack_c0 = puVar7;
      puStack_b8 = puVar1;
      puStack_b0 = puVar8;
      puStack_a8 = puVar9;
      func_0x001e1508(&puStack_100,&puStack_c0,2);
    }
    else {
      puStack_c0 = puStack_b8;
      puStack_b8 = puStack_b0;
      puStack_b0 = puVar7;
      puStack_a8 = puVar1;
      func_0x001e1508(&puStack_100,&puStack_c0,2);
    }
    if (uVar20 < uVar16) goto code_r0x001c9900;
    if (uVar13 <= uVar18) {
      puStack_b0 = puVar3 + uVar16;
      puStack_c0 = puVar12 + uVar13;
      if ((uVar4 & 1) == 0) {
        puStack_b8 = (undefined *)(uVar18 - uVar13);
        puStack_a8 = (undefined *)(uVar20 - uVar16);
        func_0x001e1508(&lStack_78,&puStack_c0,2);
      }
      else {
        puVar19 = puStack_c0;
        puStack_c0 = puStack_b0;
        puStack_b8 = (undefined *)(uVar20 - uVar16);
        puStack_b0 = puVar19;
        puStack_a8 = (undefined *)(uVar18 - uVar13);
        func_0x001e1508(&lStack_78,&puStack_c0,2);
      }
      uVar4 = puVar15[8];
      puStack_a0 = puStack_70;
      puStack_a8 = (undefined *)lStack_78;
      puStack_b0 = (undefined *)lStack_f0;
      uStack_98 = uStack_68;
      extraout_x8[1] = lStack_f8;
      *extraout_x8 = puStack_100;
      extraout_x8[3] = lStack_78;
      extraout_x8[2] = lStack_f0;
      extraout_x8[5] = uStack_68;
      extraout_x8[4] = puStack_70;
      extraout_x8[6] = 0;
      *(int *)(extraout_x8 + 7) = (int)uVar4;
      if (puVar6 != (undefined1 *)0x0) {
        func_0x00187bd4(puVar8,puVar6,1);
      }
      puVar1 = puVar11;
      puVar19 = puVar3;
      if (uVar20 != 0) {
        puVar17 = puVar3;
        do {
          *puVar17 = 0;
          uVar20 = uVar20 - 1;
          puVar17 = puVar17 + 1;
        } while (uVar20 != 0);
      }
      for (; puVar1 != (undefined *)0x0; puVar1 = (undefined *)((long)puVar1 + -1)) {
        *puVar19 = 0;
        puVar19 = puVar19 + 1;
      }
      if (puVar11 != (undefined *)0x0) {
        func_0x00187bd4(puVar3,puVar11,1);
      }
      if (puVar2 != (undefined1 *)0x0) {
        func_0x00187bd4(puVar7,puVar2,1);
      }
      puVar2 = puVar10;
      puVar3 = puVar12;
      if (uVar18 != 0) {
        puVar19 = puVar12;
        do {
          *puVar19 = 0;
          uVar18 = uVar18 - 1;
          puVar19 = puVar19 + 1;
        } while (uVar18 != 0);
      }
      for (; puVar2 != (undefined *)0x0; puVar2 = (undefined *)((long)puVar2 + -1)) {
        *puVar3 = 0;
        puVar3 = puVar3 + 1;
      }
      goto code_r0x001c9898;
    }
  }
  uVar16 = uVar13;
  uVar20 = uVar18;
code_r0x001c9900:
  func_0x007a28a4(uVar16,uVar20,&UNK_009c82e0);
                    /* WARNING: Does not return */
  pcVar14 = (code *)SoftwareBreakpoint(1,0x1c9914);
  (*pcVar14)();
}

