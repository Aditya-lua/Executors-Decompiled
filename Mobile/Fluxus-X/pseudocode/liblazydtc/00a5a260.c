/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5a260
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void EVP_add_alg_module(void)

{
  CONF_module_add("alg_section",&LAB_00a5a278,(undefined1 *)0x0);
  return;
}

