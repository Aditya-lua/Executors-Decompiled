/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa549c
 */

bool CRYPTO_THREAD_init_local(pthread_key_t *param_1,__destr_function *param_2)

{
  int iVar1;
  
  iVar1 = pthread_key_create(param_1,param_2);
  return iVar1 == 0;
}

