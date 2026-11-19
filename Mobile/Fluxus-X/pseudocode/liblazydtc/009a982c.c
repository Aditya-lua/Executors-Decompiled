/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a982c
 */

undefined8 ssl3_shutdown(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  uint uVar3;
  undefined1 auStack_18 [8];
  
  if ((*(int *)(param_1 + 0x40) != 0) || (iVar1 = SSL_in_before(param_1), iVar1 != 0)) {
    *(undefined4 *)(param_1 + 0x44) = 3;
    return 1;
  }
  uVar3 = *(uint *)(param_1 + 0x44);
  if ((uVar3 & 1) == 0) {
    *(uint *)(param_1 + 0x44) = uVar3 | 1;
    ssl3_send_alert(param_1,1,0);
    if (*(int *)(param_1 + 0x1a4) != 0) {
      return 0xffffffff;
    }
  }
  else if (*(int *)(param_1 + 0x1a4) == 0) {
    if ((uVar3 >> 1 & 1) == 0) {
      (**(code **)(*(long *)(param_1 + 8) + 0x68))(param_1,0,0,0,0,0,auStack_18);
      uVar3 = *(uint *)(param_1 + 0x44);
      if ((uVar3 >> 1 & 1) == 0) {
        return 0xffffffff;
      }
      goto LAB_009a98f8;
    }
  }
  else {
    uVar2 = (**(code **)(*(long *)(param_1 + 8) + 0x78))(param_1);
    if ((int)uVar2 == -1) {
      return uVar2;
    }
  }
  uVar3 = *(uint *)(param_1 + 0x44);
LAB_009a98f8:
  if ((uVar3 == 3) && (*(int *)(param_1 + 0x1a4) == 0)) {
    return 1;
  }
  return 0;
}

