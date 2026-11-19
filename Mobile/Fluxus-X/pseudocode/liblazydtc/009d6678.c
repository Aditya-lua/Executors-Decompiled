/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d6678
 */

undefined8
FUN_009d6678(long param_1,int param_2,uint param_3,uint param_4,long param_5,long param_6,
            undefined8 param_7,undefined8 param_8,undefined8 param_9)

{
  int iVar1;
  ushort *addr;
  void *pvVar2;
  undefined8 *puVar3;
  ulong uVar4;
  ulong uVar5;
  ushort *puVar6;
  long lVar7;
  
  lVar7 = *(long *)(param_1 + 0x158);
  if ((param_5 == 0) && (param_6 != 0)) {
    return 0;
  }
  if (((param_3 == 0x12) && ((param_4 >> 7 & 1) != 0)) &&
     (iVar1 = SSL_CTX_ct_is_enabled(), iVar1 != 0)) {
    return 0;
  }
  iVar1 = SSL_extension_supported(param_3);
  if (param_3 >> 0x10 == 0) {
    if (param_3 != 0x12 && iVar1 != 0) {
      return 0;
    }
    uVar4 = *(ulong *)(lVar7 + 0x1e0);
    if (uVar4 == 0) {
      addr = *(ushort **)(lVar7 + 0x1d8);
    }
    else {
      addr = *(ushort **)(lVar7 + 0x1d8);
      uVar5 = 0;
      puVar6 = addr;
      do {
        if (*puVar6 == param_3) {
          if (param_2 == 2) {
            if (puVar6 != (ushort *)0x0) {
              return 0;
            }
            break;
          }
          if (*(int *)(puVar6 + 2) == param_2) {
            return 0;
          }
          if (*(int *)(puVar6 + 2) == 2) {
            return 0;
          }
        }
        uVar5 = uVar5 + 1;
        puVar6 = puVar6 + 0x1c;
      } while (uVar5 < uVar4);
    }
    pvVar2 = CRYPTO_realloc(addr,(int)uVar4 * 0x38 + 0x38,"ssl/statem/extensions_cust.c",0x189);
    if (pvVar2 != (void *)0x0) {
      *(void **)(lVar7 + 0x1d8) = pvVar2;
      puVar3 = (undefined8 *)((long)pvVar2 + *(long *)(lVar7 + 0x1e0) * 0x38);
      *puVar3 = 0;
      puVar3[1] = 0;
      *(int *)((long)puVar3 + 4) = param_2;
      *(uint *)(puVar3 + 1) = param_4;
      puVar3[4] = param_7;
      puVar3[5] = param_8;
      puVar3[2] = param_5;
      puVar3[3] = param_6;
      *(short *)puVar3 = (short)param_3;
      puVar3[6] = param_9;
      *(long *)(lVar7 + 0x1e0) = *(long *)(lVar7 + 0x1e0) + 1;
      return 1;
    }
  }
  return 0;
}

