/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009433b8
 */

int FUN_009433b8(long param_1,undefined8 param_2,long param_3,uint param_4)

{
  int iVar1;
  long lVar2;
  undefined4 uVar3;
  code *pcVar4;
  
  lVar2 = *(long *)(*(long *)(param_1 + 0x20) + 0x3a8);
  pcVar4 = *(code **)(lVar2 + 0x68);
  if (pcVar4 == (code *)0x0) {
    if ((param_3 != 0) || (iVar1 = 0, (param_4 & 1) != 0)) {
      uVar3 = 0x81;
      if ((param_4 & 1) == 0) {
        uVar3 = 1;
      }
      if ((param_3 == 0) || ((*(byte *)(lVar2 + 0x8d) & 0xc0) == 0)) {
        iVar1 = FUN_00934dd0(param_1,uVar3,param_2,param_3);
      }
      else {
        iVar1 = 0;
        if ((*(byte *)(param_1 + 0x1b2) >> 1 & 1) == 0) {
          iVar1 = FUN_00943e74(param_1,param_2,param_3);
        }
      }
    }
  }
  else {
    iVar1 = (*pcVar4)(param_1,param_2,param_3,param_4 & 1);
  }
  if ((iVar1 == 0) && ((param_4 & 1) != 0)) {
    *(uint *)(param_1 + 0x1b1) = *(uint *)(param_1 + 0x1b1) | 0x18;
  }
  if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
     (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) &&
      (0 < DAT_00cc46b0)))) {
    FUN_009050ec(param_1,"xfer_write_resp(len=%zu, eos=%d) -> %d",param_3,param_4 & 1,iVar1);
  }
  return iVar1;
}

