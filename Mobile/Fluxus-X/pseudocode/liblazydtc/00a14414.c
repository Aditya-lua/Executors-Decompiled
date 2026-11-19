/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a14414
 */

uint SCT_LIST_validate(long param_1,undefined8 param_2)

{
  int iVar1;
  uint uVar2;
  long lVar3;
  uint uVar4;
  int iVar5;
  
  if ((param_1 == 0) || (iVar1 = OPENSSL_sk_num(), iVar1 < 1)) {
    uVar4 = 1;
  }
  else {
    iVar5 = 0;
    uVar4 = 1;
    do {
      lVar3 = OPENSSL_sk_value(param_1,iVar5);
      if (lVar3 != 0) {
        uVar2 = SCT_validate(lVar3,param_2);
        if ((int)uVar2 < 0) {
          return uVar2;
        }
        uVar4 = uVar2 & uVar4;
      }
      iVar5 = iVar5 + 1;
    } while (iVar5 < iVar1);
  }
  return uVar4;
}

