
void FUN_00059e04(code *param_1)

{
  long extraout_x9;
  long unaff_x19;
  long *unaff_x20;
  long in_stack_00000000;
  long in_stack_00000018;
  
  do {
    (*param_1)();
    *(undefined8 *)(unaff_x19 + 0x18) = 0;
    unaff_x20[3] = (long)unaff_x20;
    (**(code **)(in_stack_00000000 + 0x18))();
    (**(code **)(in_stack_00000000 + 0x20))();
    while( true ) {
      *(long *)(unaff_x19 + 0x18) = unaff_x19;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000018) {
        return;
      }
      ___stack_chk_fail();
      if (extraout_x9 == unaff_x19) break;
      (**(code **)(*unaff_x20 + 0x18))();
      (**(code **)(*(long *)unaff_x20[3] + 0x20))();
      unaff_x20[3] = *(long *)(unaff_x19 + 0x18);
    }
    (**(code **)(*unaff_x20 + 0x18))();
    (**(code **)(*(long *)unaff_x20[3] + 0x20))();
    unaff_x20[3] = 0;
    (**(code **)(**(long **)(unaff_x19 + 0x18) + 0x18))();
    param_1 = *(code **)(**(long **)(unaff_x19 + 0x18) + 0x20);
  } while( true );
}

