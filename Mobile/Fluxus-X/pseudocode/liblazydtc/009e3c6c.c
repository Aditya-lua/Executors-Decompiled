/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e3c6c
 */

bool tls_process_key_update(long param_1,undefined8 *param_2)

{
  byte bVar1;
  long lVar2;
  int iVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  
  iVar3 = RECORD_LAYER_processed_read_pending(param_1 + 0xc58);
  if (iVar3 != 0) {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_lib.c",0x296,"tls_process_key_update");
    uVar4 = 10;
    uVar5 = 0xb6;
    goto LAB_009e3cf4;
  }
  if (param_2[1] == 0) {
LAB_009e3cd0:
    ERR_new();
    ERR_set_debug("ssl/statem/statem_lib.c",0x29c,"tls_process_key_update");
    uVar4 = 0x32;
  }
  else {
    lVar2 = param_2[1] + -1;
    bVar1 = *(byte *)*param_2;
    *param_2 = (byte *)*param_2 + 1;
    param_2[1] = lVar2;
    if (lVar2 != 0) goto LAB_009e3cd0;
    if (bVar1 < 2) {
      if (bVar1 == 1) {
        *(undefined4 *)(param_1 + 0xba4) = 0;
      }
      iVar3 = tls13_update_key(param_1,0);
      return iVar3 != 0;
    }
    ERR_new();
    ERR_set_debug("ssl/statem/statem_lib.c",0x2a6,"tls_process_key_update");
    uVar4 = 0x2f;
  }
  uVar5 = 0x7a;
LAB_009e3cf4:
  ossl_statem_fatal(param_1,uVar4,uVar5,0);
  return false;
}

