/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a20c04
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

DSA_METHOD * DSA_get_default_method(void)

{
  return (DSA_METHOD *)PTR_PTR_00cc88b8;
}

