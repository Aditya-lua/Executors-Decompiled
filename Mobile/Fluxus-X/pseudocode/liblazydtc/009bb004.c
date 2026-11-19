/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bb004
 */

undefined8 FUN_009bb004(long param_1,char *param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = atoi(param_2);
  if (iVar1 < 0) {
    uVar2 = 0;
  }
  else {
    uVar2 = 0;
    if (*(long *)(param_1 + 0x18) != 0) {
      uVar2 = SSL_CTX_set_num_tickets(*(long *)(param_1 + 0x18),(long)iVar1);
    }
    if (*(long *)(param_1 + 0x20) != 0) {
      uVar2 = SSL_set_num_tickets(*(long *)(param_1 + 0x20),(long)iVar1);
      return uVar2;
    }
  }
  return uVar2;
}

