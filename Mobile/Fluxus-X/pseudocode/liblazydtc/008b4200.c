/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b4200
 */

void FUN_008b4200(long param_1)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  uint uVar5;
  
  iVar2 = *(int *)(param_1 + 0x44);
  if (0x57e3 < iVar2) {
                    /* WARNING: Subroutine does not return */
    FUN_008b3f9c(param_1,5);
  }
  uVar5 = iVar2 * 2;
  if (19999 < (int)uVar5) {
    uVar5 = 20000;
  }
  uVar1 = 0x57e4;
  if (iVar2 < 20000) {
    uVar1 = uVar5;
  }
  if ((int)uVar1 < 0) {
                    /* WARNING: Subroutine does not return */
    FUN_008b75fc(param_1);
  }
  lVar4 = *(long *)(param_1 + 0x20);
  lVar3 = FUN_008b8498(param_1,lVar4,(long)iVar2 * 0x30,(ulong)uVar1 * 0x30,
                       *(undefined1 *)(param_1 + 1));
  *(uint *)(param_1 + 0x44) = uVar1;
  lVar4 = lVar3 + (*(long *)(param_1 + 0x50) - lVar4);
  *(long *)(param_1 + 0x50) = lVar4;
  *(ulong *)(param_1 + 0x18) = lVar3 + (ulong)uVar1 * 0x30 + -0x30;
  *(long *)(param_1 + 0x20) = lVar3;
  if (19999 < iVar2) {
                    /* WARNING: Subroutine does not return */
    FUN_008b39cc(param_1,"stack overflow");
  }
  *(long *)(param_1 + 0x50) = lVar4 + 0x30;
  return;
}

