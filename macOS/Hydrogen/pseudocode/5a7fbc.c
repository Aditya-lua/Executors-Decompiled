
void FUN_005a7fbc(undefined8 *param_1,long param_2,long param_3,long param_4)

{
  char cVar1;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  ushort uVar6;
  int iVar7;
  long lVar8;
  undefined8 uVar9;
  ulong uVar10;
  long lVar11;
  
  uVar9 = *(undefined8 *)(param_4 + 8);
  uVar4 = *(ulong *)(param_4 + 0x10);
  while( true ) {
    uVar6 = *(ushort *)(param_2 + 0x322);
    lVar11 = (ulong)uVar6 * 0x18;
    uVar10 = 0xffffffffffffffff;
    lVar8 = param_2 + 0x218;
    do {
      uVar2 = (ulong)uVar6;
      if (lVar11 == 0) goto joined_r0x005a8054;
      uVar5 = *(ulong *)(lVar8 + 0x10);
      uVar2 = uVar4;
      if (uVar5 <= uVar4) {
        uVar2 = uVar5;
      }
      iVar7 = _memcmp(uVar9,*(undefined8 *)(lVar8 + 8),uVar2);
      lVar3 = uVar4 - uVar5;
      if (iVar7 != 0) {
        lVar3 = (long)iVar7;
      }
      cVar1 = 0 < lVar3;
      if (lVar3 < 0) {
        cVar1 = -1;
      }
      lVar11 = lVar11 + -0x18;
      uVar10 = uVar10 + 1;
      lVar8 = lVar8 + 0x18;
    } while (cVar1 == '\x01');
    uVar2 = uVar10;
    if (cVar1 == '\0') break;
joined_r0x005a8054:
    uVar10 = uVar2;
    if (param_3 == 0) {
      uVar9 = 1;
code_r0x005a806c:
      param_1[2] = param_3;
      param_1[3] = uVar10;
      *param_1 = uVar9;
      param_1[1] = param_2;
      return;
    }
    param_2 = *(long *)(param_2 + uVar10 * 8 + 0x328);
    param_3 = param_3 + -1;
  }
  uVar9 = 0;
  goto code_r0x005a806c;
}

