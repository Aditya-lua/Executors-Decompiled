/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2eab4
 */

undefined8 ossl_ec_key_simple_generate_key(long param_1)

{
  uint uVar1;
  int iVar2;
  BN_CTX *ctx;
  BIGNUM *a;
  BIGNUM *r;
  BIGNUM *b;
  BIGNUM *n;
  undefined8 uVar3;
  EC_GROUP *group;
  EC_POINT *r_00;
  
  group = *(EC_GROUP **)(param_1 + 0x18);
  ctx = (BN_CTX *)BN_CTX_secure_new_ex(*(undefined8 *)(param_1 + 0x58));
  if (ctx == (BN_CTX *)0x0) {
    r = (BIGNUM *)0x0;
    r_00 = (EC_POINT *)0x0;
    n = (BIGNUM *)0x0;
  }
  else {
    n = *(BIGNUM **)(param_1 + 0x28);
    uVar1 = *(uint *)(param_1 + 0x3c);
    if ((n == (BIGNUM *)0x0) && (n = (BIGNUM *)BN_secure_new(), n == (BIGNUM *)0x0)) {
      r = (BIGNUM *)0x0;
    }
    else {
      a = (BIGNUM *)EC_GROUP_get0_order(group);
      if (a == (BIGNUM *)0x0) {
        r = (BIGNUM *)0x0;
        r_00 = (EC_POINT *)0x0;
        goto LAB_00a2ebe0;
      }
      if ((uVar1 >> 2 & 1) == 0) {
        r = BN_dup(a);
        if (r != (BIGNUM *)0x0) {
LAB_00a2eb5c:
          do {
            iVar2 = BN_priv_rand_range_ex(n,r,0,ctx);
            if (iVar2 == 0) goto LAB_00a2ebdc;
            iVar2 = BN_is_zero(n);
          } while (iVar2 != 0);
          r_00 = *(EC_POINT **)(param_1 + 0x20);
          if (((r_00 != (EC_POINT *)0x0) || (r_00 = EC_POINT_new(group), r_00 != (EC_POINT *)0x0))
             && (iVar2 = EC_POINT_mul(group,r_00,n,(EC_POINT *)0x0,(BIGNUM *)0x0,ctx), iVar2 != 0))
          {
            *(EC_POINT **)(param_1 + 0x20) = r_00;
            *(BIGNUM **)(param_1 + 0x28) = n;
            n = (BIGNUM *)0x0;
            r_00 = (EC_POINT *)0x0;
            *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + 1;
            uVar3 = 1;
            goto LAB_00a2ec08;
          }
          goto LAB_00a2ebe0;
        }
      }
      else {
        r = BN_new();
        if (r != (BIGNUM *)0x0) {
          b = BN_value_one();
          iVar2 = BN_sub(r,a,b);
          if (iVar2 != 0) goto LAB_00a2eb5c;
        }
      }
    }
LAB_00a2ebdc:
    r_00 = (EC_POINT *)0x0;
  }
LAB_00a2ebe0:
  ossl_set_error_state("Conditional_PCT");
  BN_clear(*(BIGNUM **)(param_1 + 0x28));
  if (*(EC_POINT **)(param_1 + 0x20) != (EC_POINT *)0x0) {
    EC_POINT_set_to_infinity(group,*(EC_POINT **)(param_1 + 0x20));
  }
  uVar3 = 0;
LAB_00a2ec08:
  EC_POINT_free(r_00);
  BN_clear_free(n);
  BN_CTX_free(ctx);
  BN_free(r);
  return uVar3;
}

