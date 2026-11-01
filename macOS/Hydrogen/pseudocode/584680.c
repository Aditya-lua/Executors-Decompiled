
void FUN_00584680(long param_1)

{
  long lVar1;
  long unaff_x19;
  long unaff_x29;
  
  do {
    func_0x005d2ac4(param_1 + 0x110);
    do {
      func_0x00582958(unaff_x29 + -0x28);
      if (*(long *)(unaff_x29 + -0x28) == 0) {
        return;
      }
      param_1 = *(long *)(unaff_x29 + -0x28) + *(long *)(unaff_x29 + -0x18) * 8;
      lVar1 = **(long **)(param_1 + 0x110);
      **(long **)(param_1 + 0x110) = lVar1 + unaff_x19;
      LORelease();
    } while (lVar1 != 1);
  } while( true );
}

