/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c393b0
 */

int _CONF_add_string(CONF *conf,CONF_VALUE *section,CONF_VALUE *value)

{
  int iVar1;
  
  iVar1 = _CONF_add_string(conf,section,value);
  return iVar1;
}

