/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6ea38
 */

undefined8 mbedtls_internal_aes_decrypt(int *param_1,undefined8 *param_2,uint *param_3)

{
  long lVar1;
  long lVar2;
  uint *puVar3;
  int iVar4;
  uint uVar5;
  undefined8 uVar6;
  uint uVar7;
  uint uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  uint uVar11;
  undefined8 uVar12;
  uint local_48;
  uint uStack_44;
  uint local_40;
  uint local_3c;
  uint local_38;
  uint local_34;
  uint local_30;
  uint local_2c;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  lVar2 = *(long *)(param_1 + 2);
  uVar6 = *param_2;
  uVar9 = *(undefined8 *)(param_1 + lVar2 + 4);
  uVar12 = *(undefined8 *)(param_1 + lVar2 + 6);
  uVar5 = CONCAT13((byte)((ulong)uVar9 >> 0x18) ^ (byte)((ulong)uVar6 >> 0x18),
                   CONCAT12((byte)((ulong)uVar9 >> 0x10) ^ (byte)((ulong)uVar6 >> 0x10),
                            CONCAT11((byte)((ulong)uVar9 >> 8) ^ (byte)((ulong)uVar6 >> 8),
                                     (byte)uVar9 ^ (byte)uVar6)));
  uVar10 = param_2[1];
  uVar8 = CONCAT13((byte)((ulong)uVar12 >> 0x18) ^ (byte)((ulong)uVar10 >> 0x18),
                   CONCAT12((byte)((ulong)uVar12 >> 0x10) ^ (byte)((ulong)uVar10 >> 0x10),
                            CONCAT11((byte)((ulong)uVar12 >> 8) ^ (byte)((ulong)uVar10 >> 8),
                                     (byte)uVar12 ^ (byte)uVar10)));
  uVar7 = (uint)(CONCAT17((byte)((ulong)uVar9 >> 0x38) ^ (byte)((ulong)uVar6 >> 0x38),
                          CONCAT16((byte)((ulong)uVar9 >> 0x30) ^ (byte)((ulong)uVar6 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar9 >> 0x28) ^
                                            (byte)((ulong)uVar6 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar9 >> 0x20) ^
                                                     (byte)((ulong)uVar6 >> 0x20),uVar5)))) >> 0x20)
  ;
  uVar11 = (uint)(CONCAT17((byte)((ulong)uVar12 >> 0x38) ^ (byte)((ulong)uVar10 >> 0x38),
                           CONCAT16((byte)((ulong)uVar12 >> 0x30) ^ (byte)((ulong)uVar10 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar12 >> 0x28) ^
                                             (byte)((ulong)uVar10 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar12 >> 0x20) ^
                                                      (byte)((ulong)uVar10 >> 0x20),uVar8)))) >>
                 0x20);
  iVar4 = *param_1 >> 1;
  puVar3 = (uint *)(param_1 + lVar2 + 0xf);
  while( true ) {
    local_38 = (&DAT_00d23a08)[uVar5 & 0xff] ^ puVar3[-7] ^ (&DAT_00d23e08)[uVar11 >> 8 & 0xff] ^
               (&DAT_00d24208)[uVar8 >> 0x10 & 0xff] ^ (&DAT_00d24608)[uVar7 >> 0x18];
    local_34 = (&DAT_00d23a08)[uVar7 & 0xff] ^ puVar3[-6] ^ (&DAT_00d23e08)[uVar5 >> 8 & 0xff] ^
               (&DAT_00d24208)[uVar11 >> 0x10 & 0xff] ^ (&DAT_00d24608)[uVar8 >> 0x18];
    local_30 = (&DAT_00d23a08)[uVar8 & 0xff] ^ puVar3[-5] ^ (&DAT_00d23e08)[uVar7 >> 8 & 0xff] ^
               (&DAT_00d24208)[uVar5 >> 0x10 & 0xff] ^ (&DAT_00d24608)[uVar11 >> 0x18];
    local_2c = (&DAT_00d23a08)[uVar11 & 0xff] ^ puVar3[-4] ^ (&DAT_00d23e08)[uVar8 >> 8 & 0xff] ^
               (&DAT_00d24208)[uVar7 >> 0x10 & 0xff] ^ (&DAT_00d24608)[uVar5 >> 0x18];
    if (iVar4 < 2) break;
    uVar5 = (&DAT_00d23a08)[local_38 & 0xff] ^ puVar3[-3] ^ (&DAT_00d23e08)[local_2c >> 8 & 0xff] ^
            (&DAT_00d24208)[local_30 >> 0x10 & 0xff] ^ (&DAT_00d24608)[local_34 >> 0x18];
    uVar7 = (&DAT_00d23a08)[local_34 & 0xff] ^ puVar3[-2] ^ (&DAT_00d23e08)[local_38 >> 8 & 0xff] ^
            (&DAT_00d24208)[local_2c >> 0x10 & 0xff] ^ (&DAT_00d24608)[local_30 >> 0x18];
    uVar8 = (&DAT_00d23a08)[local_30 & 0xff] ^ puVar3[-1] ^ (&DAT_00d23e08)[local_34 >> 8 & 0xff] ^
            (&DAT_00d24208)[local_38 >> 0x10 & 0xff] ^ (&DAT_00d24608)[local_2c >> 0x18];
    uVar11 = (&DAT_00d23a08)[local_2c & 0xff] ^ *puVar3 ^ (&DAT_00d23e08)[local_30 >> 8 & 0xff] ^
             (&DAT_00d24208)[local_34 >> 0x10 & 0xff] ^ (&DAT_00d24608)[local_38 >> 0x18];
    iVar4 = iVar4 + -1;
    puVar3 = puVar3 + 8;
  }
  uVar5 = puVar3[-3] ^ (uint)(byte)(&DAT_00d25a08)[local_38 & 0xff] ^
          (uint)(byte)(&DAT_00d25a08)[local_2c >> 8 & 0xff] << 8 ^
          (uint)(byte)(&DAT_00d25a08)[local_30 >> 0x10 & 0xff] << 0x10 ^
          (uint)(byte)(&DAT_00d25a08)[local_34 >> 0x18] << 0x18;
  uVar7 = puVar3[-2] ^ (uint)(byte)(&DAT_00d25a08)[local_34 & 0xff] ^
          (uint)(byte)(&DAT_00d25a08)[local_38 >> 8 & 0xff] << 8 ^
          (uint)(byte)(&DAT_00d25a08)[local_2c >> 0x10 & 0xff] << 0x10 ^
          (uint)(byte)(&DAT_00d25a08)[local_30 >> 0x18] << 0x18;
  _local_48 = CONCAT44(uVar7,uVar5);
  uVar8 = puVar3[-1] ^ (uint)(byte)(&DAT_00d25a08)[local_30 & 0xff] ^
          (uint)(byte)(&DAT_00d25a08)[local_34 >> 8 & 0xff] << 8 ^
          (uint)(byte)(&DAT_00d25a08)[local_38 >> 0x10 & 0xff] << 0x10 ^
          (uint)(byte)(&DAT_00d25a08)[local_2c >> 0x18] << 0x18;
  uVar11 = *puVar3 ^ (uint)(byte)(&DAT_00d25a08)[local_2c & 0xff] ^
           (uint)(byte)(&DAT_00d25a08)[local_30 >> 8 & 0xff] << 8 ^
           (uint)(byte)(&DAT_00d25a08)[local_34 >> 0x10 & 0xff] << 0x10 ^
           (uint)(byte)(&DAT_00d25a08)[local_38 >> 0x18] << 0x18;
  _local_40 = CONCAT44(uVar11,uVar8);
  *param_3 = uVar5;
  param_3[1] = uVar7;
  param_3[2] = uVar8;
  param_3[3] = uVar11;
  mbedtls_platform_zeroize(&local_48,0x20);
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}

