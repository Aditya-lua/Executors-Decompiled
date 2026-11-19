/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0d9ec
 */

long _CONF_get_number(CONF *conf,char *section,char *name)

{
  long lVar1;
  int iVar2;
  long local_28;
  
  local_28 = 0;
  ERR_set_mark();
  iVar2 = NCONF_get_number_e(conf,section,name,&local_28);
  ERR_pop_to_mark();
  lVar1 = 0;
  if (iVar2 != 0) {
    lVar1 = local_28;
  }
  return lVar1;
}

