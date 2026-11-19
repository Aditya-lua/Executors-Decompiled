/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa57ec
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int OPENSSL_issetugid(void)

{
  long lVar1;
  
  lVar1 = getauxval(0x17);
  return (int)(lVar1 != 0);
}

