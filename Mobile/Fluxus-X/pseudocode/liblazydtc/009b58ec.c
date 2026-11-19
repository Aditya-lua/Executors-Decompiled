/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b58ec
 */

int ssl_cipher_id_cmp(long param_1,long param_2)

{
  int iVar1;
  
  iVar1 = -(uint)(*(uint *)(param_1 + 0x18) < *(uint *)(param_2 + 0x18));
  if (*(uint *)(param_2 + 0x18) < *(uint *)(param_1 + 0x18)) {
    iVar1 = 1;
  }
  return iVar1;
}

