
long FUN_002671e4(long *param_1,undefined8 param_2,ulong param_3)

{
  char cVar1;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  ushort uVar5;
  int iVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  long lVar12;
  
  lVar9 = *param_1;
  if (lVar9 == 0) {
    return 0;
  }
  lVar10 = param_1[1];
  do {
    uVar5 = *(ushort *)(lVar9 + 0x37a);
    lVar12 = (ulong)uVar5 * 0x18;
    lVar8 = lVar9 + 0xd8;
    uVar11 = 0xffffffffffffffff;
    lVar7 = lVar9 + 8;
    do {
      if (lVar12 == 0) {
        uVar11 = (ulong)uVar5;
        goto LAB_00267284;
      }
      uVar4 = *(ulong *)(lVar7 + 0x10);
      uVar2 = param_3;
      if (uVar4 <= param_3) {
        uVar2 = uVar4;
      }
      iVar6 = _memcmp(param_2,*(undefined8 *)(lVar7 + 8),uVar2);
      lVar3 = param_3 - uVar4;
      if (iVar6 != 0) {
        lVar3 = (long)iVar6;
      }
      cVar1 = 0 < lVar3;
      if (lVar3 < 0) {
        cVar1 = -1;
      }
      lVar12 = lVar12 + -0x18;
      uVar11 = uVar11 + 1;
      lVar8 = lVar8 + 0x38;
      lVar7 = lVar7 + 0x18;
    } while (cVar1 == '\x01');
    if (cVar1 == '\0') {
      return lVar8;
    }
LAB_00267284:
    if (lVar10 == 0) {
      return 0;
    }
    lVar9 = *(long *)(lVar9 + uVar11 * 8 + 0x380);
    lVar10 = lVar10 + -1;
  } while( true );
}

