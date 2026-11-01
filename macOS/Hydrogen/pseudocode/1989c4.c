
/* WARNING: Removing unreachable block (ram,0x00198a5c) */
/* WARNING: Removing unreachable block (ram,0x00198a6c) */

undefined1  [16] FUN_001989c4(long param_1)

{
  undefined8 uVar1;
  long unaff_x19;
  undefined1 *unaff_x20;
  int unaff_w21;
  undefined8 uVar2;
  long unaff_x23;
  undefined8 *unaff_x24;
  undefined1 auVar3 [16];
  long lStack0000000000000010;
  
  lStack0000000000000010 = param_1;
  func_0x00192810((long)register0x00000008 + 8,&UNK_009c1ae0);
  *(undefined8 *)(lStack0000000000000010 + unaff_x23 * 8) = 0;
  uVar1 = _AuthorizationExecuteWithPrivileges(*unaff_x24);
  if ((int)uVar1 == 0) {
    if (unaff_w21 == 0) {
      uVar1 = 0xffffffff;
      if (unaff_x23 != 0) {
        func_0x00187bd4(lStack0000000000000010,unaff_x23 << 3,8);
      }
      *unaff_x20 = 0;
      if (unaff_x19 != 0) {
        func_0x00187bd4();
      }
      uVar2 = 0;
      goto LAB_001988fc;
    }
    uVar1 = 0x20;
  }
  if (unaff_x23 != 0) {
    func_0x00187bd4(lStack0000000000000010,unaff_x23 << 3,8);
  }
  *unaff_x20 = 0;
  uVar2 = 1;
  if (unaff_x19 != 0) {
    func_0x00187bd4();
  }
LAB_001988fc:
  auVar3._8_8_ = uVar1;
  auVar3._0_8_ = uVar2;
  return auVar3;
}

