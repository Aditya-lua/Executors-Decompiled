/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c04bc
 */

undefined8
tls1_final_finish_mac(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  int iVar2;
  undefined1 auStack_80 [64];
  size_t local_38;
  
  uVar1 = 0xc;
  if ((*(uint *)(*(long *)(param_1 + 0x2e0) + 0x1c) & 0x200) != 0) {
    uVar1 = 0x20;
  }
  iVar2 = ssl3_digest_cached_records(param_1,0);
  if (((iVar2 == 0) || (iVar2 = ssl_handshake_hash(param_1,auStack_80,0x40,&local_38), iVar2 == 0))
     || (iVar2 = FUN_009c0598(param_1,param_2,param_3,auStack_80,local_38,0,0,0,0,
                              *(long *)(param_1 + 0x918) + 0x50,
                              *(undefined8 *)(*(long *)(param_1 + 0x918) + 8),param_4,uVar1,1),
        iVar2 == 0)) {
    return 0;
  }
  OPENSSL_cleanse(auStack_80,local_38);
  return uVar1;
}

