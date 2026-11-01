
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00095aac(undefined1 param_1 [16])

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  int iVar4;
  undefined8 uVar5;
  long lVar6;
  uint uVar7;
  ulong uVar8;
  uint uVar9;
  undefined8 *unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  uint *puVar10;
  long lVar11;
  long unaff_x25;
  long unaff_x28;
  long lStack0000000000000000;
  long *plStack0000000000000008;
  undefined8 uStack0000000000000010;
  uint in_stack_00000018;
  undefined8 uStack0000000000000040;
  undefined4 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined4 in_stack_00000058;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  
  plStack0000000000000008 = param_1._8_8_;
  lStack0000000000000000 = param_1._0_8_;
  puVar10 = *(uint **)(unaff_x25 + 0x10);
  uVar5 = func_0x00094cbc();
  uVar3 = _UNK_0080be98;
  uVar2 = _UNK_0080be90;
  if ((int)uVar5 == 0) {
    uVar8 = (long)puVar10 - *(long *)(unaff_x25 + 0x10);
    if (uVar8 < *(ulong *)(unaff_x25 + 0x18)) {
      do {
        uVar7 = *puVar10;
        if ((uVar7 & 0x7c000000) == 0x14000000) {
          uStack0000000000000040._0_4_ = 0;
          uStack0000000000000040._4_4_ = 0;
          uVar5 = func_0x00094d24(&uStack0000000000000040);
          if (((int)uVar5 == 0) &&
             (uVar5 = func_0x00095564(&uStack0000000000000010,&UNK_0080bea0,
                                      CONCAT44(uStack0000000000000040._4_4_,
                                               (uint)uStack0000000000000040)), (int)uVar5 == 0)) {
            uVar9 = uVar7 >> 0x1a;
            uVar7 = 0xd63f0220;
            if (uVar9 != 0x25) {
              uVar7 = 0xd61f0220;
            }
code_r0x00095bc0:
            uVar5 = func_0x00094fac(&uStack0000000000000010,uVar7);
          }
        }
        else if ((uVar7 & 0x3b000000) == 0x18000000) {
          uVar5 = func_0x00095298(&uStack0000000000000010,&UNK_0080bea0,
                                  (long)puVar10 +
                                  (((ulong)(uVar7 >> 3) & 0x1ffffc) -
                                  ((ulong)(uVar7 >> 2) & 0x200000)));
          if ((int)uVar5 == 0) {
            if (uVar7 >> 0x1e == 0) {
              in_stack_00000068 = uVar3;
            }
            else {
              if (uVar7 >> 0x1e != 1) {
                uVar5 = 0x14;
                goto LAB_00095d78;
              }
              in_stack_00000068 = uVar2;
            }
            uStack0000000000000040._0_4_ = 0x11;
            uStack0000000000000040._4_4_ = 0x40;
            in_stack_00000048 = 1;
            in_stack_00000050 = 0;
            in_stack_00000058 = 0;
            uStack0000000000000060._4_4_ = uVar7 & 0x1f;
            uVar5 = func_0x00095050(&uStack0000000000000010,0xc0400000,
                                    (long)&uStack0000000000000060 + 4,&uStack0000000000000040);
          }
        }
        else {
          if ((uVar7 & 0x9f000000) == 0x90000000) {
            uVar8 = (ulong)(puVar10 +
                           ((ulong)(uVar7 >> 3 & 0x1ffffc | uVar7 >> 0x1d & 3) -
                           ((ulong)(uVar7 >> 2) & 0x200000)) * 0x400) & 0xfffffffffffff000;
          }
          else {
            if ((uVar7 & 0x9f000000) != 0x10000000) {
              if (uVar7 >> 0x19 == 0x2a) {
                uStack0000000000000040._0_4_ = 0;
                uStack0000000000000040._4_4_ = 0;
                uVar5 = func_0x00094d24(&uStack0000000000000040);
                if ((int)uVar5 == 0) {
                  uVar7 = uVar7 & 0xff00001f;
                  uVar9 = 0x61;
code_r0x00095cf4:
                  uVar5 = func_0x00094fac(&uStack0000000000000010,uVar7 ^ uVar9);
                  if (((int)uVar5 == 0) &&
                     (uVar5 = func_0x00095564(&uStack0000000000000010,&UNK_0080bea0,
                                              CONCAT44(uStack0000000000000040._4_4_,
                                                       (uint)uStack0000000000000040)),
                     (int)uVar5 == 0)) {
                    uVar7 = 0xd61f0220;
                    goto code_r0x00095bc0;
                  }
                }
              }
              else if ((uVar7 & 0x7e000000) == 0x36000000) {
                uStack0000000000000040._0_4_ = 0;
                uStack0000000000000040._4_4_ = 0;
                if (uVar7 == 0) {
code_r0x00095e4c:
                  uStack0000000000000040._4_4_ = 0;
                  uStack0000000000000040._0_4_ = 0;
                  uVar5 = 0x11;
                }
                else {
                  uVar5 = func_0x00094d24(&uStack0000000000000040);
                  if ((int)uVar5 == 0) {
                    uVar7 = uVar7 & 0xfff8001f;
                    uVar9 = 0x1000060;
                    goto code_r0x00095cf4;
                  }
                }
              }
              else {
                if ((uVar7 & 0x7e000000) != 0x34000000) goto code_r0x00095bc0;
                uStack0000000000000040._0_4_ = 0;
                uStack0000000000000040._4_4_ = 0;
                if (uVar7 == 0) goto code_r0x00095e4c;
                uVar5 = func_0x00094d24(&uStack0000000000000040);
                if ((int)uVar5 == 0) {
                  uVar7 = uVar7 & 0xff00001f;
                  uVar9 = 0x1000060;
                  goto code_r0x00095cf4;
                }
              }
              goto LAB_00095d78;
            }
            uVar8 = (long)puVar10 +
                    ((ulong)(uVar7 >> 3 & 0x1ffffc | uVar7 >> 0x1d) -
                    ((ulong)(uVar7 >> 2) & 0x200000));
          }
          uStack0000000000000040._0_4_ = uVar7 & 0x1f;
          uStack0000000000000040._4_4_ = (undefined4)uVar2;
          in_stack_00000048 = (undefined4)((ulong)uVar2 >> 0x20);
          uRam0000000000a334b8 = uVar7;
          uVar5 = func_0x00095298(&uStack0000000000000010,&uStack0000000000000040,uVar8);
        }
LAB_00095d78:
        puVar10 = puVar10 + 1;
        uVar8 = (long)puVar10 - *(long *)(unaff_x25 + 0x10);
      } while ((uVar8 < *(ulong *)(unaff_x25 + 0x18)) && ((int)uVar5 == 0));
      if ((int)uVar5 == 0) goto code_r0x00095e58;
    }
    else {
code_r0x00095e58:
      *(ulong *)(unaff_x25 + 0x18) = uVar8;
      uVar5 = func_0x000956ac();
      if (((int)uVar5 == 0) && (uVar5 = func_0x00094e4c(), (int)uVar5 == 0)) {
        uStack0000000000000040._0_4_ = 0;
        uStack0000000000000040._4_4_ = 0;
        if (lStack0000000000000000 == 0) {
          uVar5 = func_0x000963a4(&uStack0000000000000040,0xa33a08,in_stack_00000018);
          if ((int)uVar5 == 0) {
            plStack0000000000000008 =
                 (long *)CONCAT44(uStack0000000000000040._4_4_,(uint)uStack0000000000000040);
            lStack0000000000000000 = *plStack0000000000000008;
            uVar5 = func_0x00096190();
            iVar4 = (int)uVar5;
            goto joined_r0x00095f98;
          }
        }
        else {
          uVar5 = func_0x00096190();
          iVar4 = (int)uVar5;
joined_r0x00095f98:
          if (iVar4 == 0) {
            *(long *)(unaff_x25 + 0x20) = lStack0000000000000000;
            *(ulong *)(unaff_x25 + 0x28) = (ulong)in_stack_00000018;
            func_0x000957d0();
            lVar11 = *unaff_x20;
            uVar5 = unaff_x22;
            if (*(long *)(lVar11 + 0x28) != 0) {
              uVar5 = *(undefined8 *)(lVar11 + 8);
              uVar1 = *(undefined4 *)(lVar11 + 0x18);
              lVar6 = _malloc(uVar1);
              *(long *)(lVar11 + 0x38) = lVar6;
              if (lVar6 == 0) {
                uVar5 = 0x100;
              }
              else {
                _memcpy(lVar6,uVar5,uVar1);
                uVar5 = func_0x00096190();
                if ((int)uVar5 == 0) goto code_r0x00095eb0;
                if (*(long *)(*unaff_x20 + 0x38) != 0) {
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
LAB_00095e8c:
  if ((*(long *)unaff_x20[1] == 0) || (_free(*(long *)unaff_x20[1]), unaff_x20[1] != 0)) {
    _free();
  }
  if ((int)uVar5 != 0) {
    _free();
    if (*(long *)(unaff_x28 + 0x10) == unaff_x28) {
      return uVar5;
    }
    func_0x00095fb8();
    return uVar5;
  }
code_r0x00095eb0:
  *(long **)(unaff_x21 + 0x30) = unaff_x20;
  if (unaff_x19 != (undefined8 *)0x0) {
    *unaff_x19 = *(undefined8 *)(unaff_x21 + 0x20);
  }
  return 0;
}

