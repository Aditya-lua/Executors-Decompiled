
/* WARNING: Possible PIC construction at 0x005c740c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005c74b0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005c7858: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005c78e0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005c785c) */
/* WARNING: Removing unreachable block (ram,0x005c7ad0) */
/* WARNING: Removing unreachable block (ram,0x005c7864) */
/* WARNING: Removing unreachable block (ram,0x005c7ae0) */
/* WARNING: Removing unreachable block (ram,0x005c7884) */
/* WARNING: Removing unreachable block (ram,0x005c78ac) */
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
/* WARNING: Removing unreachable block (ram,0x005c758c) */
/* WARNING: Removing unreachable block (ram,0x005c7410) */
/* WARNING: Removing unreachable block (ram,0x005c770c) */
/* WARNING: Removing unreachable block (ram,0x005c7418) */
/* WARNING: Removing unreachable block (ram,0x005c771c) */
/* WARNING: Removing unreachable block (ram,0x005c7438) */
/* WARNING: Removing unreachable block (ram,0x005c7594) */
/* WARNING: Removing unreachable block (ram,0x005c7460) */
/* WARNING: Removing unreachable block (ram,0x005c748c) */
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
/* WARNING: Removing unreachable block (ram,0x005c78c8) */
/* WARNING: Removing unreachable block (ram,0x005c798c) */
/* WARNING: Removing unreachable block (ram,0x005c7994) */

void FUN_005c7b2c(void)

