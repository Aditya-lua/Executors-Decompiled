/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0d010
 */

stack_st_CONF_VALUE * CONF_get_section(lhash_st_CONF_VALUE *conf,char *section)

{
  stack_st_CONF_VALUE *psVar1;
  CONF aCStack_60 [2];
  
  psVar1 = (stack_st_CONF_VALUE *)0x0;
  if (conf != (lhash_st_CONF_VALUE *)0x0) {
    if (DAT_00d21950 == (CONF_METHOD *)0x0) {
      DAT_00d21950 = NCONF_default();
    }
    (*DAT_00d21950->init)(aCStack_60);
    aCStack_60[0].data = conf;
    if (section == (char *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/conf/conf_lib.c",0x125,"NCONF_get_section");
      ERR_set_error(0xe,0x6b,0);
      psVar1 = (stack_st_CONF_VALUE *)0x0;
    }
    else {
      psVar1 = _CONF_get_section_values(aCStack_60,section);
    }
  }
  return psVar1;
}

