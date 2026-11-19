/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084aa7c
 */

void FUN_0084aa7c(undefined8 param_1,undefined8 param_2,undefined8 *param_3,undefined8 param_4,
                 uint param_5)

{
  long lVar1;
  ulong uVar2;
  undefined8 uVar3;
  void *local_c0;
  void *pvStack_b8;
  long local_b0;
  undefined1 uStack_a8;
  undefined7 local_a7;
  undefined1 uStack_a0;
  undefined8 uStack_9f;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined1 local_80;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined1 local_68;
  undefined1 local_60;
  undefined8 local_58;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  local_90 = 0;
  uStack_88 = 0;
  local_80 = 0;
  local_78 = 0;
  uStack_70 = 0;
  local_68 = 0;
  local_60 = 0;
  local_58 = 0;
  pvStack_b8 = (void *)0x0;
  local_c0 = (void *)0x0;
  uStack_a8 = 0;
  local_b0 = 0;
  uStack_9f = 0;
  local_a7 = 0;
  uStack_a0 = 0;
                    /* try { // try from 0084aadc to 0084ab0f has its CatchHandler @ 0084ab7c */
  uVar2 = FUN_0084abb8(param_4,param_1,param_2,&local_c0,param_5 | 0x1040);
  FUN_0084aeac(param_3,param_1,param_2,&local_c0,param_5 >> 0xb & 1);
  if (local_c0 != (void *)0x0) {
    pvStack_b8 = local_c0;
    operator_delete(local_c0,local_b0 - (long)local_c0);
  }
  if ((uVar2 & 1) == 0) {
    uVar3 = 0;
  }
  else if (*(char *)(param_3 + 0xb) == '\x01') {
    uVar3 = 0;
    param_3[1] = *param_3;
  }
  else {
    uVar3 = 1;
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

