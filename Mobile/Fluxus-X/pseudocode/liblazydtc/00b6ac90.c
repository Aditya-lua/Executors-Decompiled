/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6ac90
 */

void mbedtls_cipher_crypt
               (long *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
               undefined8 param_5,long param_6,long *param_7)

{
  long lVar1;
  undefined8 uVar2;
  long local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  uVar2 = mbedtls_cipher_set_iv();
  if ((int)uVar2 == 0) {
    if (*param_1 == 0) {
      uVar2 = 0xffff9f00;
    }
    else {
      param_1[6] = 0;
      uVar2 = mbedtls_cipher_update(param_1,param_4,param_5,param_6,param_7);
      if (((int)uVar2 == 0) &&
         (uVar2 = mbedtls_cipher_finish(param_1,param_6 + *param_7,&local_50), (int)uVar2 == 0)) {
        *param_7 = *param_7 + local_50;
      }
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

