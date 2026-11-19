/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3d4a8
 */

bool FUN_00a3d4a8(long param_1,EVP_PKEY *param_2)

{
  void *key;
  
  key = (void *)ossl_ecx_key_op(0,0,0,**(undefined4 **)(param_1 + 0x78),2,0,0);
  if (key != (void *)0x0) {
    EVP_PKEY_assign(param_2,**(int **)(param_1 + 0x78),key);
  }
  return key != (void *)0x0;
}

