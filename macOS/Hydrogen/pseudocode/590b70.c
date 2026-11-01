
void FUN_00590b70(void)

{
  long lVar1;
  long *plVar2;
  undefined8 *puVar3;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  do {
    func_0x005d2ac4(unaff_x19);
    puVar3 = unaff_x19;
    do {
      do {
        unaff_x19 = puVar3 + 1;
        unaff_x20 = unaff_x20 + -1;
        if (unaff_x20 == 0) {
          func_0x007a2668();
          unaff_x19 = puVar3 + 2;
          unaff_x20 = 0;
          unaff_x21 = -1;
        }
        plVar2 = (long *)*unaff_x19;
        puVar3 = unaff_x19;
      } while (plVar2 == (long *)0x0);
      lVar1 = *plVar2;
      *plVar2 = lVar1 + unaff_x21;
      LORelease();
    } while (lVar1 != 1);
  } while( true );
}