{
  ushort uVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  code *pcVar4;
  undefined1 *puVar5;
  long *plVar6;
  long lVar7;
  long lVar8;
  undefined8 *puVar9;
  undefined8 *extraout_x8;
  undefined8 *extraout_x8_00;
  undefined8 *puVar10;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  undefined8 *unaff_x21;
  long lVar11;
  undefined8 unaff_x22;
  ulong uVar12;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  undefined8 unaff_x26;
  long unaff_x27;
  undefined8 unaff_x28;
  undefined1 *puVar13;
  undefined1 *unaff_x29;
  undefined *puVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined1 auVar20 [16];
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000070;
  
  auVar2._8_8_ = unaff_x20;
  auVar2._0_8_ = unaff_x24;
  func_0x007a200c(&uStack0000000000000070);
  func_0x005c6058(&uStack0000000000000010);
  do {
    __Unwind_Resume(unaff_x19);
    func_0x007a2668();
    puVar14 = (undefined *)0x5c7b94;
    plVar6 = (long *)func_0x007a2668();
    if (plVar6[2] == 0) {
      *extraout_x8 = 0;
      extraout_x8[2] = 0;
      return;
    }
    auVar3 = auVar2;
    if (*plVar6 == 0) {
      puVar5 = (undefined1 *)((long)register0x00000008 + -0x10);
      puVar13 = (undefined1 *)((long)register0x00000008 + -0x10);
      *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined8 *)((long)register0x00000008 + -8) = 0x5c7b94;
      puVar14 = (undefined *)0x5c7bd0;
      plVar6 = (long *)func_0x007a23bc(&UNK_009f27f8);
      if (plVar6[2] == 0) {
        *extraout_x8_00 = 0;
        extraout_x8_00[2] = 0;
        return;
      }
      auVar20._8_8_ = *plVar6;
      auVar20._0_8_ = extraout_x8_00;
      if (*plVar6 == 0) {
        *(undefined1 **)((long)register0x00000008 + -0x20) =
             (undefined1 *)((long)register0x00000008 + -0x10);
        *(undefined8 *)((long)register0x00000008 + -0x18) = 0x5c7bd0;
        plVar6 = (long *)func_0x007a23bc(&UNK_009f27f8);
        *(undefined1 **)((long)register0x00000008 + -0x30) =
             (undefined1 *)((long)register0x00000008 + -0x20);
        *(undefined8 *)((long)register0x00000008 + -0x28) = 0x5c7c0c;
        lVar8 = *plVar6;
        if (lVar8 == 0) {
          lVar7 = 0;
        }
        else {
          lVar11 = plVar6[1];
          lVar7 = plVar6[2];
          *(undefined8 *)((long)register0x00000008 + -0x70) = 0;
          *(long *)((long)register0x00000008 + -0x68) = lVar8;
          *(long *)((long)register0x00000008 + -0x60) = lVar11;
          *(undefined8 *)((long)register0x00000008 + -0x50) = 0;
          *(long *)((long)register0x00000008 + -0x48) = lVar8;
          *(long *)((long)register0x00000008 + -0x40) = lVar11;
        }
        uVar12 = (ulong)(lVar8 != 0);
        *(ulong *)((long)register0x00000008 + -0x78) = uVar12;
        *(ulong *)((long)register0x00000008 + -0x58) = uVar12;
        *(long *)((long)register0x00000008 + -0x38) = lVar7;
        func_0x005c5fb0((undefined1 *)((long)register0x00000008 + -0x78));
        return;
      }
      lVar8 = plVar6[1];
    }
    else {
      lVar8 = plVar6[1];
      puVar5 = (undefined1 *)register0x00000008;
      puVar10 = extraout_x8;
      lVar7 = *plVar6;
      puVar9 = unaff_x21;
      lVar11 = unaff_x27;
      puVar13 = unaff_x29;
      while( true ) {
        unaff_x27 = lVar7;
        unaff_x21 = puVar10;
        *(undefined8 *)(puVar5 + -0x60) = unaff_x28;
        *(long *)(puVar5 + -0x58) = lVar11;
        *(undefined8 *)(puVar5 + -0x50) = unaff_x26;
        *(undefined8 *)(puVar5 + -0x48) = unaff_x25;
        *(long *)(puVar5 + -0x40) = auVar2._0_8_;
        *(undefined8 *)(puVar5 + -0x38) = unaff_x23;
        *(undefined8 *)(puVar5 + -0x30) = unaff_x22;
        *(undefined8 **)(puVar5 + -0x28) = puVar9;
        *(long *)(puVar5 + -0x20) = auVar2._8_8_;
        *(undefined8 *)(puVar5 + -0x18) = unaff_x19;
        *(undefined1 **)(puVar5 + -0x10) = puVar13;
        *(undefined **)(puVar5 + -8) = puVar14;
        puVar13 = puVar5 + -0x10;
        if (lVar8 == 0) break;
        lVar7 = *(long *)(unaff_x27 + 0x328);
        lVar8 = lVar8 + -1;
        puVar10 = (undefined8 *)(puVar5 + -0x118);
        *(long *)(puVar5 + -0x120) = lVar8;
        puVar14 = &UNK_005c7410;
        puVar5 = puVar5 + -0x150;
        puVar9 = unaff_x21;
        lVar11 = unaff_x27;
      }
      lVar7 = func_0x00187bd0(0x328,8);
      if (lVar7 != 0) {
        *(undefined8 *)(lVar7 + 0x210) = 0;
        *(undefined2 *)(lVar7 + 0x322) = 0;
        *(undefined8 *)(puVar5 + -0xf8) = 0;
        *(undefined8 *)(puVar5 + -0xf0) = 0;
        *(long *)(puVar5 + -0x100) = lVar7;
        if (*(short *)(unaff_x27 + 0x322) != 0) {
          uVar12 = 0;
          lVar8 = unaff_x27 + 0x218;
          lVar11 = unaff_x27;
          do {
            func_0x0045cd08(puVar5 + -0xe8,lVar8);
            func_0x005c8e40(puVar5 + -0xa0,lVar11);
            uVar1 = *(ushort *)(lVar7 + 0x322);
            if (10 < uVar1) {
              *(ulong *)(puVar5 + -0xf0) = uVar12;
              func_0x007a247c(&UNK_008ae8ab,0x20,&UNK_009f1bb0);
                    /* WARNING: Does not return */
              pcVar4 = (code *)SoftwareBreakpoint(1,0x5c772c);
              (*pcVar4)();
            }
            *(ushort *)(lVar7 + 0x322) = uVar1 + 1;
            uVar15 = *(undefined8 *)(puVar5 + -0xe8);
            puVar10 = (undefined8 *)(lVar7 + 0x218 + (ulong)uVar1 * 0x18);
            puVar10[1] = *(undefined8 *)(puVar5 + -0xe0);
            *puVar10 = uVar15;
            puVar10[2] = *(undefined8 *)(puVar5 + -0xd8);
            puVar10 = (undefined8 *)(lVar7 + (ulong)uVar1 * 0x30);
            uVar15 = *(undefined8 *)(puVar5 + -0xa0);
            uVar17 = *(undefined8 *)(puVar5 + -0x88);
            uVar16 = *(undefined8 *)(puVar5 + -0x90);
            uVar19 = *(undefined8 *)(puVar5 + -0x78);
            uVar18 = *(undefined8 *)(puVar5 + -0x80);
            puVar10[1] = *(undefined8 *)(puVar5 + -0x98);
            *puVar10 = uVar15;
            puVar10[3] = uVar17;
            puVar10[2] = uVar16;
            uVar12 = uVar12 + 1;
            puVar10[5] = uVar19;
            puVar10[4] = uVar18;
            lVar8 = lVar8 + 0x18;
            lVar11 = lVar11 + 0x30;
          } while (uVar12 < *(ushort *)(unaff_x27 + 0x322));
          *(ulong *)(puVar5 + -0xf0) = uVar12;
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
      __Unwind_Resume(unaff_x19);
      func_0x007a2668();
      puVar14 = &LAB_005c781c;
      auVar20 = func_0x007a2668();
      puVar5 = puVar5 + -0x150;
    }
    while( true ) {
      auVar2 = auVar20;
      lVar7 = auVar2._8_8_;
      puVar10 = auVar2._0_8_;
      register0x00000008 = (BADSPACEBASE *)(puVar5 + -0x110);
      *(undefined8 *)(puVar5 + -0x60) = unaff_x28;
      *(long *)(puVar5 + -0x58) = unaff_x27;
      *(undefined8 *)(puVar5 + -0x50) = unaff_x26;
      *(undefined8 *)(puVar5 + -0x48) = unaff_x25;
      *(long *)(puVar5 + -0x40) = auVar3._0_8_;
      *(undefined8 *)(puVar5 + -0x38) = unaff_x23;
      *(undefined8 *)(puVar5 + -0x30) = unaff_x22;
      *(undefined8 **)(puVar5 + -0x28) = unaff_x21;
      *(long *)(puVar5 + -0x20) = auVar3._8_8_;
      *(undefined8 *)(puVar5 + -0x18) = unaff_x19;
      *(undefined1 **)(puVar5 + -0x10) = puVar13;
      *(undefined **)(puVar5 + -8) = puVar14;
      puVar13 = puVar5 + -0x10;
      if (lVar8 == 0) break;
      lVar8 = lVar8 + -1;
      auVar20._8_8_ = *(undefined8 *)(lVar7 + 0x220);
      auVar20._0_8_ = puVar5 + -0x100;
      *(long *)(puVar5 + -0x108) = lVar8;
      puVar14 = &UNK_005c785c;
      puVar5 = puVar5 + -0x110;
      auVar3 = auVar2;
    }
    lVar8 = func_0x00187bd0(0x220,8);
    if (lVar8 != 0) {
      *(undefined8 *)(lVar8 + 0x210) = 0;
      *(undefined2 *)(lVar8 + 0x21a) = 0;
      *(undefined8 *)(puVar5 + -0xe0) = 0;
      *(undefined8 *)(puVar5 + -0xd8) = 0;
      *(long *)(puVar5 + -0xe8) = lVar8;
      if (*(short *)(lVar7 + 0x21a) != 0) {
        uVar12 = 0;
        lVar11 = lVar7;
        do {
          func_0x005c8e40(puVar5 + -0xa0,lVar11);
          uVar1 = *(ushort *)(lVar8 + 0x21a);
          if (10 < uVar1) {
            *(ulong *)(puVar5 + -0xd8) = uVar12;
            func_0x007a247c(&UNK_008ae8ab,0x20,&UNK_009f1bb0);
                    /* WARNING: Does not return */
            pcVar4 = (code *)SoftwareBreakpoint(1,0x5c7af0);
            (*pcVar4)();
          }
          uVar12 = uVar12 + 1;
          *(ushort *)(lVar8 + 0x21a) = uVar1 + 1;
          puVar9 = (undefined8 *)(lVar8 + (ulong)uVar1 * 0x30);
          uVar15 = *(undefined8 *)(puVar5 + -0xa0);
          uVar17 = *(undefined8 *)(puVar5 + -0x88);
          uVar16 = *(undefined8 *)(puVar5 + -0x90);
          puVar9[1] = *(undefined8 *)(puVar5 + -0x98);
          *puVar9 = uVar15;
          puVar9[3] = uVar17;
          puVar9[2] = uVar16;
          uVar15 = *(undefined8 *)(puVar5 + -0x80);
          puVar9[5] = *(undefined8 *)(puVar5 + -0x78);
          puVar9[4] = uVar15;
          lVar11 = lVar11 + 0x30;
        } while (uVar12 < *(ushort *)(lVar7 + 0x21a));
        *(ulong *)(puVar5 + -0xd8) = uVar12;
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
    unaff_x29 = puVar13;
  } while( true );
}

