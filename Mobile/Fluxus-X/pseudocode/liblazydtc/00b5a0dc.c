/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5a0dc
 */

ulong FUN_00b5a0dc(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                  undefined8 param_5,undefined8 param_6,undefined8 param_7)

{
  int iVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  
  lVar4 = *(long *)(param_1 + 0xf8);
  EVP_MD_CTX_free(*(undefined8 *)(lVar4 + 0x18));
  lVar2 = EVP_MD_CTX_new();
  *(long *)(lVar4 + 0x18) = lVar2;
  uVar3 = 0;
  if (lVar2 != 0) {
    uVar3 = FUN_00b5a564(param_1,lVar4 + 0x28,0xff,param_2,param_3,param_4,param_5,param_6,param_7);
    if ((int)uVar3 != 0) {
      iVar1 = FUN_00b5a564(param_1,lVar4 + 0x97,0,lVar4 + 0x28,*(undefined8 *)(param_1 + 0xe8),0,0,0
                           ,0);
      uVar3 = (ulong)(iVar1 != 0);
    }
  }
  return uVar3;
}

