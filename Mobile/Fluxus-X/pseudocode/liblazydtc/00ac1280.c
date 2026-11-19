/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac1280
 */

int PKCS7_set_signed_attributes(PKCS7_SIGNER_INFO *p7si,stack_st_X509_ATTRIBUTE *sk)

{
  int iVar1;
  int iVar2;
  stack_st_X509_ATTRIBUTE *psVar3;
  X509_ATTRIBUTE *pXVar4;
  long lVar5;
  
  OPENSSL_sk_pop_free(p7si->auth_attr,X509_ATTRIBUTE_free);
  psVar3 = (stack_st_X509_ATTRIBUTE *)OPENSSL_sk_dup(sk);
  p7si->auth_attr = psVar3;
  iVar1 = 0;
  if (psVar3 != (stack_st_X509_ATTRIBUTE *)0x0) {
    iVar1 = OPENSSL_sk_num(sk);
    if (0 < iVar1) {
      iVar1 = 0;
      do {
        psVar3 = p7si->auth_attr;
        pXVar4 = (X509_ATTRIBUTE *)OPENSSL_sk_value(sk,iVar1);
        pXVar4 = X509_ATTRIBUTE_dup(pXVar4);
        lVar5 = OPENSSL_sk_set(psVar3,iVar1,pXVar4);
        if (lVar5 == 0) {
          return 0;
        }
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(sk);
      } while (iVar1 < iVar2);
    }
    iVar1 = 1;
  }
  return iVar1;
}

