
void FUN_001d93ac(undefined8 param_1,ulong param_2)

{
  ulong uVar1;
  uint uVar2;
  code *pcVar3;
  bool bVar4;
  uint uVar5;
  long lVar6;
  ulong uVar7;
  undefined8 uVar8;
  undefined8 *extraout_x8;
  long lVar9;
  ulong uVar10;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong unaff_x24;
  ulong unaff_x25;
  ulong uVar11;
  ulong unaff_x27;
  ulong unaff_x28;
  undefined8 in_stack_00000000;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  undefined1 uStack0000000000000020;
  undefined1 uStack0000000000000021;
  undefined2 uStack0000000000000022;
  undefined2 uStack0000000000000024;
  
  if ((long)param_2 < 0) {
    unaff_x22 = 0;
LAB_001d954c:
    uVar8 = func_0x007a1f00(unaff_x22,param_2,&UNK_009c3208);
    if (param_2 != 0) {
      func_0x00187bd4(in_stack_00000000,param_2,1);
    }
    __Unwind_Resume(uVar8);
    *extraout_x8 = 0x8000000000000021;
    return;
  }
  if (param_2 == 0) {
    lVar6 = 1;
  }
  else {
    unaff_x22 = 1;
    lVar6 = func_0x00187bd0(param_2,1);
    if (lVar6 == 0) goto LAB_001d954c;
  }
  _memcpy(lVar6,param_1,param_2);
  uVar10 = 0;
  lVar9 = lVar6;
  uVar11 = param_2;
  do {
    in_stack_00000018 = 0;
    uStack0000000000000008 = lVar9;
    in_stack_00000010 = uVar11;
    uVar7 = func_0x00256ec0(&uStack0000000000000008);
    uVar5 = (uint)uVar7;
    if ((uVar5 & 0xffff) == 10) {
      uVar2 = uVar5 >> 0x10 & 0xff;
      if (uVar2 < 4) {
        if (uVar2 == 2) {
          uVar7 = 7;
        }
        else {
          if (uVar2 != 3) goto joined_r0x001d9528;
          uVar7 = 10;
        }
      }
      else {
        uVar7 = 3;
        if (uVar2 != 4) {
          uVar7 = 0x11;
        }
      }
      unaff_x24 = uVar7 | unaff_x24 & 0xffffffffffffff00;
      uStack0000000000000008 = -0x7fffffffffffffec;
      uVar7 = unaff_x22;
    }
    else {
      unaff_x25 = uVar7 >> 0x30;
      uVar1 = unaff_x25 + 5;
      bVar4 = uVar11 < uVar1;
      uVar11 = uVar11 - uVar1;
      if (bVar4) goto joined_r0x001d9528;
      unaff_x27 = uVar7 >> 0x20;
      unaff_x28 = uVar7 >> 0x28;
      unaff_x23 = uVar7 >> 0x10;
      unaff_x24 = lVar9 + 5;
      lVar9 = lVar9 + uVar1;
      uVar10 = uVar1 + uVar10;
      uStack0000000000000008 = -0x7fffffffffffffd9;
    }
    uStack0000000000000020 = (undefined1)unaff_x27;
    uStack0000000000000021 = (undefined1)unaff_x28;
    uStack0000000000000022 = (undefined2)uVar7;
    uStack0000000000000024 = (undefined2)unaff_x23;
    unaff_x22 = uVar7;
  } while ((uVar5 & 0xffff) != 10);
  in_stack_00000010 = unaff_x24;
  in_stack_00000018 = unaff_x25;
  func_0x001d4a90(&uStack0000000000000008);
joined_r0x001d9528:
  if (param_2 < uVar10) {
    func_0x007a247c(&UNK_0081efaf,0x34,&UNK_009c3220);
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x1d9548);
    (*pcVar3)();
  }
  if (param_2 != 0) {
    func_0x00187bd4(lVar6,param_2,1);
  }
  return;
}

