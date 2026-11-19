/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a98ce8
 */

undefined8 ossl_config_int(undefined8 *param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  
  if ((DAT_00d220d0 & 1) == 0) {
    if (param_1 == (undefined8 *)0x0) {
      uVar3 = 0;
      uVar1 = 0;
      uVar4 = 0x32;
    }
    else {
      uVar1 = *param_1;
      uVar3 = param_1[1];
      uVar4 = param_1[2];
    }
    uVar2 = OSSL_LIB_CTX_get0_global_default();
    uVar1 = CONF_modules_load_file_ex(uVar2,uVar1,uVar3,uVar4);
    DAT_00d220d0 = 1;
  }
  else {
    uVar1 = 1;
  }
  return uVar1;
}

