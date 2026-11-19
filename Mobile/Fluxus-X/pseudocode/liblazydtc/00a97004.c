/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a97004
 */

void IDEA_set_encrypt_key(byte *param_1,uint *param_2)

{
  uint *puVar1;
  byte bVar2;
  long lVar3;
  
  bVar2 = *param_1;
  *param_2 = (uint)bVar2 << 8;
  *param_2 = (uint)CONCAT11(bVar2,param_1[1]);
  bVar2 = param_1[2];
  param_2[1] = (uint)bVar2 << 8;
  param_2[1] = (uint)CONCAT11(bVar2,param_1[3]);
  bVar2 = param_1[4];
  param_2[2] = (uint)bVar2 << 8;
  param_2[2] = (uint)CONCAT11(bVar2,param_1[5]);
  bVar2 = param_1[6];
  param_2[3] = (uint)bVar2 << 8;
  param_2[3] = (uint)CONCAT11(bVar2,param_1[7]);
  bVar2 = param_1[8];
  param_2[4] = (uint)bVar2 << 8;
  param_2[4] = (uint)CONCAT11(bVar2,param_1[9]);
  bVar2 = param_1[10];
  param_2[5] = (uint)bVar2 << 8;
  param_2[5] = (uint)CONCAT11(bVar2,param_1[0xb]);
  bVar2 = param_1[0xc];
  param_2[6] = (uint)bVar2 << 8;
  param_2[6] = (uint)CONCAT11(bVar2,param_1[0xd]);
  bVar2 = param_1[0xe];
  param_2[7] = (uint)bVar2 << 8;
  lVar3 = 0x20;
  param_2[7] = (uint)CONCAT11(bVar2,param_1[0xf]);
  while( true ) {
    puVar1 = (uint *)((long)param_2 + lVar3);
    *puVar1 = (puVar1[-6] >> 7 | puVar1[-7] << 9) & 0xffff;
    puVar1[1] = (puVar1[-5] >> 7 | puVar1[-6] << 9) & 0xffff;
    puVar1[2] = (puVar1[-4] >> 7 | puVar1[-5] << 9) & 0xffff;
    puVar1[3] = (puVar1[-3] >> 7 | puVar1[-4] << 9) & 0xffff;
    puVar1[4] = (puVar1[-2] >> 7 | puVar1[-3] << 9) & 0xffff;
    puVar1[5] = (puVar1[-1] >> 7 | puVar1[-2] << 9) & 0xffff;
    if ((int)lVar3 == 0xc0) break;
    lVar3 = lVar3 + 0x20;
    puVar1[6] = (puVar1[-8] >> 7 | puVar1[-1] << 9) & 0xffff;
    puVar1[7] = (puVar1[-8] << 9 | puVar1[-7] >> 7) & 0xffff;
  }
  return;
}

