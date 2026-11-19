/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a35c90
 */

undefined8
ossl_ecdsa_sign(undefined8 param_1,uchar *param_2,int param_3,uchar *param_4,int *param_5,
               BIGNUM *param_6,BIGNUM *param_7,EC_KEY *param_8)

{
  uchar **pp;
  int iVar1;
  ECDSA_SIG *sig;
  uchar *local_28;
  
  local_28 = param_4;
  if ((param_4 == (uchar *)0x0) && ((param_6 == (BIGNUM *)0x0 || (param_7 == (BIGNUM *)0x0)))) {
    iVar1 = ECDSA_size(param_8);
    *param_5 = iVar1;
  }
  else {
    sig = ECDSA_do_sign_ex(param_2,param_3,param_6,param_7,param_8);
    if (sig == (ECDSA_SIG *)0x0) {
      *param_5 = 0;
      return 0;
    }
    pp = (uchar **)0x0;
    if (param_4 != (uchar *)0x0) {
      pp = &local_28;
    }
    iVar1 = i2d_ECDSA_SIG(sig,pp);
    *param_5 = iVar1;
    ECDSA_SIG_free(sig);
  }
  return 1;
}

