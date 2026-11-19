/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c7988
 */

undefined8 tls13_update_key(long param_1,int param_2)

{
  void *__dest;
  char *pcVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  long lVar6;
  undefined1 auStack_d0 [64];
  undefined1 auStack_90 [64];
  
  uVar4 = ssl_handshake_md();
  iVar2 = EVP_MD_get_size();
  if (iVar2 < 1) {
    ERR_new();
    ERR_set_debug("ssl/tls13_enc.c",0x2fb,"tls13_update_key");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    return 0;
  }
  __dest = (void *)(param_1 + 0x784);
  if (*(int *)(param_1 + 0x38) != param_2) {
    __dest = (void *)(param_1 + 0x744);
  }
  if (param_2 == 0) {
    uVar5 = *(undefined8 *)(param_1 + 0x848);
    lVar6 = param_1 + 0x850;
    RECORD_LAYER_reset_read_sequence(param_1 + 0xc58);
  }
  else {
    uVar5 = *(undefined8 *)(param_1 + 0x878);
    *(undefined4 *)(param_1 + 0x7c) = 1;
    lVar6 = param_1 + 0x880;
    RECORD_LAYER_reset_write_sequence(param_1 + 0xc58);
  }
  iVar3 = FUN_009c7704(param_1,param_2,uVar4,*(undefined8 *)(param_1 + 800),__dest,0,"traffic upd",
                       0xb,auStack_d0,auStack_90,lVar6,uVar5);
  if (iVar3 != 0) {
    memcpy(__dest,auStack_d0,(long)iVar2);
    pcVar1 = "SERVER_TRAFFIC_SECRET_N";
    if (*(int *)(param_1 + 0x38) != param_2) {
      pcVar1 = "CLIENT_TRAFFIC_SECRET_N";
    }
    iVar2 = ssl_log_secret(param_1,pcVar1,auStack_d0,(long)iVar2);
    if (iVar2 != 0) {
      *(undefined4 *)(param_1 + 0x7c) = 0;
      uVar4 = 1;
      goto LAB_009c7ad4;
    }
  }
  uVar4 = 0;
LAB_009c7ad4:
  OPENSSL_cleanse(auStack_90,0x40);
  OPENSSL_cleanse(auStack_d0,0x40);
  return uVar4;
}

