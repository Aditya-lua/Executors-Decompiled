/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ba3dc
 */

uint SSL_CONF_CTX_set_flags(uint *param_1,uint param_2)

{
  uint uVar1;
  
  uVar1 = *param_1;
  *param_1 = uVar1 | param_2;
  return uVar1 | param_2;
}

