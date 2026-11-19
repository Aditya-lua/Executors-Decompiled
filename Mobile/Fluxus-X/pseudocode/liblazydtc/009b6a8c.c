/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b6a8c
 */

undefined8 ssl_get_server_cert_serverinfo(long param_1,long *param_2,undefined8 *param_3)

{
  long lVar1;
  
  lVar1 = *(long *)(param_1 + 0x388);
  *param_3 = 0;
  if (lVar1 == 0) {
    return 0;
  }
  if (*(long *)(lVar1 + 0x18) == 0) {
    return 0;
  }
  *param_2 = *(long *)(lVar1 + 0x18);
  *param_3 = *(undefined8 *)(lVar1 + 0x20);
  return 1;
}

