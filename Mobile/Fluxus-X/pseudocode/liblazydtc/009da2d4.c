/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009da2d4
 */

void ossl_statem_fatal(long param_1,int param_2,undefined4 param_3,undefined8 param_4,
                      undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined1 *local_70;
  undefined1 **ppuStack_68;
  undefined8 *puStack_60;
  undefined8 uStack_58;
  
  puStack_60 = &local_90;
  ppuStack_68 = &local_70;
  uStack_58 = 0xffffff80ffffffe0;
  local_90 = param_5;
  uStack_88 = param_6;
  local_80 = param_7;
  uStack_78 = param_8;
  local_70 = (undefined1 *)register0x00000008;
  ERR_vset_error(0x14,param_3,param_4,&local_70);
  if ((*(int *)(param_1 + 100) == 0) || (*(int *)(param_1 + 0x48) != 1)) {
    *(undefined4 *)(param_1 + 100) = 1;
    *(undefined4 *)(param_1 + 0x48) = 1;
    if ((param_2 != -1) && (*(int *)(param_1 + 0x7c) != 1)) {
      ssl3_send_alert(param_1,2,param_2);
    }
  }
  return;
}

