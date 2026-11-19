/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a31eac
 */

int EC_POINTs_mul(EC_GROUP *group,EC_POINT *r,BIGNUM *n,size_t num,EC_POINT **p,BIGNUM **m,
                 BN_CTX *ctx)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  code *pcVar5;
  ulong uVar6;
  BN_CTX *c;
  
  lVar4 = *(long *)group;
  if ((lVar4 == *(long *)r) &&
     (((iVar2 = *(int *)(group + 0x20), iVar2 == 0 || (*(int *)(r + 8) == 0)) ||
      (iVar2 == *(int *)(r + 8))))) {
    if ((n == (BIGNUM *)0x0) && (num == 0)) {
      iVar2 = EC_POINT_set_to_infinity(group,r);
      return iVar2;
    }
    if (num != 0) {
      uVar6 = 0;
      do {
        if ((lVar4 != *(long *)p[uVar6]) ||
           (((iVar2 != 0 && (iVar1 = *(int *)(p[uVar6] + 8), iVar1 != 0)) && (iVar2 != iVar1)))) {
          ERR_new();
          uVar3 = 0x43f;
          goto LAB_00a31eec;
        }
        uVar6 = uVar6 + 1;
      } while (uVar6 < num);
    }
    if (ctx == (BN_CTX *)0x0) {
      c = (BN_CTX *)BN_CTX_secure_new();
      if (c == (BN_CTX *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_lib.c",0x449,"EC_POINTs_mul");
        uVar3 = 0xc0103;
        goto LAB_00a31ef8;
      }
      pcVar5 = *(code **)(*(long *)group + 0xe0);
      ctx = c;
    }
    else {
      c = (BN_CTX *)0x0;
      pcVar5 = *(code **)(lVar4 + 0xe0);
    }
    if (pcVar5 == (code *)0x0) {
      iVar2 = ossl_ec_wNAF_mul(group,r,n,num,p,m,ctx);
    }
    else {
      iVar2 = (*pcVar5)(group,r,n,num,p,m);
    }
    BN_CTX_free(c);
  }
  else {
    ERR_new();
    uVar3 = 0x436;
LAB_00a31eec:
    ERR_set_debug("crypto/ec/ec_lib.c",uVar3,"EC_POINTs_mul");
    uVar3 = 0x65;
LAB_00a31ef8:
    ERR_set_error(0x10,uVar3,0);
    iVar2 = 0;
  }
  return iVar2;
}

