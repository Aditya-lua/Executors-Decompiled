/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0f8d4
 */

CONF_VALUE * _CONF_get_section(CONF *conf,char *section)

{
  CONF_VALUE *pCVar1;
  char *local_28;
  undefined8 uStack_20;
  
  pCVar1 = (CONF_VALUE *)0x0;
  if ((conf != (CONF *)0x0) && (section != (char *)0x0)) {
    uStack_20 = 0;
    pCVar1 = (CONF_VALUE *)0x0;
    if (conf->data != (lhash_st_CONF_VALUE *)0x0) {
      local_28 = section;
      pCVar1 = (CONF_VALUE *)OPENSSL_LH_retrieve(conf->data,&local_28);
    }
  }
  return pCVar1;
}

