
void FUN_006b63c8(void)

{
  long lVar1;
  byte bVar2;
  int iVar3;
  uint uVar4;
  long lVar5;
  ulong uVar6;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  ulong unaff_x24;
  ulong unaff_x25;
  long *unaff_x26;
  ulong unaff_x27;
  int in_stack_00000038;
  long in_stack_00000048;
  
  do {
    lVar5 = *(long *)(unaff_x21 + 0x280);
    unaff_x20 = unaff_x20 + 8;
    if (unaff_x25 < (ulong)(*(long *)(unaff_x21 + 0x288) - lVar5 >> 3)) goto LAB_006b6388;
    do {
      uVar4 = *(uint *)(unaff_x21 + 0x2d0);
      do {
        if (((uVar4 >> 2 & 1) != 0) &&
           (iVar3 = *(int *)(*(long *)(unaff_x21 + 0x40) + unaff_x24 * 4),
           0 < iVar3 && iVar3 != in_stack_00000038)) {
          func_0x00798b54();
          uVar4 = *(uint *)(unaff_x21 + 0x2d0);
          in_stack_00000038 = iVar3;
        }
        if ((uVar4 >> 1 & 1) != 0) {
          func_0x00798b54();
        }
        if (*(int *)(in_stack_00000048 + unaff_x24 * 4) != -1) {
          func_0x00798b54();
        }
        func_0x006b53d4();
        iVar3 = func_0x0008a21c(unaff_x27);
        unaff_x24 = unaff_x24 + (long)iVar3;
        lVar5 = *(long *)(unaff_x21 + 0x28);
        lVar1 = *(long *)(unaff_x21 + 0x30);
        uVar6 = lVar1 - lVar5 >> 2;
        if (uVar6 <= unaff_x24) {
code_r0x006b655c:
          uVar4 = (uint)*(undefined8 *)(unaff_x19 + 8);
          if (-1 < (char)*(byte *)(unaff_x19 + 0x17)) {
            uVar4 = (uint)*(byte *)(unaff_x19 + 0x17);
          }
          *(uint *)(*unaff_x26 + uVar6 * 4) = uVar4;
          if (in_stack_00000048 != 0) {
            __ZdlPv(in_stack_00000048);
          }
          return;
        }
        while( true ) {
          bVar2 = *(byte *)(lVar5 + unaff_x24 * 4);
          unaff_x27 = (ulong)bVar2;
          uVar4 = (uint)*(undefined8 *)(unaff_x19 + 8);
          if (-1 < (char)*(byte *)(unaff_x19 + 0x17)) {
            uVar4 = (uint)*(byte *)(unaff_x19 + 0x17);
          }
          *(uint *)(*unaff_x26 + unaff_x24 * 4) = uVar4;
          if (bVar2 != 0x41) break;
          unaff_x24 = unaff_x24 + 1;
          uVar6 = lVar1 - lVar5 >> 2;
          if (uVar6 <= unaff_x24) goto code_r0x006b655c;
        }
        uVar4 = *(uint *)(unaff_x21 + 0x2d0);
      } while (((uVar4 >> 4 & 1) == 0) ||
              (lVar5 = *(long *)(unaff_x21 + 0x280),
              (ulong)(*(long *)(unaff_x21 + 0x288) - lVar5 >> 3) <= unaff_x25));
      unaff_x20 = unaff_x25 << 3;
LAB_006b6388:
    } while (unaff_x24 != *(uint *)(lVar5 + unaff_x20));
    func_0x00798b54();
    unaff_x25 = unaff_x25 + 1;
  } while( true );
}

