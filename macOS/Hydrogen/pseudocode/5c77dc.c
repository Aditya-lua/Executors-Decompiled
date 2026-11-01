
/* WARNING: Possible PIC construction at 0x005c7858: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005c78e0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005c740c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005c74b0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005c7410) */
/* WARNING: Removing unreachable block (ram,0x005c770c) */
/* WARNING: Removing unreachable block (ram,0x005c7418) */
/* WARNING: Removing unreachable block (ram,0x005c771c) */
/* WARNING: Removing unreachable block (ram,0x005c7438) */
/* WARNING: Removing unreachable block (ram,0x005c7460) */
/* WARNING: Removing unreachable block (ram,0x005c78e4) */
/* WARNING: Removing unreachable block (ram,0x005c7904) */
/* WARNING: Removing unreachable block (ram,0x005c7abc) */
/* WARNING: Removing unreachable block (ram,0x005c7920) */
/* WARNING: Removing unreachable block (ram,0x005c792c) */
/* WARNING: Removing unreachable block (ram,0x005c7a64) */
/* WARNING: Removing unreachable block (ram,0x005c7934) */
/* WARNING: Removing unreachable block (ram,0x005c7a78) */
/* WARNING: Removing unreachable block (ram,0x005c7a8c) */
/* WARNING: Removing unreachable block (ram,0x005c7940) */
/* WARNING: Removing unreachable block (ram,0x005c798c) */
/* WARNING: Removing unreachable block (ram,0x005c785c) */
/* WARNING: Removing unreachable block (ram,0x005c7ad0) */
/* WARNING: Removing unreachable block (ram,0x005c7864) */
/* WARNING: Removing unreachable block (ram,0x005c7ae0) */
/* WARNING: Removing unreachable block (ram,0x005c7884) */
/* WARNING: Removing unreachable block (ram,0x005c7994) */
/* WARNING: Removing unreachable block (ram,0x005c78ac) */
/* WARNING: Removing unreachable block (ram,0x005c78c8) */
/* WARNING: Removing unreachable block (ram,0x005c74b4) */
/* WARNING: Removing unreachable block (ram,0x005c74e0) */
/* WARNING: Removing unreachable block (ram,0x005c76f8) */
/* WARNING: Removing unreachable block (ram,0x005c74fc) */
/* WARNING: Removing unreachable block (ram,0x005c7508) */
/* WARNING: Removing unreachable block (ram,0x005c76a0) */
/* WARNING: Removing unreachable block (ram,0x005c7514) */
/* WARNING: Removing unreachable block (ram,0x005c76b8) */
/* WARNING: Removing unreachable block (ram,0x005c76cc) */
/* WARNING: Removing unreachable block (ram,0x005c7520) */
/* WARNING: Removing unreachable block (ram,0x005c748c) */
/* WARNING: Removing unreachable block (ram,0x005c758c) */
/* WARNING: Removing unreachable block (ram,0x005c7594) */

void thunk_FUN_005c780c(undefined8 param_1,undefined8 param_2,long param_3)

