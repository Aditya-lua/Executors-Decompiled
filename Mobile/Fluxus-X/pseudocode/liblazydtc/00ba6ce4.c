/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba6ce4
 */

undefined4 mbedtls_rsa_check_pub_priv(long param_1,long param_2)

{
  int iVar1;
  undefined4 uVar2;
  
  iVar1 = mbedtls_rsa_check_pubkey();
  if (((iVar1 == 0) && (iVar1 = mbedtls_rsa_check_pubkey(param_2), iVar1 == 0)) &&
     (iVar1 = FUN_00ba6554(param_2,1), iVar1 == 0)) {
    iVar1 = mbedtls_rsa_validate_params
                      (param_2 + 0x10,param_2 + 0x40,param_2 + 0x50,param_2 + 0x30,param_2 + 0x20,0,
                       0);
    if (((iVar1 == 0) &&
        (iVar1 = mbedtls_rsa_validate_crt
                           (param_2 + 0x40,param_2 + 0x50,param_2 + 0x30,param_2 + 0x60,
                            param_2 + 0x70,param_2 + 0x80), iVar1 == 0)) &&
       (iVar1 = mbedtls_mpi_cmp_mpi(param_1 + 0x10,param_2 + 0x10), iVar1 == 0)) {
      iVar1 = mbedtls_mpi_cmp_mpi(param_1 + 0x20,param_2 + 0x20);
      uVar2 = 0;
      if (iVar1 != 0) {
        uVar2 = 0xffffbe00;
      }
      return uVar2;
    }
  }
  return 0xffffbe00;
}

