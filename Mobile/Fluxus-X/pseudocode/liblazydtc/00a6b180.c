/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6b180
 */

X509_ALGOR * PKCS5_pbe_set(int alg,int iter,uchar *salt,int saltlen)

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
    iVar1 = PKCS5_pbe_set0_algor_ex(a,alg,iter,salt,saltlen,0);
    if (iVar1 == 0) {
      X509_ALGOR_free(a);
      a = (X509_ALGOR *)0x0;
    }
  }
  return a;
}

