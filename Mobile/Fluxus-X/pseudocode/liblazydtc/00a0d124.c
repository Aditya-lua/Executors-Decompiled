/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0d124
 */

char * CONF_get_string(lhash_st_CONF_VALUE *conf,char *group,char *name)

{
  char *pcVar1;
  CONF aCStack_60 [2];
  
  if (conf == (lhash_st_CONF_VALUE *)0x0) {
    pcVar1 = _CONF_get_string((CONF *)0x0,group,name);
    if (pcVar1 != (char *)0x0) {
      return pcVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/conf/conf_lib.c",0x138,"NCONF_get_string");
    ERR_set_error(0xe,0x6a,0);
  }
  else {
    if (DAT_00d21950 == (CONF_METHOD *)0x0) {
      DAT_00d21950 = NCONF_default();
    }
    (*DAT_00d21950->init)(aCStack_60);
    aCStack_60[0].data = conf;
    pcVar1 = _CONF_get_string(aCStack_60,group,name);
    if (pcVar1 != (char *)0x0) {
      return pcVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/conf/conf_lib.c",0x13b,"NCONF_get_string");
    ERR_set_error(0xe,0x6c,"group=%s name=%s",group,name);
  }
  return (char *)0x0;
}

