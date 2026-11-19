/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5db38
 */

undefined8
FUN_00b5db38(undefined8 *param_1,undefined8 param_2,long param_3,undefined8 param_4,
            undefined8 param_5)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  
  lVar3 = param_1[1];
  iVar1 = ossl_prov_is_running();
  if ((param_3 == 0x40) && (iVar1 != 0)) {
    uVar2 = ossl_ed25519_verify(param_4,param_5,param_2,lVar3 + 0x11,*param_1,
                                *(undefined8 *)(lVar3 + 8));
    return uVar2;
  }
  return 0;
}

