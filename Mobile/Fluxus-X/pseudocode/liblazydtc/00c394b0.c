/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c394b0
 */

stack_st_CONF_VALUE * NCONF_get_section(CONF *conf,char *section)

{
  stack_st_CONF_VALUE *psVar1;
  
  psVar1 = NCONF_get_section(conf,section);
  return psVar1;
}

