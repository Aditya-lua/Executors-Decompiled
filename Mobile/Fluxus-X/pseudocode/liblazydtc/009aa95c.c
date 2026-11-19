/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009aa95c
 */

undefined8 SSL_group_to_name(long param_1,uint param_2)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  
  if ((param_2 >> 0x18 & 1) == 0) {
    param_2 = tls1_nid2group_id(param_2);
  }
  puVar1 = (undefined8 *)tls1_group_id_lookup(*(undefined8 *)(param_1 + 0x9a8),param_2 & 0xffff);
  uVar2 = 0;
  if (puVar1 != (undefined8 *)0x0) {
    uVar2 = *puVar1;
  }
  return uVar2;
}

