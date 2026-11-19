/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a27c94
 */

int EC_GROUP_check(EC_GROUP *group,BN_CTX *ctx)

{
  int iVar1;
  EC_POINT *r;
  BIGNUM *n;
  undefined8 uVar2;
  BN_CTX *c;
  
  if ((group == (EC_GROUP *)0x0) || (*(byte **)group == (byte *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_check.c",0x3d,"EC_GROUP_check");
    ERR_set_error(0x10,0xc0102,0);
    return 0;
  }
  if ((**(byte **)group >> 1 & 1) != 0) {
    return 1;
  }
  c = (BN_CTX *)0x0;
  if ((ctx == (BN_CTX *)0x0) && (c = BN_CTX_new(), ctx = c, c == (BN_CTX *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_check.c",0x48,"EC_GROUP_check");
    uVar2 = 0xc0100;
  }
  else {
    iVar1 = EC_GROUP_check_discriminant(group,ctx);
    if (iVar1 == 0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_check.c",0x4f,"EC_GROUP_check");
      uVar2 = 0x76;
    }
    else if (*(EC_POINT **)(group + 8) == (EC_POINT *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_check.c",0x55,"EC_GROUP_check");
      uVar2 = 0x71;
    }
    else {
      iVar1 = EC_POINT_is_on_curve(group,*(EC_POINT **)(group + 8),ctx);
      if (0 < iVar1) {
        r = EC_POINT_new(group);
        if ((r != (EC_POINT *)0x0) && (n = (BIGNUM *)EC_GROUP_get0_order(group), n != (BIGNUM *)0x0)
           ) {
          iVar1 = BN_is_zero();
          if (iVar1 == 0) {
            iVar1 = EC_POINT_mul(group,r,n,(EC_POINT *)0x0,(BIGNUM *)0x0,ctx);
            if (iVar1 == 0) goto LAB_00a27d5c;
            iVar1 = EC_POINT_is_at_infinity(group,r);
            if (iVar1 != 0) {
              iVar1 = 1;
              goto LAB_00a27e58;
            }
            ERR_new();
            ERR_set_debug("crypto/ec/ec_check.c",0x6b,"EC_GROUP_check");
            uVar2 = 0x7a;
          }
          else {
            ERR_new();
            ERR_set_debug("crypto/ec/ec_check.c",100,"EC_GROUP_check");
            uVar2 = 0x80;
          }
          ERR_set_error(0x10,uVar2,0);
        }
LAB_00a27d5c:
        iVar1 = 0;
        goto LAB_00a27e58;
      }
      ERR_new();
      ERR_set_debug("crypto/ec/ec_check.c",0x59,"EC_GROUP_check");
      uVar2 = 0x6b;
    }
  }
  ERR_set_error(0x10,uVar2,0);
  iVar1 = 0;
  r = (EC_POINT *)0x0;
LAB_00a27e58:
  BN_CTX_free(c);
  EC_POINT_free(r);
  return iVar1;
}

