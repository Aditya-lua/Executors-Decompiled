
void FUN_006bd0ec(ulong param_1)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  undefined4 uVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  undefined8 *unaff_x19;
  undefined4 unaff_w20;
  ulong unaff_x21;
  undefined8 *unaff_x22;
  byte *unaff_x23;
  ulong *puVar10;
  ulong *unaff_x25;
  ulong *unaff_x26;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  undefined *in_stack_00000038;
  
  do {
    if (param_1 != unaff_x19[0x41]) {
      uVar6 = 0;
      uVar7 = param_1 >> 4 ^ param_1 >> 9;
      do {
        uVar7 = uVar7 & unaff_x19[0x3f] - 1;
        uVar9 = *(ulong *)(unaff_x19[0x3e] + uVar7 * 0x10);
        if (uVar9 == param_1) {
          uVar4 = *(undefined4 *)(unaff_x19[0x3e] + uVar7 * 0x10 + 8);
          goto LAB_006bd13c;
        }
        if (uVar9 == unaff_x19[0x41]) break;
        uVar6 = uVar6 + 1;
        uVar7 = uVar6 + uVar7;
      } while (uVar6 <= unaff_x19[0x3f] - 1);
    }
    do {
      uVar4 = 0xf;
LAB_006bd13c:
      func_0x006b2b14(*unaff_x19,uVar4);
      unaff_x25 = unaff_x25 + 1;
      if (unaff_x25 == unaff_x26) {
        if (0 < *(int *)(unaff_x19 + 1)) {
          func_0x006b4050(*unaff_x19);
        }
        func_0x006b40ec(*unaff_x19);
        func_0x006bf744();
        uVar6 = func_0x006b2784(*unaff_x19);
        if (1000000000 < uVar6) {
          func_0x006bc388();
                    /* WARNING: Does not return */
          pcVar1 = (code *)SoftwareBreakpoint(1,0x6bd47c);
          (*pcVar1)();
        }
        uVar6 = unaff_x21 >> 4;
        if ((unaff_x19[0x3b] == 0) || (unaff_x19[0x3c] == unaff_x21)) goto LAB_006bd22c;
        uVar7 = 0;
        uVar9 = uVar6 ^ unaff_x21 >> 9;
        goto LAB_006bd1c8;
      }
    } while (unaff_x19[0x40] == 0);
    param_1 = *unaff_x25;
  } while( true );
  while( true ) {
    uVar7 = uVar7 + 1;
    uVar9 = uVar7 + uVar9;
    if (uVar8 == unaff_x19[0x3c] || unaff_x19[0x3a] - 1 < uVar7) break;
LAB_006bd1c8:
    uVar9 = uVar9 & unaff_x19[0x3a] - 1;
    uVar8 = *(ulong *)(unaff_x19[0x39] + uVar9 * 0x20);
    if (uVar8 == unaff_x21) {
      lVar5 = unaff_x19[0x39] + uVar9 * 0x20;
      uVar3 = *unaff_x19;
      in_stack_00000030 = *(long *)(lVar5 + 0x18);
      in_stack_00000028 = *(undefined8 *)(lVar5 + 0x10);
      uStack0000000000000020 = *(undefined8 *)(lVar5 + 8);
      *(undefined8 *)(lVar5 + 0x10) = 0;
      *(undefined8 *)(lVar5 + 0x18) = 0;
      *(undefined8 *)(lVar5 + 8) = 0;
      func_0x006b2994(uVar3,&uStack0000000000000020);
      if (in_stack_00000030 < 0) {
        __ZdlPv(uStack0000000000000020);
      }
      break;
    }
  }
