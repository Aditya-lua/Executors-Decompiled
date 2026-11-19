/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b4724
 */

undefined4 FUN_009b4724(long param_1,undefined8 param_2,undefined8 param_3)

{
  undefined4 uVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  undefined4 local_34;
  
  lVar4 = *(long *)(param_1 + 0x1d30);
  if (lVar4 == 0) {
    lVar4 = ASYNC_WAIT_CTX_new();
    *(long *)(param_1 + 0x1d30) = lVar4;
    if (lVar4 == 0) {
      return 0xffffffff;
    }
    if (*(long *)(param_1 + 0x1d98) != 0) {
      iVar2 = ASYNC_WAIT_CTX_set_callback(lVar4,&LAB_009b994c,param_1);
      if (iVar2 == 0) {
        return 0xffffffff;
      }
      lVar4 = *(long *)(param_1 + 0x1d30);
    }
  }
  *(undefined4 *)(param_1 + 0x28) = 1;
  uVar1 = ASYNC_start_job((undefined8 *)(param_1 + 0x1d28),lVar4,&local_34,param_3,param_2,0x28);
  switch(uVar1) {
  case 0:
    *(undefined4 *)(param_1 + 0x28) = 1;
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x714,"ssl_start_async_job");
    uVar3 = 0x195;
    break;
  case 1:
    uVar1 = 6;
    goto LAB_009b4844;
  case 2:
    uVar1 = 5;
LAB_009b4844:
    *(undefined4 *)(param_1 + 0x28) = uVar1;
    return 0xffffffff;
  case 3:
    *(undefined8 *)(param_1 + 0x1d28) = 0;
    return local_34;
  default:
    *(undefined4 *)(param_1 + 0x28) = 1;
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x721,"ssl_start_async_job");
    uVar3 = 0xc0103;
  }
  ERR_set_error(0x14,uVar3,0);
  return 0xffffffff;
}

