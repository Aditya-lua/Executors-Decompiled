
int FUN_001288dc(void)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  ulong uVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  uint unaff_w19;
  long unaff_x20;
  undefined8 unaff_x21;
  int unaff_w22;
  int *unaff_x23;
  int unaff_w24;
  undefined8 uVar7;
  long unaff_x27;
  long unaff_x28;
  undefined8 in_stack_00000018;
  int iStack0000000000000020;
  int iStack0000000000000028;
  undefined1 *in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000048;
  char in_stack_00000050;
  char in_stack_00000058;
  undefined1 uStack0000000000000060;
  
  func_0x00128004();
  uVar7 = *(undefined8 *)(unaff_x28 + 0x2a8);
  if (in_stack_00000050 == '\0' && in_stack_00000058 == '\0') {
    if (unaff_w24 == 0) {
      uVar5 = 0x21;
      uVar6 = 0x24;
    }
    else {
      uVar5 = 0x23;
      uVar6 = 0x25;
    }
    if ((_iStack0000000000000020 & 0x20000000000000) != 0) {
      uVar6 = uVar5;
    }
  }
  else {
    uVar6 = 0x22;
  }
  func_0x000bba44(0x3f800000,uVar6);
  func_0x00128c4c(uVar7,&uStack0000000000000060);
  func_0x000bd308(&uStack0000000000000060);
  iVar3 = func_0x000c2648(0x20);
  if (iVar3 != 0) {
    uVar4 = func_0x000cfd38(1,0);
    if ((uVar4 & 1) == 0) {
      uVar4 = func_0x000d6f58(1);
      if (((unaff_w19 >> 0x15 & 1) != 0) || ((uVar4 & 1) == 0)) goto LAB_001289f4;
    }
    else if ((unaff_w19 >> 0x15 & 1) != 0) goto LAB_001289f4;
    *(int *)(unaff_x20 + 0x1c) = *unaff_x23;
  }
LAB_001289f4:
  uVar1 = *(uint *)(unaff_x20 + 0x10);
  if (in_stack_00000030 != (undefined1 *)0x0) {
    func_0x000d5210("#CLOSE",0);
  }
  uVar2 = unaff_w19 & 0xfffffffe;
  if (iStack0000000000000028 == 0) {
    uVar2 = unaff_w19;
  }
  func_0x00128ffc(*(undefined4 *)(unaff_x20 + 0x80),*(undefined4 *)(unaff_x20 + 0x84),uVar7,
                  &uStack0000000000000060,uVar1 >> 1 & 4 | uVar2,in_stack_00000038);
  if ((in_stack_00000030 != (undefined1 *)0x0) && (in_stack_00000048._7_1_ != '\0')) {
    *in_stack_00000030 = 0;
    if (((uint)unaff_x23[1] >> 0x15 & 1) == 0) {
      if ((unaff_x23[1] & 0x101U) == 0) {
        *(undefined1 *)(unaff_x23 + 10) = 1;
        if (*(int *)(unaff_x20 + 0x20) == *unaff_x23) {
          unaff_x23[2] = -1;
          *(undefined8 *)(unaff_x20 + 0x18) = 0;
        }
      }
      else if (*(int *)(unaff_x20 + 0x20) != *unaff_x23) {
        *(int *)(unaff_x20 + 0x1c) = *unaff_x23;
      }
    }
  }
  if (iStack0000000000000020 != 0) {
    func_0x000cdeec();
  }
  *(undefined8 *)(unaff_x28 + 0x110) = unaff_x21;
  if ((((in_stack_00000048._6_1_ != '\0') && (*(int *)(&UNK_00004050 + unaff_x27) == unaff_w22)) &&
      (in_stack_00000050 == '\0')) &&
     (((*(byte *)(unaff_x20 + 0x10) >> 5 & 1) == 0 && ((*(byte *)(unaff_x23 + 1) >> 4 & 1) == 0))))
  {
    func_0x000bc0e8(in_stack_00000038,0);
    func_0x000d9148("%.*s");
  }
  if ((_iStack0000000000000028 & 0x20000000000000) != 0) {
    unaff_w24 = in_stack_00000018._4_4_;
  }
  return unaff_w24;
}

