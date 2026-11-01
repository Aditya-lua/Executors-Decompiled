
void FUN_00472f28(undefined1 *param_1,byte *param_2,long param_3)

{
  long lVar1;
  uint uVar2;
  long in_x9;
  long in_x10;
  uint in_w11;
  undefined1 uVar3;
  long in_x12;
  
  do {
    uVar2 = in_w11 - 0x30;
    if (9 < uVar2) {
      uVar3 = 1;
LAB_00472fa0:
      param_1[1] = uVar3;
code_r0x00472fa4:
      uVar3 = 1;
code_r0x00472fa8:
      *param_1 = uVar3;
      return;
    }
    if (in_x12 != in_x9 >> 0x3f) {
LAB_00472f4c:
      uVar3 = 2;
      goto LAB_00472fa0;
    }
    lVar1 = in_x9 + (ulong)uVar2;
    param_3 = param_3 + -1;
    if (SCARRY8(in_x9,(ulong)uVar2)) goto LAB_00472f4c;
    if (param_3 == 0) {
      if (lVar1 != 0) {
        uVar3 = 0;
        *(long *)(param_1 + 8) = lVar1;
        goto code_r0x00472fa8;
      }
      param_1[1] = 4;
      goto code_r0x00472fa4;
    }
    in_w11 = (uint)*param_2;
    in_x12 = SUB168(SEXT816(lVar1) * SEXT816(in_x10),8);
    in_x9 = lVar1 * 10;
    param_2 = param_2 + 1;
  } while( true );
}

