/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f540
 */

int EC_KEY_set_group(EC_KEY *key,EC_GROUP *group)

{
  int iVar1;
  uint uVar2;
  EC_GROUP *group_00;
  
  if ((*(code **)(*(long *)key + 0x28) == (code *)0x0) ||
     (iVar1 = (**(code **)(*(long *)key + 0x28))(key,group), uVar2 = 0, iVar1 != 0)) {
    EC_GROUP_free(*(EC_GROUP **)(key + 0x18));
    group_00 = EC_GROUP_dup(group);
    *(EC_GROUP **)(key + 0x18) = group_00;
    if ((group_00 != (EC_GROUP *)0x0) && (iVar1 = EC_GROUP_get_curve_name(group_00), iVar1 == 0x494)
       ) {
      *(uint *)(key + 0x3c) = *(uint *)(key + 0x3c) | 4;
      *(long *)(key + 0x68) = *(long *)(key + 0x68) + 1;
    }
    uVar2 = (uint)(*(long *)(key + 0x18) != 0);
    *(long *)(key + 0x68) = *(long *)(key + 0x68) + 1;
  }
  return uVar2;
}

