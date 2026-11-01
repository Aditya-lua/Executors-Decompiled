
void FUN_006bc6ec(void)

{
  code *pcVar1;
  undefined1 uVar2;
  long lVar3;
  ulong uVar4;
  undefined8 uVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  long lVar10;
  ulong uVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  undefined8 *unaff_x21;
  undefined8 unaff_x24;
  long unaff_x26;
  byte unaff_w27;
  long *plVar14;
  long unaff_x29;
  undefined8 in_stack_00000048;
  undefined1 uStack0000000000000054;
  undefined1 uStack0000000000000064;
  undefined8 uStack0000000000000080;
  undefined8 in_stack_00000088;
  undefined8 uStack0000000000000090;
  undefined8 in_stack_00000098;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  undefined8 uStack00000000000000b0;
  undefined8 in_stack_000000b8;
  undefined8 uStack00000000000000c0;
  undefined1 *in_stack_000000c8;
  undefined1 *in_stack_000000d0;
  undefined1 uStack0000000000000180;
  char in_stack_00000619;
  char in_stack_0000061a;
  undefined1 auStack_7ffffffe [2147483646];
  
  lVar3 = func_0x0070b968();
  if (lVar3 != 0) {
    in_stack_000000c8 = auStack_7ffffffe + 0x80000617;
    in_stack_000000d0 = auStack_7ffffffe + 0x80000618;
    uStack00000000000000c0 = &UNK_00a1a7b0;
    (**(code **)*unaff_x21)();
  }
  if (((1 < *(int *)(unaff_x29 + -0xc0)) && (in_stack_00000619 == '\0')) &&
     (in_stack_0000061a == '\0')) {
    *(undefined1 **)(unaff_x26 + 0x478) = auStack_7ffffffe + 0x800002f6;
    uVar4 = func_0x0070b968();
    if (uVar4 == 0) {
LAB_006bc7cc:
      plVar14 = *(long **)(unaff_x26 + 0x5b8);
      if (plVar14 != (long *)0x0) {
        lVar3 = *plVar14;
        while (lVar3 != 0) {
          uVar4 = func_0x0070b968();
          if (uVar4 != 0) {
            if ((*(long *)(unaff_x26 + 0xc0) == 0) || (*(ulong *)(unaff_x26 + 200) == uVar4)) break;
            uVar7 = 0;
            uVar8 = *(long *)(unaff_x26 + 0xb8) - 1;
            uVar9 = uVar4 >> 4 ^ uVar4 >> 9;
            while( true ) {
              uVar9 = uVar9 & uVar8;
              uVar11 = *(ulong *)(*(long *)(unaff_x26 + 0xb0) + uVar9 * 0x10);
              if (uVar11 == uVar4) break;
              uVar7 = uVar7 + 1;
              uVar9 = uVar7 + uVar9;
              if (uVar11 == *(ulong *)(unaff_x26 + 200) || uVar8 < uVar7) goto LAB_006bc858;
            }
            if (*(int *)(*(long *)(unaff_x26 + 0xb0) + uVar9 * 0x10 + 8) == 0) break;
          }
          plVar14 = plVar14 + 1;
          lVar3 = *plVar14;
        }
      }
    }
    else if ((*(long *)(unaff_x26 + 0xc0) != 0) && (*(ulong *)(unaff_x26 + 200) != uVar4)) {
      uVar7 = 0;
      uVar8 = *(long *)(unaff_x26 + 0xb8) - 1;
      uVar9 = uVar4 >> 4 ^ uVar4 >> 9;
      do {
        uVar9 = uVar9 & uVar8;
        uVar11 = *(ulong *)(*(long *)(unaff_x26 + 0xb0) + uVar9 * 0x10);
        if (uVar11 == uVar4) {
          if (*(int *)(*(long *)(unaff_x26 + 0xb0) + uVar9 * 0x10 + 8) != 0) goto LAB_006bc7cc;
          break;
        }
        uVar7 = uVar7 + 1;
        uVar9 = uVar7 + uVar9;
      } while (uVar11 != *(ulong *)(unaff_x26 + 200) && uVar7 <= uVar8);
    }
  }
LAB_006bc858:
  if (0 < *(int *)(unaff_x29 + -0xc0)) {
    func_0x006d221c(auStack_7ffffffe + 0x800002f6);
    func_0x006d621c(auStack_7ffffffe + 0x8000027e);
    func_0x006db3bc(auStack_7ffffffe + 0x800002ce);
  }
  plVar14 = *(long **)(unaff_x26 + 0x5b0);
  if ((plVar14 != (long *)0x0) && (*plVar14 != 0)) {
    do {
      uVar4 = func_0x0070b968();
      if (uVar4 != 0) {
        uVar2 = func_0x006b2c94(in_stack_00000048,uVar4);
        lVar3 = *(long *)(unaff_x26 + 0x1a8);
        if ((ulong)(lVar3 * 3) >> 2 <= *(ulong *)(unaff_x26 + 0x1b0)) {
          if ((*(ulong *)(unaff_x26 + 0x1b0) != 0) && (*(ulong *)(unaff_x26 + 0x1b8) != uVar4)) {
            uVar7 = 0;
            uVar9 = uVar4 >> 4 ^ uVar4 >> 9;
            do {
              uVar9 = uVar9 & lVar3 - 1U;
              uVar8 = *(ulong *)(*(long *)(unaff_x26 + 0x1a0) + uVar9 * 0x10);
              if (uVar8 == uVar4) goto code_r0x006bc980;
              uVar7 = uVar7 + 1;
              uVar9 = uVar7 + uVar9;
            } while (uVar8 != *(ulong *)(unaff_x26 + 0x1b8) && uVar7 <= lVar3 - 1U);
          }
          func_0x006d0b38(auStack_7ffffffe + 0x8000031e);
          lVar3 = *(long *)(unaff_x26 + 0x1a8);
        }
code_r0x006bc980:
        lVar6 = *(long *)(unaff_x26 + 0x1a0);
        uVar7 = (uVar4 >> 4 ^ uVar4 >> 9) & lVar3 - 1U;
        uVar9 = *(ulong *)(lVar6 + uVar7 * 0x10);
        if (uVar9 != *(ulong *)(unaff_x26 + 0x1b8)) {
          lVar10 = 1;
          do {
            if (uVar9 == uVar4) goto code_r0x006bc8e8;
            uVar7 = uVar7 + lVar10 & lVar3 - 1U;
            uVar9 = *(ulong *)(lVar6 + uVar7 * 0x10);
            lVar10 = lVar10 + 1;
          } while (uVar9 != *(ulong *)(unaff_x26 + 0x1b8));
        }
        *(ulong *)(lVar6 + uVar7 * 0x10) = uVar4;
        *(long *)(unaff_x26 + 0x1b0) = *(long *)(unaff_x26 + 0x1b0) + 1;
code_r0x006bc8e8:
        *(undefined1 *)(lVar6 + uVar7 * 0x10 + 8) = uVar2;
      }
      plVar14 = plVar14 + 1;
    } while (*plVar14 != 0);
    unaff_x24 = in_stack_00000048;
    if (0x100 < (ulong)((long)plVar14 - *(long *)(unaff_x26 + 0x5b0))) {
      func_0x006bc388((long)unaff_x21 + 0xc,
                      "Exceeded userdata type limit in the compilation options");
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x6bcb54);
      (*pcVar1)();
    }
  }
  if ((0 < *(int *)(unaff_x29 + -0xb8)) || (1 < *(int *)(unaff_x29 + -0xc0))) {
    func_0x006dcdf0(auStack_7ffffffe + 0x80000346,auStack_7ffffffe + 0x8000036e,
                    auStack_7ffffffe + 0x80000396);
  }
  puVar13 = *(undefined8 **)(unaff_x26 + 0x568);
  for (puVar12 = *(undefined8 **)(unaff_x26 + 0x560); puVar12 != puVar13; puVar12 = puVar12 + 1) {
    uStack00000000000000c0 = (undefined *)((ulong)uStack00000000000000c0 & 0xffffffffffffff00);
    func_0x006bcbc0(&uStack0000000000000180,*puVar12,&uStack00000000000000c0);
    if ((((byte)uStack00000000000000c0 >> 2 & 1) != 0) && ((unaff_w27 & 1) == 0)) {
      unaff_w27 = unaff_w27 | 4;
      *(byte *)(unaff_x29 + -0xc1) = unaff_w27;
    }
  }
  uStack00000000000000b0 = 0;
  in_stack_000000b8 = 0;
  uStack00000000000000a0 = 0;
  in_stack_000000a8 = 0;
  uStack0000000000000090 = 0;
  in_stack_00000098 = 0;
  uStack0000000000000080 = 0;
  in_stack_00000088 = 0;
  uStack0000000000000054 = 0;
  uStack0000000000000064 = 0;
  func_0x00706378(&uStack00000000000000c0,(long)unaff_x21 + 0xc,&uStack00000000000000b0,
                  &uStack00000000000000a0,&uStack0000000000000090,0,&uStack0000000000000080,1);
  uVar5 = func_0x006bcbc0(&uStack0000000000000180,&uStack00000000000000c0,unaff_x29 + -0xc1);
  func_0x006b0e28(unaff_x24,uVar5);
  func_0x006b33ec(unaff_x24);
  func_0x006d03d8(&uStack0000000000000180);
  if (*(long *)(unaff_x26 + 0x560) != 0) {
    *(long *)(unaff_x26 + 0x568) = *(long *)(unaff_x26 + 0x560);
    __ZdlPv();
  }
  return;
}

