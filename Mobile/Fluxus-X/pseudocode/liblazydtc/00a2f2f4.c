/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f2f4
 */

int EC_KEY_set_public_key_affine_coordinates(EC_KEY *key,BIGNUM *x,BIGNUM *y)

{
  int iVar1;
  BN_CTX *ctx;
  EC_POINT *src;
  BIGNUM *b;
  BIGNUM *b_00;
  EC_POINT *pEVar2;
  uint uVar3;
  
  if ((((key == (EC_KEY *)0x0) || (y == (BIGNUM *)0x0)) || (x == (BIGNUM *)0x0)) ||
     (*(long *)(key + 0x18) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_key.c",0x25f,"EC_KEY_set_public_key_affine_coordinates");
    ERR_set_error(0x10,0xc0102,0);
    return 0;
  }
  ctx = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(key + 0x58));
  if (ctx == (BN_CTX *)0x0) {
    return 0;
  }
  BN_CTX_start(ctx);
  src = EC_POINT_new(*(EC_GROUP **)(key + 0x18));
  if (src != (EC_POINT *)0x0) {
    b = BN_CTX_get(ctx);
    b_00 = BN_CTX_get(ctx);
    if (((b_00 != (BIGNUM *)0x0) &&
        (iVar1 = EC_POINT_set_affine_coordinates(*(undefined8 *)(key + 0x18),src,x,y,ctx),
        iVar1 != 0)) &&
       (iVar1 = EC_POINT_get_affine_coordinates(*(undefined8 *)(key + 0x18),src,b,b_00,ctx),
       iVar1 != 0)) {
      iVar1 = BN_cmp(x,b);
      if ((iVar1 == 0) && (iVar1 = BN_cmp(y,b_00), iVar1 == 0)) {
        if ((*(code **)(*(long *)key + 0x38) == (code *)0x0) ||
           (iVar1 = (**(code **)(*(long *)key + 0x38))(key,src), iVar1 != 0)) {
          EC_POINT_free(*(EC_POINT **)(key + 0x20));
          pEVar2 = EC_POINT_dup(src,*(EC_GROUP **)(key + 0x18));
          *(EC_POINT **)(key + 0x20) = pEVar2;
          *(long *)(key + 0x68) = *(long *)(key + 0x68) + 1;
          if (pEVar2 != (EC_POINT *)0x0) {
            iVar1 = EC_KEY_check_key(key);
            uVar3 = (uint)(iVar1 != 0);
            goto LAB_00a2f3f4;
          }
        }
      }
      else {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_key.c",0x27b,"EC_KEY_set_public_key_affine_coordinates");
        ERR_set_error(0x10,0x92,0);
      }
    }
  }
  uVar3 = 0;
LAB_00a2f3f4:
  BN_CTX_end(ctx);
  BN_CTX_free(ctx);
  EC_POINT_free(src);
  return uVar3;
}

