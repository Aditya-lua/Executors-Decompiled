/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ad4b0
 */

void FUN_008ad4b0(long param_1,uint param_2)

{
  long lVar1;
  int iVar2;
  ulong uVar3;
  undefined8 uVar4;
  long *plVar5;
  long lVar6;
  long *plVar7;
  long lVar8;
  undefined4 *puVar9;
  undefined4 local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  puVar9 = (undefined4 *)(ulong)param_2;
  local_38 = *(long *)(lVar1 + 0x28);
  if ((*(byte *)(param_1 + 2) >> 2 & 1) != 0) {
    FUN_008b63a4(param_1,param_1,param_1 + 0x38);
  }
  lVar6 = *(long *)(param_1 + 0x50);
  plVar5 = *(long **)(param_1 + 0x68);
  plVar7 = *(long **)(lVar6 + 0x18);
  if (plVar7 < plVar5 + 2) {
    if ((long)plVar5 - *(long *)(param_1 + 0x70) < 0x1f3f1) {
      if (*(long *)(param_1 + 0x48) - (long)plVar5 < 0x11) {
        local_3c = 1;
        iVar2 = FUN_008b3edc(param_1,&LAB_008aa604,&local_3c);
        if (iVar2 != 0) goto LAB_008ad688;
        lVar6 = *(long *)(param_1 + 0x50);
        plVar5 = *(long **)(param_1 + 0x68);
        plVar7 = *(long **)(lVar6 + 0x18);
      }
      if (plVar7 < plVar5 + 2) {
        *(long **)(lVar6 + 0x18) = plVar5 + 2;
      }
      goto LAB_008ad56c;
    }
LAB_008ad688:
    uVar3 = FUN_008b9568(param_1,"stack overflow");
    if (*(long *)(lVar1 + 0x28) != local_38) goto LAB_008ad708;
    FUN_008aa5f4(param_1);
LAB_008ad6b0:
    iVar2 = __cxa_guard_acquire(&DAT_00d1f1e0);
    if (iVar2 != 0) {
                    /* try { // try from 008ad6c8 to 008ad6cb has its CatchHandler @ 008ad6e0 */
      uVar4 = FUN_007fe1ec(DAT_00cca8c8);
      *(undefined8 *)(puVar9 + 0x76) = uVar4;
      __cxa_guard_release(&DAT_00d1f1e0);
    }
LAB_008ad59c:
    plVar7 = (long *)((long)&DWORD_007f2ef0 + *(long *)(puVar9 + 0x76));
  }
  else {
LAB_008ad56c:
    if ((int)param_2 < 1) {
      if ((int)param_2 < -9999) {
        plVar7 = (long *)FUN_008aea7c(param_1,param_2);
      }
      else {
        plVar7 = plVar5 + (long)(int)param_2 * 2;
      }
    }
    else {
      plVar7 = (long *)((*(long *)(param_1 + 0x70) + (long)puVar9 * 0x10) - 0x10);
      if (plVar5 <= plVar7) {
        puVar9 = &DAT_00d1f000;
        if ((DAT_00d1f1e0 & 1) == 0) goto LAB_008ad6b0;
        goto LAB_008ad59c;
      }
    }
  }
  iVar2 = *(int *)((long)plVar7 + 0xc);
  if (iVar2 == 0xc) {
    lVar6 = *(long *)(*(long *)(*plVar7 + 0x10) + 0x50);
  }
  else if (iVar2 == 8) {
    lVar6 = *(long *)(*plVar7 + 8);
  }
  else if (iVar2 == 6) {
    lVar6 = *(long *)(*plVar7 + 0x10);
  }
  else {
    lVar6 = *(long *)(*(long *)(param_1 + 0x60) + (long)iVar2 * 8 + 0x448);
  }
  if (lVar6 != 0) {
    plVar5 = *(long **)(param_1 + 0x68);
    *plVar5 = lVar6;
    lVar8 = *(long *)(param_1 + 0x68);
    *(undefined4 *)((long)plVar5 + 0xc) = 6;
    *(long *)(param_1 + 0x68) = lVar8 + 0x10;
  }
  uVar3 = (ulong)(lVar6 != 0);
  if (*(long *)(lVar1 + 0x28) == local_38) {
    return;
  }
LAB_008ad708:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(uVar3);
}

