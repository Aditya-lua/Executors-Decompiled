/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c7fe0
 */

bool ssl_hmac_old_new(long param_1)

{
  long lVar1;
  
  lVar1 = HMAC_CTX_new();
  *(long *)(param_1 + 8) = lVar1;
  return lVar1 != 0;
}

