/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9c6d8
 */

int mbedtls_hmac_drbg_random_with_add
              (undefined8 *param_1,void *param_2,ulong param_3,void *param_4,ulong param_5)

{
  undefined8 *__src;
  size_t __n;
  long lVar1;
  int iVar2;
  ulong uVar3;
  long lVar4;
  code *pcVar5;
  undefined1 auStack_1f0 [384];
  long local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(long *)(lVar1 + 0x28);
  uVar3 = mbedtls_md_get_size(*param_1);
  if (0x400 < param_3) {
    iVar2 = -3;
    goto LAB_00b9c740;
  }
  if (param_5 < 0x101) {
    pcVar5 = (code *)param_1[0xe];
    if ((pcVar5 == (code *)0x0) ||
       ((*(int *)(param_1 + 0xd) != 1 && (*(int *)(param_1 + 0xb) <= *(int *)((long)param_1 + 0x6c))
        ))) {
      if ((param_4 != (void *)0x0) &&
         ((param_5 != 0 && (iVar2 = mbedtls_hmac_drbg_update(param_1,param_4,param_5), iVar2 != 0)))
         ) goto LAB_00b9c740;
    }
    else {
      lVar4 = param_1[0xc];
      if (0x180 < lVar4 + param_5) goto LAB_00b9c73c;
      memset(auStack_1f0,0,0x180);
      iVar2 = (*pcVar5)(param_1[0xf],auStack_1f0,lVar4);
      if (iVar2 != 0) {
        iVar2 = -9;
        goto LAB_00b9c740;
      }
      lVar4 = param_1[0xc];
      if ((param_4 != (void *)0x0) && (param_5 != 0)) {
        memcpy(auStack_1f0 + lVar4,param_4,param_5);
        lVar4 = lVar4 + param_5;
      }
      iVar2 = mbedtls_hmac_drbg_update(param_1,auStack_1f0,lVar4);
      if (iVar2 != 0) {
        mbedtls_platform_zeroize(auStack_1f0,lVar4);
        goto LAB_00b9c740;
      }
      *(undefined4 *)(param_1 + 0xb) = 1;
      mbedtls_platform_zeroize(auStack_1f0,lVar4);
      param_5 = 0;
    }
    if (param_3 != 0) {
      uVar3 = uVar3 & 0xff;
      __src = param_1 + 3;
      do {
        __n = uVar3;
        if (param_3 <= uVar3) {
          __n = param_3;
        }
        iVar2 = mbedtls_md_hmac_reset(param_1);
        if (((iVar2 != 0) || (iVar2 = mbedtls_md_hmac_update(param_1,__src,uVar3), iVar2 != 0)) ||
           (iVar2 = mbedtls_md_hmac_finish(param_1,__src), iVar2 != 0)) goto LAB_00b9c740;
        memcpy(param_2,__src,__n);
        param_3 = param_3 - __n;
        param_2 = (void *)((long)param_2 + __n);
      } while (param_3 != 0);
    }
    iVar2 = mbedtls_hmac_drbg_update(param_1,param_4,param_5);
    if (iVar2 == 0) {
      *(int *)(param_1 + 0xb) = *(int *)(param_1 + 0xb) + 1;
    }
  }
  else {
LAB_00b9c73c:
    iVar2 = -5;
  }
LAB_00b9c740:
  if (*(long *)(lVar1 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

