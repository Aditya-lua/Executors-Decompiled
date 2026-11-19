/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b754c0
 */

undefined8 mbedtls_des3_crypt_ecb(long param_1,uint *param_2,uint *param_3)

{
  uint *puVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  long lVar6;
  
  uVar5 = (*param_2 & 0xff00ff00) >> 8 | (*param_2 & 0xff00ff) << 8;
  uVar3 = uVar5 >> 0x10 | uVar5 << 0x10;
  uVar5 = (param_2[1] & 0xff00ff00) >> 8 | (param_2[1] & 0xff00ff) << 8;
  uVar4 = uVar5 >> 0x10 | uVar5 << 0x10;
  uVar5 = (uVar4 ^ uVar3 >> 4) & 0xf0f0f0f;
  uVar4 = uVar5 ^ uVar4;
  uVar3 = uVar3 ^ uVar5 << 4;
  uVar5 = uVar4 & 0xffff ^ uVar3 >> 0x10;
  uVar4 = uVar5 ^ uVar4;
  uVar3 = uVar3 ^ uVar5 << 0x10;
  uVar5 = (uVar3 ^ uVar4 >> 2) & 0x33333333;
  uVar3 = uVar5 ^ uVar3;
  uVar4 = uVar4 ^ uVar5 << 2;
  uVar5 = (uVar3 ^ uVar4 >> 8) & 0xff00ff;
  uVar3 = uVar5 ^ uVar3;
  uVar4 = uVar4 ^ uVar5 << 8;
  uVar5 = (uVar3 ^ uVar4 << 1) & 0xaaaaaaaa;
  uVar4 = uVar5 ^ (uVar4 >> 0x1f | uVar4 << 1);
  uVar5 = uVar5 ^ uVar3;
  uVar5 = uVar5 >> 0x1f | uVar5 << 1;
  lVar6 = 0;
  do {
    puVar1 = (uint *)(param_1 + lVar6);
    lVar6 = lVar6 + 0x10;
    uVar3 = *puVar1 ^ uVar4;
    uVar2 = puVar1[1] ^ (uVar4 >> 4 | uVar4 << 0x1c);
    uVar5 = *(uint *)(&LAB_0077e940 + (ulong)(uVar3 & 0x3f) * 4) ^ uVar5 ^
            *(uint *)(&DAT_0077ea40 + (ulong)(uVar3 >> 8 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077eb40 + (ulong)(uVar3 >> 0x10 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ec40 + (ulong)(uVar3 >> 0x18 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ed40 + (ulong)(uVar2 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ee40 + (ulong)(uVar2 >> 8 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ef40 + (ulong)(uVar2 >> 0x10 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077f040 + (ulong)(uVar2 >> 0x18 & 0x3f) * 4);
    uVar3 = puVar1[2] ^ uVar5;
    uVar2 = puVar1[3] ^ (uVar5 >> 4 | uVar5 << 0x1c);
    uVar4 = *(uint *)(&LAB_0077e940 + (ulong)(uVar3 & 0x3f) * 4) ^ uVar4 ^
            *(uint *)(&DAT_0077ea40 + (ulong)(uVar3 >> 8 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077eb40 + (ulong)(uVar3 >> 0x10 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ec40 + (ulong)(uVar3 >> 0x18 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ed40 + (ulong)(uVar2 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ee40 + (ulong)(uVar2 >> 8 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ef40 + (ulong)(uVar2 >> 0x10 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077f040 + (ulong)(uVar2 >> 0x18 & 0x3f) * 4);
  } while ((int)lVar6 != 0x80);
  lVar6 = 0;
  do {
    puVar1 = (uint *)(param_1 + 0x80 + lVar6);
    lVar6 = lVar6 + 0x10;
    uVar3 = *puVar1 ^ uVar5;
    uVar2 = puVar1[1] ^ (uVar5 >> 4 | uVar5 << 0x1c);
    uVar4 = *(uint *)(&LAB_0077e940 + (ulong)(uVar3 & 0x3f) * 4) ^ uVar4 ^
            *(uint *)(&DAT_0077ea40 + (ulong)(uVar3 >> 8 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077eb40 + (ulong)(uVar3 >> 0x10 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ec40 + (ulong)(uVar3 >> 0x18 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ed40 + (ulong)(uVar2 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ee40 + (ulong)(uVar2 >> 8 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ef40 + (ulong)(uVar2 >> 0x10 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077f040 + (ulong)(uVar2 >> 0x18 & 0x3f) * 4);
    uVar3 = puVar1[2] ^ uVar4;
    uVar2 = puVar1[3] ^ (uVar4 >> 4 | uVar4 << 0x1c);
    uVar5 = *(uint *)(&LAB_0077e940 + (ulong)(uVar3 & 0x3f) * 4) ^ uVar5 ^
            *(uint *)(&DAT_0077ea40 + (ulong)(uVar3 >> 8 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077eb40 + (ulong)(uVar3 >> 0x10 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ec40 + (ulong)(uVar3 >> 0x18 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ed40 + (ulong)(uVar2 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ee40 + (ulong)(uVar2 >> 8 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ef40 + (ulong)(uVar2 >> 0x10 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077f040 + (ulong)(uVar2 >> 0x18 & 0x3f) * 4);
  } while ((int)lVar6 != 0x80);
  lVar6 = 0;
  do {
    puVar1 = (uint *)(param_1 + 0x100 + lVar6);
    lVar6 = lVar6 + 0x10;
    uVar3 = *puVar1 ^ uVar4;
    uVar2 = puVar1[1] ^ (uVar4 >> 4 | uVar4 << 0x1c);
    uVar5 = *(uint *)(&LAB_0077e940 + (ulong)(uVar3 & 0x3f) * 4) ^ uVar5 ^
            *(uint *)(&DAT_0077ea40 + (ulong)(uVar3 >> 8 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077eb40 + (ulong)(uVar3 >> 0x10 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ec40 + (ulong)(uVar3 >> 0x18 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ed40 + (ulong)(uVar2 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ee40 + (ulong)(uVar2 >> 8 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ef40 + (ulong)(uVar2 >> 0x10 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077f040 + (ulong)(uVar2 >> 0x18 & 0x3f) * 4);
    uVar3 = puVar1[2] ^ uVar5;
    uVar2 = puVar1[3] ^ (uVar5 >> 4 | uVar5 << 0x1c);
    uVar4 = *(uint *)(&LAB_0077e940 + (ulong)(uVar3 & 0x3f) * 4) ^ uVar4 ^
            *(uint *)(&DAT_0077ea40 + (ulong)(uVar3 >> 8 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077eb40 + (ulong)(uVar3 >> 0x10 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ec40 + (ulong)(uVar3 >> 0x18 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ed40 + (ulong)(uVar2 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ee40 + (ulong)(uVar2 >> 8 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077ef40 + (ulong)(uVar2 >> 0x10 & 0x3f) * 4) ^
            *(uint *)(&DAT_0077f040 + (ulong)(uVar2 >> 0x18 & 0x3f) * 4);
  } while ((int)lVar6 != 0x80);
  uVar4 = uVar4 >> 1 | uVar4 << 0x1f;
  uVar3 = (uVar4 ^ uVar5) & 0xaaaaaaaa;
  uVar4 = uVar3 ^ uVar4;
  uVar3 = (uint)(CONCAT44(uVar5,uVar3 ^ uVar5) >> 1);
  uVar5 = (uVar4 ^ uVar3 >> 8) & 0xff00ff;
  uVar4 = uVar5 ^ uVar4;
  uVar3 = uVar3 ^ uVar5 << 8;
  uVar5 = (uVar4 ^ uVar3 >> 2) & 0x33333333;
  uVar4 = uVar5 ^ uVar4;
  uVar3 = uVar3 ^ uVar5 << 2;
  uVar5 = uVar3 & 0xffff ^ uVar4 >> 0x10;
  uVar3 = uVar5 ^ uVar3;
  uVar4 = uVar4 ^ uVar5 << 0x10;
  uVar5 = (uVar3 ^ uVar4 >> 4) & 0xf0f0f0f;
  uVar3 = uVar5 ^ uVar3;
  uVar4 = uVar4 ^ uVar5 << 4;
  uVar5 = (uVar4 & 0xff00ff00) >> 8 | (uVar4 & 0xff00ff) << 8;
  uVar3 = (uVar3 & 0xff00ff00) >> 8 | (uVar3 & 0xff00ff) << 8;
  *param_3 = uVar5 >> 0x10 | uVar5 << 0x10;
  param_3[1] = uVar3 >> 0x10 | uVar3 << 0x10;
  return 0;
}

