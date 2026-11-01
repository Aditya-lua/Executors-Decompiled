
undefined8 FUN_00304f78(void)

{
  uint uVar1;
  code *pcVar2;
  bool bVar3;
  int iVar4;
  long lVar5;
  undefined8 uVar6;
  ulong uVar7;
  char *in_x3;
  char *pcVar8;
  ulong uVar9;
  undefined8 in_x5;
  undefined8 in_x6;
  ulong in_x7;
  long lVar10;
  ulong uVar11;
  byte *pbVar12;
  code **ppcVar13;
  ulong uVar14;
  byte *pbVar15;
  ulong uVar16;
  long unaff_x29;
  code *pcVar17;
  undefined1 auVar18 [16];
  byte *in_stack_00000000;
  ulong in_stack_00000008;
  ulong in_stack_00000010;
  undefined8 uStack_200;
  undefined8 uStack_1f8;
  undefined8 uStack_1f0;
  undefined8 uStack_1e8;
  undefined8 uStack_1e0;
  undefined8 uStack_1d8;
  ulong uStack_1d0;
  long lStack_1c8;
  code *apcStack_1c0 [38];
  undefined4 uStack_90;
  uint uStack_8c;
  undefined8 uStack_88;
  undefined1 auStack_80 [16];
  long lStack_70;
  
  uVar7 = 0x67;
  uVar9 = 0x47b;
  func_0x0028f83c(0x1e,0);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return 0;
  }
  auVar18 = ___stack_chk_fail(0);
  pcVar8 = auVar18._8_8_;
  lVar5 = auVar18._0_8_;
  lStack_70 = *(long *)PTR____stack_chk_guard_009b01e8;
  if (in_x3 == (char *)0x0) {
    uVar7 = 0x6f;
    uVar6 = 0x4c1;
LAB_00305434:
    in_x3 = "/aws-lc/crypto/fipsmodule/cipher/e_aes.c";
    func_0x0028f83c(0x1e,0,uVar7,"/aws-lc/crypto/fipsmodule/cipher/e_aes.c",uVar6);
  }
  else {
    if (in_x7 != in_stack_00000010) {
      uVar7 = 0x65;
      uVar6 = 0x4c6;
      goto LAB_00305434;
    }
    apcStack_1c0[0x25] = (code *)0x0;
    apcStack_1c0[0x24] = (code *)0x0;
    uStack_88 = 0;
    _uStack_90 = 0;
    apcStack_1c0[0x21] = (code *)0x0;
    apcStack_1c0[0x20] = (code *)0x0;
    apcStack_1c0[0x23] = (code *)0x0;
    apcStack_1c0[0x22] = (code *)0x0;
    apcStack_1c0[0x1d] = (code *)0x0;
    apcStack_1c0[0x1c] = (code *)0x0;
    apcStack_1c0[0x1f] = (code *)0x0;
    apcStack_1c0[0x1e] = (code *)0x0;
    apcStack_1c0[0x19] = (code *)0x0;
    apcStack_1c0[0x18] = (code *)0x0;
    apcStack_1c0[0x1b] = (code *)0x0;
    apcStack_1c0[0x1a] = (code *)0x0;
    apcStack_1c0[0x15] = (code *)0x0;
    apcStack_1c0[0x14] = (code *)0x0;
    apcStack_1c0[0x17] = (code *)0x0;
    apcStack_1c0[0x16] = (code *)0x0;
    apcStack_1c0[0x11] = (code *)0x0;
    apcStack_1c0[0x10] = (code *)0x0;
    apcStack_1c0[0x13] = (code *)0x0;
    apcStack_1c0[0x12] = (code *)0x0;
    apcStack_1c0[0xd] = (code *)0x0;
    apcStack_1c0[0xc] = (code *)0x0;
    apcStack_1c0[0xf] = (code *)0x0;
    apcStack_1c0[0xe] = (code *)0x0;
    apcStack_1c0[9] = (code *)0x0;
    apcStack_1c0[8] = (code *)0x0;
    apcStack_1c0[0xb] = (code *)0x0;
    apcStack_1c0[10] = (code *)0x0;
    apcStack_1c0[5] = (code *)0x0;
    apcStack_1c0[4] = (code *)0x0;
    apcStack_1c0[7] = (code *)0x0;
    apcStack_1c0[6] = (code *)0x0;
    apcStack_1c0[1] = (code *)0x0;
    apcStack_1c0[0] = (code *)0x0;
    apcStack_1c0[3] = (code *)0x0;
    apcStack_1c0[2] = (code *)0x0;
    uStack_1d8 = 0;
    uStack_1e0 = 0;
    lStack_1c8 = 0;
    uStack_1d0 = 0;
    ppcVar13 = apcStack_1c0 + 2;
    uStack_1f8 = 0;
    uStack_200 = 0;
    uStack_1e8 = 0;
    uStack_1f0 = 0;
    _memcpy(ppcVar13,lVar5 + 0xf8,0x120);
    func_0x002f36d4(&uStack_200,lVar5);
    pcVar2 = apcStack_1c0[0x23];
    pcVar17 = apcStack_1c0[0x22];
    if (lStack_1c8 == 0) {
      uVar6 = 0;
      uVar16 = uStack_1d0 + in_stack_00000008;
      if ((0x2000000000000000 < uVar16) || (CARRY8(uStack_1d0,in_stack_00000008)))
      goto LAB_0030543c;
      uVar7 = (ulong)uStack_8c;
      uStack_1d0 = uVar16;
      if (uStack_8c == 0) {
LAB_00305478:
        uVar16 = in_stack_00000008 & 0xfffffffffffffff0;
        if (uVar16 == 0) {
          pbVar15 = in_stack_00000000;
          uVar7 = in_stack_00000008;
        }
        else {
          (*pcVar2)(apcStack_1c0,ppcVar13,in_stack_00000000,uVar16);
          pbVar15 = in_stack_00000000 + uVar16;
          uVar7 = in_stack_00000008 & 0xf;
        }
        if (uVar7 == 0) {
          uVar7 = 0;
        }
        else {
          if ((uVar7 < 8) ||
             ((apcStack_1c0 < in_stack_00000000 + uVar7 + uVar16 &&
              (pbVar15 < (byte *)((long)apcStack_1c0 + uVar7))))) {
            uVar11 = 0;
          }
          else {
            uVar11 = uVar7 & 0xfffffffffffffff8;
            ppcVar13 = apcStack_1c0;
            uVar14 = uVar11;
            do {
              uVar6 = *(undefined8 *)pbVar15;
              pcVar17 = *ppcVar13;
              *ppcVar13 = (code *)CONCAT17((byte)((ulong)pcVar17 >> 0x38) ^
                                           (byte)((ulong)uVar6 >> 0x38),
                                           CONCAT16((byte)((ulong)pcVar17 >> 0x30) ^
                                                    (byte)((ulong)uVar6 >> 0x30),
                                                    CONCAT15((byte)((ulong)pcVar17 >> 0x28) ^
                                                             (byte)((ulong)uVar6 >> 0x28),
                                                             CONCAT14((byte)((ulong)pcVar17 >> 0x20)
                                                                      ^ (byte)((ulong)uVar6 >> 0x20)
                                                                      ,CONCAT13((byte)((ulong)
                                                  pcVar17 >> 0x18) ^ (byte)((ulong)uVar6 >> 0x18),
                                                  CONCAT12((byte)((ulong)pcVar17 >> 0x10) ^
                                                           (byte)((ulong)uVar6 >> 0x10),
                                                           CONCAT11((byte)((ulong)pcVar17 >> 8) ^
                                                                    (byte)((ulong)uVar6 >> 8),
                                                                    (byte)pcVar17 ^ (byte)uVar6)))))
                                                  ));
              uVar14 = uVar14 - 8;
              pbVar15 = pbVar15 + 8;
              ppcVar13 = ppcVar13 + 1;
            } while (uVar14 != 0);
            if (uVar7 == uVar11) goto LAB_00305518;
          }
          lVar10 = uVar7 - uVar11;
          pbVar15 = in_stack_00000000 + uVar11 + uVar16;
          pbVar12 = (byte *)((long)apcStack_1c0 + uVar11);
          do {
            *pbVar12 = *pbVar12 ^ *pbVar15;
            lVar10 = lVar10 + -1;
            pbVar15 = pbVar15 + 1;
            pbVar12 = pbVar12 + 1;
          } while (lVar10 != 0);
        }
      }
      else if (in_stack_00000008 != 0) {
        do {
          pbVar15 = in_stack_00000000 + 1;
          *(byte *)((long)apcStack_1c0 + uVar7) =
               *(byte *)((long)apcStack_1c0 + uVar7) ^ *in_stack_00000000;
          uVar16 = in_stack_00000008 - 1;
          uVar1 = (int)uVar7 + 1U & 0xf;
          uVar7 = (ulong)uVar1;
          in_stack_00000000 = pbVar15;
          if (uVar1 == 0) break;
          bVar3 = in_stack_00000008 != 1;
          in_stack_00000008 = uVar16;
        } while (bVar3);
        if (uVar1 == 0) {
          (*pcVar17)(apcStack_1c0,ppcVar13);
          in_stack_00000008 = uVar16;
          goto LAB_00305478;
        }
      }
LAB_00305518:
      _uStack_90 = CONCAT44((int)uVar7,uStack_90);
      if (*(long *)(lVar5 + 0x218) == 0) {
        uVar6 = func_0x002f3d48(&uStack_200,lVar5,uVar9,pcVar8,in_x5);
        iVar4 = (int)uVar6;
        uVar7 = uVar9;
        in_x3 = pcVar8;
      }
      else {
        uVar6 = func_0x002f4458(&uStack_200,lVar5,uVar9,pcVar8,in_x5);
        iVar4 = (int)uVar6;
        uVar7 = uVar9;
        in_x3 = pcVar8;
      }
      if (iVar4 == 0) goto LAB_0030543c;
      func_0x002f4824(&uStack_200,0,0);
      uVar7 = in_x7;
      if (0xf < in_x7) {
        uVar7 = 0x10;
      }
      if (uVar7 != 0) {
        in_x3 = " ";
        ___memcpy_chk(auStack_80,apcStack_1c0);
      }
      iVar4 = func_0x0036e62c(auStack_80,in_x6);
      if (iVar4 == 0) {
        uVar6 = 1;
        uVar7 = in_x7;
        goto LAB_0030543c;
      }
      uVar7 = 0x65;
      uVar6 = 0x4e2;
      goto LAB_00305434;
    }
  }
  uVar6 = 0;
