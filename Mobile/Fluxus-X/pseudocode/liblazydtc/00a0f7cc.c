/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0f7cc
 */

undefined8 FUN_00a0f7cc(undefined8 param_1,undefined4 *param_2)

{
  int iVar1;
  undefined4 uVar2;
  
  iVar1 = OPENSSL_strcasecmp(param_1,&DAT_002cb74a);
  if ((iVar1 == 0) || (iVar1 = OPENSSL_strcasecmp(param_1,&DAT_002b8dd9), iVar1 == 0)) {
    uVar2 = 1;
  }
  else {
    iVar1 = OPENSSL_strcasecmp(param_1,&DAT_002b7925);
    if ((iVar1 != 0) && (iVar1 = OPENSSL_strcasecmp(param_1,"false"), iVar1 != 0)) {
      ERR_new();
      ERR_set_debug("crypto/conf/conf_def.c",0xca,"parsebool");
      ERR_set_error(0xe,0x7a,0);
      return 0;
    }
    uVar2 = 0;
  }
  *param_2 = uVar2;
  return 1;
}

