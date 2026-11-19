/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b172e8
 */

void OSSL_HTTP_REQ_CTX_set_max_response_length(long param_1,long param_2)

{
  long lVar1;
  
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/http/http_client.c",0x9f,"OSSL_HTTP_REQ_CTX_set_max_response_length");
    ERR_set_error(0x3d,0xc0102,0);
    return;
  }
  lVar1 = 0x19000;
  if (param_2 != 0) {
    lVar1 = param_2;
  }
  *(long *)(param_1 + 0x98) = lVar1;
  return;
}

