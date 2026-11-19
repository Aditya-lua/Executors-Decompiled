/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a63d0
 */

undefined4 FUN_008a63d0(long param_1,undefined8 param_2,long param_3)

{
  undefined8 uVar1;
  undefined8 uVar2;
  long lVar3;
  undefined4 uVar4;
  long *plVar5;
  undefined4 *puVar6;
  undefined8 uVar7;
  ulong uVar8;
  long lVar9;
  ulong uVar10;
  undefined8 *puVar11;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  void *local_70;
  undefined8 uStack_68;
  undefined8 local_60;
  void *pvStack_58;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined1 local_40;
  long local_38;
  
  lVar3 = tpidr_el0;
  local_38 = *(long *)(lVar3 + 0x28);
  if ((((param_3 != 0) && (*(int *)(param_3 + 8) == DAT_00d1b240)) &&
      ((*(byte *)(param_3 + 0x28) & 1) == 0)) && (*(long *)(param_1 + 0x80) != 0)) {
    uVar8 = *(ulong *)(param_3 + 0x50);
    uVar10 = (uVar8 >> 4 ^ uVar8 >> 9) * -0x61c8864680b583eb >>
             ((ulong)*(byte *)(param_1 + 0x88) & 0x3f);
    if ((*(ulong *)(*(long *)(param_1 + 0x70) + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0) {
      do {
        if (*(ulong *)(*(long *)(param_1 + 0x58) + uVar10 * 0x10) == uVar8) {
          lVar9 = *(long *)(*(long *)(param_1 + 0x58) + uVar10 * 0x10 + 8);
          if (lVar9 != 0) {
            param_3 = *(long *)(lVar9 + 0x58);
          }
          break;
        }
        uVar10 = uVar10 + 1 & *(long *)(param_1 + 0x78) - 1U;
      } while ((*(ulong *)(*(long *)(param_1 + 0x70) + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) !=
               0);
    }
  }
  local_78 = param_2;
  plVar5 = (long *)FUN_008a659c(param_1 + 0xe0,&local_78);
  uVar1 = *(undefined8 *)(param_1 + 0x20);
  uVar2 = *(undefined8 *)(param_1 + 0x28);
  uVar7 = *(undefined8 *)(param_1 + 0x50);
  *plVar5 = param_3;
  local_40 = 0x40;
  pvStack_58 = (void *)0x0;
  local_60 = 0;
  uStack_48 = 0;
  local_50 = 0;
  uStack_68 = 0;
  local_70 = (void *)0x0;
  local_88 = 0;
  uStack_80 = 0;
                    /* try { // try from 008a64dc to 008a64ef has its CatchHandler @ 008a6574 */
  uVar4 = FUN_008a6690(param_3,&local_88,param_1 + 0x58,uVar1,uVar2,uVar7,&local_70);
                    /* try { // try from 008a64f8 to 008a64ff has its CatchHandler @ 008a6570 */
  puVar6 = (undefined4 *)FUN_008a6bb8(*(undefined8 *)(param_1 + 0x18),&local_78);
  *puVar6 = uVar4;
  if (local_70 != (void *)0x0) {
    puVar11 = (undefined8 *)((ulong)&local_70 | 8);
    operator_delete(local_70);
    local_70 = (void *)0x0;
    operator_delete(pvStack_58);
    *puVar11 = 0;
    puVar11[1] = 0;
    puVar11[2] = 0;
    operator_delete((void *)0x0);
    local_50 = 0;
    local_40 = 0x40;
  }
  operator_delete(pvStack_58);
  if (*(long *)(lVar3 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar4;
}

