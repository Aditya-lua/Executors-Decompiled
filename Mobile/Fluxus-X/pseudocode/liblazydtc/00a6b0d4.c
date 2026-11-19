/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6b0d4
 */

X509_ALGOR *
PKCS5_pbe_set_ex(undefined4 param_1,undefined4 param_2,undefined8 param_3,undefined4 param_4,
                undefined8 param_5)

{
  int iVar1;
  X509_ALGOR *a;
  
  a = X509_ALGOR_new();
  if (a == (X509_ALGOR *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/p5_pbe.c",0x61,"PKCS5_pbe_set_ex");
    ERR_set_error(0xd,0xc0100,0);
  }
  else {
    iVar1 = PKCS5_pbe_set0_algor_ex(a,param_1,param_2,param_3,param_4,param_5);
    if (iVar1 == 0) {
      X509_ALGOR_free(a);
      a = (X509_ALGOR *)0x0;
    }
  }
  return a;
}

