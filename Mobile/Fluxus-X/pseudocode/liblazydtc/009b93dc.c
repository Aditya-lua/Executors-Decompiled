/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b93dc
 */

ulong ssl_get_split_send_fragment(long param_1)

{
  uint uVar1;
  ulong uVar2;
  
  if (((*(long *)(param_1 + 0x918) == 0) ||
      (uVar1 = *(byte *)(*(long *)(param_1 + 0x918) + 0x368) - 1, 3 < uVar1)) ||
     (uVar2 = (ulong)(uint)(0x200 << (ulong)(uVar1 & 0x1f)), *(ulong *)(param_1 + 0xa10) <= uVar2))
  {
    uVar2 = *(ulong *)(param_1 + 0xa18);
    if (*(ulong *)(param_1 + 0xa10) <= uVar2) {
      uVar2 = *(ulong *)(param_1 + 0xa10) & 0xffffffff;
    }
  }
  return uVar2 & 0xffffffff;
}

