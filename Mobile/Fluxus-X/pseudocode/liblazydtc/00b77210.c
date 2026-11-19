/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b77210
 */

void mbedtls_gcm_starts(long param_1,undefined1 param_2,byte *param_3,ulong param_4)

{
  byte *pbVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  undefined8 uVar5;
  ulong uVar6;
  long lVar7;
  byte *pbVar8;
  byte *pbVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 local_78;
  undefined8 local_70;
  ulong uStack_68;
  long local_58;
  
  lVar4 = tpidr_el0;
  local_58 = *(long *)(lVar4 + 0x28);
  local_78 = 0;
  if (param_4 - 1 < 0x1fffffffffffffff) {
    pbVar1 = (byte *)(param_1 + 0x180);
    *(undefined1 *)(param_1 + 0x1a0) = param_2;
    *(undefined8 *)(param_1 + 0x188) = 0;
    *(undefined8 *)(param_1 + 0x180) = 0;
    *(undefined8 *)(param_1 + 0x198) = 0;
    *(undefined8 *)(param_1 + 400) = 0;
    *(undefined8 *)(param_1 + 0x168) = 0;
    *(undefined8 *)(param_1 + 0x160) = 0;
    if (param_4 == 0xc) {
      *(undefined4 *)(param_1 + 0x188) = *(undefined4 *)(param_3 + 8);
      *(undefined8 *)pbVar1 = *(undefined8 *)param_3;
      *(undefined1 *)(param_1 + 399) = 1;
    }
    else {
      uVar3 = (param_4 << 3 & 0xff00ff00ff00ff00) >> 8 | (param_4 << 3 & 0xff00ff00ff00ff) << 8;
      uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
      uStack_68 = uVar3 >> 0x20 | uVar3 << 0x20;
      local_70 = 0;
      do {
        if (param_4 < 0x10) {
          uVar3 = param_4;
          if (param_4 != 0) {
            if ((0x1f < param_4) &&
               ((param_3 + param_4 <= pbVar1 || ((byte *)(param_1 + param_4 + 0x180) <= param_3))))
            {
              lVar7 = 0;
              do {
                lVar2 = param_1 + lVar7;
                pbVar8 = param_3 + lVar7;
                uVar10 = *(undefined8 *)(lVar2 + 0x188);
                uVar5 = *(undefined8 *)(lVar2 + 0x180);
                uVar12 = *(undefined8 *)(lVar2 + 0x198);
                uVar11 = *(undefined8 *)(lVar2 + 400);
                uVar14 = *(undefined8 *)(pbVar8 + 8);
                uVar13 = *(undefined8 *)pbVar8;
                uVar16 = *(undefined8 *)(pbVar8 + 0x18);
                uVar15 = *(undefined8 *)(pbVar8 + 0x10);
                lVar7 = lVar7 + 0x20;
                *(ulong *)(lVar2 + 0x188) =
                     CONCAT17((byte)((ulong)uVar14 >> 0x38) ^ (byte)((ulong)uVar10 >> 0x38),
                              CONCAT16((byte)((ulong)uVar14 >> 0x30) ^ (byte)((ulong)uVar10 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar14 >> 0x28) ^
                                                 (byte)((ulong)uVar10 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar14 >> 0x20) ^
                                                          (byte)((ulong)uVar10 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar14 >> 0x18) ^
                                                                   (byte)((ulong)uVar10 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar14 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar10 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar14 >> 8) ^ (byte)((ulong)uVar10 >> 8),
                                                  (byte)uVar14 ^ (byte)uVar10)))))));
                *(ulong *)(lVar2 + 0x180) =
                     CONCAT17((byte)((ulong)uVar13 >> 0x38) ^ (byte)((ulong)uVar5 >> 0x38),
                              CONCAT16((byte)((ulong)uVar13 >> 0x30) ^ (byte)((ulong)uVar5 >> 0x30),
                                       CONCAT15((byte)((ulong)uVar13 >> 0x28) ^
                                                (byte)((ulong)uVar5 >> 0x28),
                                                CONCAT14((byte)((ulong)uVar13 >> 0x20) ^
                                                         (byte)((ulong)uVar5 >> 0x20),
                                                         CONCAT13((byte)((ulong)uVar13 >> 0x18) ^
                                                                  (byte)((ulong)uVar5 >> 0x18),
                                                                  CONCAT12((byte)((ulong)uVar13 >>
                                                                                 0x10) ^
                                                                           (byte)((ulong)uVar5 >>
                                                                                 0x10),
                                                                           CONCAT11((byte)((ulong)
                                                  uVar13 >> 8) ^ (byte)((ulong)uVar5 >> 8),
                                                  (byte)uVar13 ^ (byte)uVar5)))))));
                *(ulong *)(lVar2 + 0x198) =
                     CONCAT17((byte)((ulong)uVar16 >> 0x38) ^ (byte)((ulong)uVar12 >> 0x38),
                              CONCAT16((byte)((ulong)uVar16 >> 0x30) ^ (byte)((ulong)uVar12 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar16 >> 0x28) ^
                                                 (byte)((ulong)uVar12 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar16 >> 0x20) ^
                                                          (byte)((ulong)uVar12 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar16 >> 0x18) ^
                                                                   (byte)((ulong)uVar12 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar16 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar12 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar16 >> 8) ^ (byte)((ulong)uVar12 >> 8),
                                                  (byte)uVar16 ^ (byte)uVar12)))))));
                *(ulong *)(lVar2 + 400) =
                     CONCAT17((byte)((ulong)uVar15 >> 0x38) ^ (byte)((ulong)uVar11 >> 0x38),
                              CONCAT16((byte)((ulong)uVar15 >> 0x30) ^ (byte)((ulong)uVar11 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar15 >> 0x28) ^
                                                 (byte)((ulong)uVar11 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar15 >> 0x20) ^
                                                          (byte)((ulong)uVar11 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar15 >> 0x18) ^
                                                                   (byte)((ulong)uVar11 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar15 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar11 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar15 >> 8) ^ (byte)((ulong)uVar11 >> 8),
                                                  (byte)uVar15 ^ (byte)uVar11)))))));
              } while (lVar7 != 0);
              if (param_4 == 0) goto LAB_00b77344;
            }
            uVar6 = param_4;
            pbVar8 = param_3;
            pbVar9 = pbVar1;
            do {
              uVar6 = uVar6 - 1;
              *pbVar9 = *pbVar8 ^ *pbVar9;
              pbVar8 = pbVar8 + 1;
              pbVar9 = pbVar9 + 1;
            } while (uVar6 != 0);
          }
        }
        else {
          uVar10 = *(undefined8 *)(param_1 + 0x188);
          uVar5 = *(undefined8 *)pbVar1;
          uVar12 = *(undefined8 *)(param_3 + 8);
          uVar11 = *(undefined8 *)param_3;
          *(ulong *)(param_1 + 0x188) =
               CONCAT17((byte)((ulong)uVar12 >> 0x38) ^ (byte)((ulong)uVar10 >> 0x38),
                        CONCAT16((byte)((ulong)uVar12 >> 0x30) ^ (byte)((ulong)uVar10 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar12 >> 0x28) ^
                                          (byte)((ulong)uVar10 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar12 >> 0x20) ^
                                                   (byte)((ulong)uVar10 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar12 >> 0x18) ^
                                                            (byte)((ulong)uVar10 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar12 >> 0x10) ^
                                                                     (byte)((ulong)uVar10 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar12
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar10
                                                                                    >> 8),
                                                                              (byte)uVar12 ^
                                                                              (byte)uVar10)))))));
          *(ulong *)pbVar1 =
               CONCAT17((byte)((ulong)uVar11 >> 0x38) ^ (byte)((ulong)uVar5 >> 0x38),
                        CONCAT16((byte)((ulong)uVar11 >> 0x30) ^ (byte)((ulong)uVar5 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar11 >> 0x28) ^
                                          (byte)((ulong)uVar5 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar11 >> 0x20) ^
                                                   (byte)((ulong)uVar5 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar11 >> 0x18) ^
                                                            (byte)((ulong)uVar5 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar11 >> 0x10) ^
                                                                     (byte)((ulong)uVar5 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar11
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar5 >>
                                                                                    8),(byte)uVar11
                                                                                       ^ (byte)uVar5
                                                                             )))))));
          uVar3 = 0x10;
        }
