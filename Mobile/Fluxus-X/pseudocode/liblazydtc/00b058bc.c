/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b058bc
 */

int X509V3_add_value(char *name,char *value,stack_st_CONF_VALUE **extlist)

{
  int iVar1;
  size_t sVar2;
  
  if (value == (char *)0x0) {
    sVar2 = 0;
  }
  else {
    sVar2 = strlen(value);
  }
  iVar1 = FUN_00b0590c(name,value,sVar2,extlist);
  return iVar1;
}

