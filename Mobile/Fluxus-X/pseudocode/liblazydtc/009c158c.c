/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c158c
 */

undefined8 tls1_set_groups(undefined8 *param_1,ulong *param_2,long param_3,ulong param_4)

{
  ulong *puVar1;
  ushort uVar2;
  void *ptr;
  undefined8 uVar3;
  ulong uVar4;
  ulong uVar5;
  ushort *puVar6;
  ulong local_48;
  ulong local_38;
  
  local_38 = 0;
  local_48 = 0;
  if (param_4 == 0) {
    ERR_new();
    ERR_set_debug("ssl/t1_lib.c",0x2b0,"tls1_set_groups");
    uVar3 = 0x10f;
  }
  else {
    ptr = CRYPTO_malloc((int)(param_4 << 1),"ssl/t1_lib.c",0x2b3);
    if (ptr != (void *)0x0) {
      uVar4 = 0;
      while( true ) {
        uVar5 = 0;
        puVar6 = &DAT_0074cc38;
        while (*(int *)(puVar6 + -2) != *(int *)(param_3 + uVar4 * 4)) {
          uVar5 = uVar5 + 1;
          puVar6 = puVar6 + 4;
          if (0x29 < uVar5) goto LAB_009c1678;
        }
        uVar2 = *puVar6;
        puVar1 = &local_38;
        if (0x24 < uVar5) {
          puVar1 = &local_48;
        }
        uVar5 = 1L << ((ulong)uVar2 & 0x3f);
        if ((uVar5 & *puVar1) != 0) break;
        *puVar1 = uVar5 | *puVar1;
        *(ushort *)((long)ptr + uVar4 * 2) = uVar2;
        uVar4 = uVar4 + 1;
        if (param_4 <= uVar4) {
          CRYPTO_free((void *)*param_1);
          *param_1 = ptr;
          *param_2 = param_4;
          return 1;
        }
      }
LAB_009c1678:
      CRYPTO_free(ptr);
      return 0;
    }
    ERR_new();
    ERR_set_debug("ssl/t1_lib.c",0x2b4,"tls1_set_groups");
    uVar3 = 0xc0100;
  }
  ERR_set_error(0x14,uVar3,0);
  return 0;
}

