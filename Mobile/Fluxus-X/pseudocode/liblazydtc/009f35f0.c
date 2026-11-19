/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f35f0
 */

long ASN1_INTEGER_get(ASN1_INTEGER *a)

{
  int iVar1;
  long lVar2;
  long local_18;
  
  lVar2 = 0;
  if (a != (ASN1_INTEGER *)0x0) {
    iVar1 = FUN_009f320c(&local_18,a,2);
    if (iVar1 == 0) {
      local_18 = -1;
    }
    lVar2 = local_18;
  }
  return lVar2;
}

