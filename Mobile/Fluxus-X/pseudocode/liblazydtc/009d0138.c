/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d0138
 */

undefined8 tls_validate_all_contexts(long param_1,uint param_2,long param_3)

{
  uint uVar1;
  long lVar2;
  long lVar3;
  uint *puVar4;
  uint uVar5;
  ulong uVar6;
  undefined4 *puVar7;
  uint *puVar8;
  undefined1 auStack_48 [8];
  
  if ((param_2 >> 7 & 1) == 0) {
    uVar5 = (param_2 >> 7 ^ 0xffffffff) & 2;
  }
  else {
    uVar5 = 1;
  }
  lVar3 = *(long *)(*(long *)(param_1 + 0x898) + 0x1e0);
  if (lVar3 != -0x1a) {
    uVar6 = 0;
    puVar7 = (undefined4 *)(param_3 + 0x18);
    puVar8 = &DAT_00c581ec;
    do {
      if (puVar7[-2] != 0) {
        puVar4 = puVar8;
        if (0x19 < uVar6) {
          lVar2 = custom_ext_find(*(long *)(param_1 + 0x898) + 0x1d8,uVar5,*puVar7,auStack_48);
          if (lVar2 == 0) {
            return 0;
          }
          puVar4 = (uint *)(lVar2 + 8);
        }
        uVar1 = *puVar4;
        if ((uVar1 & param_2) == 0) {
          return 0;
        }
        if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) == 0) {
          uVar1 = uVar1 >> 1;
        }
        if ((uVar1 & 1) != 0) {
          return 0;
        }
      }
      uVar6 = uVar6 + 1;
      puVar7 = puVar7 + 10;
      puVar8 = puVar8 + 0xe;
    } while (uVar6 < lVar3 + 0x1aU);
  }
  return 1;
}

