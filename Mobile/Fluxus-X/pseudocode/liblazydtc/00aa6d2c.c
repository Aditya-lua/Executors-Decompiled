/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa6d2c
 */

int ossl_md5_sha1_update(MD5_CTX *param_1,void *param_2,size_t param_3)

{
  int iVar1;
  
  iVar1 = MD5_Update(param_1,param_2,param_3);
  if (iVar1 == 0) {
    return 0;
  }
  iVar1 = SHA1_Update((SHA_CTX *)(param_1 + 1),param_2,param_3);
  return iVar1;
}

