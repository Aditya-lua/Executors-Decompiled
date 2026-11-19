/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a11c14
 */

int ossl_config_add_ssl_module(void)

{
  int iVar1;
  
  iVar1 = CONF_module_add("ssl_conf",&LAB_00a11c30,FUN_00a11ef0);
  return iVar1;
}

