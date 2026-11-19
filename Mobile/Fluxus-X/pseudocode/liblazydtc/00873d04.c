/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00873d04
 */

int FUN_00873d04(long param_1,byte param_2,undefined1 param_3)

{
  long lVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  int iVar5;
  ulong local_c0;
  undefined8 uStack_b8;
  void *local_b0;
  undefined8 uStack_a8;
  undefined4 local_a0;
  ulong local_98;
  undefined8 uStack_90;
  void *local_88;
  ulong uStack_80;
  undefined8 local_78;
  void *pvStack_70;
  void *local_68;
  void *pvStack_60;
  long local_58;
  ulong uStack_50;
  undefined8 local_48;
  void *pvStack_40;
  long local_38;
  
  lVar3 = tpidr_el0;
  local_38 = *(long *)(lVar3 + 0x28);
  lVar1 = *(long *)(param_1 + 8);
  uVar2 = *(ulong *)(param_1 + 0x10);
  local_a0 = 0;
  uStack_b8 = 0;
  local_c0 = 0;
  local_b0 = (void *)0x0;
  uStack_90 = 0;
  local_98 = 0;
  uStack_80 = 0;
  local_88 = (void *)0x0;
  pvStack_70 = (void *)0x0;
  local_78 = 0;
  pvStack_60 = (void *)0x0;
  local_68 = (void *)0x0;
  uStack_50 = 0;
  local_58 = 0;
  pvStack_40 = (void *)0x0;
  local_48 = 0;
  uStack_a8 = (ulong)CONCAT13(param_3,(uint3)param_2 << 8);
  if (uVar2 < *(ulong *)(param_1 + 0x18)) {
                    /* try { // try from 00873d64 to 00873d6f has its CatchHandler @ 00873e64 */
    FUN_00879ac0(uVar2,&local_c0);
    lVar4 = uVar2 + 0x88;
    *(long *)(param_1 + 0x10) = lVar4;
  }
  else {
                    /* try { // try from 00873d7c to 00873d83 has its CatchHandler @ 00873e5c */
    lVar4 = FUN_0087987c((long *)(param_1 + 8),&local_c0);
  }
  *(long *)(param_1 + 0x10) = lVar4;
  *(undefined1 *)(param_1 + 0xf0) = 0;
  *(undefined4 *)(param_1 + 0x1a0) = 0;
  iVar5 = (int)((long)(uVar2 - lVar1) >> 3) * -0xf0f0f0f;
  *(int *)(param_1 + 0x20) = iVar5;
  if ((uStack_50 & 1) != 0) {
    operator_delete(pvStack_40,uStack_50 & 0xfffffffffffffffe);
  }
  if (local_68 != (void *)0x0) {
    pvStack_60 = local_68;
    operator_delete(local_68,local_58 - (long)local_68);
  }
  if ((uStack_80 & 1) != 0) {
    operator_delete(pvStack_70,uStack_80 & 0xfffffffffffffffe);
  }
  if ((local_98 & 1) != 0) {
    operator_delete(local_88,local_98 & 0xfffffffffffffffe);
  }
  if ((local_c0 & 1) != 0) {
    operator_delete(local_b0,local_c0 & 0xfffffffffffffffe);
  }
  if (*(long *)(lVar3 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar5;
}

