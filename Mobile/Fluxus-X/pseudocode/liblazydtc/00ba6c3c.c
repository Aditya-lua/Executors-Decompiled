/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba6c3c
 */

undefined4 mbedtls_rsa_check_privkey(long param_1)

{
  int iVar1;
  undefined4 uVar2;
  
  iVar1 = mbedtls_rsa_check_pubkey();
  if ((iVar1 == 0) && (iVar1 = FUN_00ba6554(param_1,1), iVar1 == 0)) {
    iVar1 = mbedtls_rsa_validate_params
                      (param_1 + 0x10,param_1 + 0x40,param_1 + 0x50,param_1 + 0x30,param_1 + 0x20,0,
                       0);
    uVar2 = 0xffffbe00;
    if (iVar1 == 0) {
      iVar1 = mbedtls_rsa_validate_crt
                        (param_1 + 0x40,param_1 + 0x50,param_1 + 0x30,param_1 + 0x60,param_1 + 0x70,
                         param_1 + 0x80);
      uVar2 = 0;
      if (iVar1 != 0) {
        uVar2 = 0xffffbe00;
      }
    }
  }
  else {
    uVar2 = 0xffffbe00;
  }
  return uVar2;
}

