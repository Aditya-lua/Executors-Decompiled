/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c408c0
 */

int X509V3_add_value(char *name,char *value,stack_st_CONF_VALUE **extlist)

{
  int iVar1;
  
  iVar1 = X509V3_add_value(name,value,extlist);
  return iVar1;
}