{
  ushort uVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  code *pcVar4;
  undefined1 *puVar5;
  long lVar6;
  long lVar7;
  long *plVar8;
  undefined8 *puVar9;
  undefined8 *extraout_x8;
  undefined8 *extraout_x8_00;
  undefined8 *puVar10;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  undefined8 *puVar11;
  undefined8 *unaff_x21;
  long lVar12;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  ulong uVar13;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  undefined8 unaff_x26;
  long unaff_x27;
  undefined8 unaff_x28;
  undefined1 *unaff_x29;
  undefined1 *puVar14;
  undefined8 uVar15;
  undefined *puVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined1 auVar21 [16];
  
  auVar3._8_8_ = unaff_x20;
  auVar3._0_8_ = unaff_x24;
  do {
    __Unwind_Resume(unaff_x19);
    func_0x007a2668();
    uVar15 = 0x5c781c;
    auVar21 = func_0x007a2668();
    puVar5 = (undefined1 *)register0x00000008;
    puVar14 = unaff_x29;
    auVar2 = auVar3;
    while( true ) {
      while( true ) {
        auVar3 = auVar21;
        lVar6 = auVar3._8_8_;
        puVar10 = auVar3._0_8_;
        *(undefined8 *)(puVar5 + -0x60) = unaff_x28;
        *(long *)(puVar5 + -0x58) = unaff_x27;
        *(undefined8 *)(puVar5 + -0x50) = unaff_x26;
        *(undefined8 *)(puVar5 + -0x48) = unaff_x25;
        *(long *)(puVar5 + -0x40) = auVar2._0_8_;
        *(undefined8 *)(puVar5 + -0x38) = unaff_x23;
        *(undefined8 *)(puVar5 + -0x30) = unaff_x22;
        *(undefined8 **)(puVar5 + -0x28) = unaff_x21;
        *(long *)(puVar5 + -0x20) = auVar2._8_8_;
        *(undefined8 *)(puVar5 + -0x18) = unaff_x19;
        *(undefined1 **)(puVar5 + -0x10) = puVar14;
        *(undefined8 *)(puVar5 + -8) = uVar15;
        unaff_x29 = puVar5 + -0x10;
        auVar2 = auVar3;
        if (param_3 == 0) break;
        param_3 = param_3 + -1;
        auVar21._8_8_ = *(undefined8 *)(lVar6 + 0x220);
        auVar21._0_8_ = puVar5 + -0x100;
        *(long *)(puVar5 + -0x108) = param_3;
        uVar15 = 0x5c785c;
        puVar5 = puVar5 + -0x110;
        puVar14 = unaff_x29;
      }
      lVar7 = func_0x00187bd0(0x220,8);
      if (lVar7 != 0) {
        *(undefined8 *)(lVar7 + 0x210) = 0;
        *(undefined2 *)(lVar7 + 0x21a) = 0;
        *(undefined8 *)(puVar5 + -0xe0) = 0;
        *(undefined8 *)(puVar5 + -0xd8) = 0;
        *(long *)(puVar5 + -0xe8) = lVar7;
        if (*(short *)(lVar6 + 0x21a) != 0) {
          uVar13 = 0;
          lVar12 = lVar6;
          do {
            func_0x005c8e40(puVar5 + -0xa0,lVar12);
            uVar1 = *(ushort *)(lVar7 + 0x21a);
            if (10 < uVar1) {
              *(ulong *)(puVar5 + -0xd8) = uVar13;
              func_0x007a247c(&UNK_008ae8ab,0x20,&UNK_009f1bb0);
                    /* WARNING: Does not return */
              pcVar4 = (code *)SoftwareBreakpoint(1,0x5c7af0);
              (*pcVar4)();
            }
            uVar13 = uVar13 + 1;
            *(ushort *)(lVar7 + 0x21a) = uVar1 + 1;
            puVar9 = (undefined8 *)(lVar7 + (ulong)uVar1 * 0x30);
            uVar15 = *(undefined8 *)(puVar5 + -0xa0);
            uVar18 = *(undefined8 *)(puVar5 + -0x88);
            uVar17 = *(undefined8 *)(puVar5 + -0x90);
            puVar9[1] = *(undefined8 *)(puVar5 + -0x98);
            *puVar9 = uVar15;
            puVar9[3] = uVar18;
            puVar9[2] = uVar17;
            uVar15 = *(undefined8 *)(puVar5 + -0x80);
            puVar9[5] = *(undefined8 *)(puVar5 + -0x78);
            puVar9[4] = uVar15;
            lVar12 = lVar12 + 0x30;
          } while (uVar13 < *(ushort *)(lVar6 + 0x21a));
          *(ulong *)(puVar5 + -0xd8) = uVar13;
        }
        uVar15 = *(undefined8 *)(puVar5 + -0xe8);
        puVar10[1] = *(undefined8 *)(puVar5 + -0xe0);
        *puVar10 = uVar15;
        puVar10[2] = *(undefined8 *)(puVar5 + -0xd8);
        return;
      }
      unaff_x19 = func_0x007a1f18(8,0x220);
      *(undefined8 *)(puVar5 + -0xd8) = unaff_x23;
      func_0x005c6058(puVar5 + -0xe8);
      __Unwind_Resume(unaff_x19);
      func_0x007a2668();
      puVar16 = (undefined *)0x5c7b94;
      plVar8 = (long *)func_0x007a2668();
      if (plVar8[2] == 0) {
        *extraout_x8 = 0;
        extraout_x8[2] = 0;
        return;
      }
      if (*plVar8 != 0) break;
      puVar14 = puVar5 + -0x120;
      *(undefined1 **)(puVar5 + -0x120) = unaff_x29;
      *(undefined8 *)(puVar5 + -0x118) = 0x5c7b94;
      uVar15 = 0x5c7bd0;
      plVar8 = (long *)func_0x007a23bc(&UNK_009f27f8);
      if (plVar8[2] == 0) {
        *extraout_x8_00 = 0;
        extraout_x8_00[2] = 0;
        return;
      }
      auVar21._8_8_ = *plVar8;
      auVar21._0_8_ = extraout_x8_00;
      if (*plVar8 == 0) {
        *(undefined1 **)(puVar5 + -0x130) = puVar5 + -0x120;
        *(undefined8 *)(puVar5 + -0x128) = 0x5c7bd0;
        plVar8 = (long *)func_0x007a23bc(&UNK_009f27f8);
        *(undefined1 **)(puVar5 + -0x140) = puVar5 + -0x130;
        *(undefined8 *)(puVar5 + -0x138) = 0x5c7c0c;
        lVar6 = *plVar8;
        if (lVar6 == 0) {
          lVar7 = 0;
        }
        else {
          lVar12 = plVar8[1];
          lVar7 = plVar8[2];
          *(undefined8 *)(puVar5 + -0x180) = 0;
          *(long *)(puVar5 + -0x178) = lVar6;
          *(long *)(puVar5 + -0x170) = lVar12;
          *(undefined8 *)(puVar5 + -0x160) = 0;
          *(long *)(puVar5 + -0x158) = lVar6;
          *(long *)(puVar5 + -0x150) = lVar12;
        }
        uVar13 = (ulong)(lVar6 != 0);
        *(ulong *)(puVar5 + -0x188) = uVar13;
        *(ulong *)(puVar5 + -0x168) = uVar13;
        *(long *)(puVar5 + -0x148) = lVar7;
        func_0x005c5fb0(puVar5 + -0x188);
        return;
      }
      param_3 = plVar8[1];
      puVar5 = puVar5 + -0x120;
    }
    param_3 = plVar8[1];
    puVar5 = puVar5 + -0x110;
    puVar9 = extraout_x8;
    lVar7 = *plVar8;
    puVar11 = unaff_x21;
    lVar12 = unaff_x27;
    while( true ) {
      unaff_x27 = lVar7;
      unaff_x21 = puVar9;
      register0x00000008 = (BADSPACEBASE *)(puVar5 + -0x150);
      *(undefined8 *)(puVar5 + -0x60) = unaff_x28;
      *(long *)(puVar5 + -0x58) = lVar12;
      *(undefined8 *)(puVar5 + -0x50) = unaff_x26;
      *(undefined8 *)(puVar5 + -0x48) = unaff_x25;
      *(undefined8 **)(puVar5 + -0x40) = puVar10;
      *(undefined8 *)(puVar5 + -0x38) = unaff_x23;
      *(undefined8 *)(puVar5 + -0x30) = unaff_x22;
      *(undefined8 **)(puVar5 + -0x28) = puVar11;
      *(long *)(puVar5 + -0x20) = lVar6;
      *(undefined8 *)(puVar5 + -0x18) = unaff_x19;
      *(undefined1 **)(puVar5 + -0x10) = unaff_x29;
      *(undefined **)(puVar5 + -8) = puVar16;
      unaff_x29 = puVar5 + -0x10;
      if (param_3 == 0) break;
      lVar7 = *(long *)(unaff_x27 + 0x328);
      param_3 = param_3 + -1;
      puVar9 = (undefined8 *)(puVar5 + -0x118);
      *(long *)(puVar5 + -0x120) = param_3;
      puVar16 = &UNK_005c7410;
      puVar5 = puVar5 + -0x150;
      puVar11 = unaff_x21;
      lVar12 = unaff_x27;
    }
    lVar6 = func_0x00187bd0(0x328,8);
    if (lVar6 != 0) {
      *(undefined8 *)(lVar6 + 0x210) = 0;
      *(undefined2 *)(lVar6 + 0x322) = 0;
      *(undefined8 *)(puVar5 + -0xf8) = 0;
      *(undefined8 *)(puVar5 + -0xf0) = 0;
      *(long *)(puVar5 + -0x100) = lVar6;
      if (*(short *)(unaff_x27 + 0x322) != 0) {
        uVar13 = 0;
        lVar7 = unaff_x27 + 0x218;
        lVar12 = unaff_x27;
        do {
          func_0x0045cd08(puVar5 + -0xe8,lVar7);
          func_0x005c8e40(puVar5 + -0xa0,lVar12);
          uVar1 = *(ushort *)(lVar6 + 0x322);
          if (10 < uVar1) {
            *(ulong *)(puVar5 + -0xf0) = uVar13;
            func_0x007a247c(&UNK_008ae8ab,0x20,&UNK_009f1bb0);
                    /* WARNING: Does not return */
            pcVar4 = (code *)SoftwareBreakpoint(1,0x5c772c);
            (*pcVar4)();
          }
          *(ushort *)(lVar6 + 0x322) = uVar1 + 1;
          uVar15 = *(undefined8 *)(puVar5 + -0xe8);
          puVar10 = (undefined8 *)(lVar6 + 0x218 + (ulong)uVar1 * 0x18);
          puVar10[1] = *(undefined8 *)(puVar5 + -0xe0);
          *puVar10 = uVar15;
          puVar10[2] = *(undefined8 *)(puVar5 + -0xd8);
          puVar10 = (undefined8 *)(lVar6 + (ulong)uVar1 * 0x30);
          uVar15 = *(undefined8 *)(puVar5 + -0xa0);
          uVar18 = *(undefined8 *)(puVar5 + -0x88);
          uVar17 = *(undefined8 *)(puVar5 + -0x90);
          uVar20 = *(undefined8 *)(puVar5 + -0x78);
          uVar19 = *(undefined8 *)(puVar5 + -0x80);
          puVar10[1] = *(undefined8 *)(puVar5 + -0x98);
          *puVar10 = uVar15;
          puVar10[3] = uVar18;
          puVar10[2] = uVar17;
          uVar13 = uVar13 + 1;
          puVar10[5] = uVar20;
          puVar10[4] = uVar19;
          lVar7 = lVar7 + 0x18;
          lVar12 = lVar12 + 0x30;
        } while (uVar13 < *(ushort *)(unaff_x27 + 0x322));
        *(ulong *)(puVar5 + -0xf0) = uVar13;
      }
      uVar15 = *(undefined8 *)(puVar5 + -0x100);
      unaff_x21[1] = *(undefined8 *)(puVar5 + -0xf8);
      *unaff_x21 = uVar15;
      unaff_x21[2] = *(undefined8 *)(puVar5 + -0xf0);
      return;
    }
    unaff_x19 = func_0x007a1f18(8,0x328);
    *(undefined8 *)(puVar5 + -0xf0) = unaff_x23;
    func_0x005c5ed4(puVar5 + -0x100);
  } while( true );
}

