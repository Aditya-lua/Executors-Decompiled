
ulong FUN_002c04e0(ulong param_1,ulong param_2)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  uint uVar4;
  bool bVar5;
  long *plVar6;
  ulong in_x9;
  ulong in_x10;
  undefined1 *puVar7;
  ulong in_x11;
  long lVar8;
  ulong uVar9;
  uint uVar10;
  ulong in_x12;
  ulong uVar11;
  byte *pbVar12;
  ulong uVar13;
  uint uVar14;
  long lVar15;
  undefined8 *puVar16;
  undefined8 *puVar17;
  undefined1 *puVar18;
  undefined1 (*pauVar19) [16];
  ulong uVar20;
  undefined8 *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  undefined1 auVar21 [16];
  undefined1 auVar22 [16];
  undefined8 uVar23;
  undefined1 auVar24 [16];
  undefined1 auVar25 [16];
  
  param_2 = param_2 | param_2 >> 0x20;
  param_2 = param_2 | param_2 >> 0x10;
  uVar14 = (uint)param_2 | (uint)(param_2 >> 8);
  if (in_x11 != in_x12) {
    if ((in_x11 & 0x38) != 0) {
      uVar20 = in_x11 & 0xfffffffffffffff8;
      auVar22 = ZEXT116((byte)uVar14);
      lVar15 = in_x12 - uVar20;
      puVar16 = (undefined8 *)(in_x10 + in_x12 + param_1);
      do {
        uVar23 = *puVar16;
        auVar22._0_8_ =
             CONCAT17((byte)((ulong)uVar23 >> 0x38) | auVar22[7],
                      CONCAT16((byte)((ulong)uVar23 >> 0x30) | auVar22[6],
                               CONCAT15((byte)((ulong)uVar23 >> 0x28) | auVar22[5],
                                        CONCAT14((byte)((ulong)uVar23 >> 0x20) | auVar22[4],
                                                 CONCAT13((byte)((ulong)uVar23 >> 0x18) | auVar22[3]
                                                          ,CONCAT12((byte)((ulong)uVar23 >> 0x10) |
                                                                    auVar22[2],
                                                                    CONCAT11((byte)((ulong)uVar23 >>
                                                                                   8) | auVar22[1],
                                                                             (byte)uVar23 |
                                                                             auVar22[0])))))));
        auVar22._8_8_ = 0;
        lVar15 = lVar15 + 8;
        puVar16 = puVar16 + 1;
      } while (lVar15 != 0);
      uVar11 = auVar22._0_8_ | auVar22._0_8_ >> 0x20;
      uVar11 = uVar11 | uVar11 >> 0x10;
      uVar14 = (uint)uVar11 | (uint)(uVar11 >> 8);
      in_x12 = uVar20;
      if (in_x11 == uVar20) goto LAB_002c056c;
    }
    lVar15 = (in_x12 + param_1) - in_x9;
    pbVar12 = (byte *)(in_x10 + in_x12 + param_1);
    do {
      uVar14 = *pbVar12 | uVar14;
      bVar5 = lVar15 != -1;
      lVar15 = lVar15 + 1;
      pbVar12 = pbVar12 + 1;
    } while (bVar5);
  }
