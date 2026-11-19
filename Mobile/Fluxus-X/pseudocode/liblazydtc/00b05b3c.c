/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b05b3c
 */

int X509V3_add_value_bool(char *name,int asn1_bool,stack_st_CONF_VALUE **extlist)

{
  int iVar1;
  
  if (asn1_bool == 0) {
    iVar1 = FUN_00b0590c((int)name,"FALSE",5,extlist);
    return iVar1;
  }
  iVar1 = FUN_00b0590c((int)name,&DAT_002c8db8,4,extlist);
  return iVar1;
}

