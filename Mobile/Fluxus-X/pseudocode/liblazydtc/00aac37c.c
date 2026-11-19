/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aac37c
 */

int CRYPTO_ocb128_finish(undefined8 *param_1,void *param_2,size_t param_3)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 local_40;
  undefined8 uStack_38;
  
  if (param_3 - 1 < 0x10) {
    uVar3 = param_1[0x13];
    uVar2 = param_1[0x12];
    uVar5 = param_1[0x15];
    uVar4 = param_1[0x14];
    uVar7 = param_1[10];
    uVar6 = param_1[9];
    local_40 = CONCAT17((byte)((ulong)uVar2 >> 0x38) ^ (byte)((ulong)uVar4 >> 0x38) ^
                        (byte)((ulong)uVar6 >> 0x38),
                        CONCAT16((byte)((ulong)uVar2 >> 0x30) ^ (byte)((ulong)uVar4 >> 0x30) ^
                                 (byte)((ulong)uVar6 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar2 >> 0x28) ^
                                          (byte)((ulong)uVar4 >> 0x28) ^
                                          (byte)((ulong)uVar6 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar2 >> 0x20) ^
                                                   (byte)((ulong)uVar4 >> 0x20) ^
                                                   (byte)((ulong)uVar6 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar2 >> 0x18) ^
                                                            (byte)((ulong)uVar4 >> 0x18) ^
                                                            (byte)((ulong)uVar6 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar2 >> 0x10) ^
                                                                     (byte)((ulong)uVar4 >> 0x10) ^
                                                                     (byte)((ulong)uVar6 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar2 >>
                                                                                    8) ^
                                                                              (byte)((ulong)uVar4 >>
                                                                                    8) ^
                                                                              (byte)((ulong)uVar6 >>
                                                                                    8),(byte)uVar2 ^
                                                                                       (byte)uVar4 ^
                                                                                       (byte)uVar6))
                                                           )))));
    uStack_38 = CONCAT17((byte)((ulong)uVar3 >> 0x38) ^ (byte)((ulong)uVar5 >> 0x38) ^
                         (byte)((ulong)uVar7 >> 0x38),
                         CONCAT16((byte)((ulong)uVar3 >> 0x30) ^ (byte)((ulong)uVar5 >> 0x30) ^
                                  (byte)((ulong)uVar7 >> 0x30),
                                  CONCAT15((byte)((ulong)uVar3 >> 0x28) ^
                                           (byte)((ulong)uVar5 >> 0x28) ^
                                           (byte)((ulong)uVar7 >> 0x28),
                                           CONCAT14((byte)((ulong)uVar3 >> 0x20) ^
                                                    (byte)((ulong)uVar5 >> 0x20) ^
                                                    (byte)((ulong)uVar7 >> 0x20),
                                                    CONCAT13((byte)((ulong)uVar3 >> 0x18) ^
                                                             (byte)((ulong)uVar5 >> 0x18) ^
                                                             (byte)((ulong)uVar7 >> 0x18),
                                                             CONCAT12((byte)((ulong)uVar3 >> 0x10) ^
                                                                      (byte)((ulong)uVar5 >> 0x10) ^
                                                                      (byte)((ulong)uVar7 >> 0x10),
                                                                      CONCAT11((byte)((ulong)uVar3
                                                                                     >> 8) ^
                                                                               (byte)((ulong)uVar5
                                                                                     >> 8) ^
                                                                               (byte)((ulong)uVar7
                                                                                     >> 8),
                                                                               (byte)uVar3 ^
                                                                               (byte)uVar5 ^
                                                                               (byte)uVar7)))))));
    (*(code *)*param_1)(&local_40,&local_40,param_1[2]);
    uVar3 = param_1[0x11];
    uVar2 = param_1[0x10];
    local_40 = CONCAT17((byte)((ulong)uVar2 >> 0x38) ^ (byte)((ulong)local_40 >> 0x38),
                        CONCAT16((byte)((ulong)uVar2 >> 0x30) ^ (byte)((ulong)local_40 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar2 >> 0x28) ^
                                          (byte)((ulong)local_40 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar2 >> 0x20) ^
                                                   (byte)((ulong)local_40 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar2 >> 0x18) ^
                                                            (byte)((ulong)local_40 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar2 >> 0x10) ^
                                                                     (byte)((ulong)local_40 >> 0x10)
                                                                     ,CONCAT11((byte)((ulong)uVar2
                                                                                     >> 8) ^
                                                                               (byte)((ulong)
                                                  local_40 >> 8),(byte)uVar2 ^ (byte)local_40)))))))
    ;
    uStack_38 = CONCAT17((byte)((ulong)uVar3 >> 0x38) ^ (byte)((ulong)uStack_38 >> 0x38),
                         CONCAT16((byte)((ulong)uVar3 >> 0x30) ^ (byte)((ulong)uStack_38 >> 0x30),
                                  CONCAT15((byte)((ulong)uVar3 >> 0x28) ^
                                           (byte)((ulong)uStack_38 >> 0x28),
                                           CONCAT14((byte)((ulong)uVar3 >> 0x20) ^
                                                    (byte)((ulong)uStack_38 >> 0x20),
                                                    CONCAT13((byte)((ulong)uVar3 >> 0x18) ^
                                                             (byte)((ulong)uStack_38 >> 0x18),
                                                             CONCAT12((byte)((ulong)uVar3 >> 0x10) ^
                                                                      (byte)((ulong)uStack_38 >>
                                                                            0x10),
                                                                      CONCAT11((byte)((ulong)uVar3
                                                                                     >> 8) ^
                                                                               (byte)((ulong)
                                                  uStack_38 >> 8),(byte)uVar3 ^ (byte)uStack_38)))))
                                 ));
    iVar1 = CRYPTO_memcmp(&local_40,param_2,param_3);
    return iVar1;
  }
  return -1;
}

