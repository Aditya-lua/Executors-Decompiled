/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b17248
 */

undefined8 OSSL_HTTP_REQ_CTX_get0_mem_bio(long param_1)

{
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/http/http_client.c",0x8c,"OSSL_HTTP_REQ_CTX_get0_mem_bio");
    ERR_set_error(0x3d,0xc0102,0);
    return 0;
  }
  return *(undefined8 *)(param_1 + 0x58);
}

