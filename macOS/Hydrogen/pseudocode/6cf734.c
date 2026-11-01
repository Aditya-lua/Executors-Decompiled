
void FUN_006cf734(int *param_1)

{
  uint uVar1;
  long lVar2;
  uint uVar3;
  int iVar4;
  int *piVar5;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  long unaff_x19;
  long unaff_x20;
  int *unaff_x23;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  long in_stack_00000018;
  undefined1 uStack0000000000000050;
  
  lVar2 = unaff_x19 + 0x10;
  piVar5 = unaff_x23;
  do {
    iVar4 = *piVar5;
    if (iVar4 - 3U < 3) {
      uVar7 = (ulong)(*(byte *)(piVar5 + 1) >> 6);
      uVar6 = 1L << ((ulong)*(byte *)(piVar5 + 1) & 0x3f);
      if ((uVar6 & *(ulong *)(&uStack0000000000000050 + uVar7 * 8)) != 0) {
        lVar8 = uVar7 * 8;
        *(ulong *)(lVar2 + lVar8) = *(ulong *)(lVar2 + lVar8) | uVar6;
      }
      if (iVar4 == 5) {
        uVar6 = (ulong)(*(byte *)((long)piVar5 + 6) >> 6);
        uVar7 = 1L << ((ulong)*(byte *)((long)piVar5 + 6) & 0x3f);
        if ((uVar7 & *(ulong *)(&uStack0000000000000050 + uVar6 * 8)) != 0) {
          lVar8 = uVar6 * 8;
          *(ulong *)(lVar2 + lVar8) = *(ulong *)(lVar2 + lVar8) | uVar7;
        }
      }
    }
    piVar5 = piVar5 + 0xc;
  } while (piVar5 != param_1);
  do {
    if ((*unaff_x23 == 0) &&
       ((*(ulong *)(lVar2 + ((ulong)(*(byte *)(unaff_x23 + 1) >> 3) & 0x18)) >>
         ((ulong)*(byte *)(unaff_x23 + 1) & 0x3f) & 1) != 0)) {
      iVar4 = *(int *)(unaff_x20 + 0x484);
      uVar1 = iVar4 + 1;
      if (0xff < uVar1) {
        uStack0000000000000000 = 1;
        uStack0000000000000008 = 0xff;
        func_0x006bc388(in_stack_00000018 + 0xc,
                        "Out of registers when trying to allocate %d registers: exceeded limit %d");
        return;
      }
      *(uint *)(unaff_x20 + 0x484) = uVar1;
      uVar3 = *(uint *)(unaff_x20 + 0x488);
      if (*(uint *)(unaff_x20 + 0x488) <= uVar1) {
        uVar3 = uVar1;
      }
      *(uint *)(unaff_x20 + 0x488) = uVar3;
      *(char *)(unaff_x23 + 10) = (char)iVar4;
    }
    unaff_x23 = unaff_x23 + 0xc;
  } while (unaff_x23 != param_1);
  return;
}

