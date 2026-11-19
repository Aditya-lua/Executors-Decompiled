/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14490
 */

int X509_VERIFY_PARAM_add0_policy(X509_VERIFY_PARAM *param,ASN1_OBJECT *policy)

{
  int iVar1;
  stack_st_ASN1_OBJECT *psVar2;
  
  psVar2 = param->policies;
  if (psVar2 == (stack_st_ASN1_OBJECT *)0x0) {
    psVar2 = (stack_st_ASN1_OBJECT *)OPENSSL_sk_new_null();
    param->policies = psVar2;
    if (psVar2 == (stack_st_ASN1_OBJECT *)0x0) {
      return 0;
    }
  }
  iVar1 = OPENSSL_sk_push(psVar2,policy);
  return (uint)(0 < iVar1);
}

