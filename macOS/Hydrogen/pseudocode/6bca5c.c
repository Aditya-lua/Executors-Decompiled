
void FUN_006bca5c(void)

{
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  long unaff_x26;
  byte unaff_w27;
  long unaff_x29;
  undefined1 uStack0000000000000054;
  undefined1 uStack0000000000000064;
  undefined8 uStack0000000000000080;
  undefined8 in_stack_00000088;
  undefined8 uStack0000000000000090;
  undefined8 in_stack_00000098;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  undefined8 uStack00000000000000b0;
  undefined8 in_stack_000000b8;
  undefined1 uStack00000000000000c0;
  undefined1 uStack0000000000000180;
  
  while( true ) {
    if (((uStack00000000000000c0 >> 2 & 1) != 0) && ((unaff_w27 & 1) == 0)) {
      unaff_w27 = unaff_w27 | 4;
      *(byte *)(unaff_x29 + -0xc1) = unaff_w27;
    }
    unaff_x19 = unaff_x19 + 1;
    if (unaff_x19 == unaff_x20) break;
    uStack00000000000000c0 = 0;
    func_0x006bcbc0(&uStack0000000000000180,*unaff_x19,&uStack00000000000000c0);
  }
  uStack00000000000000b0 = 0;
  in_stack_000000b8 = 0;
  uStack00000000000000a0 = 0;
  in_stack_000000a8 = 0;
  uStack0000000000000090 = 0;
  in_stack_00000098 = 0;
  uStack0000000000000080 = 0;
  in_stack_00000088 = 0;
  uStack0000000000000054 = 0;
  uStack0000000000000064 = 0;
  func_0x00706378(&uStack00000000000000c0,unaff_x21 + 0xc,&uStack00000000000000b0,
                  &uStack00000000000000a0,&uStack0000000000000090,0,&uStack0000000000000080,1);
  func_0x006bcbc0(&uStack0000000000000180,&uStack00000000000000c0,unaff_x29 + -0xc1);
  func_0x006b0e28();
  func_0x006b33ec();
  func_0x006d03d8(&uStack0000000000000180);
  if (*(long *)(unaff_x26 + 0x560) != 0) {
    *(long *)(unaff_x26 + 0x568) = *(long *)(unaff_x26 + 0x560);
    __ZdlPv();
  }
  return;
}

