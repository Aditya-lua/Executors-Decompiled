
bool FUN_000558f8(void)

{
  bool bVar1;
  uint in_w8;
  char *in_x9;
  char *in_x10;
  char *in_x11;
  char *pcVar2;
  char *in_x12;
  char *in_x13;
  
code_r0x000558f8:
  pcVar2 = in_x11;
  if (in_x12 == in_x10) {
LAB_00055918:
    bVar1 = pcVar2 != in_x10 && pcVar2 == in_x9;
    if ((in_w8 >> 7 & 1) == 0) {
      return bVar1;
    }
    __ZdlPv();
    return bVar1;
  }
  pcVar2 = in_x12 + -7;
  if (*in_x12 != '/') {
    pcVar2 = in_x11;
  }
  in_x12 = in_x13 + 7;
  do {
    in_x13 = in_x12 + -6;
    if (in_x12[-7] == 'h') {
      if (in_x13 == in_x10) goto LAB_00055918;
      if (*in_x13 == 't') {
        if (in_x12 + -5 == in_x10) goto LAB_00055918;
        if (in_x12[-5] == 't') {
          if (in_x12 + -4 == in_x10) goto LAB_00055918;
          if (in_x12[-4] == 'p') {
            if (in_x12 + -3 == in_x10) goto LAB_00055918;
            if (in_x12[-3] == 's') {
              if (in_x12 + -2 == in_x10) goto LAB_00055918;
              if (in_x12[-2] == ':') {
                if (in_x12 + -1 == in_x10) goto LAB_00055918;
                in_x11 = pcVar2;
                if (in_x12[-1] == '/') goto code_r0x000558f8;
              }
            }
          }
        }
      }
    }
    else if (in_x13 == in_x10) goto LAB_00055918;
    in_x12 = in_x12 + 1;
  } while( true );
}

