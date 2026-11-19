/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a81268
 */

bool OSSL_LIB_CTX_load_config(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = CONF_modules_load_file_ex(param_1,param_2,0,0);
  return 0 < iVar1;
}

