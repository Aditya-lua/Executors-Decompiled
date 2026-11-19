/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3081c
 */

EC_POINT * EC_POINT_new(EC_GROUP *group)

{
  undefined4 uVar1;
  int iVar2;
  EC_POINT *ptr;
  long lVar3;
  
  if (group == (EC_GROUP *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x2d0,"EC_POINT_new");
    uVar1 = 0xc0102;
  }
  else {
    if (*(long *)(*(long *)group + 0x50) != 0) {
      ptr = (EC_POINT *)CRYPTO_zalloc(0x30,"crypto/ec/ec_lib.c",0x2d8);
      if (ptr == (EC_POINT *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_lib.c",0x2da,"EC_POINT_new");
        ERR_set_error(0x10,0xc0100,0);
        return (EC_POINT *)0x0;
      }
      lVar3 = *(long *)group;
      *(long *)ptr = lVar3;
      *(undefined4 *)(ptr + 8) = *(undefined4 *)(group + 0x20);
      iVar2 = (**(code **)(lVar3 + 0x50))(ptr);
      if (iVar2 == 0) {
        CRYPTO_free(ptr);
        return (EC_POINT *)0x0;
      }
      return ptr;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x2d4,"EC_POINT_new");
    uVar1 = 0xc0101;
  }
  ERR_set_error(0x10,uVar1,0);
  return (EC_POINT *)0x0;
}

