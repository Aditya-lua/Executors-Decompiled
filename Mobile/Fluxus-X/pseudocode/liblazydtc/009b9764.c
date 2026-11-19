/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b9764
 */

undefined8 ssl_evp_cipher_up_ref(undefined8 param_1)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = EVP_CIPHER_get0_provider();
  if (lVar1 == 0) {
    return 1;
  }
  uVar2 = EVP_CIPHER_up_ref(param_1);
  return uVar2;
}

