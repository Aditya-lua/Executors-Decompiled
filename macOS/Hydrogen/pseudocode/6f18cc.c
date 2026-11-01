
void FUN_006f18cc(void)

{
  long unaff_x20;
  undefined1 unaff_w21;
  
  do {
    func_0x006f0d7c();
    do {
      unaff_x20 = *(long *)(unaff_x20 + 0x20);
      if (unaff_x20 == 0) {
        return;
      }
      *(undefined1 *)(unaff_x20 + 3) = unaff_w21;
    } while ((*(byte *)(unaff_x20 + 1) & 3) == 0);
  } while( true );
}

