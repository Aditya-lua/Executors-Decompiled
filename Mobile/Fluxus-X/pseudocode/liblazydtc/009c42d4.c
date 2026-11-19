/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c42d4
 */

ulong tls1_set_sigalgs_list(long param_1,char *param_2,undefined4 param_3)

{
  uint uVar1;
  ulong uVar2;
  undefined8 local_98;
  undefined1 auStack_90 [112];
  
  local_98 = 0;
  uVar1 = CONF_parse_list(param_2,0x3a,1,FUN_009c4348,&local_98);
  uVar2 = (ulong)uVar1;
  if (uVar1 != 0) {
    if (param_1 == 0) {
      uVar2 = 1;
    }
    else {
      uVar2 = tls1_set_raw_sigalgs(param_1,auStack_90,local_98,param_3);
    }
  }
  return uVar2;
}

