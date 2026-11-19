/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b877f8
 */

undefined8 psa_crypto_local_input_alloc(void *param_1,size_t param_2,undefined8 *param_3)

{
  void *__dest;
  
  *param_3 = 0;
  param_3[1] = 0;
  if (param_2 != 0) {
    __dest = calloc(param_2,1);
    *param_3 = __dest;
    if (__dest == (void *)0x0) {
      return 0xffffff73;
    }
    param_3[1] = param_2;
    memcpy(__dest,param_1,param_2);
  }
  return 0;
}

