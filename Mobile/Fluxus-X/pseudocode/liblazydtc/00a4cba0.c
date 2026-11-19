/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4cba0
 */

undefined4 OSSL_DECODER_from_bio(long *param_1,BIO *param_2)

{
  undefined *puVar1;
  undefined *puVar2;
  char *pcVar3;
  undefined1 *puVar4;
  undefined1 *puVar5;
  undefined1 *puVar6;
  bool bVar7;
  int iVar8;
  undefined4 uVar9;
  ulong uVar10;
  long lVar11;
  BIO_METHOD *type;
  ulong uVar12;
  undefined8 uVar13;
  char *pcVar14;
  BIO *b;
  long *local_88;
  BIO *pBStack_80;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  
  if (param_2 == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/decoder_lib.c",0x36,"OSSL_DECODER_from_bio");
    uVar13 = 0xc0102;
    pcVar14 = (char *)0x0;
  }
  else {
    if (((param_1 != (long *)0x0) && (param_1[3] != 0)) && (iVar8 = OPENSSL_sk_num(), iVar8 != 0)) {
      uVar10 = ERR_peek_last_error();
      lVar11 = BIO_ctrl(param_2,0x85,0,(void *)0x0);
      if ((int)lVar11 < 0) {
        type = (BIO_METHOD *)BIO_f_readbuffer();
        b = BIO_new(type);
        if (b == (BIO *)0x0) {
          return 0;
        }
        param_2 = BIO_push(b,param_2);
      }
      else {
        b = (BIO *)0x0;
      }
      local_78 = 0;
      uStack_70 = 0;
      local_68 = 0;
      local_88 = param_1;
      pBStack_80 = param_2;
      ossl_pw_enable_passphrase_caching(param_1 + 7);
      uVar9 = FUN_00a4cdd0(0,&local_88);
      if (((byte)local_68 >> 1 & 1) == 0) {
        puVar5 = (undefined1 *)*param_1;
        bVar7 = (undefined1 *)param_1[1] == (undefined1 *)0x0;
        pcVar14 = "Input structure: ";
        if (bVar7) {
          pcVar14 = "";
        }
        puVar6 = &DAT_002ab32c;
        if (!bVar7) {
          puVar6 = (undefined1 *)param_1[1];
        }
        puVar1 = &DAT_002ab32c;
        if (!bVar7 && puVar5 != (undefined1 *)0x0) {
          puVar1 = &DAT_002a19a2;
        }
        puVar2 = &DAT_002a715d;
        if (bVar7 || puVar5 == (undefined1 *)0x0) {
          puVar2 = &DAT_002ab32c;
        }
        pcVar3 = "Input type: ";
        if (puVar5 == (undefined1 *)0x0) {
          pcVar3 = "";
        }
        puVar4 = &DAT_002ab32c;
        if (puVar5 != (undefined1 *)0x0) {
          puVar4 = puVar5;
        }
        uVar12 = ERR_peek_last_error();
        if (uVar12 != uVar10) {
          uVar10 = ERR_peek_error();
          uVar9 = 0;
          if (uVar10 != 0) goto LAB_00a4cd98;
        }
        ERR_new();
        ERR_set_debug("crypto/encode_decode/decoder_lib.c",0x65,"OSSL_DECODER_from_bio");
        ERR_set_error(0x3c,0x8010c,"No supported data to decode. %s%s%s%s%s%s",puVar1,pcVar3,puVar4,
                      puVar2,pcVar14,puVar6);
        uVar9 = 0;
      }
LAB_00a4cd98:
      ossl_pw_clear_passphrase_cache(param_1 + 7);
      if (b == (BIO *)0x0) {
        return uVar9;
      }
      BIO_pop(b);
      BIO_free(b);
      return uVar9;
    }
    ERR_new();
    ERR_set_debug("crypto/encode_decode/decoder_lib.c",0x3b,"OSSL_DECODER_from_bio");
    pcVar14 = 
    "No decoders were found. For standard decoders you need at least one of the default or base providers available. Did you forget to load them?"
    ;
    uVar13 = 0x66;
  }
  ERR_set_error(0x3c,uVar13,pcVar14);
  return 0;
}

