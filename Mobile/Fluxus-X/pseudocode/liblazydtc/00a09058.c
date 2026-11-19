/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a09058
 */

int BN_mod_sub(BIGNUM *r,BIGNUM *a,BIGNUM *b,BIGNUM *m,BN_CTX *ctx)

{
  code *UNRECOVERED_JUMPTABLE;
  int iVar1;
  int iVar2;
  
  iVar1 = BN_sub(r,a,b);
  iVar2 = 0;
  if (iVar1 != 0) {
    if (r == m) {
      ERR_new();
      ERR_set_debug("crypto/bn/bn_mod.c",0x15,"BN_nnmod");
      ERR_set_error(3,0x80106,0);
      iVar2 = 0;
    }
    else {
      iVar1 = BN_div((BIGNUM *)0x0,r,r,m,ctx);
      iVar2 = 0;
      if (iVar1 != 0) {
        if (r->neg != 0) {
          UNRECOVERED_JUMPTABLE = BN_add;
          if (m->neg != 0) {
            UNRECOVERED_JUMPTABLE = BN_sub;
          }
                    /* WARNING: Could not recover jumptable at 0x00a090dc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          iVar2 = (*UNRECOVERED_JUMPTABLE)(r,r,m);
          return iVar2;
        }
        iVar2 = 1;
      }
    }
  }
  return iVar2;
}

