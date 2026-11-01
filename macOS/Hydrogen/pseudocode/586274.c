
char FUN_00586274(void)

{
  char cVar1;
  long unaff_x19;
  undefined8 uVar2;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  
  while( true ) {
    cVar1 = func_0x0058a0f4();
    unaff_x24 = unaff_x24 + 8;
    if (cVar1 != '\x02') break;
    if (unaff_x25 == unaff_x24) {
      cVar1 = '\x02';
      if (unaff_x23 == 0) {
        return '\x02';
      }
      goto code_r0x00586298;
    }
    uVar2 = *(undefined8 *)(unaff_x19 + unaff_x24);
    cVar1 = func_0x0058a0f4();
    if ((cVar1 != '\x02') || (cVar1 = func_0x005778c4(uVar2), cVar1 != '\x02')) break;
  }
  if (unaff_x23 != 0) {
code_r0x00586298:
    func_0x00187bd4();
  }
  return cVar1;
}

