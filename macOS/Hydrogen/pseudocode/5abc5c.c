
/* WARNING: Removing unreachable block (ram,0x005abb34) */

void FUN_005abc5c(void)

{
  byte bVar1;
  uint uVar2;
  long lVar3;
  byte *pbVar4;
  code *pcVar5;
  bool bVar6;
  ulong uVar7;
  long unaff_x19;
  ulong unaff_x20;
  ulong uVar8;
  byte *unaff_x21;
  byte *pbVar9;
  long unaff_x22;
  byte *unaff_x23;
  long unaff_x24;
  undefined *puVar10;
  uint unaff_w26;
  ulong uVar11;
  long unaff_x28;
  long unaff_x29;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  ulong in_stack_00000018;
  long *in_stack_00000020;
  byte *in_stack_00000028;
  undefined8 uStack0000000000000030;
  long in_stack_00000038;
  long lStack0000000000000040;
  undefined4 uStack0000000000000048;
  long in_stack_00000050;
  long in_stack_00000058;
  
code_r0x005abc5c:
  lStack0000000000000040 = unaff_x24;
  if ((unaff_x19 << 1 != 0) &&
     (func_0x007af5a0(&uStack0000000000000030,unaff_x24,unaff_x19 << 1,1,1),
     unaff_x24 = uStack0000000000000030, uStack0000000000000030 == unaff_x28)) {
    func_0x007a23bc(&UNK_009f1fe0);
LAB_005ac008:
                    /* WARNING: Does not return */
    pcVar5 = (code *)SoftwareBreakpoint(1,0x5ac00c);
    (*pcVar5)();
  }
  uVar8 = unaff_x20;
  if (0xc < (int)unaff_w26) goto LAB_005abb74;
code_r0x005abc74:
  if (unaff_w26 == 9) {
    puVar10 = &UNK_008aed33;
  }
  else if (unaff_w26 == 10) {
    puVar10 = &UNK_008aed2f;
  }
  else {
    pbVar9 = unaff_x21;
    if (unaff_w26 != 0xc) goto LAB_005abca4;
    puVar10 = &UNK_008aed3b;
  }
LAB_005abd00:
  if ((ulong)(unaff_x24 - lStack0000000000000040) < 2) {
    func_0x007af5a0(&uStack0000000000000030,lStack0000000000000040,2,1,1);
  }
  lVar3 = lStack0000000000000040;
  _memcpy(in_stack_00000038 + lStack0000000000000040,puVar10,2);
  bVar6 = false;
  lStack0000000000000040 = lVar3 + 2;
LAB_005aba28:
  uVar11 = unaff_x20;
  uVar7 = uVar8;
  pbVar4 = unaff_x21;
  lVar3 = lStack0000000000000040;
  pbVar9 = in_stack_00000028;
  unaff_x24 = uStack0000000000000030;
  if (!bVar6) goto code_r0x005aba48;
  do {
    unaff_x21 = pbVar4;
    unaff_x20 = uVar11;
    uStack0000000000000030 = unaff_x24;
    lStack0000000000000040 = lVar3;
    if (pbVar9 == (byte *)0x0) {
code_r0x005abee8:
      if (uStack0000000000000030 == -0x8000000000000000) {
        func_0x0046b8d0(&uStack0000000000000048,in_stack_00000010,in_stack_00000018);
        if (uStack0000000000000048 == 1) {
          *(long *)(unaff_x29 + -0x58) = in_stack_00000058;
          *(long *)(unaff_x29 + -0x60) = in_stack_00000050;
          puVar10 = &UNK_009f1ff8;
          goto code_r0x005abfb8;
        }
        in_stack_00000020[1] = in_stack_00000050;
        in_stack_00000020[2] = in_stack_00000058;
        *in_stack_00000020 = -0x8000000000000000;
        if ((uStack0000000000000030 != -0x8000000000000000) && (uStack0000000000000030 != 0)) {
          func_0x00187bd4(in_stack_00000038,uStack0000000000000030,1);
        }
      }
      else {
        in_stack_00000020[1] = in_stack_00000038;
        *in_stack_00000020 = uStack0000000000000030;
        in_stack_00000020[2] = lStack0000000000000040;
      }
      return;
    }
    bVar1 = *pbVar9;
    if ((bVar1 != 0x20) &&
       ((uVar11 = unaff_x20, (byte)(bVar1 + 0x81) < 0xa2 ||
        (bVar1 - 0x22 < 0x3b &&
         (unaff_x22 << ((ulong)(bVar1 - 0x22) & 0x3f) & 0x400000000000021U) != 0)))) break;
    while (unaff_x24 == unaff_x28) {
      if ((unaff_x21 == unaff_x23) || (unaff_x21 == (byte *)0x0)) goto code_r0x005abee8;
      bVar1 = *unaff_x21;
      if ((bVar1 != 0x20) &&
         (((byte)(bVar1 + 0x81) < 0xa2 ||
          ((bVar1 - 0x22 < 0x3b &&
           ((unaff_x22 << ((ulong)(bVar1 - 0x22) & 0x3f) & 0x400000000000021U) != 0)))))) {
        unaff_x21 = unaff_x21 + 1;
        uVar11 = unaff_x20 + 1;
        uVar7 = unaff_x20;
        goto joined_r0x005abbc8;
      }
      unaff_x21 = unaff_x21 + 1;
      unaff_x20 = unaff_x20 + 1;
    }
    if (unaff_x24 == lVar3) {
      func_0x007af5a0(&uStack0000000000000030,lVar3,1,1,1);
    }
    *(byte *)(in_stack_00000038 + lStack0000000000000040) = bVar1;
    lStack0000000000000040 = lVar3 + 1;
code_r0x005aba48:
    if (unaff_x21 == unaff_x23) goto code_r0x005abee8;
    uVar11 = unaff_x20 + 1;
    uVar7 = unaff_x20;
    pbVar4 = unaff_x21 + 1;
    lVar3 = lStack0000000000000040;
    pbVar9 = unaff_x21;
    unaff_x24 = uStack0000000000000030;
  } while( true );
joined_r0x005abbc8:
  unaff_x20 = uVar11;
  unaff_w26 = (uint)bVar1;
  if (unaff_x24 == unaff_x28) goto code_r0x005abbcc;
  if (unaff_w26 < 0xd) goto code_r0x005abc74;
LAB_005abb74:
  pbVar9 = unaff_x21;
  if ((int)unaff_w26 < 0x27) {
    if (unaff_w26 == 0xd) {
      puVar10 = &UNK_008aed31;
      goto LAB_005abd00;
    }
    if (unaff_w26 == 0x22) goto code_r0x005abb8c;
  }
  else {
    if (unaff_w26 == 0x27) {
      puVar10 = &UNK_008aed37;
      goto LAB_005abd00;
    }
    if (unaff_w26 == 0x5c) {
      puVar10 = &UNK_008aed39;
      goto LAB_005abd00;
    }
  }
LAB_005abca4:
  lVar3 = lStack0000000000000040;
  if (unaff_w26 < 100) {
    if (9 < unaff_w26) {
      uStack0000000000000048._0_3_ =
           CONCAT21(*(undefined2 *)(&UNK_008aeb1e + (ulong)unaff_w26 * 2),
                    (undefined1)uStack0000000000000048);
      uVar7 = 1;
      goto joined_r0x005abd90;
    }
    uVar7 = 2;
  }
  else {
    uVar7 = 0;
    uVar2 = unaff_w26 * 0x29 >> 0xc;
    uStack0000000000000048._0_3_ =
         CONCAT21(*(undefined2 *)(&UNK_008aeb1e + ((ulong)(unaff_w26 + uVar2 * -100) & 0xff) * 2),
                  (undefined1)uStack0000000000000048);
    unaff_w26 = uVar2;
  }
  *(byte *)((long)&uStack0000000000000048 + uVar7) = (byte)unaff_w26 | 0x30;
joined_r0x005abd90:
  if (unaff_x24 == lStack0000000000000040) {
    func_0x007af5a0(&uStack0000000000000030,unaff_x24,1,1,1);
    uVar8 = uVar7;
  }
  *(undefined1 *)(in_stack_00000038 + lStack0000000000000040) = 0x5c;
  lStack0000000000000040 = lVar3 + 1;
  bVar6 = uVar7 != 0;
  unaff_x21 = pbVar9;
  if (uVar7 != 0) {
    if (pbVar9 == unaff_x23) {
      in_stack_00000028 = (byte *)0x0;
      unaff_x21 = unaff_x23;
    }
    else {
      if (*pbVar9 - 0x30 < 10) {
        func_0x005bd3a4(&uStack0000000000000030,uVar7,0x30);
      }
      uVar8 = unaff_x20;
      unaff_x21 = pbVar9 + 1;
      unaff_x20 = unaff_x20 + 1;
      in_stack_00000028 = pbVar9;
    }
  }
  uVar11 = uVar7 ^ 3;
  if ((ulong)(uStack0000000000000030 - lStack0000000000000040) < uVar11) {
    func_0x007af5a0(&uStack0000000000000030,lStack0000000000000040,uVar11,1,1);
  }
  lVar3 = lStack0000000000000040;
  _memcpy(in_stack_00000038 + lStack0000000000000040,(long)&uStack0000000000000048 + uVar7,uVar11);
  lStack0000000000000040 = lVar3 + uVar11;
  goto LAB_005aba28;
code_r0x005abbcc:
  unaff_x19 = in_stack_00000018 - uVar7;
  if (in_stack_00000018 < uVar7) {
    func_0x007a28b0(uVar7,in_stack_00000018,&UNK_009f1fb0);
    goto LAB_005ac008;
  }
  func_0x0046b8d0(&uStack0000000000000048,in_stack_00000010);
  unaff_x24 = in_stack_00000058;
  lVar3 = in_stack_00000050;
  if (uStack0000000000000048 == 1) {
    *(long *)(unaff_x29 + -0x58) = in_stack_00000058;
    *(long *)(unaff_x29 + -0x60) = in_stack_00000050;
    puVar10 = &UNK_009f1fc8;
code_r0x005abfb8:
    func_0x007a2810(&UNK_008aeaf3,0x2b,unaff_x29 + -0x60,&UNK_009f1cd8,puVar10);
    goto LAB_005ac008;
  }
  if (in_stack_00000058 < 0) {
    unaff_x22 = 0;
    goto code_r0x005abff4;
  }
  if (in_stack_00000058 == 0) {
    in_stack_00000008 = 1;
  }
  else {
    in_stack_00000008 = func_0x00187bd0(in_stack_00000058,1);
    if (in_stack_00000008 == 0) {
      in_stack_00000008 = unaff_x24;
code_r0x005abff4:
      func_0x007a1f00(unaff_x22,in_stack_00000008,&UNK_009f1d38);
      goto LAB_005ac008;
    }
  }
  _memcpy(in_stack_00000008,lVar3,unaff_x24);
  if ((uStack0000000000000030 != unaff_x28) && (uStack0000000000000030 != 0)) {
    func_0x00187bd4(in_stack_00000038,uStack0000000000000030,1);
  }
  uStack0000000000000030 = unaff_x24;
  in_stack_00000038 = in_stack_00000008;
  goto code_r0x005abc5c;
code_r0x005abb8c:
  puVar10 = &UNK_008aed35;
  goto LAB_005abd00;
}

