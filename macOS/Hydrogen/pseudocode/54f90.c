
void FUN_00054f90(int param_1)

{
  ulong uVar1;
  long *plVar2;
  code *pcVar3;
  int iVar4;
  undefined8 uVar5;
  ulong uVar6;
  undefined8 *puVar7;
  long *plVar8;
  long lVar9;
  ulong unaff_x19;
  undefined8 in_stack_00000018;
  long lStack0000000000000020;
  ulong in_stack_00000028;
  undefined7 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  ulong in_stack_00000040;
  undefined7 uStack0000000000000048;
  undefined1 uStack0000000000000057;
  undefined8 uStack0000000000000058;
  
  if (param_1 == 6) {
    func_0x006e383c();
    while (iVar4 = func_0x006e52e0(), iVar4 != 0) {
      uVar5 = func_0x006e67c8();
      uVar6 = _strlen();
      if (unaff_x19 < uVar6) {
        func_0x0001748c(&uStack0000000000000038);
        goto code_r0x0005545c;
      }
      if (uVar6 < 0x17) {
        _uStack0000000000000048 = CONCAT17((char)uVar6,uStack0000000000000048);
        puVar7 = &uStack0000000000000038;
        if (uVar6 != 0) goto LAB_0005502c;
      }
      else {
        uVar1 = (uVar6 & 0xfffffffffffffff8) + 8;
        if ((uVar6 | 7) != 0x17) {
          uVar1 = uVar6 | 7;
        }
        puVar7 = (undefined8 *)__Znwm(uVar1 + 1);
        _uStack0000000000000048 = uVar1 + 1 | 0x8000000000000000;
        uStack0000000000000038 = puVar7;
        in_stack_00000040 = uVar6;
LAB_0005502c:
        _memmove(puVar7,uVar5,uVar6);
      }
      *(undefined1 *)((long)puVar7 + uVar6) = 0;
      uVar5 = func_0x006e67c8();
      uVar6 = _strlen();
      if (unaff_x19 < uVar6) {
        func_0x0001748c(&lStack0000000000000020);
        goto code_r0x0005545c;
      }
      if (uVar6 < 0x17) {
        _uStack0000000000000030 = CONCAT17((char)uVar6,uStack0000000000000030);
        plVar8 = &lStack0000000000000020;
        if (uVar6 != 0) goto LAB_000550ac;
      }
      else {
        uVar1 = (uVar6 & 0xfffffffffffffff8) + 8;
        if ((uVar6 | 7) != 0x17) {
          uVar1 = uVar6 | 7;
        }
        plVar8 = (long *)__Znwm(uVar1 + 1);
        _uStack0000000000000030 = uVar1 + 1 | 0x8000000000000000;
        lStack0000000000000020 = (long)plVar8;
        in_stack_00000028 = uVar6;
LAB_000550ac:
        _memmove(plVar8,uVar5,uVar6);
      }
      *(undefined1 *)((long)plVar8 + uVar6) = 0;
      uStack0000000000000058 = &uStack0000000000000038;
      lVar9 = func_0x00055b34();
      puVar7 = (undefined8 *)(lVar9 + 0x38);
      if (puVar7 != &lStack0000000000000020) {
        if (*(char *)(lVar9 + 0x4f) < '\0') {
          uVar6 = in_stack_00000028;
          plVar8 = (long *)lStack0000000000000020;
          if (-1 < (long)_uStack0000000000000030) {
            uVar6 = _uStack0000000000000030 >> 0x38;
            plVar8 = &lStack0000000000000020;
          }
          func_0x00017784(puVar7,plVar8,uVar6);
        }
        else if ((long)_uStack0000000000000030 < 0) {
          func_0x000176c0(puVar7,lStack0000000000000020,in_stack_00000028);
        }
        else {
          *(ulong *)(lVar9 + 0x40) = in_stack_00000028;
          *puVar7 = lStack0000000000000020;
          *(ulong *)(lVar9 + 0x48) = _uStack0000000000000030;
        }
      }
      func_0x006e1d54();
      if ((long)_uStack0000000000000030 < 0) {
        __ZdlPv(lStack0000000000000020);
      }
      if ((long)_uStack0000000000000048 < 0) {
        __ZdlPv(uStack0000000000000038);
      }
    }
  }
  func_0x006e1d54();
  func_0x006e3d18();
  iVar4 = func_0x006e21f8();
  if (iVar4 == 6) {
    func_0x006e383c();
    while (iVar4 = func_0x006e52e0(), iVar4 != 0) {
      uVar5 = func_0x006e67c8();
      uVar6 = _strlen();
      if (unaff_x19 < uVar6) {
        func_0x0001748c(&uStack0000000000000038);
code_r0x0005545c:
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x55460);
        (*pcVar3)();
      }
      if (uVar6 < 0x17) {
        _uStack0000000000000048 = CONCAT17((char)uVar6,uStack0000000000000048);
        puVar7 = &uStack0000000000000038;
        if (uVar6 != 0) goto code_r0x00055238;
      }
      else {
        uVar1 = (uVar6 & 0xfffffffffffffff8) + 8;
        if ((uVar6 | 7) != 0x17) {
          uVar1 = uVar6 | 7;
        }
        puVar7 = (undefined8 *)__Znwm(uVar1 + 1);
        _uStack0000000000000048 = uVar1 + 1 | 0x8000000000000000;
        uStack0000000000000038 = puVar7;
        in_stack_00000040 = uVar6;
code_r0x00055238:
        _memmove(puVar7,uVar5,uVar6);
      }
      *(undefined1 *)((long)puVar7 + uVar6) = 0;
      uVar5 = func_0x006e67c8();
      uVar6 = _strlen();
      if (unaff_x19 < uVar6) {
        func_0x0001748c(&lStack0000000000000020);
        goto code_r0x0005545c;
      }
      if (uVar6 < 0x17) {
        _uStack0000000000000030 = CONCAT17((char)uVar6,uStack0000000000000030);
        plVar8 = &lStack0000000000000020;
        if (uVar6 != 0) goto code_r0x000552b8;
      }
      else {
        uVar1 = (uVar6 & 0xfffffffffffffff8) + 8;
        if ((uVar6 | 7) != 0x17) {
          uVar1 = uVar6 | 7;
        }
        plVar8 = (long *)__Znwm(uVar1 + 1);
        _uStack0000000000000030 = uVar1 + 1 | 0x8000000000000000;
        lStack0000000000000020 = (long)plVar8;
        in_stack_00000028 = uVar6;
code_r0x000552b8:
        _memmove(plVar8,uVar5,uVar6);
      }
      *(undefined1 *)((long)plVar8 + uVar6) = 0;
      uStack0000000000000058 = &uStack0000000000000038;
      lVar9 = func_0x00055b34(in_stack_00000018,&uStack0000000000000038,&UNK_0080364f,
                              &uStack0000000000000058,&uStack0000000000000057);
      plVar8 = (long *)(lVar9 + 0x38);
      if (plVar8 != &lStack0000000000000020) {
        if (*(char *)(lVar9 + 0x4f) < '\0') {
          uVar6 = in_stack_00000028;
          plVar2 = (long *)lStack0000000000000020;
          if (-1 < (long)_uStack0000000000000030) {
            uVar6 = _uStack0000000000000030 >> 0x38;
            plVar2 = &lStack0000000000000020;
          }
          func_0x00017784(plVar8,plVar2,uVar6);
        }
        else if ((long)_uStack0000000000000030 < 0) {
          func_0x000176c0(plVar8,lStack0000000000000020,in_stack_00000028);
        }
        else {
          *(ulong *)(lVar9 + 0x40) = in_stack_00000028;
          *plVar8 = lStack0000000000000020;
          *(ulong *)(lVar9 + 0x48) = _uStack0000000000000030;
        }
      }
      func_0x006e1d54();
      if ((long)_uStack0000000000000030 < 0) {
        __ZdlPv(lStack0000000000000020);
      }
      if ((long)_uStack0000000000000048 < 0) {
        __ZdlPv(uStack0000000000000038);
      }
    }
  }
  func_0x006e1d54();
  func_0x006e1d54();
  return;
}

