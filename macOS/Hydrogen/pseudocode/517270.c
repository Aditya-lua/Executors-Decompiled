
long FUN_00517270(long *param_1)

{
  undefined8 uVar1;
  long lVar2;
  undefined1 in_ZR;
  int iVar3;
  long lVar4;
  long unaff_x19;
  ulong unaff_x20;
  ulong uVar5;
  long unaff_x21;
  ulong uVar6;
  long *plVar7;
  long unaff_x23;
  long unaff_x24;
  long *unaff_x25;
  long lVar8;
  long lVar9;
  long lVar10;
  undefined1 auVar11 [16];
  long lStack_138;
  long lStack_130;
  long lStack_128;
  long lStack_120;
  long lStack_118;
  long lStack_110;
  long lStack_108;
  long lStack_100;
  long lStack_f8;
  long lStack_f0;
  long lStack_e8;
  long lStack_e0;
  long lStack_d8;
  long lStack_d0;
  long lStack_c8;
  long lStack_c0;
  long lStack_b8;
  long lStack_b0;
  long lStack_a8;
  long lStack_a0;
  long lStack_98;
  long lStack_90;
  long lStack_88;
  long lStack_80;
  long lStack_78;
  
  while ((!(bool)in_ZR || (iVar3 = _memcmp(param_1[-1]), iVar3 != 0))) {
    unaff_x23 = unaff_x23 + -0x68;
    unaff_x20 = unaff_x20 + 1;
    unaff_x24 = unaff_x24 + -0x10;
    if (unaff_x24 == 0) {
      return 0;
    }
    in_ZR = *unaff_x25 == unaff_x21;
    param_1 = unaff_x25;
    unaff_x25 = unaff_x25 + 2;
  }
  if (unaff_x20 < *(ulong *)(unaff_x19 + 0x68)) {
    return *(long *)(unaff_x19 + 0x60) - unaff_x23;
  }
  auVar11 = func_0x007a2570(unaff_x20,*(ulong *)(unaff_x19 + 0x68),&UNK_009e9b68);
  lVar4 = auVar11._0_8_;
  uVar6 = *(ulong *)(lVar4 + 0x50);
  if (uVar6 != 0) {
    lVar8 = 0;
    lVar9 = 0;
    uVar5 = 0;
    lVar10 = *(long *)(lVar4 + 0x48);
    uVar1 = *auVar11._8_8_;
    lVar2 = auVar11._8_8_[1];
    do {
      if ((*(long *)(lVar10 + lVar9 + 8) == lVar2) &&
         (iVar3 = _memcmp(*(undefined8 *)(lVar10 + lVar9),uVar1,lVar2), iVar3 == 0)) {
        if (uVar5 < uVar6) {
          _memmove(lVar10 + lVar9,lVar10 + lVar9 + 0x10,(uVar6 * 0x10 - lVar9) + -0x10);
          *(ulong *)(lVar4 + 0x50) = uVar6 - 1;
          uVar6 = *(ulong *)(lVar4 + 0x68);
          if (uVar5 <= uVar6 && uVar6 - uVar5 != 0) {
            plVar7 = (long *)(*(long *)(lVar4 + 0x60) + lVar8);
            lVar9 = *plVar7;
            lStack_a8 = plVar7[6];
            lStack_b0 = plVar7[5];
            lStack_98 = plVar7[8];
            lStack_a0 = plVar7[7];
            lStack_88 = plVar7[10];
            lStack_90 = plVar7[9];
            lStack_78 = plVar7[0xc];
            lStack_80 = plVar7[0xb];
            lStack_c8 = plVar7[2];
            lStack_d0 = plVar7[1];
            lStack_b8 = plVar7[4];
            lStack_c0 = plVar7[3];
            _memmove(plVar7,plVar7 + 0xd,(uVar6 - uVar5) * 0x68 + -0x68);
            *(ulong *)(lVar4 + 0x68) = uVar6 - 1;
            if (lVar9 == 2) {
              return 0;
            }
            lStack_108 = lStack_a8;
            lStack_110 = lStack_b0;
            lStack_f8 = lStack_98;
            lStack_100 = lStack_a0;
            lStack_e8 = lStack_88;
            lStack_f0 = lStack_90;
            lStack_d8 = lStack_78;
            lStack_e0 = lStack_80;
            lStack_128 = lStack_c8;
            lStack_130 = lStack_d0;
            lStack_118 = lStack_b8;
            lStack_120 = lStack_c0;
            lStack_138 = lVar9;
            func_0x00515db4(&lStack_138);
            return 1;
          }
        }
        else {
          func_0x007a2080(uVar5,uVar6,&UNK_009e9b38);
        }
        auVar11 = func_0x007a2080(uVar5,uVar6,&UNK_009e9b50);
        lVar4 = *(long *)(auVar11._0_8_ + 0x50);
        if (lVar4 == 0) {
          return 0;
        }
        uVar1 = *auVar11._8_8_;
        lVar9 = auVar11._8_8_[1];
        plVar7 = (long *)(*(long *)(auVar11._0_8_ + 0x48) + 8);
        lVar4 = lVar4 << 4;
        while ((*plVar7 != lVar9 || (iVar3 = _memcmp(plVar7[-1],uVar1,lVar9), iVar3 != 0))) {
          plVar7 = plVar7 + 2;
          lVar4 = lVar4 + -0x10;
          if (lVar4 == 0) {
            return 0;
          }
        }
        return 1;
      }
      uVar5 = uVar5 + 1;
      lVar9 = lVar9 + 0x10;
      lVar8 = lVar8 + 0x68;
    } while (uVar6 * 0x10 != lVar9);
  }
  return 0;
}

