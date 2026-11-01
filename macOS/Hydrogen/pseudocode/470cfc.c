
void FUN_00470cfc(long param_1,undefined8 *param_2)

{
  bool in_ZR;
  char cVar1;
  uint in_w9;
  long in_x10;
  undefined8 in_x11;
  ulong in_x12;
  ulong in_x13;
  ulong in_x14;
  long lVar2;
  byte *pbVar3;
  ulong uVar4;
  undefined8 *puVar5;
  long unaff_x19;
  undefined1 uVar6;
  uint unaff_w21;
  long unaff_x22;
  undefined8 uVar7;
  undefined8 uVar8;
  
  if (!in_ZR) {
    uVar4 = in_x13 & 0xfffffffffffffff8;
    cVar1 = (char)in_w9;
    uVar6 = (undefined1)unaff_w21;
    lVar2 = in_x14 - uVar4;
    puVar5 = (undefined8 *)((long)param_2 + ((unaff_x22 + unaff_x19) - in_x14));
    do {
      uVar8 = NEON_ushl(*(undefined8 *)((long)puVar5 + -1),
                        CONCAT17(-cVar1,CONCAT16(-cVar1,CONCAT15(-cVar1,CONCAT14(-cVar1,CONCAT13(-
                                                  cVar1,CONCAT12(-cVar1,CONCAT11(-cVar1,-cVar1))))))
                                ),1);
      uVar7 = NEON_ushl(*puVar5,CONCAT17(uVar6,CONCAT16(uVar6,CONCAT15(uVar6,CONCAT14(uVar6,CONCAT13
                                                  (uVar6,CONCAT12(uVar6,CONCAT11(uVar6,uVar6))))))),
                        1);
      *puVar5 = CONCAT17((byte)((ulong)uVar8 >> 0x38) | (byte)((ulong)uVar7 >> 0x38),
                         CONCAT16((byte)((ulong)uVar8 >> 0x30) | (byte)((ulong)uVar7 >> 0x30),
                                  CONCAT15((byte)((ulong)uVar8 >> 0x28) |
                                           (byte)((ulong)uVar7 >> 0x28),
                                           CONCAT14((byte)((ulong)uVar8 >> 0x20) |
                                                    (byte)((ulong)uVar7 >> 0x20),
                                                    CONCAT13((byte)((ulong)uVar8 >> 0x18) |
                                                             (byte)((ulong)uVar7 >> 0x18),
                                                             CONCAT12((byte)((ulong)uVar8 >> 0x10) |
                                                                      (byte)((ulong)uVar7 >> 0x10),
                                                                      CONCAT11((byte)((ulong)uVar8
                                                                                     >> 8) |
                                                                               (byte)((ulong)uVar7
                                                                                     >> 8),
                                                                               (byte)uVar8 |
                                                                               (byte)uVar7)))))));
      lVar2 = lVar2 + 8;
      puVar5 = puVar5 + -1;
    } while (lVar2 != 0);
    in_x14 = uVar4;
    if (in_x13 == uVar4) goto LAB_00470d88;
  }
  uVar4 = param_1 - in_x14;
  pbVar3 = (byte *)((long)param_2 + uVar4 + 7);
  do {
    uVar4 = uVar4 - 1;
    *pbVar3 = pbVar3[-1] >> (ulong)(in_w9 & 0x1f) | *pbVar3 << (ulong)(unaff_w21 & 0x1f);
    pbVar3 = pbVar3 + -1;
  } while (in_x12 < uVar4);
LAB_00470d88:
  *(char *)(in_x10 + unaff_x19) = *(char *)(in_x10 + unaff_x19) << (ulong)(unaff_w21 & 0x1f);
  *param_2 = in_x11;
  return;
}

