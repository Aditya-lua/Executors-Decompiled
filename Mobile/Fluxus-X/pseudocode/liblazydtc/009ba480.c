/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ba480
 */

void SSL_CONF_CTX_set_ssl(long param_1,long param_2)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  
  *(undefined8 *)(param_1 + 0x18) = 0;
  *(long *)(param_1 + 0x20) = param_2;
  if (param_2 == 0) {
    lVar1 = 0;
    lVar2 = 0;
    lVar3 = 0;
    lVar4 = 0;
    param_2 = 0;
  }
  else {
    lVar1 = param_2 + 0x9e8;
    lVar2 = param_2 + 0x9f4;
    lVar3 = param_2 + 0x9f8;
    lVar4 = *(long *)(param_2 + 0x898) + 0x1c;
    param_2 = param_2 + 0x968;
  }
  *(long *)(param_1 + 0x28) = lVar1;
  *(long *)(param_1 + 0x88) = lVar2;
  *(long *)(param_1 + 0x90) = lVar3;
  *(long *)(param_1 + 0x78) = lVar4;
  *(long *)(param_1 + 0x80) = param_2;
  return;
}

