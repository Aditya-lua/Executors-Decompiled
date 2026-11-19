/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0f9f4
 */

char * _CONF_get_string(CONF *conf,char *section,char *name)

{
  int iVar1;
  long lVar2;
  char *pcVar3;
  char *local_48;
  char *pcStack_40;
  
  if (name == (char *)0x0) {
    return (char *)0x0;
  }
  if (conf == (CONF *)0x0) {
    pcVar3 = (char *)ossl_safe_getenv(name);
    return pcVar3;
  }
  if (conf->data == (lhash_st_CONF_VALUE *)0x0) {
    return (char *)0x0;
  }
  if (section != (char *)0x0) {
    local_48 = section;
    pcStack_40 = name;
    lVar2 = OPENSSL_LH_retrieve(conf->data,&local_48);
    if (lVar2 != 0) goto LAB_00a0fa74;
    iVar1 = strcmp(section,"ENV");
    if ((iVar1 == 0) && (pcVar3 = (char *)ossl_safe_getenv(name), pcVar3 != (char *)0x0)) {
      return pcVar3;
    }
  }
  local_48 = "default";
  pcStack_40 = name;
  lVar2 = OPENSSL_LH_retrieve(conf->data,&local_48);
  if (lVar2 == 0) {
    return (char *)0x0;
  }
LAB_00a0fa74:
  return *(char **)(lVar2 + 0x10);
}

