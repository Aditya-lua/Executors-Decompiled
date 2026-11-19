/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00926ab0
 */

undefined8 curl_mime_headers(long param_1,long param_2,int param_3)

{
  undefined8 uVar1;
  uint uVar2;
  
  if (param_1 == 0) {
    uVar1 = 0x2b;
  }
  else {
    uVar2 = *(uint *)(param_1 + 0x14);
    if ((uVar2 & 1) != 0) {
      if (*(long *)(param_1 + 0x50) != param_2) {
        curl_slist_free_all();
        uVar2 = *(uint *)(param_1 + 0x14);
      }
      uVar2 = uVar2 & 0xfffffffe;
      *(uint *)(param_1 + 0x14) = uVar2;
    }
    uVar1 = 0;
    *(long *)(param_1 + 0x50) = param_2;
    if ((param_2 != 0) && (param_3 != 0)) {
      uVar1 = 0;
      *(uint *)(param_1 + 0x14) = uVar2 | 1;
    }
  }
  return uVar1;
}

