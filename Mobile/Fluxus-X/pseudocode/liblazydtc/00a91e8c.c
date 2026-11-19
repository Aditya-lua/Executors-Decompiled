/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a91e8c
 */

undefined8 FUN_00a91e8c(long param_1,long param_2,void *param_3,undefined4 param_4)

{
  int iVar1;
  long lVar2;
  undefined8 local_40;
  undefined8 uStack_38;
  
  if (param_2 != 0 || param_3 != (void *)0x0) {
    lVar2 = *(long *)(param_1 + 0x78);
    *(undefined8 *)(lVar2 + 0xa8) = 0;
    *(undefined8 *)(lVar2 + 0xb0) = 0;
    *(undefined8 *)(lVar2 + 0xb8) = 0;
    *(undefined8 *)(lVar2 + 200) = 0xffffffffffffffff;
    if (param_3 == (void *)0x0) {
      FUN_00a91ab4(param_1,param_2,0,param_4);
    }
    else {
      local_40 = 0;
      uStack_38 = 0;
      iVar1 = *(int *)(lVar2 + 0xc4);
      if (iVar1 < 0x11) {
        memcpy((void *)((long)register0x00000008 + (-0x30 - (long)iVar1)),param_3,(long)iVar1);
      }
      FUN_00a91ab4(param_1,param_2,&local_40,param_4);
      *(undefined8 *)(lVar2 + 0x78) = *(undefined8 *)(lVar2 + 0x24);
      *(undefined4 *)(lVar2 + 0x80) = *(undefined4 *)(lVar2 + 0x2c);
    }
  }
  return 1;
}

