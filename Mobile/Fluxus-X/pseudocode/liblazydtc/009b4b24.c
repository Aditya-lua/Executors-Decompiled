/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b4b24
 */

undefined8 FUN_009b4b24(long param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4)

{
  undefined8 uVar1;
  long lVar2;
  long local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined4 local_40;
  undefined8 local_38;
  
  if (*(long *)(param_1 + 0x30) == 0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x7c3,"ssl_peek_internal");
    ERR_set_error(0x14,0x114,0);
    uVar1 = 0xffffffff;
  }
  else {
    uVar1 = 0;
    if ((*(byte *)(param_1 + 0x44) >> 1 & 1) == 0) {
      if (((*(byte *)(param_1 + 0x9f1) & 1) == 0) || (lVar2 = ASYNC_get_current_job(0), lVar2 != 0))
      {
                    /* WARNING: Could not recover jumptable at 0x009b4b94. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar1 = (**(code **)(*(long *)(param_1 + 8) + 0x40))(param_1,param_2,param_3,param_4);
        return uVar1;
      }
      local_40 = 0;
      local_38 = *(undefined8 *)(*(long *)(param_1 + 8) + 0x40);
      local_58 = param_1;
      uStack_50 = param_2;
      local_48 = param_3;
      uVar1 = FUN_009b4724(param_1,&local_58,&LAB_009b486c);
      *param_4 = *(undefined8 *)(param_1 + 0x1d38);
    }
  }
  return uVar1;
}

