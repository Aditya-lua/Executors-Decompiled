/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ab9d8
 */

ulong ssl3_do_change_cipher_spec(long param_1)

{
  int iVar1;
  ulong uVar2;
  undefined4 uVar3;
  long lVar4;
  
  uVar3 = 0x11;
  if (*(int *)(param_1 + 0x38) != 0) {
    uVar3 = 0x21;
  }
  if (*(long *)(param_1 + 0x318) == 0) {
    lVar4 = *(long *)(param_1 + 0x918);
    if ((lVar4 == 0) || (*(long *)(lVar4 + 8) == 0)) {
      ERR_new();
      ERR_set_debug("ssl/s3_msg.c",0x18,"ssl3_do_change_cipher_spec");
      ERR_set_error(0x14,0x85,0);
      return 0;
    }
    *(undefined8 *)(lVar4 + 0x2f8) = *(undefined8 *)(param_1 + 0x2e0);
    uVar2 = (**(code **)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x10))(param_1);
    if ((int)uVar2 == 0) {
      return uVar2;
    }
  }
  iVar1 = (**(code **)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x20))(param_1,uVar3);
  return (ulong)(iVar1 != 0);
}

