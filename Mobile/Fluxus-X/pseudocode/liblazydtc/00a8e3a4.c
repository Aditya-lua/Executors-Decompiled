/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8e3a4
 */

void BF_set_key(BF_KEY *key,int len,uchar *data)

{
  uchar *puVar1;
  uchar *puVar2;
  uchar *puVar3;
  uchar *puVar4;
  long lVar5;
  uint uVar6;
  uchar *puVar7;
  ulong uVar8;
  undefined8 local_28;
  
  memcpy(key,&DAT_0076a558,0x1048);
  if (0x47 < len) {
    len = 0x48;
  }
  lVar5 = 0;
  puVar1 = data + len;
  uVar6 = 0x243f6a88;
  puVar7 = data;
  while( true ) {
    puVar2 = puVar7 + 1;
    if (puVar1 <= puVar7 + 1) {
      puVar2 = data;
    }
    puVar3 = puVar2 + 1;
    if (puVar1 <= puVar2 + 1) {
      puVar3 = data;
    }
    puVar4 = puVar3 + 1;
    if (puVar1 <= puVar3 + 1) {
      puVar4 = data;
    }
    *(uint *)((long)key->P + lVar5) =
         CONCAT31(CONCAT21(CONCAT11(*puVar7,*puVar2),*puVar3),*puVar4) ^ uVar6;
    if (lVar5 == 0x44) break;
    uVar6 = *(uint *)((long)key->P + lVar5 + 4);
    puVar7 = puVar4 + 1;
    if (puVar1 <= puVar4 + 1) {
      puVar7 = data;
    }
    lVar5 = lVar5 + 4;
  }
  local_28 = 0;
  BF_encrypt((uint *)&local_28,key);
  *(undefined8 *)key->P = local_28;
  BF_encrypt((uint *)&local_28,key);
  *(undefined8 *)(key->P + 2) = local_28;
  BF_encrypt((uint *)&local_28,key);
  *(undefined8 *)(key->P + 4) = local_28;
  BF_encrypt((uint *)&local_28,key);
  *(undefined8 *)(key->P + 6) = local_28;
  BF_encrypt((uint *)&local_28,key);
  *(undefined8 *)(key->P + 8) = local_28;
  BF_encrypt((uint *)&local_28,key);
  *(undefined8 *)(key->P + 10) = local_28;
  BF_encrypt((uint *)&local_28,key);
  *(undefined8 *)(key->P + 0xc) = local_28;
  BF_encrypt((uint *)&local_28,key);
  *(undefined8 *)(key->P + 0xe) = local_28;
  BF_encrypt((uint *)&local_28,key);
  uVar8 = 0;
  lVar5 = 0x48;
  *(undefined8 *)(key->P + 0x10) = local_28;
  do {
    BF_encrypt((uint *)&local_28,key);
    uVar8 = uVar8 + 2;
    *(undefined8 *)((long)key->P + lVar5) = local_28;
    lVar5 = lVar5 + 8;
  } while (uVar8 < 0x400);
  return;
}

