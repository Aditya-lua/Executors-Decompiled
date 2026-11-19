/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a09340
 */

int BN_mod_mul(BIGNUM *r,BIGNUM *a,BIGNUM *b,BIGNUM *m,BN_CTX *ctx)

{
  code *pcVar1;
  int iVar2;
  BIGNUM *r_00;
  
  BN_CTX_start(ctx);
  r_00 = BN_CTX_get(ctx);
  if (r_00 != (BIGNUM *)0x0) {
    if (a == b) {
      iVar2 = BN_sqr(r_00,a,ctx);
    }
    else {
      iVar2 = BN_mul(r_00,a,b,ctx);
    }
    if (iVar2 != 0) {
      if (r == m) {
        ERR_new();
        ERR_set_debug("crypto/bn/bn_mod.c",0x15,"BN_nnmod");
        ERR_set_error(3,0x80106,0);
      }
      else {
        iVar2 = BN_div((BIGNUM *)0x0,r,r_00,m,ctx);
        if (iVar2 != 0) {
          if (r->neg != 0) {
            pcVar1 = BN_add;
            if (m->neg != 0) {
              pcVar1 = BN_sub;
            }
            iVar2 = (*pcVar1)(r,r,m);
            if (iVar2 == 0) goto LAB_00a09440;
          }
          iVar2 = 1;
          goto LAB_00a09444;
        }
      }
    }
  }
LAB_00a09440:
  iVar2 = 0;
LAB_00a09444:
  BN_CTX_end(ctx);
  return iVar2;
}

