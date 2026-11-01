
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000c0b94(long param_1)

{
  int *piVar1;
  long lVar2;
  int iVar3;
  int iVar4;
  undefined *puVar5;
  undefined8 uVar6;
  int iVar7;
  long lVar8;
  long lVar9;
  uint uVar10;
  long lVar11;
  byte *pbVar12;
  uint uVar13;
  uint uVar14;
  int *piVar15;
  long *unaff_x19;
  byte *unaff_x22;
  long unaff_x23;
  
  _bzero(param_1 + 8,0x3f8);
  *unaff_x19 = unaff_x23;
  lVar8 = _strlen();
  lVar9 = (*pcRam0000000000a28da0)(lVar8 + 1,uRam0000000000a33a18);
  lVar11 = lRam0000000000a334c0;
  if (lRam0000000000a334c0 != 0) {
    puVar5 = &UNK_000060d0;
    piVar1 = (int *)(&UNK_00003f58 + lRam0000000000a334c0);
    piVar15 = (int *)(&UNK_000060dc +
                     lRam0000000000a334c0 +
                     (long)*(short *)(&UNK_000060d8 + lRam0000000000a334c0) * 8);
    if (*piVar15 != *piVar1) {
      iVar7 = (*(short *)(&UNK_000060d8 + lRam0000000000a334c0) + 1) % 6;
      *(short *)(&UNK_000060d8 + lRam0000000000a334c0) = (short)iVar7;
      lVar2 = lVar11 + (long)iVar7 * 8;
      piVar15 = (int *)(&UNK_000060dc + lVar2);
      *piVar15 = *piVar1;
      *(undefined4 *)(&UNK_000060e0 + lVar2) = 0;
    }
    if (lVar8 == -2) {
      *(short *)((long)piVar15 + 6) = *(short *)((long)piVar15 + 6) + 1;
      puVar5 = &UNK_000060d4;
    }
    else {
      *(short *)(piVar15 + 1) = (short)piVar15[1] + 1;
    }
    *(int *)(puVar5 + lVar11) = *(int *)(puVar5 + lVar11) + 1;
  }
  _memcpy(lVar9);
  unaff_x19[1] = lVar9;
  iVar7 = _strlen();
  *(int *)(unaff_x19 + 0x10) = iVar7 + 1;
  if (*unaff_x22 == 0) {
    uVar10 = 0;
    *(undefined4 *)(unaff_x19 + 2) = 0;
    iVar7 = (int)unaff_x19[0x20];
    if (iVar7 != *(int *)((long)unaff_x19 + 0x104)) goto code_r0x000c0d5c;
  }
  else {
    pbVar12 = unaff_x22 + 2;
    uVar10 = 0xffffffff;
    uVar13 = (uint)*unaff_x22;
    do {
      uVar14 = (uint)pbVar12[-1];
      if (((uVar13 == 0x23) && (uVar14 == 0x23)) && (*pbVar12 == 0x23)) {
        uVar10 = 0xffffffff;
      }
      uVar10 = *(uint *)(&UNK_0080c404 + (ulong)(uVar10 & 0xff ^ uVar13) * 4) ^ uVar10 >> 8;
      pbVar12 = pbVar12 + 1;
      uVar13 = uVar14;
    } while (uVar14 != 0);
    uVar10 = ~uVar10;
    *(uint *)(unaff_x19 + 2) = uVar10;
    iVar7 = (int)unaff_x19[0x20];
    if (iVar7 != *(int *)((long)unaff_x19 + 0x104)) goto code_r0x000c0d5c;
  }
  iVar3 = iVar7;
  if (iVar7 < 0) {
    iVar3 = iVar7 + 1;
  }
  iVar4 = 8;
  if (iVar7 != 0) {
    iVar4 = iVar7 + (iVar3 >> 1);
  }
  if (iVar4 <= iVar7 + 1) {
    iVar4 = iVar7 + 1;
  }
  func_0x000eb9f0(param_1 + 0x100,iVar4);
  iVar7 = (int)unaff_x19[0x20];
  uVar10 = *(uint *)(unaff_x19 + 2);
code_r0x000c0d5c:
  *(uint *)(unaff_x19[0x21] + (long)iVar7 * 4) = uVar10;
  lVar11 = unaff_x19[0x20];
  *(int *)(unaff_x19 + 0x20) = (int)lVar11 + 1;
  uVar10 = *(uint *)(unaff_x19[0x21] + (long)(int)lVar11 * 4);
  uVar10 = *(uint *)(&UNK_0080c404 + ((ulong)uVar10 & 0xff ^ 0xdc) * 4) ^ ~uVar10 >> 8;
  uVar10 = *(uint *)(&UNK_0080c404 + (ulong)(uVar10 & 0xff ^ 0x4d) * 4) ^ uVar10 >> 8;
  uVar10 = *(uint *)(&UNK_0080c404 + (ulong)(uVar10 & 0xff ^ 0x4f) * 4) ^ uVar10 >> 8;
  uVar10 = *(uint *)(&UNK_0080c404 + (ulong)(uVar10 & 0xff ^ 0x56) * 4) ^ uVar10 >> 8;
  uVar10 = *(uint *)(&UNK_0080c404 + (ulong)(uVar10 & 0xff ^ 0x45) * 4) ^ uVar10 >> 8 ^ 0xffffffff;
  lVar11 = *unaff_x19;
  if (*(uint *)(&UNK_0000404c + lVar11) == uVar10) {
    func_0x000c167c(uVar10,0xb,"#MOVE",0);
    lVar11 = *unaff_x19;
  }
  *(uint *)((long)unaff_x19 + 0x84) = uVar10;
  uVar6 = _UNK_0080c2e0;
  *(undefined8 *)((long)unaff_x19 + 0xa4) = _UNK_0080c2e8;
  *(undefined8 *)((long)unaff_x19 + 0x9c) = uVar6;
  *(undefined2 *)((long)unaff_x19 + 0xdc) = 0xffff;
  *(undefined4 *)(unaff_x19 + 0x1c) = 0xffffffff;
  *(uint *)(unaff_x19 + 0x1d) = (uint)*(byte *)((long)unaff_x19 + 0xeb) << 0x18;
  *(undefined8 *)((long)unaff_x19 + 0xf4) = 0x7f7fffff7f7fffff;
  *(undefined8 *)((long)unaff_x19 + 0xec) = 0x7f7fffff7f7fffff;
  unaff_x19[0x4e] = -0x407fffff00000001;
  unaff_x19[0x54] = -0xc0800000;
  unaff_x19[0x55] = param_1 + 0x2b0;
  unaff_x19[0x5d] = (long)(&UNK_00003d40 + lVar11);
  unaff_x19[0x5e] = unaff_x19[1];
  unaff_x19[0x7d] = 0x7f7fffff7f7fffff;
  unaff_x19[0x7c] = 0x7f7fffff7f7fffff;
  return;
}

