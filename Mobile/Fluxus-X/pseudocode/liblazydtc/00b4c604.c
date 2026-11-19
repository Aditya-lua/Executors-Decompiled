/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4c604
 */

bool FUN_00b4c604(long param_1,uint param_2)

{
  bool bVar1;
  bool bVar2;
  int iVar3;
  long lVar4;
  
  iVar3 = ossl_prov_is_running();
  bVar2 = false;
  if ((param_1 != 0) && (iVar3 != 0)) {
    if ((param_2 & 7) == 0) {
      bVar2 = true;
    }
    else {
      if ((param_2 >> 1 & 1) == 0) {
        bVar2 = true;
      }
      else {
        lVar4 = DH_get0_pub_key(param_1);
        bVar2 = lVar4 != 0;
      }
      if (((param_2 & 1) != 0) && (bVar1 = bVar2 != false, bVar2 = false, bVar1)) {
        lVar4 = DH_get0_priv_key(param_1);
        bVar2 = lVar4 != 0;
      }
      if (((param_2 >> 2 & 1) != 0) && (bVar1 = bVar2 != false, bVar2 = false, bVar1)) {
        lVar4 = DH_get0_p(param_1);
        bVar2 = false;
        if (lVar4 != 0) {
          lVar4 = DH_get0_g(param_1);
          bVar2 = lVar4 != 0;
        }
      }
    }
  }
  return bVar2;
}

