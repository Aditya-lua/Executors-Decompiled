/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008acec0
 */

void FUN_008acec0(long param_1,uint param_2,undefined4 param_3)

{
  long lVar1;
  int iVar2;
  ulong uVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  long lVar6;
  undefined8 *puVar7;
  undefined4 *puVar8;
  undefined4 local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  puVar8 = (undefined4 *)(ulong)param_2;
  if ((*(byte *)(param_1 + 2) >> 2 & 1) != 0) {
    FUN_008b63a4(param_1,param_1,param_1 + 0x38);
  }
  lVar6 = *(long *)(param_1 + 0x50);
  puVar5 = *(undefined8 **)(param_1 + 0x68);
  puVar7 = *(undefined8 **)(lVar6 + 0x18);
  if (puVar7 < puVar5 + 2) {
    if ((long)puVar5 - *(long *)(param_1 + 0x70) < 0x1f3f1) {
      if (*(long *)(param_1 + 0x48) - (long)puVar5 < 0x11) {
        local_3c = 1;
        iVar2 = FUN_008b3edc(param_1,&LAB_008aa604,&local_3c);
        if (iVar2 != 0) goto LAB_008ad02c;
        lVar6 = *(long *)(param_1 + 0x50);
        puVar5 = *(undefined8 **)(param_1 + 0x68);
        puVar7 = *(undefined8 **)(lVar6 + 0x18);
      }
      if (puVar7 < puVar5 + 2) {
        *(undefined8 **)(lVar6 + 0x18) = puVar5 + 2;
      }
      goto LAB_008acf80;
    }
LAB_008ad02c:
    uVar3 = FUN_008b9568(param_1,"stack overflow");
    if (*(long *)(lVar1 + 0x28) != local_38) goto LAB_008ad0ac;
    FUN_008aa5f4(param_1);
LAB_008ad054:
    iVar2 = __cxa_guard_acquire(&DAT_00d1f1e0);
    if (iVar2 != 0) {
                    /* try { // try from 008ad06c to 008ad06f has its CatchHandler @ 008ad084 */
      uVar4 = FUN_007fe1ec(DAT_00cca8c8);
      *(undefined8 *)(puVar8 + 0x76) = uVar4;
      __cxa_guard_release(&DAT_00d1f1e0);
    }
LAB_008acfb0:
    puVar7 = (undefined8 *)((long)&DWORD_007f2ef0 + *(long *)(puVar8 + 0x76));
  }
  else {
LAB_008acf80:
    if ((int)param_2 < 1) {
      if ((int)param_2 < -9999) {
        puVar7 = (undefined8 *)FUN_008aea7c(param_1,param_2);
      }
      else {
        puVar7 = puVar5 + (long)(int)param_2 * 2;
      }
    }
    else {
      puVar7 = (undefined8 *)((*(long *)(param_1 + 0x70) + (long)puVar8 * 0x10) - 0x10);
      if (puVar5 <= puVar7) {
        puVar8 = &DAT_00d1f000;
        if ((DAT_00d1f1e0 & 1) == 0) goto LAB_008ad054;
        goto LAB_008acfb0;
      }
    }
  }
  puVar5 = (undefined8 *)FUN_008bb19c(*puVar7,param_3);
  puVar7 = *(undefined8 **)(param_1 + 0x68);
  uVar4 = *puVar5;
  puVar7[1] = puVar5[1];
  *puVar7 = uVar4;
  uVar3 = (ulong)*(uint *)(*(long *)(param_1 + 0x68) + 0xc);
  *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + 0x10;
  if (*(long *)(lVar1 + 0x28) == local_38) {
    return;
  }
LAB_008ad0ac:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(uVar3);
}

