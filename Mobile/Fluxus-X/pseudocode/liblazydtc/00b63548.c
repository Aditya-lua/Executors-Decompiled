/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b63548
 */

undefined4 FUN_00b63548(void)

{
  BUF_MEM *a;
  int iVar1;
  undefined4 uVar2;
  BIO *a_00;
  code *in_x3;
  undefined8 in_x4;
  BUF_MEM *local_e0;
  undefined8 local_d8;
  undefined8 uStack_d0;
  undefined8 local_c8;
  undefined8 uStack_c0;
  undefined8 local_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 local_40;
  undefined4 local_34;
  
  a_00 = (BIO *)ossl_bio_new_from_core_bio();
  local_e0 = (BUF_MEM *)0x0;
  if (a_00 == (BIO *)0x0) {
    uVar2 = 0;
  }
  else {
    ERR_set_mark();
    iVar1 = asn1_d2i_read_bio(a_00,&local_e0);
    ERR_pop_to_mark();
    if ((iVar1 < 0) && (local_e0 != (BUF_MEM *)0x0)) {
      BUF_MEM_free(local_e0);
      local_e0 = (BUF_MEM *)0x0;
    }
    BIO_free(a_00);
    a = local_e0;
    local_34 = 0;
    if (local_e0 == (BUF_MEM *)0x0) {
      uVar2 = 1;
    }
    else {
      OSSL_PARAM_construct_int(&local_d8,&DAT_002cecd9,&local_34);
      local_90 = local_b8;
      uStack_a8 = uStack_d0;
      local_b0 = local_d8;
      uStack_98 = uStack_c0;
      uStack_a0 = local_c8;
      OSSL_PARAM_construct_octet_string(&local_d8,&DAT_002d167a,a->data,a->length);
      local_68 = local_b8;
      uStack_70 = uStack_c0;
      local_78 = local_c8;
      uStack_80 = uStack_d0;
      local_88 = local_d8;
      OSSL_PARAM_construct_end(&local_d8);
      local_40 = local_b8;
      uStack_58 = uStack_d0;
      local_60 = local_d8;
      uStack_48 = uStack_c0;
      uStack_50 = local_c8;
      uVar2 = (*in_x3)(&local_b0,in_x4);
      BUF_MEM_free(a);
    }
  }
  return uVar2;
}

