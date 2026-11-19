/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00adf568
 */

undefined8 ossl_sha1_ctrl(SHA_CTX *param_1,int param_2,int param_3,void *param_4)

{
  uint *puVar1;
  uint uVar2;
  uint uVar3;
  ulong uVar4;
  undefined8 *puVar5;
  size_t sVar6;
  undefined8 local_7c;
  undefined8 uStack_74;
  undefined4 local_6c;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  undefined1 auStack_50 [8];
  undefined8 local_48;
  
  if (param_2 != 0x1d) {
    return 0xfffffffe;
  }
  if (param_1 == (SHA_CTX *)0x0) {
    return 0;
  }
  if (param_3 != 0x30) {
    return 0;
  }
  SHA1_Update(param_1,param_4,0x30);
  auStack_50 = (undefined1  [8])0x3636363636363636;
  local_48 = 0x3636363636363636;
  uStack_60 = 0x3636363636363636;
  local_58 = 0x3636363636363636;
  local_68 = 0x3636363636363636;
  uVar2 = param_1->Nl;
  uVar3 = param_1->Nh;
  if (0xfffffebf < uVar2) {
    uVar3 = uVar3 + 1;
    param_1->Nh = uVar3;
  }
  uVar4 = (ulong)param_1->num;
  puVar1 = param_1->data;
  param_1->Nl = uVar2 + 0x140;
  param_1->Nh = uVar3;
  if (param_1->num == 0) {
    puVar5 = &local_68;
    sVar6 = 0x28;
LAB_00adf690:
    param_1->num = (uint)sVar6;
    memcpy(puVar1,puVar5,sVar6);
  }
  else {
    puVar5 = (undefined8 *)((long)puVar1 + uVar4);
    if (uVar4 + 0x28 < 0x40) {
      puVar5[4] = 0x3636363636363636;
      puVar5[3] = 0x3636363636363636;
      puVar5[2] = 0x3636363636363636;
      puVar5[1] = 0x3636363636363636;
      *puVar5 = 0x3636363636363636;
      param_1->num = param_1->num + 0x28;
    }
    else {
      sVar6 = -uVar4 + 0x40;
      memcpy(puVar5,&local_68,sVar6);
      FUN_00ade188(param_1,puVar1,1);
      puVar5 = (undefined8 *)(auStack_50 + -uVar4 + 0x28);
      sVar6 = 0x28 - sVar6;
      memset(puVar1,0,0x44);
      if (sVar6 >> 6 != 0) {
        FUN_00ade188(param_1,puVar5);
        puVar5 = (undefined8 *)((long)puVar5 + (sVar6 & 0xffffffffffffffc0));
        sVar6 = sVar6 - (sVar6 & 0xffffffffffffffc0);
      }
      if (sVar6 != 0) goto LAB_00adf690;
    }
  }
  SHA1_Final((uchar *)&local_7c,param_1);
  memset(&param_1->Nl,0,0x4c);
  param_1->h2 = 0x98badcfe;
  param_1->h3 = 0x10325476;
  param_1->h0 = 0x67452301;
  param_1->h1 = 0xefcdab89;
  param_1->h4 = 0xc3d2e1f0;
  SHA1_Update(param_1,param_4,0x30);
  auStack_50 = (undefined1  [8])0x5c5c5c5c5c5c5c5c;
  local_48 = 0x5c5c5c5c5c5c5c5c;
  uStack_60 = 0x5c5c5c5c5c5c5c5c;
  local_58 = 0x5c5c5c5c5c5c5c5c;
  local_68 = 0x5c5c5c5c5c5c5c5c;
  uVar3 = param_1->Nh;
  if (0xfffffebf < param_1->Nl) {
    uVar3 = uVar3 + 1;
    param_1->Nh = uVar3;
  }
  uVar4 = (ulong)param_1->num;
  puVar1 = param_1->data;
  param_1->Nl = param_1->Nl + 0x140;
  param_1->Nh = uVar3;
  if (param_1->num == 0) {
    puVar5 = &local_68;
    sVar6 = 0x28;
LAB_00adf7d8:
    param_1->num = (uint)sVar6;
    memcpy(puVar1,puVar5,sVar6);
  }
  else {
    puVar5 = (undefined8 *)((long)puVar1 + uVar4);
    if (uVar4 + 0x28 < 0x40) {
      puVar5[4] = 0x5c5c5c5c5c5c5c5c;
      puVar5[3] = 0x5c5c5c5c5c5c5c5c;
      puVar5[2] = 0x5c5c5c5c5c5c5c5c;
      puVar5[1] = 0x5c5c5c5c5c5c5c5c;
      *puVar5 = 0x5c5c5c5c5c5c5c5c;
      param_1->num = param_1->num + 0x28;
    }
    else {
      sVar6 = -uVar4 + 0x40;
      memcpy(puVar5,&local_68,sVar6);
      FUN_00ade188(param_1,puVar1,1);
      puVar5 = (undefined8 *)(auStack_50 + -uVar4 + 0x28);
      sVar6 = 0x28 - sVar6;
      memset(puVar1,0,0x44);
      if (sVar6 >> 6 != 0) {
        FUN_00ade188(param_1,puVar5);
        puVar5 = (undefined8 *)((long)puVar5 + (sVar6 & 0xffffffffffffffc0));
        sVar6 = sVar6 - (sVar6 & 0xffffffffffffffc0);
      }
      if (sVar6 != 0) goto LAB_00adf7d8;
    }
  }
  uVar3 = param_1->Nh;
  if (0xffffff5f < param_1->Nl) {
    uVar3 = uVar3 + 1;
    param_1->Nh = uVar3;
  }
  uVar4 = (ulong)param_1->num;
  puVar1 = param_1->data;
  param_1->Nl = param_1->Nl + 0xa0;
  param_1->Nh = uVar3;
  if (param_1->num == 0) {
    puVar5 = &local_7c;
    sVar6 = 0x14;
  }
  else {
    puVar5 = (undefined8 *)((long)puVar1 + uVar4);
    if (uVar4 + 0x14 < 0x40) {
      *(undefined4 *)(puVar5 + 2) = local_6c;
      puVar5[1] = uStack_74;
      *puVar5 = local_7c;
      param_1->num = param_1->num + 0x14;
      goto LAB_00adf8f4;
    }
    sVar6 = -uVar4 + 0x40;
    memcpy(puVar5,&local_7c,sVar6);
    FUN_00ade188(param_1,puVar1,1);
    puVar5 = (undefined8 *)(auStack_50 + -uVar4 + 0x14);
    sVar6 = 0x14 - sVar6;
    memset(puVar1,0,0x44);
    if (sVar6 >> 6 != 0) {
      FUN_00ade188(param_1,puVar5);
      puVar5 = (undefined8 *)((long)puVar5 + (sVar6 & 0xffffffffffffffc0));
      sVar6 = sVar6 - (sVar6 & 0xffffffffffffffc0);
    }
    if (sVar6 == 0) goto LAB_00adf8f4;
  }
  param_1->num = (uint)sVar6;
  memcpy(puVar1,puVar5,sVar6);
LAB_00adf8f4:
  OPENSSL_cleanse(&local_7c,0x14);
  return 1;
}

