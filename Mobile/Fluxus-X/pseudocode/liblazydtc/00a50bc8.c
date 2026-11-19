/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a50bc8
 */

int ENGINE_set_default_string(ENGINE *e,char *def_list)

{
  int iVar1;
  uint local_24;
  
  local_24 = 0;
  iVar1 = CONF_parse_list(def_list,0x2c,1,(list_cb *)&LAB_00a50c5c,&local_24);
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_fat.c",0x56,"ENGINE_set_default_string");
    ERR_set_error(0x26,0x96,"str=%s",def_list);
    iVar1 = 0;
  }
  else {
    iVar1 = ENGINE_set_default(e,local_24);
  }
  return iVar1;
}

