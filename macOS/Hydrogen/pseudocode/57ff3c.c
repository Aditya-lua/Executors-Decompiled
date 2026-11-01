
void FUN_0057ff3c(undefined1 *param_1,long *param_2)

{
  long *plVar1;
  code *pcVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  ulong *puVar6;
  undefined8 uVar7;
  long in_stack_00000000;
  undefined8 in_stack_00000008;
  long in_stack_00000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long *in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  undefined1 uStack0000000000000050;
  undefined8 uStack0000000000000090;
  long in_stack_00000098;
  long in_stack_000000a0;
  undefined1 uStack00000000000000a8;
  
  if (*param_2 == 0xb) {
    puVar6 = (ulong *)(param_2 + 1);
    if (*puVar6 != 0x8000000000000001) {
      return;
    }
    plVar1 = param_2 + 2;
    func_0x0056ba90(plVar1);
    if (in_stack_00000000 == 0) {
      return;
    }
    func_0x0057dc40(&uStack0000000000000050);
    if (-1 < in_stack_00000010) {
      if (in_stack_00000010 == 0) {
        lVar3 = 1;
      }
      else {
        uVar7 = 1;
        lVar3 = func_0x00187bd0(in_stack_00000010,1);
        if (lVar3 == 0) goto LAB_005801cc;
      }
      _memcpy(lVar3,in_stack_00000008,in_stack_00000010);
      uStack0000000000000090 = in_stack_00000010;
      in_stack_000000a0 = in_stack_00000010;
      lVar4 = param_2[4];
      in_stack_00000098 = lVar3;
      if (lVar4 == 0) {
        func_0x007a28bc(1,0,&UNK_009edf90);
        goto LAB_005801e0;
      }
      param_2[4] = 1;
      uStack0000000000000018 = param_2[3] + 0x40;
      in_stack_00000020 = param_2[3] + lVar4 * 0x40;
      in_stack_00000038 = 0;
      in_stack_00000028 = plVar1;
      in_stack_00000030 = lVar4;
      func_0x0055af64(&uStack00000000000000a8,&uStack0000000000000018,&UNK_009f02e0);
      func_0x005ce9d0(&uStack0000000000000018,&uStack0000000000000050,&uStack0000000000000090,
                      &uStack00000000000000a8);
      uVar5 = *puVar6 ^ 0x8000000000000000;
      if (1 < uVar5) {
        uVar5 = 2;
      }
      if (uVar5 != 0) {
        if (uVar5 == 1) {
          func_0x0057d2dc(plVar1);
        }
        else {
          func_0x0057d54c(puVar6);
        }
      }
      goto LAB_00580094;
    }
    uVar7 = 0;
LAB_005801cc:
    func_0x007a1f00(uVar7,in_stack_00000010,&UNK_009f0528);
    goto LAB_005801e0;
  }
  if (*param_2 != 2) {
    return;
  }
  func_0x0056ba90(param_2 + 1);
  if (in_stack_00000000 == 0) {
    return;
  }
  func_0x0057dc40(&uStack0000000000000050);
  if (in_stack_00000010 < 0) {
    uVar7 = 0;
LAB_005801b0:
    func_0x007a1f00(uVar7,in_stack_00000010,&UNK_009f0528);
  }
  else {
    if (in_stack_00000010 == 0) {
      lVar3 = 1;
    }
    else {
      uVar7 = 1;
      lVar3 = func_0x00187bd0(in_stack_00000010,1);
      if (lVar3 == 0) goto LAB_005801b0;
    }
    _memcpy(lVar3,in_stack_00000008,in_stack_00000010);
    uStack0000000000000090 = in_stack_00000010;
    in_stack_000000a0 = in_stack_00000010;
    lVar4 = param_2[3];
    in_stack_00000098 = lVar3;
    if (lVar4 != 0) {
      param_2[3] = 1;
      uStack0000000000000018 = param_2[2] + 0x40;
      in_stack_00000020 = param_2[2] + lVar4 * 0x40;
      in_stack_00000038 = 0;
      in_stack_00000028 = param_2 + 1;
      in_stack_00000030 = lVar4;
      func_0x0055af64(&uStack00000000000000a8,&uStack0000000000000018,&UNK_009f02e0);
      func_0x005ce9d0(&uStack0000000000000018,&uStack0000000000000050,&uStack0000000000000090,
                      &uStack00000000000000a8);
      func_0x0057c5c4(param_2);
      *param_2 = 3;
LAB_00580094:
      param_2[2] = in_stack_00000020;
      param_2[1] = uStack0000000000000018;
      param_2[4] = in_stack_00000030;
      param_2[3] = (long)in_stack_00000028;
      param_2[6] = in_stack_00000040;
      param_2[5] = in_stack_00000038;
      param_2[7] = in_stack_00000048;
      *param_1 = 1;
      return;
    }
    func_0x007a28bc(1,0,&UNK_009edf90);
  }
LAB_005801e0:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x5801e4);
  (*pcVar2)();
}

