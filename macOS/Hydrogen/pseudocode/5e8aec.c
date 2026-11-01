
void FUN_005e8aec(undefined8 *param_1)

{
  ulong uVar1;
  code *pcVar2;
  undefined1 in_ZR;
  ulong in_x9;
  ulong *unaff_x19;
  
  do {
    if ((bool)in_ZR) {
joined_r0x005e8b3c:
      if (cRam0000000000a2a9f0 != '\0') {
        func_0x007a2810(&UNK_008b9ba0,0x2b);
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x5e8b70);
        (*pcVar2)();
      }
      param_1[1] = unaff_x19 + 2;
      param_1[2] = unaff_x19;
      *param_1 = 1;
      return;
    }
    if (((0xffffffffffffffef < in_x9) || (in_x9 == 1)) || (((uint)in_x9 >> 1 & 1) != 0)) {
      func_0x007a18a8(0xa2a9e8,0);
      goto joined_r0x005e8b3c;
    }
    uVar1 = *unaff_x19;
    if (uVar1 == in_x9) {
      *unaff_x19 = (in_x9 | 1) + 0x10;
    }
    in_ZR = uVar1 == in_x9;
    in_x9 = uVar1;
  } while( true );
}

