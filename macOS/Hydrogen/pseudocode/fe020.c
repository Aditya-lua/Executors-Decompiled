
void FUN_000fe020(long param_1)

{
  long lVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  uint in_w9;
  undefined4 *puVar5;
  ushort *in_x10;
  uint *in_x11;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  while( true ) {
    *in_x11 = in_w9;
    param_1 = param_1 + -1;
    if (param_1 == 0) break;
    in_x11[5] = (uint)in_x10[-1];
    in_w9 = (uint)*in_x10;
    in_x10 = in_x10 + 0x10;
    in_x11 = in_x11 + 6;
  }
  func_0x000fe0d0();
  lVar4 = 0;
  puVar5 = (undefined4 *)(unaff_x20 + 0xc);
  do {
    if (puVar5[2] != 0) {
      lVar1 = *(long *)(unaff_x19 + 0x70) + lVar4;
      *(short *)(lVar1 + 4) = (short)*puVar5;
      iVar3 = puVar5[1];
      *(short *)(lVar1 + 6) = (short)iVar3;
      iVar3 = puVar5[-1] + iVar3;
      iVar2 = *(int *)(unaff_x19 + 0x44);
      if (*(int *)(unaff_x19 + 0x44) <= iVar3) {
        iVar2 = iVar3;
      }
      *(int *)(unaff_x19 + 0x44) = iVar2;
    }
    puVar5 = puVar5 + 6;
    lVar4 = lVar4 + 0x20;
  } while (unaff_x21 * 0x20 != lVar4);
  func_0x000b83d4();
  return;
}

