/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a32070
 */

int EC_POINT_mul(EC_GROUP *group,EC_POINT *r,BIGNUM *n,EC_POINT *q,BIGNUM *m,BN_CTX *ctx)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  BN_CTX *c;
  BIGNUM *local_50;
  EC_POINT *pEStack_48;
  
  lVar3 = *(long *)group;
  local_50 = m;
  pEStack_48 = q;
  if (((lVar3 == *(long *)r) &&
      (((iVar1 = *(int *)(group + 0x20), iVar1 == 0 || (*(int *)(r + 8) == 0)) ||
       (iVar1 == *(int *)(r + 8))))) &&
     ((q == (EC_POINT *)0x0 ||
      ((lVar3 == *(long *)q &&
       (((iVar1 == 0 || (*(int *)(q + 8) == 0)) || (iVar1 == *(int *)(q + 8))))))))) {
    if (n == (BIGNUM *)0x0 && m == (BIGNUM *)0x0) {
      iVar1 = EC_POINT_set_to_infinity(group,r);
      return iVar1;
    }
    if (ctx == (BN_CTX *)0x0) {
      ctx = (BN_CTX *)BN_CTX_secure_new();
      if (ctx == (BN_CTX *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_lib.c",0x471,"EC_POINT_mul");
        uVar2 = 0xc0103;
        goto LAB_00a320c0;
      }
      lVar3 = *(long *)group;
      c = ctx;
    }
    else {
      c = (BN_CTX *)0x0;
    }
    if (*(code **)(lVar3 + 0xe0) == (code *)0x0) {
      iVar1 = ossl_ec_wNAF_mul(group,r,n,q != (EC_POINT *)0x0 && m != (BIGNUM *)0x0,&pEStack_48,
                               &local_50,ctx);
    }
    else {
      iVar1 = (**(code **)(lVar3 + 0xe0))();
    }
    BN_CTX_free(c);
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x465,"EC_POINT_mul");
    uVar2 = 0x65;
LAB_00a320c0:
    ERR_set_error(0x10,uVar2,0);
    iVar1 = 0;
  }
  return iVar1;
}

