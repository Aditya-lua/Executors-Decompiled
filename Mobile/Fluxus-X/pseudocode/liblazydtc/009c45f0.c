/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c45f0
 */

undefined8 tls1_set_sigalgs(long param_1,int *param_2,ulong param_3,int param_4)

{
  undefined8 uVar1;
  undefined2 *ptr;
  ulong uVar2;
  undefined2 *puVar3;
  undefined2 *puVar4;
  ulong uVar5;
  int *piVar6;
  
  uVar1 = 0;
  if ((param_3 & 1) == 0) {
    ptr = CRYPTO_malloc((uint)param_3 & 0xfffffffe,"ssl/t1_lib.c",0x9f5);
    if (ptr == (undefined2 *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/t1_lib.c",0x9f6,"tls1_set_sigalgs");
      ERR_set_error(0x14,0xc0100,0);
LAB_009c4708:
      uVar1 = 0;
    }
    else {
      if (param_3 != 0) {
        uVar2 = 0;
        puVar3 = ptr;
        do {
          uVar5 = 0;
          piVar6 = &DAT_00c57d2c;
          do {
            if ((*piVar6 == *param_2) && (piVar6[2] == param_2[1])) {
              puVar4 = puVar3 + 1;
              *puVar3 = (short)piVar6[-1];
              goto LAB_009c4690;
            }
            uVar5 = uVar5 + 1;
            piVar6 = piVar6 + 10;
          } while (uVar5 < 0x1c);
          puVar4 = puVar3;
          if (uVar5 == 0x1c) {
            CRYPTO_free(ptr);
            goto LAB_009c4708;
          }
LAB_009c4690:
          uVar2 = uVar2 + 2;
          puVar3 = puVar4;
          param_2 = param_2 + 2;
        } while (uVar2 < param_3);
      }
      if (param_4 == 0) {
        CRYPTO_free(*(void **)(param_1 + 0x198));
        *(undefined2 **)(param_1 + 0x198) = ptr;
        *(ulong *)(param_1 + 0x1a0) = param_3 >> 1;
      }
      else {
        CRYPTO_free(*(void **)(param_1 + 0x1a8));
        *(undefined2 **)(param_1 + 0x1a8) = ptr;
        *(ulong *)(param_1 + 0x1b0) = param_3 >> 1;
      }
      uVar1 = 1;
    }
  }
  return uVar1;
}

