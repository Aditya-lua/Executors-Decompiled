/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad32e0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

RSA_METHOD * RSA_null_method(void)

{
  return (RSA_METHOD *)0x0;
}

