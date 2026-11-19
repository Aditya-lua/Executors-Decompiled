/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c08c8
 */

undefined8
tls1_generate_master_secret
          (long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,undefined8 *param_5
          )

{
  int iVar1;
  undefined8 uVar2;
  undefined1 auStack_c0 [128];
  size_t local_38;
  
  if ((*(byte *)(*(long *)(param_1 + 0x918) + 0x388) & 1) == 0) {
    uVar2 = FUN_009c0598(param_1,"master secret",0xd,param_1 + 0x160,0x20,0,0,param_1 + 0x140,0x20,
                         param_3,param_4,param_2,0x30,1);
    if ((int)uVar2 == 0) {
      return uVar2;
    }
  }
  else {
    iVar1 = ssl3_digest_cached_records(param_1,1);
    if (((iVar1 == 0) || (iVar1 = ssl_handshake_hash(param_1,auStack_c0,0x80,&local_38), iVar1 == 0)
        ) || (iVar1 = FUN_009c0598(param_1,"extended master secret",0x16,auStack_c0,local_38,0,0,0,0
                                   ,param_3,param_4,param_2,0x30,1), iVar1 == 0)) {
      return 0;
    }
    OPENSSL_cleanse(auStack_c0,local_38);
  }
  *param_5 = 0x30;
  return 1;
}

