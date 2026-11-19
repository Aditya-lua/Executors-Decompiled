/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f5200
 */

undefined8
FUN_009f5200(long *param_1,int *param_2,undefined1 *param_3,byte *param_4,byte *param_5,
            long *param_6,long param_7,int param_8,int param_9,char param_10,char *param_11)

{
  uint uVar1;
  undefined8 uVar2;
  int iVar3;
  uchar *puVar4;
  uchar *local_78;
  uchar *local_70;
  int local_68;
  int local_64;
  
  puVar4 = (uchar *)*param_6;
  local_78 = puVar4;
  if (param_7 < 1) {
    ERR_new();
    ERR_set_debug("crypto/asn1/tasn_dec.c",0x47c,"asn1_check_tlen");
    uVar2 = 0xe0;
  }
  else {
    if (param_11 == (char *)0x0) {
      uVar1 = ASN1_get_object(&local_78,(long *)&local_70,&local_64,&local_68,param_7);
    }
    else if (*param_11 == '\0') {
      uVar1 = ASN1_get_object(&local_78,(long *)&local_70,&local_64,&local_68,param_7);
      *(uint *)(param_11 + 4) = uVar1;
      *(uchar **)(param_11 + 8) = local_70;
      *(int *)(param_11 + 0x14) = local_68;
      *(int *)(param_11 + 0x10) = local_64;
      *param_11 = '\x01';
      iVar3 = (int)local_78 - (int)puVar4;
      *(int *)(param_11 + 0x18) = iVar3;
      if (((uVar1 & 0x81) == 0) && (param_7 < (long)(local_70 + iVar3))) {
        ERR_new();
        ERR_set_debug("crypto/asn1/tasn_dec.c",0x493,"asn1_check_tlen");
        ERR_set_error(0xd,0x9b,0);
        goto LAB_009f541c;
      }
    }
    else {
      local_70 = *(uchar **)(param_11 + 8);
      uVar1 = *(uint *)(param_11 + 4);
      local_68 = *(int *)(param_11 + 0x14);
      local_64 = *(int *)(param_11 + 0x10);
      local_78 = puVar4 + *(int *)(param_11 + 0x18);
    }
    if ((uVar1 >> 7 & 1) == 0) {
      if (param_8 < 0) {
LAB_009f538c:
        if ((uVar1 & 1) != 0) {
          local_70 = puVar4 + (param_7 - (long)local_78);
        }
        if (param_4 != (byte *)0x0) {
          *param_4 = (byte)uVar1 & 1;
        }
        if (param_5 != (byte *)0x0) {
          *param_5 = (byte)uVar1 & 0x20;
        }
        if (param_1 != (long *)0x0) {
          *param_1 = (long)local_70;
        }
        if (param_3 != (undefined1 *)0x0) {
          *param_3 = (char)local_68;
        }
        if (param_2 != (int *)0x0) {
          *param_2 = local_64;
        }
        *param_6 = (long)local_78;
        return 1;
      }
      if ((local_64 == param_8) && (local_68 == param_9)) {
        if (param_11 != (char *)0x0) {
          *param_11 = '\0';
        }
        goto LAB_009f538c;
      }
      if (param_10 != '\0') {
        return 0xffffffff;
      }
      ERR_new();
      ERR_set_debug("crypto/asn1/tasn_dec.c",0x4a4,"asn1_check_tlen");
      uVar2 = 0xa8;
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/asn1/tasn_dec.c",0x49a,"asn1_check_tlen");
      uVar2 = 0x66;
    }
  }
  ERR_set_error(0xd,uVar2,0);
  if (param_11 == (char *)0x0) {
    return 0;
  }
LAB_009f541c:
  *param_11 = '\0';
  return 0;
}

