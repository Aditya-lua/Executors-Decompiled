
undefined8 FUN_0066f768(long param_1)

{
  long lVar1;
  ulong uVar2;
  long in_x9;
  ulong uVar3;
  long unaff_x22;
  
  do {
    lVar1 = *(long *)(unaff_x22 + 0xf8);
    if (in_x9 != *(long *)(unaff_x22 + 0xf8) + *(long *)(unaff_x22 + 0xf0)) {
      lVar1 = in_x9;
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
      uVar3 = *(ulong *)(unaff_x22 + 0x100);
      param_1 = uVar2 - uVar3;
    } while (uVar2 < uVar3);
    in_x9 = *(long *)(unaff_x22 + 0x118) + uVar3;
  } while( true );
}