LAB_006bd22c:
  if ((*(long *)(unaff_x21 + 0x98) == 0) && (*(char *)(unaff_x19 + 0x93) == '\0')) {
    *unaff_x23 = *unaff_x23 | 2;
  }
  iVar2 = func_0x007064d8();
  if (iVar2 != 0) {
    *unaff_x23 = *unaff_x23 | 4;
  }
  func_0x006af5c8(*unaff_x19,*(undefined1 *)(unaff_x19 + 0x91),
                  (uint)(*(int *)(unaff_x19 + 0x98) - *(int *)(unaff_x19 + 0x97)) >> 3 & 0xff);
  lVar5 = unaff_x19[0xd];
  if ((ulong)(lVar5 * 3) >> 2 <= (ulong)unaff_x19[0xe]) {
    if ((unaff_x19[0xe] != 0) && (unaff_x19[0xf] != unaff_x21)) {
      uVar7 = 0;
      uVar9 = uVar6 ^ unaff_x21 >> 9;
      do {
        uVar9 = uVar9 & lVar5 - 1U;
        uVar8 = *(ulong *)(unaff_x19[0xc] + uVar9 * 0x38);
        if (uVar8 == unaff_x21) goto LAB_006bd2e4;
        uVar7 = uVar7 + 1;
        uVar9 = uVar7 + uVar9;
      } while (uVar8 != unaff_x19[0xf] && uVar7 <= lVar5 - 1U);
    }
    func_0x006d0058();
    lVar5 = unaff_x19[0xd];
  }
LAB_006bd2e4:
  uVar7 = 0;
  uVar6 = uVar6 ^ unaff_x21 >> 9;
  do {
    uVar6 = uVar6 & lVar5 - 1U;
    puVar10 = (ulong *)(unaff_x19[0xc] + uVar6 * 0x38);
    if (*puVar10 == unaff_x19[0xf]) {
      *puVar10 = unaff_x21;
      unaff_x19[0xe] = unaff_x19[0xe] + 1;
      *(undefined4 *)(puVar10 + 1) = unaff_w20;
      goto joined_r0x006bd360;
    }
    if (*puVar10 == unaff_x21) goto LAB_006bd330;
    uVar7 = uVar7 + 1;
    uVar6 = uVar7 + uVar6;
  } while (uVar7 <= lVar5 - 1U);
  puVar10 = (ulong *)0x0;
LAB_006bd330:
  *(undefined4 *)(puVar10 + 1) = unaff_w20;
joined_r0x006bd360:
  if (puVar10 + 2 != unaff_x19 + 0x97) {
    func_0x006d0234();
  }
  if ((((1 < *(int *)(unaff_x19 + 1)) && (*(char *)(unaff_x21 + 0x70) == '\0')) &&
      (*(long *)(unaff_x21 + 0x50) == 0)) &&
     ((*(char *)((long)unaff_x19 + 0x499) == '\0' && (*(char *)((long)unaff_x19 + 0x49a) == '\0'))))
  {
    *(undefined1 *)((long)puVar10 + 0x34) = 1;
    *(undefined4 *)(puVar10 + 6) = *(undefined4 *)(unaff_x19 + 0x91);
    uVar6 = func_0x006d8ebc(*(undefined8 *)(unaff_x21 + 0x90),*(undefined8 *)(unaff_x21 + 0x58),
                            *(undefined8 *)(unaff_x21 + 0x60),unaff_x19 + 0x2f,unaff_x19 + 0x20);
    puVar10[5] = uVar6;
    iVar2 = func_0x006bf528();
    if (iVar2 != 0) {
      in_stack_00000038 = &UNK_00a1b050;
      (**(code **)*unaff_x22)();
      *(undefined1 *)((long)puVar10 + 0x35) = 1;
    }
  }
  unaff_x19[0x98] = unaff_x19[0x97];
  *(undefined4 *)(unaff_x19 + 0x91) = 0;
  unaff_x19[0x92] = 0;
  *(undefined1 *)(unaff_x19 + 0x93) = 0;
  *(undefined4 *)((long)unaff_x19 + 0x484) = in_stack_00000018._4_4_;
  return;
}

