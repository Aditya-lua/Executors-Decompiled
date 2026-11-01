
void FUN_0012eadc(long param_1)

{
  short sVar1;
  short sVar2;
  short sVar3;
  bool in_ZR;
  int iVar4;
  int iVar5;
  int in_w9;
  ulong uVar6;
  char *pcVar7;
  int iVar8;
  long unaff_x19;
  int unaff_w20;
  uint uVar9;
  undefined8 uVar10;
  
  iVar8 = in_w9;
  if (!in_ZR) {
    iVar8 = 1;
  }
  iVar5 = 2;
  if (0 < unaff_w20) {
    iVar5 = 3;
  }
  uVar9 = 1;
  if (*(int *)(param_1 + 0x6c) <= in_w9) {
    uVar9 = *(int *)(param_1 + 0x6c) + 0x1f >> 5;
    iVar4 = _memcmp(*(undefined8 *)(unaff_x19 + 0x58),*(undefined8 *)(unaff_x19 + 0x50),
                    -(ulong)(uVar9 >> 0x1f) & 0xfffffffc00000000 | (ulong)uVar9 << 2);
    uVar9 = (uint)(iVar4 != 0);
  }
  iVar5 = (iVar8 << (0 < unaff_w20)) + iVar5 + uVar9;
  func_0x000f681c(*(undefined8 *)(unaff_x19 + 0x1a0),
                  *(undefined8 *)(*(long *)(unaff_x19 + 0x188) + 0x2a8),iVar5);
  sVar2 = (short)iVar5 + -1;
  if (uVar9 == 0) {
    sVar2 = -1;
  }
  *(short *)(unaff_x19 + 0x230) = sVar2;
  *(undefined2 *)(unaff_x19 + 0x232) = 1;
  sVar1 = (short)iVar8 + 2;
  if (*(short *)(unaff_x19 + 0x228) < 1) {
    sVar1 = 1;
  }
  *(short *)(unaff_x19 + 0x234) = sVar1;
  uVar6 = (ulong)*(uint *)(unaff_x19 + 0x6c);
  if (0 < (int)*(uint *)(unaff_x19 + 0x6c)) {
    sVar1 = 0;
    if (0 < *(short *)(unaff_x19 + 0x228)) {
      sVar1 = (short)iVar8 + 1;
    }
    pcVar7 = (char *)(*(long *)(unaff_x19 + 0x18) + 0x66);
    iVar8 = 2;
    do {
      while (pcVar7[-1] == '\0' || *pcVar7 == '\0') {
        *(short *)(pcVar7 + -6) = sVar2;
        *(short *)(pcVar7 + -8) = sVar2;
        *(short *)(pcVar7 + -10) = sVar2;
        pcVar7 = pcVar7 + 0x70;
        uVar6 = uVar6 - 1;
        if (uVar6 == 0) goto code_r0x0012ebf4;
      }
      sVar3 = (short)iVar8;
      iVar8 = ((*(uint *)(unaff_x19 + 4) >> 0x14 ^ 0xffffffff) & 1) + iVar8;
      *(short *)(pcVar7 + -6) = sVar3 + sVar1;
      *(short *)(pcVar7 + -8) = sVar3;
      *(short *)(pcVar7 + -10) = sVar3;
      pcVar7 = pcVar7 + 0x70;
      uVar6 = uVar6 - 1;
    } while (uVar6 != 0);
  }
code_r0x0012ebf4:
  *(undefined8 *)(unaff_x19 + 0x138) = *(undefined8 *)(unaff_x19 + 0x128);
  *(undefined8 *)(unaff_x19 + 0x130) = *(undefined8 *)(unaff_x19 + 0x120);
  uVar10 = *(undefined8 *)(*(long *)(unaff_x19 + 0x180) + 0x248);
  *(undefined8 *)(unaff_x19 + 0x148) = *(undefined8 *)(*(long *)(unaff_x19 + 0x180) + 0x250);
  *(undefined8 *)(unaff_x19 + 0x140) = uVar10;
  *(undefined8 *)(unaff_x19 + 0x158) = *(undefined8 *)(unaff_x19 + 0x168);
  *(undefined8 *)(unaff_x19 + 0x150) = *(undefined8 *)(unaff_x19 + 0x160);
  return;
}

