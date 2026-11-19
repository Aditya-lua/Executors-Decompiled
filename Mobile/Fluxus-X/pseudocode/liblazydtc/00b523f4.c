/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b523f4
 */

ulong FUN_00b523f4(long param_1,uint param_2)

{
  ulong uVar1;
  long lVar2;
  
  uVar1 = 0;
  if ((param_1 != 0) && (uVar1 = ossl_prov_is_running(), (int)uVar1 != 0)) {
    if ((param_2 & 0x83) == 0) {
      uVar1 = 1;
    }
    else {
      if ((param_2 & 3) == 0) {
        uVar1 = 1;
      }
      else {
        lVar2 = RSA_get0_n(param_1);
        uVar1 = (ulong)(lVar2 != 0);
      }
      if (((param_2 >> 1 & 1) != 0) && ((int)uVar1 != 0)) {
        lVar2 = RSA_get0_e(param_1);
        uVar1 = (ulong)(lVar2 != 0);
      }
      if (((param_2 & 1) != 0) && ((int)uVar1 != 0)) {
        lVar2 = RSA_get0_d(param_1);
        uVar1 = (ulong)(lVar2 != 0);
      }
    }
  }
  return uVar1;
}

