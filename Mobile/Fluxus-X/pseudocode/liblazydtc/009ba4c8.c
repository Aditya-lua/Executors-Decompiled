/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ba4c8
 */

void SSL_CONF_CTX_set_ssl_ctx(long param_1,long param_2)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  
  *(long *)(param_1 + 0x18) = param_2;
  *(undefined8 *)(param_1 + 0x20) = 0;
  if (param_2 == 0) {
    lVar1 = 0;
    lVar2 = 0;
    lVar3 = 0;
    lVar4 = 0;
    param_2 = 0;
  }
  else {
    lVar1 = param_2 + 0x138;
    lVar2 = param_2 + 0x144;
    lVar3 = param_2 + 0x148;
    lVar4 = *(long *)(param_2 + 0x158) + 0x1c;
    param_2 = param_2 + 0x178;
  }
  *(long *)(param_1 + 0x28) = lVar1;
  *(long *)(param_1 + 0x88) = lVar2;
  *(long *)(param_1 + 0x90) = lVar3;
  *(long *)(param_1 + 0x78) = lVar4;
  *(long *)(param_1 + 0x80) = param_2;
  return;
}

