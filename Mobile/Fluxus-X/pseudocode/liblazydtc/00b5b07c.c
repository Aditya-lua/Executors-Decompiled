/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5b07c
 */

ulong FUN_00b5b07c(undefined8 *param_1,undefined1 param_2,long param_3,long param_4,long param_5,
                  long param_6,long param_7,long param_8)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  int iVar3;
  ulong uVar4;
  undefined8 uVar5;
  undefined1 local_64 [4];
  
  uVar5 = *param_1;
  puVar1 = param_1 + 5;
  local_64[0] = param_2;
  uVar4 = EVP_MAC_init(uVar5,puVar1,param_1[4],0);
  if ((int)uVar4 != 0) {
    puVar2 = param_1 + 0xd;
    uVar4 = EVP_MAC_update(uVar5,puVar2,param_1[4]);
    if (((((((int)uVar4 != 0) && (uVar4 = EVP_MAC_update(uVar5,local_64,1), (int)uVar4 != 0)) &&
          ((param_3 == 0 ||
           ((param_4 == 0 || (uVar4 = EVP_MAC_update(uVar5,param_3,param_4), (int)uVar4 != 0))))))
         && ((param_5 == 0 ||
             ((param_6 == 0 || (uVar4 = EVP_MAC_update(uVar5,param_5,param_6), (int)uVar4 != 0))))))
        && (((param_7 == 0 ||
             ((param_8 == 0 || (uVar4 = EVP_MAC_update(uVar5,param_7,param_8), (int)uVar4 != 0))))
            && (uVar4 = EVP_MAC_final(uVar5,puVar1,0,0x40), (int)uVar4 != 0)))) &&
       ((uVar4 = EVP_MAC_init(uVar5,puVar1,param_1[4],0), (int)uVar4 != 0 &&
        (uVar4 = EVP_MAC_update(uVar5,puVar2,param_1[4]), (int)uVar4 != 0)))) {
      iVar3 = EVP_MAC_final(uVar5,puVar2,0,0x40);
      uVar4 = (ulong)(iVar3 != 0);
    }
  }
  return uVar4;
}

