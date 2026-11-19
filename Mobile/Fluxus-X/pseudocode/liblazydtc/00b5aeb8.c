/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5aeb8
 */

undefined8 FUN_00b5aeb8(long param_1,undefined8 *param_2,size_t param_3,long param_4,long param_5)

{
  int iVar1;
  undefined8 *puVar2;
  long lVar3;
  undefined8 *__src;
  undefined8 uVar4;
  undefined8 *puVar5;
  
  puVar5 = *(undefined8 **)(param_1 + 0xf8);
  __src = puVar5 + 0xd;
  uVar4 = *puVar5;
  if (((param_4 == 0) || (param_5 == 0)) ||
     ((iVar1 = FUN_00b5b07c(puVar5,0,param_4,param_5,0,0,0,0), iVar1 != 0 &&
      (iVar1 = FUN_00b5b07c(puVar5,1,param_4,param_5,0,0,0,0), iVar1 != 0)))) {
    iVar1 = EVP_MAC_init(uVar4,puVar5 + 5,puVar5[4],0);
    if (iVar1 != 0) {
      puVar2 = __src;
      while (iVar1 = EVP_MAC_update(uVar4,puVar2,puVar5[4]), iVar1 != 0) {
        if (param_3 <= (ulong)puVar5[4]) {
          iVar1 = EVP_MAC_final(uVar4,__src,0,0x40);
          if (iVar1 == 0) {
            return 0;
          }
          memcpy(param_2,__src,param_3);
          uVar4 = *(undefined8 *)(param_1 + 0xf8);
          iVar1 = FUN_00b5b07c(uVar4,0,param_4,param_5,0,0,0,0);
          if (iVar1 == 0) {
            return 0;
          }
          if (param_5 == 0) {
            return 1;
          }
          iVar1 = FUN_00b5b07c(uVar4,1,param_4,param_5,0,0,0,0);
          if (iVar1 == 0) {
            return 0;
          }
          return 1;
        }
        iVar1 = EVP_MAC_final(uVar4,param_2,0,param_3);
        if (iVar1 == 0) {
          return 0;
        }
        lVar3 = puVar5[4];
        param_3 = param_3 - lVar3;
        iVar1 = EVP_MAC_init(uVar4,puVar5 + 5,lVar3,0);
        puVar2 = param_2;
        param_2 = (undefined8 *)((long)param_2 + lVar3);
        if (iVar1 == 0) {
          return 0;
        }
      }
    }
  }
  return 0;
}

