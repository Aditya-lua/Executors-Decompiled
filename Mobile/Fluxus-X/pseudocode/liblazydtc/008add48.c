/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008add48
 */

void FUN_008add48(long param_1,uint param_2,int param_3)

{
  ulong uVar1;
  int iVar2;
  long lVar3;
  int iVar4;
  long lVar5;
  long lVar6;
  ulong uVar7;
  int local_4c;
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  iVar2 = param_3 - (param_2 + 1);
  lVar5 = *(long *)(param_1 + 0x68);
  if (iVar2 != 0 && (int)(param_2 + 1) <= param_3) {
    lVar6 = *(long *)(param_1 + 0x50);
    uVar7 = *(ulong *)(lVar6 + 0x18);
    if (uVar7 < (ulong)(lVar5 + (long)iVar2 * 0x10)) {
      if ((8000 < iVar2) || (8000 < (long)iVar2 + (lVar5 - *(long *)(param_1 + 0x70) >> 4))) {
LAB_008ade74:
        FUN_008b9568(param_1,"stack overflow");
        if (*(long *)(lVar3 + 0x28) == local_48) {
          FUN_008aa5f4(param_1);
        }
        goto LAB_008ade9c;
      }
      if (*(long *)(param_1 + 0x48) - lVar5 <= (long)(ulong)(uint)(iVar2 * 0x10)) {
        local_4c = iVar2;
        iVar4 = FUN_008b3edc(param_1,&LAB_008aa604,&local_4c);
        if (iVar4 != 0) goto LAB_008ade74;
        lVar6 = *(long *)(param_1 + 0x50);
        lVar5 = *(long *)(param_1 + 0x68);
        uVar7 = *(ulong *)(lVar6 + 0x18);
      }
      uVar1 = lVar5 + (long)iVar2 * 0x10;
      if (uVar7 < uVar1) {
        *(ulong *)(lVar6 + 0x18) = uVar1;
      }
    }
  }
  FUN_008b465c(param_1,lVar5 + (long)(int)~param_2 * 0x10,param_3);
  if (param_3 == -1) {
    if (*(ulong *)(*(long *)(param_1 + 0x50) + 0x18) <= *(ulong *)(param_1 + 0x68)) {
      *(ulong *)(*(long *)(param_1 + 0x50) + 0x18) = *(ulong *)(param_1 + 0x68);
    }
  }
  if (*(long *)(lVar3 + 0x28) == local_48) {
    return;
  }
LAB_008ade9c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

