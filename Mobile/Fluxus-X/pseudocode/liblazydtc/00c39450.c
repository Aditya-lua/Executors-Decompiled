/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c39450
 */

stack_st_CONF_VALUE * CONF_get_section(lhash_st_CONF_VALUE *conf,char *section)

{
  stack_st_CONF_VALUE *psVar1;
  
  psVar1 = CONF_get_section(conf,section);
  return psVar1;
}

