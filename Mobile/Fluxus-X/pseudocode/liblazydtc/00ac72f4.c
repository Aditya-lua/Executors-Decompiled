/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac72f4
 */

bool ossl_property_is_enabled(undefined8 param_1,long param_2,undefined4 *param_3)

{
  int iVar1;
  bool bVar2;
  long lVar3;
  int local_14;
  
  if ((((param_2 == 0) || (param_3 == (undefined4 *)0x0)) ||
      (local_14 = ossl_property_name(param_1,param_2,0), local_14 == 0)) ||
     (lVar3 = ossl_bsearch(&local_14,param_3 + 2,*param_3,0x18,&LAB_00ac728c,0), lVar3 == 0)) {
    bVar2 = false;
  }
  else {
    bVar2 = false;
    if ((*(byte *)(lVar3 + 0xc) & 1) == 0) {
      iVar1 = *(int *)(lVar3 + 8);
      bVar2 = false;
      if ((iVar1 != 2) && (bVar2 = false, *(int *)(lVar3 + 4) == 0)) {
        if (iVar1 == 1) {
          bVar2 = *(int *)(lVar3 + 0x10) != 1;
        }
        else {
          bVar2 = false;
          if (iVar1 == 0) {
            return *(int *)(lVar3 + 0x10) == 1;
          }
        }
      }
    }
  }
  return bVar2;
}

