/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af91dc
 */

bool X509v3_asid_add_inherit(long *param_1,int param_2)

{
  bool bVar1;
  ASN1_VALUE *pAVar2;
  ASN1_NULL *pAVar3;
  int *piVar4;
  
  bVar1 = false;
  if (param_1 != (long *)0x0) {
    if (param_2 == 1) {
      param_1 = param_1 + 1;
      piVar4 = (int *)*param_1;
    }
    else {
      if (param_2 != 0) {
        return false;
      }
      piVar4 = (int *)*param_1;
    }
    if (piVar4 == (int *)0x0) {
      pAVar2 = ASN1_item_new((ASN1_ITEM *)&DAT_00c7ebc0);
      *param_1 = (long)pAVar2;
      bVar1 = false;
      if (pAVar2 != (ASN1_VALUE *)0x0) {
        pAVar3 = ASN1_NULL_new();
        *(ASN1_NULL **)(*param_1 + 8) = pAVar3;
        if (pAVar3 == (ASN1_NULL *)0x0) {
          ASN1_item_free((ASN1_VALUE *)*param_1,(ASN1_ITEM *)&DAT_00c7ebc0);
          bVar1 = false;
          *param_1 = 0;
        }
        else {
          *(undefined4 *)*param_1 = 0;
          bVar1 = true;
        }
      }
    }
    else {
      bVar1 = *piVar4 == 0;
    }
  }
  return bVar1;
}

