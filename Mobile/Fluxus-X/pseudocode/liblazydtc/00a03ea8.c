/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a03ea8
 */

void BN_CTX_end(BN_CTX *ctx)

{
  uint uVar1;
  int iVar2;
  uint uVar3;
  int iVar4;
  uint uVar5;
  
  if (ctx != (BN_CTX *)0x0) {
    if (*(int *)(ctx + 0x34) != 0) {
      *(int *)(ctx + 0x34) = *(int *)(ctx + 0x34) + -1;
      return;
    }
    iVar4 = *(int *)(ctx + 0x28);
    *(uint *)(ctx + 0x28) = iVar4 - 1U;
    uVar3 = *(uint *)(*(long *)(ctx + 0x20) + (ulong)(iVar4 - 1U) * 4);
    uVar1 = *(uint *)(ctx + 0x30);
    iVar4 = uVar1 - uVar3;
    if (uVar3 <= uVar1 && iVar4 != 0) {
      iVar2 = *(int *)(ctx + 0x18);
      *(int *)(ctx + 0x18) = iVar2 - iVar4;
      if (iVar4 != 0) {
        uVar5 = iVar2 - 1U & 0xf;
        iVar4 = uVar3 - uVar1;
        do {
          while (uVar5 == 0) {
            *(undefined8 *)(ctx + 8) = *(undefined8 *)(*(long *)(ctx + 8) + 0x180);
            uVar5 = 0xf;
            iVar4 = iVar4 + 1;
            if (iVar4 == 0) goto LAB_00a03f28;
          }
          uVar5 = uVar5 - 1;
          iVar4 = iVar4 + 1;
        } while (iVar4 != 0);
      }
    }
LAB_00a03f28:
    *(uint *)(ctx + 0x30) = uVar3;
    *(undefined4 *)(ctx + 0x38) = 0;
  }
  return;
}

