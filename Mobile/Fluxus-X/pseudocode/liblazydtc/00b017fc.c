/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b017fc
 */

int X509V3_EXT_print(BIO *out,X509_EXTENSION *ext,ulong flag,int indent)

{
  int iVar1;
  ASN1_OCTET_STRING *x;
  uchar *pp;
  X509V3_EXT_METHOD *method;
  ASN1_ITEM *pAVar2;
  ASN1_VALUE *val;
  char *pcVar3;
  uint uVar4;
  int iVar5;
  stack_st_CONF_VALUE *val_00;
  uchar *local_48;
  
  x = X509_EXTENSION_get_data(ext);
  pp = (uchar *)ASN1_STRING_get0_data();
  local_48 = pp;
  iVar1 = ASN1_STRING_length(x);
  method = X509V3_EXT_get(ext);
  if (method == (X509V3_EXT_METHOD *)0x0) {
    iVar5 = 0;
    switch(flag >> 0x10 & 0xf) {
    case 0:
      goto switchD_00b0193c_caseD_0;
    case 1:
      pcVar3 = "%*s<Not Supported>";
      break;
    case 2:
LAB_00b01a0c:
      iVar1 = ASN1_parse_dump(out,pp,(long)iVar1,indent,-1);
      return iVar1;
    case 3:
LAB_00b01a20:
      iVar1 = BIO_dump_indent(out,(char *)pp,iVar1,indent);
      return iVar1;
    default:
switchD_00b0193c_default:
      iVar5 = 1;
      goto switchD_00b0193c_caseD_0;
    }
  }
  else {
    if (method->it == (ASN1_ITEM_EXP *)0x0) {
      val = (*method->d2i)((void *)0x0,&local_48,(long)iVar1);
      pp = local_48;
    }
    else {
      pAVar2 = (ASN1_ITEM *)(*(code *)method->it)();
      val = ASN1_item_d2i((ASN1_VALUE **)0x0,&local_48,(long)iVar1,pAVar2);
      pp = local_48;
    }
    local_48 = pp;
    if (val != (ASN1_VALUE *)0x0) {
      if (method->i2s == (X509V3_EXT_I2S)0x0) {
        if (method->i2v == (X509V3_EXT_I2V)0x0) {
          if (method->i2r != (X509V3_EXT_I2R)0x0) {
            iVar1 = (*method->i2r)(method,val,out,indent);
            pcVar3 = (char *)0x0;
            val_00 = (stack_st_CONF_VALUE *)0x0;
            uVar4 = (uint)(iVar1 != 0);
            goto LAB_00b01a48;
          }
          pcVar3 = (char *)0x0;
          goto LAB_00b01a40;
        }
        val_00 = (*method->i2v)(method,val,(stack_st_CONF_VALUE *)0x0);
        if (val_00 != (stack_st_CONF_VALUE *)0x0) {
          X509V3_EXT_val_prn(out,val_00,indent,method->ext_flags & 4);
          pcVar3 = (char *)0x0;
          uVar4 = 1;
          goto LAB_00b01a48;
        }
        pcVar3 = (char *)0x0;
      }
      else {
        pcVar3 = (*method->i2s)(method,val);
        if (pcVar3 != (char *)0x0) {
          BIO_printf(out,"%*s%s",indent,"",pcVar3);
          val_00 = (stack_st_CONF_VALUE *)0x0;
          uVar4 = 1;
          goto LAB_00b01a48;
        }
LAB_00b01a40:
        val_00 = (stack_st_CONF_VALUE *)0x0;
      }
      uVar4 = 0;
LAB_00b01a48:
      OPENSSL_sk_pop_free(val_00,X509V3_conf_free);
      CRYPTO_free(pcVar3);
      if (method->it == (ASN1_ITEM_EXP *)0x0) {
        (*method->ext_free)(val);
        return uVar4;
      }
      pAVar2 = (ASN1_ITEM *)(*(code *)method->it)();
      ASN1_item_free(val,pAVar2);
      return uVar4;
    }
    iVar5 = 0;
    switch(flag >> 0x10 & 0xf) {
    case 0:
      goto switchD_00b0193c_caseD_0;
    case 1:
      pcVar3 = "%*s<Parse Error>";
      break;
    case 2:
      goto LAB_00b01a0c;
    case 3:
      goto LAB_00b01a20;
    default:
      goto switchD_00b0193c_default;
    }
  }
  BIO_printf(out,pcVar3,(ulong)(uint)indent,&DAT_002ab32c);
  iVar5 = 1;
switchD_00b0193c_caseD_0:
  return iVar5;
}

