/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ba104
 */

ulong SSL_CONF_cmd_value_type(undefined8 param_1,undefined8 param_2)

{
  ulong uVar1;
  long lVar2;
  undefined8 local_18;
  
  local_18 = param_2;
  uVar1 = FUN_009b9ec0(param_1,&local_18);
  if (((int)uVar1 != 0) && (lVar2 = FUN_009b9fa4(param_1,local_18), uVar1 = 0, lVar2 != 0)) {
    uVar1 = (ulong)*(ushort *)(lVar2 + 0x1a);
  }
  return uVar1;
}

