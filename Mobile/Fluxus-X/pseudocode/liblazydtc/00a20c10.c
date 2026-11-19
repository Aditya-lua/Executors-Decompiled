/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a20c10
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

DSA_METHOD * DSA_OpenSSL(void)

{
  return (DSA_METHOD *)&PTR_s_OpenSSL_DSA_method_00cc88c0;
}

