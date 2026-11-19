/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2e9c4
 */

int EC_KEY_generate_key(EC_KEY *key)

{
  int iVar1;
  undefined8 uVar2;
  
  if ((key == (EC_KEY *)0x0) || (*(long *)(key + 0x18) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_key.c",0xd4,"EC_KEY_generate_key");
    uVar2 = 0xc0102;
  }
  else {
    if (*(code **)(*(long *)key + 0x40) != (code *)0x0) {
      iVar1 = (**(code **)(*(long *)key + 0x40))(key);
      if (iVar1 == 1) {
        *(long *)(key + 0x68) = *(long *)(key + 0x68) + 1;
        return 1;
      }
      return iVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_key.c",0xe0,"EC_KEY_generate_key");
    uVar2 = 0x98;
  }
  ERR_set_error(0x10,uVar2,0);
  return 0;
}

