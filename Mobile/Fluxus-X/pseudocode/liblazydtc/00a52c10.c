/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a52c10
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void ENGINE_set_table_flags(uint flags)

{
  _DAT_00d219d0 = flags;
  return;
}

