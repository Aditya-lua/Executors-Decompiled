/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b66340
 */

undefined8
ossl_cipher_trailingdata
          (long param_1,long *param_2,ulong param_3,undefined8 *param_4,size_t *param_5)

{
  size_t __n;
  
  __n = *param_5;
  if (__n != 0) {
    if (param_3 < *param_2 + __n) {
      ERR_new();
      ERR_set_debug("providers/implementations/ciphers/ciphercommon_block.c",0x57,
                    "ossl_cipher_trailingdata");
      ERR_set_error(0x39,0xc0103,0);
      return 0;
    }
    memcpy((void *)(param_1 + *param_2),(void *)*param_4,__n);
    *param_2 = *param_2 + *param_5;
    *param_5 = 0;
  }
  return 1;
}

