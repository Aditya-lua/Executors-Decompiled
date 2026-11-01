
void FUN_00472f7c(undefined1 *param_1)

{
  long lVar1;
  long in_x9;
  long in_x10;
  byte *in_x11;
  undefined1 uVar2;
  uint in_w12;
  long in_x13;
  byte in_w14;
  
  do {
    if (9 < in_w12) {
      uVar2 = 1;
LAB_00472fa0:
      param_1[1] = uVar2;
code_r0x00472fa4:
      uVar2 = 1;
code_r0x00472fa8:
      *param_1 = uVar2;
      return;
    }
    if ((in_w14 & 1) != 0) {
      uVar2 = 3;
      goto LAB_00472fa0;
    }
    lVar1 = in_x9 - (ulong)in_w12;
    in_x10 = in_x10 + -1;
    uVar2 = 3;
    if (SBORROW8(in_x9,(ulong)in_w12)) goto LAB_00472fa0;
    if (in_x10 == 0) {
      if (lVar1 == 0) {
        param_1[1] = 4;
        goto code_r0x00472fa4;
      }
      uVar2 = 0;
      *(long *)(param_1 + 8) = lVar1;
      goto code_r0x00472fa8;
    }
    in_x9 = lVar1 * 10;
    in_w14 = SUB168(SEXT816(lVar1) * SEXT816(in_x13),8) != in_x9 >> 0x3f;
    in_w12 = *in_x11 - 0x30;
    in_x11 = in_x11 + 1;
  } while( true );
}

