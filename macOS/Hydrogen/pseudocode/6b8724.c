
bool FUN_006b8724(undefined8 *param_1,uint *param_2)

{
  uint *puVar1;
  long lVar2;
  undefined8 uVar3;
  uint *puVar4;
  uint *in_x9;
  uint in_w10;
  long lVar5;
  uint in_w11;
  int iVar6;
  long lVar7;
  
  uVar3 = *param_1;
  if (in_w10 < in_w11) {
    *param_1 = param_1[2];
  }
  else {
    *param_1 = param_1[1];
    param_1[1] = uVar3;
    if ((uint)uVar3 <= in_w10) goto LAB_006b888c;
    param_1[1] = param_1[2];
  }
  param_1[2] = uVar3;
LAB_006b888c:
  if ((uint *)(param_1 + 3) != param_2) {
    lVar5 = 0;
    iVar6 = 0;
    puVar1 = (uint *)(param_1 + 3);
    do {
      puVar4 = puVar1;
      if (*puVar4 < *in_x9) {
        uVar3 = *(undefined8 *)puVar4;
        lVar2 = lVar5;
        do {
          lVar7 = lVar2;
          *(undefined8 *)((long)param_1 + lVar7 + 0x18) =
               *(undefined8 *)((long)param_1 + lVar7 + 0x10);
          if (lVar7 == -0x10) {
            *param_1 = uVar3;
            goto joined_r0x006b88b4;
          }
          lVar2 = lVar7 + -8;
        } while ((uint)uVar3 < *(uint *)((long)param_1 + lVar7 + 8));
        *(undefined8 *)((long)param_1 + lVar7 + 0x10) = uVar3;
joined_r0x006b88b4:
        iVar6 = iVar6 + 1;
        if (iVar6 == 8) {
          return puVar4 + 2 == param_2;
        }
      }
      lVar5 = lVar5 + 8;
      puVar1 = puVar4 + 2;
      in_x9 = puVar4;
    } while (puVar4 + 2 != param_2);
  }
  return true;
}

