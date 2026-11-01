
undefined8 FUN_007880f0(void)

{
  uint uVar1;
  long *plVar2;
  int iVar3;
  uint uVar4;
  ulong uVar5;
  long lVar6;
  long unaff_x20;
  long unaff_x21;
  undefined8 uVar7;
  uint unaff_w23;
  undefined8 *unaff_x24;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  char *in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  
  iVar3 = func_0x0077e6f8("socks4");
  if ((iVar3 == 0) && (iVar3 = func_0x0077e6f8("socks",in_stack_00000018), iVar3 == 0)) {
    iVar3 = func_0x0077e6f8("http",in_stack_00000018);
    if (iVar3 == 0) {
      func_0x0073c9e4();
      uVar7 = 7;
      goto LAB_0078800c;
    }
  }
  else {
    unaff_w23 = 4;
  }
  uVar5 = func_0x00795250();
  if (((uVar5 & 1) == 0) && ((unaff_w23 & 0xfffffffe) == 2)) {
    func_0x0073c9e4();
    uVar7 = 4;
    goto LAB_0078800c;
  }
  uVar1 = unaff_w23 & 0xfffffffc;
  plVar2 = (long *)(unaff_x20 + 0xa8);
  if (uVar1 != 4) {
    plVar2 = (long *)(unaff_x20 + 0xe0);
  }
  *(char *)((long)plVar2 + 0x24) = (char)unaff_w23;
  iVar3 = func_0x00789530();
  if (((iVar3 != 0xb) && (iVar3 != 0)) ||
     ((iVar3 = func_0x00789530(), iVar3 != 0xc && (iVar3 != 0)))) {
    uVar7 = 0;
    goto LAB_0078800c;
  }
  if (in_stack_00000030 == 0 && in_stack_00000028 == 0) {
LAB_00788244:
    func_0x00789530();
    if (in_stack_00000038 == 0) {
      uVar4 = (uint)*(ushort *)(unaff_x21 + 0x688);
      if ((*(ushort *)(unaff_x21 + 0x688) == 0) && (uVar4 = 0x438, (unaff_w23 & 0xfffffffe) == 2)) {
        uVar4 = 0x1bb;
      }
code_r0x007882a4:
      *(uint *)(plVar2 + 4) = uVar4;
      if (((uVar1 == 4) || (*(int *)(unaff_x20 + 0x174) < 0)) || (*(long *)(unaff_x20 + 0xa8) == 0))
      {
        *(uint *)(unaff_x20 + 0x174) = uVar4;
      }
    }
    else {
      uVar4 = _strtol(in_stack_00000038,0,10);
      (*(code *)*unaff_x24)(in_stack_00000038);
      if (-1 < (int)uVar4) goto code_r0x007882a4;
    }
    iVar3 = func_0x00789530();
    if (iVar3 == 0) {
      if ((uVar1 == 4) && (iVar3 = func_0x0077e6f8("localhost",in_stack_00000020), iVar3 != 0)) {
        iVar3 = func_0x00789530();
        if (iVar3 != 0) goto code_r0x00788008;
        iVar3 = _strcmp("/",in_stack_00000010);
        if (iVar3 == 0) goto code_r0x0078836c;
        (*(code *)*unaff_x24)(in_stack_00000020);
        in_stack_00000020 = (char *)func_0x00764704("localhost%s");
        if (in_stack_00000020 == (char *)0x0) goto code_r0x00788008;
        (*(code *)*unaff_x24)(*(undefined8 *)(unaff_x20 + 0xa8));
        *(char **)(unaff_x20 + 0xa8) = in_stack_00000020;
        *(char **)(unaff_x20 + 0xb8) = in_stack_00000020;
      }
      else {
code_r0x0078836c:
        (*(code *)*unaff_x24)(*plVar2);
        *plVar2 = (long)in_stack_00000020;
        if (*in_stack_00000020 == '[') {
          lVar6 = _strlen(in_stack_00000020);
          in_stack_00000020[lVar6 + -1] = '\0';
          in_stack_00000020 = in_stack_00000020 + 1;
          func_0x00787c94();
        }
        plVar2[2] = (long)in_stack_00000020;
      }
      uVar7 = 0;
      in_stack_00000020 = (char *)0x0;
      goto LAB_0078800c;
    }
  }
  else {
    (*(code *)*unaff_x24)(plVar2[5]);
    plVar2[5] = in_stack_00000030;
    uVar7 = func_0x00775ed0(unaff_x21 + 0x1330);
    in_stack_00000030 = 0;
    if ((int)uVar7 != 0) goto LAB_0078800c;
    (*(code *)*unaff_x24)(plVar2[6]);
    plVar2[6] = 0;
    if ((in_stack_00000028 != 0) ||
       (in_stack_00000028 = (*pcRam0000000000a2b600)(""), in_stack_00000028 != 0)) {
      plVar2[6] = in_stack_00000028;
      uVar7 = func_0x00775ed0(&UNK_00001338 + unaff_x21);
      in_stack_00000028 = 0;
      if ((int)uVar7 != 0) goto LAB_0078800c;
      *(ulong *)(unaff_x20 + 0x398) = *(ulong *)(unaff_x20 + 0x398) | 4;
      goto LAB_00788244;
    }
  }
code_r0x00788008:
  uVar7 = 0x1b;
LAB_0078800c:
  (*(code *)*unaff_x24)(in_stack_00000030);
  (*(code *)*unaff_x24)(in_stack_00000028);
  (*(code *)*unaff_x24)(in_stack_00000020);
  (*(code *)*unaff_x24)(in_stack_00000018);
  (*(code *)*unaff_x24)(in_stack_00000010);
  func_0x00789278();
  return uVar7;
}

