/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abee88
 */

undefined8 PKCS7_get_octet_string(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  int *piVar3;
  
  iVar1 = OBJ_obj2nid(*(ASN1_OBJECT **)(param_1 + 0x18));
  if (iVar1 == 0x15) {
    uVar2 = *(undefined8 *)(param_1 + 0x20);
  }
  else {
    iVar1 = OBJ_obj2nid(*(ASN1_OBJECT **)(param_1 + 0x18));
    uVar2 = 0;
    if (5 < iVar1 - 0x15U) {
      piVar3 = *(int **)(param_1 + 0x20);
      if (piVar3 == (int *)0x0) {
        uVar2 = 0;
      }
      else {
        uVar2 = 0;
        if (*piVar3 == 4) {
          uVar2 = *(undefined8 *)(piVar3 + 2);
        }
      }
    }
  }
  return uVar2;
}

