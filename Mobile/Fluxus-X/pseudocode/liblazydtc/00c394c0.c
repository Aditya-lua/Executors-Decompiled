/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c394c0
 */

char * NCONF_get_string(CONF *conf,char *group,char *name)

{
  char *pcVar1;
  
  pcVar1 = NCONF_get_string(conf,group,name);
  return pcVar1;
}

