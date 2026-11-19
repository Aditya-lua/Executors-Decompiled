/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6bcb4
 */

int mbedtls_ccm_finish(undefined8 *param_1,void *param_2,size_t param_3)

{
  long lVar1;
  int iVar2;
  uint uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 local_68;
  undefined8 local_60;
  undefined8 uStack_58;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if ((*(uint *)(param_1 + 0x15) >> 4 & 1) == 0) {
    if ((((*(uint *)(param_1 + 0x15) >> 3 & 1) == 0) && (param_1[5] != 0)) ||
       ((param_1[4] != 0 && (param_1[7] != param_1[4])))) {
      iVar2 = -0xd;
    }
    else {
      if (*(int *)(param_1 + 8) != 0) {
        uVar3 = 0;
        do {
          *(undefined1 *)((long)param_1 + (0x1f - (long)(int)uVar3)) = 0;
          uVar3 = uVar3 + 1 & 0xff;
        } while (uVar3 < *(uint *)(param_1 + 8));
      }
      local_60 = 0;
      uStack_58 = 0;
      local_68 = 0;
      iVar2 = mbedtls_cipher_update(param_1 + 9,param_1 + 2,0x10,&local_60,&local_68);
      if (iVar2 == 0) {
        uVar5 = param_1[1];
        uVar4 = *param_1;
        param_1[1] = CONCAT17((byte)((ulong)uStack_58 >> 0x38) ^ (byte)((ulong)uVar5 >> 0x38),
                              CONCAT16((byte)((ulong)uStack_58 >> 0x30) ^
                                       (byte)((ulong)uVar5 >> 0x30),
                                       CONCAT15((byte)((ulong)uStack_58 >> 0x28) ^
                                                (byte)((ulong)uVar5 >> 0x28),
                                                CONCAT14((byte)((ulong)uStack_58 >> 0x20) ^
                                                         (byte)((ulong)uVar5 >> 0x20),
                                                         CONCAT13((byte)((ulong)uStack_58 >> 0x18) ^
                                                                  (byte)((ulong)uVar5 >> 0x18),
                                                                  CONCAT12((byte)((ulong)uStack_58
                                                                                 >> 0x10) ^
                                                                           (byte)((ulong)uVar5 >>
                                                                                 0x10),
                                                                           CONCAT11((byte)((ulong)
                                                  uStack_58 >> 8) ^ (byte)((ulong)uVar5 >> 8),
                                                  (byte)uStack_58 ^ (byte)uVar5)))))));
        *param_1 = CONCAT17((byte)((ulong)local_60 >> 0x38) ^ (byte)((ulong)uVar4 >> 0x38),
                            CONCAT16((byte)((ulong)local_60 >> 0x30) ^ (byte)((ulong)uVar4 >> 0x30),
                                     CONCAT15((byte)((ulong)local_60 >> 0x28) ^
                                              (byte)((ulong)uVar4 >> 0x28),
                                              CONCAT14((byte)((ulong)local_60 >> 0x20) ^
                                                       (byte)((ulong)uVar4 >> 0x20),
                                                       CONCAT13((byte)((ulong)local_60 >> 0x18) ^
                                                                (byte)((ulong)uVar4 >> 0x18),
                                                                CONCAT12((byte)((ulong)local_60 >>
                                                                               0x10) ^
                                                                         (byte)((ulong)uVar4 >> 0x10
                                                                               ),CONCAT11((byte)((
                                                  ulong)local_60 >> 8) ^ (byte)((ulong)uVar4 >> 8),
                                                  (byte)local_60 ^ (byte)uVar4)))))));
        mbedtls_platform_zeroize(&local_60,0x10);
        if (param_2 != (void *)0x0) {
          memcpy(param_2,param_1,param_3);
        }
        iVar2 = 0;
        *(undefined4 *)(param_1 + 0x15) = 0;
        param_1[2] = 0;
        param_1[3] = 0;
        *param_1 = 0;
        param_1[1] = 0;
      }
      else {
        *(uint *)(param_1 + 0x15) = *(uint *)(param_1 + 0x15) | 0x10;
        mbedtls_platform_zeroize(&local_60,0x10);
      }
    }
  }
  else {
    iVar2 = -0x6e;
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

