/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00956948
 */

void FUN_00956948(long param_1,long param_2)

{
  long lVar1;
  ulong uVar2;
  undefined8 uVar3;
  byte bVar4;
  byte local_3c [4];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  local_3c[0] = 0;
  uVar2 = FUN_00907858(param_2,0);
  if ((((uVar2 & 1) != 0) || (uVar3 = FUN_0096a268(param_1,param_2,0), (int)uVar3 == 0)) &&
     (uVar3 = FUN_00907508(param_1,0,0,local_3c), (int)uVar3 == 0)) {
    bVar4 = *(byte *)(param_2 + 0x523) & 0xfe | local_3c[0];
    *(byte *)(param_2 + 0x523) = bVar4;
    if (*(int *)(param_2 + 0x518) != 4) {
      *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x518) = 4;
      bVar4 = *(byte *)(param_2 + 0x523);
    }
    uVar3 = 0;
    if ((bVar4 & 1) != 0) {
      *(undefined ***)(param_2 + 0x3a8) = &PTR_s_imaps_00c50be0;
      *(undefined2 *)(param_2 + 0x4e0) = 0;
      *(undefined2 *)(param_2 + 0x4e4) = 0;
      *(ulong *)(param_2 + 0x3a0) = *(ulong *)(param_2 + 0x3a0) | 0x8000000;
      *(byte *)(param_2 + 0x523) = bVar4 & 0xfb;
      uVar3 = FUN_00956a58(param_1,"CAPABILITY");
      if ((int)uVar3 == 0) {
        *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x518) = 2;
      }
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

