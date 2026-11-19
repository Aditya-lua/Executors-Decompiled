/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00935b84
 */

int FUN_00935b84(long param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4,
                undefined1 *param_5)

{
  byte bVar1;
  int iVar2;
  long *plVar3;
  
  plVar3 = *(long **)(param_1 + 0x138);
  if (plVar3 == (long *)0x0) {
    iVar2 = FUN_009357d8(param_1,*(undefined8 *)(param_1 + 0x1158));
    if (iVar2 != 0) {
      return iVar2;
    }
    plVar3 = *(long **)(param_1 + 0x138);
    *param_4 = 0;
    *param_5 = 0;
    if (plVar3 == (long *)0x0) {
      iVar2 = 0x1a;
      bVar1 = *(byte *)(param_1 + 0xa85);
      goto joined_r0x00935c44;
    }
  }
  else {
    *param_4 = 0;
    *param_5 = 0;
  }
  iVar2 = (**(code **)(*plVar3 + 0x10))(param_1,plVar3,param_2,param_3,param_4,param_5);
  bVar1 = *(byte *)(param_1 + 0xa85);
joined_r0x00935c44:
  if (((bVar1 >> 4 & 1) != 0) &&
     (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) &&
      (0 < DAT_00cc46a0)))) {
    FUN_00904f80(param_1,"client_read(len=%zu) -> %d, nread=%zu, eos=%d",param_3,iVar2,*param_4,
                 *param_5);
  }
  return iVar2;
}

