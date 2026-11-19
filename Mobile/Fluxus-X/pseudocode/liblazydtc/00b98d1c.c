/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b98d1c
 */

void mbedtls_psa_cipher_update
               (uint *param_1,void *param_2,ulong param_3,long param_4,ulong param_5,ulong *param_6)

{
  size_t __n;
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  uint *puVar6;
  long local_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  uVar4 = param_3;
  if ((*param_1 & 0x7f800000) != 0x4800000) {
    uVar5 = (ulong)*(byte *)((long)param_1 + 5);
    uVar4 = 0;
    if (uVar5 != 0) {
      uVar4 = (*(long *)(param_1 + 0xe) + param_3) / uVar5;
    }
    uVar4 = uVar4 * uVar5;
  }
  if (param_5 < uVar4) {
    uVar2 = 0xffffff76;
  }
  else if (*param_1 == 0x4404400) {
    puVar6 = param_1 + 2;
    if (*(long *)puVar6 == 0) {
      uVar4 = 0;
    }
    else {
      uVar4 = (ulong)*(uint *)(*(long *)puVar6 + 8) & 0x1f;
    }
    local_70 = 0;
    *param_6 = 0;
    if (param_3 != 0) {
      lVar3 = *(long *)(param_1 + 0xe);
      if (lVar3 != 0) {
        __n = param_3;
        if (uVar4 - lVar3 <= param_3) {
          __n = uVar4 - lVar3;
        }
        memcpy((void *)((long)param_1 + lVar3 + 0x28),param_2,__n);
        lVar3 = *(long *)(param_1 + 0xe);
        param_3 = param_3 - __n;
        param_2 = (void *)((long)param_2 + __n);
        *(size_t *)(param_1 + 0xe) = lVar3 + __n;
        if (lVar3 + __n == uVar4) {
          mbedtls_cipher_update(puVar6,param_1 + 10,uVar4,param_4,&local_70);
          uVar2 = mbedtls_to_psa_error();
          if ((int)uVar2 != 0) goto LAB_00b98f10;
          param_4 = param_4 + local_70;
          *param_6 = *param_6 + local_70;
          param_1[0xe] = 0;
          param_1[0xf] = 0;
        }
      }
      for (; uVar4 <= param_3; param_3 = param_3 - uVar4) {
        mbedtls_cipher_update(puVar6,param_2,uVar4,param_4,&local_70);
        uVar2 = mbedtls_to_psa_error();
        if ((int)uVar2 != 0) goto LAB_00b98f10;
        param_2 = (void *)((long)param_2 + uVar4);
        param_4 = param_4 + local_70;
        *param_6 = *param_6 + local_70;
      }
      if (param_3 != 0) {
        memcpy((void *)((long)param_1 + *(long *)(param_1 + 0xe) + 0x28),param_2,param_3);
        uVar2 = 0;
        *(ulong *)(param_1 + 0xe) = *(long *)(param_1 + 0xe) + param_3;
        goto LAB_00b98f10;
      }
    }
    uVar2 = 0;
  }
  else if (param_3 == 0) {
    uVar2 = 0;
    *param_6 = 0;
  }
  else {
    mbedtls_cipher_update(param_1 + 2,param_2,param_3,param_4,param_6);
    uVar2 = mbedtls_to_psa_error();
    if (param_5 < *param_6) {
      uVar2 = 0xffffff69;
    }
  }
LAB_00b98f10:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

