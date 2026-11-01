
void FUN_0023c83c(undefined8 param_1,undefined8 param_2,long param_3)

{
  code *pcVar1;
  undefined2 uVar2;
  undefined8 *puVar3;
  ulong uVar4;
  long lVar5;
  long lVar6;
  undefined2 extraout_w1;
  undefined *puVar7;
  undefined8 *unaff_x20;
  long *plVar8;
  long unaff_x21;
  undefined2 *puVar9;
  undefined8 *puVar10;
  ulong uVar11;
  long lVar12;
  long lVar13;
  undefined8 uVar14;
  ulong uVar15;
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  long in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 uStack_1a8;
  long lStack_170;
  long lStack_168;
  long lStack_160;
  long lStack_158;
  undefined8 uStack_150;
  ulong uStack_148;
  undefined8 uStack_140;
  ulong uStack_138;
  long lStack_130;
  ulong uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  long lStack_100;
  long lStack_f8;
  long lStack_f0;
  undefined1 uStack_88;
  ulong uStack_80;
  long lStack_78;
  
  do {
    puVar10 = unaff_x20 + 5;
    func_0x0016abd8(unaff_x20);
    unaff_x21 = unaff_x21 + -1;
    unaff_x20 = puVar10;
  } while (unaff_x21 != 0);
  if (in_stack_00000000 != 0) {
    param_3 = 8;
    func_0x00187bd4(in_stack_00000008,in_stack_00000000 * 0x28);
  }
  __Unwind_Resume();
  auVar16 = func_0x007a2668();
  puVar3 = auVar16._0_8_;
  lVar6 = *(long *)(param_3 + 0x98);
  lVar13 = *(long *)(param_3 + 0x90) + (*(long *)(lVar6 + 0x10) - 1U & 0xfffffffffffffff0);
  uVar4 = (**(code **)(lVar6 + 0x20))(lVar13 + 0x10);
  if ((uVar4 & 1) == 0) {
    *(undefined1 *)(puVar3 + 1) = 0;
    *puVar3 = 0x8000000000000027;
    return;
  }
  lStack_170 = 0;
  lStack_168 = 8;
  lStack_160 = 0;
  (**(code **)(lVar6 + 0x50))(&lStack_158,lVar13 + 0x10);
  uVar14 = 0;
  puVar7 = &UNK_009c8d00;
  if (uStack_148 >> 0x3e == 0) {
    puVar10 = (undefined8 *)(uStack_148 * 4);
    if ((undefined8 *)0x7ffffffffffffffe < puVar10) goto code_r0x0023cc78;
    if (puVar10 == (undefined8 *)0x0) {
      uVar4 = 0;
      lVar5 = 2;
    }
    else {
      uVar14 = 2;
      lVar5 = func_0x00187bd0(puVar10,2,&UNK_009c8d00);
      if (lVar5 == 0) {
        puVar7 = &UNK_009c8d00;
        goto code_r0x0023cc78;
      }
      uVar4 = uStack_148;
    }
    _memcpy(lVar5,uStack_150,puVar10);
    lVar12 = lStack_160;
    uStack_128 = uStack_148;
    uStack_140 = 0x8000000000000001;
    uStack_138 = uVar4;
    lStack_130 = lVar5;
    if (lStack_160 == lStack_170) {
      func_0x001d8840(&lStack_170,&UNK_009c96c8);
    }
    puVar10 = (undefined8 *)(lStack_168 + lVar12 * 0x20);
    puVar10[1] = uStack_138;
    *puVar10 = uStack_140;
    puVar10[3] = uStack_128;
    puVar10[2] = lStack_130;
    lStack_160 = lVar12 + 1;
    uVar4 = *(ulong *)(param_3 + 0x50);
    if (uVar4 != 0) {
      lVar12 = *(long *)(param_3 + 0x48);
      puVar10 = (undefined8 *)(uVar4 << 2);
      uVar14 = 2;
      lVar5 = func_0x00187bd0(puVar10,2);
      if (lVar5 == 0) {
        puVar7 = &UNK_009c8a00;
        goto code_r0x0023cc78;
      }
      plVar8 = (long *)(lVar12 + 8);
      puVar9 = (undefined2 *)(lVar5 + 2);
      uVar11 = uVar4;
      do {
        uVar2 = (**(code **)(*plVar8 + 0x28))(plVar8[-1]);
        lVar12 = lStack_160;
        puVar9[-1] = uVar2;
        *puVar9 = extraout_w1;
        plVar8 = plVar8 + 2;
        uVar11 = uVar11 - 1;
        puVar9 = puVar9 + 2;
      } while (uVar11 != 0);
      uStack_140 = 0x8000000000000003;
      uStack_138 = uVar4;
      lStack_130 = lVar5;
      uStack_128 = uVar4;
      if (lStack_160 == lStack_170) {
        func_0x001d8840(&lStack_170,&UNK_009c96e0);
      }
      puVar10 = (undefined8 *)(lStack_168 + lVar12 * 0x20);
      puVar10[1] = uStack_138;
      *puVar10 = uStack_140;
      puVar10[3] = uStack_128;
      puVar10[2] = lStack_130;
      lStack_160 = lVar12 + 1;
    }
    auVar17 = (**(code **)(lVar6 + 0x30))(lVar13 + 0x10);
    uVar4 = auVar17._8_8_;
    lVar13 = auVar17._0_8_;
    puVar10 = &uStack_120;
    if (uVar4 == 0) {
code_r0x0023cbb8:
      uStack_110 = 1;
      uStack_118 = 0;
      lStack_100 = lStack_170;
      uStack_108 = 0;
      lStack_f0 = lStack_160;
      lStack_f8 = lStack_168;
      uStack_88 = 10;
      uStack_120 = 0x8000000000000009;
      func_0x0024a370(auVar16._8_8_,&uStack_120);
      *(undefined1 *)(puVar3 + 1) = 1;
      *puVar3 = 0x8000000000000027;
      if (lStack_158 != 0) {
        func_0x00187bd4(uStack_150,lStack_158 << 2,2);
      }
      return;
    }
    uVar14 = 0;
    auVar17._8_8_ = 0;
    auVar17._0_8_ = uVar4;
    puVar7 = &UNK_009c8ce8;
    if (SUB168(auVar17 * ZEXT816(0x18),8) == 0) {
      puVar10 = (undefined8 *)(uVar4 * 0x18);
      if (puVar10 < (undefined8 *)0x7ffffffffffffff9) {
        if (puVar10 == (undefined8 *)0x0) {
          uVar11 = 0;
          lVar6 = 8;
        }
        else {
          uVar14 = 8;
          lVar6 = func_0x00187bd0(puVar10,8,&UNK_009c8ce8);
          if (lVar6 == 0) {
            puVar7 = &UNK_009c8ce8;
            goto code_r0x0023cc78;
          }
          uVar11 = uVar4;
        }
        uVar15 = 0;
        uStack_1a8 = 1;
        plVar8 = (long *)(lVar6 + 0x10);
        uStack_80 = uVar11;
        lStack_78 = lVar6;
        do {
          if (puVar10 == (undefined8 *)0x0) break;
          lVar6 = *(long *)(lVar13 + 0x10);
          if (lVar6 < 0) {
            uStack_1a8 = 0;
LAB_0023cc3c:
            func_0x007a1f00(uStack_1a8,lVar6,&UNK_009c24c0);
            goto LAB_0023cc88;
          }
          uVar14 = *(undefined8 *)(lVar13 + 8);
          if (lVar6 == 0) {
            lVar5 = 1;
          }
          else {
            lVar5 = func_0x00187bd0(lVar6,1);
            if (lVar5 == 0) goto LAB_0023cc3c;
          }
          _memcpy(lVar5,uVar14,lVar6);
          uVar15 = uVar15 + 1;
          lVar13 = lVar13 + 0x18;
          plVar8[-2] = lVar6;
          plVar8[-1] = lVar5;
          *plVar8 = lVar6;
          puVar10 = puVar10 + -3;
          plVar8 = plVar8 + 3;
        } while (uVar11 != uVar15);
        lVar13 = lStack_160;
        lStack_130 = lStack_78;
        uStack_138 = uStack_80;
        uStack_140 = 0x8000000000000002;
        uStack_128 = uVar4;
        if (lStack_160 == lStack_170) {
          func_0x001d8840(&lStack_170,&UNK_009c96f8);
        }
        puVar10 = (undefined8 *)(lStack_168 + lVar13 * 0x20);
        puVar10[1] = uStack_138;
        *puVar10 = uStack_140;
        puVar10[3] = uStack_128;
        puVar10[2] = lStack_130;
        lStack_160 = lVar13 + 1;
        goto code_r0x0023cbb8;
      }
      goto code_r0x0023cc78;
    }
  }
  uVar14 = 0;
code_r0x0023cc78:
  func_0x007a1f00(uVar14,puVar10,puVar7);
LAB_0023cc88:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x23cc8c);
  (*pcVar1)();
}

