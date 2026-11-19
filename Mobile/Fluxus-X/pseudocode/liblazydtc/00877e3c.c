/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00877e3c
 */

void FUN_00877e3c(long param_1)

{
  uint uVar1;
  uint *puVar2;
  uint uVar3;
  uint uVar4;
  uint *puVar5;
  long lVar6;
  int iVar7;
  uint uVar8;
  
  if ((*(byte *)(param_1 + 0xf0) & 1) == 0) {
    puVar5 = *(uint **)(param_1 + 0x90);
    puVar2 = *(uint **)(param_1 + 0x98);
    if (puVar5 != puVar2) {
      lVar6 = *(long *)(param_1 + 0x30);
      do {
        uVar3 = *puVar5;
        uVar4 = *(uint *)(lVar6 + (ulong)uVar3 * 4);
        iVar7 = uVar3 + ((int)uVar4 >> 0x10);
        while( true ) {
          uVar1 = iVar7 + 1;
          uVar8 = *(uint *)(lVar6 + (ulong)uVar1 * 4);
          if (((uVar8 & 0xff) != 0x17) || ((int)uVar8 >> 0x10 < 0)) break;
          iVar7 = uVar1 + ((int)uVar8 >> 0x10);
        }
        if ((uVar4 & 0xff) == 0x17 && (uVar8 & 0xff) == 0x16) {
LAB_00877e58:
          *(uint *)(lVar6 + (ulong)uVar3 * 4) = uVar8;
        }
        else {
          iVar7 = uVar1 + ~uVar3;
          if (iVar7 == (short)iVar7) {
            uVar8 = uVar4 & 0xffff | iVar7 * 0x10000;
            goto LAB_00877e58;
          }
        }
        puVar5[1] = uVar1;
        puVar5 = puVar5 + 2;
      } while (puVar5 != puVar2);
    }
  }
  return;
}

