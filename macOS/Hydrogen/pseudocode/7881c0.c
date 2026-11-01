
undefined8 FUN_007881c0(void)

{
  uint uVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  long unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x24;
  undefined8 *unaff_x25;
  int unaff_w26;
  long *unaff_x27;
  int unaff_w28;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  char *in_stack_00000020;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  long in_stack_00000038;
  
  unaff_x25[5] = in_stack_00000030;
  uVar3 = func_0x00775ed0(unaff_x21 + 0x1330);
  if ((int)uVar3 != 0) goto LAB_0078800c;
  (*(code *)*unaff_x24)(unaff_x25[6]);
  unaff_x25[6] = 0;
  if ((in_stack_00000028 != 0) ||
     (in_stack_00000028 = (*pcRam0000000000a2b600)(""), in_stack_00000028 != 0)) {
    unaff_x25[6] = in_stack_00000028;
    uVar3 = func_0x00775ed0(&UNK_00001338 + unaff_x21);
    in_stack_00000028 = 0;
    if ((int)uVar3 != 0) goto LAB_0078800c;
    *(ulong *)(unaff_x20 + 0x398) = *(ulong *)(unaff_x20 + 0x398) | 4;
    func_0x00789530();
    if (in_stack_00000038 == 0) {
      uVar1 = (uint)*(ushort *)(unaff_x21 + 0x688);
      if ((*(ushort *)(unaff_x21 + 0x688) == 0) && (uVar1 = 0x438, unaff_w28 == 2)) {
        uVar1 = 0x1bb;
      }
LAB_007882a4:
      *(uint *)(unaff_x25 + 4) = uVar1;
      if (((unaff_w26 == 4) || (*(int *)(unaff_x20 + 0x174) < 0)) || (*unaff_x27 == 0)) {
        *(uint *)(unaff_x20 + 0x174) = uVar1;
      }
    }
    else {
      uVar1 = _strtol(in_stack_00000038,0,10);
      (*(code *)*unaff_x24)(in_stack_00000038);
      if (-1 < (int)uVar1) goto LAB_007882a4;
    }
    iVar2 = func_0x00789530();
    if (iVar2 == 0) {
      if ((unaff_w26 == 4) && (iVar2 = func_0x0077e6f8("localhost",in_stack_00000020), iVar2 != 0))
      {
        iVar2 = func_0x00789530();
        if (iVar2 != 0) goto LAB_00788008;
        iVar2 = _strcmp("/",in_stack_00000010);
        if (iVar2 == 0) goto code_r0x0078836c;
        (*(code *)*unaff_x24)(in_stack_00000020);
        in_stack_00000020 = (char *)func_0x00764704("localhost%s");
        if (in_stack_00000020 == (char *)0x0) goto LAB_00788008;
        (*(code *)*unaff_x24)(*(undefined8 *)(unaff_x20 + 0xa8));
        *(char **)(unaff_x20 + 0xa8) = in_stack_00000020;
        *(char **)(unaff_x20 + 0xb8) = in_stack_00000020;
      }
      else {
code_r0x0078836c:
        (*(code *)*unaff_x24)(*unaff_x25);
        *unaff_x25 = in_stack_00000020;
        if (*in_stack_00000020 == '[') {
          lVar4 = _strlen(in_stack_00000020);
          in_stack_00000020[lVar4 + -1] = '\0';
          in_stack_00000020 = in_stack_00000020 + 1;
          func_0x00787c94();
        }
        unaff_x25[2] = in_stack_00000020;
      }
      uVar3 = 0;
      in_stack_00000020 = (char *)0x0;
      goto LAB_0078800c;
    }
  }
LAB_00788008:
  uVar3 = 0x1b;
LAB_0078800c:
  (*(code *)*unaff_x24)(0);
  (*(code *)*unaff_x24)(in_stack_00000028);
  (*(code *)*unaff_x24)(in_stack_00000020);
  (*(code *)*unaff_x24)(in_stack_00000018);
  (*(code *)*unaff_x24)(in_stack_00000010);
  func_0x00789278();
  return uVar3;
}

