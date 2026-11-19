/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b067e8
 */

stack_st_OPENSSL_STRING * X509_get1_ocsp(X509 *x)

{
  int iVar1;
  int iVar2;
  AUTHORITY_INFO_ACCESS *a;
  undefined8 *puVar3;
  stack_st_OPENSSL_STRING *psVar4;
  stack_st_OPENSSL_STRING *local_28;
  
  local_28 = (stack_st_OPENSSL_STRING *)0x0;
  a = X509_get_ext_d2i(x,0xb1,(int *)0x0,(int *)0x0);
  if (a == (AUTHORITY_INFO_ACCESS *)0x0) {
    psVar4 = (stack_st_OPENSSL_STRING *)0x0;
  }
  else {
    iVar1 = OPENSSL_sk_num();
    if (iVar1 < 1) {
      psVar4 = (stack_st_OPENSSL_STRING *)0x0;
    }
    else {
      iVar1 = 0;
      do {
        puVar3 = (undefined8 *)OPENSSL_sk_value(a,iVar1);
        iVar2 = OBJ_obj2nid((ASN1_OBJECT *)*puVar3);
        if (((iVar2 == 0xb2) && (*(int *)puVar3[1] == 6)) &&
           (iVar2 = FUN_00b068a8(&local_28,*(undefined8 *)((int *)puVar3[1] + 2)), iVar2 == 0))
        break;
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(a);
      } while (iVar1 < iVar2);
      psVar4 = local_28;
    }
    AUTHORITY_INFO_ACCESS_free(a);
  }
  return psVar4;
}

