/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ae83c
 */

void FUN_008ae83c(long param_1,uint param_2)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  long *plVar4;
  ulong uVar5;
  long lVar6;
  undefined8 *puVar7;
  long *plVar8;
  undefined8 *puVar9;
  undefined4 *puVar10;
  long lVar11;
  undefined4 local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  puVar10 = (undefined4 *)(ulong)param_2;
  local_38 = *(long *)(lVar1 + 0x28);
  if (*(ulong *)(*(long *)(param_1 + 0x60) + 8) <= *(ulong *)(*(long *)(param_1 + 0x60) + 0x10)) {
    FUN_008b52c4(param_1,1);
  }
  if ((*(byte *)(param_1 + 2) >> 2 & 1) != 0) {
    FUN_008b63a4(param_1,param_1,param_1 + 0x38);
  }
  lVar6 = *(long *)(param_1 + 0x50);
  plVar4 = *(long **)(param_1 + 0x68);
  plVar8 = *(long **)(lVar6 + 0x18);
  if (plVar8 < plVar4 + 2) {
    if ((long)plVar4 - *(long *)(param_1 + 0x70) < 0x1f3f1) {
      if (*(long *)(param_1 + 0x48) - (long)plVar4 < 0x11) {
        local_3c = 1;
        iVar2 = FUN_008b3edc(param_1,&LAB_008aa604,&local_3c);
        if (iVar2 != 0) goto LAB_008ae9f8;
        lVar6 = *(long *)(param_1 + 0x50);
        plVar4 = *(long **)(param_1 + 0x68);
        plVar8 = *(long **)(lVar6 + 0x18);
      }
      if (plVar8 < plVar4 + 2) {
        *(long **)(lVar6 + 0x18) = plVar4 + 2;
      }
      goto LAB_008ae914;
    }
LAB_008ae9f8:
    FUN_008b9568(param_1,"stack overflow");
    if (*(long *)(lVar1 + 0x28) != local_38) goto LAB_008aea78;
    FUN_008aa5f4(param_1);
LAB_008aea20:
    iVar2 = __cxa_guard_acquire(&DAT_00d1f1e0);
    if (iVar2 != 0) {
                    /* try { // try from 008aea38 to 008aea3b has its CatchHandler @ 008aea50 */
      uVar3 = FUN_007fe1ec(DAT_00cca8c8);
      *(undefined8 *)(puVar10 + 0x76) = uVar3;
      __cxa_guard_release(&DAT_00d1f1e0);
    }
LAB_008ae944:
    plVar8 = (long *)((long)&DWORD_007f2ef0 + *(long *)(puVar10 + 0x76));
  }
  else {
LAB_008ae914:
    if ((int)param_2 < 1) {
      if ((int)param_2 < -9999) {
        plVar8 = (long *)FUN_008aea7c(param_1,param_2);
      }
      else {
        plVar8 = plVar4 + (long)(int)param_2 * 2;
      }
    }
    else {
      plVar8 = (long *)((*(long *)(param_1 + 0x70) + (long)puVar10 * 0x10) - 0x10);
      if (plVar4 <= plVar8) {
        puVar10 = &DAT_00d1f000;
        if ((DAT_00d1f1e0 & 1) == 0) goto LAB_008aea20;
        goto LAB_008ae944;
      }
    }
  }
  lVar11 = *plVar8;
  lVar6 = FUN_008b4d5c(param_1,*(undefined1 *)(lVar11 + 5),*(undefined8 *)(param_1 + 0x78),
                       *(undefined8 *)(lVar11 + 0x18));
  if (*(char *)(lVar11 + 5) != '\0') {
    uVar5 = 0;
    puVar7 = (undefined8 *)(lVar11 + 0x20);
    puVar9 = (undefined8 *)(lVar6 + 0x20);
    do {
      uVar3 = *puVar7;
      uVar5 = uVar5 + 1;
      puVar9[1] = puVar7[1];
      *puVar9 = uVar3;
      puVar7 = puVar7 + 2;
      puVar9 = puVar9 + 2;
    } while (uVar5 < *(byte *)(lVar11 + 5));
  }
  plVar4 = *(long **)(param_1 + 0x68);
  *plVar4 = lVar6;
  lVar6 = *(long *)(param_1 + 0x68);
  *(undefined4 *)((long)plVar4 + 0xc) = 7;
  *(long *)(param_1 + 0x68) = lVar6 + 0x10;
  if (*(long *)(lVar1 + 0x28) == local_38) {
    return;
  }
LAB_008aea78:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

