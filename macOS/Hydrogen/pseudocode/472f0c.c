
void FUN_00472f0c(undefined1 *param_1,byte *param_2,long param_3)

{
  uint uVar1;
  long lVar2;
  long lVar3;
  undefined1 uVar4;
  
  lVar2 = 0;
  do {
    if (param_3 == 0) {
      if (lVar2 != 0) {
        uVar4 = 0;
        *(long *)(param_1 + 8) = lVar2;
        goto code_r0x00472fa8;
      }
      param_1[1] = 4;
      goto code_r0x00472fa4;
    }
    lVar3 = lVar2 * 10;
    uVar1 = *param_2 - 0x30;
    if (9 < uVar1) {
      uVar4 = 1;
      goto LAB_00472fa0;
    }
    if (SUB168(SEXT816(lVar2) * SEXT816(10),8) != lVar3 >> 0x3f) break;
    lVar2 = lVar3 + (ulong)uVar1;
    param_3 = param_3 + -1;
    param_2 = param_2 + 1;
  } while (!SCARRY8(lVar3,(ulong)uVar1));
  uVar4 = 2;
LAB_00472fa0:
  param_1[1] = uVar4;
code_r0x00472fa4:
  uVar4 = 1;
code_r0x00472fa8:
  *param_1 = uVar4;
  return;
}

