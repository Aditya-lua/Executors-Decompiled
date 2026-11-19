/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d522c
 */

undefined8 tls_parse_stoc_ems(long param_1)

{
  if (((*(byte *)(param_1 + 0x9e8) & 1) == 0) &&
     (*(ulong *)(param_1 + 0xa8) = *(ulong *)(param_1 + 0xa8) | 0x200,
     *(int *)(param_1 + 0x4d0) == 0)) {
    *(uint *)(*(long *)(param_1 + 0x918) + 0x388) =
         *(uint *)(*(long *)(param_1 + 0x918) + 0x388) | 1;
    return 1;
  }
  return 1;
}

