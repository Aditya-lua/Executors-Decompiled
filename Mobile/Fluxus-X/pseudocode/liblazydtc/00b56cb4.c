/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b56cb4
 */

bool FUN_00b56cb4(long param_1,long param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5
                 ,undefined8 param_6,undefined8 param_7)

{
  uint uVar1;
  bool bVar2;
  int iVar3;
  uchar *key;
  undefined8 *puVar4;
  
  if (param_2 == 0) {
    bVar2 = false;
  }
  else {
    puVar4 = *(undefined8 **)(param_1 + 0xf8);
    key = (uchar *)((long)puVar4 + 0x34);
    *(undefined8 *)((long)puVar4 + 0x3c) = 0;
    key[0] = '\0';
    key[1] = '\0';
    key[2] = '\0';
    key[3] = '\0';
    key[4] = '\0';
    key[5] = '\0';
    key[6] = '\0';
    key[7] = '\0';
    *(undefined8 *)((long)puVar4 + 0x5c) = 0;
    *(undefined8 *)((long)puVar4 + 0x54) = 0;
    *(undefined8 *)((long)puVar4 + 0x4c) = 0;
    *(undefined8 *)((long)puVar4 + 0x44) = 0;
    iVar3 = EVP_CipherInit_ex((EVP_CIPHER_CTX *)*puVar4,(EVP_CIPHER *)0x0,(ENGINE *)0x0,key,
                              (uchar *)0x0,-1);
    bVar2 = false;
    if (iVar3 != 0) {
      uVar1 = *(byte *)((long)puVar4 + 99) + 1;
      *(char *)((long)puVar4 + 99) = (char)uVar1;
      uVar1 = (uint)*(byte *)((long)puVar4 + 0x62) + (uVar1 >> 8);
      *(char *)((long)puVar4 + 0x62) = (char)uVar1;
      uVar1 = (uint)*(byte *)((long)puVar4 + 0x61) + (uVar1 >> 8);
      *(char *)((long)puVar4 + 0x61) = (char)uVar1;
      uVar1 = (uint)*(byte *)(puVar4 + 0xc) + (uVar1 >> 8);
      *(char *)(puVar4 + 0xc) = (char)uVar1;
      uVar1 = (uint)*(byte *)((long)puVar4 + 0x5f) + (uVar1 >> 8);
      *(char *)((long)puVar4 + 0x5f) = (char)uVar1;
      uVar1 = (uint)*(byte *)((long)puVar4 + 0x5e) + (uVar1 >> 8);
      *(char *)((long)puVar4 + 0x5e) = (char)uVar1;
      uVar1 = (uint)*(byte *)((long)puVar4 + 0x5d) + (uVar1 >> 8);
      *(char *)((long)puVar4 + 0x5d) = (char)uVar1;
      uVar1 = (uint)*(byte *)((long)puVar4 + 0x5c) + (uVar1 >> 8);
      *(char *)((long)puVar4 + 0x5c) = (char)uVar1;
      uVar1 = (uint)*(byte *)((long)puVar4 + 0x5b) + (uVar1 >> 8);
      *(char *)((long)puVar4 + 0x5b) = (char)uVar1;
      uVar1 = (uint)*(byte *)((long)puVar4 + 0x5a) + (uVar1 >> 8);
      *(char *)((long)puVar4 + 0x5a) = (char)uVar1;
      uVar1 = (uint)*(byte *)((long)puVar4 + 0x59) + (uVar1 >> 8);
      *(char *)((long)puVar4 + 0x59) = (char)uVar1;
      uVar1 = (uint)*(byte *)(puVar4 + 0xb) + (uVar1 >> 8);
      *(char *)(puVar4 + 0xb) = (char)uVar1;
      uVar1 = (uint)*(byte *)((long)puVar4 + 0x57) + (uVar1 >> 8);
      *(char *)((long)puVar4 + 0x57) = (char)uVar1;
      uVar1 = (uint)*(byte *)((long)puVar4 + 0x56) + (uVar1 >> 8);
      *(char *)((long)puVar4 + 0x56) = (char)uVar1;
      iVar3 = (uint)*(byte *)((long)puVar4 + 0x55) + (uVar1 >> 8);
      *(char *)((long)puVar4 + 0x55) = (char)iVar3;
      *(char *)((long)puVar4 + 0x54) = *(char *)((long)puVar4 + 0x54) + (char)((uint)iVar3 >> 8);
      iVar3 = FUN_00b57484(param_1,param_2,param_3,param_6,param_7,param_4,param_5);
      bVar2 = iVar3 != 0;
    }
  }
  return bVar2;
}

