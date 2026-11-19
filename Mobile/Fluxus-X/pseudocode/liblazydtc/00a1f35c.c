/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1f35c
 */

undefined8 DH_get0_priv_key(long param_1)

{
  return *(undefined8 *)(param_1 + 0x78);
}

