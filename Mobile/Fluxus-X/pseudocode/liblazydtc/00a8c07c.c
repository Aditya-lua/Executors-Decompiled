/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8c07c
 */

void ossl_aria_encrypt(uint *param_1,undefined1 *param_2,uint *param_3)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint *puVar7;
  int iVar8;
  uint uVar9;
  uint uVar10;
  
  if ((((param_1 != (uint *)0x0) && (param_2 != (undefined1 *)0x0)) && (param_3 != (uint *)0x0)) &&
     ((uVar2 = param_3[0x44], uVar2 < 0x11 && ((1 << (ulong)(uVar2 & 0x1f) & 0x15000U) != 0)))) {
    uVar3 = (*param_1 & 0xff00ff00) >> 8 | (*param_1 & 0xff00ff) << 8;
    uVar5 = (param_1[1] & 0xff00ff00) >> 8 | (param_1[1] & 0xff00ff) << 8;
    uVar3 = *param_3 ^ (uVar3 >> 0x10 | uVar3 << 0x10);
    uVar5 = param_3[1] ^ (uVar5 >> 0x10 | uVar5 << 0x10);
    uVar9 = (param_1[2] & 0xff00ff00) >> 8 | (param_1[2] & 0xff00ff) << 8;
    uVar6 = (param_1[3] & 0xff00ff00) >> 8 | (param_1[3] & 0xff00ff) << 8;
    uVar9 = param_3[2] ^ (uVar9 >> 0x10 | uVar9 << 0x10);
    uVar6 = param_3[3] ^ (uVar6 >> 0x10 | uVar6 << 0x10);
    uVar1 = *(uint *)(&DAT_007698d0 + (ulong)(uVar9 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_007694d0 + (ulong)(uVar9 >> 0x18) * 4) ^
            *(uint *)(&DAT_00769cd0 + (ulong)(uVar9 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076a0d0 + (ulong)(uVar9 & 0xff) * 4);
    uVar9 = *(uint *)(&DAT_007698d0 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_007694d0 + (ulong)(uVar6 >> 0x18) * 4) ^
            *(uint *)(&DAT_00769cd0 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076a0d0 + (ulong)(uVar6 & 0xff) * 4);
    uVar6 = *(uint *)(&DAT_007698d0 + (ulong)(uVar3 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_007694d0 + (ulong)(uVar3 >> 0x18) * 4) ^
            *(uint *)(&DAT_00769cd0 + (ulong)(uVar3 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076a0d0 + (ulong)(uVar3 & 0xff) * 4);
    uVar3 = *(uint *)(&DAT_007698d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_007694d0 + (ulong)(uVar5 >> 0x18) * 4) ^
            *(uint *)(&DAT_00769cd0 + (ulong)(uVar5 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076a0d0 + (ulong)(uVar5 & 0xff) * 4) ^ uVar1;
    uVar1 = uVar9 ^ uVar1;
    uVar10 = uVar3 ^ uVar6;
    uVar9 = uVar9 ^ uVar3;
    uVar6 = uVar1 ^ uVar6;
    uVar1 = uVar1 ^ uVar10;
    uVar3 = (uVar9 & 0xff00ff00) >> 8 | (uVar9 & 0xff00ff) << 8;
    uVar4 = uVar3 >> 0x10 | uVar3 << 0x10;
    uVar9 = uVar1 >> 0x10 | uVar1 << 0x10;
    uVar3 = uVar9 ^ uVar4;
    uVar9 = ((uVar6 & 0xff00ff) << 8 | uVar6 >> 8 & 0xff00ff) ^ uVar9;
    uVar5 = param_3[5] ^ uVar10 ^ uVar3;
    uVar10 = uVar9 ^ uVar10;
    uVar9 = param_3[7] ^ uVar4 ^ uVar9;
    uVar6 = uVar10 ^ param_3[4];
    uVar10 = uVar3 ^ param_3[6] ^ uVar10;
    puVar7 = param_3 + 8;
    if (uVar2 != 2) {
      iVar8 = 2 - uVar2;
      do {
        uVar10 = *(uint *)(&DAT_0076a0d0 + (ulong)(uVar10 >> 0x10 & 0xff) * 4) ^
                 *(uint *)(&DAT_00769cd0 + (ulong)(uVar10 >> 0x18) * 4) ^
                 *(uint *)(&DAT_007694d0 + (ulong)(uVar10 >> 8 & 0xff) * 4) ^
                 *(uint *)(&DAT_007698d0 + (ulong)(uVar10 & 0xff) * 4);
        uVar9 = *(uint *)(&DAT_0076a0d0 + (ulong)(uVar9 >> 0x10 & 0xff) * 4) ^
                *(uint *)(&DAT_00769cd0 + (ulong)(uVar9 >> 0x18) * 4) ^
                *(uint *)(&DAT_007694d0 + (ulong)(uVar9 >> 8 & 0xff) * 4) ^
                *(uint *)(&DAT_007698d0 + (ulong)(uVar9 & 0xff) * 4);
        uVar6 = *(uint *)(&DAT_0076a0d0 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
                *(uint *)(&DAT_00769cd0 + (ulong)(uVar6 >> 0x18) * 4) ^
                *(uint *)(&DAT_007694d0 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
                *(uint *)(&DAT_007698d0 + (ulong)(uVar6 & 0xff) * 4);
        uVar3 = *(uint *)(&DAT_0076a0d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) ^
                *(uint *)(&DAT_00769cd0 + (ulong)(uVar5 >> 0x18) * 4) ^
                *(uint *)(&DAT_007694d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) ^
                *(uint *)(&DAT_007698d0 + (ulong)(uVar5 & 0xff) * 4) ^ uVar10;
        uVar10 = uVar9 ^ uVar10;
        uVar5 = uVar3 ^ uVar6;
        uVar9 = uVar9 ^ uVar3;
        uVar6 = uVar10 ^ uVar6;
        uVar10 = uVar10 ^ uVar5;
        uVar3 = (uVar6 & 0xff00ff00) >> 8 | (uVar6 & 0xff00ff) << 8;
        uVar6 = uVar5 >> 0x10 | uVar5 << 0x10;
        uVar3 = (uVar3 >> 0x10 | uVar3 << 0x10) ^ uVar10;
        uVar1 = (uVar9 & 0xff00ff) << 8 | uVar9 >> 8 & 0xff00ff;
        uVar5 = uVar3 ^ uVar6;
        uVar10 = uVar1 ^ uVar10;
        uVar9 = uVar5 ^ *puVar7;
        uVar6 = puVar7[1] ^ uVar6 ^ uVar10;
        uVar1 = uVar3 ^ puVar7[3] ^ uVar1;
        uVar10 = uVar5 ^ puVar7[2] ^ uVar10;
        uVar9 = *(uint *)(&DAT_007698d0 + (ulong)(uVar9 >> 0x10 & 0xff) * 4) ^
                *(uint *)(&DAT_007694d0 + (ulong)(uVar9 >> 0x18) * 4) ^
                *(uint *)(&DAT_00769cd0 + (ulong)(uVar9 >> 8 & 0xff) * 4) ^
                *(uint *)(&DAT_0076a0d0 + (ulong)(uVar9 & 0xff) * 4);
        uVar1 = *(uint *)(&DAT_007698d0 + (ulong)(uVar1 >> 0x10 & 0xff) * 4) ^
                *(uint *)(&DAT_007694d0 + (ulong)(uVar1 >> 0x18) * 4) ^
                *(uint *)(&DAT_00769cd0 + (ulong)(uVar1 >> 8 & 0xff) * 4) ^
                *(uint *)(&DAT_0076a0d0 + (ulong)(uVar1 & 0xff) * 4);
        uVar10 = *(uint *)(&DAT_007698d0 + (ulong)(uVar10 >> 0x10 & 0xff) * 4) ^
                 *(uint *)(&DAT_007694d0 + (ulong)(uVar10 >> 0x18) * 4) ^
                 *(uint *)(&DAT_00769cd0 + (ulong)(uVar10 >> 8 & 0xff) * 4) ^
                 *(uint *)(&DAT_0076a0d0 + (ulong)(uVar10 & 0xff) * 4);
        uVar3 = *(uint *)(&DAT_007698d0 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
                *(uint *)(&DAT_007694d0 + (ulong)(uVar6 >> 0x18) * 4) ^
                *(uint *)(&DAT_00769cd0 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
                *(uint *)(&DAT_0076a0d0 + (ulong)(uVar6 & 0xff) * 4) ^ uVar10;
        uVar10 = uVar1 ^ uVar10;
        uVar5 = uVar3 ^ uVar9;
        uVar9 = uVar10 ^ uVar9;
        uVar1 = uVar1 ^ uVar3;
        uVar10 = uVar10 ^ uVar5;
        uVar3 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
        uVar6 = uVar3 >> 0x10 | uVar3 << 0x10;
        uVar3 = uVar10 >> 0x10 | uVar10 << 0x10;
        uVar9 = ((uVar9 & 0xff00ff) << 8 | uVar9 >> 8 & 0xff00ff) ^ uVar3;
        uVar3 = uVar3 ^ uVar6;
        uVar10 = uVar9 ^ uVar5;
        uVar5 = puVar7[5] ^ uVar5 ^ uVar3;
        iVar8 = iVar8 + 2;
        uVar9 = puVar7[7] ^ uVar6 ^ uVar9;
        uVar6 = uVar10 ^ puVar7[4];
        uVar10 = uVar3 ^ puVar7[6] ^ uVar10;
        puVar7 = puVar7 + 8;
      } while (iVar8 != 0);
      puVar7 = param_3 + ((ulong)(uVar2 - 4 & 0xfffffffe) + 4) * 4;
    }
    uVar2 = ((*(uint *)(&DAT_0076a0d0 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) & 0xff00) << 8 |
             *(int *)(&DAT_00769cd0 + (ulong)(uVar6 >> 0x18) * 4) << 0x18 |
             (*(uint *)(&DAT_007694d0 + (ulong)(uVar6 >> 8 & 0xff) * 4) & 0xff) << 8 |
            (uint)(byte)(&DAT_007698d0)[(ulong)(uVar6 & 0xff) * 4]) ^ *puVar7;
    uVar3 = ((*(uint *)(&DAT_0076a0d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) & 0xff00) << 8 |
             *(int *)(&DAT_00769cd0 + (ulong)(uVar5 >> 0x18) * 4) << 0x18 |
             (*(uint *)(&DAT_007694d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) & 0xff) << 8 |
            (uint)(byte)(&DAT_007698d0)[(ulong)(uVar5 & 0xff) * 4]) ^ puVar7[1];
    uVar5 = ((*(uint *)(&DAT_0076a0d0 + (ulong)(uVar10 >> 0x10 & 0xff) * 4) & 0xff00) << 8 |
             *(int *)(&DAT_00769cd0 + (ulong)(uVar10 >> 0x18) * 4) << 0x18 |
             (*(uint *)(&DAT_007694d0 + (ulong)(uVar10 >> 8 & 0xff) * 4) & 0xff) << 8 |
            (uint)(byte)(&DAT_007698d0)[(ulong)(uVar10 & 0xff) * 4]) ^ puVar7[2];
    uVar9 = ((*(uint *)(&DAT_0076a0d0 + (ulong)(uVar9 >> 0x10 & 0xff) * 4) & 0xff00) << 8 |
             *(int *)(&DAT_00769cd0 + (ulong)(uVar9 >> 0x18) * 4) << 0x18 |
             (*(uint *)(&DAT_007694d0 + (ulong)(uVar9 >> 8 & 0xff) * 4) & 0xff) << 8 |
            (uint)(byte)(&DAT_007698d0)[(ulong)(uVar9 & 0xff) * 4]) ^ puVar7[3];
    param_2[3] = (char)uVar2;
    param_2[7] = (char)uVar3;
    param_2[0xb] = (char)uVar5;
    *param_2 = (char)(uVar2 >> 0x18);
    param_2[1] = (char)(uVar2 >> 0x10);
    param_2[2] = (char)(uVar2 >> 8);
    param_2[4] = (char)(uVar3 >> 0x18);
    param_2[5] = (char)(uVar3 >> 0x10);
    param_2[6] = (char)(uVar3 >> 8);
    param_2[8] = (char)(uVar5 >> 0x18);
    param_2[9] = (char)(uVar5 >> 0x10);
    param_2[10] = (char)(uVar5 >> 8);
    param_2[0xc] = (char)(uVar9 >> 0x18);
    param_2[0xd] = (char)(uVar9 >> 0x10);
    param_2[0xe] = (char)(uVar9 >> 8);
    param_2[0xf] = (char)uVar9;
  }
  return;
}

