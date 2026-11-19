/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0cb70
 */

void CONF_imodule_set_flags(CONF_IMODULE *md,ulong flags)

{
  *(ulong *)(md + 0x18) = flags;
  return;
}

