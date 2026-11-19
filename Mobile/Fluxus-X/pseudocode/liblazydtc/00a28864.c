/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a28864
 */

EC_GROUP * EC_GROUP_new_curve_GFp(BIGNUM *p,BIGNUM *a,BIGNUM *b,BN_CTX *ctx)

{
  int iVar1;
  long lVar2;
  EC_METHOD *pEVar3;
  undefined8 uVar4;
  EC_GROUP *group;
  
  lVar2 = BN_nist_mod_func();
  if (lVar2 == 0) {
    pEVar3 = EC_GFp_mont_method();
  }
  else {
    pEVar3 = EC_GFp_nist_method();
  }
  uVar4 = ossl_bn_get_libctx(ctx);
  group = (EC_GROUP *)ossl_ec_group_new_ex(uVar4,0,pEVar3);
  if ((group != (EC_GROUP *)0x0) && (iVar1 = EC_GROUP_set_curve(group,p,a,b,ctx), iVar1 == 0)) {
    EC_GROUP_free(group);
    group = (EC_GROUP *)0x0;
  }
  return group;
}

