/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fc30c
 */

ulong FUN_009fc30c(long param_1,undefined8 param_2,ulong param_3,ulong *param_4)

{
  code *pcVar1;
  int iVar2;
  ulong uVar3;
  ulong uVar4;
  ulong local_38;
  
  if (param_4 != (ulong *)0x0) {
    *param_4 = 0;
  }
  if (param_1 == 0) {
    uVar4 = 0;
    goto LAB_009fc3a0;
  }
  if ((*(long *)(param_1 + 8) == 0) || (*(long *)(*(long *)(param_1 + 8) + 0x10) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_lib.c",0x15d,"bio_write_intern");
    ERR_set_error(0x20,0x79,0);
    uVar4 = 0xfffffffe;
    goto LAB_009fc3a0;
  }
  pcVar1 = *(code **)(param_1 + 0x18);
  if (*(code **)(param_1 + 0x10) == (code *)0x0) {
    if (pcVar1 != (code *)0x0) goto LAB_009fc3bc;
  }
  else {
    if (pcVar1 == (code *)0x0) {
      if (param_3 >> 0x1f != 0) {
        uVar4 = 0xffffffff;
        goto LAB_009fc3a0;
      }
      uVar4 = (**(code **)(param_1 + 0x10))(param_1,3,param_2,param_3 & 0xffffffff,0,1);
    }
    else {
LAB_009fc3bc:
      uVar4 = (*pcVar1)(param_1,3,param_2,param_3,0,0,1,0);
    }
    if ((int)uVar4 < 1) goto LAB_009fc3a0;
  }
  if (*(int *)(param_1 + 0x28) == 0) {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_lib.c",0x167,"bio_write_intern");
    ERR_set_error(0x20,0x78,0);
    uVar4 = 0xffffffff;
    goto LAB_009fc3a0;
  }
  uVar3 = (**(code **)(*(long *)(param_1 + 8) + 0x10))(param_1,param_2,param_3,&local_38);
  uVar4 = uVar3 & 0xffffffff;
  iVar2 = (int)uVar3;
  if (0 < iVar2) {
    *(ulong *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + local_38;
  }
  pcVar1 = *(code **)(param_1 + 0x18);
  if (*(code **)(param_1 + 0x10) == (code *)0x0) {
    if (pcVar1 != (code *)0x0) goto LAB_009fc498;
  }
  else if (pcVar1 == (code *)0x0) {
    if (param_3 >> 0x1f == 0) {
      if (iVar2 < 1) {
        uVar4 = (ulong)iVar2;
      }
      else {
        uVar4 = local_38;
        if (local_38 >> 0x1f != 0) goto LAB_009fc454;
      }
      uVar3 = (**(code **)(param_1 + 0x10))(param_1,0x83,param_2,param_3 & 0xffffffff,0,uVar4);
      uVar4 = uVar3;
      if (0 < (long)uVar3) {
        uVar4 = 1;
        local_38 = uVar3;
      }
    }
    else {
LAB_009fc454:
      uVar4 = 0xffffffffffffffff;
    }
  }
  else {
LAB_009fc498:
    uVar4 = (*pcVar1)(param_1,0x83,param_2,param_3,0,0,uVar4,&local_38);
  }
  if (param_4 != (ulong *)0x0) {
    *param_4 = local_38;
  }
LAB_009fc3a0:
  return uVar4 & 0xffffffff;
}

