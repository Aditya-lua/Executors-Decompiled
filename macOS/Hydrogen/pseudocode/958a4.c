
/* WARNING: Removing unreachable block (ram,0x00095ed4) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined * FUN_000958a4(long param_1,long param_2,long *param_3,long param_4,long param_5)

{
  undefined4 uVar1;
  ulong uVar2;
  undefined8 uVar3;
  int iVar4;
  long *plVar5;
  long *plVar6;
  undefined *puVar7;
  long *plVar8;
  uint uVar9;
  uint uVar10;
  undefined8 uVar11;
  ulong uVar12;
  uint *puVar13;
  long lVar14;
  long lVar15;
  undefined8 uStack0000000000000010;
  ulong in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000040;
  undefined4 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined4 in_stack_00000058;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  
  if (param_1 == 0) {
    return (undefined *)0x10;
  }
  if (param_2 == 0) {
    return (undefined *)0x10;
  }
  plVar5 = (long *)_malloc(0x18);
  if (plVar5 == (long *)0x0) {
    return (undefined *)0x100;
  }
  plVar6 = (long *)_malloc(0x40);
  *plVar5 = (long)plVar6;
  if (plVar6 == (long *)0x0) {
    _free(plVar5);
    return (undefined *)0x100;
  }
  plVar5[1] = 0xa28d58;
  plVar5[2] = (long)plRam0000000000a28d68;
  *(long **)((long)plRam0000000000a28d68 + 8) = plVar5;
  plRam0000000000a28d68 = plVar5;
  *plVar6 = param_2;
  plVar6[1] = param_1;
  plVar5 = (long *)_malloc(0x30);
  if (plVar5 == (long *)0x0) {
    puVar7 = (undefined *)0x100;
    goto joined_r0x00095a08;
  }
  iVar4 = func_0x00096a40("vm_protect","dyld",plVar5 + 3);
  if ((iVar4 == 0) ||
     (puVar7 = (undefined *)func_0x00096a40("_vm_protect","libsystem_kernel",plVar5 + 3),
     (int)puVar7 == 0)) {
    *plVar5 = (long)plVar6;
    plVar5[1] = 0;
    plVar5[2] = param_2;
    plVar5[4] = param_4;
    plVar5[5] = param_5;
    lVar14 = plVar6[1];
    in_stack_00000030 = 0;
    in_stack_00000018 = 0;
    uStack0000000000000010 = 0;
    in_stack_00000028 = 0;
    in_stack_00000020 = 0;
    if (lVar14 == 0) {
      puVar7 = (undefined *)0x11;
    }
    else {
      puVar7 = (undefined *)func_0x00094cbc();
      if ((int)puVar7 == 0) {
        uVar2 = lVar14 - param_2;
        uVar12 = -uVar2;
        if (-1 < (long)uVar2) {
          uVar12 = uVar2;
        }
        if (uVar12 < 0xfffffffe) {
          puVar7 = (undefined *)
                   func_0x00095150(&uStack0000000000000010,&UNK_0080bea0,lVar14,param_2);
          if ((int)puVar7 == 0) {
            puVar7 = (undefined *)func_0x00094fac(&uStack0000000000000010,0xd61f0220);
            goto code_r0x00095a24;
          }
        }
        else {
          puVar7 = (undefined *)func_0x000956ac();
code_r0x00095a24:
          if (((int)puVar7 == 0) && (puVar7 = (undefined *)func_0x00094e4c(), (int)puVar7 == 0)) {
            uVar12 = in_stack_00000018 & 0xffffffff;
            lVar14 = _malloc(uVar12);
            if (lVar14 != 0) {
              _memcpy(lVar14,uStack0000000000000010,uVar12);
              plVar8 = (long *)_malloc(0x10);
              plVar5[1] = (long)plVar8;
              if (plVar8 != (long *)0x0) {
                *plVar8 = lVar14;
                plVar8[1] = uVar12;
                func_0x000957d0();
                puVar7 = &UNK_00010002;
                if (*(long *)plVar5[1] != 0) {
                  lVar14 = ((long *)plVar5[1])[1];
                  lVar15 = *plVar5;
                  *(undefined8 *)(lVar15 + 0x10) = *(undefined8 *)(lVar15 + 8);
                  *(long *)(lVar15 + 0x18) = lVar14;
                  *(undefined8 *)(lVar15 + 0x20) = 0;
                  *(undefined8 *)(lVar15 + 0x28) = 0;
                  in_stack_00000030 = 0;
                  in_stack_00000018 = 0;
                  uStack0000000000000010 = 0;
                  in_stack_00000028 = 0;
                  in_stack_00000020 = 0;
                  puVar13 = *(uint **)(lVar15 + 0x10);
                  puVar7 = (undefined *)func_0x00094cbc();
                  uVar3 = _UNK_0080be98;
                  uVar11 = _UNK_0080be90;
                  if ((int)puVar7 == 0) {
                    uVar12 = (long)puVar13 - *(long *)(lVar15 + 0x10);
                    if (uVar12 < *(ulong *)(lVar15 + 0x18)) {
                      do {
                        uVar9 = *puVar13;
                        if ((uVar9 & 0x7c000000) == 0x14000000) {
                          uStack0000000000000040._0_4_ = 0;
                          uStack0000000000000040._4_4_ = 0;
                          puVar7 = (undefined *)func_0x00094d24(&uStack0000000000000040);
                          if (((int)puVar7 == 0) &&
                             (puVar7 = (undefined *)
                                       func_0x00095564(&uStack0000000000000010,&UNK_0080bea0,
                                                       CONCAT44(uStack0000000000000040._4_4_,
                                                                (uint)uStack0000000000000040)),
                             (int)puVar7 == 0)) {
                            uVar10 = uVar9 >> 0x1a;
                            uVar9 = 0xd63f0220;
                            if (uVar10 != 0x25) {
                              uVar9 = 0xd61f0220;
                            }
code_r0x00095bc0:
                            puVar7 = (undefined *)func_0x00094fac(&uStack0000000000000010,uVar9);
                          }
                        }
                        else if ((uVar9 & 0x3b000000) == 0x18000000) {
                          puVar7 = (undefined *)
                                   func_0x00095298(&uStack0000000000000010,&UNK_0080bea0,
                                                   (long)puVar13 +
                                                   (((ulong)(uVar9 >> 3) & 0x1ffffc) -
                                                   ((ulong)(uVar9 >> 2) & 0x200000)));
                          if ((int)puVar7 == 0) {
                            if (uVar9 >> 0x1e == 0) {
                              in_stack_00000068 = uVar3;
                            }
                            else {
                              if (uVar9 >> 0x1e != 1) {
                                puVar7 = (undefined *)0x14;
                                goto LAB_00095d78;
                              }
                              in_stack_00000068 = uVar11;
                            }
                            uStack0000000000000040._0_4_ = 0x11;
                            uStack0000000000000040._4_4_ = 0x40;
                            in_stack_00000048 = 1;
                            in_stack_00000050 = 0;
                            in_stack_00000058 = 0;
                            uStack0000000000000060._4_4_ = uVar9 & 0x1f;
                            puVar7 = (undefined *)
                                     func_0x00095050(&uStack0000000000000010,0xc0400000,
                                                     (long)&uStack0000000000000060 + 4,
                                                     &uStack0000000000000040);
                          }
                        }
                        else {
                          if ((uVar9 & 0x9f000000) == 0x90000000) {
                            uVar12 = (ulong)(puVar13 +
                                            ((ulong)(uVar9 >> 3 & 0x1ffffc | uVar9 >> 0x1d & 3) -
                                            ((ulong)(uVar9 >> 2) & 0x200000)) * 0x400) &
                                     0xfffffffffffff000;
                          }
                          else {
                            if ((uVar9 & 0x9f000000) != 0x10000000) {
                              if (uVar9 >> 0x19 == 0x2a) {
                                uStack0000000000000040._0_4_ = 0;
                                uStack0000000000000040._4_4_ = 0;
                                puVar7 = (undefined *)func_0x00094d24(&uStack0000000000000040);
                                if ((int)puVar7 == 0) {
                                  uVar9 = uVar9 & 0xff00001f;
                                  uVar10 = 0x61;
code_r0x00095cf4:
                                  puVar7 = (undefined *)
                                           func_0x00094fac(&uStack0000000000000010,uVar9 ^ uVar10);
                                  if (((int)puVar7 == 0) &&
                                     (puVar7 = (undefined *)
                                               func_0x00095564(&uStack0000000000000010,&UNK_0080bea0
                                                               ,CONCAT44(uStack0000000000000040.
                                                                         _4_4_,(uint)
                                                  uStack0000000000000040)), (int)puVar7 == 0)) {
                                    uVar9 = 0xd61f0220;
                                    goto code_r0x00095bc0;
                                  }
                                }
                              }
                              else if ((uVar9 & 0x7e000000) == 0x36000000) {
                                uStack0000000000000040._0_4_ = 0;
                                uStack0000000000000040._4_4_ = 0;
                                if (uVar9 == 0) {
code_r0x00095e4c:
                                  uStack0000000000000040._4_4_ = 0;
                                  uStack0000000000000040._0_4_ = 0;
                                  puVar7 = (undefined *)0x11;
                                }
                                else {
                                  puVar7 = (undefined *)func_0x00094d24(&uStack0000000000000040);
                                  if ((int)puVar7 == 0) {
                                    uVar9 = uVar9 & 0xfff8001f;
                                    uVar10 = 0x1000060;
                                    goto code_r0x00095cf4;
                                  }
                                }
                              }
                              else {
                                if ((uVar9 & 0x7e000000) != 0x34000000) goto code_r0x00095bc0;
                                uStack0000000000000040._0_4_ = 0;
                                uStack0000000000000040._4_4_ = 0;
                                if (uVar9 == 0) goto code_r0x00095e4c;
                                puVar7 = (undefined *)func_0x00094d24(&uStack0000000000000040);
                                if ((int)puVar7 == 0) {
                                  uVar9 = uVar9 & 0xff00001f;
                                  uVar10 = 0x1000060;
                                  goto code_r0x00095cf4;
                                }
                              }
                              goto LAB_00095d78;
                            }
                            uVar12 = (long)puVar13 +
                                     ((ulong)(uVar9 >> 3 & 0x1ffffc | uVar9 >> 0x1d) -
                                     ((ulong)(uVar9 >> 2) & 0x200000));
                          }
                          uStack0000000000000040._0_4_ = uVar9 & 0x1f;
                          uStack0000000000000040._4_4_ = (undefined4)uVar11;
                          in_stack_00000048 = (undefined4)((ulong)uVar11 >> 0x20);
                          uRam0000000000a334b8 = uVar9;
                          puVar7 = (undefined *)
                                   func_0x00095298(&uStack0000000000000010,&uStack0000000000000040,
                                                   uVar12);
                        }
LAB_00095d78:
                        puVar13 = puVar13 + 1;
                        uVar12 = (long)puVar13 - *(long *)(lVar15 + 0x10);
                      } while ((uVar12 < *(ulong *)(lVar15 + 0x18)) && ((int)puVar7 == 0));
                      if ((int)puVar7 == 0) goto code_r0x00095e58;
                    }
                    else {
code_r0x00095e58:
                      *(ulong *)(lVar15 + 0x18) = uVar12;
                      puVar7 = (undefined *)func_0x000956ac();
                      if (((int)puVar7 == 0) &&
                         (puVar7 = (undefined *)func_0x00094e4c(), (int)puVar7 == 0)) {
                        uStack0000000000000040._0_4_ = 0;
                        uStack0000000000000040._4_4_ = 0;
                        puVar7 = (undefined *)
                                 func_0x000963a4(&uStack0000000000000040,0xa33a08,
                                                 in_stack_00000018 & 0xffffffff);
                        if ((int)puVar7 == 0) {
                          uVar11 = *(undefined8 *)
                                    CONCAT44(uStack0000000000000040._4_4_,
                                             (uint)uStack0000000000000040);
                          puVar7 = (undefined *)
                                   func_0x00096190(plVar5,uVar11,uStack0000000000000010,
                                                   in_stack_00000018 & 0xffffffff);
                          if ((int)puVar7 == 0) {
                            *(undefined8 *)(lVar15 + 0x20) = uVar11;
                            *(ulong *)(lVar15 + 0x28) = in_stack_00000018 & 0xffffffff;
                            func_0x000957d0();
                            lVar14 = *plVar5;
                            puVar7 = &UNK_00010002;
                            if (*(long *)(lVar14 + 0x28) != 0) {
                              uVar11 = *(undefined8 *)(lVar14 + 8);
                              uVar1 = *(undefined4 *)(lVar14 + 0x18);
                              lVar15 = _malloc(uVar1);
                              *(long *)(lVar14 + 0x38) = lVar15;
                              if (lVar15 == 0) {
                                puVar7 = (undefined *)0x100;
                              }
                              else {
                                _memcpy(lVar15,uVar11,uVar1);
                                puVar7 = (undefined *)
                                         func_0x00096190(plVar5,uVar11,*(undefined8 *)plVar5[1],
                                                         *(undefined4 *)
                                                          ((undefined8 *)plVar5[1] + 1));
                                if ((int)puVar7 == 0) goto code_r0x00095eb0;
                                if (*(long *)(*plVar5 + 0x38) != 0) {
                                  _free();
                                }
                              }
                            }
                            goto LAB_00095e8c;
                          }
                        }
                        func_0x000957d0();
                        goto LAB_00095e8c;
                      }
                    }
                    func_0x000957d0();
                  }
                  else {
                  }
                }
LAB_00095e8c:
                if ((*(long *)plVar5[1] == 0) || (_free(*(long *)plVar5[1]), plVar5[1] != 0)) {
                  _free();
                }
                if ((int)puVar7 == 0) {
code_r0x00095eb0:
                  plVar6[6] = (long)plVar5;
                  if (param_3 == (long *)0x0) {
                    return (undefined *)0x0;
                  }
                  *param_3 = plVar6[4];
                  return (undefined *)0x0;
                }
                goto FUN_00095ae0;
              }
              _free(lVar14);
            }
            puVar7 = (undefined *)0x100;
          }
        }
        func_0x000957d0();
      }
    }
  }
FUN_00095ae0:
  _free(plVar5);
joined_r0x00095a08:
  if (plRam0000000000a28d68 != (long *)0xa28d58) {
    func_0x00095fb8();
  }
  return puVar7;
}

