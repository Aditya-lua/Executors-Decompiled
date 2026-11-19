/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00854b10
 */

void FUN_00854b10(undefined4 *param_1,long *param_2)

{
  uint uVar1;
  uint uVar2;
  undefined4 uVar3;
  byte bVar4;
  int iVar5;
  long lVar6;
  uint uVar7;
  undefined8 uVar8;
  uint uVar9;
  int iVar10;
  ulong uVar11;
  bool bVar12;
  uint uVar13;
  
  uVar2 = *(uint *)(param_2 + 2);
  uVar3 = *(undefined4 *)((long)param_2 + 0x14);
  iVar5 = (int)param_2[3];
  uVar11 = param_2[1];
  uVar8 = CONCAT44(uVar2 - iVar5,uVar3);
  if (uVar2 < uVar11) {
    bVar4 = *(byte *)(*param_2 + (ulong)uVar2);
    uVar9 = (uint)bVar4;
    if (-1 < (char)bVar4) goto LAB_00854b58;
    uVar1 = uVar9 & 0xe0;
    if (uVar1 == 0xc0) {
      bVar12 = false;
      uVar7 = 0x1f;
    }
    else if ((uVar9 & 0xf0) == 0xe0) {
      bVar12 = true;
      uVar7 = 0xf;
    }
    else {
      if ((uVar9 & 0xf8) != 0xf0) {
        *(undefined8 *)(param_1 + 1) = uVar8;
        param_1[5] = 0;
        iVar5 = (uVar2 + 1) - iVar5;
        *(uint *)(param_2 + 2) = uVar2 + 1;
        goto LAB_00854c7c;
      }
      bVar12 = false;
      uVar7 = 7;
    }
    uVar13 = uVar2 + 1;
    *(uint *)(param_2 + 2) = uVar13;
    if (uVar11 <= uVar13) {
LAB_00854c6c:
      iVar5 = uVar13 - iVar5;
      *(undefined8 *)(param_1 + 1) = uVar8;
      param_1[5] = 0;
LAB_00854c7c:
      *param_1 = 0x120;
      *(undefined8 *)(param_1 + 6) = 0;
      *(ulong *)(param_1 + 3) = CONCAT44(iVar5,uVar3);
      return;
    }
    lVar6 = *param_2;
    bVar4 = *(byte *)(lVar6 + (ulong)uVar13);
    if (-0x41 < (char)bVar4) goto LAB_00854c6c;
    uVar9 = bVar4 & 0x3f | (uVar9 & uVar7) << 6;
    uVar13 = uVar2 + 2;
    *(uint *)(param_2 + 2) = uVar13;
    if (uVar1 == 0xc0) goto LAB_00854b64;
    if ((uVar11 <= uVar13) || (bVar4 = *(byte *)(lVar6 + (ulong)uVar13), -0x41 < (char)bVar4))
    goto LAB_00854c6c;
    uVar13 = uVar2 + 3;
    *(uint *)(param_2 + 2) = uVar13;
    uVar9 = bVar4 & 0x3f | uVar9 << 6;
    if (bVar12) goto LAB_00854b64;
    if ((uVar11 <= uVar13) || (bVar4 = *(byte *)(lVar6 + (ulong)uVar13), -0x41 < (char)bVar4))
    goto LAB_00854c6c;
    uVar9 = bVar4 & 0x3f | uVar9 << 6;
    iVar10 = 4;
  }
  else {
    uVar9 = 0;
LAB_00854b58:
    iVar10 = 1;
  }
  uVar13 = uVar2 + iVar10;
  *(uint *)(param_2 + 2) = uVar13;
LAB_00854b64:
  *(undefined8 *)(param_1 + 1) = uVar8;
  *param_1 = 0x120;
  *(undefined8 *)(param_1 + 6) = 0;
  *(ulong *)(param_1 + 3) = CONCAT44(uVar13 - iVar5,uVar3);
  param_1[5] = 0;
  param_1[6] = uVar9;
  return;
}

