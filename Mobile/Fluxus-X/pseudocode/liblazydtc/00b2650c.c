/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2650c
 */

bool FUN_00b2650c(ulong *param_1,undefined8 param_2,void *param_3,ulong param_4)

{
  uint uVar1;
  uint uVar2;
  ulong uVar3;
  uint uVar5;
  uint uVar4;
  uint uVar7;
  uint uVar6;
  uint uVar8;
  undefined8 *puVar9;
  int iVar10;
  long lVar11;
  ulong uVar12;
  bool bVar13;
  undefined8 uVar14;
  ulong uVar15;
  undefined8 uVar16;
  ulong uVar17;
  long local_58;
  ulong local_50;
  ulong uStack_48;
  
  local_58 = 0x10;
  lVar11 = EVP_MAC_CTX_dup(param_1[6]);
  if (lVar11 == 0) {
    return false;
  }
  if (param_4 < 0x10) {
    memset((undefined1 *)((long)&local_50 + param_4),0,0x10 - param_4);
    memcpy(&local_50,param_3,param_4);
    *(undefined1 *)((long)&local_50 + param_4) = 0x80;
    uVar17 = *param_1;
    uVar3 = param_1[1];
    uVar1 = (uint)(uVar17 >> 0x20);
    uVar1 = uVar1 >> 8 | uVar1 << 0x18;
    uVar2 = (uint)(uVar3 >> 0x20);
    uVar4 = ((uint)uVar17 & 0xff00ff00) >> 8 | ((uint)uVar17 & 0xff00ff) << 8;
    uVar5 = uVar4 >> 0x10 | uVar4 << 0x10;
    uVar12 = (ulong)(uVar2 >> 8 | uVar2 << 0x18) & 0xff00ff00;
    uVar6 = ((uint)uVar3 & 0xff00ff00) >> 8 | ((uint)uVar3 & 0xff00ff) << 8;
    uVar7 = uVar6 >> 0x10 | uVar6 << 0x10;
    uVar15 = (ulong)uVar7 << 0x20;
    uVar8 = ((uint)(uVar17 >> 0x18) & 0xff0000 | (uint)(byte)(uVar17 >> 0x38) | uVar1 & 0x7f00ff00)
            << 1;
    uVar2 = -((uVar4 & 0xffff) >> 0xf) & 0x87 ^
            ((uint)(uVar3 >> 0x18) & 0xff0000 | (uint)(byte)(uVar3 >> 0x38) | (uint)uVar12) << 1;
    uVar8 = (uVar8 & 0xff00ff00) >> 8 | ((uVar6 & 0xffff) >> 0xf | uVar8 & 0xff00ff) << 8;
    uVar2 = (uVar2 & 0xff00ff00) >> 8 | (uVar2 & 0xff00ff) << 8;
    uVar17 = (ulong)(uVar5 >> 7) & 0xff00 | (ulong)((uVar4 & 0xffff) >> 7) & 0xff |
             ((ulong)uVar5 & 0x7f80) << 9 | CONCAT44(uVar5,uVar1) >> 7 & 0xff000000 |
             (ulong)(uVar8 >> 0x10 | uVar8 << 0x10) << 0x20;
    uVar15 = (ulong)(uVar7 >> 7) & 0xff00 | (ulong)((uVar6 & 0xffff) >> 7) & 0xff |
             (uVar15 & 0x7f8000000000) >> 0x17 | (uVar12 | uVar15) >> 7 & 0xff000000 |
             (ulong)(uVar2 >> 0x10 | uVar2 << 0x10) << 0x20;
    *param_1 = uVar17;
    param_1[1] = uVar15;
    local_50 = uVar17 ^ local_50;
    uStack_48 = uVar15 ^ uStack_48;
    iVar10 = EVP_MAC_update(lVar11,&local_50,0x10);
joined_r0x00b266d8:
    if (iVar10 != 0) {
      iVar10 = EVP_MAC_final(lVar11,param_2,&local_58,0x10);
      bVar13 = iVar10 != 0 && local_58 == 0x10;
      goto LAB_00b26708;
    }
  }
  else {
    iVar10 = EVP_MAC_update(lVar11,param_3,param_4 - 0x10);
    if (iVar10 != 0) {
      puVar9 = (undefined8 *)((long)param_3 + (param_4 - 0x10));
      uVar16 = puVar9[1];
      uVar14 = *puVar9;
      uVar17 = param_1[1];
      uVar15 = *param_1;
      local_50 = CONCAT17((byte)((ulong)uVar14 >> 0x38) ^ (byte)(uVar15 >> 0x38),
                          CONCAT16((byte)((ulong)uVar14 >> 0x30) ^ (byte)(uVar15 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar14 >> 0x28) ^ (byte)(uVar15 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar14 >> 0x20) ^
                                                     (byte)(uVar15 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar14 >> 0x18) ^
                                                              (byte)(uVar15 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar14 >> 0x10)
                                                                       ^ (byte)(uVar15 >> 0x10),
                                                                       CONCAT11((byte)((ulong)uVar14
                                                                                      >> 8) ^
                                                                                (byte)(uVar15 >> 8),
                                                                                (byte)uVar14 ^
                                                                                (byte)uVar15)))))));
      uStack_48 = CONCAT17((byte)((ulong)uVar16 >> 0x38) ^ (byte)(uVar17 >> 0x38),
                           CONCAT16((byte)((ulong)uVar16 >> 0x30) ^ (byte)(uVar17 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar16 >> 0x28) ^ (byte)(uVar17 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar16 >> 0x20) ^
                                                      (byte)(uVar17 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar16 >> 0x18) ^
                                                               (byte)(uVar17 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar16 >> 0x10
                                                                              ) ^ (byte)(uVar17 >>
                                                                                        0x10),
                                                                        CONCAT11((byte)((ulong)
                                                  uVar16 >> 8) ^ (byte)(uVar17 >> 8),
                                                  (byte)uVar16 ^ (byte)uVar17)))))));
      iVar10 = EVP_MAC_update(lVar11,&local_50,0x10);
      goto joined_r0x00b266d8;
    }
  }
  bVar13 = false;
LAB_00b26708:
  EVP_MAC_CTX_free(lVar11);
  return bVar13;
}

