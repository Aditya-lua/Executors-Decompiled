
void FUN_001a89f8(long param_1)

{
  long *plVar1;
  undefined8 *unaff_x19;
  long lVar2;
  undefined8 *puVar3;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  ulong in_stack_00000008;
  ulong in_stack_00000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long lStack0000000000000028;
  long in_stack_00000030;
  long in_stack_00000038;
  undefined8 uStack0000000000000040;
  long in_stack_00000048;
  
  while( true ) {
    plVar1 = (long *)(param_1 + unaff_x25 * 0x20);
    *plVar1 = unaff_x22;
    plVar1[1] = unaff_x21;
    plVar1[3] = in_stack_00000038;
    plVar1[2] = in_stack_00000030;
    lStack0000000000000028 = unaff_x25 + 1;
    if (in_stack_00000008 <= in_stack_00000010) {
      unaff_x19[2] = in_stack_00000020;
      unaff_x19[1] = uStack0000000000000018;
      unaff_x19[3] = lStack0000000000000028;
      *unaff_x19 = 0;
      return;
    }
    __ZN92__LT_rustls__msgs__handshake__PresharedKeyIdentity_u20_as_u20_rustls__msgs__codec__Codec_GT_4read17h50702aea4a62554fE
              (&uStack0000000000000040);
    unaff_x21 = in_stack_00000048;
    unaff_x22 = uStack0000000000000040;
    unaff_x25 = lStack0000000000000028;
    in_stack_00000038 = *(long *)(unaff_x23 + 0x18);
    in_stack_00000030 = *(long *)(unaff_x23 + 0x10);
    if (uStack0000000000000040 == unaff_x24) break;
    if (lStack0000000000000028 == uStack0000000000000018) {
      func_0x001d8840(&uStack0000000000000018);
    }
    param_1 = in_stack_00000020;
  }
  unaff_x19[3] = in_stack_00000038;
  unaff_x19[2] = in_stack_00000030;
  *unaff_x19 = 1;
  unaff_x19[1] = in_stack_00000048;
  if (lStack0000000000000028 != 0) {
    puVar3 = (undefined8 *)(in_stack_00000020 + 8);
    lVar2 = lStack0000000000000028;
    do {
      if (puVar3[-1] != 0) {
        func_0x00187bd4(*puVar3,puVar3[-1],1);
      }
      puVar3 = puVar3 + 4;
      lVar2 = lVar2 + -1;
    } while (lVar2 != 0);
  }
  if (uStack0000000000000018 == 0) {
    return;
  }
  func_0x00187bd4(in_stack_00000020,uStack0000000000000018 << 5,8);
  return;
}

