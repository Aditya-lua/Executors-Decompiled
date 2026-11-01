
void FUN_002755d0(undefined1 *param_1,undefined8 param_2,undefined8 param_3,byte param_4,
                 long param_5,ulong param_6)

{
  ulong uVar1;
  code *pcVar2;
  bool in_ZR;
  undefined *puVar3;
  ulong in_x9;
  char *unaff_x19;
  byte *unaff_x20;
  long lVar4;
  char cStack0000000000000000;
  
  if (in_ZR) {
LAB_002755d4:
    func_0x0027b110();
    return;
  }
  if (in_x9 == 0) {
    func_0x007a2d58(&UNK_009cc970);
  }
  else {
    uVar1 = 0;
    if (in_x9 != 0) {
      uVar1 = param_6 / in_x9;
    }
    if (param_6 != uVar1 * in_x9) {
      *param_1 = 2;
      if ((*unaff_x20 & 1) == 0) {
        unaff_x20[1] = 0;
        unaff_x20[2] = 0;
        unaff_x20[3] = 0;
        unaff_x20[4] = 0;
        unaff_x20[5] = 0;
        unaff_x20[6] = 0;
        unaff_x20[7] = 0;
        unaff_x20[8] = 0;
        unaff_x20[9] = 0;
        unaff_x20[10] = 0;
        unaff_x20[0xb] = 0;
        unaff_x20[0xc] = 0;
        unaff_x20[0xd] = 0;
        unaff_x20[0xe] = 0;
        unaff_x20[0xf] = 0;
        unaff_x20[0x10] = 0;
        return;
      }
      return;
    }
    if (param_4 < 2) {
      if (param_4 == 0) {
        func_0x0027ae64();
        return;
      }
      func_0x0027ab88();
      return;
    }
    if (param_4 == 2) goto LAB_002755d4;
    cStack0000000000000000 = (char)*(undefined8 *)unaff_x20;
    if (cStack0000000000000000 == '\x01') {
      if (*unaff_x19 != '\x03') {
        if ((param_6 & 0xfffffffffffffff0) != 0) {
          lVar4 = -(param_6 & 0xfffffffffffffff0);
          do {
            func_0x002998c0(param_5,param_5,unaff_x19 + 4,1);
            lVar4 = lVar4 + 0x10;
            param_5 = param_5 + 0x10;
          } while (lVar4 != 0);
        }
        *param_1 = 1;
        return;
      }
      puVar3 = &UNK_009cda40;
    }
    else {
      puVar3 = &UNK_009cda58;
    }
    func_0x007a247c(&UNK_0082e2a6,0x28,puVar3);
  }
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x275758);
  (*pcVar2)();
}

