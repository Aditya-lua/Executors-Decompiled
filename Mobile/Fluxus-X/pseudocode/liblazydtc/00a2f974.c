/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f974
 */

undefined8 EC_KEY_oct2priv(long param_1)

{
  undefined8 uVar1;
  long lVar2;
  code *pcVar3;
  
  if ((*(long **)(param_1 + 0x18) != (long *)0x0) &&
     (lVar2 = **(long **)(param_1 + 0x18), lVar2 != 0)) {
    pcVar3 = *(code **)(lVar2 + 0x138);
    if (pcVar3 != (code *)0x0) {
      uVar1 = (*pcVar3)();
      if ((int)uVar1 == 1) {
        *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + 1;
        return uVar1;
      }
      return uVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_key.c",0x3ae,"EC_KEY_oct2priv");
    ERR_set_error(0x10,0xc0101,0);
  }
  return 0;
}

