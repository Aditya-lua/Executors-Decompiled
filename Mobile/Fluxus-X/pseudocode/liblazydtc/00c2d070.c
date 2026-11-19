/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2d070
 */

undefined8
FUN_00c2d070(undefined8 param_1,undefined8 param_2,undefined8 param_3,void *param_4,
            undefined1 *param_5,ulong param_6)

{
  bool bVar1;
  int iVar2;
  undefined8 uVar3;
  uint uVar4;
  long lVar5;
  ulong uVar6;
  ulong *puVar7;
  ulong uVar8;
  long *plVar9;
  int *piVar10;
  ulong uVar11;
  undefined1 auStack_d38 [528];
  undefined1 auStack_b28 [288];
  ulong local_a08 [96];
  undefined1 auStack_708 [24];
  int local_6f0 [2];
  long local_6e8 [67];
  undefined8 local_4d0;
  ulong uStack_4c8;
  undefined1 auStack_e8 [48];
  undefined1 local_b8;
  byte local_b6;
  char local_b4;
  undefined1 auStack_b0 [48];
  undefined8 local_80;
  ulong uStack_78;
  
  lVar5 = FUN_00c2c5cc(param_1,param_3,auStack_b0,auStack_e8,0);
  if (lVar5 == 0) {
    memset(auStack_708,0,0x620);
    uVar6 = FUN_00c2d520(param_1,auStack_b0,auStack_e8,param_2,4,auStack_708);
    if ((uVar6 & 1) != 0) {
      uVar6 = FUN_00c2dff8(param_1,auStack_708,param_4);
      if (((param_6 & 1) != 0) && (local_b4 == '\x01')) {
        for (uVar8 = *(ulong *)((long)param_4 + 0xf8) & 0xfffffffffffffff0; uVar8 < uVar6;
            uVar8 = uVar8 + 0x10) {
        }
      }
      memcpy(local_a08 + 0x1e,param_4,0x210);
      uVar8 = 0;
      lVar5 = 0;
      piVar10 = local_6f0;
      local_a08[0x3d] = uVar6;
      do {
        iVar2 = *piVar10;
        if (iVar2 == 0) {
          if (uVar8 == local_b6) {
            if (local_b6 < 0x1f) {
              plVar9 = (long *)((long)param_4 + 0xe8);
              if ((local_b6 != 0x1d) && (plVar9 = (long *)((long)param_4 + 0xf0), local_b6 != 0x1e))
              goto LAB_00c2d324;
            }
            else {
              plVar9 = (long *)((long)param_4 + 0x108);
              if ((local_b6 != 0x22) &&
                 ((plVar9 = (long *)((long)param_4 + 0x100), local_b6 != 0x20 &&
                  (plVar9 = (long *)((long)param_4 + 0xf8), local_b6 != 0x1f)))) {
LAB_00c2d324:
                if (0x1c < local_b6) {
                  fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getRegister",
                          "unsupported arm64 register");
                  fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
                  abort();
                }
                plVar9 = (long *)((long)param_4 + (ulong)local_b6 * 8);
              }
            }
            lVar5 = *plVar9;
          }
        }
        else {
          uVar4 = (uint)uVar8;
          if ((uVar4 & 0x60) == 0x40) {
            if (iVar2 < 5) {
              uVar11 = 0;
              if (iVar2 != 1) {
                if (iVar2 != 2) goto LAB_00c2d484;
                uVar11 = *(ulong *)(*(long *)(piVar10 + 2) + uVar6);
              }
            }
            else if (iVar2 == 5) {
              uVar11 = *(ulong *)((long)param_4 +
                                 ((*(long *)(piVar10 + 2) << 0x20) + -0x4000000000 >> 0x1d) + 0x110)
              ;
            }
            else {
              if (iVar2 != 6) {
LAB_00c2d484:
                fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getSavedFloatRegister",
                        "unsupported restore location for float register");
                fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
                abort();
              }
              puVar7 = (ulong *)FUN_00c2e890(*(undefined8 *)(piVar10 + 2),param_1,param_4,uVar6);
              uVar11 = *puVar7;
            }
            local_a08[uVar8] = uVar11;
          }
          else if (uVar8 == local_b6) {
            lVar5 = FUN_00c2e12c(param_1,param_4,uVar6,piVar10);
          }
          else if (uVar8 == 0x22) {
            local_a08[0x3f] = FUN_00c2e12c(param_1,param_4,uVar6,piVar10);
          }
          else {
            if (0x20 < uVar8) {
              return 0xffffe672;
            }
            uVar11 = FUN_00c2e12c(param_1,param_4,uVar6,piVar10);
            if ((int)uVar4 < 0x1f) {
              if (uVar4 == 0x1d) {
                local_a08[0x3b] = uVar11;
              }
              else {
                if (uVar4 != 0x1e) goto LAB_00c2d350;
                local_a08[0x3c] = uVar11;
              }
            }
            else if (uVar4 == 0x1f) {
              local_a08[0x3d] = uVar11;
            }
            else if (uVar4 == 0x20) {
              local_a08[0x3e] = uVar11;
            }
            else {
LAB_00c2d350:
              if (0x1c < uVar8) {
                fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","setRegister",
                        "unsupported arm64 register");
                fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
                abort();
              }
              local_a08[uVar8 + 0x1e] = uVar11;
            }
          }
        }
        uVar8 = uVar8 + 1;
        piVar10 = piVar10 + 4;
        if (uVar8 == 0x60) {
          *param_5 = local_b8;
          memcpy(auStack_b28,param_4,0x210);
          uStack_78 = uStack_4c8;
          local_80 = local_4d0;
          uVar3 = local_80;
          local_80._0_4_ = (int)local_4d0;
          bVar1 = (int)local_80 != 0;
          uVar8 = uStack_4c8;
          if (bVar1) {
            local_80 = uVar3;
            uVar8 = FUN_00c2e12c(param_1,auStack_b28,uVar6,&local_80);
          }
          if (((uVar8 & 1) != 0) && (lVar5 != 0)) {
            do {
              memcpy(auStack_d38,param_4,0x210);
              uStack_78 = uStack_4c8;
              local_80 = local_4d0;
              uVar3 = local_80;
              local_80._0_4_ = (int)local_4d0;
              if ((int)local_80 == 0) {
                uVar4 = (uint)uStack_4c8;
              }
              else {
                local_80 = uVar3;
                uVar4 = FUN_00c2e12c(param_1,auStack_d38,uVar6,&local_80);
              }
            } while ((uVar4 >> 1 & 1) == 0);
          }
          local_a08[0x3e] = lVar5;
          memcpy(param_4,local_a08 + 0x1e,0x210);
          return 1;
        }
      } while( true );
    }
  }
  return 0xffffe66e;
}

