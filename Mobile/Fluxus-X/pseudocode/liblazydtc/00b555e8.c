/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b555e8
 */

undefined8 FUN_00b555e8(long param_1,void *param_2,size_t param_3)

{
  void *__s;
  int iVar1;
  uint uVar2;
  undefined8 uVar3;
  int iVar4;
  ulong uVar5;
  uint uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  undefined1 local_254 [516];
  
  ossl_prov_digest_md(param_1 + 0x10);
  uVar2 = EVP_MD_get_block_size();
  if (param_3 - 4 < 0x1fd) {
    if (0 < (int)uVar2) {
      if (param_2 == (void *)0x0) {
        uVar8 = 0;
      }
      else {
        uVar5 = param_3 << 3;
        if (uVar5 == 0) {
          uVar6 = 1;
        }
        else {
          uVar6 = 0;
          uVar8 = uVar5;
          do {
            uVar8 = uVar8 >> 8;
            uVar6 = uVar6 + 1;
            if (uVar8 == 0) break;
          } while (uVar6 < 8);
        }
        uVar7 = (ulong)uVar6;
        uVar8 = param_3 + uVar7 + 1;
        if (0x204 < uVar8) {
          ERR_new();
          ERR_set_debug("providers/implementations/macs/kmac_prov.c",0x201,"encode_string");
          uVar3 = 0xca;
          goto LAB_00b556f4;
        }
        local_254[0] = (undefined1)uVar6;
        uVar9 = uVar7;
        do {
          local_254[uVar9] = (char)uVar5;
          uVar9 = uVar9 - 1;
          uVar5 = uVar5 >> 8;
        } while (uVar9 != 0);
        memcpy(local_254 + uVar7 + 1,param_2,param_3);
      }
      uVar7 = (ulong)(int)uVar2;
      uVar5 = 0;
      if (uVar7 != 0) {
        uVar5 = ((uVar7 - 1) + ((long)((uVar8 << 0x20) + 0x200000000) >> 0x20)) / uVar7;
      }
      *(ulong *)(param_1 + 0x30) = uVar5 * uVar7;
      if (0xff < uVar2) {
        return 0;
      }
      if (0x2a0 < uVar5 * uVar7) {
        return 0;
      }
      *(undefined1 *)(param_1 + 0x44) = 1;
      *(char *)(param_1 + 0x45) = (char)uVar2;
      memcpy((void *)(param_1 + 0x46),local_254,uVar8);
      __s = (void *)(param_1 + 0x46 + uVar8);
      iVar4 = (int)__s - ((int)param_1 + 0x44);
      iVar1 = 0;
      if (uVar7 != 0) {
        iVar1 = (int)(((uVar7 - 1) + (long)iVar4) / uVar7);
      }
      if (iVar1 * uVar2 != iVar4) {
        memset(__s,0,(long)(int)(iVar1 * uVar2 - iVar4));
      }
      return 1;
    }
    ERR_new();
    ERR_set_debug("providers/implementations/macs/kmac_prov.c",0xfd,"kmac_setkey");
    uVar3 = 0xa6;
  }
  else {
    ERR_new();
    ERR_set_debug("providers/implementations/macs/kmac_prov.c",0xf9,"kmac_setkey");
    uVar3 = 0x69;
  }
LAB_00b556f4:
  ERR_set_error(0x39,uVar3,0);
  return 0;
}

