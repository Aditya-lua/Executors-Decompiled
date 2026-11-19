/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e7140
 */

undefined8 dtls_construct_hello_verify_request(long param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  code *pcVar3;
  long lVar4;
  uint local_34;
  
  pcVar3 = *(code **)(*(long *)(param_1 + 0x9a8) + 0xd0);
  if (((pcVar3 == (code *)0x0) ||
      (iVar1 = (*pcVar3)(param_1,*(undefined8 *)(param_1 + 0x4b8),&local_34), iVar1 == 0)) ||
     (0xff < local_34)) {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_srvr.c",0x50f,"dtls_construct_hello_verify_request");
    uVar2 = 400;
  }
  else {
    lVar4 = *(long *)(param_1 + 0x4b8);
    *(ulong *)(lVar4 + 0x100) = (ulong)local_34;
    iVar1 = WPACKET_put_bytes__(param_2,0xfeff,2);
    if ((iVar1 != 0) && (iVar1 = WPACKET_sub_memcpy__(param_2,lVar4,(ulong)local_34,1), iVar1 != 0))
    {
      return 1;
    }
    ERR_new();
    ERR_set_debug("ssl/statem/statem_srvr.c",0x516,"dtls_construct_hello_verify_request");
    uVar2 = 0xc0103;
  }
  ossl_statem_fatal(param_1,0xffffffff,uVar2,0);
  return 0;
}

