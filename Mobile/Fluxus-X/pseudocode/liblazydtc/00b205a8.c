/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b205a8
 */

undefined8 ossl_prov_digest_copy(undefined8 *param_1,undefined8 *param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  if ((param_2[1] == 0) || (uVar2 = EVP_MD_up_ref(param_2[1]), (int)uVar2 != 0)) {
    uVar2 = 0;
    if ((ENGINE *)param_2[2] != (ENGINE *)0x0) {
      iVar1 = ENGINE_init((ENGINE *)param_2[2]);
      if (iVar1 == 0) {
        EVP_MD_free(param_2[1]);
        return 0;
      }
      uVar2 = param_2[2];
    }
    param_1[2] = uVar2;
    uVar3 = *param_2;
    uVar2 = 1;
    param_1[1] = param_2[1];
    *param_1 = uVar3;
  }
  return uVar2;
}

