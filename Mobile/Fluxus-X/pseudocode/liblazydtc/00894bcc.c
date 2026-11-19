/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00894bcc
 */

void FUN_00894bcc(undefined8 param_1,long param_2,undefined8 *param_3,long param_4,ulong param_5)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 local_c0;
  undefined **local_b8;
  undefined8 uStack_b0;
  undefined8 *local_a8;
  void *pvStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  void *local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined1 local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  local_b8 = &PTR_FUN_00c4b0b0;
  pvStack_a0 = (void *)0x0;
  local_a8 = (undefined8 *)0x0;
  uStack_90 = 0;
  local_98 = 0;
  uStack_80 = 0;
  local_88 = (void *)0x0;
  local_78 = 0;
  local_70 = 0x40;
  uStack_b0 = param_1;
  if (param_5 < *(ulong *)(param_4 + 0x28)) {
    do {
      lVar3 = *(long *)(*(long *)(param_4 + 0x20) + param_5 * 8);
      iVar1 = *(int *)(lVar3 + 8);
      if (lVar3 == 0 || iVar1 != DAT_00d1b170) {
        if ((lVar3 == 0) || (iVar1 != DAT_00d1b1d0)) {
          if ((lVar3 != 0) && ((iVar1 == DAT_00d1b220 && (*(int *)(lVar3 + 0x40) != 0)))) {
                    /* try { // try from 00894cb0 to 00894cbb has its CatchHandler @ 00894db8 */
            FUN_00894dec(&pvStack_a0,lVar3 + 0x20);
          }
        }
        else {
                    /* try { // try from 00894c50 to 00894c5b has its CatchHandler @ 00894dc0 */
          FUN_00894dec(&pvStack_a0,lVar3 + 0x20);
        }
      }
      else if (*(long *)(lVar3 + 0x28) != 0) {
        puVar4 = *(undefined8 **)(lVar3 + 0x20);
        lVar3 = *(long *)(lVar3 + 0x28) << 3;
        do {
          local_c0 = *puVar4;
                    /* try { // try from 00894cd8 to 00894ce3 has its CatchHandler @ 00894dc4 */
          FUN_00894dec(&pvStack_a0,&local_c0);
          lVar3 = lVar3 + -8;
          puVar4 = puVar4 + 1;
        } while (lVar3 != 0);
      }
      param_5 = param_5 + 1;
    } while (param_5 < *(ulong *)(param_4 + 0x28));
  }
                    /* try { // try from 00894cfc to 00894db7 has its CatchHandler @ 00894dbc */
  (**(code **)*param_3)(param_3,&local_b8);
  if (local_a8 == (undefined8 *)0x0) {
    local_b8 = &PTR_FUN_00c4b0b0;
    if (pvStack_a0 != (void *)0x0) {
      operator_delete(pvStack_a0);
      pvStack_a0 = (void *)0x0;
      operator_delete(local_88);
      local_98 = 0;
      uStack_90 = 0;
      local_88 = (void *)0x0;
      operator_delete((void *)0x0);
      uStack_80 = 0;
      local_70 = 0x40;
    }
    operator_delete(local_88);
    if (*(long *)(lVar2 + 0x28) == local_68) {
      return;
    }
  }
  else if (*(long *)(lVar2 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
    FUN_0087fcd8((long)param_3 + 0xc,
                 "Local %s used in the repeat..until condition is undefined because continue statement on line %d jumps over it"
                 ,*local_a8,*(int *)(param_2 + 0xc) + 1);
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

