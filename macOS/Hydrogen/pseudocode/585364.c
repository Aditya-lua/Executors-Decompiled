
void FUN_00585364(long param_1)

{
  undefined8 *puVar1;
  code *pcVar2;
  bool in_ZR;
  long lVar3;
  ulong uVar4;
  undefined1 *unaff_x19;
  undefined8 *unaff_x20;
  ulong *puVar5;
  undefined8 uVar6;
  long unaff_x29;
  long in_stack_00000000;
  undefined8 in_stack_00000008;
  long in_stack_00000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  undefined8 *in_stack_00000028;
  long in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined1 uStack0000000000000050;
  
  if (in_ZR) {
    puVar5 = unaff_x20 + 1;
    if (*puVar5 != 0x8000000000000001) {
      return;
    }
    puVar1 = unaff_x20 + 2;
    func_0x0056ba90(puVar1);
    if (in_stack_00000000 == 0) {
      return;
    }
    func_0x005817ac(&uStack0000000000000050);
    if (-1 < in_stack_00000010) {
      if (in_stack_00000010 == 0) {
        lVar3 = 1;
      }
      else {
        uVar6 = 1;
        lVar3 = func_0x00187bd0(in_stack_00000010,1);
        if (lVar3 == 0) goto LAB_005855e0;
      }
      _memcpy(lVar3,in_stack_00000008,in_stack_00000010);
      *(long *)(unaff_x29 + -0x80) = in_stack_00000010;
      *(long *)(unaff_x29 + -0x78) = lVar3;
      *(long *)(unaff_x29 + -0x70) = in_stack_00000010;
      lVar3 = unaff_x20[4];
      if (lVar3 == 0) {
        func_0x007a28bc(1,0,&UNK_009edf90);
        goto code_r0x005855f4;
      }
      unaff_x20[4] = 1;
      uStack0000000000000018 = unaff_x20[3] + 0x40;
      in_stack_00000020 = unaff_x20[3] + lVar3 * 0x40;
      in_stack_00000038 = 0;
      in_stack_00000028 = puVar1;
      in_stack_00000030 = lVar3;
      func_0x0055af64(unaff_x29 + -0x68,&uStack0000000000000018,&UNK_009f0678);
      func_0x005ce9d0(&uStack0000000000000018,&uStack0000000000000050,unaff_x29 + -0x80,
                      unaff_x29 + -0x68);
      uVar4 = *puVar5 ^ 0x8000000000000000;
      if (1 < uVar4) {
        uVar4 = 2;
      }
      if (uVar4 != 0) {
        if (uVar4 == 1) {
          func_0x0058109c(puVar1);
        }
        else {
          func_0x005812e8(puVar5);
        }
      }
      goto LAB_005854a8;
    }
    uVar6 = 0;
LAB_005855e0:
    func_0x007a1f00(uVar6,in_stack_00000010,&UNK_009f0888);
    goto code_r0x005855f4;
  }
  if (param_1 != 2) {
    return;
  }
  func_0x0056ba90(unaff_x20 + 1);
  if (in_stack_00000000 == 0) {
    return;
  }
  func_0x005817ac(&uStack0000000000000050);
  if (in_stack_00000010 < 0) {
    uVar6 = 0;
LAB_005855c4:
    func_0x007a1f00(uVar6,in_stack_00000010,&UNK_009f0888);
  }
  else {
    if (in_stack_00000010 == 0) {
      lVar3 = 1;
    }
    else {
      uVar6 = 1;
      lVar3 = func_0x00187bd0(in_stack_00000010,1);
      if (lVar3 == 0) goto LAB_005855c4;
    }
    _memcpy(lVar3,in_stack_00000008,in_stack_00000010);
    *(long *)(unaff_x29 + -0x80) = in_stack_00000010;
    *(long *)(unaff_x29 + -0x78) = lVar3;
    *(long *)(unaff_x29 + -0x70) = in_stack_00000010;
    lVar3 = unaff_x20[3];
    if (lVar3 != 0) {
      unaff_x20[3] = 1;
      uStack0000000000000018 = unaff_x20[2] + 0x40;
      in_stack_00000020 = unaff_x20[2] + lVar3 * 0x40;
      in_stack_00000038 = 0;
      in_stack_00000028 = unaff_x20 + 1;
      in_stack_00000030 = lVar3;
      func_0x0055af64(unaff_x29 + -0x68,&uStack0000000000000018,&UNK_009f0678);
      func_0x005ce9d0(&uStack0000000000000018,&uStack0000000000000050,unaff_x29 + -0x80,
                      unaff_x29 + -0x68);
      func_0x00580b10();
      *unaff_x20 = 3;
LAB_005854a8:
      unaff_x20[2] = in_stack_00000020;
      unaff_x20[1] = uStack0000000000000018;
      unaff_x20[4] = in_stack_00000030;
      unaff_x20[3] = in_stack_00000028;
      unaff_x20[6] = in_stack_00000040;
      unaff_x20[5] = in_stack_00000038;
      unaff_x20[7] = in_stack_00000048;
      *unaff_x19 = 1;
      return;
    }
    func_0x007a28bc(1,0,&UNK_009edf90);
  }
code_r0x005855f4:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x5855f8);
  (*pcVar2)();
}

