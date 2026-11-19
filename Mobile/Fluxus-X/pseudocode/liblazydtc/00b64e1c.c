/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b64e1c
 */

void ossl_prov_ctx_new(void)

{
  CRYPTO_zalloc(0x18,"providers/common/provider_ctx.c",0x10);
  return;
}

