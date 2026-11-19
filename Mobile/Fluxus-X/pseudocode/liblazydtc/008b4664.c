/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b4664
 */

void FUN_008b4664(long param_1,long param_2,int param_3)

{
  ulong uVar1;
  ulong uVar2;
  byte bVar3;
  short sVar4;
  int iVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  
  sVar4 = *(short *)(param_1 + 0x28);
  *(short *)(param_1 + 0x28) = sVar4 + 1;
  if (199 < (ushort)(sVar4 + 1U)) {
    if ((ushort)(sVar4 + 1U) == 200) {
                    /* WARNING: Subroutine does not return */
      FUN_008b39cc(param_1,"C stack overflow");
    }
    if (0xe0 < (ushort)(sVar4 + 1U)) {
                    /* WARNING: Subroutine does not return */
      FUN_008b3f9c(param_1,5);
    }
  }
  lVar8 = *(long *)(param_1 + 0x58);
  iVar5 = FUN_008c8994(param_1,param_2,param_3);
  if (iVar5 == 0) {
    lVar6 = *(long *)(param_1 + 0x50);
    bVar3 = *(byte *)(param_1 + 6);
    *(undefined1 *)(param_1 + 6) = 1;
    *(uint *)(lVar6 + 0x2c) = *(uint *)(lVar6 + 0x2c) | 1;
    if ((*(byte *)(param_1 + 2) >> 2 & 1) != 0) {
      FUN_008b63a4(param_1,param_1,param_1 + 0x38);
      lVar6 = *(long *)(param_1 + 0x50);
    }
    lVar7 = *(long *)(param_1 + 0x20);
    FUN_008be71c(param_1);
    FUN_008b4b80(param_1,(lVar6 - lVar7) + -0x30);
    if ((bVar3 & 1) == 0) {
      *(undefined1 *)(param_1 + 6) = 0;
    }
  }
  if (param_3 != -1) {
    *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x58) + (param_2 - lVar8) + (long)param_3 * 0x10
    ;
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

