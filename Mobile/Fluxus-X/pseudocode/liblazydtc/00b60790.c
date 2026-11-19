/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b60790
 */

undefined8
FUN_00b60790(long param_1,char *param_2,undefined8 param_3,undefined8 param_4,undefined4 param_5)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  
  uVar2 = ossl_prov_is_running();
  if ((int)uVar2 == 0) {
    return uVar2;
  }
  uVar2 = FUN_00b5ffd4(param_1,param_3,param_4,param_5);
  if ((int)uVar2 == 0) {
    return uVar2;
  }
  if ((param_2 != (char *)0x0) &&
     (((*param_2 == '\0' || (iVar1 = OPENSSL_strcasecmp(param_1 + 0x34,param_2), iVar1 != 0)) &&
      (uVar2 = FUN_00b60444(param_1,param_2,*(undefined8 *)(param_1 + 8)), (int)uVar2 == 0)))) {
    return uVar2;
  }
  lVar3 = *(long *)(param_1 + 0x28);
  *(byte *)(param_1 + 0x1c) = *(byte *)(param_1 + 0x1c) & 0xfe;
  if (lVar3 == 0) {
    lVar3 = EVP_MD_CTX_new();
    *(long *)(param_1 + 0x28) = lVar3;
    uVar2 = 0;
    if (lVar3 == 0) goto LAB_00b60844;
  }
  iVar1 = EVP_DigestInit_ex2(lVar3,*(undefined8 *)(param_1 + 0x20),param_4);
  if (iVar1 != 0) {
    return 1;
  }
  uVar2 = *(undefined8 *)(param_1 + 0x28);
LAB_00b60844:
  EVP_MD_CTX_free(uVar2);
  *(undefined8 *)(param_1 + 0x28) = 0;
  return 0;
}

