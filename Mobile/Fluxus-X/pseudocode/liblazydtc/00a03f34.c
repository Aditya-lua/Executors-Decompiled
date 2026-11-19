/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a03f34
 */

BIGNUM * BN_CTX_get(BN_CTX *ctx)

{
  uint uVar1;
  BIGNUM *pBVar2;
  ulong *puVar3;
  BN_CTX *pBVar4;
  long lVar5;
  ulong uVar6;
  
  if (*(int *)(ctx + 0x34) != 0) {
    return (BIGNUM *)0x0;
  }
  if (*(int *)(ctx + 0x38) != 0) {
    return (BIGNUM *)0x0;
  }
  uVar1 = *(uint *)(ctx + 0x18);
  if (uVar1 == *(uint *)(ctx + 0x1c)) {
    uVar1 = *(uint *)(ctx + 0x3c);
    pBVar2 = CRYPTO_malloc(400,"crypto/bn/bn_ctx.c",0x145);
    if (pBVar2 == (BIGNUM *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/bn/bn_ctx.c",0x146,"BN_POOL_get");
      ERR_set_error(3,0xc0100,0);
      goto LAB_00a0407c;
    }
    bn_init();
    if ((uVar1 >> 3 & 1) == 0) {
      bn_init(pBVar2 + 1);
      bn_init(pBVar2 + 2);
      bn_init(pBVar2 + 3);
      bn_init(pBVar2 + 4);
      bn_init(pBVar2 + 5);
      bn_init(pBVar2 + 6);
      bn_init(pBVar2 + 7);
      bn_init(pBVar2 + 8);
      bn_init(pBVar2 + 9);
      bn_init(pBVar2 + 10);
      bn_init(pBVar2 + 0xb);
      bn_init(pBVar2 + 0xc);
      bn_init(pBVar2 + 0xd);
      bn_init(pBVar2 + 0xe);
      bn_init(pBVar2 + 0xf);
    }
    else {
      BN_set_flags(pBVar2,8);
      bn_init(pBVar2 + 1);
      BN_set_flags(pBVar2 + 1,8);
      bn_init(pBVar2 + 2);
      BN_set_flags(pBVar2 + 2,8);
      bn_init(pBVar2 + 3);
      BN_set_flags(pBVar2 + 3,8);
      bn_init(pBVar2 + 4);
      BN_set_flags(pBVar2 + 4,8);
      bn_init(pBVar2 + 5);
      BN_set_flags(pBVar2 + 5,8);
      bn_init(pBVar2 + 6);
      BN_set_flags(pBVar2 + 6,8);
      bn_init(pBVar2 + 7);
      BN_set_flags(pBVar2 + 7,8);
      bn_init(pBVar2 + 8);
      BN_set_flags(pBVar2 + 8,8);
      bn_init(pBVar2 + 9);
      BN_set_flags(pBVar2 + 9,8);
      bn_init(pBVar2 + 10);
      BN_set_flags(pBVar2 + 10,8);
      bn_init(pBVar2 + 0xb);
      BN_set_flags(pBVar2 + 0xb,8);
      bn_init(pBVar2 + 0xc);
      BN_set_flags(pBVar2 + 0xc,8);
      bn_init(pBVar2 + 0xd);
      BN_set_flags(pBVar2 + 0xd,8);
      bn_init(pBVar2 + 0xe);
      BN_set_flags(pBVar2 + 0xe,8);
      bn_init(pBVar2 + 0xf);
      BN_set_flags(pBVar2 + 0xf,8);
    }
    puVar3 = *(ulong **)(ctx + 0x10);
    pBVar2[0x10].d = puVar3;
    pBVar2[0x10].top = 0;
    pBVar2[0x10].dmax = 0;
    if (*(long *)ctx == 0) {
      *(BIGNUM **)(ctx + 8) = pBVar2;
      *(BIGNUM **)(ctx + 0x10) = pBVar2;
      pBVar4 = ctx;
    }
    else {
      puVar3[0x31] = (ulong)pBVar2;
      *(BIGNUM **)(ctx + 0x10) = pBVar2;
      pBVar4 = ctx + 8;
    }
    *(BIGNUM **)pBVar4 = pBVar2;
    *(ulong *)(ctx + 0x18) =
         CONCAT44((int)((ulong)*(undefined8 *)(ctx + 0x18) >> 0x20) + 0x10,
                  (int)*(undefined8 *)(ctx + 0x18) + 1);
    goto LAB_00a0426c;
  }
  if (uVar1 == 0) {
    lVar5 = *(long *)ctx;
LAB_00a04060:
    uVar6 = 0;
    *(long *)(ctx + 8) = lVar5;
  }
  else {
    lVar5 = *(long *)(ctx + 8);
    uVar6 = (ulong)(uVar1 & 0xf);
    if ((uVar1 & 0xf) == 0) {
      lVar5 = *(long *)(lVar5 + 0x188);
      goto LAB_00a04060;
    }
  }
  pBVar2 = (BIGNUM *)(lVar5 + uVar6 * 0x18);
  *(uint *)(ctx + 0x18) = uVar1 + 1;
  if (pBVar2 == (BIGNUM *)0x0) {
LAB_00a0407c:
    *(undefined4 *)(ctx + 0x38) = 1;
    ERR_new();
    ERR_set_debug("crypto/bn/bn_ctx.c",0xe3,"BN_CTX_get");
    ERR_set_error(3,0x6d,0);
    return (BIGNUM *)0x0;
  }
LAB_00a0426c:
  BN_zero_ex(pBVar2);
  pBVar2->flags = pBVar2->flags & 0xfffffffb;
  *(int *)(ctx + 0x30) = *(int *)(ctx + 0x30) + 1;
  return pBVar2;
}

