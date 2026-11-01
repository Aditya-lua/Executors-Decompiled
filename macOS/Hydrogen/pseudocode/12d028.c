
void FUN_0012d028(long param_1,undefined8 param_2,int param_3)

{
  ulong uVar1;
  ulong uVar2;
  int iVar3;
  undefined8 uVar4;
  ulong uVar5;
  long lVar6;
  int in_w9;
  ulong uVar7;
  long unaff_x19;
  long lVar8;
  ulong uVar9;
  
  iVar3 = in_w9 + param_3 * -0x10;
  uVar7 = (ulong)(param_3 * 2 + iVar3 + 3);
  uVar2 = uVar7 + (long)(param_3 << 3);
  uVar5 = (param_1 << 0x20) >> 0x23 & 0xfffffffffffffffc;
  uVar1 = uVar5 + (long)(int)uVar2;
  uVar9 = uVar5 + (long)(int)uVar1 & 0xfffffffffffffffc;
  lVar8 = (long)((int)uVar9 + (int)uVar5);
  uVar4 = func_0x000b810c(lVar8);
  *(undefined8 *)(unaff_x19 + 8) = uVar4;
  _bzero(uVar4,lVar8);
  lVar6 = *(long *)(unaff_x19 + 8);
  lVar8 = lVar6 + iVar3;
  *(long *)(unaff_x19 + 0x18) = lVar6;
  *(long *)(unaff_x19 + 0x20) = lVar8;
  *(long *)(unaff_x19 + 0x28) = lVar8;
  *(long *)(unaff_x19 + 0x30) = lVar8 + param_3 * 2;
  lVar8 = lVar6 + (uVar7 & 0xfffffffffffffffc);
  *(long *)(unaff_x19 + 0x38) = lVar8;
  *(long *)(unaff_x19 + 0x40) = lVar8 + (param_3 << 3);
  *(ulong *)(unaff_x19 + 0x48) = lVar6 + (uVar2 & 0xfffffffffffffffc);
  *(ulong *)(unaff_x19 + 0x50) = lVar6 + (uVar1 & 0xfffffffffffffffc);
  *(ulong *)(unaff_x19 + 0x58) = lVar6 + uVar9;
  return;
}

