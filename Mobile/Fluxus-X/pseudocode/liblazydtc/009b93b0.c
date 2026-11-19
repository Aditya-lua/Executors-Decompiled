/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b93b0
 */

int ssl_get_max_send_fragment(long param_1)

{
  uint uVar1;
  
  if ((*(long *)(param_1 + 0x918) == 0) ||
     (uVar1 = *(byte *)(*(long *)(param_1 + 0x918) + 0x368) - 1, 3 < uVar1)) {
    return *(int *)(param_1 + 0xa18);
  }
  return 0x200 << (ulong)(uVar1 & 0x1f);
}

