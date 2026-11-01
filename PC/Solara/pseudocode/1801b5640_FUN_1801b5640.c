/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_1801b5640(longlong param_1,undefined8 *param_2)

{
  int *piVar1;
  char cVar2;
  uint uVar3;
  code *pcVar4;
  int iVar5;
  longlong lVar6;
  undefined8 *puVar7;
  longlong *plVar8;
  longlong *plVar9;
  undefined8 *puVar10;
  longlong *plVar11;
  undefined8 *****pppppuVar12;
  longlong *plVar13;
  longlong *plVar14;
  undefined8 *puVar15;
  ulonglong uVar16;
  undefined8 *puVar17;
  uint uVar18;
  bool bVar19;
  undefined1 auStack_408 [32];
  undefined8 *****pppppuStack_3e8;
  int iStack_3e0;
  uint uStack_3d8;
  longlong lStack_3d0;
  longlong *plStack_3c8;
  longlong *plStack_3c0;
  longlong lStack_3a8;
  longlong *plStack_380;
  longlong lStack_378;
  longlong *plStack_370;
  undefined8 *puStack_368;
  uint uStack_360;
  uint uStack_35c;
  longlong lStack_358;
  undefined8 uStack_350;
  longlong *plStack_348;
  undefined8 uStack_340;
  uint auStack_2f0 [2];
  undefined8 *****apppppuStack_2e8 [3];
  ulonglong uStack_2d0;
  undefined8 uStack_2c8;
  longlong *plStack_2c0;
  undefined8 uStack_2b8;
  longlong lStack_2b0;
  undefined8 uStack_2a8;
  undefined8 uStack_2a0;
  ulonglong uStack_298;
  undefined8 uStack_290;
  undefined4 auStack_288 [2];
  undefined1 auStack_280 [36];
  undefined1 auStack_25c [532];
  ulonglong uStack_48;
  
  uStack_48 = _DAT_1810c1700 ^ (ulonglong)auStack_408;
  uStack_3d8 = 0;
  lStack_3d0 = param_1;
  if (param_2[2] != 0) {
    puVar15 = param_2;
    if (0xf < (ulonglong)param_2[3]) {
      puVar15 = (undefined8 *)*param_2;
    }
    iStack_3e0 = 0;
    pppppuStack_3e8 = (undefined8 *****)0x0;
    iVar5 = MultiByteToWideChar(0xfde9,0,puVar15);
    if (iVar5 != 0) {
      FUN_1801acad0(apppppuStack_2e8,(longlong)iVar5,0);
      pppppuStack_3e8 = apppppuStack_2e8;
      if (7 < uStack_2d0) {
        pppppuStack_3e8 = apppppuStack_2e8[0];
      }
      if ((ulonglong)param_2[3] < 0x10) {
        puVar15 = param_2;
      }
      else {
        puVar15 = (undefined8 *)*param_2;
      }
      iStack_3e0 = iVar5;
      iVar5 = MultiByteToWideChar(0xfde9,0,puVar15,*(undefined4 *)(param_2 + 2));
      if (iVar5 == 0) {
        if (uStack_2d0 < 8) goto LAB_1801b5def;
        if (uStack_2d0 * 2 + 2 < 0x1000) {
          lVar6 = uStack_2d0 * 2 + 2;
        }
        else {
          if (0x1f < (ulonglong)
                     ((longlong)apppppuStack_2e8[0] + (-8 - (longlong)apppppuStack_2e8[0][-1])))
          goto code_r0x0001801b5e27;
          lVar6 = uStack_2d0 * 2 + 0x29;
          apppppuStack_2e8[0] = (undefined8 *****)apppppuStack_2e8[0][-1];
        }
      }
      else {
        lStack_2b0 = 0;
        uStack_2a8 = 0;
        uStack_2a0 = 0;
        uStack_298 = 0;
        uStack_290 = 0;
        uStack_2c8 = 0;
        plStack_2c0 = (longlong *)0x0;
        uStack_2b8 = 0;
        lStack_378 = param_1;
        plStack_2c0 = (longlong *)FUN_180e152f0(0x18);
        *plStack_2c0 = (longlong)plStack_2c0;
        plStack_2c0[1] = (longlong)plStack_2c0;
        lStack_2b0 = 0;
        uStack_2a8 = 0;
        uStack_2a0 = 0;
        uStack_298 = 7;
        uStack_290 = 8;
        uStack_2c8 = CONCAT44(uStack_2c8._4_4_,0x3f800000);
        FUN_1801bee10(&lStack_2b0,0x10,plStack_2c0);
        lVar6 = func_0x000180e07672(2,0);
        if (lVar6 != -1) {
          auStack_288[0] = 0x238;
          iVar5 = func_0x000180e07678(lVar6,auStack_288);
          while (iVar5 != 0) {
            pppppuVar12 = apppppuStack_2e8;
            if (7 < uStack_2d0) {
              pppppuVar12 = apppppuStack_2e8[0];
            }
            iVar5 = func_0x000180e1e430(auStack_25c,pppppuVar12);
            if (iVar5 == 0) {
              FUN_1801ac240(&uStack_2c8,&plStack_348,auStack_280);
            }
            iVar5 = func_0x000180e0767e(lVar6,auStack_288);
          }
          CloseHandle(lVar6);
        }
        uStack_350 = 0;
        lStack_358 = param_1 + 0x38;
        func_0x000180e133d0();
        uStack_350 = CONCAT71(uStack_350._1_7_,1);
        plStack_370 = plStack_2c0;
        plVar14 = plStack_2c0;
        while( true ) {
          plVar14 = (longlong *)*plVar14;
          plVar11 = (longlong *)(param_1 + 0x28);
          lStack_3a8 = (longlong)plVar14;
          plStack_380 = plVar11;
          if (plVar14 == plStack_370) break;
          uVar3 = *(uint *)(plVar14 + 2);
          puVar15 = (undefined8 *)*plVar11;
          cVar2 = *(char *)((longlong)puVar15[1] + 0x19);
          puVar17 = puVar15;
          puVar10 = (undefined8 *)puVar15[1];
          while (cVar2 == '\0') {
            if (*(uint *)(puVar10 + 4) < uVar3) {
              puVar7 = (undefined8 *)puVar10[2];
              puVar10 = puVar17;
            }
            else {
              puVar7 = (undefined8 *)*puVar10;
            }
            puVar17 = puVar10;
            puVar10 = puVar7;
            cVar2 = *(char *)((longlong)puVar7 + 0x19);
          }
          auStack_2f0[0] = uVar3;
          if (((*(char *)((longlong)puVar17 + 0x19) != '\0') || (uVar3 < *(uint *)(puVar17 + 4))) ||
             (puVar17 == puVar15)) {
            plVar8 = (longlong *)FUN_180e152f0(0x288);
            if (plVar8 == (longlong *)0x0) {
              plVar8 = (longlong *)0x0;
            }
            else {
              *(undefined4 *)(plVar8 + 1) = 1;
              *(undefined4 *)((longlong)plVar8 + 0xc) = 1;
              *plVar8 = (longlong)&UNK_180f47d80;
              plStack_3c8 = plVar8;
              FUN_1801ad0f0(plVar8 + 2,uVar3);
            }
            uStack_3d8 = uStack_3d8 | 1;
            plStack_3c8 = plVar8 + 2;
            plStack_3c0 = plVar8;
            if ((plVar8[3] == 0) || (*(int *)(plVar8[3] + 8) == 0)) {
              if (plVar8 == (longlong *)0x0) {
                plVar9 = (longlong *)0x0;
                plVar13 = (longlong *)0x0;
              }
              else {
                LOCK();
                *(int *)(plVar8 + 1) = (int)plVar8[1] + 1;
                UNLOCK();
                LOCK();
                *(int *)((longlong)plVar8 + 0xc) = *(int *)((longlong)plVar8 + 0xc) + 1;
                UNLOCK();
                plVar9 = plStack_3c8;
                plVar13 = plVar8;
              }
              *plStack_3c8 = (longlong)plVar9;
              plVar9 = (longlong *)plVar8[3];
              plVar8[3] = (longlong)plVar13;
              if (plVar9 != (longlong *)0x0) {
                LOCK();
                piVar1 = (int *)((longlong)plVar9 + 0xc);
                *piVar1 = *piVar1 + -1;
                UNLOCK();
                if (*piVar1 == 0) {
                  (**(code **)(*plVar9 + 8))();
                }
              }
              if (plVar8 != (longlong *)0x0) {
                LOCK();
                plVar9 = plVar8 + 1;
                *(int *)plVar9 = (int)*plVar9 + -1;
                UNLOCK();
                if ((int)*plVar9 == 0) {
                  (**(code **)*plVar8)(plVar8);
                  LOCK();
                  piVar1 = (int *)((longlong)plVar8 + 0xc);
                  *piVar1 = *piVar1 + -1;
                  UNLOCK();
                  if (*piVar1 == 0) {
                    (**(code **)(*plVar8 + 8))(plVar8);
                  }
                }
              }
            }
            puVar15 = (undefined8 *)*plVar11;
            puVar17 = (undefined8 *)puVar15[1];
            puVar10 = puVar17;
            puVar7 = puVar15;
            if (*(char *)((longlong)puVar17 + 0x19) == '\0') {
              do {
                puVar17 = puVar10;
                if (uVar3 <= *(uint *)(puVar17 + 4)) {
                  puVar10 = (undefined8 *)*puVar17;
                  puVar7 = puVar17;
                }
                else {
                  puVar10 = (undefined8 *)puVar17[2];
                }
                uVar18 = (uint)(uVar3 <= *(uint *)(puVar17 + 4));
              } while (*(char *)((longlong)puVar10 + 0x19) == '\0');
            }
            else {
              uVar18 = 0;
            }
            if ((*(char *)((longlong)puVar7 + 0x19) != '\0') || (uVar3 < *(uint *)(puVar7 + 4))) {
              if (*(longlong *)(lStack_3d0 + 0x30) == 0x492492492492492) {
                FUN_18019c650();
                goto code_r0x0001801b5e27;
              }
              plStack_348 = plStack_380;
              uStack_340 = 0;
              plVar11 = (longlong *)FUN_180e152f0(0x38);
              *(uint *)(plVar11 + 4) = uVar3;
              plVar11[5] = (longlong)(plVar8 + 2);
              plVar11[6] = (longlong)plVar8;
              *plVar11 = (longlong)puVar15;
              plVar11[1] = (longlong)puVar15;
              plVar11[2] = (longlong)puVar15;
              *(undefined2 *)(plVar11 + 3) = 0;
              uStack_340 = 0;
              uStack_35c = auStack_2f0[0];
              puStack_368 = puVar17;
              uStack_360 = uVar18;
              func_0x00018019c230(plStack_380,&puStack_368,plVar11);
              plVar8 = (longlong *)0x0;
            }
            if (plVar8 != (longlong *)0x0) {
              LOCK();
              plVar11 = plVar8 + 1;
              *(int *)plVar11 = (int)*plVar11 + -1;
              UNLOCK();
              if ((int)*plVar11 == 0) {
                (**(code **)*plVar8)(plVar8);
                LOCK();
                piVar1 = (int *)((longlong)plVar8 + 0xc);
                *piVar1 = *piVar1 + -1;
                UNLOCK();
                if (*piVar1 == 0) {
                  (**(code **)(*plVar8 + 8))(plVar8);
                }
              }
            }
          }
          param_1 = lStack_3d0;
        }
        plVar14 = *(longlong **)*plVar11;
        if (plVar14 != (longlong *)*plVar11) {
          do {
            uVar3 = *(uint *)(plVar14 + 4);
            uVar16 = (((((ulonglong)(byte)uVar3 ^ 0xcbf29ce484222325) * 0x100000001b3 ^
                       (ulonglong)(uVar3 >> 8 & 0xff)) * 0x100000001b3 ^
                      (ulonglong)(uVar3 >> 0x10 & 0xff)) * 0x100000001b3 ^
                     (ulonglong)(uVar3 >> 0x18)) * 0x100000001b3 & uStack_298;
            plVar8 = *(longlong **)(lStack_2b0 + 8 + uVar16 * 0x10);
            if (plVar8 == plStack_2c0) {
code_r0x0001801b5c33:
              lVar6 = OpenProcess(0x1000,0);
              if (lVar6 != 0) {
                auStack_2f0[0] = 0;
                iVar5 = GetExitCodeProcess(lVar6,auStack_2f0);
                bVar19 = auStack_2f0[0] == 0x103;
                CloseHandle(lVar6);
                if (iVar5 != 0 && bVar19) goto code_r0x0001801b5c89;
              }
              plVar8 = (longlong *)plVar14[2];
              if (*(char *)((longlong)plVar8 + 0x19) == '\0') {
                cVar2 = *(char *)(*plVar8 + 0x19);
                while (cVar2 == '\0') {
                  plVar8 = (longlong *)*plVar8;
                  cVar2 = *(char *)(*plVar8 + 0x19);
                }
              }
              else {
                cVar2 = *(char *)(plVar14[1] + 0x19);
                plVar13 = (longlong *)plVar14[1];
                plVar9 = plVar14;
                while ((plVar8 = plVar13, cVar2 == '\0' && (plVar9 == (longlong *)plVar8[2]))) {
                  cVar2 = *(char *)(plVar8[1] + 0x19);
                  plVar13 = (longlong *)plVar8[1];
                  plVar9 = plVar8;
                }
              }
              lVar6 = FUN_1801bf3f0(plVar11,plVar14);
              plVar14 = *(longlong **)(lVar6 + 0x30);
              if (plVar14 != (longlong *)0x0) {
                LOCK();
                plVar9 = plVar14 + 1;
                *(int *)plVar9 = (int)*plVar9 + -1;
                UNLOCK();
                if ((int)*plVar9 == 0) {
                  (**(code **)*plVar14)(plVar14);
                  LOCK();
                  piVar1 = (int *)((longlong)plVar14 + 0xc);
                  *piVar1 = *piVar1 + -1;
                  UNLOCK();
                  if (*piVar1 == 0) {
                    (**(code **)(*plVar14 + 8))(plVar14);
                  }
                }
              }
              func_0x000180e15340(lVar6,0x38);
            }
            else {
              uVar18 = *(uint *)(plVar8 + 2);
              while (uVar3 != uVar18) {
                if (plVar8 == *(longlong **)(lStack_2b0 + uVar16 * 0x10)) goto code_r0x0001801b5c33;
                plVar8 = (longlong *)plVar8[1];
                uVar18 = *(uint *)(plVar8 + 2);
              }
              if (plVar8 == (longlong *)0x0) {
                plVar8 = plStack_2c0;
              }
              if (plVar8 == plStack_2c0) goto code_r0x0001801b5c33;
code_r0x0001801b5c89:
              plVar8 = (longlong *)plVar14[2];
              if (*(char *)((longlong)plVar8 + 0x19) == '\0') {
                cVar2 = *(char *)(*plVar8 + 0x19);
                while (cVar2 == '\0') {
                  plVar8 = (longlong *)*plVar8;
                  cVar2 = *(char *)(*plVar8 + 0x19);
                }
              }
              else {
                cVar2 = *(char *)(plVar14[1] + 0x19);
                plVar9 = (longlong *)plVar14[1];
                while ((plVar8 = plVar9, cVar2 == '\0' && (plVar14 == (longlong *)plVar8[2]))) {
                  cVar2 = *(char *)(plVar8[1] + 0x19);
                  plVar9 = (longlong *)plVar8[1];
                  plVar14 = plVar8;
                }
              }
            }
            plVar14 = plVar8;
          } while (plVar8 != (longlong *)*plVar11);
        }
        lVar6 = 2;
        func_0x000180e133f0(lStack_358);
        FUN_1801b1070(&lStack_2b0);
        FUN_1801b11e0(&plStack_2c0);
        if (uStack_2d0 < 8) goto LAB_1801b5def;
        if (0xfff < uStack_2d0 * 2 + 2) {
          if (0x1f < (ulonglong)
                     ((longlong)apppppuStack_2e8[0] + (-8 - (longlong)apppppuStack_2e8[0][-1]))) {
code_r0x0001801b5e27:
            pcVar4 = (code *)swi(0x29);
            (*pcVar4)(5);
            pcVar4 = (code *)swi(3);
            (*pcVar4)();
            return;
          }
          lVar6 = 0x29;
          apppppuStack_2e8[0] = (undefined8 *****)apppppuStack_2e8[0][-1];
        }
        lVar6 = lVar6 + uStack_2d0 * 2;
      }
      func_0x000180e15340(apppppuStack_2e8[0],lVar6);
    }
  }
LAB_1801b5def:
  FUN_180e155e0(uStack_48 ^ (ulonglong)auStack_408);
  return;
}

