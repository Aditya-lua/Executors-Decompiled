/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9b020
 */

void mbedtls_ecdh_make_params
               (undefined1 *param_1,long *param_2,long param_3,long param_4,undefined8 param_5,
               undefined8 param_6)

{
  undefined1 *puVar1;
  undefined1 uVar2;
  long lVar3;
  undefined8 uVar4;
  long local_78;
  long local_70;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  if ((*(int *)(param_1 + 8) == 1) && (*(long *)(param_1 + 0x88) != 0)) {
    uVar2 = *param_1;
    puVar1 = param_1 + 0x10;
    uVar4 = mbedtls_ecp_gen_privkey(puVar1,param_1 + 0xd0,param_5,param_6);
    if ((int)uVar4 == 0) {
      uVar4 = mbedtls_ecp_mul_restartable
                        (puVar1,param_1 + 0xe0,param_1 + 0xd0,param_1 + 0x48,param_5,param_6,0);
      if (((int)uVar4 == 0) &&
         (uVar4 = mbedtls_ecp_tls_write_group(puVar1,&local_70,param_3,param_4), (int)uVar4 == 0)) {
        uVar4 = mbedtls_ecp_tls_write_point
                          (puVar1,param_1 + 0xe0,uVar2,&local_78,param_3 + local_70,
                           param_4 - local_70);
        if ((int)uVar4 == 0) {
          *param_2 = local_78 + local_70;
        }
      }
    }
  }
  else {
    uVar4 = 0xffffb080;
  }
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

