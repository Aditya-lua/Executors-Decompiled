
/* WARNING: Removing unreachable block (ram,0x00057c70) */

void FUN_00057a60(undefined8 *param_1)

{
  long *plVar1;
  byte bVar2;
  undefined *puVar3;
  code *pcVar4;
  uint uVar5;
  long lVar6;
  undefined8 *puVar7;
  char *pcVar8;
  ulong uVar9;
  ulong uVar10;
  ulong unaff_x22;
  uint unaff_w23;
  ulong unaff_x25;
  ulong uVar11;
  long unaff_x29;
  undefined1 uStack0000000000000007;
  long lStack0000000000000008;
  ulong in_stack_00000010;
  undefined7 uStack0000000000000018;
  byte bStack000000000000001f;
  undefined8 uStack0000000000000020;
  ulong in_stack_00000028;
  undefined7 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  ulong in_stack_00000040;
  undefined8 in_stack_00000048;
  
  if (-1 < (int)unaff_w23) {
    param_1 = &uStack0000000000000038;
  }
  lVar6 = _memchr(param_1,0x3a);
  uVar11 = lVar6 - (long)param_1;
  if (lVar6 == 0 || uVar11 == 0xffffffffffffffff) goto LAB_00057d50;
  if (uVar11 <= unaff_x22) {
    unaff_x22 = uVar11;
  }
  if (unaff_x25 < unaff_x22) {
    func_0x0001748c(&uStack0000000000000020);
    goto LAB_00057dac;
  }
  if (unaff_x22 < 0x17) {
    _uStack0000000000000030 = CONCAT17((char)unaff_x22,uStack0000000000000030);
    puVar7 = &uStack0000000000000020;
    if (unaff_x22 != 0) goto LAB_00057b28;
    uStack0000000000000020 = (undefined8 *)((ulong)uStack0000000000000020 & 0xffffffffffffff00);
    if ((char)in_stack_00000048._7_1_ < '\0') goto LAB_00057b44;
LAB_00057abc:
    uVar9 = (ulong)in_stack_00000048._7_1_;
    if (uVar9 <= uVar11) {
LAB_00057da4:
      func_0x00049dd0(&lStack0000000000000008);
      goto LAB_00057dac;
    }
    puVar7 = &uStack0000000000000038;
    uVar10 = uVar9 - (uVar11 + 1);
  }
  else {
    uVar10 = (unaff_x22 & 0xfffffffffffffff8) + 8;
    if ((unaff_x22 | 7) != 0x17) {
      uVar10 = unaff_x22 | 7;
    }
    puVar7 = (undefined8 *)__Znwm(uVar10 + 1);
    _uStack0000000000000030 = uVar10 + 1 | 0x8000000000000000;
    uStack0000000000000020 = puVar7;
    in_stack_00000028 = unaff_x22;
LAB_00057b28:
    _memmove(puVar7,param_1,unaff_x22);
    *(undefined1 *)((long)puVar7 + unaff_x22) = 0;
    if (-1 < (char)in_stack_00000048._7_1_) goto LAB_00057abc;
LAB_00057b44:
    if (in_stack_00000040 <= uVar11) goto LAB_00057da4;
    uVar10 = in_stack_00000040 - (uVar11 + 1);
    puVar7 = uStack0000000000000038;
    uVar9 = in_stack_00000040;
  }
  if (unaff_x25 < uVar10) {
    func_0x0001748c(&lStack0000000000000008);
LAB_00057dac:
                    /* WARNING: Does not return */
    pcVar4 = (code *)SoftwareBreakpoint(1,0x57db0);
    (*pcVar4)();
  }
  if (uVar10 < 0x17) {
    _uStack0000000000000018 = CONCAT17((char)uVar10,uStack0000000000000018);
    pcVar8 = (char *)&lStack0000000000000008;
    if (uVar9 == uVar11 + 1) goto LAB_00057bb0;
  }
  else {
    uVar9 = (uVar10 & 0xfffffffffffffff8) + 8;
    if ((uVar10 | 7) != 0x17) {
      uVar9 = uVar10 | 7;
    }
    pcVar8 = (char *)__Znwm(uVar9 + 1);
    _uStack0000000000000018 = uVar9 + 1 | 0x8000000000000000;
    lStack0000000000000008 = (long)pcVar8;
    in_stack_00000010 = uVar10;
  }
  _memmove(pcVar8,(long)puVar7 + uVar11 + 1,uVar10);
LAB_00057bb0:
  puVar3 = PTR___DefaultRuneLocale_009b0028;
  pcVar8[uVar10] = '\0';
  do {
    if ((long)_uStack0000000000000018 < 0) {
      if (in_stack_00000010 == 0) break;
      uVar11 = (ulong)*(char *)lStack0000000000000008;
      if (*(char *)lStack0000000000000008 < '\0') goto LAB_00057bf8;
LAB_00057bd4:
      uVar5 = *(uint *)(puVar3 + (uVar11 & 0xffffffff) * 4 + 0x3c) & 0x4000;
    }
    else {
      if (bStack000000000000001f == '\0') break;
      uVar11 = (ulong)(char)lStack0000000000000008;
      if (-1 < (char)lStack0000000000000008) goto LAB_00057bd4;
LAB_00057bf8:
      uVar5 = ___maskrune(uVar11,0x4000);
    }
    if (uVar5 == 0) break;
    func_0x0005287c(&lStack0000000000000008,0,1);
  } while( true );
LAB_00057c28:
  if ((long)_uStack0000000000000018 < 0) goto LAB_00057c58;
  while (bStack000000000000001f != 0) {
    bVar2 = (&uStack0000000000000007)[bStack000000000000001f];
    while( true ) {
      if ((*(uint *)(puVar3 + (ulong)bVar2 * 4 + 0x3c) & 0x4000) == 0) goto LAB_00057ca8;
      uVar11 = _uStack0000000000000018 >> 0x38;
      if ((long)_uStack0000000000000018 < 0) {
        in_stack_00000010 = in_stack_00000010 - 1;
        *(char *)(lStack0000000000000008 + in_stack_00000010) = '\0';
        goto LAB_00057c28;
      }
      _uStack0000000000000018 =
           CONCAT17((char)(_uStack0000000000000018 >> 0x38) + -1,uStack0000000000000018) &
           0x7fffffffffffffff;
      (&uStack0000000000000007)[uVar11] = 0;
      if (-1 < (long)_uStack0000000000000018) break;
LAB_00057c58:
      if (in_stack_00000010 == 0) goto LAB_00057ca8;
      bVar2 = *(byte *)(lStack0000000000000008 + (in_stack_00000010 - 1));
    }
  }
LAB_00057ca8:
  *(undefined8 **)(unaff_x29 + -0x48) = &uStack0000000000000020;
  lVar6 = func_0x00055b34();
  plVar1 = (long *)(lVar6 + 0x38);
  if (plVar1 == &lStack0000000000000008) {
LAB_00057d34:
    if ((long)_uStack0000000000000018 < 0) {
      __ZdlPv(lStack0000000000000008);
    }
  }
  else {
    if (*(char *)(lVar6 + 0x4f) < '\0') {
      uVar11 = in_stack_00000010;
      pcVar8 = (char *)lStack0000000000000008;
      if (-1 < (long)_uStack0000000000000018) {
        uVar11 = _uStack0000000000000018 >> 0x38;
        pcVar8 = (char *)&lStack0000000000000008;
      }
      func_0x00017784(plVar1,pcVar8,uVar11);
      goto LAB_00057d34;
    }
    if ((long)_uStack0000000000000018 < 0) {
      func_0x000176c0(plVar1,lStack0000000000000008,in_stack_00000010);
      goto LAB_00057d34;
    }
    *(ulong *)(lVar6 + 0x40) = in_stack_00000010;
    *plVar1 = lStack0000000000000008;
    *(ulong *)(lVar6 + 0x48) = _uStack0000000000000018;
  }
  if ((long)_uStack0000000000000030 < 0) {
    __ZdlPv(uStack0000000000000020);
  }
  unaff_w23 = (uint)in_stack_00000048._7_1_;
LAB_00057d50:
  if ((unaff_w23 >> 7 & 1) != 0) {
    __ZdlPv(uStack0000000000000038);
  }
  return;
}

