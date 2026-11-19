/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7d68
 */

undefined8 SSL_CTX_set_block_padding(long param_1,ulong param_2)

{
  undefined8 uVar1;
  ulong uVar2;
  
  uVar2 = 0;
  if ((param_2 == 1) || (uVar1 = 0, uVar2 = param_2, param_2 < 0x4001)) {
    uVar1 = 1;
    *(ulong *)(param_1 + 0x3f0) = uVar2;
  }
  return uVar1;
}

