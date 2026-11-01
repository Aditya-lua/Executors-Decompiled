
undefined8 FUN_0073b9a0(void)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  uint in_w8;
  uint in_w9;
  long *unaff_x19;
  undefined4 *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  char *pcVar6;
  ulong unaff_x23;
  long unaff_x24;
  undefined4 uVar7;
  undefined4 uVar8;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000030;
  undefined1 uStack0000000000000038;
  
  uVar1 = in_w9 & in_w8;
  *unaff_x20 = 0;
  if (((uVar1 >> 5 & 1) != 0) && (**(char **)(unaff_x24 + 0x1e8) == '\0')) {
    *(undefined2 *)((long)unaff_x19 + 0x1c) = 0x20;
    if (((unaff_x23 & 1) != 0) || ((*(byte *)(unaff_x21 + 0xa1f) & 1) != 0)) {
      func_0x0078dff0(*(undefined8 *)(unaff_x24 + 0x1e0),&uStack0000000000000038);
    }
    pcVar6 = "EXTERNAL";
    uVar7 = 4;
    goto LAB_0073ba5c;
  }
  if (*(long *)((long)&linkedit_data_command_00001318.cmd + unaff_x21) == 0) {
LAB_0073bb80:
    uVar4 = 0;
    goto code_r0x0073bb84;
  }
  if (((uVar1 >> 3 & 1) == 0) || (iVar2 = func_0x0000e29c(), iVar2 == 0)) {
    if ((uVar1 >> 2 & 1) != 0) {
      *(undefined2 *)((long)unaff_x19 + 0x1c) = 4;
      pcVar6 = "CRAM-MD5";
      uVar7 = 5;
      goto LAB_0073ba5c;
    }
    if (((uVar1 >> 8 & 1) == 0) || (unaff_x22 == 0)) {
      if (((uVar1 >> 7 & 1) == 0) || (unaff_x22 == 0)) {
        if ((uVar1 >> 1 & 1) == 0) {
          if ((uVar1 & 1) == 0) goto LAB_0073bb80;
          *(undefined2 *)((long)unaff_x19 + 0x1c) = 1;
          if (((unaff_x23 & 1) != 0) || ((*(byte *)(unaff_x21 + 0xa1f) & 1) != 0)) {
            func_0x0078dff0(*(undefined8 *)(unaff_x24 + 0x1e0),&uStack0000000000000038);
          }
          pcVar6 = "LOGIN";
          uVar7 = 2;
          uVar8 = 3;
          goto LAB_0073ba60;
        }
        *(undefined2 *)((long)unaff_x19 + 0x1c) = 2;
        if (((unaff_x23 & 1) != 0) || ((*(byte *)(unaff_x21 + 0xa1f) & 1) != 0)) {
          uVar4 = func_0x0078debc(*(undefined8 *)(unaff_x24 + 0x1f8),
                                  *(undefined8 *)(unaff_x24 + 0x1e0),
                                  *(undefined8 *)(unaff_x24 + 0x1e8),&uStack0000000000000038);
          uVar7 = 1;
          pcVar6 = "PLAIN";
          iVar2 = (int)uVar4;
          goto joined_r0x0073bc20;
        }
        pcVar6 = "PLAIN";
        uVar7 = 1;
      }
      else {
        *(undefined2 *)((long)unaff_x19 + 0x1c) = 0x80;
        if (((unaff_x23 & 1) != 0) || ((*(byte *)(unaff_x21 + 0xa1f) & 1) != 0)) {
          uVar4 = func_0x007906b4(*(undefined8 *)(unaff_x24 + 0x1e0));
          uVar7 = 0xd;
          pcVar6 = "XOAUTH2";
          iVar2 = (int)uVar4;
joined_r0x0073bc20:
          uVar8 = 0x11;
          goto joined_r0x0073bc20;
        }
        pcVar6 = "XOAUTH2";
        uVar7 = 0xd;
      }
      goto LAB_0073ba5c;
    }
    *(undefined2 *)((long)unaff_x19 + 0x1c) = 0x100;
    if (((unaff_x23 & 1) == 0) && ((*(byte *)(unaff_x21 + 0xa1f) & 1) == 0)) {
      pcVar6 = "OAUTHBEARER";
      uVar7 = 0xd;
      uVar8 = 0xe;
    }
    else {
      uVar4 = func_0x00790614(*(undefined8 *)(unaff_x24 + 0x1e0),in_stack_00000030,
                              (long)in_stack_00000020._4_4_);
      uVar8 = 0xe;
      uVar7 = 0xd;
      pcVar6 = "OAUTHBEARER";
      iVar2 = (int)uVar4;
joined_r0x0073bc20:
      if (iVar2 != 0) goto code_r0x0073bb84;
    }
  }
  else {
    *(undefined2 *)((long)unaff_x19 + 0x1c) = 8;
    pcVar6 = "DIGEST-MD5";
    uVar7 = 6;
LAB_0073ba5c:
    uVar8 = 0x11;
  }
LAB_0073ba60:
  unaff_x19[2] = (long)pcVar6;
  lVar3 = func_0x00156654(&uStack0000000000000038);
  if (lVar3 == 0) {
    uVar4 = 0;
    lVar3 = *(long *)(*unaff_x19 + 0x28);
  }
  else {
    uVar4 = func_0x0073bc5c(*(undefined2 *)(*unaff_x19 + 0x3a),&uStack0000000000000038);
    lVar3 = *(long *)(*unaff_x19 + 0x28);
  }
  if (lVar3 != 0) {
    lVar3 = _strlen(pcVar6);
    lVar5 = func_0x0015665c(&uStack0000000000000038);
    if (*(ulong *)(*unaff_x19 + 0x28) < (ulong)(lVar5 + lVar3)) {
      func_0x0072a74c(&uStack0000000000000038);
    }
  }
  if (((int)uVar4 == 0) && (uVar4 = (**(code **)(*unaff_x19 + 8))(), (int)uVar4 == 0)) {
    *unaff_x20 = 1;
    lVar3 = func_0x00156654(&uStack0000000000000038);
    if (lVar3 != 0) {
      uVar7 = uVar8;
    }
    *(undefined4 *)(unaff_x19 + 1) = uVar7;
  }
code_r0x0073bb84:
  func_0x0072a74c(&uStack0000000000000038);
  return uVar4;
}

