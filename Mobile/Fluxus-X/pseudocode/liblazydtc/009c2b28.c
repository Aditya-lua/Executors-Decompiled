/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c2b28
 */

undefined8 ssl_set_client_disabled(long param_1)

{
  ulong *puVar1;
  byte bVar2;
  int iVar3;
  undefined8 uVar4;
  
  puVar1 = (ulong *)(param_1 + 0x3dc);
  *puVar1 = 0;
  ssl_set_sig_mask(param_1 + 0x3e0,param_1,0x5000e);
  iVar3 = ssl_get_min_max_version(param_1,param_1 + 0x3e4,param_1 + 1000,0);
  uVar4 = 0;
  if (iVar3 == 0) {
    if (*(long *)(param_1 + 0x988) == 0) {
      *puVar1 = *puVar1 | 0x10000001c8;
      bVar2 = *(byte *)(param_1 + 0xc48);
    }
    else {
      bVar2 = *(byte *)(param_1 + 0xc48);
    }
    if ((bVar2 >> 5 & 1) == 0) {
      *puVar1 = *puVar1 | 0x4000000020;
    }
    uVar4 = 1;
  }
  return uVar4;
}

