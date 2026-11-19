/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a095e8
 */

int BN_mod_lshift(BIGNUM *r,BIGNUM *a,int n,BIGNUM *m,BN_CTX *ctx)

{
  code *pcVar1;
  int iVar2;
  BIGNUM *a_00;
  
  if (r == m) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_mod.c",0x15,"BN_nnmod");
    ERR_set_error(3,0x80106,0);
  }
  else {
    iVar2 = BN_div((BIGNUM *)0x0,r,a,m,ctx);
    if (iVar2 != 0) {
      if (r->neg != 0) {
        pcVar1 = BN_add;
        if (m->neg != 0) {
          pcVar1 = BN_sub;
        }
        iVar2 = (*pcVar1)(r,r,m);
        if (iVar2 == 0) {
          return 0;
        }
      }
      if (m->neg == 0) {
        a_00 = (BIGNUM *)0x0;
      }
      else {
        a_00 = BN_dup(m);
        if (a_00 == (BIGNUM *)0x0) {
          return 0;
        }
        a_00->neg = 0;
      }
      if (a_00 != (BIGNUM *)0x0) {
        m = a_00;
      }
      iVar2 = BN_mod_lshift_quick(r,r,n,m);
      BN_free(a_00);
      return iVar2;
    }
  }
  return 0;
}

