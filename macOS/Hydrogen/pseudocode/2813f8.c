
ulong FUN_002813f8(void)

{
  byte bVar1;
  undefined1 uVar2;
  int iVar3;
  undefined1 auVar4 [16];
  bool bVar5;
  int iVar6;
  int iVar7;
  ulong unaff_x21;
  long lVar8;
  long lVar9;
  ulong unaff_x23;
  int unaff_w24;
  uint uVar10;
  ulong uVar11;
  long lVar12;
  long lVar13;
  ulong uVar14;
  undefined1 auVar15 [16];
  ulong in_stack_00000000;
  undefined8 uStack0000000000000008;
  undefined1 uStack0000000000000010;
  
  do {
    iVar6 = func_0x0029b308();
    if ((iVar6 == 0) || (unaff_x21 != 0)) {
      uVar10 = 0;
      do {
        auVar15._8_8_ = 0;
        auVar15._0_8_ = unaff_x21;
        auVar4._8_8_ = 0;
        auVar4._0_8_ = unaff_x23;
        uVar11 = SUB168(auVar15 * auVar4,8) >> 3;
        iVar7 = func_0x002824fc(&uStack0000000000000010,
                                (int)unaff_x21 - (int)uVar11 * unaff_w24 & 0xffU | 0x30);
        if (iVar7 == 0) goto LAB_00281380;
        bVar5 = 9 < unaff_x21;
        if (0x11 < uVar10) break;
        uVar10 = uVar10 + 1;
        unaff_x21 = uVar11;
      } while (iVar6 == 0 || bVar5);
    }
    else {
      uVar11 = 0;
    }
    if (uVar11 != 0) {
      auVar15 = func_0x0079d184();
      auVar15._8_8_ = auVar15._8_8_;
      auVar15._0_8_ = auVar15._0_8_;
      if (auVar15._8_8_ == (byte *)0x0) goto LAB_002814f4;
      bVar1 = *auVar15._8_8_;
      uVar11 = (ulong)bVar1;
      if (bVar1 != 0) {
        uVar10 = (uint)(bVar1 == 0x2d);
        if (bVar1 == 0x2d) {
          auVar15._8_8_ = auVar15._8_8_ + 1;
        }
        uVar14 = 0xffffffffffffffff;
        lVar8 = 0;
        do {
          lVar12 = lVar8;
          iVar6 = func_0x0036e898(auVar15._8_8_[lVar12]);
          uVar14 = uVar14 + 1;
          lVar8 = lVar12 + 1;
        } while (iVar6 != 0 && ((ulong)uVar10 - 0x7fffffff) + lVar12 != 0);
        iVar6 = (int)(lVar12 + 1);
        if (iVar6 == 1) {
          func_0x0028f83c(3,0,0x77,"/aws-lc/crypto/bn_extra/convert.c",0xc5);
LAB_002814f4:
          uVar11 = 0;
        }
        else {
          uVar11 = lVar12 + (ulong)uVar10;
          if (auVar15._0_8_ == (long *)0x0) {
            return uVar11;
          }
          lVar8 = *auVar15._0_8_;
          if (lVar8 == 0) {
            lVar8 = func_0x0029bbb8();
            if (lVar8 == 0) goto LAB_002814f4;
          }
          else {
            func_0x0029c0a4(lVar8);
          }
          if (0 < (int)lVar12) {
            lVar13 = 0;
            lVar9 = 0;
            iVar3 = (int)(uVar14 / 0x13) * 0x13;
            iVar7 = 0;
            if (iVar3 + 1 != iVar6) {
              iVar7 = (iVar3 - iVar6) + 0x14;
            }
            do {
              lVar9 = (long)(char)auVar15._8_8_[lVar13] + lVar9 * 10 + -0x30;
              iVar7 = iVar7 + 1;
              if (iVar7 == 0x13) {
                iVar6 = func_0x002ac060(lVar8,10000000000000000000);
                if ((iVar6 == 0) || (iVar6 = func_0x0029b0e4(lVar8,lVar9), iVar6 == 0)) {
                  if (*auVar15._0_8_ == 0) {
                    func_0x0029bc0c(lVar8);
                  }
                  goto LAB_002814f4;
                }
                iVar7 = 0;
                lVar9 = 0;
              }
              lVar13 = lVar13 + 1;
            } while (lVar12 != lVar13);
          }
          func_0x0029b09c(lVar8);
          iVar6 = func_0x0029b308(lVar8);
          if (iVar6 == 0) {
            *(uint *)(lVar8 + 0x10) = uVar10;
          }
          *auVar15._0_8_ = lVar8;
        }
      }
      return uVar11;
    }
    iVar6 = func_0x0029b308();
    if (iVar6 != 0) {
      iVar6 = func_0x0029c378();
      if (((iVar6 == 0) || (iVar6 = func_0x002824fc(&uStack0000000000000010,0x2d), iVar6 != 0)) &&
         (iVar6 = func_0x00281efc(&uStack0000000000000010,&uStack0000000000000008), iVar6 != 0)) {
        if (1 < in_stack_00000000) {
          uVar11 = 0;
          lVar8 = -1;
          do {
            uVar2 = *(undefined1 *)(uStack0000000000000008 + uVar11);
            *(undefined1 *)(uStack0000000000000008 + uVar11) =
                 *(undefined1 *)(uStack0000000000000008 + in_stack_00000000 + lVar8);
            *(undefined1 *)(uStack0000000000000008 + in_stack_00000000 + lVar8) = uVar2;
            uVar11 = uVar11 + 1;
            lVar8 = lVar8 + -1;
          } while (uVar11 < in_stack_00000000 >> 1);
        }
        func_0x0029bc0c();
        return uStack0000000000000008;
      }
      goto LAB_00281380;
    }
    unaff_x21 = func_0x002a12e8();
    if (unaff_x21 == 0xffffffffffffffff) {
LAB_00281380:
      func_0x0029bc0c();
      func_0x00281ecc(&uStack0000000000000010);
      return 0;
    }
  } while( true );
}

