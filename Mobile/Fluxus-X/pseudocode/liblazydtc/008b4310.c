/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b4310
 */

bool FUN_008b4310(long param_1)

{
  ulong uVar1;
  ulong uVar2;
  uint uVar3;
  byte bVar4;
  char cVar5;
  short sVar6;
  int iVar7;
  long lVar8;
  long lVar9;
  
  sVar6 = *(short *)(param_1 + 0x28);
  *(short *)(param_1 + 0x28) = sVar6 + 1;
  if (199 < (ushort)(sVar6 + 1U)) {
    if ((ushort)(sVar6 + 1U) == 200) {
                    /* WARNING: Subroutine does not return */
      FUN_008b39cc(param_1,"C stack overflow");
    }
    if (0xe0 < (ushort)(sVar6 + 1U)) {
                    /* WARNING: Subroutine does not return */
      FUN_008b3f9c(param_1,5);
    }
  }
  uVar3 = *(uint *)(*(long *)(param_1 + 0x50) + 0x2c);
  *(short *)(param_1 + 0x2a) = *(short *)(param_1 + 0x2a) + 1;
  *(uint *)(*(long *)(param_1 + 0x50) + 0x2c) = uVar3 | 8;
  iVar7 = FUN_008c8994(param_1);
  if (iVar7 == 0) {
    lVar8 = *(long *)(param_1 + 0x50);
    bVar4 = *(byte *)(param_1 + 6);
    *(undefined1 *)(param_1 + 6) = 1;
    *(uint *)(lVar8 + 0x2c) = *(uint *)(lVar8 + 0x2c) | 1;
    if ((*(byte *)(param_1 + 2) >> 2 & 1) != 0) {
      FUN_008b63a4(param_1,param_1,param_1 + 0x38);
      lVar8 = *(long *)(param_1 + 0x50);
    }
    lVar9 = *(long *)(param_1 + 0x20);
    FUN_008be71c(param_1);
    FUN_008b4b80(param_1,(lVar8 - lVar9) + -0x30);
    if ((bVar4 & 1) == 0) {
      *(undefined1 *)(param_1 + 6) = 0;
    }
  }
  cVar5 = *(char *)(param_1 + 3);
  if (cVar5 == '\0') {
    uVar1 = *(ulong *)(*(long *)(param_1 + 0x60) + 8);
    uVar2 = *(ulong *)(*(long *)(param_1 + 0x60) + 0x10);
    uVar3 = *(uint *)(*(long *)(param_1 + 0x50) + 0x2c);
    *(short *)(param_1 + 0x2a) = *(short *)(param_1 + 0x2a) + -1;
    *(short *)(param_1 + 0x28) = *(short *)(param_1 + 0x28) + -1;
    *(uint *)(*(long *)(param_1 + 0x50) + 0x2c) = uVar3 & 0xfffffff7;
    if (uVar1 <= uVar2) {
      FUN_008b52c4(param_1,1);
    }
  }
  return cVar5 != '\0';
}

