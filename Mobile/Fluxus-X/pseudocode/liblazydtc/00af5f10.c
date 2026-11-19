/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af5f10
 */

undefined8 X509v3_addr_add_inherit(void)

{
  long lVar1;
  ASN1_NULL *pAVar2;
  int *piVar3;
  
  lVar1 = FUN_00af5f98();
  if (lVar1 == 0) {
    return 0;
  }
  piVar3 = *(int **)(lVar1 + 8);
  if (piVar3 == (int *)0x0) {
    return 0;
  }
  if (*piVar3 == 0) {
    if (*(long *)(piVar3 + 2) != 0) {
      return 1;
    }
  }
  else if (*piVar3 == 1) {
    if (*(long *)(piVar3 + 2) != 0) {
      return 0;
    }
  }
  else if (*(long *)(piVar3 + 2) != 0) goto LAB_00af5f84;
  pAVar2 = ASN1_NULL_new();
  *(ASN1_NULL **)(*(long *)(lVar1 + 8) + 8) = pAVar2;
  if (pAVar2 == (ASN1_NULL *)0x0) {
    return 0;
  }
  piVar3 = *(int **)(lVar1 + 8);
LAB_00af5f84:
  *piVar3 = 0;
  return 1;
}

