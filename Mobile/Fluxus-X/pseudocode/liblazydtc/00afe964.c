/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afe964
 */

stack_st_CONF_VALUE *
i2v_ASN1_BIT_STRING(X509V3_EXT_METHOD *method,ASN1_BIT_STRING *bits,stack_st_CONF_VALUE *extlist)

{
  long *plVar1;
  int iVar2;
  int *piVar3;
  stack_st_CONF_VALUE *local_28;
  
  piVar3 = method->usr_data;
  local_28 = extlist;
  if (*(long *)(piVar3 + 2) != 0) {
    do {
      iVar2 = ASN1_BIT_STRING_get_bit(bits,*piVar3);
      if (iVar2 != 0) {
        X509V3_add_value(*(char **)(piVar3 + 2),(char *)0x0,&local_28);
      }
      plVar1 = (long *)(piVar3 + 8);
      piVar3 = piVar3 + 6;
    } while (*plVar1 != 0);
    extlist = local_28;
  }
  return extlist;
}

