
/* WARNING: Removing unreachable block (ram,0x00095ed4) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined * FUN_00095a44(void)

{
  undefined4 uVar1;
  undefined8 uVar2;
  long lVar3;
  long *plVar4;
  undefined *puVar5;
  uint uVar6;
  ulong uVar7;
  uint uVar8;
  undefined8 *unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  undefined8 uVar9;
  long unaff_x23;
  uint *puVar10;
  long lVar11;
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
  
  lVar3 = _malloc();
  if (lVar3 != 0) {
    _memcpy(lVar3,uStack0000000000000010);
    plVar4 = (long *)_malloc(0x10);
    unaff_x20[1] = (long)plVar4;
    if (plVar4 != (long *)0x0) {
      *plVar4 = lVar3;
      plVar4[1] = unaff_x23;
      func_0x000957d0();
      puVar5 = &UNK_00010002;
      if (*(long *)unaff_x20[1] != 0) {
        lVar3 = ((long *)unaff_x20[1])[1];
        lVar11 = *unaff_x20;
        *(undefined8 *)(lVar11 + 0x10) = *(undefined8 *)(lVar11 + 8);
        *(long *)(lVar11 + 0x18) = lVar3;
        *(undefined8 *)(lVar11 + 0x20) = 0;
        *(undefined8 *)(lVar11 + 0x28) = 0;
        in_stack_00000030 = 0;
        in_stack_00000018 = 0;
        uStack0000000000000010 = 0;
        in_stack_00000028 = 0;
        in_stack_00000020 = 0;
        puVar10 = *(uint **)(lVar11 + 0x10);
        puVar5 = (undefined *)func_0x00094cbc();
        uVar2 = _UNK_0080be98;
        uVar9 = _UNK_0080be90;
        if ((int)puVar5 == 0) {
          uVar7 = (long)puVar10 - *(long *)(lVar11 + 0x10);
          if (uVar7 < *(ulong *)(lVar11 + 0x18)) {
            do {
              uVar6 = *puVar10;
              if ((uVar6 & 0x7c000000) == 0x14000000) {
                uStack0000000000000040._0_4_ = 0;
                uStack0000000000000040._4_4_ = 0;
                puVar5 = (undefined *)func_0x00094d24(&uStack0000000000000040);
                if (((int)puVar5 == 0) &&
                   (puVar5 = (undefined *)
                             func_0x00095564(&uStack0000000000000010,&UNK_0080bea0,
                                             CONCAT44(uStack0000000000000040._4_4_,
                                                      (uint)uStack0000000000000040)),
                   (int)puVar5 == 0)) {
                  uVar8 = uVar6 >> 0x1a;
                  uVar6 = 0xd63f0220;
                  if (uVar8 != 0x25) {
                    uVar6 = 0xd61f0220;
                  }
code_r0x00095bc0:
                  puVar5 = (undefined *)func_0x00094fac(&uStack0000000000000010,uVar6);
                }
              }
              else if ((uVar6 & 0x3b000000) == 0x18000000) {
                puVar5 = (undefined *)
                         func_0x00095298(&uStack0000000000000010,&UNK_0080bea0,
                                         (long)puVar10 +
                                         (((ulong)(uVar6 >> 3) & 0x1ffffc) -
                                         ((ulong)(uVar6 >> 2) & 0x200000)));
                if ((int)puVar5 == 0) {
                  if (uVar6 >> 0x1e == 0) {
                    in_stack_00000068 = uVar2;
                  }
                  else {
                    if (uVar6 >> 0x1e != 1) {
                      puVar5 = (undefined *)0x14;
                      goto code_r0x00095d78;
                    }
                    in_stack_00000068 = uVar9;
                  }
                  uStack0000000000000040._0_4_ = 0x11;
                  uStack0000000000000040._4_4_ = 0x40;
                  in_stack_00000048 = 1;
                  in_stack_00000050 = 0;
                  in_stack_00000058 = 0;
                  uStack0000000000000060._4_4_ = uVar6 & 0x1f;
                  puVar5 = (undefined *)
                           func_0x00095050(&uStack0000000000000010,0xc0400000,
                                           (long)&uStack0000000000000060 + 4,&uStack0000000000000040
                                          );
                }
              }
              else {
                if ((uVar6 & 0x9f000000) == 0x90000000) {
                  uVar7 = (ulong)(puVar10 +
                                 ((ulong)(uVar6 >> 3 & 0x1ffffc | uVar6 >> 0x1d & 3) -
                                 ((ulong)(uVar6 >> 2) & 0x200000)) * 0x400) & 0xfffffffffffff000;
                }
                else {
                  if ((uVar6 & 0x9f000000) != 0x10000000) {
                    if (uVar6 >> 0x19 == 0x2a) {
                      uStack0000000000000040._0_4_ = 0;
                      uStack0000000000000040._4_4_ = 0;
                      puVar5 = (undefined *)func_0x00094d24(&uStack0000000000000040);
                      if ((int)puVar5 == 0) {
                        uVar6 = uVar6 & 0xff00001f;
                        uVar8 = 0x61;
code_r0x00095cf4:
                        puVar5 = (undefined *)func_0x00094fac(&uStack0000000000000010,uVar6 ^ uVar8)
                        ;
                        if (((int)puVar5 == 0) &&
                           (puVar5 = (undefined *)
                                     func_0x00095564(&uStack0000000000000010,&UNK_0080bea0,
                                                     CONCAT44(uStack0000000000000040._4_4_,
                                                              (uint)uStack0000000000000040)),
                           (int)puVar5 == 0)) {
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
                        puVar5 = (undefined *)0x11;
                      }
                      else {
                        puVar5 = (undefined *)func_0x00094d24(&uStack0000000000000040);
                        if ((int)puVar5 == 0) {
                          uVar6 = uVar6 & 0xfff8001f;
                          uVar8 = 0x1000060;
                          goto code_r0x00095cf4;
                        }
                      }
                    }
                    else {
                      if ((uVar6 & 0x7e000000) != 0x34000000) goto code_r0x00095bc0;
                      uStack0000000000000040._0_4_ = 0;
                      uStack0000000000000040._4_4_ = 0;
                      if (uVar6 == 0) goto code_r0x00095e4c;
                      puVar5 = (undefined *)func_0x00094d24(&uStack0000000000000040);
                      if ((int)puVar5 == 0) {
                        uVar6 = uVar6 & 0xff00001f;
                        uVar8 = 0x1000060;
                        goto code_r0x00095cf4;
                      }
                    }
                    goto code_r0x00095d78;
                  }
                  uVar7 = (long)puVar10 +
                          ((ulong)(uVar6 >> 3 & 0x1ffffc | uVar6 >> 0x1d) -
                          ((ulong)(uVar6 >> 2) & 0x200000));
                }
                uStack0000000000000040._0_4_ = uVar6 & 0x1f;
                uStack0000000000000040._4_4_ = (undefined4)uVar9;
                in_stack_00000048 = (undefined4)((ulong)uVar9 >> 0x20);
                uRam0000000000a334b8 = uVar6;
                puVar5 = (undefined *)
                         func_0x00095298(&uStack0000000000000010,&uStack0000000000000040,uVar7);
              }
code_r0x00095d78:
              puVar10 = puVar10 + 1;
              uVar7 = (long)puVar10 - *(long *)(lVar11 + 0x10);
            } while ((uVar7 < *(ulong *)(lVar11 + 0x18)) && ((int)puVar5 == 0));
            if ((int)puVar5 == 0) goto code_r0x00095e58;
          }
          else {
code_r0x00095e58:
            *(ulong *)(lVar11 + 0x18) = uVar7;
            puVar5 = (undefined *)func_0x000956ac();
            if (((int)puVar5 == 0) && (puVar5 = (undefined *)func_0x00094e4c(), (int)puVar5 == 0)) {
              uStack0000000000000040._0_4_ = 0;
              uStack0000000000000040._4_4_ = 0;
              puVar5 = (undefined *)
                       func_0x000963a4(&uStack0000000000000040,0xa33a08,
                                       in_stack_00000018 & 0xffffffff);
              if ((int)puVar5 == 0) {
                uVar9 = *(undefined8 *)
                         CONCAT44(uStack0000000000000040._4_4_,(uint)uStack0000000000000040);
                puVar5 = (undefined *)func_0x00096190();
                if ((int)puVar5 == 0) {
                  *(undefined8 *)(lVar11 + 0x20) = uVar9;
                  *(ulong *)(lVar11 + 0x28) = in_stack_00000018 & 0xffffffff;
                  func_0x000957d0();
                  lVar3 = *unaff_x20;
                  puVar5 = &UNK_00010002;
                  if (*(long *)(lVar3 + 0x28) != 0) {
                    uVar9 = *(undefined8 *)(lVar3 + 8);
                    uVar1 = *(undefined4 *)(lVar3 + 0x18);
                    lVar11 = _malloc(uVar1);
                    *(long *)(lVar3 + 0x38) = lVar11;
                    if (lVar11 == 0) {
                      puVar5 = (undefined *)0x100;
                    }
                    else {
                      _memcpy(lVar11,uVar9,uVar1);
                      puVar5 = (undefined *)func_0x00096190();
                      if ((int)puVar5 == 0) goto code_r0x00095eb0;
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
      if ((int)puVar5 == 0) {
code_r0x00095eb0:
        *(long **)(unaff_x21 + 0x30) = unaff_x20;
        if (unaff_x19 == (undefined8 *)0x0) {
          return (undefined *)0x0;
        }
        *unaff_x19 = *(undefined8 *)(unaff_x21 + 0x20);
        return (undefined *)0x0;
      }
      goto code_r0x00095ae0;
    }
    _free(lVar3);
  }
  puVar5 = (undefined *)0x100;
  func_0x000957d0();
code_r0x00095ae0:
  _free();
  if (*(long *)(unaff_x28 + 0x10) != unaff_x28) {
    func_0x00095fb8();
  }
  return puVar5;
}

