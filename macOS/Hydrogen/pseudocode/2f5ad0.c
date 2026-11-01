
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_002f5ad0(ulong param_1,undefined1 param_2 [16],undefined1 param_3 [16],undefined8 param_4,
                 undefined8 param_5,long param_6,ulong param_7)

{
  ulong uVar1;
  byte *pbVar2;
  undefined *puVar3;
  undefined8 *puVar4;
  long lVar5;
  undefined *puVar6;
  undefined8 *puVar7;
  byte *pbVar8;
  long unaff_x19;
  long *plVar9;
  long unaff_x29;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined1 auVar12 [16];
  undefined8 uStack0000000000000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  
  uStack0000000000000028 =
       CONCAT17(param_3[0xf] ^ param_2[0xf],
                CONCAT16(param_3[0xe] ^ param_2[0xe],
                         CONCAT15(param_3[0xd] ^ param_2[0xd],
                                  CONCAT14(param_3[0xc] ^ param_2[0xc],
                                           CONCAT13(param_3[0xb] ^ param_2[0xb],
                                                    CONCAT12(param_3[10] ^ param_2[10],
                                                             CONCAT11(param_3[9] ^ param_2[9],
                                                                      param_3[8] ^ param_2[8])))))))
  ;
  uStack0000000000000020 =
       CONCAT17(param_3[7] ^ param_2[7],
                CONCAT16(param_3[6] ^ param_2[6],
                         CONCAT15(param_3[5] ^ param_2[5],
                                  CONCAT14(param_3[4] ^ param_2[4],
                                           CONCAT13(param_3[3] ^ param_2[3],
                                                    CONCAT12(param_3[2] ^ param_2[2],
                                                             CONCAT11(param_3[1] ^ param_2[1],
                                                                      param_3[0] ^ param_2[0])))))))
  ;
  if (param_1 != param_7) {
    uVar1 = param_1;
    if (((uint)param_7 >> 3 & 1) != 0) {
      uVar1 = param_7 & 0xfffffffffffffff8;
      lVar5 = param_1 - uVar1;
      puVar4 = (undefined8 *)(param_6 + param_1);
      puVar7 = (undefined8 *)((long)&uStack0000000000000000 + param_1);
      do {
        uVar10 = *puVar4;
        uVar11 = *puVar7;
        *puVar7 = CONCAT17((byte)((ulong)uVar11 >> 0x38) ^ (byte)((ulong)uVar10 >> 0x38),
                           CONCAT16((byte)((ulong)uVar11 >> 0x30) ^ (byte)((ulong)uVar10 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar11 >> 0x28) ^
                                             (byte)((ulong)uVar10 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar11 >> 0x20) ^
                                                      (byte)((ulong)uVar10 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar11 >> 0x18) ^
                                                               (byte)((ulong)uVar10 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar11 >> 0x10
                                                                              ) ^ (byte)((ulong)
                                                  uVar10 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar11 >> 8) ^
                                                           (byte)((ulong)uVar10 >> 8),
                                                           (byte)uVar11 ^ (byte)uVar10)))))));
        lVar5 = lVar5 + 8;
        puVar4 = puVar4 + 1;
        puVar7 = puVar7 + 1;
      } while (lVar5 != 0);
      if (uVar1 == param_7) goto LAB_002f5b0c;
    }
    lVar5 = param_7 - uVar1;
    pbVar2 = (byte *)(param_6 + uVar1);
    pbVar8 = (byte *)((long)&uStack0000000000000000 + uVar1);
    do {
      *pbVar8 = *pbVar8 ^ *pbVar2;
      lVar5 = lVar5 + -1;
      pbVar2 = pbVar2 + 1;
      pbVar8 = pbVar8 + 1;
    } while (lVar5 != 0);
  }
