/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0faa0
 */

int _CONF_new_data(CONF *conf)

{
  int iVar1;
  lhash_st_CONF_VALUE *plVar2;
  
  iVar1 = 0;
  if (conf != (CONF *)0x0) {
    if (conf->data == (lhash_st_CONF_VALUE *)0x0) {
      plVar2 = (lhash_st_CONF_VALUE *)OPENSSL_LH_new(&LAB_00a0fae8,FUN_00a0fb20);
      conf->data = plVar2;
      if (plVar2 == (lhash_st_CONF_VALUE *)0x0) {
        return 0;
      }
    }
    iVar1 = 1;
  }
  return iVar1;
}

