
/* WARNING: Removing unreachable block (ram,0x00095ed4) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined * FUN_00095940(undefined8 param_1)

{
  undefined4 uVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined *puVar4;
  long *plVar5;
  uint uVar6;
  uint uVar7;
  undefined8 *unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  undefined8 uVar8;
  long unaff_x23;
  ulong uVar9;
  uint *puVar10;
  long unaff_x24;
  long lVar11;
  long unaff_x25;
  long lVar12;
  long unaff_x28;
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
  
  puVar4 = (undefined *)func_0x00096a40(param_1,"libsystem_kernel");
  if ((int)puVar4 != 0) goto LAB_00095ae0;
  *unaff_x20 = unaff_x21;
  unaff_x20[1] = 0;
  unaff_x20[2] = unaff_x23;
  unaff_x20[4] = unaff_x24;
  unaff_x20[5] = unaff_x25;
  lVar11 = *(long *)(unaff_x21 + 8);
  in_stack_00000030 = 0;
  in_stack_00000018 = 0;
  uStack0000000000000010 = 0;
  in_stack_00000028 = 0;
  in_stack_00000020 = 0;
  if (lVar11 == 0) {
    puVar4 = (undefined *)0x11;
    goto LAB_00095ae0;
  }
  puVar4 = (undefined *)func_0x00094cbc();
  if ((int)puVar4 != 0) goto LAB_00095ae0;
  uVar2 = lVar11 - unaff_x23;
  uVar9 = -uVar2;
  if (-1 < (long)uVar2) {
    uVar9 = uVar2;
  }
  if (uVar9 < 0xfffffffe) {
    puVar4 = (undefined *)func_0x00095150(&uStack0000000000000010,&UNK_0080bea0,lVar11);
    if ((int)puVar4 == 0) {
      puVar4 = (undefined *)func_0x00094fac(&uStack0000000000000010,0xd61f0220);
      goto code_r0x00095a24;
    }
  }
  else {
    puVar4 = (undefined *)func_0x000956ac();
code_r0x00095a24:
    if (((int)puVar4 == 0) && (puVar4 = (undefined *)func_0x00094e4c(), (int)puVar4 == 0)) {
      uVar9 = in_stack_00000018 & 0xffffffff;
      lVar11 = _malloc(uVar9);
      if (lVar11 != 0) {
        _memcpy(lVar11,uStack0000000000000010,uVar9);
        plVar5 = (long *)_malloc(0x10);
        unaff_x20[1] = (long)plVar5;
        if (plVar5 != (long *)0x0) {
          *plVar5 = lVar11;
          plVar5[1] = uVar9;
          func_0x000957d0();
          puVar4 = &UNK_00010002;
          if (*(long *)unaff_x20[1] != 0) {
            lVar11 = ((long *)unaff_x20[1])[1];
            lVar12 = *unaff_x20;
            *(undefined8 *)(lVar12 + 0x10) = *(undefined8 *)(lVar12 + 8);
            *(long *)(lVar12 + 0x18) = lVar11;
            *(undefined8 *)(lVar12 + 0x20) = 0;
            *(undefined8 *)(lVar12 + 0x28) = 0;
            in_stack_00000030 = 0;
            in_stack_00000018 = 0;
            uStack0000000000000010 = 0;
            in_stack_00000028 = 0;
            in_stack_00000020 = 0;
            puVar10 = *(uint **)(lVar12 + 0x10);
            puVar4 = (undefined *)func_0x00094cbc();
            uVar3 = _UNK_0080be98;
            uVar8 = _UNK_0080be90;
            if ((int)puVar4 == 0) {
              uVar9 = (long)puVar10 - *(long *)(lVar12 + 0x10);
              if (uVar9 < *(ulong *)(lVar12 + 0x18)) {
                do {
                  uVar6 = *puVar10;
                  if ((uVar6 & 0x7c000000) == 0x14000000) {
                    uStack0000000000000040._0_4_ = 0;
                    uStack0000000000000040._4_4_ = 0;
                    puVar4 = (undefined *)func_0x00094d24(&uStack0000000000000040);
                    if (((int)puVar4 == 0) &&
                       (puVar4 = (undefined *)
                                 func_0x00095564(&uStack0000000000000010,&UNK_0080bea0,
                                                 CONCAT44(uStack0000000000000040._4_4_,
                                                          (uint)uStack0000000000000040)),
                       (int)puVar4 == 0)) {
                      uVar7 = uVar6 >> 0x1a;
                      uVar6 = 0xd63f0220;
                      if (uVar7 != 0x25) {
                        uVar6 = 0xd61f0220;
                      }
code_r0x00095bc0:
                      puVar4 = (undefined *)func_0x00094fac(&uStack0000000000000010,uVar6);
                    }
                  }
                  else if ((uVar6 & 0x3b000000) == 0x18000000) {
                    puVar4 = (undefined *)
                             func_0x00095298(&uStack0000000000000010,&UNK_0080bea0,
                                             (long)puVar10 +
                                             (((ulong)(uVar6 >> 3) & 0x1ffffc) -
                                             ((ulong)(uVar6 >> 2) & 0x200000)));
                    if ((int)puVar4 == 0) {
                      if (uVar6 >> 0x1e == 0) {
                        in_stack_00000068 = uVar3;
                      }
                      else {
                        if (uVar6 >> 0x1e != 1) {
                          puVar4 = (undefined *)0x14;
                          goto code_r0x00095d78;
                        }
                        in_stack_00000068 = uVar8;
                      }
                      uStack0000000000000040._0_4_ = 0x11;
                      uStack0000000000000040._4_4_ = 0x40;
                      in_stack_00000048 = 1;
                      in_stack_00000050 = 0;
                      in_stack_00000058 = 0;
                      uStack0000000000000060._4_4_ = uVar6 & 0x1f;
                      puVar4 = (undefined *)
                               func_0x00095050(&uStack0000000000000010,0xc0400000,
                                               (long)&uStack0000000000000060 + 4,
                                               &uStack0000000000000040);
                    }
                  }
                  else {
                    if ((uVar6 & 0x9f000000) == 0x90000000) {
                      uVar9 = (ulong)(puVar10 +
                                     ((ulong)(uVar6 >> 3 & 0x1ffffc | uVar6 >> 0x1d & 3) -
                                     ((ulong)(uVar6 >> 2) & 0x200000)) * 0x400) & 0xfffffffffffff000
                      ;
                    }
                    else {
                      if ((uVar6 & 0x9f000000) != 0x10000000) {
                        if (uVar6 >> 0x19 == 0x2a) {
                          uStack0000000000000040._0_4_ = 0;
                          uStack0000000000000040._4_4_ = 0;
                          puVar4 = (undefined *)func_0x00094d24(&uStack0000000000000040);
                          if ((int)puVar4 == 0) {
                            uVar6 = uVar6 & 0xff00001f;
                            uVar7 = 0x61;
code_r0x00095cf4:
                            puVar4 = (undefined *)
                                     func_0x00094fac(&uStack0000000000000010,uVar6 ^ uVar7);
                            if (((int)puVar4 == 0) &&
                               (puVar4 = (undefined *)
                                         func_0x00095564(&uStack0000000000000010,&UNK_0080bea0,
                                                         CONCAT44(uStack0000000000000040._4_4_,
                                                                  (uint)uStack0000000000000040)),
                               (int)puVar4 == 0)) {
                              uVar6 = 0xd61f0220;
                              goto code_r0x00095bc0;
                            }
                          }
                        }
                        else if ((uVar6 & 0x7e000000) == 0x36000000) {
                          uStack0000000000000040._0_4_ = 0;
                          uStack0000000000000040._4_4_ = 0;
                          if (uVar6 == 0) {
code_r0x00095e4c:
                            uStack0000000000000040._4_4_ = 0;
                            uStack0000000000000040._0_4_ = 0;
                            puVar4 = (undefined *)0x11;
                          }
                          else {
                            puVar4 = (undefined *)func_0x00094d24(&uStack0000000000000040);
                            if ((int)puVar4 == 0) {
                              uVar6 = uVar6 & 0xfff8001f;
                              uVar7 = 0x1000060;
                              goto code_r0x00095cf4;
                            }
                          }
                        }
                        else {
                          if ((uVar6 & 0x7e000000) != 0x34000000) goto code_r0x00095bc0;
                          uStack0000000000000040._0_4_ = 0;
                          uStack0000000000000040._4_4_ = 0;
                          if (uVar6 == 0) goto code_r0x00095e4c;
                          puVar4 = (undefined *)func_0x00094d24(&uStack0000000000000040);
                          if ((int)puVar4 == 0) {
                            uVar6 = uVar6 & 0xff00001f;
                            uVar7 = 0x1000060;
                            goto code_r0x00095cf4;
                          }
                        }
                        goto code_r0x00095d78;
                      }
                      uVar9 = (long)puVar10 +
                              ((ulong)(uVar6 >> 3 & 0x1ffffc | uVar6 >> 0x1d) -
                              ((ulong)(uVar6 >> 2) & 0x200000));
                    }
                    uStack0000000000000040._0_4_ = uVar6 & 0x1f;
                    uStack0000000000000040._4_4_ = (undefined4)uVar8;
                    in_stack_00000048 = (undefined4)((ulong)uVar8 >> 0x20);
                    uRam0000000000a334b8 = uVar6;
                    puVar4 = (undefined *)
                             func_0x00095298(&uStack0000000000000010,&uStack0000000000000040,uVar9);
                  }
code_r0x00095d78:
                  puVar10 = puVar10 + 1;
                  uVar9 = (long)puVar10 - *(long *)(lVar12 + 0x10);
                } while ((uVar9 < *(ulong *)(lVar12 + 0x18)) && ((int)puVar4 == 0));
                if ((int)puVar4 == 0) goto code_r0x00095e58;
              }
              else {
code_r0x00095e58:
                *(ulong *)(lVar12 + 0x18) = uVar9;
                puVar4 = (undefined *)func_0x000956ac();
                if (((int)puVar4 == 0) &&
                   (puVar4 = (undefined *)func_0x00094e4c(), (int)puVar4 == 0)) {
                  uStack0000000000000040._0_4_ = 0;
                  uStack0000000000000040._4_4_ = 0;
                  puVar4 = (undefined *)
                           func_0x000963a4(&uStack0000000000000040,0xa33a08,
                                           in_stack_00000018 & 0xffffffff);
                  if ((int)puVar4 == 0) {
                    uVar8 = *(undefined8 *)
                             CONCAT44(uStack0000000000000040._4_4_,(uint)uStack0000000000000040);
                    puVar4 = (undefined *)func_0x00096190();
                    if ((int)puVar4 == 0) {
                      *(undefined8 *)(lVar12 + 0x20) = uVar8;
                      *(ulong *)(lVar12 + 0x28) = in_stack_00000018 & 0xffffffff;
                      func_0x000957d0();
                      lVar11 = *unaff_x20;
                      puVar4 = &UNK_00010002;
                      if (*(long *)(lVar11 + 0x28) != 0) {
                        uVar8 = *(undefined8 *)(lVar11 + 8);
                        uVar1 = *(undefined4 *)(lVar11 + 0x18);
                        lVar12 = _malloc(uVar1);
                        *(long *)(lVar11 + 0x38) = lVar12;
                        if (lVar12 == 0) {
                          puVar4 = (undefined *)0x100;
                        }
                        else {
                          _memcpy(lVar12,uVar8,uVar1);
                          puVar4 = (undefined *)func_0x00096190();
                          if ((int)puVar4 == 0) goto code_r0x00095eb0;
                          if (*(long *)(*unaff_x20 + 0x38) != 0) {
                            _free();
                          }
                        }
                      }
                      goto code_r0x00095e8c;
                    }
                  }
                  func_0x000957d0();
                  goto code_r0x00095e8c;
                }
              }
              func_0x000957d0();
            }
            else {
            }
          }
code_r0x00095e8c:
          if ((*(long *)unaff_x20[1] == 0) || (_free(*(long *)unaff_x20[1]), unaff_x20[1] != 0)) {
            _free();
          }
          if ((int)puVar4 == 0) {
code_r0x00095eb0:
            *(long **)(unaff_x21 + 0x30) = unaff_x20;
            if (unaff_x19 == (undefined8 *)0x0) {
              return (undefined *)0x0;
            }
            *unaff_x19 = *(undefined8 *)(unaff_x21 + 0x20);
            return (undefined *)0x0;
          }
          goto LAB_00095ae0;
        }
        _free(lVar11);
      }
      puVar4 = (undefined *)0x100;
    }
  }
  func_0x000957d0();
LAB_00095ae0:
  _free();
  if (*(long *)(unaff_x28 + 0x10) != unaff_x28) {
    func_0x00095fb8();
  }
  return puVar4;
}

