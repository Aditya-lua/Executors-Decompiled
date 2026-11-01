
undefined * FUN_00186054(void)

{
  code *pcVar1;
  bool in_ZR;
  undefined8 *puVar2;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  undefined8 uVar3;
  long lVar4;
  undefined8 unaff_x25;
  undefined8 uVar5;
  undefined8 unaff_x27;
  ulong uStack0000000000000018;
  long lStack0000000000000020;
  ulong uStack0000000000000028;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  
  if (!in_ZR) {
    unaff_x20 = *(ulong *)(unaff_x22 + 0x28);
    if ((long)unaff_x20 < 0) {
      uVar5 = 0;
LAB_001861f0:
      func_0x007a1f00(uVar5,unaff_x20,&UNK_009bdb28);
      goto code_r0x00186224;
    }
    uVar3 = *(undefined8 *)(unaff_x22 + 0x20);
    if (unaff_x20 == 0) {
      unaff_x22 = 1;
    }
    else {
      uVar5 = 1;
      unaff_x22 = func_0x00187bd0(unaff_x20,1);
      if (unaff_x22 == 0) goto LAB_001861f0;
    }
    _memcpy(unaff_x22,uVar3,unaff_x20);
  }
  if (unaff_x21 == (long *)0x0) {
    if ((unaff_x20 | 0x8000000000000000) != 0x8000000000000000) {
      func_0x00187bd4(unaff_x22,unaff_x20,1);
    }
    uStack0000000000000018 = 0x8000000000000000;
    lStack0000000000000020 = unaff_x22;
    uStack0000000000000028 = unaff_x20;
  }
  else {
    lVar4 = *unaff_x21;
    if (lVar4 == 0) {
      func_0x00185138();
      return &UNK_00001b5a;
    }
    uStack0000000000000018 = unaff_x21[1];
    if ((long)uStack0000000000000018 < 0) {
      uVar5 = 0;
LAB_0018620c:
      func_0x007a1f00(uVar5,uStack0000000000000018,&UNK_009bff28);
      goto code_r0x00186224;
    }
    if (uStack0000000000000018 == 0) {
      lStack0000000000000020 = 1;
    }
    else {
      uVar5 = 1;
      lStack0000000000000020 = func_0x00187bd0(uStack0000000000000018,1);
      if (lStack0000000000000020 == 0) goto LAB_0018620c;
    }
    _memcpy(lStack0000000000000020,lVar4,uStack0000000000000018);
    if ((unaff_x20 | 0x8000000000000000) != 0x8000000000000000) {
      func_0x00187bd4(unaff_x22,unaff_x20,1);
    }
    uStack0000000000000028 = uStack0000000000000018;
  }
  puVar2 = (undefined8 *)func_0x00187bd0(0x50,8);
  if (puVar2 != (undefined8 *)0x0) {
    puVar2[5] = uStack0000000000000018;
    puVar2[4] = in_stack_00000050;
    puVar2[7] = uStack0000000000000028;
    puVar2[6] = lStack0000000000000020;
    puVar2[9] = unaff_x27;
    puVar2[8] = unaff_x25;
    puVar2[1] = 1;
    *puVar2 = 1;
    puVar2[3] = in_stack_00000048;
    puVar2[2] = in_stack_00000040;
    *unaff_x19 = puVar2 + 2;
    return &UNK_00001b58;
  }
  func_0x007a1f18(8,0x50);
code_r0x00186224:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x186228);
  (*pcVar1)();
}

