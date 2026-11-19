/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bef50
 */

int i2d_SSL_SESSION(SSL_SESSION *in,uchar **pp)

{
  bool bVar1;
  int iVar2;
  size_t sVar3;
  undefined2 uVar4;
  long lVar5;
  char *pcVar6;
  undefined4 local_220 [2];
  long local_218;
  undefined8 uStack_210;
  undefined4 local_208 [2];
  long local_200;
  undefined8 uStack_1f8;
  undefined4 local_1f0 [2];
  char *local_1e8;
  undefined8 uStack_1e0;
  undefined4 local_1d8 [2];
  char *local_1d0;
  undefined8 uStack_1c8;
  undefined4 local_1c0 [2];
  char *local_1b8;
  undefined8 uStack_1b0;
  undefined4 local_1a8 [2];
  long local_1a0;
  undefined8 uStack_198;
  undefined4 local_190 [2];
  char *local_188;
  undefined8 uStack_180;
  undefined4 local_178 [2];
  undefined1 *local_170;
  undefined8 uStack_168;
  undefined4 local_160 [2];
  uchar *local_158;
  undefined8 uStack_150;
  undefined4 local_148 [2];
  SSL_SESSION *local_140;
  undefined8 uStack_138;
  undefined4 local_130 [2];
  uchar *local_128;
  undefined8 uStack_120;
  undefined4 local_118 [2];
  undefined1 *local_110;
  undefined8 uStack_108;
  undefined4 local_100;
  int local_fc;
  undefined4 *local_f8;
  undefined4 *local_f0;
  undefined4 *local_e8;
  undefined4 *local_e0;
  undefined8 local_d0;
  undefined8 local_c8;
  undefined8 local_c0;
  undefined4 *puStack_b8;
  undefined4 local_b0;
  undefined4 *local_a8;
  long local_a0;
  undefined4 local_98;
  undefined4 *local_90;
  undefined4 *local_88;
  undefined4 *local_80;
  undefined4 *local_78;
  ulong local_70;
  undefined4 local_68;
  undefined4 *local_60;
  uint local_58;
  undefined1 *local_50;
  undefined4 local_48;
  undefined1 local_38 [4];
  undefined1 local_34;
  undefined1 local_33;
  
  iVar2 = 0;
  if (in != (SSL_SESSION *)0x0) {
    lVar5 = *(long *)(in[1].krb5_client_princ + 0x10);
    bVar1 = false;
    if (lVar5 == 0) {
      if (*(long *)(in[1].krb5_client_princ + 0x18) == 0) {
        return 0;
      }
      bVar1 = true;
    }
    memset(&local_f8,0,0xb8);
    local_100 = 1;
    local_fc = in->ssl_version;
    local_48 = *(undefined4 *)(in[1].krb5_client_princ + 0x20);
    if (bVar1) {
      uVar4 = (undefined2)*(undefined8 *)(in[1].krb5_client_princ + 0x18);
    }
    else {
      uVar4 = (undefined2)*(undefined4 *)(lVar5 + 0x18);
    }
    local_110 = &local_34;
    local_f8 = local_118;
    local_34 = (undefined1)((ushort)uVar4 >> 8);
    local_33 = (undefined1)uVar4;
    uStack_108 = 0;
    local_118[0] = 2;
    if (*(int *)(in[1].krb5_client_princ + 0xc) != 0) {
      local_38[0] = (undefined1)*(int *)(in[1].krb5_client_princ + 0xc);
      local_170 = local_38;
      local_f0 = local_178;
      uStack_168 = 0;
      local_178[0] = 1;
    }
    local_128 = in->session_id + 8;
    uStack_120 = 0;
    local_e8 = local_130;
    local_130[0] = (undefined4)*(undefined8 *)in->key_arg;
    local_140 = in + 1;
    uStack_138 = 0;
    local_e0 = local_148;
    local_148[0] = (undefined4)in->tlsext_tick_lifetime_hint;
    local_158 = in[1].master_key + 0x14;
    uStack_150 = 0;
    puStack_b8 = local_160;
    local_160[0] = (undefined4)*(undefined8 *)(in[1].master_key + 0xc);
    local_d0 = *(undefined8 *)(in[1].sid_ctx + 0x1c);
    local_c8 = *(undefined8 *)(in[1].sid_ctx + 0x14);
    local_b0 = (undefined4)*(undefined8 *)(in[1].sid_ctx + 4);
    local_c0 = *(undefined8 *)(in[1].session_id + 0x18);
    pcVar6 = *(char **)(in[1].krb5_client_princ + 0x48);
    if (pcVar6 == (char *)0x0) {
      local_a8 = (undefined4 *)0x0;
    }
    else {
      sVar3 = strlen(pcVar6);
      local_a8 = local_190;
      uStack_180 = 0;
      local_190[0] = (undefined4)sVar3;
      local_188 = pcVar6;
    }
    if (*(long *)(in[1].krb5_client_princ + 0x50) != 0) {
      uStack_198 = 0;
      local_90 = local_1a8;
      local_1a8[0] = (undefined4)*(undefined8 *)(in[1].krb5_client_princ + 0x58);
      local_1a0 = *(long *)(in[1].krb5_client_princ + 0x50);
    }
    if (*(long *)(in[1].krb5_client_princ + 0x60) != 0) {
      local_a0 = *(long *)(in[1].krb5_client_princ + 0x60);
    }
    local_98 = *(undefined4 *)(in[1].krb5_client_princ + 0x68);
    pcVar6 = *(char **)in[1].session_id;
    if (pcVar6 == (char *)0x0) {
      local_88 = (undefined4 *)0x0;
    }
    else {
      sVar3 = strlen(pcVar6);
      local_88 = local_1f0;
      uStack_1e0 = 0;
      local_1f0[0] = (undefined4)sVar3;
      local_1e8 = pcVar6;
    }
    pcVar6 = *(char **)(in[1].session_id + 8);
    if (pcVar6 == (char *)0x0) {
      local_80 = (undefined4 *)0x0;
    }
    else {
      sVar3 = strlen(pcVar6);
      local_80 = local_1d8;
      uStack_1c8 = 0;
      local_1d8[0] = (undefined4)sVar3;
      local_1d0 = pcVar6;
    }
    pcVar6 = *(char **)(in[1].krb5_client_princ + 0x88);
    if (pcVar6 == (char *)0x0) {
      local_78 = (undefined4 *)0x0;
    }
    else {
      sVar3 = strlen(pcVar6);
      local_78 = local_1c0;
      uStack_1b0 = 0;
      local_1c0[0] = (undefined4)sVar3;
      local_1b8 = pcVar6;
    }
    local_70 = (ulong)*(uint *)(in[1].krb5_client_princ + 0xa0);
    local_68 = *(undefined4 *)(in[1].krb5_client_princ + 0x6c);
    local_60 = (undefined4 *)0x0;
    if (*(long *)(in[1].krb5_client_princ + 0x70) != 0) {
      uStack_1f8 = 0;
      local_60 = local_208;
      local_208[0] = (undefined4)*(undefined8 *)(in[1].krb5_client_princ + 0x78);
      local_200 = *(long *)(in[1].krb5_client_princ + 0x70);
    }
    local_58 = (uint)in[1].krb5_client_princ[0x80];
    local_50 = (undefined1 *)0x0;
    if (*(long *)(in[1].krb5_client_princ + 0x90) != 0) {
      uStack_210 = 0;
      local_220[0] = (undefined4)*(undefined8 *)(in[1].krb5_client_princ + 0x98);
      local_50 = (undefined1 *)local_220;
      local_218 = *(long *)(in[1].krb5_client_princ + 0x90);
    }
    iVar2 = ASN1_item_i2d((ASN1_VALUE *)&local_100,pp,(ASN1_ITEM *)&DAT_00c573d8);
  }
  return iVar2;
}

