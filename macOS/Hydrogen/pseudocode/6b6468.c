
void FUN_006b6468(ulong param_1)

{
  uint uVar1;
  byte bVar2;
  int iVar3;
  uint uVar4;
  undefined8 *puVar5;
  long lVar6;
  ulong uVar7;
  long unaff_x19;
  long lVar8;
  long unaff_x21;
  long unaff_x22;
  undefined8 *unaff_x23;
  ulong unaff_x24;
  ulong unaff_x25;
  long *unaff_x26;
  ulong unaff_x27;
  ulong uStack0000000000000000;
  uint in_stack_00000038;
  long in_stack_00000048;
  
  do {
    uStack0000000000000000 = param_1;
    func_0x00798b54();
    do {
      func_0x006b53d4();
      iVar3 = func_0x0008a21c(unaff_x27);
      unaff_x24 = unaff_x24 + (long)iVar3;
      lVar6 = *(long *)(unaff_x21 + 0x28);
      lVar8 = *(long *)(unaff_x21 + 0x30);
      uVar7 = lVar8 - lVar6 >> 2;
      if (uVar7 <= unaff_x24) {
code_r0x006b655c:
        uVar4 = (uint)*(undefined8 *)(unaff_x19 + 8);
        if (-1 < (char)*(byte *)(unaff_x19 + 0x17)) {
          uVar4 = (uint)*(byte *)(unaff_x19 + 0x17);
        }
        *(uint *)(*unaff_x26 + uVar7 * 4) = uVar4;
        if (unaff_x22 != 0) {
          __ZdlPv(unaff_x22);
        }
        return;
      }
      while( true ) {
        bVar2 = *(byte *)(lVar6 + unaff_x24 * 4);
        unaff_x27 = (ulong)bVar2;
        uVar4 = (uint)*(undefined8 *)(unaff_x19 + 8);
        if (-1 < (char)*(byte *)(unaff_x19 + 0x17)) {
          uVar4 = (uint)*(byte *)(unaff_x19 + 0x17);
        }
        *(uint *)(*unaff_x26 + unaff_x24 * 4) = uVar4;
        if (bVar2 != 0x41) break;
        unaff_x24 = unaff_x24 + 1;
        uVar7 = lVar8 - lVar6 >> 2;
        if (uVar7 <= unaff_x24) goto code_r0x006b655c;
      }
      uVar4 = *(uint *)(unaff_x21 + 0x2d0);
      if (((uVar4 >> 4 & 1) != 0) &&
         (lVar6 = *(long *)(unaff_x21 + 0x280),
         unaff_x25 < (ulong)(*(long *)(unaff_x21 + 0x288) - lVar6 >> 3))) {
        lVar8 = unaff_x25 << 3;
        do {
          if (unaff_x24 != *(uint *)(lVar6 + lVar8)) break;
          puVar5 = unaff_x23;
          if (*(char *)(unaff_x21 + 0x2af) < '\0') {
            puVar5 = (undefined8 *)*unaff_x23;
          }
          uStack0000000000000000 = (long)puVar5 + (ulong)*(uint *)(lVar6 + lVar8 + 4);
          func_0x00798b54();
          unaff_x25 = unaff_x25 + 1;
          lVar6 = *(long *)(unaff_x21 + 0x280);
          lVar8 = lVar8 + 8;
        } while (unaff_x25 < (ulong)(*(long *)(unaff_x21 + 0x288) - lVar6 >> 3));
        uVar4 = *(uint *)(unaff_x21 + 0x2d0);
      }
      if ((uVar4 >> 2 & 1) != 0) {
        uVar1 = *(uint *)(*(long *)(unaff_x21 + 0x40) + unaff_x24 * 4);
        if (0 < (int)uVar1 && uVar1 != in_stack_00000038) {
          uStack0000000000000000 = (ulong)uVar1;
          func_0x00798b54();
          uVar4 = *(uint *)(unaff_x21 + 0x2d0);
          in_stack_00000038 = uVar1;
        }
      }
      if ((uVar4 >> 1 & 1) != 0) {
        uStack0000000000000000 = (ulong)*(uint *)(*(long *)(unaff_x21 + 0x40) + unaff_x24 * 4);
        func_0x00798b54();
      }
      uVar4 = *(uint *)(in_stack_00000048 + unaff_x24 * 4);
      param_1 = (ulong)uVar4;
      unaff_x22 = in_stack_00000048;
    } while (uVar4 == 0xffffffff);
  } while( true );
}

