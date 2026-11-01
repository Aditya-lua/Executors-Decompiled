
char FUN_0058612c(void)

{
  char cVar1;
  long unaff_x19;
  undefined8 uVar2;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  
  do {
    if (unaff_x25 == unaff_x24) {
      cVar1 = '\x02';
      if (unaff_x23 == 0) {
        return '\x02';
      }
      goto LAB_00586198;
    }
    uVar2 = *(undefined8 *)(unaff_x19 + unaff_x24);
    cVar1 = func_0x0058a0f4();
    if ((cVar1 != '\x02') || (cVar1 = func_0x00582368(uVar2), cVar1 != '\x02')) break;
    cVar1 = func_0x0058a0f4();
    unaff_x24 = unaff_x24 + 8;
  } while (cVar1 == '\x02');
  if (unaff_x23 != 0) {
LAB_00586198:
    func_0x00187bd4();
  }
  return cVar1;
}

