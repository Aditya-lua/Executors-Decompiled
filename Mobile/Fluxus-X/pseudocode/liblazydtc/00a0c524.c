/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0c524
 */

uint CONF_modules_load_file_ex(undefined8 param_1,char *param_2,char *param_3,ulong param_4)

{
  bool bVar1;
  int iVar2;
  uint uVar3;
  CONF *conf;
  long lVar4;
  char *file;
  ulong uVar5;
  
  ERR_set_mark();
  file = param_2;
  if (param_2 == (char *)0x0) {
    file = CONF_get1_default_config_file();
    if (file == (char *)0x0) {
      bVar1 = false;
      uVar3 = 0;
      conf = (CONF *)0x0;
    }
    else {
      if (*file != '\0') goto LAB_00a0c554;
      bVar1 = false;
      conf = (CONF *)0x0;
      uVar3 = 1;
    }
  }
  else {
LAB_00a0c554:
    conf = (CONF *)NCONF_new_ex(param_1,0);
    if (conf == (CONF *)0x0) {
LAB_00a0c5e0:
      uVar3 = 0;
      bVar1 = false;
    }
    else {
      iVar2 = NCONF_load(conf,file,(long *)0x0);
      if (iVar2 < 1) {
        if (((uint)param_4 >> 4 & 1) == 0) goto LAB_00a0c5e0;
        uVar5 = ERR_peek_last_error();
        bVar1 = false;
        uVar3 = (uint)((((int)(uint)uVar5 >> 0x1f & 0x7f800000U | 0x7fffff) & (uint)uVar5) == 0x72);
      }
      else {
        uVar3 = CONF_modules_load(conf,param_3,param_4);
        lVar4 = _CONF_get_number(conf,(char *)0x0,"config_diagnostics");
        bVar1 = lVar4 != 0;
      }
    }
    if (param_2 != (char *)0x0) goto LAB_00a0c638;
  }
  CRYPTO_free(file);
LAB_00a0c638:
  NCONF_free(conf);
  if (!bVar1 && (param_4 & 2) != 0) {
    uVar3 = 1;
  }
  if ((int)uVar3 < 1) {
    ERR_clear_last_mark();
  }
  else {
    ERR_pop_to_mark();
  }
  return uVar3;
}

