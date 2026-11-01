
void FUN_0018bf38(void)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  code *pcVar6;
  int iVar7;
  undefined8 *puVar8;
  long lVar9;
  long *plVar10;
  long lVar11;
  long *extraout_x8;
  undefined8 *puVar12;
  undefined1 auVar13 [16];
  long lStack_b8;
  long *plStack_b0;
  long lStack_a8;
  long lStack_a0;
  long lStack_98;
  long lStack_90;
  long lStack_88;
  long *plStack_80;
  undefined *puStack_78;
  undefined8 uStack_70;
  undefined1 uStack_61;
  
  auVar13 = __Unwind_Resume();
  puVar8 = auVar13._0_8_;
  lVar1 = puVar8[1];
  lVar2 = puVar8[2];
  if (lVar2 <= lVar1) {
LAB_0018bfe0:
    *extraout_x8 = 0;
    extraout_x8[1] = 8;
    extraout_x8[2] = 0;
    return;
  }
  puVar12 = (undefined8 *)*puVar8;
  lVar9 = _CFArrayGetValueAtIndex(*puVar12,lVar1);
  if (lVar9 == 0) {
    func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
  }
  else {
    puVar8[1] = lVar1 + 1;
    lStack_98 = 0;
    lStack_90 = 1;
    uStack_70 = 0xe0000020;
    plStack_80 = &lStack_98;
    lStack_88 = 0;
    puStack_78 = &UNK_009c05d0;
    lStack_b8 = lVar9;
    iVar7 = func_0x0019f594(&lStack_b8,&plStack_80);
    lVar11 = lStack_88;
    lVar3 = lStack_90;
    lVar9 = lStack_98;
    if (iVar7 == 0) {
      if (lStack_98 == -0x8000000000000000) goto LAB_0018bfe0;
      plVar10 = (long *)func_0x00187bd0(0x60,8);
      if (plVar10 != (long *)0x0) {
        *plVar10 = lVar9;
        plVar10[1] = lVar3;
        plVar10[2] = lVar11;
        lStack_b8 = 4;
        lStack_a8 = 1;
        plStack_b0 = plVar10;
        if (lVar1 + 1 < lVar2) {
          lVar9 = 0;
          do {
            lVar3 = lStack_a8;
            lVar11 = _CFArrayGetValueAtIndex(*puVar12,lVar1 + lStack_a8);
            if (lVar11 == 0) {
              func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
              goto code_r0x0018c1b4;
            }
            lStack_98 = 0;
            lStack_90 = 1;
            lStack_88 = 0;
            uStack_70 = 0xe0000020;
            plStack_80 = &lStack_98;
            puStack_78 = &UNK_009c05d0;
            lStack_a0 = lVar11;
            iVar7 = func_0x0019f594(&lStack_a0,&plStack_80);
            lVar5 = lStack_88;
            lVar4 = lStack_90;
            lVar11 = lStack_98;
            if (iVar7 != 0) {
              func_0x007a2810(&UNK_00819a98,0x37,&uStack_61,&UNK_009c0618,&UNK_009c0600);
              goto code_r0x0018c1b4;
            }
            if (lStack_98 == -0x8000000000000000) break;
            if (lVar3 == lStack_b8) {
              func_0x0079ab9c(&lStack_b8,lVar3,1,8,0x18);
              plVar10 = plStack_b0;
            }
            *(long *)((long)plVar10 + lVar9 + 0x18) = lVar11;
            *(long *)((long)plVar10 + lVar9 + 0x20) = lVar4;
            *(long *)((long)plVar10 + lVar9 + 0x28) = lVar5;
            lStack_a8 = lVar3 + 1;
            lVar9 = lVar9 + 0x18;
          } while ((lVar1 - lVar2) + lStack_a8 != 0);
        }
        extraout_x8[1] = (long)plStack_b0;
        *extraout_x8 = lStack_b8;
        extraout_x8[2] = lStack_a8;
        return;
      }
      func_0x007a1f00(8,0x60,auVar13._8_8_);
      goto code_r0x0018c1b4;
    }
  }
  func_0x007a2810(&UNK_00819a98,0x37,&uStack_61,&UNK_009c0618,&UNK_009c0600);
code_r0x0018c1b4:
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x18c1b8);
  (*pcVar6)();
}

