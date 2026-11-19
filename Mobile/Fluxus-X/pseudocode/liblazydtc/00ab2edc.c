/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab2edc
 */

bool OCSP_resp_get0_signer(long param_1,long *param_2,undefined8 param_3)

{
  bool bVar1;
  long lVar2;
  
  lVar2 = FUN_00ab30c0(param_3,param_1 + 8);
  if (lVar2 == 0) {
    lVar2 = FUN_00ab30c0(*(undefined8 *)(param_1 + 0x48),param_1 + 8);
    bVar1 = lVar2 != 0;
  }
  else {
    bVar1 = true;
  }
  *param_2 = lVar2;
  return bVar1;
}

