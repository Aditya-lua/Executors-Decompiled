/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b041e4
 */

GENERAL_NAME *
v2i_GENERAL_NAME_ex(GENERAL_NAME *out,X509V3_EXT_METHOD *method,X509V3_CTX *ctx,CONF_VALUE *cnf,
                   int is_nc)

{
  int iVar1;
  GENERAL_NAME *pGVar2;
  X509V3_EXT_METHOD *extraout_x1;
  X509V3_EXT_METHOD *extraout_x1_00;
  X509V3_EXT_METHOD *extraout_x1_01;
  X509V3_EXT_METHOD *extraout_x1_02;
  X509V3_EXT_METHOD *extraout_x1_03;
  X509V3_EXT_METHOD *extraout_x1_04;
  X509V3_EXT_METHOD *extraout_x1_05;
  X509V3_EXT_METHOD *method_00;
  char *value;
  char *pcVar3;
  
  value = cnf->value;
  if (value == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_san.c",0x265,"v2i_GENERAL_NAME_ex");
    ERR_set_error(0x22,0x7c,0);
    return (GENERAL_NAME *)0x0;
  }
  pcVar3 = cnf->name;
  iVar1 = ossl_v3_name_cmp(pcVar3,"email");
  if (iVar1 == 0) {
    iVar1 = 1;
    method_00 = extraout_x1;
  }
  else {
    iVar1 = ossl_v3_name_cmp(pcVar3,&DAT_002a0d7a);
    if (iVar1 == 0) {
      iVar1 = 6;
      method_00 = extraout_x1_00;
    }
    else {
      iVar1 = ossl_v3_name_cmp(pcVar3,&DAT_0029ebd8);
      if (iVar1 == 0) {
        iVar1 = 2;
        method_00 = extraout_x1_01;
      }
      else {
        iVar1 = ossl_v3_name_cmp(pcVar3,&DAT_002b876d);
        if (iVar1 == 0) {
          iVar1 = 8;
          method_00 = extraout_x1_02;
        }
        else {
          iVar1 = ossl_v3_name_cmp(pcVar3,&DAT_002bd24e);
          if (iVar1 == 0) {
            iVar1 = 7;
            method_00 = extraout_x1_03;
          }
          else {
            iVar1 = ossl_v3_name_cmp(pcVar3,"dirName");
            if (iVar1 == 0) {
              iVar1 = 4;
              method_00 = extraout_x1_04;
            }
            else {
              iVar1 = ossl_v3_name_cmp(pcVar3,"otherName");
              if (iVar1 != 0) {
                ERR_new();
                ERR_set_debug("crypto/x509/v3_san.c",0x278,"v2i_GENERAL_NAME_ex");
                ERR_set_error(0x22,0x75,"name=%s",pcVar3);
                return (GENERAL_NAME *)0x0;
              }
              iVar1 = 0;
              method_00 = extraout_x1_05;
            }
          }
        }
      }
    }
  }
  pGVar2 = a2i_GENERAL_NAME(out,method_00,ctx,iVar1,value,is_nc);
  return pGVar2;
}

