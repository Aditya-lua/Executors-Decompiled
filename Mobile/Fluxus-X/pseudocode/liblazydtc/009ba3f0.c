/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ba3f0
 */

uint SSL_CONF_CTX_clear_flags(uint *param_1,uint param_2)

{
  uint uVar1;
  
  uVar1 = *param_1 & (param_2 ^ 0xffffffff);
  *param_1 = uVar1;
  return uVar1;
}

