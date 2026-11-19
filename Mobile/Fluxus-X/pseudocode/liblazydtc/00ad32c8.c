/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad32c8
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

RSA_METHOD * RSA_get_default_method(void)

{
  return (RSA_METHOD *)PTR_PTR_00cc92c0;
}

