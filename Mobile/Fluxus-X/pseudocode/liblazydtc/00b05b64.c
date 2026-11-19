/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b05b64
 */

int X509V3_add_value_bool_nf(char *name,int asn1_bool,stack_st_CONF_VALUE **extlist)

{
  int iVar1;
  
  if (asn1_bool == 0) {
    return 1;
  }
  iVar1 = FUN_00b0590c(name,&DAT_002c8db8,4,extlist);
  return iVar1;
}

