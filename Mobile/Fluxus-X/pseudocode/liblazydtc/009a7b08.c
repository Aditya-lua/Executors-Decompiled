/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a7b08
 */

undefined8
dtls1_write_app_data_bytes
          (long param_1,undefined4 param_2,undefined8 param_3,ulong param_4,undefined8 param_5)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = SSL_in_init();
  if ((iVar1 != 0) && (iVar1 = ossl_statem_get_in_handshake(param_1), iVar1 == 0)) {
    uVar2 = (**(code **)(param_1 + 0x30))(param_1);
    if ((int)uVar2 < 0) {
      return uVar2;
    }
    if ((int)uVar2 == 0) {
      ERR_new();
      ERR_set_debug("ssl/d1_msg.c",0x16,"dtls1_write_app_data_bytes");
      uVar2 = 0xe5;
      goto LAB_009a7b70;
    }
  }
  if (param_4 < 0x4001) {
    uVar2 = dtls1_write_bytes(param_1,param_2,param_3,param_4,param_5);
    return uVar2;
  }
  ERR_new();
  ERR_set_debug("ssl/d1_msg.c",0x1c,"dtls1_write_app_data_bytes");
  uVar2 = 0x14e;
LAB_009a7b70:
  ERR_set_error(0x14,uVar2,0);
  return 0xffffffff;
}

