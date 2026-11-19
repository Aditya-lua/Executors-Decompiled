/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0cb68
 */

ulong CONF_imodule_get_flags(CONF_IMODULE *md)

{
  return *(ulong *)(md + 0x18);
}

