
byte * FUN_0073abe8(byte *param_1,byte *param_2)

{
  uint in_w9;
  
  do {
    if (*param_2 == in_w9) {
      return param_2;
    }
    param_2 = param_2 + -1;
  } while (param_1 <= param_2);
  return (byte *)0x0;
}

