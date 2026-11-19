/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a34d10
 */

size_t EC_POINT_point2buf(EC_GROUP *param_1,EC_POINT *param_2,point_conversion_form_t param_3,
                         undefined8 *param_4,BN_CTX *param_5)

{
  size_t sVar1;
  uchar *buf;
  
  sVar1 = EC_POINT_point2oct(param_1,param_2,param_3,(uchar *)0x0,0,(BN_CTX *)0x0);
  if (sVar1 != 0) {
    buf = CRYPTO_malloc((int)sVar1,"crypto/ec/ec_oct.c",0x8f);
    if (buf == (uchar *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_oct.c",0x90,"EC_POINT_point2buf");
      ERR_set_error(0x10,0xc0100,0);
    }
    else {
      sVar1 = EC_POINT_point2oct(param_1,param_2,param_3,buf,sVar1,param_5);
      if (sVar1 != 0) {
        *param_4 = buf;
        return sVar1;
      }
      CRYPTO_free(buf);
    }
  }
  return 0;
}

