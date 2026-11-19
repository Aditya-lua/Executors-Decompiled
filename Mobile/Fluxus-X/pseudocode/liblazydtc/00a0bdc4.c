/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0bdc4
 */

COMP_CTX * COMP_CTX_new(COMP_METHOD *meth)

{
  int iVar1;
  COMP_CTX *ctx;
  
  ctx = (COMP_CTX *)CRYPTO_zalloc(0x30,"crypto/comp/comp_lib.c",0x16);
  if (ctx == (COMP_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/comp/comp_lib.c",0x17,"COMP_CTX_new");
    ERR_set_error(0x29,0xc0100,0);
  }
  else {
    ctx->meth = meth;
    if ((meth->init != (_func_569 *)0x0) && (iVar1 = (*meth->init)(ctx), iVar1 == 0)) {
      CRYPTO_free(ctx);
      ctx = (COMP_CTX *)0x0;
    }
  }
  return ctx;
}

