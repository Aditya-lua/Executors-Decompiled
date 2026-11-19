/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f4b8
 */

int EC_KEY_set_public_key(EC_KEY *key,EC_POINT *pub)

{
  int iVar1;
  uint uVar2;
  EC_POINT *pEVar3;
  
  if ((*(code **)(*(long *)key + 0x38) == (code *)0x0) ||
     (iVar1 = (**(code **)(*(long *)key + 0x38))(key,pub), uVar2 = 0, iVar1 != 0)) {
    EC_POINT_free(*(EC_POINT **)(key + 0x20));
    pEVar3 = EC_POINT_dup(pub,*(EC_GROUP **)(key + 0x18));
    *(EC_POINT **)(key + 0x20) = pEVar3;
    uVar2 = (uint)(pEVar3 != (EC_POINT *)0x0);
    *(long *)(key + 0x68) = *(long *)(key + 0x68) + 1;
  }
  return uVar2;
}

