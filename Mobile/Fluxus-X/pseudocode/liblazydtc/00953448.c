/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00953448
 */

undefined8 FUN_00953448(long param_1,long param_2)

{
  undefined8 uVar1;
  undefined *puVar2;
  ulong uVar3;
  long lVar4;
  
  uVar3 = *(ulong *)(param_2 + 0x3a0);
  if ((uVar3 & 0x100a) == 0x1000) {
    FUN_00904b80(param_1,"Failed EPSV attempt, exiting");
    uVar1 = 8;
  }
  else {
    if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      FUN_00904c98(param_1,"Failed EPSV attempt. Disabling EPSV");
      uVar3 = *(ulong *)(param_2 + 0x3a0);
    }
    *(ulong *)(param_2 + 0x3a0) = uVar3 & 0xfffffffffffeffff;
    FUN_00906fc0(param_1,1);
    FUN_00906f54(param_1,param_2,1);
    *(uint *)(param_1 + 0x131c) = *(uint *)(param_1 + 0x131c) & 0xfffffff7;
    uVar1 = FUN_009453ec(param_1,param_2 + 0x428,&DAT_002b6c62,&DAT_002ab71b);
    if ((int)uVar1 == 0) {
      *(int *)(param_2 + 0x528) = *(int *)(param_2 + 0x528) + 1;
      lVar4 = *(long *)(param_1 + 0x20);
      if ((((ulong)*(byte *)(lVar4 + 0x536) != 0x1e) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)
          ) && (((*(long *)(param_1 + 0x12a0) == 0 ||
                 (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) && (0 < DAT_00cc46c0)))) {
        if (lVar4 == 0) {
          puVar2 = &DAT_002c11b5;
        }
        else {
          puVar2 = (&PTR_DAT_00c508c0)[*(byte *)(lVar4 + 0x536)];
        }
        FUN_00905258(param_1,"[%s] -> [%s]",puVar2,&DAT_002ab71b);
      }
      uVar1 = 0;
      *(undefined1 *)(lVar4 + 0x536) = 0x1e;
    }
  }
  return uVar1;
}

