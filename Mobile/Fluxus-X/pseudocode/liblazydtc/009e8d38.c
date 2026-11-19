/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e8d38
 */

undefined8 ossl_statem_server_max_message_size(long param_1)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  switch(*(undefined4 *)(param_1 + 0x5c)) {
  case 0x14:
    return 0x20144;
  case 0x1b:
    return *(undefined8 *)(param_1 + 0xa00);
  case 0x1c:
    return 0x800;
  case 0x1d:
    return 0x4000;
  case 0x1e:
    return 0x202;
  case 0x1f:
  case 0x2c:
    uVar1 = 1;
    break;
  case 0x20:
    return 0x40;
  }
  return uVar1;
}

