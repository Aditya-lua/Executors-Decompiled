/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7ac30
 */

int FUN_00b7ac30(undefined8 param_1,undefined8 *param_2,ulong param_3,undefined8 *param_4,
                undefined8 *param_5,size_t *param_6)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  size_t __n;
  long lVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined8 uVar9;
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auStack_90 [8];
  undefined8 local_88;
  undefined8 local_80;
  undefined8 local_78;
  undefined8 local_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  *param_6 = 0;
  if (param_3 < 3) {
    iVar3 = -0x6100;
  }
  else {
    __n = (param_3 - 1) * 8;
    lVar4 = (param_3 - 1) * 6;
    *param_4 = *param_2;
    memmove(param_5,param_2 + 1,__n);
    if (lVar4 != 0) {
      puVar5 = param_5 + (param_3 - 2);
      do {
        auVar11._8_8_ = 0xffffffffffffffd0;
        auVar11._0_8_ = 0xffffffffffffffc8;
        auVar10._8_8_ = 0xffffffffffffffe0;
        auVar10._0_8_ = 0xffffffffffffffd8;
        auVar8._8_4_ = 0xfffffff0;
        auVar8._0_8_ = 0xffffffffffffffe8;
        auVar7._8_8_ = lVar4;
        auVar7._0_8_ = lVar4;
        auVar10 = NEON_ushl(auVar7,auVar10,8);
        auVar11 = NEON_ushl(auVar7,auVar11,8);
        auVar8._12_4_ = 0xffffffff;
        auVar8 = NEON_ushl(auVar7,auVar8,8);
        uVar9 = *param_4;
        local_88 = CONCAT17((byte)((ulong)uVar9 >> 0x38) ^ (byte)lVar4,
                            CONCAT16((byte)((ulong)uVar9 >> 0x30) ^ (byte)((ulong)lVar4 >> 8),
                                     CONCAT15((byte)((ulong)uVar9 >> 0x28) ^ auVar8[8],
                                              CONCAT14((byte)((ulong)uVar9 >> 0x20) ^ auVar8[0],
                                                       CONCAT13((byte)((ulong)uVar9 >> 0x18) ^
                                                                auVar10[8],
                                                                CONCAT12((byte)((ulong)uVar9 >> 0x10
                                                                               ) ^ auVar10[0],
                                                                         CONCAT11((byte)((ulong)
                                                  uVar9 >> 8) ^ auVar11[8],(byte)uVar9 ^ auVar11[0])
                                                  ))))));
        *param_4 = local_88;
        local_80 = *puVar5;
        iVar3 = mbedtls_cipher_update(param_1,&local_88,0x10,&local_78,auStack_90);
        if (iVar3 != 0) {
          memset(param_5,0,__n);
          goto LAB_00b7ad9c;
        }
        bVar2 = puVar5 != param_5;
        *param_4 = local_78;
        puVar6 = puVar5 + -1;
        *puVar5 = local_70;
        puVar5 = param_5 + (param_3 - 2);
        if (bVar2) {
          puVar5 = puVar6;
        }
        lVar4 = lVar4 + -1;
      } while (lVar4 != 0);
    }
    iVar3 = 0;
    *param_6 = __n;
LAB_00b7ad9c:
    mbedtls_platform_zeroize(&local_88,0x10);
    mbedtls_platform_zeroize(&local_78,0x10);
  }
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

