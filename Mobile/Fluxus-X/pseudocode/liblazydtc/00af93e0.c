/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af93e0
 */

int FUN_00af93e0(undefined8 *param_1,undefined8 *param_2)

{
  int iVar1;
  ASN1_INTEGER *x;
  int *piVar2;
  int *piVar3;
  
  piVar3 = (int *)*param_1;
  piVar2 = (int *)*param_2;
  if (*piVar3 == 1) {
    if (*piVar2 == 1) {
      iVar1 = ASN1_INTEGER_cmp((ASN1_INTEGER *)**(undefined8 **)(piVar3 + 2),
                               (ASN1_INTEGER *)**(undefined8 **)(piVar2 + 2));
      if (iVar1 != 0) {
        return iVar1;
      }
      x = *(ASN1_INTEGER **)(*(long *)(piVar3 + 2) + 8);
      piVar2 = (int *)(*(long *)(piVar2 + 2) + 8);
      goto LAB_00af9454;
    }
LAB_00af9448:
    x = (ASN1_INTEGER *)**(undefined8 **)(piVar3 + 2);
  }
  else {
    if (*piVar3 != 0) goto LAB_00af9448;
    x = *(ASN1_INTEGER **)(piVar3 + 2);
    if (*piVar2 != 0) {
      piVar2 = *(int **)(piVar2 + 2);
      goto LAB_00af9454;
    }
  }
  piVar2 = piVar2 + 2;
LAB_00af9454:
  iVar1 = ASN1_INTEGER_cmp(x,*(ASN1_INTEGER **)piVar2);
  return iVar1;
}

