
void FUN_006323b4(void)

{
  long *plVar1;
  ulong uVar2;
  long *unaff_x19;
  long *unaff_x20;
  long unaff_x25;
  long unaff_x26;
  long lVar3;
  long in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined *in_stack_00000018;
  ulong in_stack_00000028;
  ulong in_stack_00000030;
  long in_stack_00000038;
  ulong in_stack_00000058;
  ulong in_stack_00000060;
  long in_stack_00000068;
  undefined1 in_stack_00000078;
  
  do {
    func_0x00611644();
    do {
      unaff_x25 = unaff_x25 + 1;
      if (unaff_x25 == in_stack_00000008) {
        return;
      }
      plVar1 = (long *)(**(code **)(*unaff_x19 + 0x28))();
      (**(code **)(*plVar1 + 0x58))
                (&uStack0000000000000010,plVar1,unaff_x25 * 0x70 + *unaff_x20 + -0x70);
      lVar3 = *unaff_x20;
      func_0x005ffccc(lVar3 + unaff_x25 * 0x70 + 8);
      func_0x005ffccc(lVar3 + unaff_x25 * unaff_x26 + 0x38);
      *(undefined1 *)(lVar3 + unaff_x25 * unaff_x26 + 0x68) = in_stack_00000078;
      uStack0000000000000010 = &UNK_00a09a40;
      uVar2 = in_stack_00000058;
      if (in_stack_00000060 <= in_stack_00000058) {
        uVar2 = in_stack_00000060;
      }
      if (in_stack_00000068 != 0) {
        if (uVar2 != 0) {
          do {
            *(undefined8 *)(in_stack_00000068 + -8 + uVar2 * 8) = 0;
            uVar2 = uVar2 - 1;
          } while (uVar2 != 0);
        }
        func_0x00611644();
      }
      in_stack_00000018 = &UNK_009f5d60;
      uVar2 = in_stack_00000028;
      if (in_stack_00000030 <= in_stack_00000028) {
        uVar2 = in_stack_00000030;
      }
    } while (in_stack_00000038 == 0);
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000038 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
  } while( true );
}

