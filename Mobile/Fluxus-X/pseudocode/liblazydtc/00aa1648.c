/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa1648
 */

undefined4
ossl_pw_pem_password(undefined8 param_1,int param_2,undefined4 param_3,undefined8 param_4)

{
  int iVar1;
  undefined *local_88;
  undefined4 local_80;
  undefined *local_78;
  undefined8 local_68;
  undefined8 local_38;
  
  local_38 = 0;
  memset(&local_88,0,0x50);
  local_88 = &DAT_0029e225;
  local_80 = 4;
  local_68 = 0xffffffffffffffff;
  local_78 = &DAT_002b956f;
  iVar1 = ossl_pw_get_passphrase(param_1,(long)param_2,&local_38,&local_88,param_3,param_4);
  if (iVar1 == 0) {
    local_38._0_4_ = 0xffffffff;
  }
  return (undefined4)local_38;
}

