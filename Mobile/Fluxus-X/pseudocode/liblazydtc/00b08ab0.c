/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b08ab0
 */

stack_st_X509_ATTRIBUTE * ossl_x509at_dup(undefined8 param_1)

{
  int iVar1;
  X509_ATTRIBUTE *attr;
  stack_st_X509_ATTRIBUTE *psVar2;
  int iVar3;
  stack_st_X509_ATTRIBUTE *local_28;
  
  local_28 = (stack_st_X509_ATTRIBUTE *)0x0;
  iVar1 = OPENSSL_sk_num();
  if (iVar1 < 1) {
LAB_00b08b1c:
    local_28 = (stack_st_X509_ATTRIBUTE *)0x0;
  }
  else {
    iVar3 = 0;
    do {
      attr = (X509_ATTRIBUTE *)OPENSSL_sk_value(param_1,iVar3);
      psVar2 = X509at_add1_attr(&local_28,attr);
      if (psVar2 == (stack_st_X509_ATTRIBUTE *)0x0) {
        OPENSSL_sk_pop_free(local_28,X509_ATTRIBUTE_free);
        goto LAB_00b08b1c;
      }
      iVar3 = iVar3 + 1;
    } while (iVar3 < iVar1);
  }
  return local_28;
}

