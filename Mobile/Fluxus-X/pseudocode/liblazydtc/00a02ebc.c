/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a02ebc
 */

void * BN_GENCB_new(void)

{
  void *pvVar1;
  
  pvVar1 = CRYPTO_malloc(0x18,"crypto/bn/bn_lib.c",0x3f2);
  if (pvVar1 == (void *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_lib.c",0x3f3,"BN_GENCB_new");
    ERR_set_error(3,0xc0100,0);
    return (void *)0x0;
  }
  return pvVar1;
}

