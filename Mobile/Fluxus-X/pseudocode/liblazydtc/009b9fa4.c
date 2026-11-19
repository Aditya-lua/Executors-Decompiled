/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b9fa4
 */

undefined * FUN_009b9fa4(uint *param_1,char *param_2)

{
  uint uVar1;
  ushort uVar2;
  int iVar3;
  undefined *puVar4;
  ulong uVar5;
  
  if (param_2 != (char *)0x0) {
    uVar5 = 0;
    puVar4 = &DAT_00c56950;
    do {
      uVar2 = *(ushort *)(puVar4 + 0x18);
      uVar1 = *param_1;
      if (((((uVar2 >> 3 & 1) == 0) || ((uVar1 >> 3 & 1) != 0)) &&
          (((uVar2 >> 2 & 1) == 0 || ((uVar1 >> 2 & 1) != 0)))) &&
         (((uVar1 >> 5 | uVar2 >> 5 ^ 0xffffffff) & 1) != 0)) {
        if ((((uVar1 & 1) != 0) && (*(char **)(puVar4 + 0x10) != (char *)0x0)) &&
           (iVar3 = strcmp(*(char **)(puVar4 + 0x10),param_2), iVar3 == 0)) {
          return puVar4;
        }
        if ((((uVar1 >> 1 & 1) != 0) && (*(long *)(puVar4 + 8) != 0)) &&
           (iVar3 = OPENSSL_strcasecmp(*(long *)(puVar4 + 8),param_2), iVar3 == 0)) {
          return puVar4;
        }
      }
      uVar5 = uVar5 + 1;
      puVar4 = puVar4 + 0x20;
    } while (uVar5 < 0x36);
  }
  return (undefined *)0x0;
}

