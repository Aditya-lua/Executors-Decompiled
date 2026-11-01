
/* WARNING: Removing unreachable block (ram,0x006d0934) */

void FUN_006d0918(long param_1)

{
  bool in_ZR;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  if (!in_ZR) {
    do {
      unaff_x21 = unaff_x21 + -0x20;
    } while (unaff_x21 != unaff_x20);
    param_1 = unaff_x19[0x44];
  }
  unaff_x19[0x45] = unaff_x20;
  __ZdlPv(param_1);
  if (unaff_x19[0x41] != 0) {
    unaff_x19[0x42] = unaff_x19[0x41];
    __ZdlPv();
  }
  if (unaff_x19[0x3e] != 0) {
    unaff_x19[0x3f] = unaff_x19[0x3e];
    __ZdlPv();
  }
  if (unaff_x19[0x3b] != 0) {
    unaff_x19[0x3c] = unaff_x19[0x3b];
    __ZdlPv();
  }
  if (unaff_x19[0x38] != 0) {
    unaff_x19[0x39] = unaff_x19[0x38];
    __ZdlPv();
  }
  if (unaff_x19[0x33] != 0) {
    __ZdlPv();
    unaff_x19[0x33] = 0;
    unaff_x19[0x34] = 0;
  }
  if (unaff_x19[0x1f] != 0) {
    __ZdlPv();
    unaff_x19[0x1f] = 0;
    unaff_x19[0x20] = 0;
  }
  if (unaff_x19[0x18] != 0) {
    __ZdlPv();
    unaff_x19[0x18] = 0;
    unaff_x19[0x19] = 0;
  }
  if (unaff_x19[0x14] != 0) {
    unaff_x19[0x15] = unaff_x19[0x14];
    __ZdlPv();
  }
  if (unaff_x19[0x11] != 0) {
    unaff_x19[0x12] = unaff_x19[0x11];
    __ZdlPv();
  }
  if (unaff_x19[0xe] != 0) {
    unaff_x19[0xf] = unaff_x19[0xe];
    __ZdlPv();
  }
  if (unaff_x19[0xb] != 0) {
    unaff_x19[0xc] = unaff_x19[0xb];
    __ZdlPv();
  }
  if (unaff_x19[8] != 0) {
    unaff_x19[9] = unaff_x19[8];
    __ZdlPv();
  }
  if (unaff_x19[5] != 0) {
    unaff_x19[6] = unaff_x19[5];
    __ZdlPv();
  }
  if (*unaff_x19 != 0) {
    func_0x006b72a4();
    __ZdlPv(*unaff_x19);
  }
  return;
}

