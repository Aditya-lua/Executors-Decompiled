/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b736a4
 */

void mbedtls_ct_zeroize_if(uint param_1,long param_2,ulong param_3)

{
  byte bVar1;
  ulong uVar2;
  byte *pbVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  undefined8 *puVar7;
  ulong uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  
  uVar4 = 0;
  if (3 < param_3) {
    uVar2 = 0;
    do {
      uVar4 = uVar2 + 4;
      uVar8 = uVar2 + 8;
      *(uint *)(param_2 + uVar2) = *(uint *)(param_2 + uVar2) & ~param_1;
      uVar2 = uVar4;
    } while (uVar8 <= param_3);
  }
  if (uVar4 < param_3) {
    uVar2 = param_3 - uVar4;
    bVar1 = (byte)~param_1;
    if (0x1f < uVar2) {
      uVar6 = uVar2 & 0xffffffffffffffe0;
      lVar5 = param_2 + uVar4;
      uVar4 = uVar4 + uVar6;
      puVar7 = (undefined8 *)(lVar5 + 0x10);
      uVar8 = uVar6;
      do {
        uVar10 = puVar7[-1];
        uVar9 = puVar7[-2];
        uVar12 = puVar7[1];
        uVar11 = *puVar7;
        uVar8 = uVar8 - 0x20;
        puVar7[-1] = CONCAT17((byte)((ulong)uVar10 >> 0x38) & bVar1,
                              CONCAT16((byte)((ulong)uVar10 >> 0x30) & bVar1,
                                       CONCAT15((byte)((ulong)uVar10 >> 0x28) & bVar1,
                                                CONCAT14((byte)((ulong)uVar10 >> 0x20) & bVar1,
                                                         CONCAT13((byte)((ulong)uVar10 >> 0x18) &
                                                                  bVar1,CONCAT12((byte)((ulong)
                                                  uVar10 >> 0x10) & bVar1,
                                                  CONCAT11((byte)((ulong)uVar10 >> 8) & bVar1,
                                                           (byte)uVar10 & bVar1)))))));
        puVar7[-2] = CONCAT17((byte)((ulong)uVar9 >> 0x38) & bVar1,
                              CONCAT16((byte)((ulong)uVar9 >> 0x30) & bVar1,
                                       CONCAT15((byte)((ulong)uVar9 >> 0x28) & bVar1,
                                                CONCAT14((byte)((ulong)uVar9 >> 0x20) & bVar1,
                                                         CONCAT13((byte)((ulong)uVar9 >> 0x18) &
                                                                  bVar1,CONCAT12((byte)((ulong)uVar9
                                                                                       >> 0x10) &
                                                                                 bVar1,CONCAT11((
                                                  byte)((ulong)uVar9 >> 8) & bVar1,
                                                  (byte)uVar9 & bVar1)))))));
        puVar7[1] = CONCAT17((byte)((ulong)uVar12 >> 0x38) & bVar1,
                             CONCAT16((byte)((ulong)uVar12 >> 0x30) & bVar1,
                                      CONCAT15((byte)((ulong)uVar12 >> 0x28) & bVar1,
                                               CONCAT14((byte)((ulong)uVar12 >> 0x20) & bVar1,
                                                        CONCAT13((byte)((ulong)uVar12 >> 0x18) &
                                                                 bVar1,CONCAT12((byte)((ulong)uVar12
                                                                                      >> 0x10) &
                                                                                bVar1,CONCAT11((byte
                                                  )((ulong)uVar12 >> 8) & bVar1,(byte)uVar12 & bVar1
                                                  )))))));
        *puVar7 = CONCAT17((byte)((ulong)uVar11 >> 0x38) & bVar1,
                           CONCAT16((byte)((ulong)uVar11 >> 0x30) & bVar1,
                                    CONCAT15((byte)((ulong)uVar11 >> 0x28) & bVar1,
                                             CONCAT14((byte)((ulong)uVar11 >> 0x20) & bVar1,
                                                      CONCAT13((byte)((ulong)uVar11 >> 0x18) & bVar1
                                                               ,CONCAT12((byte)((ulong)uVar11 >>
                                                                               0x10) & bVar1,
                                                                         CONCAT11((byte)((ulong)
                                                  uVar11 >> 8) & bVar1,(byte)uVar11 & bVar1)))))));
        puVar7 = puVar7 + 4;
      } while (uVar8 != 0);
      if (uVar2 == uVar6) {
        return;
      }
    }
    lVar5 = param_3 - uVar4;
    pbVar3 = (byte *)(param_2 + uVar4);
    do {
      lVar5 = lVar5 + -1;
      *pbVar3 = *pbVar3 & bVar1;
      pbVar3 = pbVar3 + 1;
    } while (lVar5 != 0);
  }
  return;
}

