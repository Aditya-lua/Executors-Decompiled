/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a08cb8
 */

int BN_nnmod(BIGNUM *r,BIGNUM *m,BIGNUM *d,BN_CTX *ctx)

{
  code *UNRECOVERED_JUMPTABLE;
  int iVar1;
  int iVar2;
  
  if (r == d) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_mod.c",0x15,"BN_nnmod");
    ERR_set_error(3,0x80106,0);
    iVar2 = 0;
  }
  else {
    iVar1 = BN_div((BIGNUM *)0x0,r,m,d,ctx);
    iVar2 = 0;
    if (iVar1 != 0) {
      if (r->neg != 0) {
        UNRECOVERED_JUMPTABLE = BN_add;
        if (d->neg != 0) {
          UNRECOVERED_JUMPTABLE = BN_sub;
        }
                    /* WARNING: Could not recover jumptable at 0x00a08d28. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        iVar2 = (*UNRECOVERED_JUMPTABLE)(r,r,d);
        return iVar2;
      }
      iVar2 = 1;
    }
  }
  return iVar2;
}

