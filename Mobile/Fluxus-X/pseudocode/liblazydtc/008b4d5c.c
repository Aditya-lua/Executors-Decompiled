/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b4d5c
 */

void FUN_008b4d5c(long param_1,uint param_2,undefined8 param_3,long param_4)

{
  undefined1 uVar1;
  undefined1 uVar2;
  byte bVar3;
  undefined1 *puVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  undefined4 *puVar8;
  ulong uVar9;
  
  puVar4 = (undefined1 *)
           FUN_008b78d0(param_1,(-(ulong)(param_2 >> 0x1f) & 0xfffffff000000000 |
                                (ulong)param_2 << 4) + 0x20,*(undefined1 *)(param_1 + 4),7,0);
  lVar5 = *(long *)(param_1 + 0x60);
  uVar1 = *(undefined1 *)(param_1 + 4);
  uVar2 = *(undefined1 *)(param_4 + 5);
  *puVar4 = 7;
  bVar3 = *(byte *)(lVar5 + 2);
  puVar4[6] = 0;
  puVar4[5] = (char)param_2;
  puVar4[1] = uVar1;
  puVar4[4] = uVar2;
  puVar4[2] = bVar3 & 3;
  puVar4[3] = 0;
  *(undefined8 *)(puVar4 + 0x10) = param_3;
  *(long *)(puVar4 + 0x18) = param_4;
  if (0 < (int)param_2) {
    uVar6 = (ulong)param_2;
    if (param_2 == 1) {
      uVar7 = 0;
    }
    else {
      uVar7 = uVar6 & 0x7ffffffe;
      puVar8 = (undefined4 *)(puVar4 + 0x3c);
      uVar9 = uVar7;
      do {
        uVar9 = uVar9 - 2;
        puVar8[-4] = 0;
        *puVar8 = 0;
        puVar8 = puVar8 + 8;
      } while (uVar9 != 0);
      if (uVar7 == uVar6) {
        return;
      }
    }
    lVar5 = uVar6 - uVar7;
    puVar8 = (undefined4 *)(puVar4 + uVar7 * 0x10 + 0x2c);
    do {
      lVar5 = lVar5 + -1;
      *puVar8 = 0;
      puVar8 = puVar8 + 4;
    } while (lVar5 != 0);
  }
  return;
}

