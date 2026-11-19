/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4a2f0
 */

undefined8
FUN_00b4a2f0(undefined8 param_1,undefined8 param_2,undefined8 param_3,long param_4,
            undefined8 param_5,void *param_6,ulong param_7)

{
  int iVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 local_a8;
  undefined1 auStack_a0 [64];
  
  iVar1 = EVP_MAC_init();
  if ((iVar1 == 0) || (uVar2 = EVP_MAC_CTX_get_mac_size(param_1), uVar2 == 0)) {
    lVar4 = 0;
LAB_00b4a438:
    lVar3 = 0;
  }
  else {
    lVar3 = EVP_MAC_CTX_dup(param_1);
    if ((lVar3 != 0) &&
       (((param_4 == 0 || (iVar1 = EVP_MAC_update(lVar3,param_4,param_5), iVar1 != 0)) &&
        (iVar1 = EVP_MAC_final(lVar3,auStack_a0,&local_a8,0x40), iVar1 != 0)))) {
      do {
        EVP_MAC_CTX_free(lVar3);
        lVar4 = EVP_MAC_CTX_dup(param_1);
        if ((lVar4 == 0) || (iVar1 = EVP_MAC_update(lVar4,auStack_a0,local_a8), iVar1 == 0))
        goto LAB_00b4a438;
        lVar3 = 0;
        if (((uVar2 < param_7) && (lVar3 = EVP_MAC_CTX_dup(lVar4), lVar3 == 0)) ||
           ((param_4 != 0 && (iVar1 = EVP_MAC_update(lVar4,param_4,param_5), iVar1 == 0))))
        goto LAB_00b4a444;
        if (param_7 < uVar2 || param_7 - uVar2 == 0) {
          iVar1 = EVP_MAC_final(lVar4,auStack_a0,&local_a8,0x40);
          if (iVar1 == 0) goto LAB_00b4a444;
          memcpy(param_6,auStack_a0,param_7);
          uVar5 = 1;
          break;
        }
        iVar1 = EVP_MAC_final(lVar4,param_6,0,param_7);
        if (iVar1 == 0) goto LAB_00b4a444;
        EVP_MAC_CTX_free(lVar4);
        param_6 = (void *)((long)param_6 + uVar2);
        iVar1 = EVP_MAC_final(lVar3,auStack_a0,&local_a8,0x40);
        lVar4 = 0;
        uVar5 = 0;
        param_7 = param_7 - uVar2;
      } while (iVar1 != 0);
      goto LAB_00b4a448;
    }
    lVar4 = 0;
  }
LAB_00b4a444:
  uVar5 = 0;
LAB_00b4a448:
  EVP_MAC_CTX_free(lVar4);
  EVP_MAC_CTX_free(lVar3);
  OPENSSL_cleanse(auStack_a0,0x40);
  return uVar5;
}

