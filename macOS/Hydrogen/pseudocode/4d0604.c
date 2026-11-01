
void FUN_004d0604(undefined8 param_1)

{
  uint uVar1;
  int iVar2;
  int *piVar3;
  undefined8 uVar4;
  ulong uVar5;
  long *extraout_x8;
  long lVar6;
  long lVar7;
  ulong *extraout_x8_00;
  ulong uVar8;
  long *plVar9;
  int iVar10;
  ulong uVar11;
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 uStack0000000000000008;
  ulong uStack_150;
  long lStack_148;
  long lStack_140;
  long lStack_138;
  long lStack_130;
  ulong *puStack_128;
  undefined8 uStack_120;
  ulong uStack_118;
  long lStack_b8;
  int *piStack_b0;
  long lStack_a8;
  long *plStack_a0;
  long *plStack_98;
  undefined8 uStack_90;
  long lStack_88;
  int *piStack_80;
  long lStack_78;
  long lStack_70;
  int **ppiStack_68;
  long *plStack_60;
  int iStack_54;
  
  func_0x004cb834(&uStack0000000000000008);
  __Unwind_Resume(param_1);
  auVar12 = func_0x007a2668();
  auVar12._8_8_ = auVar12._8_8_;
  plVar9 = auVar12._0_8_;
  plStack_98 = plVar9 + 5;
  plStack_a0 = plVar9 + 4;
  do {
    do {
      if ((ulong)*(uint *)(plVar9 + 2) < (ulong)plVar9[1]) {
        lVar6 = *plVar9 + (ulong)*(uint *)(plVar9 + 2) * 0x30;
        *(undefined4 *)(plVar9 + 2) = *(undefined4 *)(lVar6 + 0x20);
        iVar10 = *(int *)(lVar6 + 0x2c);
      }
      else {
        uVar1 = *(uint *)((long)plVar9 + 0x14);
        do {
          if ((ulong)plVar9[1] <= (ulong)uVar1) {
            *extraout_x8 = 0;
            extraout_x8[1] = 4;
            extraout_x8[2] = 0;
            return;
          }
          lVar6 = *plVar9 + (ulong)uVar1 * 0x30;
          uVar1 = *(uint *)(lVar6 + 0x24);
          *(uint *)((long)plVar9 + 0x14) = uVar1;
          iVar10 = *(int *)(lVar6 + 0x28);
        } while (iVar10 == (int)plVar9[3]);
      }
    } while (iVar10 == *(int *)plVar9[4]);
    lStack_b8 = CONCAT44(lStack_b8._4_4_,iVar10);
    iVar2 = func_0x004db888(&plStack_98,&lStack_b8);
  } while (iVar2 == 0);
  piVar3 = (int *)func_0x00187bd0(0x10,4);
  if (piVar3 != (int *)0x0) {
    *piVar3 = iVar10;
    lStack_b8 = 4;
    lStack_a8 = 1;
    plStack_98 = (long *)plVar9[1];
    plStack_a0 = (long *)*plVar9;
    lStack_88 = plVar9[3];
    uStack_90 = plVar9[2];
    lStack_78 = plVar9[5];
    piStack_80 = (int *)plVar9[4];
    lStack_70 = plVar9[6];
    piStack_b0 = piVar3;
    do {
      lVar6 = lStack_a8;
      ppiStack_68 = &piStack_80;
      plStack_60 = &lStack_78;
      do {
        if ((long *)(uStack_90 & 0xffffffff) < plStack_98) {
          lVar7 = (long)plStack_a0 + (long)(uStack_90 & 0xffffffff) * 0x30;
          uStack_90 = CONCAT44(uStack_90._4_4_,*(undefined4 *)(lVar7 + 0x20));
          iVar10 = *(int *)(lVar7 + 0x2c);
        }
        else {
          uVar1 = uStack_90._4_4_;
          do {
            if (plStack_98 <= (long *)(ulong)uVar1) {
              extraout_x8[1] = (long)piStack_b0;
              *extraout_x8 = lStack_b8;
              extraout_x8[2] = lStack_a8;
              return;
            }
            lVar7 = (long)plStack_a0 + (long)(ulong)uVar1 * 0x30;
            uVar1 = *(uint *)(lVar7 + 0x24);
            uStack_90 = CONCAT44(uVar1,(undefined4)uStack_90);
            iVar10 = *(int *)(lVar7 + 0x28);
          } while (iVar10 == (int)lStack_88);
        }
      } while ((iVar10 == *piStack_80) ||
              (iStack_54 = iVar10, iVar2 = func_0x004db888(&plStack_60,&iStack_54), iVar2 == 0));
      if (lVar6 == lStack_b8) {
        func_0x007a535c(&lStack_b8,lVar6,1,4,4);
        piVar3 = piStack_b0;
      }
      piVar3[lVar6] = iVar10;
      lStack_a8 = lVar6 + 1;
    } while( true );
  }
  uVar4 = func_0x007a1f00(4,0x10,auVar12._8_8_);
  if (lStack_b8 != 0) {
    func_0x00187bd4(piStack_b0,lStack_b8 << 2,4);
  }
  auVar13 = __Unwind_Resume(uVar4);
  plVar9 = auVar13._0_8_;
  uVar4 = 0;
  lVar6 = *plVar9;
  lVar7 = plVar9[1];
  uVar8 = lVar7 - lVar6;
  uVar11 = uVar8 >> 2;
  uVar8 = (uVar11 + (uVar8 >> 1)) * 8;
  auVar12._8_8_ = 0;
  auVar12._0_8_ = uVar11;
  if ((SUB168(auVar12 * ZEXT816(0x18),8) == 0) && (uVar8 < 0x7ffffffffffffff9)) {
    if (uVar8 != 0) {
      uVar4 = 8;
      uVar5 = func_0x00187bd0(uVar8,8);
      auVar12._8_8_ = plVar9;
      if (uVar5 != 0) goto code_r0x004d08dc;
      goto code_r0x004d08c4;
    }
  }
  else {
code_r0x004d08c4:
    plVar9 = auVar12._8_8_;
    func_0x007a1f00(uVar4,uVar8,auVar13._8_8_);
  }
  uVar11 = 0;
  uVar5 = 8;
code_r0x004d08dc:
  puStack_128 = &uStack_150;
  uStack_150 = 0;
  lStack_130 = plVar9[3];
  lStack_138 = plVar9[2];
  uStack_120 = 0;
  lStack_148 = lVar6;
  lStack_140 = lVar7;
  uStack_118 = uVar5;
  func_0x004dc7dc(&lStack_148,&puStack_128);
  extraout_x8_00[1] = uVar5;
  *extraout_x8_00 = uVar11;
  extraout_x8_00[2] = uStack_150;
  return;
}

