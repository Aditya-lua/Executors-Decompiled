/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a31614
 */

int EC_POINT_set_Jprojective_coordinates_GFp
              (EC_GROUP *group,EC_POINT *p,BIGNUM *x,BIGNUM *y,BIGNUM *z,BN_CTX *ctx)

{
  int iVar1;
  undefined8 uVar2;
  
  if (*(int *)(*(long *)group + 4) == 0x196) {
    if (*(long *)group == *(long *)p) {
      if (((*(int *)(group + 0x20) == 0) || (*(int *)(p + 8) == 0)) ||
         (*(int *)(group + 0x20) == *(int *)(p + 8))) {
        iVar1 = ossl_ec_GFp_simple_set_Jprojective_coordinates_GFp();
        return iVar1;
      }
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x343,"EC_POINT_set_Jprojective_coordinates_GFp");
    uVar2 = 0x65;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x33f,"EC_POINT_set_Jprojective_coordinates_GFp");
    uVar2 = 0xc0101;
  }
  ERR_set_error(0x10,uVar2,0);
  return 0;
}

