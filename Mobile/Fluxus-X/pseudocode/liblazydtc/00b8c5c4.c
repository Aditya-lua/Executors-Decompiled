/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8c5c4
 */

undefined4 psa_aead_abort(int *param_1)

{
  undefined4 uVar1;
  
  uVar1 = 0;
  if (*param_1 != 0) {
    if (*param_1 == 1) {
      uVar1 = mbedtls_psa_aead_abort(param_1 + 10);
    }
    else {
      uVar1 = 0xffffff79;
    }
    memset(param_1,0,0x1d8);
  }
  return uVar1;
}

