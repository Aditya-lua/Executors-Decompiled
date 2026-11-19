/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afd124
 */

ulong FUN_00afd124(BIO *param_1,int *param_2,int param_3)

{
  uint uVar1;
  ulong uVar2;
  GENERAL_NAME *pGVar3;
  undefined8 uVar4;
  int iVar5;
  stack_st_X509_NAME_ENTRY *local_58;
  
  if (*param_2 != 0) {
    local_58 = *(stack_st_X509_NAME_ENTRY **)(param_2 + 2);
    BIO_printf(param_1,"%*sRelative Name:\n%*s",param_3,"",param_3 + 2,"");
    X509_NAME_print_ex(param_1,(X509_NAME *)&local_58,0,0x82031f);
    uVar1 = BIO_puts(param_1,"\n");
    return (ulong)uVar1;
  }
  BIO_printf(param_1,"%*sFull Name:\n",param_3,"");
  uVar4 = *(undefined8 *)(param_2 + 2);
  uVar2 = OPENSSL_sk_num(uVar4);
  if (0 < (int)uVar2) {
    BIO_printf(param_1,"%*s",(ulong)(param_3 + 2U),&DAT_002ab32c);
    pGVar3 = (GENERAL_NAME *)OPENSSL_sk_value(uVar4,0);
    GENERAL_NAME_print(param_1,pGVar3);
    uVar2 = OPENSSL_sk_num(uVar4);
    if (1 < (int)uVar2) {
      iVar5 = 1;
      do {
        BIO_puts(param_1,"\n");
        BIO_printf(param_1,"%*s",(ulong)(param_3 + 2U),&DAT_002ab32c);
        pGVar3 = (GENERAL_NAME *)OPENSSL_sk_value(uVar4,iVar5);
        GENERAL_NAME_print(param_1,pGVar3);
        iVar5 = iVar5 + 1;
        uVar2 = OPENSSL_sk_num(uVar4);
      } while (iVar5 < (int)uVar2);
    }
  }
  return uVar2;
}

