/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f7c4
 */

undefined4 EC_KEY_oct2key(long param_1,byte *param_2,size_t param_3,BN_CTX *param_4)

{
  int iVar1;
  undefined4 uVar2;
  EC_GROUP *group;
  EC_POINT *p;
  
  uVar2 = 0;
  if (param_1 != 0) {
    group = *(EC_GROUP **)(param_1 + 0x18);
    uVar2 = 0;
    if (group != (EC_GROUP *)0x0) {
      p = *(EC_POINT **)(param_1 + 0x20);
      if (p == (EC_POINT *)0x0) {
        p = EC_POINT_new(group);
        *(EC_POINT **)(param_1 + 0x20) = p;
        if (p == (EC_POINT *)0x0) {
          return 0;
        }
        group = *(EC_GROUP **)(param_1 + 0x18);
      }
      iVar1 = EC_POINT_oct2point(group,p,param_2,param_3,param_4);
      uVar2 = 0;
      if (iVar1 != 0) {
        *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + 1;
        if ((*(byte *)**(undefined8 **)(param_1 + 0x18) >> 1 & 1) == 0) {
          *(uint *)(param_1 + 0x34) = *param_2 & 0xfe;
        }
        uVar2 = 1;
      }
    }
  }
  return uVar2;
}

