/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d5d64
 */

undefined8
custom_ext_parse(long param_1,uint param_2,uint param_3,undefined8 param_4,undefined8 param_5,
                undefined8 param_6,undefined8 param_7)

{
  int iVar1;
  uint uVar2;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  undefined8 *puVar6;
  undefined4 local_54;
  
  lVar5 = *(long *)(param_1 + 0x898);
  if ((param_2 & 0x180) == 0) {
    uVar2 = 2;
    uVar3 = *(ulong *)(lVar5 + 0x1e0);
  }
  else {
    uVar2 = (uint)(*(int *)(param_1 + 0x38) != 0);
    uVar3 = *(ulong *)(lVar5 + 0x1e0);
  }
  if (uVar3 != 0) {
    uVar4 = 0;
    puVar6 = (undefined8 *)(*(long *)(lVar5 + 0x1d8) + 0x28);
    do {
      if (*(ushort *)(puVar6 + -5) == param_3) {
        if (uVar2 == 2) {
          if (puVar6 == (undefined8 *)0x28) {
            return 1;
          }
LAB_009d5e1c:
          iVar1 = extension_is_relevant(param_1,*(undefined4 *)(puVar6 + -4),param_2);
          if (iVar1 == 0) {
            return 1;
          }
          if (((param_2 & 0x700) == 0) || ((*(byte *)((long)puVar6 + -0x1c) >> 1 & 1) != 0)) {
            if ((param_2 & 0x4080) != 0) {
              *(uint *)((long)puVar6 + -0x1c) = *(uint *)((long)puVar6 + -0x1c) | 1;
            }
            if ((code *)*puVar6 == (code *)0x0) {
              return 1;
            }
            iVar1 = (*(code *)*puVar6)(param_1,param_3,param_2,param_4,param_5,param_6,param_7,
                                       &local_54,puVar6[1]);
            if (0 < iVar1) {
              return 1;
            }
            ERR_new();
            ERR_set_debug("ssl/statem/extensions_cust.c",0xa2,"custom_ext_parse");
          }
          else {
            ERR_new();
            ERR_set_debug("ssl/statem/extensions_cust.c",0x8e,"custom_ext_parse");
            local_54 = 0x6e;
          }
          ossl_statem_fatal(param_1,local_54,0x6e,0);
          return 0;
        }
        if ((*(uint *)((long)puVar6 + -0x24) == uVar2) || (*(uint *)((long)puVar6 + -0x24) == 2))
        goto LAB_009d5e1c;
      }
      uVar4 = uVar4 + 1;
      puVar6 = puVar6 + 7;
    } while (uVar4 < uVar3);
  }
  return 1;
}

