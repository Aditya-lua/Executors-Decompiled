/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f5874
 */

undefined8 FUN_009f5874(BUF_MEM *param_1,long *param_2,char *param_3,ulong param_4,int param_5)

{
  size_t __n;
  char *pcVar1;
  char *pcVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  undefined1 local_78 [4];
  char local_74 [4];
  size_t local_70;
  char *local_68;
  
  local_68 = (char *)*param_2;
  if ((param_1 == (BUF_MEM *)0x0) && ((param_4 & 1) == 0)) {
    local_68 = local_68 + (long)param_3;
  }
  else {
    if (0 < (long)param_3) {
      do {
        pcVar1 = local_68;
        if (((param_3 != (char *)0x1) && (*local_68 == '\0')) && (local_68[1] == '\0')) {
          local_68 = local_68 + 2;
          if ((param_4 & 1) != 0) goto LAB_009f59bc;
          ERR_new();
          ERR_set_debug("crypto/asn1/tasn_dec.c",0x428,"asn1_collect");
          uVar4 = 0x9f;
          goto LAB_009f5a40;
        }
        iVar3 = FUN_009f5200(&local_70,0,0,local_78,local_74,&local_68,param_3,0xffffffff,0,0,0);
        __n = local_70;
        if (iVar3 == 0) {
          ERR_new();
          ERR_set_debug("crypto/asn1/tasn_dec.c",0x431,"asn1_collect");
          uVar4 = 0x8010a;
          goto LAB_009f5a40;
        }
        if (local_74[0] == '\0') {
          if (local_70 != 0) {
            if (param_1 != (BUF_MEM *)0x0) {
              lVar5 = (long)(int)param_1->length;
              iVar3 = BUF_MEM_grow_clean(param_1,lVar5 + local_70);
              pcVar2 = local_68;
              if (iVar3 == 0) {
                ERR_new();
                ERR_set_debug("crypto/asn1/tasn_dec.c",0x44f,"collect_data");
                uVar4 = 0xc0100;
                goto LAB_009f5a40;
              }
              memcpy(param_1->data + lVar5,local_68,__n);
              local_68 = pcVar2;
            }
            local_68 = local_68 + __n;
          }
        }
        else {
          if (4 < param_5) {
            ERR_new();
            ERR_set_debug("crypto/asn1/tasn_dec.c",0x438,"asn1_collect");
            uVar4 = 0xc5;
            goto LAB_009f5a40;
          }
          uVar4 = FUN_009f5874(param_1,&local_68,local_70,local_78[0],param_5 + 1);
          if ((int)uVar4 == 0) {
            return uVar4;
          }
        }
        param_3 = pcVar1 + ((long)param_3 - (long)local_68);
      } while (0 < (long)param_3);
    }
    if ((param_4 & 1) != 0) {
      ERR_new();
      ERR_set_debug("crypto/asn1/tasn_dec.c",0x442,"asn1_collect");
      uVar4 = 0x89;
LAB_009f5a40:
      ERR_set_error(0xd,uVar4,0);
      return 0;
    }
  }
LAB_009f59bc:
  *param_2 = (long)local_68;
  return 1;
}

