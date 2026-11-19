/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acf8a8
 */

bool ossl_rsa_is_foreign(RSA *param_1)

{
  RSA_METHOD *pRVar1;
  RSA_METHOD *pRVar2;
  
  if (param_1->n == (BIGNUM *)0x0) {
    pRVar1 = RSA_get_method(param_1);
    pRVar2 = (RSA_METHOD *)RSA_PKCS1_OpenSSL();
    return pRVar1 != pRVar2;
  }
  return true;
}

