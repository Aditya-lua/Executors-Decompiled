
void FUN_006bc694(void)

{
  undefined1 *puVar1;
  code *pcVar2;
  undefined1 uVar3;
  long lVar4;
  ulong uVar5;
  undefined8 uVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  long unaff_x19;
  undefined8 *puVar13;
  undefined8 *puVar14;
  undefined8 *unaff_x21;
  undefined8 unaff_x24;
  long unaff_x26;
  byte unaff_w27;
  long *plVar15;
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
  undefined1 in_stack_00000600;
  char in_stack_00000619;
  char in_stack_0000061a;
  undefined1 auStack_7ffffffe [2147483646];
  
  func_0x006be314();
  lVar7 = unaff_x19 + 0xb0;
  func_0x006e021c(lVar7);
  puVar1 = auStack_7ffffffe + 0x80000256;
  func_0x006e043c(lVar7,puVar1);
  if ((0 < *(int *)(unaff_x29 + -0xc0)) &&
     ((lVar4 = func_0x0070b968(), lVar4 != 0 || (lVar4 = func_0x0070b968(), lVar4 != 0)))) {
    in_stack_000000c8 = auStack_7ffffffe + 0x80000617;
    in_stack_000000d0 = auStack_7ffffffe + 0x80000618;
    uStack00000000000000c0 = &UNK_00a1a7b0;
    (**(code **)*unaff_x21)();
  }
  if (((1 < *(int *)(unaff_x29 + -0xc0)) && (in_stack_00000619 == '\0')) &&
     (in_stack_0000061a == '\0')) {
    *(undefined1 **)(unaff_x26 + 0x478) = auStack_7ffffffe + 0x800002f6;
    uVar5 = func_0x0070b968();
    if (uVar5 == 0) {
code_r0x006bc7cc:
      plVar15 = *(long **)(unaff_x26 + 0x5b8);
      if (plVar15 != (long *)0x0) {
        lVar4 = *plVar15;
        while (lVar4 != 0) {
          uVar5 = func_0x0070b968();
          if (uVar5 != 0) {
            if ((*(long *)(unaff_x26 + 0xc0) == 0) || (*(ulong *)(unaff_x26 + 200) == uVar5))
            goto code_r0x006bc850;
            uVar8 = 0;
            uVar9 = *(long *)(unaff_x26 + 0xb8) - 1;
            uVar10 = uVar5 >> 4 ^ uVar5 >> 9;
            while( true ) {
              uVar10 = uVar10 & uVar9;
              uVar12 = *(ulong *)(*(long *)(unaff_x26 + 0xb0) + uVar10 * 0x10);
              if (uVar12 == uVar5) break;
              uVar8 = uVar8 + 1;
              uVar10 = uVar8 + uVar10;
              if (uVar12 == *(ulong *)(unaff_x26 + 200) || uVar9 < uVar8) goto code_r0x006bc850;
            }
            if (*(int *)(*(long *)(unaff_x26 + 0xb0) + uVar10 * 0x10 + 8) == 0)
            goto code_r0x006bc850;
          }
          plVar15 = plVar15 + 1;
          lVar4 = *plVar15;
        }
      }
    }
    else {
      if ((*(long *)(unaff_x26 + 0xc0) != 0) && (*(ulong *)(unaff_x26 + 200) != uVar5)) {
        uVar8 = 0;
        uVar9 = *(long *)(unaff_x26 + 0xb8) - 1;
        uVar10 = uVar5 >> 4 ^ uVar5 >> 9;
        do {
          uVar10 = uVar10 & uVar9;
          uVar12 = *(ulong *)(*(long *)(unaff_x26 + 0xb0) + uVar10 * 0x10);
          if (uVar12 == uVar5) {
            if (*(int *)(*(long *)(unaff_x26 + 0xb0) + uVar10 * 0x10 + 8) != 0)
            goto code_r0x006bc7cc;
            break;
          }
          uVar8 = uVar8 + 1;
          uVar10 = uVar8 + uVar10;
        } while (uVar12 != *(ulong *)(unaff_x26 + 200) && uVar8 <= uVar9);
      }
code_r0x006bc850:
      in_stack_00000600 = 1;
    }
  }
  if (0 < *(int *)(unaff_x29 + -0xc0)) {
    func_0x006d221c(auStack_7ffffffe + 0x800002f6,lVar7,puVar1,unaff_x29 + -0xc0);
    func_0x006d621c(auStack_7ffffffe + 0x8000027e,puVar1,auStack_7ffffffe + 0x800002a6,
                    *(undefined8 *)(unaff_x26 + 0x478),in_stack_00000600,
                    *(undefined8 *)(unaff_x26 + 0x5c8));
    func_0x006db3bc(auStack_7ffffffe + 0x800002ce);
  }
  plVar15 = *(long **)(unaff_x26 + 0x5b0);
  if ((plVar15 != (long *)0x0) && (*plVar15 != 0)) {
    do {
      uVar5 = func_0x0070b968();
      if (uVar5 != 0) {
        uVar3 = func_0x006b2c94(in_stack_00000048,uVar5);
        lVar7 = *(long *)(unaff_x26 + 0x1a8);
        if ((ulong)(lVar7 * 3) >> 2 <= *(ulong *)(unaff_x26 + 0x1b0)) {
          if ((*(ulong *)(unaff_x26 + 0x1b0) != 0) && (*(ulong *)(unaff_x26 + 0x1b8) != uVar5)) {
            uVar8 = 0;
            uVar10 = uVar5 >> 4 ^ uVar5 >> 9;
            do {
              uVar10 = uVar10 & lVar7 - 1U;
              uVar9 = *(ulong *)(*(long *)(unaff_x26 + 0x1a0) + uVar10 * 0x10);
              if (uVar9 == uVar5) goto code_r0x006bc980;
              uVar8 = uVar8 + 1;
              uVar10 = uVar8 + uVar10;
            } while (uVar9 != *(ulong *)(unaff_x26 + 0x1b8) && uVar8 <= lVar7 - 1U);
          }
          func_0x006d0b38(auStack_7ffffffe + 0x8000031e);
          lVar7 = *(long *)(unaff_x26 + 0x1a8);
        }
code_r0x006bc980:
        lVar4 = *(long *)(unaff_x26 + 0x1a0);
        uVar8 = (uVar5 >> 4 ^ uVar5 >> 9) & lVar7 - 1U;
        uVar10 = *(ulong *)(lVar4 + uVar8 * 0x10);
        if (uVar10 != *(ulong *)(unaff_x26 + 0x1b8)) {
          lVar11 = 1;
          do {
            if (uVar10 == uVar5) goto code_r0x006bc8e8;
            uVar8 = uVar8 + lVar11 & lVar7 - 1U;
            uVar10 = *(ulong *)(lVar4 + uVar8 * 0x10);
            lVar11 = lVar11 + 1;
          } while (uVar10 != *(ulong *)(unaff_x26 + 0x1b8));
        }
        *(ulong *)(lVar4 + uVar8 * 0x10) = uVar5;
        *(long *)(unaff_x26 + 0x1b0) = *(long *)(unaff_x26 + 0x1b0) + 1;
code_r0x006bc8e8:
        *(undefined1 *)(lVar4 + uVar8 * 0x10 + 8) = uVar3;
      }
      plVar15 = plVar15 + 1;
    } while (*plVar15 != 0);
    unaff_x24 = in_stack_00000048;
    if (0x100 < (ulong)((long)plVar15 - *(long *)(unaff_x26 + 0x5b0))) {
      func_0x006bc388((long)unaff_x21 + 0xc,
                      "Exceeded userdata type limit in the compilation options");
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x6bcb54);
      (*pcVar2)();
    }
  }
  if ((0 < *(int *)(unaff_x29 + -0xb8)) || (1 < *(int *)(unaff_x29 + -0xc0))) {
    func_0x006dcdf0(auStack_7ffffffe + 0x80000346,auStack_7ffffffe + 0x8000036e,
                    auStack_7ffffffe + 0x80000396);
  }
  puVar14 = *(undefined8 **)(unaff_x26 + 0x568);
  for (puVar13 = *(undefined8 **)(unaff_x26 + 0x560); puVar13 != puVar14; puVar13 = puVar13 + 1) {
    uStack00000000000000c0 = (undefined *)((ulong)uStack00000000000000c0 & 0xffffffffffffff00);
    func_0x006bcbc0(&uStack0000000000000180,*puVar13,&uStack00000000000000c0);
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
  uVar6 = func_0x006bcbc0(&uStack0000000000000180,&uStack00000000000000c0,unaff_x29 + -0xc1);
  func_0x006b0e28(unaff_x24,uVar6);
  func_0x006b33ec(unaff_x24);
  func_0x006d03d8(&uStack0000000000000180);
  if (*(long *)(unaff_x26 + 0x560) != 0) {
    *(long *)(unaff_x26 + 0x568) = *(long *)(unaff_x26 + 0x560);
    __ZdlPv();
  }
  return;
}

