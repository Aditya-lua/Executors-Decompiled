/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77c2c
 */

void EVP_PKEY_meth_set_signctx(EVP_PKEY_METHOD *pmeth,signctx_init *signctx_init,signctx *signctx)

{
  *(signctx_init **)(pmeth + 0x70) = signctx_init;
  *(signctx **)(pmeth + 0x78) = signctx;
  return;
}

