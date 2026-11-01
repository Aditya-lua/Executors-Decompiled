
void FUN_00472738(undefined1 *param_1,byte *param_2,long param_3)

{
  uint uVar1;
  undefined1 auVar2 [16];
  bool in_ZR;
  int in_w9;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  undefined1 uVar6;
  
  if ((in_ZR) || (in_w9 == 0x2d)) {
LAB_0047282c:
    param_1[1] = (char)param_3;
  }
  else {
    uVar3 = 0;
    lVar5 = 0;
    do {
      uVar1 = *param_2 - 0x30;
      if (9 < uVar1) {
        param_3 = 1;
        goto LAB_0047282c;
      }
      auVar2._8_8_ = 0;
      auVar2._0_8_ = uVar3;
      uVar4 = uVar3 * 10;
      param_2 = param_2 + 1;
      uVar3 = uVar4 + uVar1;
      lVar5 = SUB168(auVar2 * ZEXT816(10),8) + lVar5 * 10 + (ulong)CARRY8(uVar4,(ulong)uVar1);
      param_3 = param_3 + -1;
    } while (param_3 != 0);
    if (uVar3 != 0 || lVar5 != 0) {
      uVar6 = 0;
      *(ulong *)(param_1 + 0x10) = uVar3;
      *(long *)(param_1 + 0x18) = lVar5;
      goto code_r0x00472834;
    }
    param_1[1] = 4;
  }
  uVar6 = 1;
code_r0x00472834:
  *param_1 = uVar6;
  return;
}

