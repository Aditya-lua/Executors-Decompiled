/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d0c68
 */

undefined8
tls_construct_extensions
          (long param_1,undefined8 param_2,uint param_3,undefined8 param_4,undefined8 param_5)

{
  int iVar1;
  undefined8 uVar2;
  undefined4 uVar3;
  ulong uVar4;
  undefined **ppuVar5;
  undefined4 local_58;
  undefined1 auStack_54 [4];
  
  local_58 = 0;
  iVar1 = WPACKET_start_sub_packet_len__(param_2,2);
  if ((iVar1 == 0) ||
     (((param_3 & 0x180) != 0 && (iVar1 = WPACKET_set_flags(param_2,2), iVar1 == 0)))) {
    ERR_new();
    uVar2 = 0x333;
  }
  else {
    uVar3 = 0;
    if ((param_3 >> 7 & 1) != 0) {
      iVar1 = ssl_get_min_max_version(param_1,auStack_54,&local_58,0);
      if (iVar1 != 0) {
        ERR_new();
        ERR_set_debug("ssl/statem/extensions.c",0x33a,"tls_construct_extensions");
        goto LAB_009d0d40;
      }
      custom_ext_init(*(long *)(param_1 + 0x898) + 0x1d8);
      uVar3 = local_58;
    }
    uVar2 = custom_ext_add(param_1,param_3,param_2,param_4,param_5,uVar3);
    if ((int)uVar2 == 0) {
      return uVar2;
    }
    uVar4 = 0;
    ppuVar5 = &PTR_tls_construct_stoc_renegotiate_00c58208;
    do {
      iVar1 = should_add_extension(param_1,*(undefined4 *)((long)ppuVar5 + -0x1c),param_3,local_58);
      if ((iVar1 != 0) && ((code *)ppuVar5[*(int *)(param_1 + 0x38) == 0] != (code *)0x0)) {
        uVar2 = (*(code *)ppuVar5[*(int *)(param_1 + 0x38) == 0])
                          (param_1,param_2,param_3,param_4,param_5);
        if ((int)uVar2 == 1) {
          if ((param_3 & 0x6080) != 0) {
            *(byte *)(param_1 + uVar4 + 0xa28) = *(byte *)(param_1 + uVar4 + 0xa28) | 2;
          }
        }
        else if ((int)uVar2 == 0) {
          return uVar2;
        }
      }
      uVar4 = uVar4 + 1;
      ppuVar5 = ppuVar5 + 7;
    } while (uVar4 < 0x1a);
    iVar1 = WPACKET_close(param_2);
    if (iVar1 != 0) {
      return 1;
    }
    ERR_new();
    uVar2 = 0x365;
  }
  ERR_set_debug("ssl/statem/extensions.c",uVar2,"tls_construct_extensions");
  iVar1 = 0xc0103;
LAB_009d0d40:
  ossl_statem_fatal(param_1,0x50,iVar1,0);
  return 0;
}

