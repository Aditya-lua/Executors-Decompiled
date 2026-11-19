/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9db98
 */

void mbedtls_psa_hash_compute
               (undefined4 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
               undefined8 param_5,undefined8 *param_6)

{
  long lVar1;
  int iVar2;
  int iVar3;
  undefined1 auStack_138 [224];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  memset(auStack_138,0,0xe0);
  *param_6 = param_5;
  iVar2 = mbedtls_psa_hash_setup(auStack_138,param_1);
  if ((iVar2 == 0) && (iVar2 = mbedtls_psa_hash_update(auStack_138,param_2,param_3), iVar2 == 0)) {
    iVar2 = mbedtls_psa_hash_finish(auStack_138,param_4,param_5,param_6);
  }
  iVar3 = mbedtls_psa_hash_abort(auStack_138);
  if (iVar2 != 0) {
    iVar3 = iVar2;
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar3);
  }
  return;
}

