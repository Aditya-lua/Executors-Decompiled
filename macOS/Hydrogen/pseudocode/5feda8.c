
long FUN_005feda8(void)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  undefined8 uVar3;
  int in_w4;
  undefined1 *puVar4;
  ulong uVar5;
  undefined1 *puVar6;
  undefined1 (*pauVar7) [16];
  ulong uVar8;
  long lVar9;
  undefined8 unaff_x19;
  ulong unaff_x20;
  undefined8 unaff_x21;
  undefined8 uVar10;
  undefined8 unaff_x22;
  undefined8 uVar11;
  undefined8 unaff_x24;
  undefined1 *unaff_x29;
  undefined8 uVar12;
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [12];
  
  auVar17._8_8_ = unaff_x22;
  auVar17._0_8_ = unaff_x19;
  do {
    puVar1 = auVar17._8_8_;
    *(undefined8 *)((long)register0x00000008 + 8) = 0xffffffffffffffff;
    *(ulong *)((long)register0x00000008 + 0x10) = unaff_x20;
    if (unaff_x20 == 0) {
      puVar2 = (undefined1 *)0x0;
      *(undefined8 *)((long)register0x00000008 + 0x18) = 0;
    }
    else {
      puVar2 = (undefined1 *)func_0x006115d0(unaff_x20);
      *(undefined1 **)((long)register0x00000008 + 0x18) = puVar2;
      puVar4 = puVar1 + unaff_x20;
      puVar6 = puVar2;
      if ((7 < unaff_x20) && ((puVar4 <= puVar2 || (puVar2 + unaff_x20 <= puVar1)))) {
        if (unaff_x20 < 0x40) {
          uVar5 = 0;
        }
        else {
          uVar8 = 0;
          uVar5 = unaff_x20 & 0xffffffffffffffc0;
          pauVar7 = (undefined1 (*) [16])(puVar1 + (unaff_x20 - 0x20));
          do {
            auVar17._0_8_ = (undefined8 *)(puVar2 + uVar8);
            auVar13 = NEON_rev64(pauVar7[1],1);
            auVar13 = NEON_ext(auVar13,auVar13,8,1);
            auVar14 = NEON_rev64(*pauVar7,1);
            auVar14 = NEON_ext(auVar14,auVar14,8,1);
            auVar15 = NEON_rev64(pauVar7[-1],1);
            auVar15 = NEON_ext(auVar15,auVar15,8,1);
            auVar16 = NEON_rev64(pauVar7[-2],1);
            auVar16 = NEON_ext(auVar16,auVar16,8,1);
            auVar17._0_8_[1] = auVar13._8_8_;
            *auVar17._0_8_ = auVar13._0_8_;
            auVar17._0_8_[3] = auVar14._8_8_;
            auVar17._0_8_[2] = auVar14._0_8_;
            auVar17._0_8_[5] = auVar15._8_8_;
            auVar17._0_8_[4] = auVar15._0_8_;
            auVar17._0_8_[7] = auVar16._8_8_;
            auVar17._0_8_[6] = auVar16._0_8_;
            uVar8 = uVar8 + 0x40;
            pauVar7 = pauVar7 + -4;
          } while (uVar5 != uVar8);
          if (uVar5 == unaff_x20) goto LAB_005feec4;
          if ((unaff_x20 & 0x38) == 0) {
            puVar4 = puVar4 + -uVar5;
            puVar6 = puVar2 + uVar5;
            goto LAB_005feeb4;
          }
        }
        uVar8 = unaff_x20 & 0xfffffffffffffff8;
        puVar6 = puVar2 + uVar8;
        puVar4 = puVar4 + -uVar8;
        lVar9 = (long)puVar1 - uVar5;
        do {
          lVar9 = lVar9 + -8;
          uVar12 = NEON_rev64(*(undefined8 *)(lVar9 + unaff_x20),1);
          *(undefined8 *)(puVar2 + uVar5) = uVar12;
          uVar5 = uVar5 + 8;
        } while (uVar8 != uVar5);
        if (uVar8 == unaff_x20) goto LAB_005feec4;
      }
LAB_005feeb4:
      do {
        puVar4 = puVar4 + -1;
        *puVar6 = *puVar4;
        puVar6 = puVar6 + 1;
      } while (puVar4 != puVar1);
    }
LAB_005feec4:
    func_0x0060ecc4((undefined1 *)((long)register0x00000008 + 0x20),puVar2,unaff_x20);
    uVar8 = unaff_x20;
    uVar12 = unaff_x21;
    func_0x005fe7ec(auVar17._0_8_,(undefined1 *)((long)register0x00000008 + 0x20));
    puVar1 = (undefined1 *)register0x00000008;
    uVar10 = unaff_x21;
    if (puVar2 != (undefined1 *)0x0) {
      for (; unaff_x20 != 0; unaff_x20 = unaff_x20 - 1) {
        puVar2[unaff_x20 - 1] = 0;
      }
      func_0x00611644(puVar2);
    }
    while( true ) {
      uVar11 = auVar17._8_8_;
      lVar9 = auVar17._0_8_;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
        return lVar9;
      }
      auVar18 = ___stack_chk_fail();
      uVar3 = auVar18._0_8_;
      unaff_x21 = uVar12;
      if (auVar18._8_4_ != 0) {
        uVar3 = func_0x0001753c(uVar3);
        func_0x005fde38(lVar9 + 8);
        unaff_x21 = uVar12;
      }
      auVar17 = __Unwind_Resume(uVar3);
      auVar17._0_8_ = auVar17._0_8_;
      register0x00000008 = (BADSPACEBASE *)(puVar1 + -0xa0);
      *(undefined8 *)(puVar1 + -0x40) = unaff_x24;
      *(undefined1 **)(puVar1 + -0x38) = puVar2;
      *(undefined8 *)(puVar1 + -0x30) = uVar11;
      *(undefined8 *)(puVar1 + -0x28) = uVar10;
      *(undefined8 *)(puVar1 + -0x20) = uVar3;
      *(long *)(puVar1 + -0x18) = lVar9;
      *(undefined1 **)(puVar1 + -0x10) = unaff_x29;
      *(undefined8 *)(puVar1 + -8) = 0x5fef78;
      unaff_x29 = puVar1 + -0x10;
      *(undefined8 *)(puVar1 + -0x48) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
      DataMemoryBarrier(2,3);
      if ((bRam0000000000a3c148 & 1) == 0) {
        puRam0000000000a2ab70 = &DAT_005f6230;
        puRam0000000000a2ab78 = &DAT_005f627c;
        puRam0000000000a2aa98 = &DAT_005f4e6c;
        puRam0000000000a2aaa0 = &DAT_005f4ed4;
        puRam0000000000a2aaa8 = &DAT_005f50a8;
        puRam0000000000a2ab28 = &DAT_005f5e0c;
        puRam0000000000a2ab30 = &DAT_005f5e38;
        puRam0000000000a2ab38 = &DAT_005f5eec;
        puRam0000000000a2aae0 = &DAT_005f57fc;
        puRam0000000000a2aae8 = &DAT_005f5844;
        puRam0000000000a2aaf0 = &DAT_005f5984;
        puRam0000000000a2ab80 = &DAT_005f63c0;
        puRam0000000000a2aab8 = &DAT_005f6838;
        puRam0000000000a2ab48 = &DAT_005f9574;
        puRam0000000000a2ab00 = &DAT_005f850c;
        puRam0000000000a2ab90 = &DAT_005fa300;
        bRam0000000000a3c148 = 1;
        DataMemoryBarrier(2,3);
      }
      *auVar17._0_8_ = &UNK_009f5d60;
      auVar17._0_8_[3] = 0;
      auVar17._0_8_[4] = 0;
      auVar17._0_8_[2] = 0x1fffffffffffffff;
      unaff_x20 = uVar8;
      if (in_w4 == 0) break;
      func_0x0060ecc4(puVar1 + -0x80,auVar17._8_8_,uVar8);
      uVar12 = unaff_x21;
      func_0x005fe7ec(auVar17._0_8_,puVar1 + -0x80);
      puVar1 = puVar1 + -0xa0;
      uVar10 = unaff_x21;
    }
  } while( true );
}

