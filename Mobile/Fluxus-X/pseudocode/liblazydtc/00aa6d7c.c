/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa6d7c
 */

int ossl_md5_sha1_final(uchar *param_1,MD5_CTX *param_2)

{
  int iVar1;
  
  iVar1 = MD5_Final(param_1,param_2);
  if (iVar1 == 0) {
    return 0;
  }
  iVar1 = SHA1_Final(param_1 + 0x10,(SHA_CTX *)(param_2 + 1));
  return iVar1;
}

