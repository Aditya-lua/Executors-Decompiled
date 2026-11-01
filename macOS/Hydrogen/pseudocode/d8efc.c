
undefined8 FUN_000d8efc(long param_1,float param_2,undefined8 param_3)

{
  short sVar1;
  uint *puVar2;
  int iVar3;
  undefined8 uVar4;
  uint uVar5;
  long lVar6;
  uint in_w9;
  char *pcVar7;
  uint *puVar8;
  uint uVar9;
  long in_x10;
  uint *puVar10;
  uint uVar11;
  ulong uVar12;
  ulong uVar13;
  uint unaff_w19;
  uint *unaff_x21;
  long unaff_x22;
  float fVar14;
  long lStack0000000000000000;
  undefined1 uStack0000000000000008;
  char cStack000000000000000a;
  long in_stack_00000018;
  
  *(ulong *)(&UNK_00004a08 + param_1) =
       CONCAT44((float)((ulong)*(undefined8 *)(param_1 + 0xe40) >> 0x20) +
                (float)((ulong)param_3 >> 0x20) * param_2,
                (float)*(undefined8 *)(param_1 + 0xe40) + (float)param_3 * param_2);
  *(undefined8 *)(in_x10 + 0x18) = 0;
  fVar14 = *(float *)(&UNK_00003a18 + param_1);
  *unaff_x21 = in_w9 | 0x41;
  unaff_x21[1] = 1;
  unaff_x21[0x18] = (uint)(fVar14 * 0.6);
  lStack0000000000000000 = (long)(short)unaff_x21[0x52c];
  func_0x000b875c(&uStack0000000000000008,0x10,"##Tooltip_%02d");
  if (uStack0000000000000008 == 0) {
    uVar5 = 0;
    iVar3 = *(int *)(*(long *)(unaff_x22 + 0x4c0) + 0x3fe0);
    puVar10 = *(uint **)(&UNK_00003fe8 + *(long *)(unaff_x22 + 0x4c0));
  }
  else {
    pcVar7 = &cStack000000000000000a;
    uVar5 = 0xffffffff;
    uVar9 = (uint)uStack0000000000000008;
    do {
      uVar11 = (uint)(byte)pcVar7[-1];
      if (((uVar9 == 0x23) && (uVar11 == 0x23)) && (*pcVar7 == '#')) {
        uVar5 = 0xffffffff;
      }
      uVar5 = *(uint *)(&UNK_0080c404 + (ulong)(uVar5 & 0xff ^ uVar9) * 4) ^ uVar5 >> 8;
      pcVar7 = pcVar7 + 1;
      uVar9 = uVar11;
    } while (uVar11 != 0);
    uVar5 = ~uVar5;
    iVar3 = *(int *)(*(long *)(unaff_x22 + 0x4c0) + 0x3fe0);
    puVar10 = *(uint **)(&UNK_00003fe8 + *(long *)(unaff_x22 + 0x4c0));
  }
  if (iVar3 != 0) {
    puVar8 = puVar10;
    uVar12 = (long)iVar3;
    do {
      uVar13 = uVar12 >> 1;
      puVar2 = puVar8 + uVar13 * 4 + 4;
      uVar12 = uVar12 + ~uVar13;
      if (uVar5 <= puVar8[uVar13 * 4]) {
        puVar2 = puVar8;
        uVar12 = uVar13;
      }
      puVar8 = puVar2;
    } while (uVar12 != 0);
    if (((puVar2 != puVar10 + (long)iVar3 * 4) && (*puVar2 == uVar5)) &&
       ((lVar6 = *(long *)(puVar2 + 2), lVar6 != 0 && (*(char *)(lVar6 + 0xbe) != '\0')))) {
      *(undefined1 *)(lVar6 + 0xc3) = 1;
      *(undefined1 *)(lVar6 + 0xc5) = 1;
      *(undefined1 *)(lVar6 + 0xe4) = 1;
      sVar1 = (short)unaff_x21[0x52c] + 1;
      *(short *)(unaff_x21 + 0x52c) = sVar1;
      lStack0000000000000000 = (long)sVar1;
      func_0x000b875c(&uStack0000000000000008,0x10,"##Tooltip_%02d");
    }
  }
  func_0x000c9774(&uStack0000000000000008,0,unaff_w19 | 0x2030347);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000018) {
    return 1;
  }
  ___stack_chk_fail();
  uVar4 = func_0x000c2648(0x1000);
  if ((int)uVar4 != 0) {
    func_0x000d8e98(0,0);
  }
  return uVar4;
}

