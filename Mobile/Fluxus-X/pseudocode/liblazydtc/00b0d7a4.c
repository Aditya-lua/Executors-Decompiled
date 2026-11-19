/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0d7a4
 */

int X509_EXTENSION_set_critical(X509_EXTENSION *ex,int crit)

{
  int iVar1;
  ASN1_BOOLEAN AVar2;
  
  iVar1 = 0;
  if (ex != (X509_EXTENSION *)0x0) {
    AVar2 = 0xff;
    if (crit == 0) {
      AVar2 = -1;
    }
    ex->critical = AVar2;
    iVar1 = 1;
  }
  return iVar1;
}

