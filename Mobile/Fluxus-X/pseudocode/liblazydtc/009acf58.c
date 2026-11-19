/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009acf58
 */

undefined8 SSL_add1_to_CA_list(long param_1,X509 *param_2)

{
  int iVar1;
  long lVar2;
  X509_NAME *pXVar3;
  
  if (param_2 != (X509 *)0x0) {
    if (*(long *)(param_1 + 0x9d0) == 0) {
      lVar2 = OPENSSL_sk_new_null();
      *(long *)(param_1 + 0x9d0) = lVar2;
      if (lVar2 == 0) {
        return 0;
      }
    }
    pXVar3 = X509_get_subject_name(param_2);
    pXVar3 = X509_NAME_dup(pXVar3);
    if (pXVar3 == (X509_NAME *)0x0) {
      return 0;
    }
    iVar1 = OPENSSL_sk_push(*(undefined8 *)(param_1 + 0x9d0),pXVar3);
    if (iVar1 != 0) {
      return 1;
    }
    X509_NAME_free(pXVar3);
  }
  return 0;
}

