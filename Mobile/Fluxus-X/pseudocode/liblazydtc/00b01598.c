/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b01598
 */

void X509V3_EXT_val_prn(BIO *out,stack_st_CONF_VALUE *val,int indent,int ml)

{
  char *pcVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  char *pcVar5;
  ulong uVar6;
  
  uVar6 = (ulong)(uint)indent;
  if (val == (stack_st_CONF_VALUE *)0x0) {
    return;
  }
  if ((ml == 0) || (iVar2 = OPENSSL_sk_num(val,val,uVar6), iVar2 == 0)) {
    BIO_printf(out,"%*s",uVar6,&DAT_002ab32c);
    iVar2 = OPENSSL_sk_num(val);
    if (iVar2 == 0) {
      BIO_puts(out,"<EMPTY>\n");
    }
  }
  iVar2 = OPENSSL_sk_num(val);
  if (iVar2 < 1) {
    return;
  }
  if (ml != 0) {
    BIO_printf(out,"%*s",uVar6,&DAT_002ab32c);
  }
  lVar4 = OPENSSL_sk_value(val,0);
  pcVar1 = *(char **)(lVar4 + 8);
  pcVar5 = *(char **)(lVar4 + 0x10);
  if (pcVar1 == (char *)0x0) {
LAB_00b01680:
    BIO_puts(out,pcVar5);
  }
  else {
    if (pcVar5 == (char *)0x0) {
      pcVar5 = pcVar1;
      goto LAB_00b01680;
    }
    BIO_printf(out,"%s:%s",pcVar1,pcVar5);
  }
  iVar2 = OPENSSL_sk_num(val);
  if (iVar2 < 2) {
    return;
  }
  if (ml == 0) {
    BIO_printf(out,", ");
  }
  else {
    BIO_printf(out,"\n");
    BIO_printf(out,"%*s",uVar6,&DAT_002ab32c);
  }
  lVar4 = OPENSSL_sk_value(val,1);
  pcVar1 = *(char **)(lVar4 + 8);
  pcVar5 = *(char **)(lVar4 + 0x10);
  if (pcVar1 != (char *)0x0) {
    if (pcVar5 != (char *)0x0) {
      BIO_printf(out,"%s:%s",pcVar1,pcVar5);
      goto LAB_00b0171c;
    }
    pcVar5 = pcVar1;
  }
  BIO_puts(out,pcVar5);
LAB_00b0171c:
  iVar2 = OPENSSL_sk_num(val);
  if (2 < iVar2) {
    iVar2 = 2;
    do {
      if (ml == 0) {
        BIO_printf(out,", ");
      }
      else {
        BIO_printf(out,"\n");
        BIO_printf(out,"%*s",uVar6,&DAT_002ab32c);
      }
      lVar4 = OPENSSL_sk_value(val,iVar2);
      pcVar1 = *(char **)(lVar4 + 8);
      pcVar5 = *(char **)(lVar4 + 0x10);
      if (pcVar1 == (char *)0x0) {
LAB_00b017c8:
        BIO_puts(out,pcVar5);
      }
      else {
        if (pcVar5 == (char *)0x0) {
          pcVar5 = pcVar1;
          goto LAB_00b017c8;
        }
        BIO_printf(out,"%s:%s",pcVar1,pcVar5);
      }
      iVar2 = iVar2 + 1;
      iVar3 = OPENSSL_sk_num(val);
    } while (iVar2 < iVar3);
  }
  return;
}

