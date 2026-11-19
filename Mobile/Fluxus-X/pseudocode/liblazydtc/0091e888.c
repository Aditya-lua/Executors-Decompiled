/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091e888
 */

/* WARNING: Removing unreachable block (ram,0x0091ea20) */
/* WARNING: Removing unreachable block (ram,0x0091ea28) */

undefined8 FUN_0091e888(byte *param_1,ulong param_2,undefined8 *param_3,long *param_4)

{
  byte *pbVar1;
  uint uVar2;
  char *pcVar3;
  char *pcVar4;
  undefined8 uVar5;
  char *pcVar6;
  
  *param_3 = 0;
  *param_4 = 0;
  if (param_2 == 0) {
    param_2 = strlen((char *)param_1);
  }
  pcVar3 = (char *)(*(code *)PTR_malloc_00cc4670)((param_2 + 2) / 3 << 2 | 1);
  if (pcVar3 == (char *)0x0) {
    uVar5 = 0x1b;
  }
  else {
    pcVar6 = pcVar3;
    if (2 < param_2) {
      pcVar4 = pcVar3;
      do {
        param_2 = param_2 - 3;
        *pcVar4 = " !\"#$%&\'()*+,-./0123ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/="
                  [(ulong)(*param_1 >> 2) + 0x14];
        pcVar4[1] = " !\"#$%&\'()*+,-./0123ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/="
                    [(ulong)((uint)(param_1[1] >> 4) | (*param_1 & 3) << 4) + 0x14];
        pcVar4[2] = " !\"#$%&\'()*+,-./0123ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/="
                    [(ulong)((uint)(param_1[2] >> 6) | (param_1[1] & 0xf) << 2) + 0x14];
        pbVar1 = param_1 + 2;
        param_1 = param_1 + 3;
        pcVar6 = pcVar4 + 4;
        pcVar4[3] = " !\"#$%&\'()*+,-./0123ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/="
                    [((ulong)*pbVar1 & 0x3f) + 0x14];
        pcVar4 = pcVar6;
      } while (2 < param_2);
    }
    if (param_2 != 0) {
      *pcVar6 = " !\"#$%&\'()*+,-./0123ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/="
                [(ulong)(*param_1 >> 2) + 0x14];
      uVar2 = (*param_1 & 3) << 4;
      if (param_2 == 1) {
        pcVar6[1] = " !\"#$%&\'()*+,-./0123ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/="
                    [(ulong)uVar2 + 0x14];
        pcVar6[2] = '=';
      }
      else {
        pcVar6[1] = " !\"#$%&\'()*+,-./0123ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/="
                    [(ulong)(uVar2 | param_1[1] >> 4) + 0x14];
        pcVar6[2] = " !\"#$%&\'()*+,-./0123ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/="
                    [(ulong)((param_1[1] & 0xf) << 2) + 0x14];
      }
      pcVar6[3] = '=';
      pcVar6 = pcVar6 + 4;
    }
    uVar5 = 0;
    *pcVar6 = '\0';
    *param_3 = pcVar3;
    *param_4 = (long)pcVar6 - (long)pcVar3;
  }
  return uVar5;
}

