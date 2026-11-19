/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afba58
 */

void FUN_00afba58(BIO *param_1,undefined8 param_2,uint param_3)

{
  uint param2;
  uint uVar1;
  uint uVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  undefined8 *puVar6;
  ASN1_INTEGER *aint;
  char *pcVar7;
  undefined8 uVar8;
  uint *puVar9;
  undefined8 *puVar10;
  
  iVar3 = OPENSSL_sk_num(param_2);
  if (0 < iVar3) {
    iVar3 = 0;
    param2 = param_3 + 2;
    do {
      if (iVar3 != 0) {
        BIO_puts(param_1,"\n");
      }
      puVar6 = (undefined8 *)OPENSSL_sk_value(param_2,iVar3);
      iVar4 = OBJ_obj2nid((ASN1_OBJECT *)*puVar6);
      if (iVar4 == 0xa5) {
        BIO_printf(param_1,"%*sUser Notice:\n",param_3,"");
        puVar6 = (undefined8 *)puVar6[1];
        puVar10 = (undefined8 *)*puVar6;
        if (puVar10 == (undefined8 *)0x0) {
          puVar9 = (uint *)puVar6[1];
        }
        else {
          BIO_printf(param_1,"%*sOrganization: %.*s\n",param2,"",*(int *)*puVar10,
                     *(char **)((int *)*puVar10 + 2));
          iVar4 = OPENSSL_sk_num(puVar10[1]);
          pcVar7 = "s";
          if (iVar4 < 2) {
            pcVar7 = "";
          }
          BIO_printf(param_1,"%*sNumber%s: ",param2,"",pcVar7);
          iVar4 = OPENSSL_sk_num(puVar10[1]);
          if (0 < iVar4) {
            iVar4 = 0;
            do {
              aint = (ASN1_INTEGER *)OPENSSL_sk_value(puVar10[1],iVar4);
              if (iVar4 != 0) {
                BIO_puts(param_1,", ");
              }
              if (aint == (ASN1_INTEGER *)0x0) {
                BIO_puts(param_1,"(null)");
              }
              else {
                pcVar7 = i2s_ASN1_INTEGER((X509V3_EXT_METHOD *)0x0,aint);
                if (pcVar7 == (char *)0x0) goto LAB_00afbc90;
                BIO_puts(param_1,pcVar7);
                CRYPTO_free(pcVar7);
              }
              iVar4 = iVar4 + 1;
              iVar5 = OPENSSL_sk_num(puVar10[1]);
            } while (iVar4 < iVar5);
          }
          if (puVar6[1] == 0) goto LAB_00afbc90;
          BIO_puts(param_1,"\n");
          puVar9 = (uint *)puVar6[1];
        }
        if (puVar9 != (uint *)0x0) {
          uVar1 = *puVar9;
          uVar8 = *(undefined8 *)(puVar9 + 2);
          pcVar7 = "%*sExplicit Text: %.*s";
          uVar2 = param2;
          goto LAB_00afbc88;
        }
      }
      else if (iVar4 == 0xa4) {
        uVar1 = *(uint *)puVar6[1];
        uVar8 = *(undefined8 *)((uint *)puVar6[1] + 2);
        pcVar7 = "%*sCPS: %.*s";
        uVar2 = param_3;
LAB_00afbc88:
        BIO_printf(param_1,pcVar7,(ulong)uVar2,&DAT_002ab32c,(ulong)uVar1,uVar8);
      }
      else {
        BIO_printf(param_1,"%*sUnknown Qualifier: ",param2,"");
        i2a_ASN1_OBJECT(param_1,(ASN1_OBJECT *)*puVar6);
      }
LAB_00afbc90:
      iVar3 = iVar3 + 1;
      iVar4 = OPENSSL_sk_num(param_2);
    } while (iVar3 < iVar4);
  }
  return;
}

