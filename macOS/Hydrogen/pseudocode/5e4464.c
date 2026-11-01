
void FUN_005e4464(ulong param_1)

{
  bool in_ZR;
  uint *puVar1;
  long in_x9;
  uint *puVar2;
  ulong in_x10;
  ulong uVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  long lVar6;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x23;
  ulong unaff_x24;
  ulong unaff_x25;
  undefined8 unaff_x26;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  
  if (!in_ZR) {
    uVar3 = in_x10;
    if ((param_1 & 0xc) != 0) {
      uVar3 = param_1 & 0x3ffffffffffffffc;
      lVar6 = in_x10 - uVar3;
      puVar4 = (undefined8 *)(unaff_x20 + in_x10 * 4);
      puVar5 = (undefined8 *)(in_x9 + in_x10 * 4);
      do {
        uVar8 = puVar5[1];
        uVar7 = *puVar5;
        uVar10 = puVar4[1];
        uVar9 = *puVar4;
        puVar4[1] = CONCAT17((byte)((ulong)uVar10 >> 0x38) | (byte)((ulong)uVar8 >> 0x38),
                             CONCAT16((byte)((ulong)uVar10 >> 0x30) | (byte)((ulong)uVar8 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar10 >> 0x28) |
                                               (byte)((ulong)uVar8 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar10 >> 0x20) |
                                                        (byte)((ulong)uVar8 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar10 >> 0x18) |
                                                                 (byte)((ulong)uVar8 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar10 >>
                                                                                0x10) |
                                                                          (byte)((ulong)uVar8 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar10 >> 8) | (byte)((ulong)uVar8 >> 8),
                                                  (byte)uVar10 | (byte)uVar8)))))));
        *puVar4 = CONCAT17((byte)((ulong)uVar9 >> 0x38) | (byte)((ulong)uVar7 >> 0x38),
                           CONCAT16((byte)((ulong)uVar9 >> 0x30) | (byte)((ulong)uVar7 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar9 >> 0x28) |
                                             (byte)((ulong)uVar7 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar9 >> 0x20) |
                                                      (byte)((ulong)uVar7 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar9 >> 0x18) |
                                                               (byte)((ulong)uVar7 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar9 >> 0x10)
                                                                        | (byte)((ulong)uVar7 >>
                                                                                0x10),
                                                                        CONCAT11((byte)((ulong)uVar9
                                                                                       >> 8) |
                                                                                 (byte)((ulong)uVar7
                                                                                       >> 8),
                                                                                 (byte)uVar9 |
                                                                                 (byte)uVar7)))))));
        lVar6 = lVar6 + 4;
        puVar4 = puVar4 + 2;
        puVar5 = puVar5 + 2;
      } while (lVar6 != 0);
      if (param_1 == uVar3) goto LAB_005e43f4;
    }
    lVar6 = param_1 - uVar3;
    puVar1 = (uint *)(in_x9 + uVar3 * 4);
    puVar2 = (uint *)(unaff_x20 + uVar3 * 4);
    do {
      *puVar2 = *puVar2 | *puVar1;
      lVar6 = lVar6 + -1;
      puVar1 = puVar1 + 1;
      puVar2 = puVar2 + 1;
    } while (lVar6 != 0);
  }
LAB_005e43f4:
  if (unaff_x25 <= unaff_x24) {
    unaff_x25 = unaff_x24;
  }
  *unaff_x19 = unaff_x23;
  unaff_x19[1] = unaff_x20;
  unaff_x19[2] = unaff_x26;
  unaff_x19[3] = unaff_x25;
  return;
}

