/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ae174
 */

void FUN_008ae174(long param_1,uint param_2)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  long lVar5;
  undefined8 *puVar6;
  undefined4 *puVar7;
  undefined4 local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  puVar7 = (undefined4 *)(ulong)param_2;
  local_38 = *(long *)(lVar1 + 0x28);
  if ((*(byte *)(param_1 + 2) >> 2 & 1) != 0) {
    FUN_008b63a4(param_1,param_1,param_1 + 0x38);
  }
  lVar5 = *(long *)(param_1 + 0x50);
  puVar4 = *(undefined8 **)(param_1 + 0x68);
  puVar6 = *(undefined8 **)(lVar5 + 0x18);
  if (puVar6 < puVar4 + 2) {
    if ((long)puVar4 - *(long *)(param_1 + 0x70) < 0x1f3f1) {
      if (*(long *)(param_1 + 0x48) - (long)puVar4 < 0x11) {
        local_3c = 1;
        iVar2 = FUN_008b3edc(param_1,&LAB_008aa604,&local_3c);
        if (iVar2 != 0) goto LAB_008ae2e0;
        lVar5 = *(long *)(param_1 + 0x50);
        puVar4 = *(undefined8 **)(param_1 + 0x68);
        puVar6 = *(undefined8 **)(lVar5 + 0x18);
      }
      if (puVar6 < puVar4 + 2) {
        *(undefined8 **)(lVar5 + 0x18) = puVar4 + 2;
      }
      goto LAB_008ae230;
    }
LAB_008ae2e0:
    FUN_008b9568(param_1,"stack overflow");
    if (*(long *)(lVar1 + 0x28) != local_38) goto LAB_008ae360;
    FUN_008aa5f4(param_1);
LAB_008ae308:
    iVar2 = __cxa_guard_acquire(&DAT_00d1f1e0);
    if (iVar2 != 0) {
                    /* try { // try from 008ae320 to 008ae323 has its CatchHandler @ 008ae338 */
      uVar3 = FUN_007fe1ec(DAT_00cca8c8);
      *(undefined8 *)(puVar7 + 0x76) = uVar3;
      __cxa_guard_release(&DAT_00d1f1e0);
    }
LAB_008ae260:
    puVar6 = (undefined8 *)((long)&DWORD_007f2ef0 + *(long *)(puVar7 + 0x76));
  }
  else {
LAB_008ae230:
    if ((int)param_2 < 1) {
      if ((int)param_2 < -9999) {
        puVar6 = (undefined8 *)FUN_008aea7c(param_1,param_2);
      }
      else {
        puVar6 = puVar4 + (long)(int)param_2 * 2;
      }
    }
    else {
      puVar6 = (undefined8 *)((*(long *)(param_1 + 0x70) + (long)puVar7 * 0x10) - 0x10);
      if (puVar4 <= puVar6) {
        puVar7 = &DAT_00d1f000;
        if ((DAT_00d1f1e0 & 1) == 0) goto LAB_008ae308;
        goto LAB_008ae260;
      }
    }
  }
  iVar2 = FUN_008ba594(param_1,*puVar6,*(long *)(param_1 + 0x68) + -0x10);
  lVar5 = 0x10;
  if (iVar2 == 0) {
    lVar5 = -0x10;
  }
  *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + lVar5;
  if (*(long *)(lVar1 + 0x28) == local_38) {
    return;
  }
LAB_008ae360:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

