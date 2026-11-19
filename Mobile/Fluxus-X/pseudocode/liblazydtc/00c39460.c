/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c39460
 */

char * CONF_get_string(lhash_st_CONF_VALUE *conf,char *group,char *name)

{
  char *pcVar1;
  
  pcVar1 = CONF_get_string(conf,group,name);
  return pcVar1;
}

