/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a83938
 */

int CRYPTO_get_ex_new_index
              (int class_index,long argl,void *argp,undefined1 *new_func,undefined1 *dup_func,
              undefined1 *free_func)

{
  int iVar1;
  
  iVar1 = ossl_crypto_get_ex_new_index_ex(0,class_index,argl,argp,new_func,dup_func,free_func,0);
  return iVar1;
}

