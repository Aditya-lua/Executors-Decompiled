/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0d0ac
 */

stack_st_CONF_VALUE * NCONF_get_section(CONF *conf,char *section)

{
  stack_st_CONF_VALUE *psVar1;
  undefined8 uVar2;
  
  if (conf == (CONF *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/conf/conf_lib.c",0x120,"NCONF_get_section");
    uVar2 = 0x69;
  }
  else {
    if (section != (char *)0x0) {
      psVar1 = _CONF_get_section_values(conf,section);
      return psVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/conf/conf_lib.c",0x125,"NCONF_get_section");
    uVar2 = 0x6b;
  }
  ERR_set_error(0xe,uVar2,0);
  return (stack_st_CONF_VALUE *)0x0;
}

