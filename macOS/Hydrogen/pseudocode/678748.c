
void FUN_00678748(long param_1,undefined8 param_2,long param_3)

{
  ulong *puVar1;
  ulong uVar2;
  ulong unaff_x19;
  ulong unaff_x21;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  ulong unaff_x27;
  long unaff_x28;
  long in_stack_00000000;
  ulong in_stack_00000008;
  
code_r0x00678748:
  _memcpy(param_1,unaff_x23,param_3);
  param_1 = unaff_x25;
  do {
    if (unaff_x21 != 0) {
      do {
        *(undefined8 *)(unaff_x23 + -8 + unaff_x21 * 8) = 0;
        unaff_x21 = unaff_x21 - 1;
      } while (unaff_x21 != 0);
    }
    func_0x00611644(unaff_x23);
    do {
      *(long *)(unaff_x28 + 0x18) = param_1;
      _bzero(param_1 + *(long *)(unaff_x28 + 0x10) * 8,(unaff_x24 - *(long *)(unaff_x28 + 0x10)) * 8
            );
      unaff_x23 = *(long *)(unaff_x28 + 0x18);
      *(ulong *)(unaff_x28 + 0x10) = unaff_x24;
      do {
        *(undefined8 *)(unaff_x28 + 8) = 0x1fffffffffffffff;
        *(ulong *)(unaff_x23 + unaff_x19 * 8) =
             *(ulong *)(unaff_x23 + unaff_x19 * 8) | 1L << (unaff_x26 & 0x3f);
        uVar2 = unaff_x26;
        do {
          unaff_x26 = uVar2 - 1;
          if ((long)uVar2 < 1) {
            return;
          }
          func_0x00677bc4();
          unaff_x19 = unaff_x26 >> 6;
          if (unaff_x19 < *(ulong *)(in_stack_00000000 + 0x10)) {
            uVar2 = *(ulong *)(*(long *)(in_stack_00000000 + 0x18) + unaff_x19 * 8) >>
                    (unaff_x26 & 0x3f) & 1;
          }
          else {
            uVar2 = 0;
          }
          puVar1 = *(ulong **)(unaff_x22 + 0x18);
          *puVar1 = *puVar1 | uVar2;
          uVar2 = unaff_x26;
        } while ((*(ulong *)(unaff_x22 + 0x10) <= unaff_x27) ||
                ((puVar1[unaff_x27] & in_stack_00000008) == 0));
        func_0x00677320();
        unaff_x21 = *(ulong *)(unaff_x28 + 0x10);
        unaff_x23 = *(long *)(unaff_x28 + 0x18);
      } while (unaff_x19 < unaff_x21);
      unaff_x24 = unaff_x19 + 1;
      func_0x006108a0(unaff_x24);
      param_1 = func_0x006115d0(unaff_x24 * 8);
      if ((unaff_x23 != 0) && (param_1 != 0)) {
        uVar2 = unaff_x24;
        if (unaff_x21 <= unaff_x24) {
          uVar2 = unaff_x21;
        }
        param_3 = uVar2 << 3;
        unaff_x25 = param_1;
        goto code_r0x00678748;
      }
    } while (unaff_x23 == 0);
  } while( true );
}

