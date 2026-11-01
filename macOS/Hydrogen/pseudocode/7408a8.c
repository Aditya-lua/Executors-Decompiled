
undefined8 FUN_007408a8(long *param_1,undefined8 param_2)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  long lVar10;
  
  lVar4 = _strlen(param_2);
  lVar10 = param_1[1];
  lVar2 = lVar10 + lVar4;
  uVar1 = lVar2 + 1;
  uVar8 = param_1[3];
  if (uVar8 < uVar1) {
    (*pcRam0000000000a2b5f0)(*param_1);
    *param_1 = 0;
    param_1[1] = 0;
    uVar6 = 100;
  }
  else {
    uVar7 = param_1[2];
    if (uVar7 == 0) {
      if (uVar1 < 0x21) {
        uVar1 = 0x20;
      }
      uVar9 = uVar8;
      if (0x1f < uVar8) {
        uVar9 = uVar1;
      }
      lVar5 = *param_1;
      if (uVar9 == 0) goto joined_r0x00740948;
    }
    else {
      uVar3 = uVar7;
      do {
        uVar9 = uVar3;
        uVar3 = uVar9 << 1;
      } while (uVar9 < uVar1);
      if (uVar8 <= uVar9) {
        uVar9 = uVar8;
      }
      lVar5 = *param_1;
      if (uVar9 == uVar7) goto joined_r0x00740948;
    }
    lVar5 = (*pcRam0000000000a2b5f8)(lVar5,uVar9);
    if (lVar5 != 0) {
      *param_1 = lVar5;
      param_1[2] = uVar9;
joined_r0x00740948:
      if (lVar4 != 0) {
        _memcpy(lVar5 + lVar10,param_2,lVar4);
        lVar5 = *param_1;
      }
      param_1[1] = lVar2;
      *(undefined1 *)(lVar5 + lVar2) = 0;
      return 0;
    }
    (*pcRam0000000000a2b5f0)(*param_1);
    *param_1 = 0;
    param_1[1] = 0;
    uVar6 = 0x1b;
  }
  param_1[2] = 0;
  return uVar6;
}

