/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77a84
 */

undefined4 EVP_PKEY_CTX_hex2ctrl(long param_1,undefined4 param_2,undefined8 param_3)

{
  undefined4 uVar1;
  void *ptr;
  long local_28;
  
  ptr = (void *)OPENSSL_hexstr2buf(param_3,&local_28);
  if (ptr == (void *)0x0) {
    uVar1 = 0;
  }
  else {
    if (local_28 < 0x80000000) {
      uVar1 = (**(code **)(*(long *)(param_1 + 0x78) + 0xc0))(param_1,param_2,local_28,ptr);
    }
    else {
      uVar1 = 0xffffffff;
    }
    CRYPTO_free(ptr);
  }
  return uVar1;
}

