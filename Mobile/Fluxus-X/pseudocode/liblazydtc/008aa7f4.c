/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aa7f4
 */

undefined8 FUN_008aa7f4(long param_1)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  code *pcVar5;
  long lVar6;
  undefined8 *puVar7;
  ulong uVar8;
  undefined4 local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (*(ulong *)(*(long *)(param_1 + 0x60) + 8) <= *(ulong *)(*(long *)(param_1 + 0x60) + 0x10)) {
    FUN_008b52c4(param_1,1);
  }
  if ((*(byte *)(param_1 + 2) >> 2 & 1) != 0) {
    FUN_008b63a4(param_1,param_1,param_1 + 0x38);
  }
  lVar4 = *(long *)(param_1 + 0x50);
  lVar6 = *(long *)(param_1 + 0x68);
  uVar8 = *(ulong *)(lVar4 + 0x18);
  if (uVar8 < lVar6 + 0x10U) {
    if (0x1f3f0 < lVar6 - *(long *)(param_1 + 0x70)) {
LAB_008aa92c:
      FUN_008b9568(param_1,"stack overflow");
      if (*(long *)(lVar1 + 0x28) == local_38) {
        FUN_008aa5f4(param_1);
      }
      goto LAB_008aa954;
    }
    if (*(long *)(param_1 + 0x48) - lVar6 < 0x11) {
      local_3c = 1;
      iVar2 = FUN_008b3edc(param_1,&LAB_008aa604,&local_3c);
      if (iVar2 != 0) goto LAB_008aa92c;
      lVar4 = *(long *)(param_1 + 0x50);
      lVar6 = *(long *)(param_1 + 0x68);
      uVar8 = *(ulong *)(lVar4 + 0x18);
    }
    if (uVar8 < lVar6 + 0x10U) {
      *(ulong *)(lVar4 + 0x18) = lVar6 + 0x10U;
    }
  }
  uVar3 = FUN_008b98d0(param_1);
  puVar7 = *(undefined8 **)(param_1 + 0x68);
  *puVar7 = uVar3;
  lVar4 = *(long *)(param_1 + 0x60);
  lVar6 = *(long *)(param_1 + 0x68);
  *(undefined4 *)((long)puVar7 + 0xc) = 9;
  pcVar5 = *(code **)(lVar4 + 0x660);
  *(long *)(param_1 + 0x68) = lVar6 + 0x10;
  if (pcVar5 != (code *)0x0) {
    (*pcVar5)(param_1,uVar3);
  }
  if (*(long *)(lVar1 + 0x28) == local_38) {
    return uVar3;
  }
LAB_008aa954:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

