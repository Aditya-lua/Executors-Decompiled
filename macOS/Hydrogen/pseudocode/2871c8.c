
long FUN_002871c8(undefined8 param_1,undefined8 param_2,undefined8 *param_3,ulong param_4)

{
  uint uVar1;
  long lVar2;
  long lVar3;
  undefined8 *puVar4;
  int in_w8;
  ulong uVar5;
  ulong uVar6;
  long lVar7;
  long lVar8;
  undefined8 *puVar9;
  ulong uVar10;
  undefined8 *puVar11;
  byte *pbVar12;
  uint uVar13;
  byte *pbVar14;
  byte *pbVar15;
  undefined8 *puVar16;
  ulong uVar17;
  undefined8 *puVar18;
  long unaff_x19;
  long unaff_x22;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined1 auVar27 [16];
  
  if (in_w8 == 0) {
    return 1;
  }
  uVar5 = unaff_x22 + 0xb0 + ((ulong)(uint)-(int)(unaff_x22 + 0xb0) & 0x3f);
  if ((uVar5 & 0x3f) == 0) {
    lVar2 = *(long *)(unaff_x19 + 0x10) + 0xb0;
    uVar6 = lVar2 + ((ulong)(uint)-(int)lVar2 & 0x3f);
    if ((uVar6 & 0x3f) == 0) {
      _memcpy(uVar6,uVar5,0x1c1);
      return 1;
    }
  }
  else {
    func_0x0079d498();
  }
  auVar27 = func_0x0079d498();
  puVar4 = auVar27._8_8_;
  lVar2 = auVar27._0_8_;
  uVar13 = *(uint *)(lVar2 + 0x70);
  uVar5 = (ulong)uVar13;
  puVar9 = puVar4;
  puVar11 = param_3;
  if (uVar13 != 0) {
    if ((param_4 != 0) && (uVar13 < 0x40)) {
      uVar6 = param_4 - 1;
      if (0x3f - uVar5 <= param_4 - 1) {
        uVar6 = 0x3f - uVar5;
      }
      uVar10 = uVar5;
      if (((uVar6 < 0x1f) || ((ulong)((long)puVar4 - (long)param_3) < 0x20)) ||
         ((long)puVar4 + (-uVar5 - lVar2) + -0x30 < 0x20)) {
code_r0x002873fc:
        lVar3 = 0;
        do {
          *(byte *)((long)puVar9 + lVar3) =
               *(byte *)(uVar10 + lVar2 + 0x30 + lVar3) ^ *(byte *)((long)puVar11 + lVar3);
          lVar7 = lVar3 + 1;
          if (param_4 - 1 == lVar3) break;
          uVar5 = uVar10 + lVar3;
          lVar3 = lVar7;
        } while (uVar5 < 0x3f);
        uVar10 = uVar10 + lVar7;
        puVar9 = (undefined8 *)((long)puVar9 + lVar7);
        puVar11 = (undefined8 *)((long)puVar11 + lVar7);
        param_4 = param_4 - lVar7;
      }
      else {
        uVar17 = uVar6 + 1 & 0xffffffffffffffe0;
        param_4 = param_4 - uVar17;
        puVar11 = (undefined8 *)((long)param_3 + uVar17);
        puVar9 = (undefined8 *)((long)puVar4 + uVar17);
        uVar10 = uVar17 + uVar5;
        uVar20 = param_3[1];
        uVar19 = *param_3;
        uVar25 = param_3[3];
        uVar22 = param_3[2];
        lVar3 = lVar2 + uVar5;
        uVar23 = *(undefined8 *)(lVar3 + 0x38);
        uVar21 = *(undefined8 *)(lVar3 + 0x30);
        uVar26 = *(undefined8 *)(lVar3 + 0x48);
        uVar24 = *(undefined8 *)(lVar3 + 0x40);
        puVar4[1] = CONCAT17((byte)((ulong)uVar23 >> 0x38) ^ (byte)((ulong)uVar20 >> 0x38),
                             CONCAT16((byte)((ulong)uVar23 >> 0x30) ^ (byte)((ulong)uVar20 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar23 >> 0x28) ^
                                               (byte)((ulong)uVar20 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar23 >> 0x20) ^
                                                        (byte)((ulong)uVar20 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar23 >> 0x18) ^
                                                                 (byte)((ulong)uVar20 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar23 >>
                                                                                0x10) ^
                                                                          (byte)((ulong)uVar20 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar23 >> 8) ^ (byte)((ulong)uVar20 >> 8),
                                                  (byte)uVar23 ^ (byte)uVar20)))))));
        *puVar4 = CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar19 >> 0x38),
                           CONCAT16((byte)((ulong)uVar21 >> 0x30) ^ (byte)((ulong)uVar19 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar21 >> 0x28) ^
                                             (byte)((ulong)uVar19 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar21 >> 0x20) ^
                                                      (byte)((ulong)uVar19 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar21 >> 0x18) ^
                                                               (byte)((ulong)uVar19 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar21 >> 0x10
                                                                              ) ^ (byte)((ulong)
                                                  uVar19 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar21 >> 8) ^
                                                           (byte)((ulong)uVar19 >> 8),
                                                           (byte)uVar21 ^ (byte)uVar19)))))));
        puVar4[3] = CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)((ulong)uVar25 >> 0x38),
                             CONCAT16((byte)((ulong)uVar26 >> 0x30) ^ (byte)((ulong)uVar25 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar26 >> 0x28) ^
                                               (byte)((ulong)uVar25 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar26 >> 0x20) ^
                                                        (byte)((ulong)uVar25 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar26 >> 0x18) ^
                                                                 (byte)((ulong)uVar25 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar26 >>
                                                                                0x10) ^
                                                                          (byte)((ulong)uVar25 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar26 >> 8) ^ (byte)((ulong)uVar25 >> 8),
                                                  (byte)uVar26 ^ (byte)uVar25)))))));
        puVar4[2] = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                             CONCAT16((byte)((ulong)uVar24 >> 0x30) ^ (byte)((ulong)uVar22 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                               (byte)((ulong)uVar22 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                        (byte)((ulong)uVar22 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar24 >> 0x18) ^
                                                                 (byte)((ulong)uVar22 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar24 >>
                                                                                0x10) ^
                                                                          (byte)((ulong)uVar22 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar24 >> 8) ^ (byte)((ulong)uVar22 >> 8),
                                                  (byte)uVar24 ^ (byte)uVar22)))))));
        if (uVar6 + 1 != uVar17) goto code_r0x002873fc;
      }
      uVar13 = (uint)uVar10;
    }
    *(uint *)(lVar2 + 0x70) = uVar13;
    if (param_4 == 0) {
      return lVar2;
    }
    if (uVar13 == 0x40) {
      *(undefined4 *)(lVar2 + 0x70) = 0;
      *(int *)(lVar2 + 0x20) = *(int *)(lVar2 + 0x20) + 1;
    }
  }
  uVar13 = *(uint *)(lVar2 + 0x20);
  lVar3 = lVar2;
  for (uVar5 = param_4 & 0xffffffffffffffc0; uVar5 != 0; uVar5 = uVar5 + lVar7 * -0x40) {
    uVar6 = uVar5 >> 6;
    if (0xfffffff < uVar6) {
      uVar6 = 0x10000000;
    }
    uVar1 = uVar13 + (int)uVar6;
    uVar10 = (ulong)uVar1;
    uVar13 = 0;
    if (uVar6 <= uVar10) {
      uVar10 = 0;
      uVar13 = uVar1;
    }
    lVar7 = uVar6 - uVar10;
    lVar3 = func_0x002857d8(puVar9,puVar11,lVar7 * 0x40,lVar2,lVar2 + 0x74);
    puVar11 = puVar11 + lVar7 * 8;
    puVar9 = puVar9 + lVar7 * 8;
    *(uint *)(lVar2 + 0x20) = uVar13;
  }
  if ((param_4 & 0x3f) == 0) {
    return lVar3;
  }
  *(undefined8 *)(lVar2 + 0x58) = 0;
  *(undefined8 *)(lVar2 + 0x50) = 0;
  *(undefined8 *)(lVar2 + 0x68) = 0;
  *(undefined8 *)(lVar2 + 0x60) = 0;
  *(undefined8 *)(lVar2 + 0x48) = 0;
  *(undefined8 *)(lVar2 + 0x40) = 0;
  puVar4 = (undefined8 *)(lVar2 + 0x30);
  *(undefined8 *)(lVar2 + 0x38) = 0;
  *puVar4 = 0;
  lVar3 = func_0x002857d8(puVar4,puVar4,0x40,lVar2,lVar2 + 0x74,uVar13);
  uVar5 = param_4 & 0x3f;
  if ((uVar5 < 0x10) ||
     ((ulong)((long)puVar9 - (long)puVar11) < 0x10 || (ulong)((long)puVar9 + (-0x30 - lVar2)) < 0x10
     )) {
    lVar7 = 0;
  }
  else {
    lVar7 = uVar5 - (param_4 & 0xf);
    puVar4 = puVar11 + 1;
    puVar16 = puVar9 + 1;
    puVar18 = (undefined8 *)(lVar2 + 0x38);
    lVar8 = lVar7;
    do {
      uVar19 = puVar4[-1];
      uVar20 = *puVar4;
      uVar22 = puVar18[-1];
      uVar25 = *puVar18;
      puVar16[-1] = CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar19 >> 0x38),
                             CONCAT16((byte)((ulong)uVar22 >> 0x30) ^ (byte)((ulong)uVar19 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar22 >> 0x28) ^
                                               (byte)((ulong)uVar19 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar22 >> 0x20) ^
                                                        (byte)((ulong)uVar19 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar22 >> 0x18) ^
                                                                 (byte)((ulong)uVar19 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar22 >>
                                                                                0x10) ^
                                                                          (byte)((ulong)uVar19 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar22 >> 8) ^ (byte)((ulong)uVar19 >> 8),
                                                  (byte)uVar22 ^ (byte)uVar19)))))));
      *puVar16 = CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ (byte)((ulong)uVar20 >> 0x38),
                          CONCAT16((byte)((ulong)uVar25 >> 0x30) ^ (byte)((ulong)uVar20 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar25 >> 0x28) ^
                                            (byte)((ulong)uVar20 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar25 >> 0x20) ^
                                                     (byte)((ulong)uVar20 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar25 >> 0x18) ^
                                                              (byte)((ulong)uVar20 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar25 >> 0x10)
                                                                       ^ (byte)((ulong)uVar20 >>
                                                                               0x10),
                                                                       CONCAT11((byte)((ulong)uVar25
                                                                                      >> 8) ^
                                                                                (byte)((ulong)uVar20
                                                                                      >> 8),
                                                                                (byte)uVar25 ^
                                                                                (byte)uVar20)))))));
      puVar4 = puVar4 + 2;
      puVar16 = puVar16 + 2;
      puVar18 = puVar18 + 2;
      lVar8 = lVar8 + -0x10;
    } while (lVar8 != 0);
    if ((param_4 & 0xf) == 0) goto code_r0x00287570;
  }
  lVar8 = uVar5 - lVar7;
  pbVar12 = (byte *)((long)puVar11 + lVar7);
  pbVar14 = (byte *)((long)puVar9 + lVar7);
  pbVar15 = (byte *)(lVar7 + lVar2 + 0x30);
  do {
    *pbVar14 = *pbVar15 ^ *pbVar12;
    lVar8 = lVar8 + -1;
    pbVar12 = pbVar12 + 1;
    pbVar14 = pbVar14 + 1;
    pbVar15 = pbVar15 + 1;
  } while (lVar8 != 0);
code_r0x00287570:
  *(uint *)(lVar2 + 0x70) = (uint)param_4 & 0x3f;
  return lVar3;
}

