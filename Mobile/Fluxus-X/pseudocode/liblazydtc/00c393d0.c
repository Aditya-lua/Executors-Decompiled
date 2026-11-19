/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c393d0
 */

CONF_VALUE * _CONF_get_section(CONF *conf,char *section)

{
  CONF_VALUE *pCVar1;
  
  pCVar1 = _CONF_get_section(conf,section);
  return pCVar1;
}

