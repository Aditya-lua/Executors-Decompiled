/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b73f3c
 */

int mbedtls_ctr_drbg_random_with_add
              (long param_1,void *param_2,ulong param_3,undefined8 param_4,ulong param_5)

{
  size_t __n;
  uint uVar1;
  uint uVar2;
  long lVar3;
  int iVar4;
  long lVar5;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined1 auStack_68 [16];
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  if (0x400 < param_3) {
    iVar4 = -0x36;
    goto LAB_00b740ac;
  }
  if (0x100 < param_5) {
    iVar4 = -0x38;
    goto LAB_00b740ac;
  }
  uStack_70 = 0;
  local_78 = 0;
  uStack_80 = 0;
  local_88 = 0;
  uStack_90 = 0;
  local_98 = 0;
  if ((*(int *)(param_1 + 0x20) < *(int *)(param_1 + 0x10)) || (*(int *)(param_1 + 0x14) != 0)) {
    iVar4 = FUN_00b73d28(param_1,param_4,param_5,0);
    if (iVar4 != 0) goto LAB_00b740ac;
LAB_00b73fd4:
    if (param_3 != 0) {
      do {
        lVar5 = 0xc;
        do {
          uVar1 = (*(uint *)(param_1 + lVar5) & 0xff00ff00) >> 8 |
                  (*(uint *)(param_1 + lVar5) & 0xff00ff) << 8;
          uVar1 = (uVar1 >> 0x10 | uVar1 << 0x10) + 1;
          uVar2 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
          *(uint *)(param_1 + lVar5) = uVar2 >> 0x10 | uVar2 << 0x10;
          if (lVar5 == 0) break;
          lVar5 = lVar5 + -4;
        } while (uVar1 == 0);
        iVar4 = mbedtls_aes_crypt_ecb(param_1 + 0x28,1,param_1,auStack_68);
        if (iVar4 != 0) goto LAB_00b740a0;
        __n = param_3;
        if (0xf < param_3) {
          __n = 0x10;
        }
        memcpy(param_2,auStack_68,__n);
        param_3 = param_3 - __n;
        param_2 = (void *)((long)param_2 + __n);
      } while (param_3 != 0);
    }
    iVar4 = FUN_00b73b88(param_1,&local_98);
    if (iVar4 == 0) {
      *(int *)(param_1 + 0x10) = *(int *)(param_1 + 0x10) + 1;
    }
  }
  else {
    if (param_5 == 0) goto LAB_00b73fd4;
    iVar4 = FUN_00b7389c(&local_98,param_4,param_5);
    if (iVar4 == 0) {
      iVar4 = FUN_00b73b88(param_1,&local_98);
      if (iVar4 == 0) goto LAB_00b73fd4;
    }
  }
LAB_00b740a0:
  mbedtls_platform_zeroize(&local_98,0x40);
LAB_00b740ac:
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

