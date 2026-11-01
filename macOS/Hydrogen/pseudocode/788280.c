
undefined8 thunk_FUN_007882c4(void)

{
  int iVar1;
  long lVar2;
  long unaff_x20;
  undefined8 uVar3;
  undefined8 *unaff_x24;
  undefined8 *unaff_x25;
  int unaff_w26;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  char *in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  
  iVar1 = func_0x00789530();
  if (iVar1 == 0) {
    if ((unaff_w26 == 4) && (iVar1 = func_0x0077e6f8("localhost",in_stack_00000020), iVar1 != 0)) {
      iVar1 = func_0x00789530();
      if (iVar1 != 0) goto LAB_00788008;
      iVar1 = _strcmp("/",in_stack_00000010);
      if (iVar1 == 0) goto LAB_0078836c;
      (*(code *)*unaff_x24)(in_stack_00000020);
      in_stack_00000020 = (char *)func_0x00764704("localhost%s");
      if (in_stack_00000020 == (char *)0x0) goto LAB_00788008;
      (*(code *)*unaff_x24)(*(undefined8 *)(unaff_x20 + 0xa8));
      *(char **)(unaff_x20 + 0xa8) = in_stack_00000020;
      *(char **)(unaff_x20 + 0xb8) = in_stack_00000020;
    }
    else {
LAB_0078836c:
      (*(code *)*unaff_x24)(*unaff_x25);
      *unaff_x25 = in_stack_00000020;
      if (*in_stack_00000020 == '[') {
        lVar2 = _strlen(in_stack_00000020);
        in_stack_00000020[lVar2 + -1] = '\0';
        in_stack_00000020 = in_stack_00000020 + 1;
        func_0x00787c94();
      }
      unaff_x25[2] = in_stack_00000020;
    }
    uVar3 = 0;
    in_stack_00000020 = (char *)0x0;
  }
  else {
LAB_00788008:
    uVar3 = 0x1b;
  }
  (*(code *)*unaff_x24)(in_stack_00000030);
  (*(code *)*unaff_x24)(in_stack_00000028);
  (*(code *)*unaff_x24)(in_stack_00000020);
  (*(code *)*unaff_x24)(in_stack_00000018);
  (*(code *)*unaff_x24)(in_stack_00000010);
  func_0x00789278();
  return uVar3;
}

