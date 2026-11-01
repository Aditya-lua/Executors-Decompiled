
undefined8 FUN_0066f764(long param_1,undefined8 param_2,long param_3)

{
  long lVar1;
  ulong uVar2;
  ulong in_x9;
  long unaff_x22;
  
  do {
    lVar1 = *(long *)(unaff_x22 + 0xf8);
    if (param_3 + in_x9 != *(long *)(unaff_x22 + 0xf8) + *(long *)(unaff_x22 + 0xf0)) {
      lVar1 = param_3 + in_x9;
    }
    *(long *)(unaff_x22 + 0x110) = param_1;
    *(long *)(unaff_x22 + 0x118) = lVar1;
    do {
      (**(code **)(*(long *)(unaff_x22 + 0x90) + 0x1e0))();
      uVar2 = *(ulong *)(unaff_x22 + 0x110);
      if (uVar2 < *(ulong *)(unaff_x22 + 200)) {
        func_0x0066bbc8();
        return 0;
      }
      in_x9 = *(ulong *)(unaff_x22 + 0x100);
      param_1 = uVar2 - in_x9;
    } while (uVar2 < in_x9);
    param_3 = *(long *)(unaff_x22 + 0x118);
  } while( true );
}

