/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008acba4
 */

void FUN_008acba4(long param_1,uint param_2,char *param_3)

{
  long lVar1;
  int iVar2;
  size_t sVar3;
  undefined8 uVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  undefined4 *puVar8;
  undefined8 local_48;
  undefined4 local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  puVar8 = (undefined4 *)(ulong)param_2;
  if ((*(byte *)(param_1 + 2) >> 2 & 1) != 0) {
    FUN_008b63a4(param_1,param_1,param_1 + 0x38);
  }
  lVar6 = *(long *)(param_1 + 0x50);
  uVar5 = *(ulong *)(param_1 + 0x68);
  uVar7 = *(ulong *)(lVar6 + 0x18);
  if (uVar7 < uVar5 + 0x10) {
    if ((long)(uVar5 - *(long *)(param_1 + 0x70)) < 0x1f3f1) {
      if ((long)(*(long *)(param_1 + 0x48) - uVar5) < 0x11) {
        local_48 = CONCAT44(local_48._4_4_,1);
        iVar2 = FUN_008b3edc(param_1,&LAB_008aa604,&local_48);
        if (iVar2 != 0) goto LAB_008acd34;
        lVar6 = *(long *)(param_1 + 0x50);
        uVar5 = *(ulong *)(param_1 + 0x68);
        uVar7 = *(ulong *)(lVar6 + 0x18);
      }
      if (uVar7 < uVar5 + 0x10) {
        *(ulong *)(lVar6 + 0x18) = uVar5 + 0x10;
      }
      goto LAB_008acc64;
    }
LAB_008acd34:
    uVar5 = FUN_008b9568(param_1,"stack overflow");
    if (*(long *)(lVar1 + 0x28) != local_38) goto LAB_008acdb4;
    FUN_008aa5f4(param_1);
LAB_008acd5c:
    iVar2 = __cxa_guard_acquire(&DAT_00d1f1e0);
    if (iVar2 != 0) {
                    /* try { // try from 008acd74 to 008acd77 has its CatchHandler @ 008acd8c */
      uVar4 = FUN_007fe1ec(DAT_00cca8c8);
      *(undefined8 *)(puVar8 + 0x76) = uVar4;
      __cxa_guard_release(&DAT_00d1f1e0);
    }
LAB_008acc94:
    uVar7 = (long)&DWORD_007f2ef0 + *(long *)(puVar8 + 0x76);
  }
  else {
LAB_008acc64:
    if ((int)param_2 < 1) {
      if ((int)param_2 < -9999) {
        uVar7 = FUN_008aea7c(param_1,param_2);
      }
      else {
        uVar7 = uVar5 + (long)(int)param_2 * 0x10;
      }
    }
    else {
      uVar7 = (*(long *)(param_1 + 0x70) + (long)puVar8 * 0x10) - 0x10;
      if (uVar5 <= uVar7) {
        puVar8 = &DAT_00d1f000;
        if ((DAT_00d1f1e0 & 1) == 0) goto LAB_008acd5c;
        goto LAB_008acc94;
      }
    }
  }
  sVar3 = strlen(param_3);
  local_48 = FUN_008b9ff8(param_1,param_3,sVar3);
  local_3c = 5;
  FUN_008cadd4(param_1,uVar7,&local_48,*(undefined8 *)(param_1 + 0x68));
  lVar6 = *(long *)(param_1 + 0x68);
  *(long *)(param_1 + 0x68) = lVar6 + 0x10;
  uVar5 = (ulong)*(uint *)(lVar6 + 0xc);
  if (*(long *)(lVar1 + 0x28) == local_38) {
    return;
  }
LAB_008acdb4:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(uVar5);
}

