/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1e77c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

DH_METHOD * DH_get_default_method(void)

{
  return (DH_METHOD *)PTR_PTR_00cc8868;
}

