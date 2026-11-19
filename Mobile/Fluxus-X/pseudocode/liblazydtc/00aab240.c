/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aab240
 */

int CRYPTO_gcm128_finish(long param_1,void *param_2,ulong param_3)

{
  ulong *puVar1;
  ulong uVar2;
  ulong uVar3;
  uint uVar4;
  int iVar5;
  uint uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  
  uVar2 = *(ulong *)(param_1 + 0x30);
  uVar3 = *(ulong *)(param_1 + 0x38);
  uVar4 = *(uint *)(param_1 + 0x170);
  if (uVar4 == 0) {
    if (*(int *)(param_1 + 0x174) != 0) {
      FUN_00aa9de0(param_1 + 0x40,param_1 + 0x60);
    }
  }
  else {
    uVar6 = uVar4 + 0xf & 0xfffffff0;
    memset((void *)(param_1 + (ulong)uVar4 + 0x188),0,(ulong)(uVar6 - uVar4));
    if (uVar6 != 0x30) goto LAB_00aab2cc;
    FUN_00aaa048(param_1 + 0x40,param_1 + 0x60,param_1 + 0x188,0x30);
  }
  uVar6 = 0;
LAB_00aab2cc:
  puVar1 = (ulong *)(param_1 + 0x188 + (ulong)uVar6);
  *(ulong *)(param_1 + 0x30) = uVar2 << 3;
  *(ulong *)(param_1 + 0x38) = uVar3 << 3;
  *puVar1 = uVar2 >> 0x15 & 0xff0000 | uVar2 >> 5 & 0xff000000 |
            (ulong)(((uint)uVar2 & 0x1fe0) << 0xb | (uint)uVar2 << 0x1b |
                    (uint)(uVar2 >> 5) & 0xff00 | (uint)(uVar2 >> 0x15) & 0xff) << 0x20 |
            uVar2 >> 0x25 & 0xff00 | uVar2 >> 0x35 & 0xff;
  puVar1[1] = uVar3 >> 0x15 & 0xff0000 | uVar3 >> 5 & 0xff000000 |
              (ulong)(((uint)uVar3 & 0x1fe0) << 0xb | (uint)uVar3 << 0x1b |
                      (uint)(uVar3 >> 5) & 0xff00 | (uint)(uVar3 >> 0x15) & 0xff) << 0x20 |
              uVar3 >> 0x25 & 0xff00 | uVar3 >> 0x35 & 0xff;
  FUN_00aaa048((void *)(param_1 + 0x40),param_1 + 0x60,param_1 + 0x188,uVar6 + 0x10);
  uVar8 = *(undefined8 *)(param_1 + 0x28);
  uVar7 = *(undefined8 *)(param_1 + 0x20);
  uVar10 = *(undefined8 *)(param_1 + 0x48);
  uVar9 = *(undefined8 *)(param_1 + 0x40);
  *(ulong *)(param_1 + 0x48) =
       CONCAT17((byte)((ulong)uVar10 >> 0x38) ^ (byte)((ulong)uVar8 >> 0x38),
                CONCAT16((byte)((ulong)uVar10 >> 0x30) ^ (byte)((ulong)uVar8 >> 0x30),
                         CONCAT15((byte)((ulong)uVar10 >> 0x28) ^ (byte)((ulong)uVar8 >> 0x28),
                                  CONCAT14((byte)((ulong)uVar10 >> 0x20) ^
                                           (byte)((ulong)uVar8 >> 0x20),
                                           CONCAT13((byte)((ulong)uVar10 >> 0x18) ^
                                                    (byte)((ulong)uVar8 >> 0x18),
                                                    CONCAT12((byte)((ulong)uVar10 >> 0x10) ^
                                                             (byte)((ulong)uVar8 >> 0x10),
                                                             CONCAT11((byte)((ulong)uVar10 >> 8) ^
                                                                      (byte)((ulong)uVar8 >> 8),
                                                                      (byte)uVar10 ^ (byte)uVar8))))
                                 )));
  *(ulong *)(param_1 + 0x40) =
       CONCAT17((byte)((ulong)uVar9 >> 0x38) ^ (byte)((ulong)uVar7 >> 0x38),
                CONCAT16((byte)((ulong)uVar9 >> 0x30) ^ (byte)((ulong)uVar7 >> 0x30),
                         CONCAT15((byte)((ulong)uVar9 >> 0x28) ^ (byte)((ulong)uVar7 >> 0x28),
                                  CONCAT14((byte)((ulong)uVar9 >> 0x20) ^
                                           (byte)((ulong)uVar7 >> 0x20),
                                           CONCAT13((byte)((ulong)uVar9 >> 0x18) ^
                                                    (byte)((ulong)uVar7 >> 0x18),
                                                    CONCAT12((byte)((ulong)uVar9 >> 0x10) ^
                                                             (byte)((ulong)uVar7 >> 0x10),
                                                             CONCAT11((byte)((ulong)uVar9 >> 8) ^
                                                                      (byte)((ulong)uVar7 >> 8),
                                                                      (byte)uVar9 ^ (byte)uVar7)))))
                        ));
  if ((param_2 == (void *)0x0) || (0x10 < param_3)) {
    return -1;
  }
  iVar5 = CRYPTO_memcmp((void *)(param_1 + 0x40),param_2,param_3);
  return iVar5;
}

