/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afe110
 */

undefined8 FUN_00afe110(long *param_1,BIO *param_2,int param_3)

{
  char *param3;
  char *param5;
  bool bVar1;
  int iVar2;
  char *param2;
  char acStack_c0 [128];
  
  if (param_1 == (long *)0x0) {
    return 0;
  }
  if (((*param_1 == 0) && (param_1[2] == 0)) && (param_1[1] == 0)) {
    return 0;
  }
  iVar2 = BIO_printf(param_2,"%*snamingAuthority: ",param_3,"");
  if (iVar2 < 1) {
    return 0;
  }
  if ((ASN1_OBJECT *)*param_1 != (ASN1_OBJECT *)0x0) {
    iVar2 = OBJ_obj2nid((ASN1_OBJECT *)*param_1);
    param2 = OBJ_nid2ln(iVar2);
    iVar2 = BIO_printf(param_2,"%*s  admissionAuthorityId: ",param_3,"");
    if (iVar2 < 1) {
      return 0;
    }
    OBJ_obj2txt(acStack_c0,0x80,(ASN1_OBJECT *)*param_1,1);
    bVar1 = param2 == (char *)0x0;
    if (bVar1) {
      param2 = "";
    }
    param3 = " (";
    if (bVar1) {
      param3 = "";
    }
    param5 = ")";
    if (bVar1) {
      param5 = "";
    }
    iVar2 = BIO_printf(param_2,"%s%s%s%s\n",param2,param3,acStack_c0,param5);
    if (iVar2 < 1) {
      return 0;
    }
  }
  if (((param_1[2] == 0) ||
      (((iVar2 = BIO_printf(param_2,"%*s  namingAuthorityText: ",param_3,""), 0 < iVar2 &&
        (iVar2 = ASN1_STRING_print(param_2,(ASN1_STRING *)param_1[2]), 0 < iVar2)) &&
       (iVar2 = BIO_printf(param_2,"\n"), 0 < iVar2)))) &&
     ((param_1[1] == 0 ||
      (((iVar2 = BIO_printf(param_2,"%*s  namingAuthorityUrl: ",param_3,""), 0 < iVar2 &&
        (iVar2 = ASN1_STRING_print(param_2,(ASN1_STRING *)param_1[1]), 0 < iVar2)) &&
       (iVar2 = BIO_printf(param_2,"\n"), 0 < iVar2)))))) {
    return 1;
  }
  return 0;
}

