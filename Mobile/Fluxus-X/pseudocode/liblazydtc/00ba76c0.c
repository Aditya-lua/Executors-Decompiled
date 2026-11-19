/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba76c0
 */

int FUN_00ba76c0(byte *param_1,ulong param_2,undefined8 param_3,undefined8 param_4,
                undefined4 param_5)

{
  byte *pbVar1;
  ulong uVar2;
  long lVar3;
  int iVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  byte *pbVar8;
  ulong uVar9;
  long *plVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined1 auStack_c8 [28];
  undefined4 local_ac;
  byte local_a8 [8];
  long alStack_a0 [8];
  
  lVar3 = tpidr_el0;
  alStack_a0[7] = *(long *)(lVar3 + 0x28);
  mbedtls_md_init(auStack_c8);
  lVar5 = mbedtls_md_info_from_type(param_5);
  if (lVar5 == 0) {
    iVar4 = -0x4080;
  }
  else {
    mbedtls_md_init(auStack_c8);
    iVar4 = mbedtls_md_setup(auStack_c8,lVar5,0);
    if (iVar4 == 0) {
      uVar6 = mbedtls_md_get_size(lVar5);
      alStack_a0[5] = 0;
      alStack_a0[6] = 0;
      alStack_a0[3] = 0;
      alStack_a0[4] = 0;
      alStack_a0[1] = 0;
      alStack_a0[2] = 0;
      local_a8[0] = 0;
      local_a8[1] = 0;
      local_a8[2] = 0;
      local_a8[3] = 0;
      local_a8[4] = 0;
      local_a8[5] = 0;
      local_a8[6] = 0;
      local_a8[7] = 0;
      alStack_a0[0] = 0;
      local_ac = 0;
      if (param_2 != 0) {
        do {
          uVar2 = param_2;
          if ((uVar6 & 0xff) <= param_2) {
            uVar2 = uVar6 & 0xff;
          }
          iVar4 = mbedtls_md_starts(auStack_c8);
          if (iVar4 != 0) goto LAB_00ba786c;
          iVar4 = mbedtls_md_update(auStack_c8,param_3,param_4);
          if (iVar4 != 0) goto LAB_00ba786c;
          iVar4 = mbedtls_md_update(auStack_c8,&local_ac,4);
          if (iVar4 != 0) goto LAB_00ba786c;
          iVar4 = mbedtls_md_finish(auStack_c8,local_a8);
          if (iVar4 != 0) goto LAB_00ba786c;
          if (uVar2 != 0) {
            uVar7 = 0;
            pbVar8 = param_1;
            if ((uVar2 < 0x20) ||
               ((param_1 < local_a8 + uVar2 && (uVar7 = 0, local_a8 < param_1 + uVar2)))) {
LAB_00ba7834:
              do {
                pbVar1 = local_a8 + uVar7;
                uVar7 = uVar7 + 1;
                *pbVar8 = *pbVar8 ^ *pbVar1;
                pbVar8 = pbVar8 + 1;
              } while (uVar7 < uVar2);
            }
            else {
              uVar7 = uVar2 & 0xe0;
              pbVar8 = param_1 + 0x10;
              uVar9 = uVar7;
              plVar10 = alStack_a0 + 1;
              do {
                lVar11 = plVar10[-1];
                lVar5 = plVar10[-2];
                lVar13 = plVar10[1];
                lVar12 = *plVar10;
                uVar15 = *(undefined8 *)(pbVar8 + -8);
                uVar14 = *(undefined8 *)(pbVar8 + -0x10);
                uVar17 = *(undefined8 *)(pbVar8 + 8);
                uVar16 = *(undefined8 *)pbVar8;
                uVar9 = uVar9 - 0x20;
                plVar10 = plVar10 + 4;
                *(ulong *)(pbVar8 + -8) =
                     CONCAT17((byte)((ulong)uVar15 >> 0x38) ^ (byte)((ulong)lVar11 >> 0x38),
                              CONCAT16((byte)((ulong)uVar15 >> 0x30) ^ (byte)((ulong)lVar11 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar15 >> 0x28) ^
                                                 (byte)((ulong)lVar11 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar15 >> 0x20) ^
                                                          (byte)((ulong)lVar11 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar15 >> 0x18) ^
                                                                   (byte)((ulong)lVar11 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar15 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)lVar11 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar15 >> 8) ^ (byte)((ulong)lVar11 >> 8),
                                                  (byte)uVar15 ^ (byte)lVar11)))))));
                *(ulong *)(pbVar8 + -0x10) =
                     CONCAT17((byte)((ulong)uVar14 >> 0x38) ^ (byte)((ulong)lVar5 >> 0x38),
                              CONCAT16((byte)((ulong)uVar14 >> 0x30) ^ (byte)((ulong)lVar5 >> 0x30),
                                       CONCAT15((byte)((ulong)uVar14 >> 0x28) ^
                                                (byte)((ulong)lVar5 >> 0x28),
                                                CONCAT14((byte)((ulong)uVar14 >> 0x20) ^
                                                         (byte)((ulong)lVar5 >> 0x20),
                                                         CONCAT13((byte)((ulong)uVar14 >> 0x18) ^
                                                                  (byte)((ulong)lVar5 >> 0x18),
                                                                  CONCAT12((byte)((ulong)uVar14 >>
                                                                                 0x10) ^
                                                                           (byte)((ulong)lVar5 >>
                                                                                 0x10),
                                                                           CONCAT11((byte)((ulong)
                                                  uVar14 >> 8) ^ (byte)((ulong)lVar5 >> 8),
                                                  (byte)uVar14 ^ (byte)lVar5)))))));
                *(ulong *)(pbVar8 + 8) =
                     CONCAT17((byte)((ulong)uVar17 >> 0x38) ^ (byte)((ulong)lVar13 >> 0x38),
                              CONCAT16((byte)((ulong)uVar17 >> 0x30) ^ (byte)((ulong)lVar13 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar17 >> 0x28) ^
                                                 (byte)((ulong)lVar13 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar17 >> 0x20) ^
                                                          (byte)((ulong)lVar13 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar17 >> 0x18) ^
                                                                   (byte)((ulong)lVar13 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar17 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)lVar13 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar17 >> 8) ^ (byte)((ulong)lVar13 >> 8),
                                                  (byte)uVar17 ^ (byte)lVar13)))))));
                *(ulong *)pbVar8 =
                     CONCAT17((byte)((ulong)uVar16 >> 0x38) ^ (byte)((ulong)lVar12 >> 0x38),
                              CONCAT16((byte)((ulong)uVar16 >> 0x30) ^ (byte)((ulong)lVar12 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar16 >> 0x28) ^
                                                 (byte)((ulong)lVar12 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar16 >> 0x20) ^
                                                          (byte)((ulong)lVar12 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar16 >> 0x18) ^
                                                                   (byte)((ulong)lVar12 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar16 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)lVar12 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar16 >> 8) ^ (byte)((ulong)lVar12 >> 8),
                                                  (byte)uVar16 ^ (byte)lVar12)))))));
                pbVar8 = pbVar8 + 0x20;
              } while (uVar9 != 0);
              pbVar8 = param_1 + uVar7;
              if (uVar2 != uVar7) goto LAB_00ba7834;
            }
            param_1 = param_1 + uVar2;
          }
          param_2 = param_2 - uVar2;
          local_ac = CONCAT13(local_ac._3_1_ + '\x01',(undefined3)local_ac);
        } while (param_2 != 0);
      }
      iVar4 = 0;
    }
LAB_00ba786c:
    mbedtls_platform_zeroize(local_a8,0x40);
    mbedtls_md_free(auStack_c8);
  }
  if (*(long *)(lVar3 + 0x28) != alStack_a0[7]) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

