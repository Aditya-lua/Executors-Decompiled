/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b4c2c
 */

undefined8
ssl_write_internal(long param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4)

{
  long lVar1;
  undefined8 uVar2;
  long local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined4 local_40;
  undefined8 local_38;
  
  if (*(long *)(param_1 + 0x30) == 0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x7ff,"ssl_write_internal");
    uVar2 = 0x114;
  }
  else {
    if ((*(byte *)(param_1 + 0x44) & 1) == 0) {
      if ((*(uint *)(param_1 + 0x84) < 0xb) &&
         ((1 << (ulong)(*(uint *)(param_1 + 0x84) & 0x1f) & 0x502U) != 0)) {
        ERR_new();
        ERR_set_debug("ssl/ssl_lib.c",0x80c,"ssl_write_internal");
        ERR_set_error(0x14,0xc0101,0);
        return 0;
      }
      ossl_statem_check_finish_init(param_1,1);
      if (((*(byte *)(param_1 + 0x9f1) & 1) == 0) || (lVar1 = ASYNC_get_current_job(), lVar1 != 0))
      {
                    /* WARNING: Could not recover jumptable at 0x009b4d70. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar2 = (**(code **)(*(long *)(param_1 + 8) + 0x48))(param_1,param_2,param_3,param_4);
        return uVar2;
      }
      local_40 = 1;
      local_38 = *(undefined8 *)(*(long *)(param_1 + 8) + 0x48);
      local_58 = param_1;
      uStack_50 = param_2;
      local_48 = param_3;
      uVar2 = FUN_009b4724(param_1,&local_58,&LAB_009b486c);
      *param_4 = *(undefined8 *)(param_1 + 0x1d38);
      return uVar2;
    }
    *(undefined4 *)(param_1 + 0x28) = 1;
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x805,"ssl_write_internal");
    uVar2 = 0xcf;
  }
  ERR_set_error(0x14,uVar2,0);
  return 0xffffffff;
}

