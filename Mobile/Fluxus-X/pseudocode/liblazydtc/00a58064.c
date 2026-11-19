/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a58064
 */

int EVP_DigestFinal_ex(EVP_MD_CTX *ctx,uchar *md,uint *s)

{
  uint uVar1;
  int iVar2;
  undefined8 uVar3;
  ENGINE *pEVar4;
  ulong local_38;
  
  local_38 = 0;
  if ((ctx->engine != (ENGINE *)0x0) && (uVar1 = EVP_MD_get_size(), -1 < (int)uVar1)) {
    pEVar4 = ctx->engine;
    if (*(long *)(pEVar4 + 0x70) == 0) {
      if (0x40 < uVar1) {
                    /* WARNING: Subroutine does not return */
        OPENSSL_die("assertion failed: mdsize <= EVP_MAX_MD_SIZE","crypto/evp/digest.c",0x1cd);
      }
      iVar2 = (**(code **)(pEVar4 + 0x30))(ctx,md);
      if (s != (uint *)0x0) {
        *s = uVar1;
      }
      pEVar4 = ctx->engine;
      if (*(code **)(pEVar4 + 0x40) != (code *)0x0) {
        (**(code **)(pEVar4 + 0x40))(ctx);
        EVP_MD_CTX_set_flags(ctx,2);
        pEVar4 = ctx->engine;
      }
      OPENSSL_cleanse(ctx->pctx,(long)*(int *)(pEVar4 + 0x4c));
      return iVar2;
    }
    if (*(code **)(pEVar4 + 0xa0) == (code *)0x0) {
      ERR_new();
      uVar3 = 0x1ba;
    }
    else {
      iVar2 = (**(code **)(pEVar4 + 0xa0))(ctx[1].engine,md,&local_38,(long)(int)uVar1);
      if (s == (uint *)0x0) {
        return iVar2;
      }
      if (local_38 >> 0x20 == 0) {
        *s = (uint)local_38;
        return iVar2;
      }
      ERR_new();
      uVar3 = 0x1c4;
    }
    ERR_set_debug("crypto/evp/digest.c",uVar3,"EVP_DigestFinal_ex");
    ERR_set_error(6,0xbc,0);
  }
  return 0;
}