LAB_0030543c:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_70) {
    return uVar6;
  }
  auVar18 = ___stack_chk_fail(uVar6);
  lVar5 = auVar18._0_8_;
  if (in_x3 == (char *)0x0) {
    in_x3 = (char *)0x0;
  }
  else {
    if (in_x3 < "\x06") {
      func_0x0028f83c(0x1e,0,0x67,"/aws-lc/crypto/fipsmodule/cipher/e_aes.c",0x52e);
      return 0;
    }
    in_x3 = in_x3 + -0xc;
  }
  if (((uVar7 & 0x1ffffffffffffff7) != 0x10) && ((uVar7 & 0x1fffffffffffffff) != 0x20)) {
    func_0x0028f83c(0x1e,0,0x66,"/aws-lc/crypto/fipsmodule/cipher/e_aes.c",0x447);
    return 0;
  }
  pcVar8 = " ";
  if (in_x3 != (char *)0x0) {
    pcVar8 = in_x3;
  }
  if (pcVar8 < (char *)((long)&MACH_HEADER.ncmds + 1)) {
    uVar6 = func_0x002b3d9c(lVar5 + 8,lVar5 + 0x100,0,auVar18._8_8_);
    *(undefined8 *)(lVar5 + 0x220) = uVar6;
    *(char *)(lVar5 + 0x241) = (char)pcVar8 + '\f';
    return 1;
  }
  func_0x0028f83c(0x1e,0,0x74,"/aws-lc/crypto/fipsmodule/cipher/e_aes.c",0x450);
  return 0;
}

