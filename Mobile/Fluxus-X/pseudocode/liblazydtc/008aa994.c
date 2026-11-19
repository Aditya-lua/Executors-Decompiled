/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aa994
 */

void FUN_008aa994(long param_1,uint param_2)

{
  long lVar1;
  int iVar2;
  ulong uVar3;
  undefined4 *puVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  long lVar10;
  int local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  uVar3 = *(ulong *)(param_1 + 0x68);
  if ((int)param_2 < 0) {
    uVar6 = uVar3 + (long)(int)param_2 * 0x10 + 0x10;
  }
  else {
    uVar8 = uVar3 - *(long *)(param_1 + 0x70);
    lVar10 = (long)(int)param_2 - (long)(int)(uVar8 >> 4);
    lVar5 = *(long *)(param_1 + 0x50);
    uVar6 = *(ulong *)(lVar5 + 0x18);
    if (uVar6 < uVar3 + lVar10 * 0x10) {
      iVar2 = (int)lVar10;
      if ((8000 < iVar2) || (8000 < lVar10 + ((long)uVar8 >> 4))) {
LAB_008aab14:
        FUN_008b9568(param_1,"stack overflow");
        if (*(long *)(lVar1 + 0x28) == local_38) {
          FUN_008aa5f4(param_1);
        }
        goto LAB_008aab3c;
      }
      if (0 < iVar2) {
        if ((long)(*(long *)(param_1 + 0x48) - uVar3) <= (long)(ulong)(uint)(iVar2 << 4)) {
          local_3c = iVar2;
          iVar2 = FUN_008b3edc(param_1,&LAB_008aa604,&local_3c);
          if (iVar2 != 0) goto LAB_008aab14;
          lVar5 = *(long *)(param_1 + 0x50);
          uVar3 = *(ulong *)(param_1 + 0x68);
          uVar6 = *(ulong *)(lVar5 + 0x18);
        }
        uVar8 = uVar3 + lVar10 * 0x10;
        if (uVar6 < uVar8) {
          *(ulong *)(lVar5 + 0x18) = uVar8;
        }
      }
    }
    uVar6 = *(long *)(param_1 + 0x70) + (ulong)param_2 * 0x10;
    if (uVar3 < uVar6) {
      uVar8 = *(long *)(param_1 + 0x70) + (ulong)param_2 * 0x10;
      if (uVar8 <= uVar3 + 0x10) {
        uVar8 = uVar3 + 0x10;
      }
      if (uVar8 + ~uVar3 < 0x10) {
        uVar7 = uVar3;
      }
      else {
        uVar8 = (uVar8 + ~uVar3 >> 4) + 1;
        uVar9 = uVar8 & 0x1ffffffffffffffe;
        uVar7 = uVar3 + uVar9 * 0x10;
        puVar4 = (undefined4 *)(uVar3 + 0x1c);
        uVar3 = uVar9;
        do {
          uVar3 = uVar3 - 2;
          puVar4[-4] = 0;
          *puVar4 = 0;
          puVar4 = puVar4 + 8;
        } while (uVar3 != 0);
        if (uVar8 == uVar9) goto LAB_008aaaec;
      }
      do {
        uVar3 = uVar7 + 0x10;
        *(undefined4 *)(uVar7 + 0xc) = 0;
        uVar7 = uVar3;
      } while (uVar3 < uVar6);
    }
  }
LAB_008aaaec:
  *(ulong *)(param_1 + 0x68) = uVar6;
  if (*(long *)(lVar1 + 0x28) == local_38) {
    return;
  }
LAB_008aab3c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

