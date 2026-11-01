
void FUN_004b8488(undefined8 *param_1,long param_2)

{
  undefined8 uVar1;
  ushort in_w8;
  uint in_w9;
  undefined8 uVar2;
  uint uVar3;
  ulong uVar4;
  long *unaff_x21;
  long unaff_x22;
  uint unaff_w23;
  long lVar5;
  
  if ((unaff_w23 & 1) == 0) {
    uVar4 = (ulong)in_w8;
    uVar3 = (uint)in_w8;
    if (in_w9 >> 8 <= uVar3) {
      uVar2 = *param_1;
      lVar5 = *(long *)(param_2 + 0x10);
      while (in_w9 >> 8 < uVar3) {
        uVar1 = func_0x00486da8(uVar2,uVar4);
        uVar4 = uVar4 - 1;
        *(undefined8 *)(lVar5 + unaff_x22 * 8) = uVar1;
        unaff_x22 = unaff_x22 + 1;
        uVar3 = (uint)uVar4 & 0xff;
      }
      uVar2 = func_0x00486da8(uVar2,unaff_w23 >> 8 & 0xff);
      *(undefined8 *)(lVar5 + unaff_x22 * 8) = uVar2;
      unaff_x22 = unaff_x22 + 1;
    }
  }
  *unaff_x21 = unaff_x22;
  return;
}

