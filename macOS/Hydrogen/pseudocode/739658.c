
void FUN_00739658(void)

{
  long lVar1;
  long lVar2;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x24;
  undefined8 *unaff_x25;
  
  do {
    (*(code *)*unaff_x25)(*(undefined8 *)(unaff_x22 + 0x40));
    (*(code *)*unaff_x25)(*(undefined8 *)(unaff_x22 + 0x48));
    (*(code *)*unaff_x25)(unaff_x22);
    *(int *)(unaff_x19 + 0x7e8) = *(int *)(unaff_x19 + 0x7e8) + -1;
    while( true ) {
      lVar1 = unaff_x21;
      if (unaff_x21 == 0) {
        do {
          unaff_x24 = unaff_x24 + 1;
          if (unaff_x24 == 0x3f) {
            return;
          }
          lVar1 = func_0x00740a58(unaff_x19 + unaff_x24 * 0x20);
        } while (lVar1 == 0);
      }
      unaff_x22 = func_0x00156654(lVar1);
      unaff_x21 = func_0x006f4058(lVar1);
      lVar2 = *(long *)(unaff_x22 + 0x68);
      if (lVar2 != 0 && lVar2 < unaff_x20) break;
      if ((lVar2 != 0) && (lVar2 < *(long *)(unaff_x19 + 0x7e0))) {
        *(long *)(unaff_x19 + 0x7e0) = lVar2;
      }
    }
    func_0x0075e5fc(lVar1);
    (*(code *)*unaff_x25)(*(undefined8 *)(unaff_x22 + 0x60));
    (*(code *)*unaff_x25)(*(undefined8 *)(unaff_x22 + 0x50));
    (*(code *)*unaff_x25)(*(undefined8 *)(unaff_x22 + 0x58));
  } while( true );
}

