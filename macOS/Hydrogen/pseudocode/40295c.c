
void FUN_0040295c(void)

{
  undefined8 *puVar1;
  long lVar2;
  long *plVar3;
  long *unaff_x21;
  long unaff_x23;
  long unaff_x24;
  undefined8 unaff_x25;
  undefined2 unaff_w26;
  long unaff_x27;
  long unaff_x28;
  long in_stack_00000008;
  
  _memmove();
  puVar1 = (undefined8 *)*unaff_x21;
  *puVar1 = unaff_x25;
  *(undefined2 *)(puVar1 + 0x43) = unaff_w26;
  if (unaff_x28 != 1) {
    puVar1 = *(undefined8 **)(unaff_x23 + (in_stack_00000008 + 2) * 8);
    *puVar1 = unaff_x25;
    *(short *)(puVar1 + 0x43) = (short)(in_stack_00000008 + 2);
    if (unaff_x28 != 2) {
      puVar1 = *(undefined8 **)(unaff_x23 + (in_stack_00000008 + 3) * 8);
      *puVar1 = unaff_x25;
      *(short *)(puVar1 + 0x43) = (short)(in_stack_00000008 + 3);
      if (unaff_x28 != 3) {
        puVar1 = *(undefined8 **)(unaff_x23 + (in_stack_00000008 + 4) * 8);
        *puVar1 = unaff_x25;
        *(short *)(puVar1 + 0x43) = (short)(in_stack_00000008 + 4);
        if (unaff_x28 != 4) {
          puVar1 = *(undefined8 **)(unaff_x23 + (in_stack_00000008 + 5) * 8);
          *puVar1 = unaff_x25;
          *(short *)(puVar1 + 0x43) = (short)(in_stack_00000008 + 5);
        }
      }
    }
  }
  lVar2 = 0;
  do {
    plVar3 = *(long **)(unaff_x24 + lVar2 * 8 + 0x220);
    *(short *)(plVar3 + 0x43) = (short)lVar2;
    lVar2 = lVar2 + 1;
    *plVar3 = unaff_x24;
  } while (unaff_x27 + 1 != lVar2);
  return;
}