LAB_002c056c:
  if ((uVar14 & 0xff) == 0) {
    uVar20 = in_x9;
    if (param_1 <= in_x9) {
      uVar20 = param_1;
    }
    if (uVar20 != 0) {
      if ((uVar20 < 8) ||
         ((unaff_x20 + (param_1 - uVar20) < in_x10 + uVar20 && (in_x10 < unaff_x20 + param_1)))) {
        uVar11 = 0;
      }
      else {
        if (uVar20 < 0x40) {
          uVar9 = 0;
        }
        else {
          uVar11 = uVar20 & 0x1fffffc0;
          puVar16 = (undefined8 *)(param_1 + unaff_x20 + -0x20);
          pauVar19 = (undefined1 (*) [16])(in_x10 + 0x20);
          uVar9 = uVar11;
          do {
            auVar22 = *pauVar19;
            auVar25 = pauVar19[1];
            auVar21 = NEON_rev64(pauVar19[-2],1);
            auVar21 = NEON_ext(auVar21,auVar21,8,1);
            auVar24 = NEON_rev64(pauVar19[-1],1);
            auVar24 = NEON_ext(auVar24,auVar24,8,1);
            puVar16[1] = auVar24._8_8_;
            *puVar16 = auVar24._0_8_;
            puVar16[3] = auVar21._8_8_;
            puVar16[2] = auVar21._0_8_;
            auVar22 = NEON_rev64(auVar22,1);
            auVar22 = NEON_ext(auVar22,auVar22,8,1);
            auVar25 = NEON_rev64(auVar25,1);
            auVar25 = NEON_ext(auVar25,auVar25,8,1);
            puVar16[-3] = auVar25._8_8_;
            puVar16[-4] = auVar25._0_8_;
            puVar16[-1] = auVar22._8_8_;
            puVar16[-2] = auVar22._0_8_;
            puVar16 = puVar16 + -8;
            uVar9 = uVar9 - 0x40;
            pauVar19 = pauVar19 + 4;
          } while (uVar9 != 0);
          if (uVar20 == uVar11) goto LAB_002c05d0;
          uVar9 = uVar11;
          if ((uVar20 & 0x38) == 0) goto code_r0x002c05ac;
        }
        uVar11 = uVar20 & 0x1ffffff8;
        puVar16 = (undefined8 *)((param_1 - uVar9) + unaff_x20);
        lVar15 = uVar9 - uVar11;
        puVar17 = (undefined8 *)(in_x10 + uVar9);
        do {
          puVar16 = puVar16 + -1;
          uVar23 = NEON_rev64(*puVar17,1);
          *puVar16 = uVar23;
          lVar15 = lVar15 + 8;
          puVar17 = puVar17 + 1;
        } while (lVar15 != 0);
        if (uVar20 == uVar11) goto LAB_002c05d0;
      }
code_r0x002c05ac:
      lVar15 = uVar20 - uVar11;
      puVar7 = (undefined1 *)(in_x10 + uVar11);
      puVar18 = (undefined1 *)(unaff_x20 + param_1 + ~uVar11);
      do {
        *puVar18 = *puVar7;
        lVar15 = lVar15 + -1;
        puVar7 = puVar7 + 1;
        puVar18 = puVar18 + -1;
      } while (lVar15 != 0);
    }
LAB_002c05d0:
    if (in_x9 < param_1) {
      _bzero();
    }
    if (*(char *)(unaff_x19 + 5) != '\0') {
code_r0x002c0424:
      func_0x00373520(*unaff_x19,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
      func_0x0036e3d8(unaff_x19[1]);
      func_0x0036e3d8();
      return unaff_x21;
    }
    if (unaff_x19[2] != 0) {
      lVar15 = unaff_x19[2] + -1;
      unaff_x19[2] = lVar15;
      lVar15 = *(long *)(unaff_x19[1] + lVar15 * 8);
      unaff_x19[4] = lVar15;
      if (lVar15 == 0) goto code_r0x002c0424;
      goto code_r0x002c069c;
    }
    func_0x0079db4c();
  }
  func_0x0079dae0();
code_r0x002c069c:
  plVar6 = (long *)func_0x0079db28();
  plVar6 = (long *)*plVar6;
  uVar4 = *(uint *)(plVar6 + 1);
  uVar20 = (ulong)uVar4;
  uVar14 = uVar4 & (int)uVar4 >> 0x1f;
  lVar15 = uVar20 * 8;
  do {
    lVar15 = lVar15 + -8;
    uVar10 = (uint)uVar20;
    uVar20 = (ulong)(uVar10 - 1);
    if ((int)uVar10 < 1) {
      if (-1 < (int)uVar4) {
        return 0;
      }
      lVar8 = *plVar6;
      goto code_r0x002c06e8;
    }
    lVar8 = *plVar6;
  } while (*(long *)(lVar8 + lVar15) == 0);
  uVar14 = uVar10;
code_r0x002c06e8:
  uVar11 = *(ulong *)(lVar8 + (long)(int)(uVar14 - 1) * 8);
  uVar9 = uVar11 >> 0x20;
  uVar20 = uVar9;
  if (uVar9 == 0) {
    uVar20 = uVar11;
  }
  uVar13 = uVar20 >> 0x10;
  uVar1 = uVar13;
  if (uVar13 == 0) {
    uVar1 = uVar20;
  }
  uVar20 = uVar1 >> 8;
  if (uVar1 < 0x100) {
    uVar20 = uVar1;
  }
  uVar2 = uVar20 >> 4;
  if (uVar20 < 0x10) {
    uVar2 = uVar20;
  }
  uVar3 = uVar2 >> 2;
  if (uVar2 < 4) {
    uVar3 = uVar2;
  }
  uVar14 = (uint)(uVar11 != 0) | (uVar14 - 1) * 0x40 | (uint)(uVar9 != 0) << 5 |
           (uint)(uVar13 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar20) << 2 |
           (uint)(3 < uVar2) << 1;
  if (1 < uVar3) {
    uVar14 = uVar14 + 1;
  }
  return (ulong)(uVar14 + 7 >> 3);
}

