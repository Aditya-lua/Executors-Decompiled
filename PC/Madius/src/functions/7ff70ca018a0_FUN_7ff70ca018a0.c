/* 7ff70ca018a0 FUN_7ff70ca018a0 */

ulonglong FUN_7ff70ca018a0(uint *param_1)

{
  ushort uVar1;
  uint uVar2;
  ulonglong uVar3;
  short sVar4;
  uint uVar5;
  short sVar6;
  
  uVar3 = *(ulonglong *)(param_1 + 4);
  if (7 < *(ulonglong *)(param_1 + 6)) {
    param_1 = *(uint **)param_1;
  }
  if (uVar3 < 2) {
    return 0;
  }
  uVar2 = *param_1;
  if ((uVar2 & 0xffffffdf) - 0x3a0041 < 0x1a) {
    if ((longlong)uVar3 < 3) {
      return 0;
    }
    sVar4 = (short)param_1[1];
    return (ulonglong)CONCAT11((char)((ushort)sVar4 >> 8),sVar4 == 0x2f || sVar4 == 0x5c);
  }
  if ((longlong)uVar3 < 2) {
    return 0;
  }
  if (((short)uVar2 != 0x5c) && ((uVar2 & 0xffff) != 0x2f)) {
    return 0;
  }
  uVar5 = uVar2 >> 0x10;
  sVar4 = (short)(uVar2 >> 0x10);
  if (uVar3 < 4) {
    if (uVar3 == 2) {
      return 0;
    }
  }
  else if ((*(short *)((longlong)param_1 + 6) == 0x5c) ||
          (*(short *)((longlong)param_1 + 6) == 0x2f)) {
    if (uVar3 != 4) {
      uVar1 = (ushort)param_1[2];
      uVar3 = (ulonglong)uVar1;
      if ((uVar1 == 0x2f) || (uVar1 == 0x5c)) goto LAB_7ff70ca01955;
    }
    if ((sVar4 == 0x2f) || (uVar3 = (ulonglong)uVar5, uVar5 == 0x5c)) {
      sVar6 = (short)param_1[1];
      uVar3 = CONCAT71((int7)(uVar3 >> 8),1);
      if (sVar6 == 0x2e) {
        return uVar3;
      }
      if (sVar6 == 0x3f) {
        return uVar3;
      }
      if (uVar5 != 0x3f) goto LAB_7ff70ca01955;
    }
    else {
      if (uVar5 != 0x3f) {
        return 0;
      }
      sVar6 = (short)param_1[1];
      uVar3 = 0;
    }
    return CONCAT71((int7)(uVar3 >> 8),sVar6 == 0x3f);
  }
LAB_7ff70ca01955:
  if ((sVar4 != 0x5c) && (uVar5 != 0x2f)) {
    return 0;
  }
  sVar4 = (short)param_1[1];
  return (ulonglong)CONCAT11((char)((ushort)sVar4 >> 8),sVar4 != 0x2f && sVar4 != 0x5c);
}


