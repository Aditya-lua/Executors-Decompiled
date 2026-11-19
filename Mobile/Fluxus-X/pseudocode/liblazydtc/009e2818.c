/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e2818
 */

undefined8 ssl3_do_write(undefined4 *param_1,ulong param_2)

{
  int iVar1;
  undefined8 uVar2;
  long local_28;
  
  local_28 = 0;
  iVar1 = ssl3_write_bytes(param_1,param_2,
                           *(long *)(*(long *)(param_1 + 0x22) + 8) + *(long *)(param_1 + 0x28),
                           *(undefined8 *)(param_1 + 0x26),&local_28);
  if ((iVar1 < 1) ||
     ((((int)param_2 == 0x16 &&
       (((((*(byte *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) != 0 ||
          (iVar1 = **(int **)(param_1 + 2), iVar1 < 0x304)) || (iVar1 == 0x10000)) ||
        ((0x2b < (uint)param_1[0x17] ||
         ((1L << ((ulong)(uint)param_1[0x17] & 0x3f) & 0xc0200000000U) == 0)))))) &&
      (iVar1 = ssl3_finish_mac(param_1,*(long *)(*(long *)(param_1 + 0x22) + 8) +
                                       *(long *)(param_1 + 0x28),local_28), iVar1 == 0)))) {
    uVar2 = 0xffffffff;
  }
  else if (*(long *)(param_1 + 0x26) - local_28 == 0) {
    if (*(code **)(param_1 + 0x130) == (code *)0x0) {
      uVar2 = 1;
    }
    else {
      uVar2 = 1;
      (**(code **)(param_1 + 0x130))
                (1,*param_1,param_2 & 0xffffffff,*(undefined8 *)(*(long *)(param_1 + 0x22) + 8),
                 *(long *)(param_1 + 0x28) + local_28,param_1,*(undefined8 *)(param_1 + 0x132));
    }
  }
  else {
    uVar2 = 0;
    *(long *)(param_1 + 0x26) = *(long *)(param_1 + 0x26) - local_28;
    *(long *)(param_1 + 0x28) = *(long *)(param_1 + 0x28) + local_28;
  }
  return uVar2;
}

