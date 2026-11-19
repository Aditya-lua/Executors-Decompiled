/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b05a80
 */

int X509V3_add_value_uchar(char *name,uchar *value,stack_st_CONF_VALUE **extlist)

{
  int iVar1;
  size_t sVar2;
  
  if (value == (uchar *)0x0) {
    sVar2 = 0;
  }
  else {
    sVar2 = strlen((char *)value);
  }
  iVar1 = FUN_00b0590c(name,value,sVar2,extlist);
  return iVar1;
}

