
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000c0c8c(void)

{
  undefined8 uVar1;
  int iVar2;
  uint uVar3;
  long lVar4;
  byte *pbVar5;
  uint uVar6;
  uint uVar7;
  long *unaff_x19;
  long unaff_x20;
  byte *unaff_x22;
  
  iVar2 = _strlen();
  *(int *)(unaff_x19 + 0x10) = iVar2 + 1;
  if (*unaff_x22 == 0) {
    uVar3 = 0;
    *(undefined4 *)(unaff_x19 + 2) = 0;
    iVar2 = (int)unaff_x19[0x20];
    if (iVar2 != *(int *)((long)unaff_x19 + 0x104)) goto code_r0x000c0d5c;
  }
  else {
    pbVar5 = unaff_x22 + 2;
    uVar3 = 0xffffffff;
    uVar6 = (uint)*unaff_x22;
    do {
      uVar7 = (uint)pbVar5[-1];
      if (((uVar6 == 0x23) && (uVar7 == 0x23)) && (*pbVar5 == 0x23)) {
        uVar3 = 0xffffffff;
      }
      uVar3 = *(uint *)(&UNK_0080c404 + (ulong)(uVar3 & 0xff ^ uVar6) * 4) ^ uVar3 >> 8;
      pbVar5 = pbVar5 + 1;
      uVar6 = uVar7;
    } while (uVar7 != 0);
    uVar3 = ~uVar3;
    *(uint *)(unaff_x19 + 2) = uVar3;
    iVar2 = (int)unaff_x19[0x20];
    if (iVar2 != *(int *)((long)unaff_x19 + 0x104)) goto code_r0x000c0d5c;
  }
  func_0x000eb9f0();
  iVar2 = (int)unaff_x19[0x20];
  uVar3 = *(uint *)(unaff_x19 + 2);
code_r0x000c0d5c:
  *(uint *)(unaff_x19[0x21] + (long)iVar2 * 4) = uVar3;
  lVar4 = unaff_x19[0x20];
  *(int *)(unaff_x19 + 0x20) = (int)lVar4 + 1;
  uVar3 = *(uint *)(unaff_x19[0x21] + (long)(int)lVar4 * 4);
  uVar3 = *(uint *)(&UNK_0080c404 + ((ulong)uVar3 & 0xff ^ 0xdc) * 4) ^ ~uVar3 >> 8;
  uVar3 = *(uint *)(&UNK_0080c404 + (ulong)(uVar3 & 0xff ^ 0x4d) * 4) ^ uVar3 >> 8;
  uVar3 = *(uint *)(&UNK_0080c404 + (ulong)(uVar3 & 0xff ^ 0x4f) * 4) ^ uVar3 >> 8;
  uVar3 = *(uint *)(&UNK_0080c404 + (ulong)(uVar3 & 0xff ^ 0x56) * 4) ^ uVar3 >> 8;
  uVar3 = *(uint *)(&UNK_0080c404 + (ulong)(uVar3 & 0xff ^ 0x45) * 4) ^ uVar3 >> 8 ^ 0xffffffff;
  lVar4 = *unaff_x19;
  if (*(uint *)(&UNK_0000404c + lVar4) == uVar3) {
    func_0x000c167c(uVar3,0xb,"#MOVE",0);
    lVar4 = *unaff_x19;
  }
  *(uint *)((long)unaff_x19 + 0x84) = uVar3;
  uVar1 = _UNK_0080c2e0;
  *(undefined8 *)((long)unaff_x19 + 0xa4) = _UNK_0080c2e8;
  *(undefined8 *)((long)unaff_x19 + 0x9c) = uVar1;
  *(undefined2 *)((long)unaff_x19 + 0xdc) = 0xffff;
  *(undefined4 *)(unaff_x19 + 0x1c) = 0xffffffff;
  *(uint *)(unaff_x19 + 0x1d) = (uint)*(byte *)((long)unaff_x19 + 0xeb) << 0x18;
  *(undefined8 *)((long)unaff_x19 + 0xf4) = 0x7f7fffff7f7fffff;
  *(undefined8 *)((long)unaff_x19 + 0xec) = 0x7f7fffff7f7fffff;
  unaff_x19[0x4e] = -0x407fffff00000001;
  unaff_x19[0x54] = -0xc0800000;
  unaff_x19[0x55] = unaff_x20;
  unaff_x19[0x5d] = (long)(&UNK_00003d40 + lVar4);
  unaff_x19[0x5e] = unaff_x19[1];
  unaff_x19[0x7d] = 0x7f7fffff7f7fffff;
  unaff_x19[0x7c] = 0x7f7fffff7f7fffff;
  return;
}

