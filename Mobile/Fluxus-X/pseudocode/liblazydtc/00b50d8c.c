/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b50d8c
 */

ulong FUN_00b50d8c(undefined8 *param_1,uint param_2,undefined4 param_3,long param_4)

{
  bool bVar1;
  int iVar2;
  ulong uVar3;
  uint uVar4;
  uint uVar5;
  long lVar6;
  undefined1 auStack_80 [64];
  
  lVar6 = param_1[0xb];
  uVar3 = ossl_prov_is_running();
  if ((int)uVar3 == 0) {
    return uVar3;
  }
  if ((param_2 & 3) == 0) {
    return 1;
  }
  if (lVar6 != param_4) {
    ERR_new();
    ERR_set_debug("providers/implementations/keymgmt/ecx_kmgmt.c",0x2f9,"ecx_validate");
    ERR_set_error(0x39,0xad,0);
    return 0;
  }
  if ((param_2 >> 1 & 1) == 0) {
    uVar5 = 1;
  }
  else {
    uVar5 = *(byte *)(param_1 + 2) & 1;
  }
  uVar4 = (param_2 & 1) == 0 & uVar5;
  if (((param_2 & 1) != 0) && (uVar5 != 0)) {
    uVar4 = (uint)(param_1[10] != 0);
  }
  bVar1 = (param_2 & 3) != 3;
  uVar3 = (ulong)(bVar1 & uVar4);
  if (bVar1) {
    return uVar3;
  }
  if (uVar4 == 0) {
    return uVar3;
  }
  switch(param_3) {
  case 0:
    ossl_x25519_public_from_private(auStack_80,param_1[10]);
    goto LAB_00b50ec8;
  case 1:
    ossl_x448_public_from_private(auStack_80,param_1[10]);
    goto LAB_00b50ec8;
  case 2:
    uVar3 = ossl_ed25519_public_from_private(*param_1,auStack_80,param_1[10],param_1[1]);
    iVar2 = (int)uVar3;
    break;
  case 3:
    uVar3 = ossl_ed448_public_from_private(*param_1,auStack_80,param_1[10],param_1[1]);
    iVar2 = (int)uVar3;
    break;
  default:
    return 0;
  }
  if (iVar2 == 0) {
    return uVar3;
  }
LAB_00b50ec8:
  iVar2 = CRYPTO_memcmp((void *)((long)param_1 + 0x11),auStack_80,param_1[0xb]);
  return (ulong)(iVar2 == 0);
}

