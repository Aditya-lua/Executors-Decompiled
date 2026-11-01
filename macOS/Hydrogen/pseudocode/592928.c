
void FUN_00592928(void)

{
  long lVar1;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x22;
  
  do {
    func_0x005d2ac4(unaff_x21);
    do {
      unaff_x21 = unaff_x21 + 1;
      unaff_x20 = unaff_x20 + 1;
      if (unaff_x20 == 1) {
        if (unaff_x19[2] == 0) {
          return;
        }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR__free_00a24e58)(*unaff_x19,unaff_x19[2] << 3,8);
        return;
      }
      lVar1 = *(long *)*unaff_x21;
      *(long *)*unaff_x21 = lVar1 + unaff_x22;
      LORelease();
    } while (lVar1 != 1);
  } while( true );
}

