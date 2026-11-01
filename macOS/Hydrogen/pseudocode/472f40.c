
void FUN_00472f40(undefined1 *param_1,byte *param_2,long param_3)

{
  long lVar1;
  long in_x9;
  long in_x10;
  uint in_w11;
  undefined1 uVar2;
  
  do {
    lVar1 = in_x9 + (ulong)in_w11;
    param_3 = param_3 + -1;
    if (SCARRY8(in_x9,(ulong)in_w11)) break;
    if (param_3 == 0) {
      if (lVar1 != 0) {
        uVar2 = 0;
        *(long *)(param_1 + 8) = lVar1;
        goto code_r0x00472fa8;
      }
      param_1[1] = 4;
      goto code_r0x00472fa4;
    }
    in_x9 = lVar1 * 10;
    in_w11 = *param_2 - 0x30;
    if (9 < in_w11) {
      uVar2 = 1;
      goto LAB_00472fa0;
    }
    param_2 = param_2 + 1;
  } while (SUB168(SEXT816(lVar1) * SEXT816(in_x10),8) == in_x9 >> 0x3f);
  uVar2 = 2;
LAB_00472fa0:
  param_1[1] = uVar2;
code_r0x00472fa4:
  uVar2 = 1;
code_r0x00472fa8:
  *param_1 = uVar2;
  return;
}

