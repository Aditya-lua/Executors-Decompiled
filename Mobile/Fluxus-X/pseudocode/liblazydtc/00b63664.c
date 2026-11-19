/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b63664
 */

undefined4 FUN_00b63664(void)

{
  int iVar1;
  uint len;
  uint uVar2;
  undefined4 uVar3;
  BIO *b;
  BUF_MEM *str;
  undefined8 uVar4;
  code *in_x3;
  undefined8 in_x4;
  undefined4 local_10c;
  undefined4 uStack_108;
  undefined1 auStack_104 [4];
  char *local_100;
  undefined8 local_f8;
  undefined8 uStack_f0;
  undefined8 local_e8;
  undefined8 uStack_e0;
  undefined8 local_d8;
  undefined8 local_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 local_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 local_60;
  undefined4 local_48;
  undefined4 local_44;
  
  b = (BIO *)ossl_bio_new_from_core_bio();
  local_10c = 0xffffffff;
  uStack_108 = 0xffffffff;
  if (b == (BIO *)0x0) {
    str = (BUF_MEM *)0x0;
    goto LAB_00b63834;
  }
  str = BUF_MEM_new();
  if ((str == (BUF_MEM *)0x0) || (iVar1 = BUF_MEM_grow(str,0x10), iVar1 == 0)) {
    ERR_new();
    uVar4 = 0x80;
LAB_00b63814:
    ERR_set_debug("providers/implementations/storemgmt/file_store_any2obj.c",uVar4,
                  "msblob2obj_decode");
    ERR_set_error(9,0xc0100,0);
LAB_00b63834:
    BIO_free(b);
    BUF_MEM_free(str);
    return 0;
  }
  ERR_set_mark();
  iVar1 = BIO_read(b,str->data,0x10);
  ERR_pop_to_mark();
  if (iVar1 == 0x10) {
    ERR_set_mark();
    local_100 = str->data;
    iVar1 = ossl_do_blob_header(&local_100,0x10,auStack_104,&local_48,&uStack_108,&local_10c);
    ERR_pop_to_mark();
    if (0 < iVar1) {
      len = ossl_blob_length(local_48,uStack_108,local_10c);
      iVar1 = BUF_MEM_grow(str,(ulong)len + 0x10);
      if (iVar1 != 0) {
        ERR_set_mark();
        uVar2 = BIO_read(b,str->data + 0x10,len);
        ERR_pop_to_mark();
        BIO_free(b);
        if (uVar2 == len) {
          local_44 = 2;
          OSSL_PARAM_construct_int(&local_f8,&DAT_002cecd9,&local_44);
          local_b0 = local_d8;
          uStack_c8 = uStack_f0;
          local_d0 = local_f8;
          uStack_b8 = uStack_e0;
          uStack_c0 = local_e8;
          OSSL_PARAM_construct_octet_string(&local_f8,&DAT_002d167a,str->data,str->length);
          local_88 = local_d8;
          uStack_90 = uStack_e0;
          local_98 = local_e8;
          uStack_a0 = uStack_f0;
          local_a8 = local_f8;
          OSSL_PARAM_construct_end(&local_f8);
          local_60 = local_d8;
          uStack_78 = uStack_f0;
          local_80 = local_f8;
          uStack_68 = uStack_e0;
          uStack_70 = local_e8;
          uVar3 = (*in_x3)(&local_d0,in_x4);
          BUF_MEM_free(str);
          return uVar3;
        }
        goto LAB_00b63870;
      }
      ERR_new();
      uVar4 = 0x96;
      goto LAB_00b63814;
    }
  }
  BIO_free(b);
LAB_00b63870:
  BUF_MEM_free(str);
  return 1;
}

