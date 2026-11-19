/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2fac0
 */

long EC_KEY_priv2buf(long param_1,undefined8 *param_2)

{
  undefined4 uVar1;
  void *ptr;
  long lVar2;
  code *pcVar3;
  long lVar4;
  
  if ((*(long **)(param_1 + 0x18) != (long *)0x0) &&
     (lVar2 = **(long **)(param_1 + 0x18), lVar2 != 0)) {
    pcVar3 = *(code **)(lVar2 + 0x130);
    if (pcVar3 == (code *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_key.c",0x389,"EC_KEY_priv2oct");
      uVar1 = 0xc0101;
    }
    else {
      lVar2 = (*pcVar3)(param_1,0,0);
      if (lVar2 == 0) {
        return 0;
      }
      ptr = CRYPTO_malloc((int)lVar2,"crypto/ec/ec_key.c",0x3d0);
      if (ptr != (void *)0x0) {
        if ((*(long **)(param_1 + 0x18) != (long *)0x0) &&
           (lVar4 = **(long **)(param_1 + 0x18), lVar4 != 0)) {
          pcVar3 = *(code **)(lVar4 + 0x130);
          if (pcVar3 == (code *)0x0) {
            ERR_new();
            ERR_set_debug("crypto/ec/ec_key.c",0x389,"EC_KEY_priv2oct");
            ERR_set_error(0x10,0xc0101,0);
          }
          else {
            lVar2 = (*pcVar3)(param_1,ptr,lVar2);
            if (lVar2 != 0) {
              *param_2 = ptr;
              return lVar2;
            }
          }
        }
        CRYPTO_free(ptr);
        return 0;
      }
      ERR_new();
      ERR_set_debug("crypto/ec/ec_key.c",0x3d1,"EC_KEY_priv2buf");
      uVar1 = 0xc0100;
    }
    ERR_set_error(0x10,uVar1,0);
  }
  return 0;
}

