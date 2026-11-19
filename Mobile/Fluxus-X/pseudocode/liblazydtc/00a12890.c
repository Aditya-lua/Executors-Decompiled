/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a12890
 */

long SCT_new_from_base64(undefined1 param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4
                        ,undefined8 param_5,undefined8 param_6)

{
  void *ptr;
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  void *local_58;
  void *local_48;
  
  lVar2 = SCT_new();
  local_48 = (void *)0x0;
  local_58 = (void *)0x0;
  if (lVar2 == 0) {
    ERR_new();
    ERR_set_debug("crypto/ct/ct_b64.c",0x4a,"SCT_new_from_base64");
    ERR_set_error(0x32,0xc0100,0);
    return 0;
  }
  iVar1 = SCT_set_version(lVar2,param_1);
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/ct/ct_b64.c",0x53,"SCT_new_from_base64");
    uVar3 = 0x73;
  }
  else {
    iVar1 = FUN_00a12a9c(param_2,&local_48);
    if (iVar1 < 0) {
      ERR_new();
      uVar3 = 0x59;
    }
    else {
      iVar1 = SCT_set0_log_id(lVar2,local_48,(long)iVar1);
      if (iVar1 == 0) goto LAB_00a12a5c;
      local_48 = (void *)0x0;
      iVar1 = FUN_00a12a9c(param_5,&local_48);
      if (iVar1 < 0) {
        ERR_new();
        uVar3 = 0x62;
      }
      else {
        SCT_set0_extensions(lVar2,local_48,(long)iVar1);
        local_48 = (void *)0x0;
        iVar1 = FUN_00a12a9c(param_6,&local_48);
        ptr = local_48;
        if (-1 < iVar1) {
          local_58 = local_48;
          iVar1 = o2i_SCT_signature(lVar2,&local_58,(long)iVar1);
          if (0 < iVar1) {
            CRYPTO_free(ptr);
            local_48 = (void *)0x0;
            SCT_set_timestamp(lVar2,param_4);
            iVar1 = SCT_set_log_entry_type(lVar2,param_3);
            if (iVar1 != 0) {
              return lVar2;
            }
          }
          goto LAB_00a12a5c;
        }
        ERR_new();
        uVar3 = 0x6a;
      }
    }
    ERR_set_debug("crypto/ct/ct_b64.c",uVar3,"SCT_new_from_base64");
    uVar3 = 0x76;
  }
  ERR_set_error(0x32,uVar3,0);
LAB_00a12a5c:
  CRYPTO_free(local_48);
  SCT_free(lVar2);
  return 0;
}

