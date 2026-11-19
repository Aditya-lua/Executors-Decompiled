/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a80648
 */

ulong ossl_encode_der_dsa_sig(undefined1 *param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  int iVar2;
  ulong uVar3;
  undefined8 uVar4;
  undefined1 *puVar5;
  undefined1 auStack_78 [56];
  ulong local_38;
  
  iVar1 = WPACKET_is_null_buf();
  uVar3 = WPACKET_start_sub_packet(param_1);
  if ((int)uVar3 != 0) {
    puVar5 = param_1;
    if (iVar1 == 0) {
      puVar5 = auStack_78;
      uVar3 = WPACKET_init_null(auStack_78,0);
      if ((int)uVar3 == 0) {
        return uVar3;
      }
    }
    iVar2 = ossl_encode_der_integer(puVar5,param_2);
    if (((iVar2 == 0) || (iVar2 = ossl_encode_der_integer(puVar5,param_3), iVar2 == 0)) ||
       (iVar2 = WPACKET_get_length(puVar5,&local_38), iVar2 == 0)) {
      if (iVar1 != 0) {
        return 0;
      }
    }
    else if ((iVar1 != 0) || (iVar2 = WPACKET_finish(puVar5), iVar2 != 0)) {
      uVar3 = WPACKET_put_bytes__(param_1,0x30,1);
      if ((int)uVar3 == 0) {
        return uVar3;
      }
      if (local_38 >> 0x10 != 0) {
        return 0;
      }
      if (local_38 < 0x100) {
        if ((0x7f < local_38) && (uVar3 = WPACKET_put_bytes__(param_1,0x81,1), (int)uVar3 == 0)) {
          return uVar3;
        }
        uVar4 = 1;
      }
      else {
        uVar3 = WPACKET_put_bytes__(param_1,0x82,1);
        if ((int)uVar3 == 0) {
          return uVar3;
        }
        uVar4 = 2;
      }
      uVar3 = WPACKET_put_bytes__(param_1,local_38,uVar4);
      if ((int)uVar3 == 0) {
        return uVar3;
      }
      if (iVar1 == 0) {
        uVar3 = ossl_encode_der_integer(param_1,param_2);
        if ((int)uVar3 == 0) {
          return uVar3;
        }
        uVar3 = ossl_encode_der_integer(param_1,param_3);
        if ((int)uVar3 == 0) {
          return uVar3;
        }
      }
      iVar1 = WPACKET_close(param_1);
      return (ulong)(iVar1 != 0);
    }
    WPACKET_cleanup(puVar5);
    uVar3 = 0;
  }
  return uVar3;
}

