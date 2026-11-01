
void FUN_000de784(long param_1)

{
  char *pcVar1;
  int iVar2;
  int iVar3;
  undefined4 uVar4;
  ulong uVar5;
  int iVar6;
  long lVar7;
  undefined8 uVar8;
  undefined8 *puVar9;
  long lVar10;
  undefined1 auVar11 [16];
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  
  if (*(int *)(param_1 + 0x58) != 0) {
    puVar9 = *(undefined8 **)(param_1 + 0x60);
    lVar7 = *(long *)(lRam0000000000a334c0 + 0x4000);
    lVar10 = (long)*(int *)(param_1 + 0x58) << 3;
    do {
      uVar8 = *puVar9;
      uVar4 = func_0x000c1858(lVar7,uVar8);
      iVar6 = *(int *)(lVar7 + 0x100);
      if (iVar6 == *(int *)(lVar7 + 0x104)) {
        iVar2 = iVar6;
        if (iVar6 < 0) {
          iVar2 = iVar6 + 1;
        }
        iVar3 = 8;
        if (iVar6 != 0) {
          iVar3 = iVar6 + (iVar2 >> 1);
        }
        if (iVar3 <= iVar6 + 1) {
          iVar3 = iVar6 + 1;
        }
        func_0x000eb9f0((int *)(lVar7 + 0x100),iVar3);
        iVar6 = *(int *)(lVar7 + 0x100);
      }
      *(undefined4 *)(*(long *)(lVar7 + 0x108) + (long)iVar6 * 4) = uVar4;
      *(int *)(lVar7 + 0x100) = *(int *)(lVar7 + 0x100) + 1;
      func_0x000de924(uVar8);
      lVar7 = *(long *)(lRam0000000000a334c0 + 0x4000);
      *(int *)(lVar7 + 0x100) = *(int *)(lVar7 + 0x100) + -1;
      puVar9 = puVar9 + 1;
      lVar10 = lVar10 + -8;
    } while (lVar10 != 0);
  }
  uVar5 = func_0x001226d4("Font Atlas","Font Atlas (%dx%d pixels)");
  if ((uVar5 & 1) != 0) {
    pcVar1 = &UNK_00006098 + lRam0000000000a334c0;
    func_0x0010d04c("Tint with Text Color",pcVar1);
    if (*pcVar1 == '\0') {
      auVar11 = NEON_fmov(0x3f800000,4);
      in_stack_00000048 = auVar11._8_8_;
      uStack0000000000000040 = auVar11._0_8_;
    }
    else {
      uStack0000000000000040 = *(undefined8 *)(&UNK_000039cc + lRam0000000000a334c0);
      in_stack_00000048 = *(undefined8 *)(&UNK_000039d4 + lRam0000000000a334c0);
    }
    uStack0000000000000030 = *(undefined8 *)(&UNK_00003a1c + lRam0000000000a334c0);
    in_stack_00000038 = *(undefined8 *)(&UNK_00003a24 + lRam0000000000a334c0);
    uStack0000000000000028 = NEON_scvtf(*(undefined8 *)(param_1 + 0x40),4);
    uStack0000000000000020 = 0;
    uStack0000000000000018 = NEON_fmov(0x3f800000,4);
    func_0x0010cb34(*(undefined8 *)(param_1 + 8),&uStack0000000000000028,&uStack0000000000000020,
                    &uStack0000000000000018,&uStack0000000000000040,&uStack0000000000000030);
    func_0x00123710();
  }
  return;
}

