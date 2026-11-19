/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0d80c
 */

int X509_EXTENSION_get_critical(X509_EXTENSION *ex)

{
  uint uVar1;
  
  uVar1 = 0;
  if (ex != (X509_EXTENSION *)0x0) {
    uVar1 = (uint)(0 < ex->critical);
  }
  return uVar1;
}

