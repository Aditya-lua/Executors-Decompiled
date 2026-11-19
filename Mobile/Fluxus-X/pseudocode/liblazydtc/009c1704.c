/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c1704
 */

undefined8 tls1_set_groups_list(undefined8 param_1,long *param_2,long *param_3,char *param_4)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 local_50;
  long local_48;
  undefined8 uStack_40;
  void *local_38;
  
  uStack_40 = 0x28;
  local_48 = 0;
  local_38 = CRYPTO_malloc(0x50,"ssl/t1_lib.c",0x304);
  if (local_38 == (void *)0x0) {
    return 0;
  }
  local_50 = param_1;
  iVar1 = CONF_parse_list(param_4,0x3a,1,FUN_009c17fc,&local_50);
  if (iVar1 == 0) {
LAB_009c17cc:
    uVar3 = 0;
  }
  else {
    if (param_2 != (long *)0x0) {
      lVar2 = CRYPTO_memdup(local_38,local_48 << 1,"ssl/t1_lib.c",0x313);
      if (lVar2 == 0) goto LAB_009c17cc;
      CRYPTO_free((void *)*param_2);
      *param_2 = lVar2;
      *param_3 = local_48;
    }
    uVar3 = 1;
  }
  CRYPTO_free(local_38);
  return uVar3;
}

