/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bd4ec
 */

void FUN_008bd4ec(long param_1,long param_2,byte param_3)

{
  uint uVar1;
  long lVar2;
  bool bVar3;
  bool bVar4;
  int iVar5;
  undefined8 *puVar6;
  void *pvVar7;
  long lVar8;
  void *pvVar9;
  uint uVar10;
  ulong uVar11;
  undefined8 uVar12;
  undefined8 auStack_1b8 [42];
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  if (((param_3 ^ *(byte *)(param_2 + 7) == 0) & 1) == 0) {
    if ((param_3 & 1) == 0) {
      if ((*(byte *)(param_2 + 7) >> 1 & 1) != 0) {
        uVar10 = *(uint *)(param_2 + 8);
        pvVar7 = *(void **)(param_2 + 0x20);
        if (uVar10 == 0) {
          pvVar9 = (void *)0x0;
          lVar8 = 0x150;
        }
        else {
          if ((int)uVar10 < 0) goto LAB_008bd730;
          pvVar9 = (void *)FUN_008b7610(param_1,(ulong)uVar10 << 4,*(undefined1 *)(param_2 + 1));
          memcpy(pvVar9,pvVar7,(long)*(int *)(param_2 + 8) << 4);
          lVar8 = (long)*(int *)(param_2 + 8) * 0x10 + 0x150;
        }
        *(void **)(param_2 + 0x20) = pvVar9;
        FUN_008b7a9c(param_1,(long)pvVar7 + -0x150,lVar8,*(undefined1 *)(param_2 + 1));
      }
      *(undefined1 *)(param_2 + 7) = 0;
    }
    else {
      lVar8 = *(long *)(param_2 + 0x28);
      *(undefined1 *)(param_2 + 7) = 1;
      if (((DAT_00d1fc90 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d1fc90), iVar5 != 0)) {
                    /* try { // try from 008bd718 to 008bd71b has its CatchHandler @ 008bd748 */
        DAT_00d1fc88 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1fc90);
      }
      if (lVar8 != (long)&DWORD_007f3700 + DAT_00d1fc88) {
        bVar3 = false;
        uVar10 = 0;
        lVar8 = 0x140;
        uVar11 = 0;
        do {
          puVar6 = (undefined8 *)
                   FUN_008bb440(param_2,*(undefined8 *)
                                         (*(long *)(param_1 + 0x60) + uVar11 * 8 + 0x338));
          iVar5 = *(int *)((long)puVar6 + 0xc);
          uVar12 = *puVar6;
          *(undefined8 *)((long)auStack_1b8 + lVar8 + 8) = puVar6[1];
          *(undefined8 *)((long)auStack_1b8 + lVar8) = uVar12;
          bVar4 = iVar5 != 0;
          bVar3 = (bool)(bVar3 | bVar4);
          uVar1 = 0;
          if (uVar11 < 8 && !bVar4) {
            uVar1 = 1 << (ulong)((uint)uVar11 & 0x1f);
          }
          bVar4 = lVar8 != 0;
          uVar10 = uVar1 | uVar10;
          lVar8 = lVar8 + -0x10;
          uVar11 = uVar11 + 1;
        } while (bVar4);
        *(char *)(param_2 + 6) = (char)uVar10;
        if (bVar3) {
          if (*(int *)(param_2 + 8) < -0x15) {
LAB_008bd730:
            if (*(long *)(lVar2 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
              FUN_008b75fc(param_1);
            }
            goto LAB_008bd770;
          }
          pvVar7 = (void *)FUN_008b777c(param_1,(ulong)(*(int *)(param_2 + 8) + 0x15) << 4,
                                        *(undefined1 *)(param_2 + 1));
          if (pvVar7 != (void *)0x0) {
            pvVar9 = *(void **)(param_2 + 0x20);
            if (*(int *)(param_2 + 8) != 0) {
              memcpy((void *)((long)pvVar7 + 0x150),pvVar9,(long)*(int *)(param_2 + 8) << 4);
            }
            memcpy(pvVar7,auStack_1b8,0x150);
            *(long *)(param_2 + 0x20) = (long)pvVar7 + 0x150;
            *(byte *)(param_2 + 7) = *(byte *)(param_2 + 7) | 2;
            FUN_008b7a9c(param_1,pvVar9,(long)*(int *)(param_2 + 8) << 4,
                         *(undefined1 *)(param_2 + 1));
          }
        }
      }
    }
  }
  if (*(long *)(lVar2 + 0x28) == local_68) {
    return;
  }
LAB_008bd770:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

