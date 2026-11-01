
/* WARNING: Possible PIC construction at 0x002861cc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002861d0) */
/* WARNING: Removing unreachable block (ram,0x00286250) */
/* WARNING: Removing unreachable block (ram,0x002861f8) */
/* WARNING: Removing unreachable block (ram,0x0028626c) */
/* WARNING: Removing unreachable block (ram,0x00286230) */

undefined * FUN_00286140(ulong param_1)

{
  byte *pbVar1;
  undefined *puVar2;
  ulong uVar3;
  ulong in_x9;
  undefined8 *puVar4;
  byte *pbVar5;
  undefined8 *puVar6;
  byte *pbVar7;
  undefined8 *puVar8;
  ulong in_x13;
  long lVar9;
  ulong unaff_x19;
  ulong unaff_x20;
  byte *unaff_x21;
  long unaff_x22;
  ulong unaff_x23;
  long unaff_x24;
  long unaff_x25;
  code *unaff_x27;
  ulong unaff_x28;
  long unaff_x29;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  long in_stack_00000000;
  undefined1 uStack0000000000000010;
  long lStack_1a0;
  long lStack_198;
  undefined8 uStack_190;
  undefined8 uStack_188;
  undefined1 auStack_180 [296];
  long lStack_58;
  
  do {
    lVar9 = in_x13 - in_x9;
    puVar4 = (undefined8 *)(unaff_x25 + in_x13);
    puVar6 = (undefined8 *)(unaff_x22 + in_x13 + unaff_x28);
    puVar8 = (undefined8 *)(unaff_x24 + in_x13 + unaff_x28);
    do {
      uVar10 = *puVar4;
      uVar12 = *puVar8;
      *puVar6 = CONCAT17((byte)((ulong)uVar12 >> 0x38) ^ (byte)((ulong)uVar10 >> 0x38),
                         CONCAT16((byte)((ulong)uVar12 >> 0x30) ^ (byte)((ulong)uVar10 >> 0x30),
                                  CONCAT15((byte)((ulong)uVar12 >> 0x28) ^
                                           (byte)((ulong)uVar10 >> 0x28),
                                           CONCAT14((byte)((ulong)uVar12 >> 0x20) ^
                                                    (byte)((ulong)uVar10 >> 0x20),
                                                    CONCAT13((byte)((ulong)uVar12 >> 0x18) ^
                                                             (byte)((ulong)uVar10 >> 0x18),
                                                             CONCAT12((byte)((ulong)uVar12 >> 0x10)
                                                                      ^ (byte)((ulong)uVar10 >> 0x10
                                                                              ),
                                                                      CONCAT11((byte)((ulong)uVar12
                                                                                     >> 8) ^
                                                                               (byte)((ulong)uVar10
                                                                                     >> 8),
                                                                               (byte)uVar12 ^
                                                                               (byte)uVar10)))))));
      lVar9 = lVar9 + 8;
      puVar4 = puVar4 + 1;
      puVar6 = puVar6 + 1;
      puVar8 = puVar8 + 1;
    } while (lVar9 != 0);
    if (param_1 == in_x9) goto LAB_00286068;
LAB_002860c0:
    do {
      lVar9 = param_1 - in_x9;
      pbVar1 = (byte *)(unaff_x25 + in_x9);
      pbVar5 = (byte *)(unaff_x22 + in_x9 + unaff_x28);
      pbVar7 = (byte *)(unaff_x24 + in_x9 + unaff_x28);
      do {
        *pbVar5 = *pbVar7 ^ *pbVar1;
        lVar9 = lVar9 + -1;
        pbVar1 = pbVar1 + 1;
        pbVar5 = pbVar5 + 1;
        pbVar7 = pbVar7 + 1;
      } while (lVar9 != 0);
LAB_00286068:
      do {
        do {
          unaff_x28 = param_1 + unaff_x28;
          if (unaff_x20 <= unaff_x28) {
            pbVar1 = (byte *)(unaff_x29 + -0xa0);
            lStack_58 = *(long *)PTR____stack_chk_guard_009b01e8;
            func_0x002f51d0(auStack_180,&uStack0000000000000010);
            func_0x002f52c0(auStack_180,in_stack_00000000,unaff_x23 & 0xfffffffffffffff0);
            if ((unaff_x23 & 0xf) != 0) {
              uStack_190 = 0;
              uStack_188 = 0;
              ___memcpy_chk(&uStack_190,in_stack_00000000 + (unaff_x23 & 0xfffffffffffffff0),
                            unaff_x23 & 0xf,0x10);
              func_0x002f52c0(auStack_180,&uStack_190,0x10);
            }
            func_0x002f52c0(auStack_180);
            if ((unaff_x20 & 0xf) != 0) {
              uStack_190 = 0;
              uStack_188 = 0;
              ___memcpy_chk(&uStack_190,unaff_x22 + (unaff_x20 & 0xfffffffffffffff0),unaff_x20 & 0xf
                            ,0x10);
              func_0x002f52c0(auStack_180,&uStack_190,0x10);
            }
            lStack_1a0 = unaff_x23 << 3;
            lStack_198 = unaff_x20 << 3;
            func_0x002f52c0(auStack_180,&lStack_1a0,0x10);
            puVar2 = (undefined *)func_0x002f53b8(auStack_180,pbVar1);
            *pbVar1 = *pbVar1 ^ *unaff_x21;
            *(byte *)(unaff_x29 + -0x9f) = *(byte *)(unaff_x29 + -0x9f) ^ unaff_x21[1];
            *(byte *)(unaff_x29 + -0x9e) = *(byte *)(unaff_x29 + -0x9e) ^ unaff_x21[2];
            *(byte *)(unaff_x29 + -0x9d) = *(byte *)(unaff_x29 + -0x9d) ^ unaff_x21[3];
            *(byte *)(unaff_x29 + -0x9c) = *(byte *)(unaff_x29 + -0x9c) ^ unaff_x21[4];
            *(byte *)(unaff_x29 + -0x9b) = *(byte *)(unaff_x29 + -0x9b) ^ unaff_x21[5];
            *(byte *)(unaff_x29 + -0x9a) = *(byte *)(unaff_x29 + -0x9a) ^ unaff_x21[6];
            *(byte *)(unaff_x29 + -0x99) = *(byte *)(unaff_x29 + -0x99) ^ unaff_x21[7];
            *(byte *)(unaff_x29 + -0x98) = *(byte *)(unaff_x29 + -0x98) ^ unaff_x21[8];
            *(byte *)(unaff_x29 + -0x97) = *(byte *)(unaff_x29 + -0x97) ^ unaff_x21[9];
            *(byte *)(unaff_x29 + -0x96) = *(byte *)(unaff_x29 + -0x96) ^ unaff_x21[10];
            *(byte *)(unaff_x29 + -0x95) = *(byte *)(unaff_x29 + -0x95) ^ unaff_x21[0xb];
            *(byte *)(unaff_x29 + -0x91) = *(byte *)(unaff_x29 + -0x91) & 0x7f;
            if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_58) {
              return puVar2;
            }
            ___stack_chk_fail();
            return &UNK_009cde48;
          }
          (*unaff_x27)(unaff_x29 + -0xa0,unaff_x29 + -0x70);
          *(int *)(unaff_x29 + -0xa0) = *(int *)(unaff_x29 + -0xa0) + 1;
          uVar3 = unaff_x20 - unaff_x28;
          param_1 = uVar3;
          if (0xf < uVar3) {
            param_1 = unaff_x19;
          }
        } while (param_1 == 0);
        if ((param_1 < 8) || ((ulong)(unaff_x22 - unaff_x24) < 0x10)) {
          in_x9 = 0;
          goto LAB_002860c0;
        }
        if (uVar3 < 0x10) {
          in_x13 = 0;
          goto code_r0x00286138;
        }
        in_x9 = param_1 & 0x10;
        puVar4 = (undefined8 *)(unaff_x22 + unaff_x28);
        puVar6 = (undefined8 *)(unaff_x24 + unaff_x28);
        puVar8 = (undefined8 *)(unaff_x29 + -0x70);
        uVar3 = in_x9;
        do {
          uVar12 = puVar8[1];
          uVar10 = *puVar8;
          uVar13 = puVar6[1];
          uVar11 = *puVar6;
          puVar4[1] = CONCAT17((byte)((ulong)uVar13 >> 0x38) ^ (byte)((ulong)uVar12 >> 0x38),
                               CONCAT16((byte)((ulong)uVar13 >> 0x30) ^
                                        (byte)((ulong)uVar12 >> 0x30),
                                        CONCAT15((byte)((ulong)uVar13 >> 0x28) ^
                                                 (byte)((ulong)uVar12 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar13 >> 0x20) ^
                                                          (byte)((ulong)uVar12 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar13 >> 0x18) ^
                                                                   (byte)((ulong)uVar12 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar13 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar12 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar13 >> 8) ^ (byte)((ulong)uVar12 >> 8),
                                                  (byte)uVar13 ^ (byte)uVar12)))))));
          *puVar4 = CONCAT17((byte)((ulong)uVar11 >> 0x38) ^ (byte)((ulong)uVar10 >> 0x38),
                             CONCAT16((byte)((ulong)uVar11 >> 0x30) ^ (byte)((ulong)uVar10 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar11 >> 0x28) ^
                                               (byte)((ulong)uVar10 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar11 >> 0x20) ^
                                                        (byte)((ulong)uVar10 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar11 >> 0x18) ^
                                                                 (byte)((ulong)uVar10 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar11 >>
                                                                                0x10) ^
                                                                          (byte)((ulong)uVar10 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar11 >> 8) ^ (byte)((ulong)uVar10 >> 8),
                                                  (byte)uVar11 ^ (byte)uVar10)))))));
          uVar3 = uVar3 - 0x10;
          puVar4 = puVar4 + 2;
          puVar6 = puVar6 + 2;
          puVar8 = puVar8 + 2;
        } while (uVar3 != 0);
      } while (param_1 == in_x9);
      in_x13 = in_x9;
    } while (((uint)param_1 >> 3 & 1) == 0);
code_r0x00286138:
    in_x9 = param_1 & 0x18;
  } while( true );
}

