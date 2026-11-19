/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f3950
 */

long ASN1_ENUMERATED_get(ASN1_ENUMERATED *a)

{
  int iVar1;
  long lVar2;
  long local_18;
  
  lVar2 = 0;
  if (a != (ASN1_ENUMERATED *)0x0) {
    if ((a->type & 0xfffffeffU) != 10) {
      return -1;
    }
    if (8 < a->length) {
      return 0xffffffff;
    }
    iVar1 = FUN_009f320c(&local_18,a,10);
    if (iVar1 == 0) {
      local_18 = -1;
    }
    lVar2 = local_18;
  }
  return lVar2;
}

