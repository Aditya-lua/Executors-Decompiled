/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b70dc0
 */

void mbedtls_aria_crypt_cbc
               (undefined8 param_1,uint param_2,ulong param_3,undefined8 *param_4,
               undefined8 *param_5,undefined8 *param_6)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  
  lVar1 = tpidr_el0;
  lVar3 = *(long *)(lVar1 + 0x28);
  if (param_2 < 2) {
    if ((param_3 & 0xf) == 0) {
      if (param_2 == 0) {
        for (; param_3 != 0; param_3 = param_3 - 0x10) {
          uVar5 = param_5[1];
          uVar2 = *param_5;
          mbedtls_aria_crypt_ecb(param_1,param_5,param_6);
          uVar6 = param_6[1];
          uVar4 = *param_6;
          uVar8 = param_4[1];
          uVar7 = *param_4;
          param_5 = param_5 + 2;
          param_6[1] = CONCAT17((byte)((ulong)uVar8 >> 0x38) ^ (byte)((ulong)uVar6 >> 0x38),
                                CONCAT16((byte)((ulong)uVar8 >> 0x30) ^ (byte)((ulong)uVar6 >> 0x30)
                                         ,CONCAT15((byte)((ulong)uVar8 >> 0x28) ^
                                                   (byte)((ulong)uVar6 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar8 >> 0x20) ^
                                                            (byte)((ulong)uVar6 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar8 >> 0x18) ^
                                                                     (byte)((ulong)uVar6 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar8 >>
                                                                                    0x10) ^
                                                                              (byte)((ulong)uVar6 >>
                                                                                    0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar8 >> 8) ^ (byte)((ulong)uVar6 >> 8),
                                                  (byte)uVar8 ^ (byte)uVar6)))))));
          *param_6 = CONCAT17((byte)((ulong)uVar7 >> 0x38) ^ (byte)((ulong)uVar4 >> 0x38),
                              CONCAT16((byte)((ulong)uVar7 >> 0x30) ^ (byte)((ulong)uVar4 >> 0x30),
                                       CONCAT15((byte)((ulong)uVar7 >> 0x28) ^
                                                (byte)((ulong)uVar4 >> 0x28),
                                                CONCAT14((byte)((ulong)uVar7 >> 0x20) ^
                                                         (byte)((ulong)uVar4 >> 0x20),
                                                         CONCAT13((byte)((ulong)uVar7 >> 0x18) ^
                                                                  (byte)((ulong)uVar4 >> 0x18),
                                                                  CONCAT12((byte)((ulong)uVar7 >>
                                                                                 0x10) ^
                                                                           (byte)((ulong)uVar4 >>
                                                                                 0x10),
                                                                           CONCAT11((byte)((ulong)
                                                  uVar7 >> 8) ^ (byte)((ulong)uVar4 >> 8),
                                                  (byte)uVar7 ^ (byte)uVar4)))))));
          param_4[1] = uVar5;
          *param_4 = uVar2;
          param_6 = param_6 + 2;
        }
      }
      else if (param_3 != 0) {
        do {
          uVar4 = param_5[1];
          uVar2 = *param_5;
          uVar6 = param_4[1];
          uVar5 = *param_4;
          param_6[1] = CONCAT17((byte)((ulong)uVar6 >> 0x38) ^ (byte)((ulong)uVar4 >> 0x38),
                                CONCAT16((byte)((ulong)uVar6 >> 0x30) ^ (byte)((ulong)uVar4 >> 0x30)
                                         ,CONCAT15((byte)((ulong)uVar6 >> 0x28) ^
                                                   (byte)((ulong)uVar4 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar6 >> 0x20) ^
                                                            (byte)((ulong)uVar4 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar6 >> 0x18) ^
                                                                     (byte)((ulong)uVar4 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar6 >>
                                                                                    0x10) ^
                                                                              (byte)((ulong)uVar4 >>
                                                                                    0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar6 >> 8) ^ (byte)((ulong)uVar4 >> 8),
                                                  (byte)uVar6 ^ (byte)uVar4)))))));
          *param_6 = CONCAT17((byte)((ulong)uVar5 >> 0x38) ^ (byte)((ulong)uVar2 >> 0x38),
                              CONCAT16((byte)((ulong)uVar5 >> 0x30) ^ (byte)((ulong)uVar2 >> 0x30),
                                       CONCAT15((byte)((ulong)uVar5 >> 0x28) ^
                                                (byte)((ulong)uVar2 >> 0x28),
                                                CONCAT14((byte)((ulong)uVar5 >> 0x20) ^
                                                         (byte)((ulong)uVar2 >> 0x20),
                                                         CONCAT13((byte)((ulong)uVar5 >> 0x18) ^
                                                                  (byte)((ulong)uVar2 >> 0x18),
                                                                  CONCAT12((byte)((ulong)uVar5 >>
                                                                                 0x10) ^
                                                                           (byte)((ulong)uVar2 >>
                                                                                 0x10),
                                                                           CONCAT11((byte)((ulong)
                                                  uVar5 >> 8) ^ (byte)((ulong)uVar2 >> 8),
                                                  (byte)uVar5 ^ (byte)uVar2)))))));
          mbedtls_aria_crypt_ecb(param_1,param_6,param_6);
          uVar2 = *param_6;
          param_3 = param_3 - 0x10;
          param_4[1] = param_6[1];
          *param_4 = uVar2;
          param_5 = param_5 + 2;
          param_6 = param_6 + 2;
        } while (param_3 != 0);
      }
      uVar2 = 0;
    }
    else {
      uVar2 = 0xffffffa2;
    }
  }
  else {
    uVar2 = 0xffffffa4;
  }
  if (*(long *)(lVar1 + 0x28) != lVar3) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

