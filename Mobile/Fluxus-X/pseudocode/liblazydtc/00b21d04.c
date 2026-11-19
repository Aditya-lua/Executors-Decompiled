/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b21d04
 */

ulong FUN_00b21d04(undefined8 *param_1,long param_2,undefined8 param_3,undefined8 param_4,
                  undefined8 param_5,undefined8 param_6)

{
  int iVar1;
  long lVar2;
  ulong uVar3;
  
  lVar2 = ossl_prov_digest_md(param_1 + 2);
  if ((lVar2 != 0) ||
     (lVar2 = ossl_prov_digest_fetch(param_1 + 2,*param_1,&DAT_002ac629,0), uVar3 = 0, lVar2 != 0))
  {
    if (param_2 != 0) {
      uVar3 = ossl_sm2_decrypt(param_1[1],lVar2,param_5,param_6,param_2,param_3);
      return uVar3;
    }
    iVar1 = ossl_sm2_plaintext_size(param_5,param_6,param_3);
    uVar3 = (ulong)(iVar1 != 0);
  }
  return uVar3;
}

