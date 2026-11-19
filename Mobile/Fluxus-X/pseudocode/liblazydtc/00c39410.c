/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c39410
 */

CONF_VALUE * _CONF_new_section(CONF *conf,char *section)

{
  CONF_VALUE *pCVar1;
  
  pCVar1 = _CONF_new_section(conf,section);
  return pCVar1;
}

