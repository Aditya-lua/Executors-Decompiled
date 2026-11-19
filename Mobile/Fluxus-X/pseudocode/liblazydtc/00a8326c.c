/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8326c
 */

int OPENSSL_showfatal(char *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                     undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  int iVar1;
  undefined1 auStack_a0 [8];
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined1 *local_60;
  undefined1 **ppuStack_58;
  undefined1 *puStack_50;
  undefined8 uStack_48;
  
  puStack_50 = auStack_a0;
  ppuStack_58 = &local_60;
  uStack_48 = 0xffffff80ffffffc8;
  local_98 = param_2;
  uStack_90 = param_3;
  local_88 = param_4;
  local_80 = param_5;
  uStack_78 = param_6;
  local_70 = param_7;
  uStack_68 = param_8;
  local_60 = (undefined1 *)register0x00000008;
  iVar1 = vfprintf((FILE *)sched_yield,param_1,&local_60);
  return iVar1;
}

