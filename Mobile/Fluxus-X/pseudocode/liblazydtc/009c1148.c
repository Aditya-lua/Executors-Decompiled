/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c1148
 */

undefined8 tls_group_allowed(long param_1,uint param_2,undefined4 param_3)

{
  undefined8 uVar1;
  undefined4 uVar2;
  ushort *puVar3;
  ulong uVar4;
  ulong uVar5;
  ushort *puVar6;
  undefined1 local_14;
  undefined1 local_13;
  
  uVar4 = *(ulong *)(*(long *)(param_1 + 0x9a8) + 0x630);
  if (uVar4 != 0) {
    uVar5 = 0;
    puVar3 = (ushort *)(*(long *)(*(long *)(param_1 + 0x9a8) + 0x628) + 0x1c);
    do {
      if ((uint)*puVar3 == (param_2 & 0xffff)) {
        if (puVar3 == (ushort *)0x1c) {
          return 0;
        }
        local_14 = (undefined1)(param_2 >> 8);
        local_13 = (undefined1)param_2;
        if ((param_2 & 0xffff) == 0) goto LAB_009c11dc;
        uVar4 = 0;
        puVar6 = &DAT_0074cc38;
        goto LAB_009c11c0;
      }
      uVar5 = uVar5 + 1;
      puVar3 = puVar3 + 0x1c;
    } while (uVar5 < uVar4);
  }
  return 0;
  while( true ) {
    uVar4 = uVar4 + 1;
    puVar6 = puVar6 + 4;
    if (0x29 < uVar4) break;
LAB_009c11c0:
    if ((uint)*puVar6 == (param_2 & 0xffff)) {
      uVar2 = *(undefined4 *)(puVar6 + -2);
      goto LAB_009c11f0;
    }
  }
LAB_009c11dc:
  uVar2 = 0;
LAB_009c11f0:
  uVar1 = ssl_security(param_1,param_3,*(undefined4 *)(puVar3 + -2),uVar2,&local_14);
  return uVar1;
}

