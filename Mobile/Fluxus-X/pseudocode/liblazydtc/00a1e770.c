/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1e770
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

DH_METHOD * DH_OpenSSL(void)

{
  return (DH_METHOD *)&PTR_s_OpenSSL_DH_Method_00cc8870;
}