LAB_00b77344:
        FUN_00b773c8(param_1,pbVar1,pbVar1);
        param_4 = param_4 - uVar3;
        param_3 = param_3 + uVar3;
      } while (param_4 != 0);
      uVar10 = *(undefined8 *)(param_1 + 0x188);
      uVar5 = *(undefined8 *)(param_1 + 0x180);
      *(ulong *)(param_1 + 0x188) =
           CONCAT17((byte)(uStack_68 >> 0x38) ^ (byte)((ulong)uVar10 >> 0x38),
                    CONCAT16((byte)(uStack_68 >> 0x30) ^ (byte)((ulong)uVar10 >> 0x30),
                             CONCAT15((byte)(uStack_68 >> 0x28) ^ (byte)((ulong)uVar10 >> 0x28),
                                      CONCAT14((byte)(uStack_68 >> 0x20) ^
                                               (byte)((ulong)uVar10 >> 0x20),
                                               CONCAT13((byte)(uStack_68 >> 0x18) ^
                                                        (byte)((ulong)uVar10 >> 0x18),
                                                        CONCAT12((byte)(uStack_68 >> 0x10) ^
                                                                 (byte)((ulong)uVar10 >> 0x10),
                                                                 CONCAT11((byte)(uStack_68 >> 8) ^
                                                                          (byte)((ulong)uVar10 >> 8)
                                                                          ,(byte)uStack_68 ^
                                                                           (byte)uVar10)))))));
      *(ulong *)(param_1 + 0x180) =
           CONCAT17((byte)((ulong)local_70 >> 0x38) ^ (byte)((ulong)uVar5 >> 0x38),
                    CONCAT16((byte)((ulong)local_70 >> 0x30) ^ (byte)((ulong)uVar5 >> 0x30),
                             CONCAT15((byte)((ulong)local_70 >> 0x28) ^ (byte)((ulong)uVar5 >> 0x28)
                                      ,CONCAT14((byte)((ulong)local_70 >> 0x20) ^
                                                (byte)((ulong)uVar5 >> 0x20),
                                                CONCAT13((byte)((ulong)local_70 >> 0x18) ^
                                                         (byte)((ulong)uVar5 >> 0x18),
                                                         CONCAT12((byte)((ulong)local_70 >> 0x10) ^
                                                                  (byte)((ulong)uVar5 >> 0x10),
                                                                  CONCAT11((byte)((ulong)local_70 >>
                                                                                 8) ^
                                                                           (byte)((ulong)uVar5 >> 8)
                                                                           ,(byte)local_70 ^
                                                                            (byte)uVar5)))))));
      FUN_00b773c8(param_1,pbVar1,pbVar1);
    }
    uVar5 = mbedtls_cipher_update(param_1,pbVar1,0x10,param_1 + 0x170,&local_78);
  }
  else {
    uVar5 = 0xffffffec;
  }
  if (*(long *)(lVar4 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}

