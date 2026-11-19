/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e489c
 */

undefined8 tls_get_message_header(undefined4 *param_1,uint *param_2)

{
  int iVar1;
  long lVar2;
  ulong uVar3;
  undefined8 uVar4;
  byte *pbVar5;
  long local_40;
  int local_34;
  
  pbVar5 = *(byte **)(*(long *)(param_1 + 0x22) + 8);
  do {
    uVar3 = *(ulong *)(param_1 + 0x26);
    while (uVar3 < 4) {
      iVar1 = (**(code **)(*(long *)(param_1 + 2) + 0x68))
                        (param_1,0x16,&local_34,pbVar5 + uVar3,4 - uVar3,0,&local_40);
      if (iVar1 < 1) {
        param_1[10] = 3;
        return 0;
      }
      if (local_34 != 0x16) {
        if (local_34 == 0x14) {
          if (((*(long *)(param_1 + 0x26) == 0) && (local_40 == 1)) && (*pbVar5 == 1)) {
            if ((param_1[0x17] == 0) && ((*(byte *)((long)param_1 + 0xa9) >> 3 & 1) != 0)) {
              return 0;
            }
            *param_2 = 0x101;
            param_1[0xb6] = 0x101;
            *(undefined8 *)(param_1 + 0x26) = 0;
            uVar4 = *(undefined8 *)(*(long *)(param_1 + 0x22) + 8);
            *(undefined8 *)(param_1 + 0xb4) = 1;
            *(undefined8 *)(param_1 + 0x24) = uVar4;
            return 1;
          }
          ERR_new();
          ERR_set_debug("ssl/statem/statem_lib.c",0x4a3,"tls_get_message_header");
          uVar4 = 0x67;
        }
        else {
          ERR_new();
          ERR_set_debug("ssl/statem/statem_lib.c",0x4b8,"tls_get_message_header");
          uVar4 = 0x85;
        }
        ossl_statem_fatal(param_1,10,uVar4,0);
        return 0;
      }
      uVar3 = *(long *)(param_1 + 0x26) + local_40;
      *(ulong *)(param_1 + 0x26) = uVar3;
      local_34 = 0x16;
    }
    if (((param_1[0xe] != 0) || (param_1[0x17] == 1)) ||
       ((*pbVar5 != 0 || (((pbVar5[1] != 0 || (pbVar5[2] != 0)) || (pbVar5[3] != 0)))))) {
      *param_2 = (uint)*pbVar5;
      param_1[0xb6] = (uint)*pbVar5;
      iVar1 = RECORD_LAYER_is_sslv2_record(param_1 + 0x316);
      if (iVar1 == 0) {
        uVar4 = 0;
        uVar3 = (ulong)pbVar5[1] << 0x10 | (ulong)pbVar5[2] << 8 | (ulong)pbVar5[3];
        *(long *)(param_1 + 0x24) = *(long *)(*(long *)(param_1 + 0x22) + 8) + 4;
      }
      else {
        lVar2 = RECORD_LAYER_get_rrec_length(param_1 + 0x316);
        uVar3 = lVar2 + 4;
        *(undefined8 *)(param_1 + 0x24) = *(undefined8 *)(*(long *)(param_1 + 0x22) + 8);
        uVar4 = 4;
      }
      *(ulong *)(param_1 + 0xb4) = uVar3;
      *(undefined8 *)(param_1 + 0x26) = uVar4;
      return 1;
    }
    *(undefined8 *)(param_1 + 0x26) = 0;
    if (*(code **)(param_1 + 0x130) != (code *)0x0) {
      (**(code **)(param_1 + 0x130))
                (0,*param_1,0x16,pbVar5,4,param_1,*(undefined8 *)(param_1 + 0x132));
    }
  } while( true );
}

