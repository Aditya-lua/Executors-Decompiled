/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afc06c
 */

undefined8 FUN_00afc06c(undefined8 param_1,undefined8 *param_2,BIO *param_3,int param_4)

{
  int iVar1;
  int iVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  
  iVar1 = BIO_printf(param_3,"%*sIssuer: ",param_4,"");
  if ((iVar1 < 1) ||
     (iVar1 = X509_NAME_print_ex(param_3,(X509_NAME *)*param_2,0,0x82031f), iVar1 < 1)) {
LAB_00afc188:
    uVar4 = 0;
  }
  else {
    iVar1 = OPENSSL_sk_num(param_2[1]);
    if (0 < iVar1) {
      iVar1 = 0;
      do {
        puVar3 = (undefined8 *)OPENSSL_sk_value(param_2[1],iVar1);
        iVar2 = BIO_printf(param_3,"\n%*s",(ulong)(uint)(param_4 << 1),&DAT_002ab32c);
        if ((((iVar2 < 1) || (iVar2 = i2a_ASN1_OBJECT(param_3,(ASN1_OBJECT *)*puVar3), iVar2 < 1))
            || (iVar2 = BIO_puts(param_3," - "), iVar2 < 1)) ||
           (iVar2 = GENERAL_NAME_print(param_3,(GENERAL_NAME *)puVar3[1]), iVar2 < 1))
        goto LAB_00afc188;
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(param_2[1]);
      } while (iVar1 < iVar2);
    }
    uVar4 = 1;
  }
  return uVar4;
}

