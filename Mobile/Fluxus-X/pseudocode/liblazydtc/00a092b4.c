/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a092b4
 */

int BN_mod_sub_quick(BIGNUM *r,BIGNUM *a,BIGNUM *b,BIGNUM *m)

{
  int iVar1;
  int iVar2;
  
  if (r == m) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_mod.c",0xc3,"BN_mod_sub_quick");
    ERR_set_error(3,0x80106,0);
    iVar2 = 0;
  }
  else {
    iVar1 = BN_sub(r,a,b);
    iVar2 = 0;
    if (iVar1 != 0) {
      if (r->neg != 0) {
        iVar2 = BN_add(r,r,m);
        return iVar2;
      }
      iVar2 = 1;
    }
  }
  return iVar2;
}

