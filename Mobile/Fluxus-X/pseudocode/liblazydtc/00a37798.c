/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a37798
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

EC_METHOD * EC_GFp_mont_method(void)

{
  return (EC_METHOD *)&DAT_00c5c198;
}

