/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d5d00
 */

void custom_ext_init(long *param_1)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  undefined4 *puVar4;
  long lVar5;
  ulong uVar6;
  
  uVar1 = param_1[1];
  if (uVar1 != 0) {
    lVar5 = *param_1;
    if (uVar1 == 1) {
      uVar2 = 0;
      lVar3 = lVar5;
    }
    else {
      uVar2 = uVar1 & 0xfffffffffffffffe;
      lVar3 = lVar5 + uVar2 * 0x38;
      puVar4 = (undefined4 *)(lVar5 + 0x44);
      uVar6 = uVar2;
      do {
        puVar4[-0xe] = 0;
        *puVar4 = 0;
        uVar6 = uVar6 - 2;
        puVar4 = puVar4 + 0x1c;
      } while (uVar6 != 0);
      if (uVar1 == uVar2) {
        return;
      }
    }
    puVar4 = (undefined4 *)(lVar3 + 0xc);
    do {
      uVar2 = uVar2 + 1;
      *puVar4 = 0;
      puVar4 = puVar4 + 0xe;
    } while (uVar2 < uVar1);
  }
  return;
}

