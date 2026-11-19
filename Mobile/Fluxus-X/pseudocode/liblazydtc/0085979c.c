/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085979c
 */

void FUN_0085979c(char *param_1)

{
  long lVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  char cVar9;
  bool bVar10;
  bool bVar11;
  int iVar12;
  int iVar13;
  long lVar14;
  char *pcVar15;
  ulong uVar16;
  long lVar17;
  undefined8 *puVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  int *piVar21;
  undefined8 uVar22;
  char *pcVar23;
  undefined8 local_a8;
  undefined8 local_a0;
  undefined1 local_98 [16];
  undefined1 local_84 [4];
  int local_80;
  int iStack_7c;
  int iStack_78;
  int iStack_74;
  undefined8 uStack_70;
  undefined8 uStack_68;
  long local_60;
  long local_58;
  
  auVar8._8_8_ = local_98._8_8_;
  auVar8._0_8_ = local_98._0_8_;
  auVar7._8_8_ = local_98._8_8_;
  auVar7._0_8_ = local_98._0_8_;
  auVar6._8_8_ = local_98._8_8_;
  auVar6._0_8_ = local_98._0_8_;
  auVar5._8_8_ = local_98._8_8_;
  auVar5._0_8_ = local_98._0_8_;
  auVar4._8_8_ = local_98._8_8_;
  auVar4._0_8_ = local_98._0_8_;
  auVar3._8_8_ = local_98._8_8_;
  auVar3._0_8_ = local_98._0_8_;
  auVar2._8_8_ = local_98._8_8_;
  auVar2._0_8_ = local_98._0_8_;
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  piVar21 = (int *)(param_1 + 0x90);
  iVar12 = *piVar21;
  if (iVar12 < 300) {
    if (iVar12 < 0x125) {
      if (iVar12 - 0x11cU < 2) {
        local_98 = auVar2;
        if (*(long *)(lVar1 + 0x28) == local_58) {
          FUN_0085c3e4();
          return;
        }
        goto LAB_0085a020;
      }
      if (iVar12 == 0x124) {
        local_98 = auVar3;
        if (*(long *)(lVar1 + 0x28) == local_58) {
          FUN_0085c30c();
          return;
        }
        goto LAB_0085a020;
      }
LAB_00859a6c:
      iStack_78 = (int)*(undefined8 *)(param_1 + 0x9c);
      iStack_74 = (int)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 0x20);
      local_80 = (int)*(undefined8 *)(param_1 + 0x94);
      iStack_7c = (int)((ulong)*(undefined8 *)(param_1 + 0x94) >> 0x20);
      lVar14 = FUN_0085cb14(param_1,1);
      if (*(int *)(lVar14 + 8) == DAT_00d1b040) {
        pcVar15 = (char *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x28);
        FUN_0084fdb8(pcVar15,lVar14 + 0xc,lVar14);
      }
      else if ((*piVar21 == 0x3d) || (*piVar21 == 0x2c)) {
        pcVar15 = (char *)FUN_0085cdc0(param_1,lVar14);
      }
      else {
        uVar16 = FUN_0085d5f0(piVar21);
        if (uVar16 >> 0x20 == 0) {
          pcVar15 = (char *)FUN_008514d0(lVar14);
          if (pcVar15 == (char *)0x0) {
LAB_00859ba4:
            if (((iStack_7c == *(int *)(param_1 + 0x98)) &&
                ((local_80 == *(int *)(param_1 + 0x94) && (iStack_74 == *(int *)(param_1 + 0xa0)))))
               && (iStack_78 == *(int *)(param_1 + 0x9c))) {
              FUN_00858f2c(param_1);
            }
            local_60 = lVar14;
            local_98 = FUN_0085ea84(param_1,&local_60,1);
            pcVar15 = "Incomplete statement: expected assignment or a function call";
LAB_00859c18:
            local_a0 = 0;
            local_a8 = 0;
            pcVar15 = (char *)FUN_0085e984(param_1,lVar14 + 0xc,local_98,&local_a8,pcVar15);
          }
          else {
            iVar12 = strcmp(pcVar15,"type");
            cVar9 = DAT_00d1ec80;
            if (iVar12 == 0) {
              pcVar15 = (char *)FUN_0085d7a0(param_1,(undefined8 *)(lVar14 + 0xc),0,
                                             *(undefined8 *)(lVar14 + 0xc));
            }
            else if (DAT_00d1ec80 == '\x01') {
              iVar12 = strcmp(pcVar15,"class");
              if (iVar12 == 0) {
                uVar19 = 0;
LAB_00859de8:
                pcVar15 = (char *)FUN_0085da04(param_1,&local_80,uVar19,0);
              }
              else {
                iVar12 = strcmp(pcVar15,"open");
                if (iVar12 != 0) goto LAB_00859b48;
                if (((*piVar21 != 0x119) || (*(char **)(param_1 + 0xa8) == (char *)0x0)) ||
                   (iVar12 = strcmp(*(char **)(param_1 + 0xa8),"class"), iVar12 != 0)) {
LAB_00859eb0:
                  local_60 = lVar14;
                  local_98 = FUN_0085ea84(param_1,&local_60,1);
                  pcVar15 = "Incomplete statement: expected a class definition after \'open\'";
                  goto LAB_00859c18;
                }
                FUN_00858f2c(param_1);
                uVar19 = 0;
LAB_00859fd0:
                pcVar15 = (char *)FUN_0085da04(param_1,&local_80,uVar19,1);
              }
            }
            else {
LAB_00859b48:
              iVar12 = strcmp(pcVar15,"export");
              if (iVar12 == 0) {
                if (DAT_00d1ec40 == '\x01') {
                  iVar12 = *(int *)(param_1 + 0x90);
                  uVar19 = *(undefined8 *)(param_1 + 0x94);
                  pcVar23 = *(char **)(param_1 + 0xa8);
                  bVar10 = true;
                  if ((iVar12 != 0x12e) && (iVar12 != 299)) {
                    if ((iVar12 == 0x119) && (pcVar23 != (char *)0x0)) {
                      iVar13 = strcmp(pcVar23,"const");
                      bVar10 = iVar13 == 0;
                    }
                    else {
                      bVar10 = false;
                    }
                  }
                  if (cVar9 == '\0') {
                    if (bVar10) goto LAB_00859f6c;
                  }
                  else {
                    bVar11 = false;
                    if ((iVar12 == 0x119) && (pcVar23 != (char *)0x0)) {
                      iVar13 = strcmp(pcVar23,"class");
                      if (iVar13 == 0) goto LAB_00859f6c;
                      iVar13 = strcmp(pcVar23,"open");
                      bVar11 = iVar13 == 0;
                    }
                    if (bVar10 || bVar11) {
LAB_00859f6c:
                      local_98._0_8_ = 0;
                      local_98._8_8_ = 0;
                      pcVar15 = (char *)FUN_0085eb28(param_1,(undefined8 *)(lVar14 + 0xc),
                                                     *(undefined8 *)(lVar14 + 0xc),local_98,0);
                      goto LAB_00859d20;
                    }
                  }
                  if (((iVar12 == 0x119) && (pcVar23 != (char *)0x0)) &&
                     (iVar12 = strcmp(pcVar23,"type"), iVar12 == 0)) {
                    FUN_00858f2c(param_1);
                    pcVar15 = (char *)FUN_0085d7a0(param_1,lVar14 + 0xc,1,uVar19);
                    goto LAB_00859d20;
                  }
                }
                else {
                  if ((cVar9 != '\0') &&
                     (pcVar23 = *(char **)(param_1 + 0xa8), pcVar23 != (char *)0x0)) {
                    iVar12 = strcmp(pcVar23,"class");
                    if (iVar12 == 0) {
                      FUN_00858f2c(param_1);
                      uVar19 = 3;
                      goto LAB_00859de8;
                    }
                    iVar12 = strcmp(pcVar23,"open");
                    if (iVar12 == 0) {
                      FUN_00858f2c(param_1);
                      if (((*(int *)(param_1 + 0x90) != 0x119) ||
                          (*(char **)(param_1 + 0xa8) == (char *)0x0)) ||
                         (iVar12 = strcmp(*(char **)(param_1 + 0xa8),"class"), iVar12 != 0))
                      goto LAB_00859eb0;
                      FUN_00858f2c(param_1);
                      uVar19 = 3;
                      goto LAB_00859fd0;
                    }
                  }
                  if (((*piVar21 == 0x119) && (*(char **)(param_1 + 0xa8) != (char *)0x0)) &&
                     (iVar12 = strcmp(*(char **)(param_1 + 0xa8),"type"), iVar12 == 0)) {
                    uVar19 = *(undefined8 *)(param_1 + 0x94);
                    FUN_00858f2c(param_1);
                    pcVar15 = (char *)FUN_0085d7a0(param_1,lVar14 + 0xc,1,uVar19);
                    goto LAB_00859d20;
                  }
                }
              }
              iVar12 = strcmp(pcVar15,"continue");
              if (iVar12 == 0) {
                pcVar15 = (char *)FUN_0085f130(param_1,lVar14 + 0xc);
              }
              else {
                iVar12 = strcmp(pcVar15,"const");
                if (iVar12 == 0) {
                  uVar19 = *(undefined8 *)(lVar14 + 0xc);
                  uVar20 = *(undefined8 *)(lVar14 + 0x14);
                  piVar21 = (int *)local_98;
                  local_98._0_8_ = (long *)0x0;
                  local_98._8_8_ = 0;
                  uVar22 = 1;
                  goto LAB_0085994c;
                }
                if ((*param_1 != '\x01') || (iVar12 = strcmp(pcVar15,"declare"), iVar12 != 0))
                goto LAB_00859ba4;
                local_98._0_8_ = 0;
                local_98._8_8_ = 0;
                pcVar15 = (char *)FUN_0085f204(param_1,lVar14 + 0xc,local_98);
              }
            }
          }
        }
        else {
          pcVar15 = (char *)FUN_0085d60c(param_1,lVar14,uVar16);
        }
      }
    }
    else {
      if (iVar12 == 0x125) {
        local_98 = auVar5;
        if (*(long *)(lVar1 + 0x28) == local_58) {
          FUN_0085a45c();
          return;
        }
        goto LAB_0085a020;
      }
      if (iVar12 == 0x12a) {
        local_98 = auVar4;
        if (*(long *)(lVar1 + 0x28) == local_58) {
          FUN_0085a5d4();
          return;
        }
        goto LAB_0085a020;
      }
      if (iVar12 != 299) goto LAB_00859a6c;
      uStack_68 = *(undefined8 *)(param_1 + 0xa8);
      uStack_70 = *(undefined8 *)(param_1 + 0xa0);
      pcVar15 = *(char **)(param_1 + 0x94);
      local_a8 = 0;
      local_a0 = 0;
      iStack_78 = (int)*(undefined8 *)(param_1 + 0x98);
      iStack_74 = (int)((ulong)*(undefined8 *)(param_1 + 0x98) >> 0x20);
      local_80 = (int)*(undefined8 *)piVar21;
      iStack_7c = (int)((ulong)*(undefined8 *)piVar21 >> 0x20);
      FUN_00858f2c();
      local_84[0] = 0;
      local_60 = 0;
      lVar14 = FUN_00861b90(param_1,local_84,&local_60);
      iVar12 = *(int *)(lVar14 + 8);
      if ((((iVar12 != DAT_00d1b010) || (*(char *)(*(long *)(lVar14 + 0x20) + 0x30) == '\x01')) &&
          (iVar12 != DAT_00d1b020)) && ((iVar12 != DAT_00d1b060 && (iVar12 != DAT_00d1b050)))) {
        if (DAT_00d1ec40 == '\x01') {
          lVar14 = FUN_00864840(param_1,lVar14);
        }
        else {
          local_98._0_8_ = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),8);
          *(long *)local_98._0_8_ = lVar14;
          local_98._8_8_ = 1;
          lVar14 = FUN_008659e8(param_1,lVar14 + 0xc,local_98,
                                "Assigned expression must be a variable or a field");
        }
      }
      *(int *)(*(long *)(param_1 + 0x1e8) + 0x4a0) =
           *(int *)(*(long *)(param_1 + 0x1e8) + 0x4a0) + 1;
      lVar17 = FUN_00863248(param_1,local_84[0],&local_80,&local_60,0,&local_a8,0,0);
      *(int *)(*(long *)(param_1 + 0x1e8) + 0x4a0) =
           *(int *)(*(long *)(param_1 + 0x1e8) + 0x4a0) + -1;
      local_98._8_8_ = *(undefined8 *)(lVar17 + 0x14);
      local_98._0_8_ = pcVar15;
      pcVar15 = (char *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x30);
      FUN_00850304(pcVar15,local_98,lVar14,lVar17);
      if (param_1[0x68] == '\x01') {
        uVar19 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x20);
        FUN_00851fe4(uVar19,CONCAT44(iStack_78,iStack_7c));
        local_98._0_8_ = pcVar15;
        puVar18 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,local_98);
        *puVar18 = uVar19;
      }
    }
  }
  else {
    if (0x131 < iVar12) {
      if (iVar12 == 0x132) {
        local_98 = auVar8;
        if (*(long *)(lVar1 + 0x28) == local_58) {
          FUN_0085b258();
          return;
        }
        goto LAB_0085a020;
      }
      if (iVar12 == 0x133) {
        local_98 = auVar7;
        if (*(long *)(lVar1 + 0x28) == local_58) {
          FUN_0085bef4();
          return;
        }
        goto LAB_0085a020;
      }
      if (iVar12 == 0x137) {
        local_98 = auVar6;
        if (*(long *)(lVar1 + 0x28) == local_58) {
          FUN_0085a238();
          return;
        }
        goto LAB_0085a020;
      }
      goto LAB_00859a6c;
    }
    if (iVar12 == 300) {
      if (*(long *)(lVar1 + 0x28) == local_58) {
        FUN_0085a024();
        return;
      }
      goto LAB_0085a020;
    }
    if (iVar12 != 0x12e) goto LAB_00859a6c;
    uVar19 = *(undefined8 *)(param_1 + 0x94);
    uVar20 = *(undefined8 *)(param_1 + 0x9c);
    piVar21 = &local_80;
    uVar22 = 0;
    local_80 = 0;
    iStack_7c = 0;
    iStack_78 = 0;
    iStack_74 = 0;
LAB_0085994c:
    pcVar15 = (char *)FUN_0085b410(param_1,uVar19,uVar20,uVar19,piVar21,uVar22,0);
  }
LAB_00859d20:
  param_1 = pcVar15;
  if (*(long *)(lVar1 + 0x28) == local_58) {
    return;
  }
LAB_0085a020:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(param_1);
}