LAB_002f5b0c:
  uStack0000000000000000 =
       CONCAT17((byte)((ulong)uStack0000000000000000 >> 0x38) ^ (byte)((ulong)_UNK_0082fee0 >> 0x38)
                ,CONCAT16((byte)((ulong)uStack0000000000000000 >> 0x30) ^
                          (byte)((ulong)_UNK_0082fee0 >> 0x30),
                          CONCAT15((byte)((ulong)uStack0000000000000000 >> 0x28) ^
                                   (byte)((ulong)_UNK_0082fee0 >> 0x28),
                                   CONCAT14((byte)((ulong)uStack0000000000000000 >> 0x20) ^
                                            (byte)((ulong)_UNK_0082fee0 >> 0x20),
                                            CONCAT13((byte)((ulong)uStack0000000000000000 >> 0x18) ^
                                                     (byte)((ulong)_UNK_0082fee0 >> 0x18),
                                                     CONCAT12((byte)((ulong)uStack0000000000000000
                                                                    >> 0x10) ^
                                                              (byte)((ulong)_UNK_0082fee0 >> 0x10),
                                                              CONCAT11((byte)((ulong)
                                                  uStack0000000000000000 >> 8) ^
                                                  (byte)((ulong)_UNK_0082fee0 >> 8),
                                                  (byte)uStack0000000000000000 ^ (byte)_UNK_0082fee0
                                                  )))))));
  in_stack_00000008 =
       CONCAT17((byte)((ulong)in_stack_00000008 >> 0x38) ^ (byte)((ulong)_UNK_0082fee8 >> 0x38),
                CONCAT16((byte)((ulong)in_stack_00000008 >> 0x30) ^
                         (byte)((ulong)_UNK_0082fee8 >> 0x30),
                         CONCAT15((byte)((ulong)in_stack_00000008 >> 0x28) ^
                                  (byte)((ulong)_UNK_0082fee8 >> 0x28),
                                  CONCAT14((byte)((ulong)in_stack_00000008 >> 0x20) ^
                                           (byte)((ulong)_UNK_0082fee8 >> 0x20),
                                           CONCAT13((byte)((ulong)in_stack_00000008 >> 0x18) ^
                                                    (byte)((ulong)_UNK_0082fee8 >> 0x18),
                                                    CONCAT12((byte)((ulong)in_stack_00000008 >> 0x10
                                                                   ) ^ (byte)((ulong)_UNK_0082fee8
                                                                             >> 0x10),
                                                             CONCAT11((byte)((ulong)
                                                  in_stack_00000008 >> 8) ^
                                                  (byte)((ulong)_UNK_0082fee8 >> 8),
                                                  (byte)in_stack_00000008 ^ (byte)_UNK_0082fee8)))))
                        ));
  in_stack_00000010 =
       CONCAT17((byte)((ulong)in_stack_00000010 >> 0x38) ^ (byte)((ulong)_UNK_0082fef0 >> 0x38),
                CONCAT16((byte)((ulong)in_stack_00000010 >> 0x30) ^
                         (byte)((ulong)_UNK_0082fef0 >> 0x30),
                         CONCAT15((byte)((ulong)in_stack_00000010 >> 0x28) ^
                                  (byte)((ulong)_UNK_0082fef0 >> 0x28),
                                  CONCAT14((byte)((ulong)in_stack_00000010 >> 0x20) ^
                                           (byte)((ulong)_UNK_0082fef0 >> 0x20),
                                           CONCAT13((byte)((ulong)in_stack_00000010 >> 0x18) ^
                                                    (byte)((ulong)_UNK_0082fef0 >> 0x18),
                                                    CONCAT12((byte)((ulong)in_stack_00000010 >> 0x10
                                                                   ) ^ (byte)((ulong)_UNK_0082fef0
                                                                             >> 0x10),
                                                             CONCAT11((byte)((ulong)
                                                  in_stack_00000010 >> 8) ^
                                                  (byte)((ulong)_UNK_0082fef0 >> 8),
                                                  (byte)in_stack_00000010 ^ (byte)_UNK_0082fef0)))))
                        ));
  in_stack_00000018 =
       CONCAT17((byte)((ulong)in_stack_00000018 >> 0x38) ^ (byte)((ulong)_UNK_0082fef8 >> 0x38),
                CONCAT16((byte)((ulong)in_stack_00000018 >> 0x30) ^
                         (byte)((ulong)_UNK_0082fef8 >> 0x30),
                         CONCAT15((byte)((ulong)in_stack_00000018 >> 0x28) ^
                                  (byte)((ulong)_UNK_0082fef8 >> 0x28),
                                  CONCAT14((byte)((ulong)in_stack_00000018 >> 0x20) ^
                                           (byte)((ulong)_UNK_0082fef8 >> 0x20),
                                           CONCAT13((byte)((ulong)in_stack_00000018 >> 0x18) ^
                                                    (byte)((ulong)_UNK_0082fef8 >> 0x18),
                                                    CONCAT12((byte)((ulong)in_stack_00000018 >> 0x10
                                                                   ) ^ (byte)((ulong)_UNK_0082fef8
                                                                             >> 0x10),
                                                             CONCAT11((byte)((ulong)
                                                  in_stack_00000018 >> 8) ^
                                                  (byte)((ulong)_UNK_0082fef8 >> 8),
                                                  (byte)in_stack_00000018 ^ (byte)_UNK_0082fef8)))))
                        ));
  uStack0000000000000020 =
       CONCAT17((byte)((ulong)uStack0000000000000020 >> 0x38) ^ (byte)((ulong)_UNK_0082ff00 >> 0x38)
                ,CONCAT16((byte)((ulong)uStack0000000000000020 >> 0x30) ^
                          (byte)((ulong)_UNK_0082ff00 >> 0x30),
                          CONCAT15((byte)((ulong)uStack0000000000000020 >> 0x28) ^
                                   (byte)((ulong)_UNK_0082ff00 >> 0x28),
                                   CONCAT14((byte)((ulong)uStack0000000000000020 >> 0x20) ^
                                            (byte)((ulong)_UNK_0082ff00 >> 0x20),
                                            CONCAT13((byte)((ulong)uStack0000000000000020 >> 0x18) ^
                                                     (byte)((ulong)_UNK_0082ff00 >> 0x18),
                                                     CONCAT12((byte)((ulong)uStack0000000000000020
                                                                    >> 0x10) ^
                                                              (byte)((ulong)_UNK_0082ff00 >> 0x10),
                                                              CONCAT11((byte)((ulong)
                                                  uStack0000000000000020 >> 8) ^
                                                  (byte)((ulong)_UNK_0082ff00 >> 8),
                                                  (byte)uStack0000000000000020 ^ (byte)_UNK_0082ff00
                                                  )))))));
  uStack0000000000000028 =
       CONCAT17((byte)((ulong)uStack0000000000000028 >> 0x38) ^ (byte)((ulong)_UNK_0082ff08 >> 0x38)
                ,CONCAT16((byte)((ulong)uStack0000000000000028 >> 0x30) ^
                          (byte)((ulong)_UNK_0082ff08 >> 0x30),
                          CONCAT15((byte)((ulong)uStack0000000000000028 >> 0x28) ^
                                   (byte)((ulong)_UNK_0082ff08 >> 0x28),
                                   CONCAT14((byte)((ulong)uStack0000000000000028 >> 0x20) ^
                                            (byte)((ulong)_UNK_0082ff08 >> 0x20),
                                            CONCAT13((byte)((ulong)uStack0000000000000028 >> 0x18) ^
                                                     (byte)((ulong)_UNK_0082ff08 >> 0x18),
                                                     CONCAT12((byte)((ulong)uStack0000000000000028
                                                                    >> 0x10) ^
                                                              (byte)((ulong)_UNK_0082ff08 >> 0x10),
                                                              CONCAT11((byte)((ulong)
                                                  uStack0000000000000028 >> 8) ^
                                                  (byte)((ulong)_UNK_0082ff08 >> 8),
                                                  (byte)uStack0000000000000028 ^ (byte)_UNK_0082ff08
                                                  )))))));
  if ((uRam0000000000a334f8 >> 2 & 1) == 0) {
    if ((uRam0000000000a334f8 & 1) == 0) {
      func_0x00296a94();
      puVar3 = &_aws_lc_0_24_0_aes_nohw_ctr32_encrypt_blocks;
      puVar6 = &_aws_lc_0_24_0_aes_nohw_encrypt;
    }
    else {
      func_0x0038a640();
      puVar3 = &DAT_0038a7c0;
      puVar6 = &DAT_00389e90;
    }
  }
  else {
    func_0x003784e0();
    puVar3 = &DAT_00378c40;
    puVar6 = &DAT_00378780;
  }
  *(undefined **)(unaff_x19 + 0xf8) = puVar6;
  *(undefined **)(unaff_x19 + 0x100) = puVar3;
  *(undefined8 *)(unaff_x19 + 0x110) = uStack0000000000000028;
  *(undefined8 *)(unaff_x19 + 0x108) = uStack0000000000000020;
  *(undefined8 *)(unaff_x19 + 0x118) = 1;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x18)) {
    return;
  }
  lVar5 = ___stack_chk_fail();
  if (lVar5 == 0) {
    return;
  }
  if (pcRam0000000000a3bef0 == (code *)0x0) {
    plVar9 = (long *)(lVar5 + -8);
    if (*plVar9 + 8 != 0) {
      _bzero(plVar9,*plVar9 + 8);
    }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)(plVar9);
    return;
  }
  if (lRam0000000000a3bee0 == 0) {
    func_0x0079fc6c();
  }
  else if (lRam0000000000a3bee8 != 0) {
                    /* WARNING: Could not recover jumptable at 0x0036e428. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*pcRam0000000000a3bef0)(lVar5,"",0);
    return;
  }
  auVar12 = func_0x0079fc90();
  if (auVar12._8_8_ != 0) {
    _bzero(auVar12._0_8_);
  }
  return;
}

