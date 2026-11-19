/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b3d00
 */

void FUN_008b3d00(long param_1,undefined8 param_2)

{
  ulong uVar1;
  long lVar2;
  undefined8 uVar3;
  int iVar4;
  long lVar5;
  long *plVar6;
  undefined1 auStack_148 [256];
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  plVar6 = *(long **)(param_1 + 0x50);
  if ((*(int *)(plVar6[1] + 0xc) == 7) && (*(char *)(*(long *)plVar6[1] + 6) == '\0')) {
    uVar3 = FUN_008b9674(auStack_148,0x100,*(long *)(*plVar6 + 0x70) + 0x18,
                         *(undefined4 *)(*(long *)(*plVar6 + 0x70) + 0x14));
    lVar5 = *plVar6;
    iVar4 = 0;
    if ((plVar6[4] != 0) && (uVar1 = plVar6[4] - *(long *)(lVar5 + 0x30), iVar4 = 0, uVar1 != 0)) {
      iVar4 = (int)(uVar1 >> 2) + -1;
    }
    if (*(long *)(lVar5 + 0x90) == 0) {
      iVar4 = 0;
    }
    else {
      iVar4 = *(int *)(*(long *)(lVar5 + 8) + (long)(iVar4 >> (*(uint *)(lVar5 + 0xa8) & 0x1f)) * 4)
              + (uint)*(byte *)(*(long *)(lVar5 + 0x90) + (long)iVar4);
    }
    FUN_008b9568(param_1,"%s:%d: %s",uVar3,iVar4,param_2);
    if (*(long *)(lVar2 + 0x28) == local_48) {
      return;
    }
  }
  else if (*(long *)(lVar2 + 0x28) == local_48) {
    FUN_008ac4a8();
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

