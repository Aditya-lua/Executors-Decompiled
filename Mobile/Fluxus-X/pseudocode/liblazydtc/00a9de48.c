/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9de48
 */

undefined8
ossl_param_build_set_multi_key_bn(long param_1,undefined8 param_2,long param_3,undefined8 param_4)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  
  iVar1 = OPENSSL_sk_num(param_4);
  if (param_1 == 0) {
    if (0 < iVar1) {
      uVar5 = 0;
      do {
        if (*(long *)(param_3 + uVar5 * 8) == 0) {
          return 1;
        }
        lVar2 = OPENSSL_sk_value(param_4,uVar5 & 0xffffffff);
        lVar4 = OSSL_PARAM_locate(param_2,*(undefined8 *)(param_3 + uVar5 * 8));
        if (((lVar2 != 0) && (lVar4 != 0)) &&
           (uVar3 = OSSL_PARAM_set_BN(lVar4,lVar2), (int)uVar3 == 0)) {
          return uVar3;
        }
        uVar5 = uVar5 + 1;
      } while ((long)uVar5 < (long)iVar1);
    }
  }
  else if (0 < iVar1) {
    uVar5 = 0;
    do {
      if (*(long *)(param_3 + uVar5 * 8) == 0) {
        return 1;
      }
      lVar2 = OPENSSL_sk_value(param_4,uVar5 & 0xffffffff);
      if ((lVar2 != 0) &&
         (uVar3 = OSSL_PARAM_BLD_push_BN(param_1,*(undefined8 *)(param_3 + uVar5 * 8),lVar2),
         (int)uVar3 == 0)) {
        return uVar3;
      }
      uVar5 = uVar5 + 1;
    } while ((long)uVar5 < (long)iVar1);
  }
  return 1;
}

