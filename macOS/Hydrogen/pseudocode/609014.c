
void FUN_00609014(void)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long unaff_x19;
  long unaff_x20;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  
  if (in_stack_00000018 <= in_stack_00000010) {
    in_stack_00000010 = in_stack_00000018;
  }
  if (in_stack_00000020 != 0) {
    if (in_stack_00000010 != 0) {
      do {
        *(undefined8 *)(in_stack_00000020 + -8 + in_stack_00000010 * 8) = 0;
        in_stack_00000010 = in_stack_00000010 - 1;
      } while (in_stack_00000010 != 0);
    }
    func_0x00611644();
  }
  if (*(int *)(unaff_x20 + 0x28) == 1) {
    if ((*(int *)(unaff_x19 + 0x28) != 1) && (**(long **)(unaff_x19 + 0x20) == 0)) {
      lVar2 = *(long *)(unaff_x19 + 0x18);
      do {
        if (lVar2 == 0) {
          return;
        }
        lVar3 = lVar2 + -1;
        lVar1 = lVar2 + -1;
        lVar2 = lVar3;
      } while ((*(long **)(unaff_x19 + 0x20))[lVar1] == 0);
      if ((int)lVar3 == -1) {
        return;
      }
    }
    *(int *)(unaff_x19 + 0x28) = 1 - *(int *)(unaff_x19 + 0x28);
  }
  return;
}

