
undefined1  [16] FUN_004629c4(ulong param_1,long param_2,ulong param_3)

{
  ulong in_x9;
  ulong uVar1;
  uint in_w10;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined1 auVar6 [16];
  
  while (in_w10 != 0) {
    in_x9 = in_x9 + 1;
    if (param_1 == in_x9) {
      uVar1 = param_3 - 0x10;
      in_x9 = param_1;
      goto joined_r0x004629dc;
    }
    in_w10 = (uint)*(byte *)(param_2 + in_x9);
  }
LAB_00462a48:
  auVar6._8_8_ = in_x9 + 1;
  auVar6._0_8_ = param_2;
  return auVar6;
joined_r0x004629dc:
  if (uVar1 < in_x9) goto LAB_00462a34;
  lVar3 = ((long *)(param_2 + in_x9))[1];
  lVar2 = *(long *)(param_2 + in_x9);
  lVar4 = 0x101010101010100 - lVar2;
  lVar5 = 0x101010101010100 - lVar3;
  if (((CONCAT17((byte)((ulong)lVar4 >> 0x38) | (byte)((ulong)lVar2 >> 0x38),
                 CONCAT16((byte)((ulong)lVar4 >> 0x30) | (byte)((ulong)lVar2 >> 0x30),
                          CONCAT15((byte)((ulong)lVar4 >> 0x28) | (byte)((ulong)lVar2 >> 0x28),
                                   CONCAT14((byte)((ulong)lVar4 >> 0x20) |
                                            (byte)((ulong)lVar2 >> 0x20),
                                            CONCAT13((byte)((ulong)lVar4 >> 0x18) |
                                                     (byte)((ulong)lVar2 >> 0x18),
                                                     CONCAT12((byte)((ulong)lVar4 >> 0x10) |
                                                              (byte)((ulong)lVar2 >> 0x10),
                                                              CONCAT11((byte)((ulong)lVar4 >> 8) |
                                                                       (byte)((ulong)lVar2 >> 8),
                                                                       (byte)lVar4 | (byte)lVar2))))
                                  ))) &
        CONCAT17((byte)((ulong)lVar5 >> 0x38) | (byte)((ulong)lVar3 >> 0x38),
                 CONCAT16((byte)((ulong)lVar5 >> 0x30) | (byte)((ulong)lVar3 >> 0x30),
                          CONCAT15((byte)((ulong)lVar5 >> 0x28) | (byte)((ulong)lVar3 >> 0x28),
                                   CONCAT14((byte)((ulong)lVar5 >> 0x20) |
                                            (byte)((ulong)lVar3 >> 0x20),
                                            CONCAT13((byte)((ulong)lVar5 >> 0x18) |
                                                     (byte)((ulong)lVar3 >> 0x18),
                                                     CONCAT12((byte)((ulong)lVar5 >> 0x10) |
                                                              (byte)((ulong)lVar3 >> 0x10),
                                                              CONCAT11((byte)((ulong)lVar5 >> 8) |
                                                                       (byte)((ulong)lVar3 >> 8),
                                                                       (byte)lVar5 | (byte)lVar3))))
                                  ))) ^ 0xffffffffffffffff) & 0x8080808080808080) != 0)
  goto LAB_00462a34;
  in_x9 = in_x9 + 0x10;
  goto joined_r0x004629dc;
LAB_00462a34:
  if (param_3 == in_x9) goto code_r0x00462a3c;
  uVar1 = (ulong)*(byte *)(param_2 + in_x9);
  if (*(byte *)(param_2 + in_x9) == 0) goto LAB_00462a48;
  in_x9 = in_x9 + 1;
  goto LAB_00462a34;
code_r0x00462a3c:
  param_2 = 0;
  in_x9 = uVar1;
  goto LAB_00462a48;
}

