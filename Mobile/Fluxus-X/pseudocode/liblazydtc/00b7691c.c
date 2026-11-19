/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7691c
 */

void mbedtls_entropy_self_test(int param_1)

{
  byte bVar1;
  long lVar2;
  undefined8 uVar3;
  int iVar4;
  char *__s;
  long lVar5;
  ulong uVar6;
  byte local_410;
  undefined7 uStack_40f;
  byte bStack_408;
  undefined7 uStack_407;
  byte local_400;
  undefined7 uStack_3ff;
  byte bStack_3f8;
  undefined7 uStack_3f7;
  byte local_3f0;
  undefined7 uStack_3ef;
  byte bStack_3e8;
  undefined7 uStack_3e7;
  byte local_3e0;
  byte bStack_3df;
  byte bStack_3de;
  byte bStack_3dd;
  byte bStack_3dc;
  byte bStack_3db;
  byte bStack_3da;
  byte bStack_3d9;
  undefined8 uStack_3d8;
  byte local_3d0 [72];
  undefined1 auStack_388 [24];
  int local_370;
  int local_36c;
  undefined8 auStack_368 [4];
  undefined4 auStack_348 [192];
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  local_3d0[0x28] = 0;
  local_3d0[0x29] = 0;
  local_3d0[0x2a] = 0;
  local_3d0[0x2b] = 0;
  local_3d0[0x2c] = 0;
  local_3d0[0x2d] = 0;
  local_3d0[0x2e] = 0;
  local_3d0[0x2f] = 0;
  local_3d0[0x20] = 0;
  local_3d0[0x21] = 0;
  local_3d0[0x22] = 0;
  local_3d0[0x23] = 0;
  local_3d0[0x24] = 0;
  local_3d0[0x25] = 0;
  local_3d0[0x26] = 0;
  local_3d0[0x27] = 0;
  local_3d0[0x38] = 0;
  local_3d0[0x39] = 0;
  local_3d0[0x3a] = 0;
  local_3d0[0x3b] = 0;
  local_3d0[0x3c] = 0;
  local_3d0[0x3d] = 0;
  local_3d0[0x3e] = 0;
  local_3d0[0x3f] = 0;
  local_3d0[0x30] = 0;
  local_3d0[0x31] = 0;
  local_3d0[0x32] = 0;
  local_3d0[0x33] = 0;
  local_3d0[0x34] = 0;
  local_3d0[0x35] = 0;
  local_3d0[0x36] = 0;
  local_3d0[0x37] = 0;
  local_3d0[8] = 0;
  local_3d0[9] = 0;
  local_3d0[10] = 0;
  local_3d0[0xb] = 0;
  local_3d0[0xc] = 0;
  local_3d0[0xd] = 0;
  local_3d0[0xe] = 0;
  local_3d0[0xf] = 0;
  local_3d0[0] = 0;
  local_3d0[1] = 0;
  local_3d0[2] = 0;
  local_3d0[3] = 0;
  local_3d0[4] = 0;
  local_3d0[5] = 0;
  local_3d0[6] = 0;
  local_3d0[7] = 0;
  local_3d0[0x18] = 0;
  local_3d0[0x19] = 0;
  local_3d0[0x1a] = 0;
  local_3d0[0x1b] = 0;
  local_3d0[0x1c] = 0;
  local_3d0[0x1d] = 0;
  local_3d0[0x1e] = 0;
  local_3d0[0x1f] = 0;
  local_3d0[0x10] = 0;
  local_3d0[0x11] = 0;
  local_3d0[0x12] = 0;
  local_3d0[0x13] = 0;
  local_3d0[0x14] = 0;
  local_3d0[0x15] = 0;
  local_3d0[0x16] = 0;
  local_3d0[0x17] = 0;
  bStack_3e8 = 0;
  uStack_3e7 = 0;
  local_3f0 = 0;
  uStack_3ef = 0;
  uStack_3d8 = 0;
  local_3e0 = 0;
  bStack_3df = 0;
  bStack_3de = 0;
  bStack_3dd = 0;
  bStack_3dc = 0;
  bStack_3db = 0;
  bStack_3da = 0;
  bStack_3d9 = 0;
  bStack_408 = 0;
  uStack_407 = 0;
  local_410 = 0;
  uStack_40f = 0;
  bStack_3f8 = 0;
  uStack_3f7 = 0;
  local_400 = 0;
  uStack_3ff = 0;
  if (param_1 != 0) {
    printf("  ENTROPY test: ");
  }
  memset(&local_370,0,0x328);
  mbedtls_md_init(auStack_388);
  lVar5 = (long)local_36c;
  if (local_36c < 0x14) {
    local_36c = local_36c + 1;
    auStack_368[lVar5 * 5] = mbedtls_platform_entropy_poll;
    auStack_368[lVar5 * 5 + 1] = 0;
    auStack_368[lVar5 * 5 + 3] = 0x20;
    auStack_348[lVar5 * 10] = 1;
  }
  iVar4 = FUN_00b76400(auStack_388);
  if (iVar4 == 0) {
    lVar5 = (long)local_36c;
    if (local_36c < 0x14) {
      local_36c = local_36c + 1;
      auStack_368[lVar5 * 5] = FUN_00b76e84;
      auStack_368[lVar5 * 5 + 1] = 0;
      auStack_368[lVar5 * 5 + 3] = 0x10;
      auStack_348[lVar5 * 10] = 0;
      iVar4 = FUN_00b762e0(auStack_388,0x14,local_3d0,0x40);
      if ((iVar4 == 0) &&
         (iVar4 = mbedtls_entropy_func(auStack_388,local_3d0,0x40), uVar3 = uStack_3d8, iVar4 == 0))
      {
        local_410 = local_3d0[0];
        uStack_40f = CONCAT16((byte)((uint7)uStack_40f >> 0x30) | local_3d0[7],
                              CONCAT15((byte)((uint7)uStack_40f >> 0x28) | local_3d0[6],
                                       CONCAT14((byte)((uint7)uStack_40f >> 0x20) | local_3d0[5],
                                                CONCAT13((byte)((uint7)uStack_40f >> 0x18) |
                                                         local_3d0[4],
                                                         CONCAT12((byte)((uint7)uStack_40f >> 0x10)
                                                                  | local_3d0[3],
                                                                  CONCAT11((byte)((uint7)uStack_40f
                                                                                 >> 8) |
                                                                           local_3d0[2],
                                                                           (byte)uStack_40f |
                                                                           local_3d0[1]))))));
        bStack_408 = bStack_408 | local_3d0[8];
        uStack_407 = CONCAT16((byte)((uint7)uStack_407 >> 0x30) | local_3d0[0xf],
                              CONCAT15((byte)((uint7)uStack_407 >> 0x28) | local_3d0[0xe],
                                       CONCAT14((byte)((uint7)uStack_407 >> 0x20) | local_3d0[0xd],
                                                CONCAT13((byte)((uint7)uStack_407 >> 0x18) |
                                                         local_3d0[0xc],
                                                         CONCAT12((byte)((uint7)uStack_407 >> 0x10)
                                                                  | local_3d0[0xb],
                                                                  CONCAT11((byte)((uint7)uStack_407
                                                                                 >> 8) |
                                                                           local_3d0[10],
                                                                           (byte)uStack_407 |
                                                                           local_3d0[9]))))));
        local_400 = local_400 | local_3d0[0x10];
        bStack_3df = bStack_3df | local_3d0[0x31];
        bStack_3de = bStack_3de | local_3d0[0x32];
        uStack_3ff = CONCAT16((byte)((uint7)uStack_3ff >> 0x30) | local_3d0[0x17],
                              CONCAT15((byte)((uint7)uStack_3ff >> 0x28) | local_3d0[0x16],
                                       CONCAT14((byte)((uint7)uStack_3ff >> 0x20) | local_3d0[0x15],
                                                CONCAT13((byte)((uint7)uStack_3ff >> 0x18) |
                                                         local_3d0[0x14],
                                                         CONCAT12((byte)((uint7)uStack_3ff >> 0x10)
                                                                  | local_3d0[0x13],
                                                                  CONCAT11((byte)((uint7)uStack_3ff
                                                                                 >> 8) |
                                                                           local_3d0[0x12],
                                                                           (byte)uStack_3ff |
                                                                           local_3d0[0x11]))))));
        bStack_3f8 = bStack_3f8 | local_3d0[0x18];
        uStack_3f7 = CONCAT16((byte)((uint7)uStack_3f7 >> 0x30) | local_3d0[0x1f],
                              CONCAT15((byte)((uint7)uStack_3f7 >> 0x28) | local_3d0[0x1e],
                                       CONCAT14((byte)((uint7)uStack_3f7 >> 0x20) | local_3d0[0x1d],
                                                CONCAT13((byte)((uint7)uStack_3f7 >> 0x18) |
                                                         local_3d0[0x1c],
                                                         CONCAT12((byte)((uint7)uStack_3f7 >> 0x10)
                                                                  | local_3d0[0x1b],
                                                                  CONCAT11((byte)((uint7)uStack_3f7
                                                                                 >> 8) |
                                                                           local_3d0[0x1a],
                                                                           (byte)uStack_3f7 |
                                                                           local_3d0[0x19]))))));
        local_3f0 = local_3f0 | local_3d0[0x20];
        bStack_3dd = bStack_3dd | local_3d0[0x33];
        bStack_3dc = bStack_3dc | local_3d0[0x34];
        uStack_3ef = CONCAT16((byte)((uint7)uStack_3ef >> 0x30) | local_3d0[0x27],
                              CONCAT15((byte)((uint7)uStack_3ef >> 0x28) | local_3d0[0x26],
                                       CONCAT14((byte)((uint7)uStack_3ef >> 0x20) | local_3d0[0x25],
                                                CONCAT13((byte)((uint7)uStack_3ef >> 0x18) |
                                                         local_3d0[0x24],
                                                         CONCAT12((byte)((uint7)uStack_3ef >> 0x10)
                                                                  | local_3d0[0x23],
                                                                  CONCAT11((byte)((uint7)uStack_3ef
                                                                                 >> 8) |
                                                                           local_3d0[0x22],
                                                                           (byte)uStack_3ef |
                                                                           local_3d0[0x21]))))));
        bStack_3e8 = bStack_3e8 | local_3d0[0x28];
        uStack_3e7 = CONCAT16((byte)((uint7)uStack_3e7 >> 0x30) | local_3d0[0x2f],
                              CONCAT15((byte)((uint7)uStack_3e7 >> 0x28) | local_3d0[0x2e],
                                       CONCAT14((byte)((uint7)uStack_3e7 >> 0x20) | local_3d0[0x2d],
                                                CONCAT13((byte)((uint7)uStack_3e7 >> 0x18) |
                                                         local_3d0[0x2c],
                                                         CONCAT12((byte)((uint7)uStack_3e7 >> 0x10)
                                                                  | local_3d0[0x2b],
                                                                  CONCAT11((byte)((uint7)uStack_3e7
                                                                                 >> 8) |
                                                                           local_3d0[0x2a],
                                                                           (byte)uStack_3e7 |
                                                                           local_3d0[0x29]))))));
        local_3e0 = local_3e0 | local_3d0[0x30];
        bStack_3db = bStack_3db | local_3d0[0x35];
        bStack_3da = bStack_3da | local_3d0[0x36];
        bStack_3d9 = bStack_3d9 | local_3d0[0x37];
        bVar1 = (byte)uStack_3d8 | local_3d0[0x38];
        uStack_3d8._1_1_ = uStack_3d8._1_1_ | local_3d0[0x39];
        uStack_3d8._0_2_ = CONCAT11(uStack_3d8._1_1_,bVar1);
        uStack_3d8._2_1_ = SUB81(uVar3,2);
        uStack_3d8._2_1_ = uStack_3d8._2_1_ | local_3d0[0x3a];
        uStack_3d8._3_1_ = SUB81(uVar3,3);
        uStack_3d8._3_1_ = uStack_3d8._3_1_ | local_3d0[0x3b];
        uStack_3d8._4_1_ = SUB81(uVar3,4);
        uStack_3d8._4_1_ = uStack_3d8._4_1_ | local_3d0[0x3c];
        uStack_3d8._5_1_ = SUB81(uVar3,5);
        uStack_3d8._5_1_ = uStack_3d8._5_1_ | local_3d0[0x3d];
        uStack_3d8._6_1_ = SUB81(uVar3,6);
        uStack_3d8._6_1_ = uStack_3d8._6_1_ | local_3d0[0x3e];
        uStack_3d8._7_1_ = SUB81(uVar3,7);
        uStack_3d8 = CONCAT17(uStack_3d8._7_1_ | local_3d0[0x3f],
                              CONCAT16(uStack_3d8._6_1_,(undefined6)uStack_3d8));
        iVar4 = mbedtls_entropy_func(auStack_388,local_3d0,0x40);
        if (iVar4 == 0) {
          local_410 = local_410 | local_3d0[0];
          bStack_408 = bStack_408 | local_3d0[8];
          uStack_407 = (undefined7)
                       (CONCAT17((byte)((uint7)uStack_407 >> 0x30) | local_3d0[0xf],
                                 CONCAT16((byte)((uint7)uStack_407 >> 0x28) | local_3d0[0xe],
                                          CONCAT15((byte)((uint7)uStack_407 >> 0x20) |
                                                   local_3d0[0xd],
                                                   CONCAT14((byte)((uint7)uStack_407 >> 0x18) |
                                                            local_3d0[0xc],
                                                            CONCAT13((byte)((uint7)uStack_407 >>
                                                                           0x10) | local_3d0[0xb],
                                                                     CONCAT12((byte)((uint7)
                                                  uStack_407 >> 8) | local_3d0[10],
                                                  CONCAT11((byte)uStack_407 | local_3d0[9],
                                                           bStack_408))))))) >> 8);
          uStack_40f = (undefined7)
                       (CONCAT17((byte)((uint7)uStack_40f >> 0x30) | local_3d0[7],
                                 CONCAT16((byte)((uint7)uStack_40f >> 0x28) | local_3d0[6],
                                          CONCAT15((byte)((uint7)uStack_40f >> 0x20) | local_3d0[5],
                                                   CONCAT14((byte)((uint7)uStack_40f >> 0x18) |
                                                            local_3d0[4],
                                                            CONCAT13((byte)((uint7)uStack_40f >>
                                                                           0x10) | local_3d0[3],
                                                                     CONCAT12((byte)((uint7)
                                                  uStack_40f >> 8) | local_3d0[2],
                                                  CONCAT11((byte)uStack_40f | local_3d0[1],local_410
                                                          ))))))) >> 8);
          local_400 = local_400 | local_3d0[0x10];
          bStack_3f8 = bStack_3f8 | local_3d0[0x18];
          uStack_3f7 = (undefined7)
                       (CONCAT17((byte)((uint7)uStack_3f7 >> 0x30) | local_3d0[0x1f],
                                 CONCAT16((byte)((uint7)uStack_3f7 >> 0x28) | local_3d0[0x1e],
                                          CONCAT15((byte)((uint7)uStack_3f7 >> 0x20) |
                                                   local_3d0[0x1d],
                                                   CONCAT14((byte)((uint7)uStack_3f7 >> 0x18) |
                                                            local_3d0[0x1c],
                                                            CONCAT13((byte)((uint7)uStack_3f7 >>
                                                                           0x10) | local_3d0[0x1b],
                                                                     CONCAT12((byte)((uint7)
                                                  uStack_3f7 >> 8) | local_3d0[0x1a],
                                                  CONCAT11((byte)uStack_3f7 | local_3d0[0x19],
                                                           bStack_3f8))))))) >> 8);
          uStack_3ff = (undefined7)
                       (CONCAT17((byte)((uint7)uStack_3ff >> 0x30) | local_3d0[0x17],
                                 CONCAT16((byte)((uint7)uStack_3ff >> 0x28) | local_3d0[0x16],
                                          CONCAT15((byte)((uint7)uStack_3ff >> 0x20) |
                                                   local_3d0[0x15],
                                                   CONCAT14((byte)((uint7)uStack_3ff >> 0x18) |
                                                            local_3d0[0x14],
                                                            CONCAT13((byte)((uint7)uStack_3ff >>
                                                                           0x10) | local_3d0[0x13],
                                                                     CONCAT12((byte)((uint7)
                                                  uStack_3ff >> 8) | local_3d0[0x12],
                                                  CONCAT11((byte)uStack_3ff | local_3d0[0x11],
                                                           local_400))))))) >> 8);
          local_3f0 = local_3f0 | local_3d0[0x20];
          bStack_3e8 = bStack_3e8 | local_3d0[0x28];
          uStack_3e7 = (undefined7)
                       (CONCAT17((byte)((uint7)uStack_3e7 >> 0x30) | local_3d0[0x2f],
                                 CONCAT16((byte)((uint7)uStack_3e7 >> 0x28) | local_3d0[0x2e],
                                          CONCAT15((byte)((uint7)uStack_3e7 >> 0x20) |
                                                   local_3d0[0x2d],
                                                   CONCAT14((byte)((uint7)uStack_3e7 >> 0x18) |
                                                            local_3d0[0x2c],
                                                            CONCAT13((byte)((uint7)uStack_3e7 >>
                                                                           0x10) | local_3d0[0x2b],
                                                                     CONCAT12((byte)((uint7)
                                                  uStack_3e7 >> 8) | local_3d0[0x2a],
                                                  CONCAT11((byte)uStack_3e7 | local_3d0[0x29],
                                                           bStack_3e8))))))) >> 8);
          uStack_3ef = (undefined7)
                       (CONCAT17((byte)((uint7)uStack_3ef >> 0x30) | local_3d0[0x27],
                                 CONCAT16((byte)((uint7)uStack_3ef >> 0x28) | local_3d0[0x26],
                                          CONCAT15((byte)((uint7)uStack_3ef >> 0x20) |
                                                   local_3d0[0x25],
                                                   CONCAT14((byte)((uint7)uStack_3ef >> 0x18) |
                                                            local_3d0[0x24],
                                                            CONCAT13((byte)((uint7)uStack_3ef >>
                                                                           0x10) | local_3d0[0x23],
                                                                     CONCAT12((byte)((uint7)
                                                  uStack_3ef >> 8) | local_3d0[0x22],
                                                  CONCAT11((byte)uStack_3ef | local_3d0[0x21],
                                                           local_3f0))))))) >> 8);
          local_3e0 = local_3e0 | local_3d0[0x30];
          bStack_3df = bStack_3df | local_3d0[0x31];
          bStack_3de = bStack_3de | local_3d0[0x32];
          bStack_3dd = bStack_3dd | local_3d0[0x33];
          bStack_3dc = bStack_3dc | local_3d0[0x34];
          bStack_3db = bStack_3db | local_3d0[0x35];
          bStack_3da = bStack_3da | local_3d0[0x36];
          bStack_3d9 = bStack_3d9 | local_3d0[0x37];
          uStack_3d8 = CONCAT17((byte)((ulong)uStack_3d8 >> 0x38) | local_3d0[0x3f],
                                CONCAT16((byte)((ulong)uStack_3d8 >> 0x30) | local_3d0[0x3e],
                                         CONCAT15((byte)((ulong)uStack_3d8 >> 0x28) |
                                                  local_3d0[0x3d],
                                                  CONCAT14((byte)((ulong)uStack_3d8 >> 0x20) |
                                                           local_3d0[0x3c],
                                                           CONCAT13((byte)((ulong)uStack_3d8 >> 0x18
                                                                          ) | local_3d0[0x3b],
                                                                    CONCAT12((byte)((ulong)
                                                  uStack_3d8 >> 0x10) | local_3d0[0x3a],
                                                  CONCAT11((byte)((ulong)uStack_3d8 >> 8) |
                                                           local_3d0[0x39],
                                                           (byte)uStack_3d8 | local_3d0[0x38])))))))
          ;
          iVar4 = mbedtls_entropy_func(auStack_388,local_3d0,0x40);
          if (iVar4 == 0) {
            local_410 = local_410 | local_3d0[0];
            bStack_408 = bStack_408 | local_3d0[8];
            uStack_407 = (undefined7)
                         (CONCAT17((byte)((uint7)uStack_407 >> 0x30) | local_3d0[0xf],
                                   CONCAT16((byte)((uint7)uStack_407 >> 0x28) | local_3d0[0xe],
                                            CONCAT15((byte)((uint7)uStack_407 >> 0x20) |
                                                     local_3d0[0xd],
                                                     CONCAT14((byte)((uint7)uStack_407 >> 0x18) |
                                                              local_3d0[0xc],
                                                              CONCAT13((byte)((uint7)uStack_407 >>
                                                                             0x10) | local_3d0[0xb],
                                                                       CONCAT12((byte)((uint7)
                                                  uStack_407 >> 8) | local_3d0[10],
                                                  CONCAT11((byte)uStack_407 | local_3d0[9],
                                                           bStack_408))))))) >> 8);
            uStack_40f = (undefined7)
                         (CONCAT17((byte)((uint7)uStack_40f >> 0x30) | local_3d0[7],
                                   CONCAT16((byte)((uint7)uStack_40f >> 0x28) | local_3d0[6],
                                            CONCAT15((byte)((uint7)uStack_40f >> 0x20) |
                                                     local_3d0[5],
                                                     CONCAT14((byte)((uint7)uStack_40f >> 0x18) |
                                                              local_3d0[4],
                                                              CONCAT13((byte)((uint7)uStack_40f >>
                                                                             0x10) | local_3d0[3],
                                                                       CONCAT12((byte)((uint7)
                                                  uStack_40f >> 8) | local_3d0[2],
                                                  CONCAT11((byte)uStack_40f | local_3d0[1],local_410
                                                          ))))))) >> 8);
            local_400 = local_400 | local_3d0[0x10];
            bStack_3f8 = bStack_3f8 | local_3d0[0x18];
            uStack_3f7 = (undefined7)
                         (CONCAT17((byte)((uint7)uStack_3f7 >> 0x30) | local_3d0[0x1f],
                                   CONCAT16((byte)((uint7)uStack_3f7 >> 0x28) | local_3d0[0x1e],
                                            CONCAT15((byte)((uint7)uStack_3f7 >> 0x20) |
                                                     local_3d0[0x1d],
                                                     CONCAT14((byte)((uint7)uStack_3f7 >> 0x18) |
                                                              local_3d0[0x1c],
                                                              CONCAT13((byte)((uint7)uStack_3f7 >>
                                                                             0x10) | local_3d0[0x1b]
                                                                       ,CONCAT12((byte)((uint7)
                                                  uStack_3f7 >> 8) | local_3d0[0x1a],
                                                  CONCAT11((byte)uStack_3f7 | local_3d0[0x19],
                                                           bStack_3f8))))))) >> 8);
            uStack_3ff = (undefined7)
                         (CONCAT17((byte)((uint7)uStack_3ff >> 0x30) | local_3d0[0x17],
                                   CONCAT16((byte)((uint7)uStack_3ff >> 0x28) | local_3d0[0x16],
                                            CONCAT15((byte)((uint7)uStack_3ff >> 0x20) |
                                                     local_3d0[0x15],
                                                     CONCAT14((byte)((uint7)uStack_3ff >> 0x18) |
                                                              local_3d0[0x14],
                                                              CONCAT13((byte)((uint7)uStack_3ff >>
                                                                             0x10) | local_3d0[0x13]
                                                                       ,CONCAT12((byte)((uint7)
                                                  uStack_3ff >> 8) | local_3d0[0x12],
                                                  CONCAT11((byte)uStack_3ff | local_3d0[0x11],
                                                           local_400))))))) >> 8);
            local_3f0 = local_3f0 | local_3d0[0x20];
            bStack_3e8 = bStack_3e8 | local_3d0[0x28];
            uStack_3e7 = (undefined7)
                         (CONCAT17((byte)((uint7)uStack_3e7 >> 0x30) | local_3d0[0x2f],
                                   CONCAT16((byte)((uint7)uStack_3e7 >> 0x28) | local_3d0[0x2e],
                                            CONCAT15((byte)((uint7)uStack_3e7 >> 0x20) |
                                                     local_3d0[0x2d],
                                                     CONCAT14((byte)((uint7)uStack_3e7 >> 0x18) |
                                                              local_3d0[0x2c],
                                                              CONCAT13((byte)((uint7)uStack_3e7 >>
                                                                             0x10) | local_3d0[0x2b]
                                                                       ,CONCAT12((byte)((uint7)
                                                  uStack_3e7 >> 8) | local_3d0[0x2a],
                                                  CONCAT11((byte)uStack_3e7 | local_3d0[0x29],
                                                           bStack_3e8))))))) >> 8);
            uStack_3ef = (undefined7)
                         (CONCAT17((byte)((uint7)uStack_3ef >> 0x30) | local_3d0[0x27],
                                   CONCAT16((byte)((uint7)uStack_3ef >> 0x28) | local_3d0[0x26],
                                            CONCAT15((byte)((uint7)uStack_3ef >> 0x20) |
                                                     local_3d0[0x25],
                                                     CONCAT14((byte)((uint7)uStack_3ef >> 0x18) |
                                                              local_3d0[0x24],
                                                              CONCAT13((byte)((uint7)uStack_3ef >>
                                                                             0x10) | local_3d0[0x23]
                                                                       ,CONCAT12((byte)((uint7)
                                                  uStack_3ef >> 8) | local_3d0[0x22],
                                                  CONCAT11((byte)uStack_3ef | local_3d0[0x21],
                                                           local_3f0))))))) >> 8);
            local_3e0 = local_3e0 | local_3d0[0x30];
            bStack_3df = bStack_3df | local_3d0[0x31];
            bStack_3de = bStack_3de | local_3d0[0x32];
            bStack_3dd = bStack_3dd | local_3d0[0x33];
            bStack_3dc = bStack_3dc | local_3d0[0x34];
            bStack_3db = bStack_3db | local_3d0[0x35];
            bStack_3da = bStack_3da | local_3d0[0x36];
            bStack_3d9 = bStack_3d9 | local_3d0[0x37];
            uStack_3d8 = CONCAT17((byte)((ulong)uStack_3d8 >> 0x38) | local_3d0[0x3f],
                                  CONCAT16((byte)((ulong)uStack_3d8 >> 0x30) | local_3d0[0x3e],
                                           CONCAT15((byte)((ulong)uStack_3d8 >> 0x28) |
                                                    local_3d0[0x3d],
                                                    CONCAT14((byte)((ulong)uStack_3d8 >> 0x20) |
                                                             local_3d0[0x3c],
                                                             CONCAT13((byte)((ulong)uStack_3d8 >>
                                                                            0x18) | local_3d0[0x3b],
                                                                      CONCAT12((byte)((ulong)
                                                  uStack_3d8 >> 0x10) | local_3d0[0x3a],
                                                  CONCAT11((byte)((ulong)uStack_3d8 >> 8) |
                                                           local_3d0[0x39],
                                                           (byte)uStack_3d8 | local_3d0[0x38])))))))
            ;
            iVar4 = mbedtls_entropy_func(auStack_388,local_3d0,0x40);
            if (iVar4 == 0) {
              local_410 = local_410 | local_3d0[0];
              bStack_408 = bStack_408 | local_3d0[8];
              uStack_407 = (undefined7)
                           (CONCAT17((byte)((uint7)uStack_407 >> 0x30) | local_3d0[0xf],
                                     CONCAT16((byte)((uint7)uStack_407 >> 0x28) | local_3d0[0xe],
                                              CONCAT15((byte)((uint7)uStack_407 >> 0x20) |
                                                       local_3d0[0xd],
                                                       CONCAT14((byte)((uint7)uStack_407 >> 0x18) |
                                                                local_3d0[0xc],
                                                                CONCAT13((byte)((uint7)uStack_407 >>
                                                                               0x10) |
                                                                         local_3d0[0xb],
                                                                         CONCAT12((byte)((uint7)
                                                  uStack_407 >> 8) | local_3d0[10],
                                                  CONCAT11((byte)uStack_407 | local_3d0[9],
                                                           bStack_408))))))) >> 8);
              uStack_40f = (undefined7)
                           (CONCAT17((byte)((uint7)uStack_40f >> 0x30) | local_3d0[7],
                                     CONCAT16((byte)((uint7)uStack_40f >> 0x28) | local_3d0[6],
                                              CONCAT15((byte)((uint7)uStack_40f >> 0x20) |
                                                       local_3d0[5],
                                                       CONCAT14((byte)((uint7)uStack_40f >> 0x18) |
                                                                local_3d0[4],
                                                                CONCAT13((byte)((uint7)uStack_40f >>
                                                                               0x10) | local_3d0[3],
                                                                         CONCAT12((byte)((uint7)
                                                  uStack_40f >> 8) | local_3d0[2],
                                                  CONCAT11((byte)uStack_40f | local_3d0[1],local_410
                                                          ))))))) >> 8);
              local_400 = local_400 | local_3d0[0x10];
              bStack_3f8 = bStack_3f8 | local_3d0[0x18];
              uStack_3f7 = (undefined7)
                           (CONCAT17((byte)((uint7)uStack_3f7 >> 0x30) | local_3d0[0x1f],
                                     CONCAT16((byte)((uint7)uStack_3f7 >> 0x28) | local_3d0[0x1e],
                                              CONCAT15((byte)((uint7)uStack_3f7 >> 0x20) |
                                                       local_3d0[0x1d],
                                                       CONCAT14((byte)((uint7)uStack_3f7 >> 0x18) |
                                                                local_3d0[0x1c],
                                                                CONCAT13((byte)((uint7)uStack_3f7 >>
                                                                               0x10) |
                                                                         local_3d0[0x1b],
                                                                         CONCAT12((byte)((uint7)
                                                  uStack_3f7 >> 8) | local_3d0[0x1a],
                                                  CONCAT11((byte)uStack_3f7 | local_3d0[0x19],
                                                           bStack_3f8))))))) >> 8);
              uStack_3ff = (undefined7)
                           (CONCAT17((byte)((uint7)uStack_3ff >> 0x30) | local_3d0[0x17],
                                     CONCAT16((byte)((uint7)uStack_3ff >> 0x28) | local_3d0[0x16],
                                              CONCAT15((byte)((uint7)uStack_3ff >> 0x20) |
                                                       local_3d0[0x15],
                                                       CONCAT14((byte)((uint7)uStack_3ff >> 0x18) |
                                                                local_3d0[0x14],
                                                                CONCAT13((byte)((uint7)uStack_3ff >>
                                                                               0x10) |
                                                                         local_3d0[0x13],
                                                                         CONCAT12((byte)((uint7)
                                                  uStack_3ff >> 8) | local_3d0[0x12],
                                                  CONCAT11((byte)uStack_3ff | local_3d0[0x11],
                                                           local_400))))))) >> 8);
              local_3f0 = local_3f0 | local_3d0[0x20];
              bStack_3e8 = bStack_3e8 | local_3d0[0x28];
              uStack_3e7 = (undefined7)
                           (CONCAT17((byte)((uint7)uStack_3e7 >> 0x30) | local_3d0[0x2f],
                                     CONCAT16((byte)((uint7)uStack_3e7 >> 0x28) | local_3d0[0x2e],
                                              CONCAT15((byte)((uint7)uStack_3e7 >> 0x20) |
                                                       local_3d0[0x2d],
                                                       CONCAT14((byte)((uint7)uStack_3e7 >> 0x18) |
                                                                local_3d0[0x2c],
                                                                CONCAT13((byte)((uint7)uStack_3e7 >>
                                                                               0x10) |
                                                                         local_3d0[0x2b],
                                                                         CONCAT12((byte)((uint7)
                                                  uStack_3e7 >> 8) | local_3d0[0x2a],
                                                  CONCAT11((byte)uStack_3e7 | local_3d0[0x29],
                                                           bStack_3e8))))))) >> 8);
              uStack_3ef = (undefined7)
                           (CONCAT17((byte)((uint7)uStack_3ef >> 0x30) | local_3d0[0x27],
                                     CONCAT16((byte)((uint7)uStack_3ef >> 0x28) | local_3d0[0x26],
                                              CONCAT15((byte)((uint7)uStack_3ef >> 0x20) |
                                                       local_3d0[0x25],
                                                       CONCAT14((byte)((uint7)uStack_3ef >> 0x18) |
                                                                local_3d0[0x24],
                                                                CONCAT13((byte)((uint7)uStack_3ef >>
                                                                               0x10) |
                                                                         local_3d0[0x23],
                                                                         CONCAT12((byte)((uint7)
                                                  uStack_3ef >> 8) | local_3d0[0x22],
                                                  CONCAT11((byte)uStack_3ef | local_3d0[0x21],
                                                           local_3f0))))))) >> 8);
              local_3e0 = local_3e0 | local_3d0[0x30];
              bStack_3df = bStack_3df | local_3d0[0x31];
              bStack_3de = bStack_3de | local_3d0[0x32];
              bStack_3dd = bStack_3dd | local_3d0[0x33];
              bStack_3dc = bStack_3dc | local_3d0[0x34];
              bStack_3db = bStack_3db | local_3d0[0x35];
              bStack_3da = bStack_3da | local_3d0[0x36];
              bStack_3d9 = bStack_3d9 | local_3d0[0x37];
              uStack_3d8 = CONCAT17((byte)((ulong)uStack_3d8 >> 0x38) | local_3d0[0x3f],
                                    CONCAT16((byte)((ulong)uStack_3d8 >> 0x30) | local_3d0[0x3e],
                                             CONCAT15((byte)((ulong)uStack_3d8 >> 0x28) |
                                                      local_3d0[0x3d],
                                                      CONCAT14((byte)((ulong)uStack_3d8 >> 0x20) |
                                                               local_3d0[0x3c],
                                                               CONCAT13((byte)((ulong)uStack_3d8 >>
                                                                              0x18) |
                                                                        local_3d0[0x3b],
                                                                        CONCAT12((byte)((ulong)
                                                  uStack_3d8 >> 0x10) | local_3d0[0x3a],
                                                  CONCAT11((byte)((ulong)uStack_3d8 >> 8) |
                                                           local_3d0[0x39],
                                                           (byte)uStack_3d8 | local_3d0[0x38])))))))
              ;
              iVar4 = mbedtls_entropy_func(auStack_388,local_3d0,0x40);
              if (iVar4 == 0) {
                local_410 = local_410 | local_3d0[0];
                bStack_408 = bStack_408 | local_3d0[8];
                uStack_407 = (undefined7)
                             (CONCAT17((byte)((uint7)uStack_407 >> 0x30) | local_3d0[0xf],
                                       CONCAT16((byte)((uint7)uStack_407 >> 0x28) | local_3d0[0xe],
                                                CONCAT15((byte)((uint7)uStack_407 >> 0x20) |
                                                         local_3d0[0xd],
                                                         CONCAT14((byte)((uint7)uStack_407 >> 0x18)
                                                                  | local_3d0[0xc],
                                                                  CONCAT13((byte)((uint7)uStack_407
                                                                                 >> 0x10) |
                                                                           local_3d0[0xb],
                                                                           CONCAT12((byte)((uint7)
                                                  uStack_407 >> 8) | local_3d0[10],
                                                  CONCAT11((byte)uStack_407 | local_3d0[9],
                                                           bStack_408))))))) >> 8);
                uStack_40f = (undefined7)
                             (CONCAT17((byte)((uint7)uStack_40f >> 0x30) | local_3d0[7],
                                       CONCAT16((byte)((uint7)uStack_40f >> 0x28) | local_3d0[6],
                                                CONCAT15((byte)((uint7)uStack_40f >> 0x20) |
                                                         local_3d0[5],
                                                         CONCAT14((byte)((uint7)uStack_40f >> 0x18)
                                                                  | local_3d0[4],
                                                                  CONCAT13((byte)((uint7)uStack_40f
                                                                                 >> 0x10) |
                                                                           local_3d0[3],
                                                                           CONCAT12((byte)((uint7)
                                                  uStack_40f >> 8) | local_3d0[2],
                                                  CONCAT11((byte)uStack_40f | local_3d0[1],local_410
                                                          ))))))) >> 8);
                local_400 = local_400 | local_3d0[0x10];
                bStack_3f8 = bStack_3f8 | local_3d0[0x18];
                uStack_3f7 = (undefined7)
                             (CONCAT17((byte)((uint7)uStack_3f7 >> 0x30) | local_3d0[0x1f],
                                       CONCAT16((byte)((uint7)uStack_3f7 >> 0x28) | local_3d0[0x1e],
                                                CONCAT15((byte)((uint7)uStack_3f7 >> 0x20) |
                                                         local_3d0[0x1d],
                                                         CONCAT14((byte)((uint7)uStack_3f7 >> 0x18)
                                                                  | local_3d0[0x1c],
                                                                  CONCAT13((byte)((uint7)uStack_3f7
                                                                                 >> 0x10) |
                                                                           local_3d0[0x1b],
                                                                           CONCAT12((byte)((uint7)
                                                  uStack_3f7 >> 8) | local_3d0[0x1a],
                                                  CONCAT11((byte)uStack_3f7 | local_3d0[0x19],
                                                           bStack_3f8))))))) >> 8);
                uStack_3ff = (undefined7)
                             (CONCAT17((byte)((uint7)uStack_3ff >> 0x30) | local_3d0[0x17],
                                       CONCAT16((byte)((uint7)uStack_3ff >> 0x28) | local_3d0[0x16],
                                                CONCAT15((byte)((uint7)uStack_3ff >> 0x20) |
                                                         local_3d0[0x15],
                                                         CONCAT14((byte)((uint7)uStack_3ff >> 0x18)
                                                                  | local_3d0[0x14],
                                                                  CONCAT13((byte)((uint7)uStack_3ff
                                                                                 >> 0x10) |
                                                                           local_3d0[0x13],
                                                                           CONCAT12((byte)((uint7)
                                                  uStack_3ff >> 8) | local_3d0[0x12],
                                                  CONCAT11((byte)uStack_3ff | local_3d0[0x11],
                                                           local_400))))))) >> 8);
                local_3f0 = local_3f0 | local_3d0[0x20];
                bStack_3e8 = bStack_3e8 | local_3d0[0x28];
                uStack_3e7 = (undefined7)
                             (CONCAT17((byte)((uint7)uStack_3e7 >> 0x30) | local_3d0[0x2f],
                                       CONCAT16((byte)((uint7)uStack_3e7 >> 0x28) | local_3d0[0x2e],
                                                CONCAT15((byte)((uint7)uStack_3e7 >> 0x20) |
                                                         local_3d0[0x2d],
                                                         CONCAT14((byte)((uint7)uStack_3e7 >> 0x18)
                                                                  | local_3d0[0x2c],
                                                                  CONCAT13((byte)((uint7)uStack_3e7
                                                                                 >> 0x10) |
                                                                           local_3d0[0x2b],
                                                                           CONCAT12((byte)((uint7)
                                                  uStack_3e7 >> 8) | local_3d0[0x2a],
                                                  CONCAT11((byte)uStack_3e7 | local_3d0[0x29],
                                                           bStack_3e8))))))) >> 8);
                uStack_3ef = (undefined7)
                             (CONCAT17((byte)((uint7)uStack_3ef >> 0x30) | local_3d0[0x27],
                                       CONCAT16((byte)((uint7)uStack_3ef >> 0x28) | local_3d0[0x26],
                                                CONCAT15((byte)((uint7)uStack_3ef >> 0x20) |
                                                         local_3d0[0x25],
                                                         CONCAT14((byte)((uint7)uStack_3ef >> 0x18)
                                                                  | local_3d0[0x24],
                                                                  CONCAT13((byte)((uint7)uStack_3ef
                                                                                 >> 0x10) |
                                                                           local_3d0[0x23],
                                                                           CONCAT12((byte)((uint7)
                                                  uStack_3ef >> 8) | local_3d0[0x22],
                                                  CONCAT11((byte)uStack_3ef | local_3d0[0x21],
                                                           local_3f0))))))) >> 8);
                local_3e0 = local_3e0 | local_3d0[0x30];
                bStack_3df = bStack_3df | local_3d0[0x31];
                bStack_3de = bStack_3de | local_3d0[0x32];
                bStack_3dd = bStack_3dd | local_3d0[0x33];
                bStack_3dc = bStack_3dc | local_3d0[0x34];
                bStack_3db = bStack_3db | local_3d0[0x35];
                bStack_3da = bStack_3da | local_3d0[0x36];
                bStack_3d9 = bStack_3d9 | local_3d0[0x37];
                uStack_3d8 = CONCAT17((byte)((ulong)uStack_3d8 >> 0x38) | local_3d0[0x3f],
                                      CONCAT16((byte)((ulong)uStack_3d8 >> 0x30) | local_3d0[0x3e],
                                               CONCAT15((byte)((ulong)uStack_3d8 >> 0x28) |
                                                        local_3d0[0x3d],
                                                        CONCAT14((byte)((ulong)uStack_3d8 >> 0x20) |
                                                                 local_3d0[0x3c],
                                                                 CONCAT13((byte)((ulong)uStack_3d8
                                                                                >> 0x18) |
                                                                          local_3d0[0x3b],
                                                                          CONCAT12((byte)((ulong)
                                                  uStack_3d8 >> 0x10) | local_3d0[0x3a],
                                                  CONCAT11((byte)((ulong)uStack_3d8 >> 8) |
                                                           local_3d0[0x39],
                                                           (byte)uStack_3d8 | local_3d0[0x38])))))))
                ;
                iVar4 = mbedtls_entropy_func(auStack_388,local_3d0,0x40);
                if (iVar4 == 0) {
                  local_410 = local_410 | local_3d0[0];
                  bStack_408 = bStack_408 | local_3d0[8];
                  uStack_407 = (undefined7)
                               (CONCAT17((byte)((uint7)uStack_407 >> 0x30) | local_3d0[0xf],
                                         CONCAT16((byte)((uint7)uStack_407 >> 0x28) | local_3d0[0xe]
                                                  ,CONCAT15((byte)((uint7)uStack_407 >> 0x20) |
                                                            local_3d0[0xd],
                                                            CONCAT14((byte)((uint7)uStack_407 >>
                                                                           0x18) | local_3d0[0xc],
                                                                     CONCAT13((byte)((uint7)
                                                  uStack_407 >> 0x10) | local_3d0[0xb],
                                                  CONCAT12((byte)((uint7)uStack_407 >> 8) |
                                                           local_3d0[10],
                                                           CONCAT11((byte)uStack_407 | local_3d0[9],
                                                                    bStack_408))))))) >> 8);
                  uStack_40f = (undefined7)
                               (CONCAT17((byte)((uint7)uStack_40f >> 0x30) | local_3d0[7],
                                         CONCAT16((byte)((uint7)uStack_40f >> 0x28) | local_3d0[6],
                                                  CONCAT15((byte)((uint7)uStack_40f >> 0x20) |
                                                           local_3d0[5],
                                                           CONCAT14((byte)((uint7)uStack_40f >> 0x18
                                                                          ) | local_3d0[4],
                                                                    CONCAT13((byte)((uint7)
                                                  uStack_40f >> 0x10) | local_3d0[3],
                                                  CONCAT12((byte)((uint7)uStack_40f >> 8) |
                                                           local_3d0[2],
                                                           CONCAT11((byte)uStack_40f | local_3d0[1],
                                                                    local_410))))))) >> 8);
                  local_400 = local_400 | local_3d0[0x10];
                  bStack_3f8 = bStack_3f8 | local_3d0[0x18];
                  uStack_3f7 = (undefined7)
                               (CONCAT17((byte)((uint7)uStack_3f7 >> 0x30) | local_3d0[0x1f],
                                         CONCAT16((byte)((uint7)uStack_3f7 >> 0x28) |
                                                  local_3d0[0x1e],
                                                  CONCAT15((byte)((uint7)uStack_3f7 >> 0x20) |
                                                           local_3d0[0x1d],
                                                           CONCAT14((byte)((uint7)uStack_3f7 >> 0x18
                                                                          ) | local_3d0[0x1c],
                                                                    CONCAT13((byte)((uint7)
                                                  uStack_3f7 >> 0x10) | local_3d0[0x1b],
                                                  CONCAT12((byte)((uint7)uStack_3f7 >> 8) |
                                                           local_3d0[0x1a],
                                                           CONCAT11((byte)uStack_3f7 |
                                                                    local_3d0[0x19],bStack_3f8))))))
                                        ) >> 8);
                  uStack_3ff = (undefined7)
                               (CONCAT17((byte)((uint7)uStack_3ff >> 0x30) | local_3d0[0x17],
                                         CONCAT16((byte)((uint7)uStack_3ff >> 0x28) |
                                                  local_3d0[0x16],
                                                  CONCAT15((byte)((uint7)uStack_3ff >> 0x20) |
                                                           local_3d0[0x15],
                                                           CONCAT14((byte)((uint7)uStack_3ff >> 0x18
                                                                          ) | local_3d0[0x14],
                                                                    CONCAT13((byte)((uint7)
                                                  uStack_3ff >> 0x10) | local_3d0[0x13],
                                                  CONCAT12((byte)((uint7)uStack_3ff >> 8) |
                                                           local_3d0[0x12],
                                                           CONCAT11((byte)uStack_3ff |
                                                                    local_3d0[0x11],local_400)))))))
                               >> 8);
                  local_3f0 = local_3f0 | local_3d0[0x20];
                  bStack_3e8 = bStack_3e8 | local_3d0[0x28];
                  uStack_3e7 = (undefined7)
                               (CONCAT17((byte)((uint7)uStack_3e7 >> 0x30) | local_3d0[0x2f],
                                         CONCAT16((byte)((uint7)uStack_3e7 >> 0x28) |
                                                  local_3d0[0x2e],
                                                  CONCAT15((byte)((uint7)uStack_3e7 >> 0x20) |
                                                           local_3d0[0x2d],
                                                           CONCAT14((byte)((uint7)uStack_3e7 >> 0x18
                                                                          ) | local_3d0[0x2c],
                                                                    CONCAT13((byte)((uint7)
                                                  uStack_3e7 >> 0x10) | local_3d0[0x2b],
                                                  CONCAT12((byte)((uint7)uStack_3e7 >> 8) |
                                                           local_3d0[0x2a],
                                                           CONCAT11((byte)uStack_3e7 |
                                                                    local_3d0[0x29],bStack_3e8))))))
                                        ) >> 8);
                  uStack_3ef = (undefined7)
                               (CONCAT17((byte)((uint7)uStack_3ef >> 0x30) | local_3d0[0x27],
                                         CONCAT16((byte)((uint7)uStack_3ef >> 0x28) |
                                                  local_3d0[0x26],
                                                  CONCAT15((byte)((uint7)uStack_3ef >> 0x20) |
                                                           local_3d0[0x25],
                                                           CONCAT14((byte)((uint7)uStack_3ef >> 0x18
                                                                          ) | local_3d0[0x24],
                                                                    CONCAT13((byte)((uint7)
                                                  uStack_3ef >> 0x10) | local_3d0[0x23],
                                                  CONCAT12((byte)((uint7)uStack_3ef >> 8) |
                                                           local_3d0[0x22],
                                                           CONCAT11((byte)uStack_3ef |
                                                                    local_3d0[0x21],local_3f0)))))))
                               >> 8);
                  local_3e0 = local_3e0 | local_3d0[0x30];
                  bStack_3df = bStack_3df | local_3d0[0x31];
                  bStack_3de = bStack_3de | local_3d0[0x32];
                  bStack_3dd = bStack_3dd | local_3d0[0x33];
                  bStack_3dc = bStack_3dc | local_3d0[0x34];
                  bStack_3db = bStack_3db | local_3d0[0x35];
                  bStack_3da = bStack_3da | local_3d0[0x36];
                  bStack_3d9 = bStack_3d9 | local_3d0[0x37];
                  uStack_3d8 = CONCAT17((byte)((ulong)uStack_3d8 >> 0x38) | local_3d0[0x3f],
                                        CONCAT16((byte)((ulong)uStack_3d8 >> 0x30) | local_3d0[0x3e]
                                                 ,CONCAT15((byte)((ulong)uStack_3d8 >> 0x28) |
                                                           local_3d0[0x3d],
                                                           CONCAT14((byte)((ulong)uStack_3d8 >> 0x20
                                                                          ) | local_3d0[0x3c],
                                                                    CONCAT13((byte)((ulong)
                                                  uStack_3d8 >> 0x18) | local_3d0[0x3b],
                                                  CONCAT12((byte)((ulong)uStack_3d8 >> 0x10) |
                                                           local_3d0[0x3a],
                                                           CONCAT11((byte)((ulong)uStack_3d8 >> 8) |
                                                                    local_3d0[0x39],
                                                                    (byte)uStack_3d8 |
                                                                    local_3d0[0x38])))))));
                  iVar4 = mbedtls_entropy_func(auStack_388,local_3d0,0x40);
                  if (iVar4 == 0) {
                    local_410 = local_410 | local_3d0[0];
                    bStack_408 = bStack_408 | local_3d0[8];
                    uStack_407 = (undefined7)
                                 (CONCAT17((byte)((uint7)uStack_407 >> 0x30) | local_3d0[0xf],
                                           CONCAT16((byte)((uint7)uStack_407 >> 0x28) |
                                                    local_3d0[0xe],
                                                    CONCAT15((byte)((uint7)uStack_407 >> 0x20) |
                                                             local_3d0[0xd],
                                                             CONCAT14((byte)((uint7)uStack_407 >>
                                                                            0x18) | local_3d0[0xc],
                                                                      CONCAT13((byte)((uint7)
                                                  uStack_407 >> 0x10) | local_3d0[0xb],
                                                  CONCAT12((byte)((uint7)uStack_407 >> 8) |
                                                           local_3d0[10],
                                                           CONCAT11((byte)uStack_407 | local_3d0[9],
                                                                    bStack_408))))))) >> 8);
                    uStack_40f = (undefined7)
                                 (CONCAT17((byte)((uint7)uStack_40f >> 0x30) | local_3d0[7],
                                           CONCAT16((byte)((uint7)uStack_40f >> 0x28) | local_3d0[6]
                                                    ,CONCAT15((byte)((uint7)uStack_40f >> 0x20) |
                                                              local_3d0[5],
                                                              CONCAT14((byte)((uint7)uStack_40f >>
                                                                             0x18) | local_3d0[4],
                                                                       CONCAT13((byte)((uint7)
                                                  uStack_40f >> 0x10) | local_3d0[3],
                                                  CONCAT12((byte)((uint7)uStack_40f >> 8) |
                                                           local_3d0[2],
                                                           CONCAT11((byte)uStack_40f | local_3d0[1],
                                                                    local_410))))))) >> 8);
                    local_400 = local_400 | local_3d0[0x10];
                    bStack_3f8 = bStack_3f8 | local_3d0[0x18];
                    uStack_3f7 = (undefined7)
                                 (CONCAT17((byte)((uint7)uStack_3f7 >> 0x30) | local_3d0[0x1f],
                                           CONCAT16((byte)((uint7)uStack_3f7 >> 0x28) |
                                                    local_3d0[0x1e],
                                                    CONCAT15((byte)((uint7)uStack_3f7 >> 0x20) |
                                                             local_3d0[0x1d],
                                                             CONCAT14((byte)((uint7)uStack_3f7 >>
                                                                            0x18) | local_3d0[0x1c],
                                                                      CONCAT13((byte)((uint7)
                                                  uStack_3f7 >> 0x10) | local_3d0[0x1b],
                                                  CONCAT12((byte)((uint7)uStack_3f7 >> 8) |
                                                           local_3d0[0x1a],
                                                           CONCAT11((byte)uStack_3f7 |
                                                                    local_3d0[0x19],bStack_3f8))))))
                                          ) >> 8);
                    uStack_3ff = (undefined7)
                                 (CONCAT17((byte)((uint7)uStack_3ff >> 0x30) | local_3d0[0x17],
                                           CONCAT16((byte)((uint7)uStack_3ff >> 0x28) |
                                                    local_3d0[0x16],
                                                    CONCAT15((byte)((uint7)uStack_3ff >> 0x20) |
                                                             local_3d0[0x15],
                                                             CONCAT14((byte)((uint7)uStack_3ff >>
                                                                            0x18) | local_3d0[0x14],
                                                                      CONCAT13((byte)((uint7)
                                                  uStack_3ff >> 0x10) | local_3d0[0x13],
                                                  CONCAT12((byte)((uint7)uStack_3ff >> 8) |
                                                           local_3d0[0x12],
                                                           CONCAT11((byte)uStack_3ff |
                                                                    local_3d0[0x11],local_400)))))))
                                 >> 8);
                    local_3f0 = local_3f0 | local_3d0[0x20];
                    bStack_3e8 = bStack_3e8 | local_3d0[0x28];
                    uStack_3e7 = (undefined7)
                                 (CONCAT17((byte)((uint7)uStack_3e7 >> 0x30) | local_3d0[0x2f],
                                           CONCAT16((byte)((uint7)uStack_3e7 >> 0x28) |
                                                    local_3d0[0x2e],
                                                    CONCAT15((byte)((uint7)uStack_3e7 >> 0x20) |
                                                             local_3d0[0x2d],
                                                             CONCAT14((byte)((uint7)uStack_3e7 >>
                                                                            0x18) | local_3d0[0x2c],
                                                                      CONCAT13((byte)((uint7)
                                                  uStack_3e7 >> 0x10) | local_3d0[0x2b],
                                                  CONCAT12((byte)((uint7)uStack_3e7 >> 8) |
                                                           local_3d0[0x2a],
                                                           CONCAT11((byte)uStack_3e7 |
                                                                    local_3d0[0x29],bStack_3e8))))))
                                          ) >> 8);
                    uStack_3ef = (undefined7)
                                 (CONCAT17((byte)((uint7)uStack_3ef >> 0x30) | local_3d0[0x27],
                                           CONCAT16((byte)((uint7)uStack_3ef >> 0x28) |
                                                    local_3d0[0x26],
                                                    CONCAT15((byte)((uint7)uStack_3ef >> 0x20) |
                                                             local_3d0[0x25],
                                                             CONCAT14((byte)((uint7)uStack_3ef >>
                                                                            0x18) | local_3d0[0x24],
                                                                      CONCAT13((byte)((uint7)
                                                  uStack_3ef >> 0x10) | local_3d0[0x23],
                                                  CONCAT12((byte)((uint7)uStack_3ef >> 8) |
                                                           local_3d0[0x22],
                                                           CONCAT11((byte)uStack_3ef |
                                                                    local_3d0[0x21],local_3f0)))))))
                                 >> 8);
                    local_3e0 = local_3e0 | local_3d0[0x30];
                    bStack_3df = bStack_3df | local_3d0[0x31];
                    bStack_3de = bStack_3de | local_3d0[0x32];
                    bStack_3dd = bStack_3dd | local_3d0[0x33];
                    bStack_3dc = bStack_3dc | local_3d0[0x34];
                    bStack_3db = bStack_3db | local_3d0[0x35];
                    bStack_3da = bStack_3da | local_3d0[0x36];
                    bStack_3d9 = bStack_3d9 | local_3d0[0x37];
                    uStack_3d8 = CONCAT17((byte)((ulong)uStack_3d8 >> 0x38) | local_3d0[0x3f],
                                          CONCAT16((byte)((ulong)uStack_3d8 >> 0x30) |
                                                   local_3d0[0x3e],
                                                   CONCAT15((byte)((ulong)uStack_3d8 >> 0x28) |
                                                            local_3d0[0x3d],
                                                            CONCAT14((byte)((ulong)uStack_3d8 >>
                                                                           0x20) | local_3d0[0x3c],
                                                                     CONCAT13((byte)((ulong)
                                                  uStack_3d8 >> 0x18) | local_3d0[0x3b],
                                                  CONCAT12((byte)((ulong)uStack_3d8 >> 0x10) |
                                                           local_3d0[0x3a],
                                                           CONCAT11((byte)((ulong)uStack_3d8 >> 8) |
                                                                    local_3d0[0x39],
                                                                    (byte)uStack_3d8 |
                                                                    local_3d0[0x38])))))));
                    iVar4 = mbedtls_entropy_func(auStack_388,local_3d0,0x40);
                    if (iVar4 == 0) {
                      uVar6 = 0;
                      local_410 = local_410 | local_3d0[0];
                      bStack_408 = bStack_408 | local_3d0[8];
                      uStack_407 = (undefined7)
                                   (CONCAT17((byte)((uint7)uStack_407 >> 0x30) | local_3d0[0xf],
                                             CONCAT16((byte)((uint7)uStack_407 >> 0x28) |
                                                      local_3d0[0xe],
                                                      CONCAT15((byte)((uint7)uStack_407 >> 0x20) |
                                                               local_3d0[0xd],
                                                               CONCAT14((byte)((uint7)uStack_407 >>
                                                                              0x18) | local_3d0[0xc]
                                                                        ,CONCAT13((byte)((uint7)
                                                  uStack_407 >> 0x10) | local_3d0[0xb],
                                                  CONCAT12((byte)((uint7)uStack_407 >> 8) |
                                                           local_3d0[10],
                                                           CONCAT11((byte)uStack_407 | local_3d0[9],
                                                                    bStack_408))))))) >> 8);
                      uStack_40f = (undefined7)
                                   (CONCAT17((byte)((uint7)uStack_40f >> 0x30) | local_3d0[7],
                                             CONCAT16((byte)((uint7)uStack_40f >> 0x28) |
                                                      local_3d0[6],
                                                      CONCAT15((byte)((uint7)uStack_40f >> 0x20) |
                                                               local_3d0[5],
                                                               CONCAT14((byte)((uint7)uStack_40f >>
                                                                              0x18) | local_3d0[4],
                                                                        CONCAT13((byte)((uint7)
                                                  uStack_40f >> 0x10) | local_3d0[3],
                                                  CONCAT12((byte)((uint7)uStack_40f >> 8) |
                                                           local_3d0[2],
                                                           CONCAT11((byte)uStack_40f | local_3d0[1],
                                                                    local_410))))))) >> 8);
                      local_400 = local_400 | local_3d0[0x10];
                      bStack_3f8 = bStack_3f8 | local_3d0[0x18];
                      uStack_3f7 = (undefined7)
                                   (CONCAT17((byte)((uint7)uStack_3f7 >> 0x30) | local_3d0[0x1f],
                                             CONCAT16((byte)((uint7)uStack_3f7 >> 0x28) |
                                                      local_3d0[0x1e],
                                                      CONCAT15((byte)((uint7)uStack_3f7 >> 0x20) |
                                                               local_3d0[0x1d],
                                                               CONCAT14((byte)((uint7)uStack_3f7 >>
                                                                              0x18) |
                                                                        local_3d0[0x1c],
                                                                        CONCAT13((byte)((uint7)
                                                  uStack_3f7 >> 0x10) | local_3d0[0x1b],
                                                  CONCAT12((byte)((uint7)uStack_3f7 >> 8) |
                                                           local_3d0[0x1a],
                                                           CONCAT11((byte)uStack_3f7 |
                                                                    local_3d0[0x19],bStack_3f8))))))
                                            ) >> 8);
                      uStack_3ff = (undefined7)
                                   (CONCAT17((byte)((uint7)uStack_3ff >> 0x30) | local_3d0[0x17],
                                             CONCAT16((byte)((uint7)uStack_3ff >> 0x28) |
                                                      local_3d0[0x16],
                                                      CONCAT15((byte)((uint7)uStack_3ff >> 0x20) |
                                                               local_3d0[0x15],
                                                               CONCAT14((byte)((uint7)uStack_3ff >>
                                                                              0x18) |
                                                                        local_3d0[0x14],
                                                                        CONCAT13((byte)((uint7)
                                                  uStack_3ff >> 0x10) | local_3d0[0x13],
                                                  CONCAT12((byte)((uint7)uStack_3ff >> 8) |
                                                           local_3d0[0x12],
                                                           CONCAT11((byte)uStack_3ff |
                                                                    local_3d0[0x11],local_400)))))))
                                   >> 8);
                      local_3f0 = local_3f0 | local_3d0[0x20];
                      bStack_3e8 = bStack_3e8 | local_3d0[0x28];
                      uStack_3e7 = (undefined7)
                                   (CONCAT17((byte)((uint7)uStack_3e7 >> 0x30) | local_3d0[0x2f],
                                             CONCAT16((byte)((uint7)uStack_3e7 >> 0x28) |
                                                      local_3d0[0x2e],
                                                      CONCAT15((byte)((uint7)uStack_3e7 >> 0x20) |
                                                               local_3d0[0x2d],
                                                               CONCAT14((byte)((uint7)uStack_3e7 >>
                                                                              0x18) |
                                                                        local_3d0[0x2c],
                                                                        CONCAT13((byte)((uint7)
                                                  uStack_3e7 >> 0x10) | local_3d0[0x2b],
                                                  CONCAT12((byte)((uint7)uStack_3e7 >> 8) |
                                                           local_3d0[0x2a],
                                                           CONCAT11((byte)uStack_3e7 |
                                                                    local_3d0[0x29],bStack_3e8))))))
                                            ) >> 8);
                      uStack_3ef = (undefined7)
                                   (CONCAT17((byte)((uint7)uStack_3ef >> 0x30) | local_3d0[0x27],
                                             CONCAT16((byte)((uint7)uStack_3ef >> 0x28) |
                                                      local_3d0[0x26],
                                                      CONCAT15((byte)((uint7)uStack_3ef >> 0x20) |
                                                               local_3d0[0x25],
                                                               CONCAT14((byte)((uint7)uStack_3ef >>
                                                                              0x18) |
                                                                        local_3d0[0x24],
                                                                        CONCAT13((byte)((uint7)
                                                  uStack_3ef >> 0x10) | local_3d0[0x23],
                                                  CONCAT12((byte)((uint7)uStack_3ef >> 8) |
                                                           local_3d0[0x22],
                                                           CONCAT11((byte)uStack_3ef |
                                                                    local_3d0[0x21],local_3f0)))))))
                                   >> 8);
                      uStack_3d8 = CONCAT17((byte)((ulong)uStack_3d8 >> 0x38) | local_3d0[0x3f],
                                            CONCAT16((byte)((ulong)uStack_3d8 >> 0x30) |
                                                     local_3d0[0x3e],
                                                     CONCAT15((byte)((ulong)uStack_3d8 >> 0x28) |
                                                              local_3d0[0x3d],
                                                              CONCAT14((byte)((ulong)uStack_3d8 >>
                                                                             0x20) | local_3d0[0x3c]
                                                                       ,CONCAT13((byte)((ulong)
                                                  uStack_3d8 >> 0x18) | local_3d0[0x3b],
                                                  CONCAT12((byte)((ulong)uStack_3d8 >> 0x10) |
                                                           local_3d0[0x3a],
                                                           CONCAT11((byte)((ulong)uStack_3d8 >> 8) |
                                                                    local_3d0[0x39],
                                                                    (byte)uStack_3d8 |
                                                                    local_3d0[0x38])))))));
                      local_3e0 = local_3e0 | local_3d0[0x30];
                      bStack_3df = bStack_3df | local_3d0[0x31];
                      bStack_3de = bStack_3de | local_3d0[0x32];
                      bStack_3dd = bStack_3dd | local_3d0[0x33];
                      bStack_3dc = bStack_3dc | local_3d0[0x34];
                      bStack_3db = bStack_3db | local_3d0[0x35];
                      bStack_3da = bStack_3da | local_3d0[0x36];
                      bStack_3d9 = bStack_3d9 | local_3d0[0x37];
                      do {
                        if (local_3d0[uVar6 - 0x40] == 0) {
                          iVar4 = 1;
                          break;
                        }
                        uVar6 = uVar6 + 1;
                        iVar4 = 0;
                      } while (uVar6 < 0x40);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    else {
      iVar4 = -0x3e;
    }
  }
  if (local_370 != -1) {
    mbedtls_md_free(auStack_388);
    local_36c = 0;
    mbedtls_platform_zeroize(auStack_368,800);
    local_370 = -1;
  }
  if (param_1 != 0) {
    if (iVar4 == 0) {
      __s = "passed";
    }
    else {
      __s = "failed";
    }
    puts(__s);
    putchar(10);
  }
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar4 != 0);
  }
  return;
}

