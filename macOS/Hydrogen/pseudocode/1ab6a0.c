
void FUN_001ab6a0(undefined8 *param_1)

{
  byte bVar1;
  undefined8 *unaff_x19;
  long unaff_x21;
  long unaff_x22;
  long lVar2;
  long unaff_x23;
  long unaff_x24;
  byte unaff_w25;
  byte unaff_w26;
  byte unaff_w27;
  byte unaff_w28;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  do {
    func_0x001d8c88(param_1);
    lVar2 = unaff_x23;
    do {
      *(byte *)(in_stack_00000010 + unaff_x21) = unaff_w28;
      ((byte *)(in_stack_00000010 + unaff_x21))[1] = unaff_w27;
      unaff_x23 = lVar2 + 1;
      unaff_x21 = unaff_x21 + 2;
      if (lVar2 == unaff_x24) {
        unaff_x19[2] = in_stack_00000010;
        unaff_x19[1] = uStack0000000000000008;
        unaff_x19[3] = unaff_x23;
        *unaff_x19 = 0;
        return;
      }
      unaff_w27 = *(byte *)(unaff_x22 + unaff_x23);
      bVar1 = unaff_w26;
      if (unaff_w27 != 0x40) {
        bVar1 = unaff_w25;
      }
      unaff_w28 = unaff_w27;
      if (1 < unaff_w27) {
        unaff_w28 = bVar1;
      }
      lVar2 = unaff_x23;
    } while (unaff_x23 != uStack0000000000000008);
    param_1 = &uStack0000000000000008;
    in_stack_00000018 = unaff_x23;
  } while( true );
}

