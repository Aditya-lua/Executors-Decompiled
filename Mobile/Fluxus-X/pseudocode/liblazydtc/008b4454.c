/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b4454
 */

void FUN_008b4454(long param_1,long param_2,int param_3,uint param_4)

{
  ulong uVar1;
  ulong uVar2;
  byte bVar3;
  char cVar4;
  short sVar5;
  long lVar6;
  bool bVar7;
  int iVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  
  sVar5 = *(short *)(param_1 + 0x28);
  *(short *)(param_1 + 0x28) = sVar5 + 1;
  if (199 < (ushort)(sVar5 + 1U)) {
    if ((ushort)(sVar5 + 1U) == 200) {
                    /* WARNING: Subroutine does not return */
      FUN_008b39cc(param_1,"C stack overflow");
    }
    if (0xe0 < (ushort)(sVar5 + 1U)) {
                    /* WARNING: Subroutine does not return */
      FUN_008b3f9c(param_1,5);
    }
  }
  lVar6 = *(long *)(param_1 + 0x50) - *(long *)(param_1 + 0x20);
  if (((lVar6 == 0) ||
      (lVar9 = **(long **)(*(long *)(param_1 + 0x50) + 8), *(char *)(lVar9 + 6) == '\0')) ||
     (*(long *)(lVar9 + 0x20) == 0)) {
    bVar7 = false;
  }
  else {
    bVar7 = true;
    *(short *)(param_1 + 0x2a) = *(short *)(param_1 + 0x2a) + 1;
  }
  lVar9 = *(long *)(param_1 + 0x58);
  iVar8 = FUN_008c8994(param_1,param_2,param_3);
  if (iVar8 == 0) {
    bVar3 = *(byte *)(param_1 + 6);
    *(uint *)(*(long *)(param_1 + 0x50) + 0x2c) = *(uint *)(*(long *)(param_1 + 0x50) + 0x2c) | 1;
    *(undefined1 *)(param_1 + 6) = 1;
    if ((*(byte *)(param_1 + 2) >> 2 & 1) != 0) {
      FUN_008b63a4(param_1,param_1,param_1 + 0x38);
    }
    if ((param_4 & 1) == 0) {
      lVar10 = *(long *)(param_1 + 0x50);
      lVar11 = *(long *)(param_1 + 0x20);
      FUN_008be71c(param_1);
      FUN_008b4b80(param_1,(lVar10 - lVar11) + -0x30);
    }
    else {
      *(undefined1 *)(param_1 + 3) = 0x7f;
    }
    if ((bVar3 & 1) == 0) {
      *(undefined1 *)(param_1 + 6) = 0;
    }
  }
  cVar4 = *(char *)(param_1 + 3);
  param_2 = param_2 - lVar9;
  if (((cVar4 == '\x01') || (cVar4 == '\x7f')) || (cVar4 == '\x06')) {
    if (bVar7) {
      iVar8 = 0;
      if (param_3 != -1) {
        iVar8 = param_3;
      }
      *(short *)(param_1 + 0x2a) = *(short *)(param_1 + 0x2a) + -1;
      *(long *)(*(long *)(param_1 + 0x20) + lVar6 + 0x18) =
           *(long *)(param_1 + 0x58) + param_2 + (long)iVar8 * 0x10;
    }
  }
  else {
    if (bVar7) {
      *(short *)(param_1 + 0x2a) = *(short *)(param_1 + 0x2a) + -1;
    }
    if (param_3 != -1) {
      *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x58) + param_2 + (long)param_3 * 0x10;
    }
  }
  uVar1 = *(ulong *)(*(long *)(param_1 + 0x60) + 8);
  uVar2 = *(ulong *)(*(long *)(param_1 + 0x60) + 0x10);
  *(short *)(param_1 + 0x28) = *(short *)(param_1 + 0x28) + -1;
  if (uVar2 < uVar1) {
    return;
  }
  FUN_008b52c4(param_1,1);
  return;
}

