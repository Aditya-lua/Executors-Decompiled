/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad31c0
 */

undefined8 ossl_rsa_multip_calc_product(long param_1)

{
  int iVar1;
  int iVar2;
  BN_CTX *ctx;
  undefined8 *puVar3;
  BIGNUM *r;
  undefined8 uVar4;
  int iVar5;
  BIGNUM *a;
  BIGNUM *b;
  long *plVar6;
  
  iVar1 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x88));
  if (iVar1 < 1) {
    ctx = (BN_CTX *)0x0;
  }
  else {
    ctx = BN_CTX_new();
    if (ctx != (BN_CTX *)0x0) {
      iVar5 = 0;
      puVar3 = (undefined8 *)(param_1 + 0x48);
      plVar6 = (long *)(param_1 + 0x40);
      do {
        a = (BIGNUM *)*plVar6;
        b = (BIGNUM *)*puVar3;
        puVar3 = (undefined8 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x88),iVar5);
        plVar6 = puVar3 + 3;
        r = (BIGNUM *)*plVar6;
        if (r == (BIGNUM *)0x0) {
          r = (BIGNUM *)BN_secure_new();
          *plVar6 = (long)r;
          if (r == (BIGNUM *)0x0) goto LAB_00ad3264;
        }
        iVar2 = BN_mul(r,a,b,ctx);
        if (iVar2 == 0) goto LAB_00ad3264;
        iVar5 = iVar5 + 1;
      } while (iVar5 < iVar1);
      uVar4 = 1;
      goto LAB_00ad3268;
    }
  }
LAB_00ad3264:
  uVar4 = 0;
LAB_00ad3268:
  BN_CTX_free(ctx);
  return uVar4;
}

