/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b095cc
 */

X509 * X509_find_by_issuer_and_serial(stack_st_X509 *sk,X509_NAME *name,ASN1_INTEGER *serial)

{
  int iVar1;
  int iVar2;
  X509 *pXVar3;
  ASN1_INTEGER local_1b8;
  X509_NAME *local_190;
  
  if (sk != (stack_st_X509 *)0x0) {
    local_1b8.flags = serial->flags;
    local_1b8.data = serial->data;
    local_1b8.length = serial->length;
    local_1b8.type = serial->type;
    local_190 = name;
    iVar1 = OPENSSL_sk_num();
    if (0 < iVar1) {
      iVar1 = 0;
      do {
        pXVar3 = (X509 *)OPENSSL_sk_value(sk,iVar1);
        if (((pXVar3 != (X509 *)0x0) &&
            (iVar2 = ASN1_INTEGER_cmp((ASN1_INTEGER *)&pXVar3->sig_alg,&local_1b8), iVar2 == 0)) &&
           (iVar2 = X509_NAME_cmp(*(X509_NAME **)&(pXVar3->ex_data).dummy,local_190), iVar2 == 0)) {
          return pXVar3;
        }
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(sk);
      } while (iVar1 < iVar2);
    }
  }
  return (X509 *)0x0;
}

