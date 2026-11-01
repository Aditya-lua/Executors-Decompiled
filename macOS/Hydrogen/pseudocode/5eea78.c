
/* WARNING: Removing unreachable block (ram,0x005eea94) */
/* WARNING: Removing unreachable block (ram,0x005eeaf4) */

void FUN_005eea78(void)

{
  ulong uVar1;
  uint uVar2;
  ulong uVar3;
  ulong uVar4;
  byte bVar5;
  char cVar6;
  byte bVar7;
  uint uVar8;
  code *pcVar9;
  char cVar10;
  int in_w8;
  undefined8 *extraout_x8;
  undefined8 *puVar11;
  ulong unaff_x19;
  uint uVar12;
  byte *pbVar13;
  ulong uVar14;
  long unaff_x29;
  undefined1 auVar15 [12];
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  long in_stack_00000040;
  undefined8 in_stack_00000048;
  long in_stack_00000058;
  undefined8 in_stack_00000060;
  long in_stack_00000070;
  byte *pbStack_78;
  ulong uStack_70;
  ulong uStack_68;
  
  if (in_w8 < 0) {
    __ZdlPv(*(undefined8 *)(unaff_x29 + -0x40));
  }
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
  }
  if (in_stack_00000070 < 0) {
    __ZdlPv(in_stack_00000060);
  }
  if (in_stack_00000028 < 0) {
    __ZdlPv(in_stack_00000018);
  }
  if (in_stack_00000058 < 0) {
    __ZdlPv(in_stack_00000048);
  }
  if (in_stack_00000040 < 0) {
    __ZdlPv(in_stack_00000030);
  }
  if ((unaff_x19 & 1) != 0) {
    ___cxa_free_exception();
  }
  auVar15 = __Unwind_Resume();
  uVar14 = auVar15._0_8_;
  if (auVar15._0_4_ == 0) {
    *(undefined1 *)((long)extraout_x8 + 0x17) = 1;
    *(undefined2 *)extraout_x8 = 0x30;
  }
  else {
    uVar2 = auVar15._8_4_ & 0x7fffffff;
    *extraout_x8 = 0;
    extraout_x8[1] = 0;
    extraout_x8[2] = 0;
    cVar10 = 'W';
    if ((int)auVar15._8_4_ < 0) {
      cVar10 = '7';
    }
    do {
      uVar8 = 0;
      uVar12 = (uint)uVar14;
      if (uVar2 != 0) {
        uVar8 = uVar12 / uVar2;
      }
      uVar14 = (ulong)uVar8;
      uVar8 = uVar12 - uVar8 * uVar2;
      cVar6 = '0';
      if (9 < uVar8) {
        cVar6 = cVar10;
      }
      bVar5 = *(byte *)((long)extraout_x8 + 0x17);
      uVar3 = extraout_x8[1];
      if (-1 < (char)bVar5) {
        uVar3 = (ulong)bVar5;
      }
      uVar1 = uVar3 + 1;
      if (0x7ffffffffffffff7 < uVar1) {
        func_0x0001748c(&pbStack_78);
                    /* WARNING: Does not return */
        pcVar9 = (code *)SoftwareBreakpoint(1,0x5eedc4);
        (*pcVar9)();
      }
      bVar7 = cVar6 + (char)uVar8;
      if (uVar1 < 0x17) {
        uStack_70 = 0;
        uStack_68 = uVar1 << 0x38;
        pbStack_78 = (byte *)(ulong)bVar7;
        pbVar13 = (byte *)((ulong)&pbStack_78 | 1);
        if (uVar3 != 0) goto LAB_005eed58;
        *(byte *)((ulong)&pbStack_78 | 1) = 0;
        cVar6 = *(char *)((long)extraout_x8 + 0x17);
      }
      else {
        uVar4 = (uVar1 & 0xfffffffffffffff8) + 8;
        if ((uVar1 | 7) != 0x17) {
          uVar4 = uVar1 | 7;
        }
        pbStack_78 = (byte *)__Znwm(uVar4 + 1);
        uStack_68 = uVar4 + 1 | 0x8000000000000000;
        pbVar13 = pbStack_78 + 1;
        *pbStack_78 = bVar7;
        uStack_70 = uVar1;
LAB_005eed58:
        puVar11 = (undefined8 *)*extraout_x8;
        if (-1 < (char)bVar5) {
          puVar11 = extraout_x8;
        }
        _memmove(pbVar13,puVar11,uVar3);
        pbVar13[uVar3] = 0;
        cVar6 = *(char *)((long)extraout_x8 + 0x17);
      }
      if (cVar6 < '\0') {
        __ZdlPv(*extraout_x8);
      }
      extraout_x8[1] = uStack_70;
      *extraout_x8 = pbStack_78;
      extraout_x8[2] = uStack_68;
    } while (uVar2 <= uVar12);
  }
  return;
}

