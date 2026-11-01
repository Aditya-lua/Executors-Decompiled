
char FUN_00585e4c(char param_1)

{
  long unaff_x19;
  undefined8 unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  
  while ((param_1 == '\x02' && (param_1 = func_0x005778c4(unaff_x22), param_1 == '\x02'))) {
    param_1 = func_0x0058a0f4();
    unaff_x24 = unaff_x24 + 8;
    if (param_1 != '\x02') break;
    if (unaff_x25 == unaff_x24) {
      param_1 = '\x02';
      if (unaff_x23 == 0) {
        return '\x02';
      }
      goto code_r0x00585e98;
    }
    unaff_x22 = *(undefined8 *)(unaff_x19 + unaff_x24);
    param_1 = func_0x0058a0f4();
  }
  if (unaff_x23 != 0) {
code_r0x00585e98:
    func_0x00187bd4();
  }
  return param_1;
}

