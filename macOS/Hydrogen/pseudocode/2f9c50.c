
undefined8 FUN_002f9c50(void)

{
  int iVar1;
  uint uVar2;
  code *pcVar3;
  undefined4 *unaff_x19;
  undefined8 uVar4;
  long *unaff_x20;
  ulong in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000018;
  
  iVar1 = func_0x002f9804();
  if (iVar1 != 0) {
    if ((*unaff_x20 == 0) || (pcVar3 = *(code **)(*unaff_x20 + 0x28), pcVar3 == (code *)0x0)) {
      iVar1 = func_0x002fba2c();
      if (iVar1 != 0) goto LAB_002f9cbc;
    }
    else {
      uVar2 = (*pcVar3)();
      in_stack_00000000 = (ulong)(uVar2 & ((int)uVar2 >> 0x1f ^ 0xffffffffU));
      if (-1 < (int)uVar2) {
LAB_002f9cbc:
        if (in_stack_00000000 >> 0x20 == 0) {
          *unaff_x19 = (int)in_stack_00000000;
          uVar4 = 1;
          goto joined_r0x002f9d10;
        }
        func_0x0028f83c(4,0,0x45,"/aws-lc/crypto/fipsmodule/rsa/rsa.c",0x367);
      }
    }
  }
  uVar4 = 0;
joined_r0x002f9d10:
  if (in_stack_00000008._4_4_ != 0) {
    func_0x0036e3d8(in_stack_00000018);
  }
  return uVar4;
}

