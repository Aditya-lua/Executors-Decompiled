
void FUN_006b6530(void)

{
  byte bVar1;
  int iVar2;
  uint uVar3;
  long lVar4;
  ulong uVar5;
  long unaff_x19;
  long lVar6;
  long unaff_x21;
  long unaff_x22;
  ulong unaff_x24;
  ulong unaff_x25;
  long *unaff_x26;
  ulong unaff_x27;
  int in_stack_00000038;
  long in_stack_00000048;
  
  do {
    func_0x006b53d4();
    iVar2 = func_0x0008a21c(unaff_x27);
    unaff_x24 = unaff_x24 + (long)iVar2;
    lVar4 = *(long *)(unaff_x21 + 0x28);
    lVar6 = *(long *)(unaff_x21 + 0x30);
    uVar5 = lVar6 - lVar4 >> 2;
    if (uVar5 <= unaff_x24) {
code_r0x006b655c:
      uVar3 = (uint)*(undefined8 *)(unaff_x19 + 8);
      if (-1 < (char)*(byte *)(unaff_x19 + 0x17)) {
        uVar3 = (uint)*(byte *)(unaff_x19 + 0x17);
      }
      *(uint *)(*unaff_x26 + uVar5 * 4) = uVar3;
      if (unaff_x22 != 0) {
        __ZdlPv(unaff_x22);
      }
      return;
    }
    while( true ) {
      bVar1 = *(byte *)(lVar4 + unaff_x24 * 4);
      unaff_x27 = (ulong)bVar1;
      uVar3 = (uint)*(undefined8 *)(unaff_x19 + 8);
      if (-1 < (char)*(byte *)(unaff_x19 + 0x17)) {
        uVar3 = (uint)*(byte *)(unaff_x19 + 0x17);
      }
      *(uint *)(*unaff_x26 + unaff_x24 * 4) = uVar3;
      if (bVar1 != 0x41) break;
      unaff_x24 = unaff_x24 + 1;
      uVar5 = lVar6 - lVar4 >> 2;
      if (uVar5 <= unaff_x24) goto code_r0x006b655c;
    }
    uVar3 = *(uint *)(unaff_x21 + 0x2d0);
    if (((uVar3 >> 4 & 1) != 0) &&
       (lVar4 = *(long *)(unaff_x21 + 0x280),
       unaff_x25 < (ulong)(*(long *)(unaff_x21 + 0x288) - lVar4 >> 3))) {
      lVar6 = unaff_x25 << 3;
      do {
        if (unaff_x24 != *(uint *)(lVar4 + lVar6)) break;
        func_0x00798b54();
        unaff_x25 = unaff_x25 + 1;
        lVar4 = *(long *)(unaff_x21 + 0x280);
        lVar6 = lVar6 + 8;
      } while (unaff_x25 < (ulong)(*(long *)(unaff_x21 + 0x288) - lVar4 >> 3));
      uVar3 = *(uint *)(unaff_x21 + 0x2d0);
    }
    if (((uVar3 >> 2 & 1) != 0) &&
       (iVar2 = *(int *)(*(long *)(unaff_x21 + 0x40) + unaff_x24 * 4),
       0 < iVar2 && iVar2 != in_stack_00000038)) {
      func_0x00798b54();
      uVar3 = *(uint *)(unaff_x21 + 0x2d0);
      in_stack_00000038 = iVar2;
    }
    if ((uVar3 >> 1 & 1) != 0) {
      func_0x00798b54();
    }
    unaff_x22 = in_stack_00000048;
    if (*(int *)(in_stack_00000048 + unaff_x24 * 4) != -1) {
      func_0x00798b54();
    }
  } while( true );
}

