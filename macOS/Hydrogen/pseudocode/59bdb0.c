
undefined8 FUN_0059bdb0(void)

{
  undefined8 uVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 uStack0000000000000008;
  undefined8 *in_stack_00000010;
  long in_stack_00000018;
  
  while ((lVar2 = unaff_x19[0xb], lVar2 != 0 && (lVar2 != unaff_x19[0xc]))) {
    unaff_x19[0xb] = lVar2 + 0x40;
    func_0x005a57fc(&uStack0000000000000008);
    if (uStack0000000000000008 == -0x8000000000000000) break;
    unaff_x19[3] = in_stack_00000010;
    unaff_x19[4] = in_stack_00000010;
    unaff_x19[5] = uStack0000000000000008;
    unaff_x19[6] = in_stack_00000010 + in_stack_00000018;
    if (in_stack_00000010 != in_stack_00000010 + in_stack_00000018) {
      uVar1 = *in_stack_00000010;
      unaff_x19[4] = in_stack_00000010 + 1;
      return uVar1;
    }
    if (unaff_x19[5] != 0) {
      func_0x00187bd4(in_stack_00000010,unaff_x19[5] << 3,8);
    }
    unaff_x19[3] = 0;
  }
  if (unaff_x19[7] != 0) {
    puVar3 = (undefined8 *)unaff_x19[8];
    if (puVar3 != (undefined8 *)unaff_x19[10]) {
      uVar1 = *puVar3;
      unaff_x19[8] = puVar3 + 1;
      return uVar1;
    }
    if (unaff_x19[9] != 0) {
      func_0x00187bd4(unaff_x19[7],unaff_x19[9] << 3,8);
    }
    unaff_x19[7] = 0;
  }
  if (unaff_x20 != 0) {
    if ((unaff_x19[3] != 0) && (unaff_x19[5] != 0)) {
      func_0x00187bd4(unaff_x19[3],unaff_x19[5] << 3,8);
    }
    if ((unaff_x19[7] != 0) && (unaff_x19[9] != 0)) {
      func_0x00187bd4(unaff_x19[7],unaff_x19[9] << 3,8);
    }
  }
  *unaff_x19 = 2;
  if ((unaff_x19[0xd] == 0) ||
     (puVar3 = (undefined8 *)unaff_x19[0xe], puVar3 == (undefined8 *)unaff_x19[0x10])) {
    uVar1 = 0;
  }
  else {
    uVar1 = *puVar3;
    unaff_x19[0xe] = puVar3 + 1;
  }
  return uVar1;
}

