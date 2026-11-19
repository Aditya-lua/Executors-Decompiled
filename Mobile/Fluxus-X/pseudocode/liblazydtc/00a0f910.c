/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0f910
 */

stack_st_CONF_VALUE * _CONF_get_section_values(CONF *conf,char *section)

{
  long lVar1;
  char *local_28;
  undefined8 uStack_20;
  
  if ((conf != (CONF *)0x0) && (section != (char *)0x0)) {
    uStack_20 = 0;
    if (conf->data != (lhash_st_CONF_VALUE *)0x0) {
      local_28 = section;
      lVar1 = OPENSSL_LH_retrieve(conf->data,&local_28);
      if (lVar1 == 0) {
        return (stack_st_CONF_VALUE *)0x0;
      }
      return *(stack_st_CONF_VALUE **)(lVar1 + 0x10);
    }
  }
  return (stack_st_CONF_VALUE *)0x0;
}

