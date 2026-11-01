
undefined8 FUN_002c1054(void)

{
  uint uVar1;
  ulong uVar2;
  int iVar3;
  undefined4 in_w8;
  ulong uVar4;
  ulong uVar5;
  long *plVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  ulong *puVar10;
  ulong *puVar11;
  ulong uVar12;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  ulong *unaff_x21;
  ulong *unaff_x22;
  undefined8 *puVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  
  *(undefined4 *)(unaff_x22 + 2) = 0;
  *(undefined4 *)((long)unaff_x22 + 0x14) = in_w8;
  iVar3 = func_0x0029afb8();
  if (iVar3 != 0) {
    uVar5 = *unaff_x21;
    uVar1 = (uint)unaff_x22[1];
    uVar4 = (ulong)uVar1;
    if (uVar1 != 0) {
      uVar7 = *unaff_x22;
      lVar8 = (long)(int)uVar1;
      uVar2 = lVar8 - 1;
      if (uVar2 != 0) {
        if ((uVar1 < 9) || ((uVar5 < uVar7 + lVar8 * 8 && (uVar7 < (lVar8 * 8 + uVar5) - 8)))) {
          uVar9 = 0;
        }
        else {
          uVar9 = uVar2 & 0xfffffffffffffff8;
          puVar11 = (ulong *)(uVar7 + 0x20);
          puVar13 = (undefined8 *)(uVar5 + 0x20);
          uVar12 = uVar9;
          do {
            uVar15 = puVar11[-3];
            uVar14 = puVar11[-4];
            uVar17 = puVar11[-1];
            uVar16 = puVar11[-2];
            uVar19 = puVar11[1];
            uVar18 = *puVar11;
            uVar21 = puVar11[3];
            uVar20 = puVar11[2];
            uVar22 = puVar11[-3];
            uVar24 = *puVar11;
            uVar23 = puVar11[-1];
            uVar26 = puVar11[2];
            uVar25 = puVar11[1];
            uVar28 = puVar11[4];
            uVar27 = puVar11[3];
            puVar13[-3] = CONCAT17((byte)((puVar11[-2] << 0x3f) >> 0x38) | (byte)(uVar15 >> 0x39),
                                   CONCAT16((char)(uVar15 >> 0x31),
                                            CONCAT15((char)(uVar15 >> 0x29),
                                                     CONCAT14((char)(uVar15 >> 0x21),
                                                              CONCAT13((char)(uVar15 >> 0x19),
                                                                       CONCAT12((char)(uVar15 >>
                                                                                      0x11),
                                                                                CONCAT11((char)(
                                                  uVar15 >> 9),(char)(uVar15 >> 1))))))));
            puVar13[-4] = CONCAT17((byte)((uVar22 << 0x3f) >> 0x38) | (byte)(uVar14 >> 0x39),
                                   CONCAT16((char)(uVar14 >> 0x31),
                                            CONCAT15((char)(uVar14 >> 0x29),
                                                     CONCAT14((char)(uVar14 >> 0x21),
                                                              CONCAT13((char)(uVar14 >> 0x19),
                                                                       CONCAT12((char)(uVar14 >>
                                                                                      0x11),
                                                                                CONCAT11((char)(
                                                  uVar14 >> 9),(char)(uVar14 >> 1))))))));
            puVar13[-1] = CONCAT17((byte)((uVar24 << 0x3f) >> 0x38) | (byte)(uVar17 >> 0x39),
                                   CONCAT16((char)(uVar17 >> 0x31),
                                            CONCAT15((char)(uVar17 >> 0x29),
                                                     CONCAT14((char)(uVar17 >> 0x21),
                                                              CONCAT13((char)(uVar17 >> 0x19),
                                                                       CONCAT12((char)(uVar17 >>
                                                                                      0x11),
                                                                                CONCAT11((char)(
                                                  uVar17 >> 9),(char)(uVar17 >> 1))))))));
            puVar13[-2] = CONCAT17((byte)((uVar23 << 0x3f) >> 0x38) | (byte)(uVar16 >> 0x39),
                                   CONCAT16((char)(uVar16 >> 0x31),
                                            CONCAT15((char)(uVar16 >> 0x29),
                                                     CONCAT14((char)(uVar16 >> 0x21),
                                                              CONCAT13((char)(uVar16 >> 0x19),
                                                                       CONCAT12((char)(uVar16 >>
                                                                                      0x11),
                                                                                CONCAT11((char)(
                                                  uVar16 >> 9),(char)(uVar16 >> 1))))))));
            puVar13[1] = CONCAT17((byte)((uVar26 << 0x3f) >> 0x38) | (byte)(uVar19 >> 0x39),
                                  CONCAT16((char)(uVar19 >> 0x31),
                                           CONCAT15((char)(uVar19 >> 0x29),
                                                    CONCAT14((char)(uVar19 >> 0x21),
                                                             CONCAT13((char)(uVar19 >> 0x19),
                                                                      CONCAT12((char)(uVar19 >> 0x11
                                                                                     ),CONCAT11((
                                                  char)(uVar19 >> 9),(char)(uVar19 >> 1))))))));
            *puVar13 = CONCAT17((byte)((uVar25 << 0x3f) >> 0x38) | (byte)(uVar18 >> 0x39),
                                CONCAT16((char)(uVar18 >> 0x31),
                                         CONCAT15((char)(uVar18 >> 0x29),
                                                  CONCAT14((char)(uVar18 >> 0x21),
                                                           CONCAT13((char)(uVar18 >> 0x19),
                                                                    CONCAT12((char)(uVar18 >> 0x11),
                                                                             CONCAT11((char)(uVar18 
                                                  >> 9),(char)(uVar18 >> 1))))))));
            puVar13[3] = CONCAT17((byte)((uVar28 << 0x3f) >> 0x38) | (byte)(uVar21 >> 0x39),
                                  CONCAT16((char)(uVar21 >> 0x31),
                                           CONCAT15((char)(uVar21 >> 0x29),
                                                    CONCAT14((char)(uVar21 >> 0x21),
                                                             CONCAT13((char)(uVar21 >> 0x19),
                                                                      CONCAT12((char)(uVar21 >> 0x11
                                                                                     ),CONCAT11((
                                                  char)(uVar21 >> 9),(char)(uVar21 >> 1))))))));
            puVar13[2] = CONCAT17((byte)((uVar27 << 0x3f) >> 0x38) | (byte)(uVar20 >> 0x39),
                                  CONCAT16((char)(uVar20 >> 0x31),
                                           CONCAT15((char)(uVar20 >> 0x29),
                                                    CONCAT14((char)(uVar20 >> 0x21),
                                                             CONCAT13((char)(uVar20 >> 0x19),
                                                                      CONCAT12((char)(uVar20 >> 0x11
                                                                                     ),CONCAT11((
                                                  char)(uVar20 >> 9),(char)(uVar20 >> 1))))))));
            puVar11 = puVar11 + 8;
            uVar12 = uVar12 - 8;
            puVar13 = puVar13 + 8;
          } while (uVar12 != 0);
          if (uVar2 == uVar9) goto LAB_002c10e0;
        }
        lVar8 = ~uVar9 + lVar8;
        puVar10 = (ulong *)(uVar5 + uVar9 * 8);
        puVar11 = (ulong *)(uVar9 * 8 + uVar7);
        do {
          *puVar10 = *puVar11 >> 1 | puVar11[1] << 0x3f;
          lVar8 = lVar8 + -1;
          puVar10 = puVar10 + 1;
          puVar11 = puVar11 + 1;
        } while (lVar8 != 0);
      }
LAB_002c10e0:
      *(ulong *)(uVar5 + uVar2 * 8) = *(ulong *)(uVar7 + uVar2 * 8) >> 1;
    }
    *(int *)(unaff_x21 + 2) = (int)unaff_x22[2];
    plVar6 = (long *)(uVar5 + uVar4 * 8);
    do {
      plVar6 = plVar6 + -1;
      iVar3 = (int)uVar4;
      uVar4 = (ulong)(iVar3 - 1);
      if (iVar3 < 1) {
        *(uint *)(unaff_x21 + 1) = uVar1 & (int)uVar1 >> 0x1f;
        if (-1 < (int)uVar1) {
          *(undefined4 *)(unaff_x21 + 2) = 0;
        }
        goto LAB_002c1130;
      }
    } while (*plVar6 == 0);
    *(int *)(unaff_x21 + 1) = iVar3;
LAB_002c1130:
    if (*(int *)((long)unaff_x19 + 0xc) == 0) {
      if ((*(byte *)((long)unaff_x19 + 0x14) >> 1 & 1) == 0) {
        puVar13 = (undefined8 *)func_0x0036e358(1,8);
        if (puVar13 != (undefined8 *)0x0) {
          if (*(int *)(unaff_x19 + 1) != 0) {
            _memcpy(puVar13,*unaff_x19,(long)*(int *)(unaff_x19 + 1) << 3);
          }
          func_0x0036e3d8(*unaff_x19);
          *unaff_x19 = puVar13;
          *(undefined4 *)((long)unaff_x19 + 0xc) = 1;
          goto LAB_002c113c;
        }
      }
      else {
        func_0x0028f83c(3,0,0x6a,"/aws-lc/crypto/fipsmodule/bn/bn.c",0x166);
      }
    }
    else {
      puVar13 = (undefined8 *)*unaff_x19;
LAB_002c113c:
      *(undefined4 *)(unaff_x19 + 2) = 0;
      *puVar13 = 2;
      *(undefined4 *)(unaff_x19 + 1) = 1;
      iVar3 = func_0x002bfcdc();
      if (iVar3 != 0) {
        return unaff_x20;
      }
    }
    if (unaff_x22 == (ulong *)0x0) goto joined_r0x002c121c;
  }
  uVar1 = *(uint *)((long)unaff_x22 + 0x14);
  if ((uVar1 >> 1 & 1) == 0) {
    func_0x0036e3d8(*unaff_x22);
    uVar1 = *(uint *)((long)unaff_x22 + 0x14);
  }
  if ((uVar1 & 1) == 0) {
    *unaff_x22 = 0;
  }
  else {
    func_0x0036e3d8();
  }
joined_r0x002c121c:
  if (unaff_x21 != (ulong *)0x0) {
    uVar1 = *(uint *)((long)unaff_x21 + 0x14);
    if ((uVar1 >> 1 & 1) == 0) {
      func_0x0036e3d8(*unaff_x21);
      uVar1 = *(uint *)((long)unaff_x21 + 0x14);
    }
    if ((uVar1 & 1) == 0) {
      *unaff_x21 = 0;
    }
    else {
      func_0x0036e3d8();
    }
  }
  if (unaff_x19 != (undefined8 *)0x0) {
    uVar1 = *(uint *)((long)unaff_x19 + 0x14);
    if ((uVar1 >> 1 & 1) == 0) {
      func_0x0036e3d8(*unaff_x19);
      uVar1 = *(uint *)((long)unaff_x19 + 0x14);
    }
    if ((uVar1 & 1) == 0) {
      *unaff_x19 = 0;
    }
    else {
      func_0x0036e3d8();
    }
  }
  func_0x002bf97c();
  return 0;
}

