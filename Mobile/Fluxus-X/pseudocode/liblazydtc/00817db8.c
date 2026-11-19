/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00817db8
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00817db8(undefined8 param_1,ulong param_2)

{
  long lVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  undefined1 auStack_178 [320];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  iVar2 = FUN_008ab0e0(param_1,1);
  if (iVar2 == 3) {
    iVar2 = FUN_008af2b0(param_1,1);
    if (-1 < iVar2) {
LAB_00817e28:
      if (((DAT_00d1c478 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1c478), iVar3 != 0)) {
        DAT_00d1c472 = '\x01';
        _DAT_00d1c470 = 0xe50b;
        __cxa_atexit(&LAB_00817f5c,&DAT_00d1c470,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00d1c478);
      }
      if (DAT_00d1c472 == '\x01') {
        DAT_00d1c472 = '\0';
        _DAT_00d1c470 = _DAT_00d1c470 ^ 0xe56d;
      }
      iVar2 = FUN_008b3568(param_1,iVar2,&DAT_00d1c470,auStack_178);
      if (iVar2 != 0) {
        if (((param_2 & 1) == 0) && (iVar2 = FUN_008ab238(param_1,0xffffffff), iVar2 != 0)) {
          uVar4 = 0;
        }
        else {
          puVar5 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
          uVar4 = *puVar5;
        }
        FUN_008aa994(param_1,0xfffffffe);
        goto LAB_00817ed0;
      }
    }
  }
  else {
    iVar2 = FUN_008ab0e0(param_1,1);
    if (iVar2 == 7) {
      iVar2 = FUN_008aa984(param_1);
      iVar2 = -iVar2;
      goto LAB_00817e28;
    }
  }
  uVar4 = 0;
LAB_00817ed0:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

