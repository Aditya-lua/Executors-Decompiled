
void FUN_000dd704(long param_1)

{
  uint in_w9;
  ulong in_x10;
  char *in_x11;
  long in_x12;
  
  for (; in_x10 != 0xffffffffffffffff; in_x10 = in_x10 - 1) {
    if ((((1 < in_x10) && ((byte)in_x11[-1] == 0x23)) && (*in_x11 == '#')) && (in_x11[1] == '#')) {
      in_w9 = 0xffffffff;
    }
    in_w9 = *(uint *)(in_x12 + (ulong)(in_w9 & 0xff ^ (uint)(byte)in_x11[-1]) * 4) ^ in_w9 >> 8;
    in_x11 = in_x11 + 1;
  }
  *(uint *)(param_1 + 4) = ~in_w9;
  _memcpy(param_1 + 0x14);
  return;
}

