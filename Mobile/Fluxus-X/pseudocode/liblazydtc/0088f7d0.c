/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088f7d0
 */

void FUN_0088f7d0(undefined8 *param_1,long param_2,undefined4 param_3)

{
  uint uVar1;
  int iVar2;
  uint uVar3;
  undefined4 uVar4;
  int iVar5;
  long lVar6;
  
  uVar4 = *(undefined4 *)((long)param_1 + 0x64c);
  lVar6 = *(long *)(param_2 + 0x20);
                    /* try { // try from 0088f7f8 to 0088f88f has its CatchHandler @ 0088f890 */
  iVar5 = FUN_0088df20(param_1,lVar6);
  if (iVar5 < 0) {
    iVar5 = *(int *)((long)param_1 + 0x64c);
    uVar1 = iVar5 + 1;
    if (0xff < uVar1) {
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(lVar6 + 0xc,
                   "Out of registers when trying to allocate %d registers: exceeded limit %d",1,0xff
                  );
    }
    *(uint *)((long)param_1 + 0x64c) = uVar1;
    uVar3 = *(uint *)(param_1 + 0xca);
    if (*(uint *)(param_1 + 0xca) <= uVar1) {
      uVar3 = uVar1;
    }
    *(uint *)(param_1 + 0xca) = uVar3;
    iVar5 = FUN_00891438(param_1,lVar6,iVar5,0xff);
  }
  iVar2 = *(uint *)(param_2 + 0x1c) + 0x32;
  if (2 < *(uint *)(param_2 + 0x1c)) {
    iVar2 = 0;
  }
  FUN_00875b54(*param_1,iVar2,param_3,iVar5,0);
  *(undefined4 *)((long)param_1 + 0x64c) = uVar4;
  return;
}

