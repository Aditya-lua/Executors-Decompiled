
/* WARNING: Restarted to delay deadcode elimination for space: stack */

undefined8
FUN_00035168(undefined1 param_1 [16],long param_2,undefined8 param_3,long param_4,long *param_5,
            uint param_6,undefined1 param_7)

{
  code *pcVar1;
  bool bVar2;
  bool bVar3;
  bool bVar4;
  undefined8 uVar5;
  long *plVar6;
  long lVar7;
  ulong uVar8;
  long lVar9;
  ulong uVar10;
  undefined1 *puVar11;
  long lVar12;
  long lVar13;
  long *plVar14;
  undefined8 *puVar15;
  uint uVar16;
  long unaff_x29;
  long in_stack_00000040;
  undefined8 uStack0000000000000048;
  long in_stack_00000050;
  long in_stack_00000058;
  long in_stack_00000060;
  long in_stack_00000068;
  long in_stack_00000070;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  undefined5 uStack0000000000000098;
  undefined3 uStack000000000000009d;
  undefined5 in_stack_000000a0;
  undefined8 uStack00000000000000a8;
  long in_stack_000000b0;
  undefined1 in_stack_000000b8;
  undefined8 uStack00000000000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 uStack00000000000000e0;
  long in_stack_000000e8;
  undefined8 uStack00000000000000f8;
  long in_stack_00000100;
  undefined5 uStack0000000000000110;
  undefined3 uStack0000000000000115;
  undefined5 in_stack_00000118;
  
  lVar9 = param_1._8_8_;
  lVar12 = param_1._0_8_;
  lVar13 = *(long *)(param_2 + 0x28);
  if (lVar13 != 0) {
    in_stack_000000b8 = 0;
    uStack0000000000000048._0_4_ = 0;
    uStack0000000000000098 = param_1._8_5_;
    uStack000000000000009d = 0;
    in_stack_000000a0 = 0;
    in_stack_00000050 = lVar12;
    in_stack_00000058 = lVar9;
    in_stack_00000060 = lVar12;
    in_stack_00000068 = lVar9;
    in_stack_00000070 = lVar12;
    in_stack_00000078 = lVar9;
    in_stack_00000080 = lVar12;
    in_stack_00000088 = lVar9;
    in_stack_00000090 = lVar12;
    uStack00000000000000a8 = param_4;
    in_stack_000000b0 = param_4;
    uVar5 = func_0x0002d570(unaff_x29 + -0x78,&uStack0000000000000048);
    *(undefined8 *)(unaff_x29 + -0x70) = uVar5;
    if (in_stack_00000080 != 0) {
      in_stack_00000088 = in_stack_00000080;
      __ZdlPv();
    }
    if (in_stack_00000068 != 0) {
      in_stack_00000070 = in_stack_00000068;
      __ZdlPv();
    }
    lVar12 = *(long *)(unaff_x29 + -0x70);
    *(undefined4 *)(lVar12 + -0x60) = 0;
    *(long *)(lVar12 + -0x58) = in_stack_00000040;
    *(long *)(lVar12 + -0x50) = in_stack_00000040;
    *(long *)(lVar12 + -0x48) = param_4;
    lVar7 = *(long *)(lVar12 + -0x40);
    uVar8 = (ulong)*(uint *)(param_2 + 0x1c);
    lVar9 = *(long *)(lVar12 + -0x38) - lVar7 >> 3;
    bVar4 = uVar8 < (ulong)(lVar9 * -0x5555555555555555);
    lVar9 = uVar8 + lVar9 * 0x5555555555555555;
    if (bVar4 || lVar9 == 0) {
      if (bVar4) {
        *(ulong *)(lVar12 + -0x38) = lVar7 + uVar8 * 0x18;
      }
    }
    else {
      func_0x0002d754((long *)(lVar12 + -0x40),lVar9,&uStack00000000000000a8);
      lVar12 = *(long *)(unaff_x29 + -0x70);
    }
    lVar9 = *(long *)(lVar12 + -0x28);
    uVar8 = (ulong)*(uint *)(param_2 + 0x20);
    uVar10 = *(long *)(lVar12 + -0x20) - lVar9 >> 4;
    if (uVar8 < uVar10 || uVar8 - uVar10 == 0) {
      if (uVar8 < uVar10) {
        *(ulong *)(lVar12 + -0x20) = lVar9 + uVar8 * 0x10;
      }
    }
    else {
      func_0x0002d8f4((long *)(lVar12 + -0x28),uVar8 - uVar10);
      lVar12 = *(long *)(unaff_x29 + -0x70);
    }
    lVar9 = 0;
    bVar4 = false;
    uVar16 = 0;
    lVar7 = param_4 - in_stack_00000040;
    *(long *)(lVar12 + -0x10) = lVar13;
    *(uint *)(lVar12 + -8) = param_6;
    *(undefined1 *)(lVar12 + -4) = param_7;
    do {
      uVar16 = uVar16 + 1;
      bVar2 = true;
      bVar3 = false;
      if ((uVar16 & 0xfff) == 0) {
        bVar3 = SBORROW4(uVar16 >> 0xc,(int)lVar7);
        bVar2 = (int)((uVar16 >> 0xc) - (int)lVar7) < 0;
      }
      if (bVar2 == bVar3) {
        func_0x0002d458();
code_r0x000356a4:
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x356a8);
        (*pcVar1)();
      }
      plVar14 = (long *)(lVar12 + -0x10);
      plVar6 = (long *)*plVar14;
      puVar15 = (undefined8 *)(lVar12 + -0x60);
      if (plVar6 != (long *)0x0) {
        (**(code **)(*plVar6 + 0x10))(plVar6,puVar15);
      }
      switch(*(undefined4 *)puVar15) {
      case 0xfffffc18:
        lVar13 = *(long *)(lVar12 + -0x50);
        if ((((param_6 >> 5 & 1) != 0) && (lVar13 == in_stack_00000040)) ||
           (((param_6 >> 0xc & 1) != 0 && (lVar13 != param_4)))) goto code_r0x00035354;
        lVar13 = lVar13 - *(long *)(lVar12 + -0x58);
        if (!(bool)(bVar4 & lVar13 <= lVar9)) {
          in_stack_000000c8 = *(undefined8 *)(lVar12 + -0x58);
          uStack00000000000000c0 = *puVar15;
          in_stack_000000d8 = *(undefined8 *)(lVar12 + -0x48);
          in_stack_000000d0 = *(undefined8 *)(lVar12 + -0x50);
          if (&uStack00000000000000c0 != puVar15) {
            func_0x0003655c(&uStack00000000000000e0,*(long *)(lVar12 + -0x40),
                            *(long *)(lVar12 + -0x38),
                            (*(long *)(lVar12 + -0x38) - *(long *)(lVar12 + -0x40) >> 3) *
                            -0x5555555555555555);
            func_0x00036758(&uStack00000000000000f8,*(long *)(lVar12 + -0x28),
                            *(long *)(lVar12 + -0x20),
                            *(long *)(lVar12 + -0x20) - *(long *)(lVar12 + -0x28) >> 4);
          }
          in_stack_00000118 = (undefined5)((ulong)*(undefined8 *)(lVar12 + -0xb) >> 0x18);
          uStack0000000000000110 = (undefined5)*plVar14;
          uStack0000000000000115 = (undefined3)((ulong)*plVar14 >> 0x28);
          lVar9 = lVar13;
        }
        lVar13 = *(long *)(unaff_x29 + -0x70);
        if (lVar9 == lVar7) {
          lVar12 = *(long *)(unaff_x29 + -0x78);
          for (; lVar13 != lVar12; lVar13 = lVar13 + -0x60) {
            if (*(long *)(lVar13 + -0x28) != 0) {
              *(long *)(lVar13 + -0x20) = *(long *)(lVar13 + -0x28);
              __ZdlPv();
            }
            if (*(long *)(lVar13 + -0x40) != 0) {
              *(long *)(lVar13 + -0x38) = *(long *)(lVar13 + -0x40);
              __ZdlPv();
            }
          }
          *(long *)(unaff_x29 + -0x70) = lVar12;
          bVar4 = true;
          lVar9 = lVar7;
        }
        else {
          if (*(long *)(lVar13 + -0x28) != 0) {
            *(long *)(lVar13 + -0x20) = *(long *)(lVar13 + -0x28);
            __ZdlPv();
          }
          if (*(long *)(lVar13 + -0x40) != 0) {
            *(long *)(lVar13 + -0x38) = *(long *)(lVar13 + -0x40);
            __ZdlPv();
          }
          *(long *)(unaff_x29 + -0x70) = lVar13 + -0x60;
          bVar4 = true;
        }
        break;
      default:
        func_0x0002d4a4();
        goto code_r0x000356a4;
      case 0xfffffc1d:
      case 0xfffffc1e:
      case 0xfffffc21:
        break;
      case 0xfffffc1f:
code_r0x00035354:
        lVar13 = *(long *)(unaff_x29 + -0x70);
        if (*(long *)(lVar13 + -0x28) != 0) {
          *(long *)(lVar13 + -0x20) = *(long *)(lVar13 + -0x28);
          __ZdlPv();
        }
        if (*(long *)(lVar13 + -0x40) != 0) {
          *(long *)(lVar13 + -0x38) = *(long *)(lVar13 + -0x40);
          __ZdlPv();
        }
        *(long *)(unaff_x29 + -0x70) = lVar13 + -0x60;
        break;
      case 0xfffffc20:
        func_0x0002da1c(&uStack0000000000000048,puVar15);
        (**(code **)(*(long *)*plVar14 + 0x18))((long *)*plVar14,1,puVar15);
        (**(code **)(*(long *)CONCAT35(uStack000000000000009d,uStack0000000000000098) + 0x18))
                  ((long *)CONCAT35(uStack000000000000009d,uStack0000000000000098),0,
                   &uStack0000000000000048);
        puVar15 = *(undefined8 **)(unaff_x29 + -0x70);
        if (puVar15 < *(undefined8 **)(unaff_x29 + -0x68)) {
          puVar15[1] = in_stack_00000050;
          *puVar15 = CONCAT44(uStack0000000000000048._4_4_,(undefined4)uStack0000000000000048);
          puVar15[3] = in_stack_00000060;
          puVar15[2] = in_stack_00000058;
          puVar15[4] = 0;
          puVar15[5] = 0;
          puVar15[6] = 0;
          puVar15[7] = 0;
          puVar15[5] = in_stack_00000070;
          puVar15[4] = in_stack_00000068;
          puVar15[6] = in_stack_00000078;
          in_stack_00000068 = 0;
          in_stack_00000070 = 0;
          in_stack_00000078 = 0;
          puVar15[8] = 0;
          puVar15[9] = 0;
          puVar15[8] = in_stack_00000088;
          puVar15[7] = in_stack_00000080;
          puVar15[9] = in_stack_00000090;
          in_stack_00000080 = 0;
          in_stack_00000088 = 0;
          in_stack_00000090 = 0;
          *(ulong *)((long)puVar15 + 0x55) = CONCAT53(in_stack_000000a0,uStack000000000000009d);
          puVar15[10] = CONCAT35(uStack000000000000009d,uStack0000000000000098);
          *(undefined8 **)(unaff_x29 + -0x70) = puVar15 + 0xc;
        }
        else {
          uVar5 = func_0x0002d570(unaff_x29 + -0x78,&uStack0000000000000048);
          *(undefined8 *)(unaff_x29 + -0x70) = uVar5;
          if (in_stack_00000080 != 0) {
            in_stack_00000088 = in_stack_00000080;
            __ZdlPv();
          }
        }
        if (in_stack_00000068 != 0) {
          in_stack_00000070 = in_stack_00000068;
          __ZdlPv();
        }
      }
      lVar12 = *(long *)(unaff_x29 + -0x70);
    } while (*(long *)(unaff_x29 + -0x78) != lVar12);
    if (bVar4) {
      param_5 = (long *)*param_5;
      *param_5 = in_stack_00000040;
      param_5[1] = in_stack_00000040 + lVar9;
      *(undefined1 *)(param_5 + 2) = 1;
      if (in_stack_000000e8 - uStack00000000000000e0 != 0) {
        puVar11 = (undefined1 *)(uStack00000000000000e0 + 0x10);
        uVar8 = 1;
        do {
          plVar6 = param_5 + uVar8 * 3;
          lVar13 = *(long *)(puVar11 + -0x10);
          plVar6[1] = *(long *)(puVar11 + -8);
          *plVar6 = lVar13;
          *(undefined1 *)(plVar6 + 2) = *puVar11;
          bVar4 = uVar8 < (ulong)((in_stack_000000e8 - uStack00000000000000e0 >> 3) *
                                 -0x5555555555555555);
          puVar11 = puVar11 + 0x18;
          uVar8 = (ulong)((int)uVar8 + 1);
        } while (bVar4);
      }
      uVar5 = 1;
      goto joined_r0x00035600;
    }
  }
  uVar5 = 0;
joined_r0x00035600:
  if (uStack00000000000000f8 != 0) {
    in_stack_00000100 = uStack00000000000000f8;
    __ZdlPv();
  }
  if (uStack00000000000000e0 != 0) {
    in_stack_000000e8 = uStack00000000000000e0;
    __ZdlPv();
  }
  lVar13 = *(long *)(unaff_x29 + -0x78);
  if (lVar13 != 0) {
    lVar9 = *(long *)(unaff_x29 + -0x70);
    lVar12 = lVar13;
    if (lVar9 != lVar13) {
      do {
        if (*(long *)(lVar9 + -0x28) != 0) {
          *(long *)(lVar9 + -0x20) = *(long *)(lVar9 + -0x28);
          __ZdlPv();
        }
        if (*(long *)(lVar9 + -0x40) != 0) {
          *(long *)(lVar9 + -0x38) = *(long *)(lVar9 + -0x40);
          __ZdlPv();
        }
        lVar9 = lVar9 + -0x60;
      } while (lVar9 != lVar13);
      lVar12 = *(long *)(unaff_x29 + -0x78);
    }
    *(long *)(unaff_x29 + -0x70) = lVar13;
    __ZdlPv(lVar12);
  }
  return uVar5;
}

