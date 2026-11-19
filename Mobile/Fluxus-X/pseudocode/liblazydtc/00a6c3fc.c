/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6c3fc
 */

undefined8 EVP_PKEY_set_type_by_keymgmt(undefined8 param_1,undefined8 param_2)

{
  char *pcVar1;
  int iVar2;
  undefined8 uVar3;
  size_t sVar4;
  char *local_40;
  long local_38;
  
  local_38 = 0;
  local_40 = (char *)0x0;
  iVar2 = EVP_KEYMGMT_names_do_all(param_2,&LAB_00a6eed0,&local_40);
  pcVar1 = local_40;
  if ((iVar2 == 0) || (local_38 != 0)) {
    ERR_new();
    ERR_set_debug("crypto/evp/p_lib.c",0x66c,"EVP_PKEY_set_type_by_keymgmt");
    ERR_set_error(6,0xc0103,0);
    uVar3 = 0;
  }
  else {
    if (local_40 == (char *)0x0) {
      sVar4 = 0xffffffff;
    }
    else {
      sVar4 = strlen(local_40);
    }
    uVar3 = FUN_00a6d2f4(param_1,0,0,pcVar1,sVar4,param_2);
  }
  return uVar3;
}

