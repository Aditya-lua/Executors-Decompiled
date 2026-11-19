/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c8060
 */

int ssl_hmac_old_update(long param_1,uchar *param_2,size_t param_3)

{
  int iVar1;
  
  iVar1 = HMAC_Update(*(HMAC_CTX **)(param_1 + 8),param_2,param_3);
  return iVar1;
}

