/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba2630
 */

int psa_load_persistent_key(undefined2 *param_1,undefined8 *param_2,ulong *param_3)

{
  undefined4 uVar1;
  uint uVar2;
  long lVar3;
  byte bVar4;
  int iVar5;
  long *plVar6;
  void *__dest;
  ulong __size;
  ulong __size_00;
  ulong local_68;
  uint local_60 [2];
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  uVar1 = *(undefined4 *)(param_1 + 10);
  iVar5 = psa_its_get_info(uVar1,local_60);
  if (iVar5 != 0) goto LAB_00ba271c;
  __size = (ulong)local_60[0];
  plVar6 = calloc(1,__size);
  if (plVar6 == (long *)0x0) {
    iVar5 = -0x8d;
    goto LAB_00ba271c;
  }
  local_68 = 0;
  iVar5 = psa_its_get_info(uVar1,local_60);
  if (iVar5 == 0) {
    iVar5 = psa_its_get(uVar1,0,__size,plVar6,&local_68);
    if (local_68 == __size) {
      if (iVar5 == 0) {
        if (((local_60[0] < 0x24) || (*plVar6 != 0x59454b00415350)) || ((int)plVar6[1] != 0))
        goto LAB_00ba2704;
        uVar2 = *(uint *)(plVar6 + 4);
        __size_00 = (ulong)uVar2;
        iVar5 = -0x99;
        *param_3 = __size_00;
        if ((uVar2 >> 0xd == 0) && (__size_00 <= __size - 0x24)) {
          if (uVar2 == 0) {
            *param_2 = 0;
            bVar4 = 1;
          }
          else {
            __dest = calloc(1,__size_00);
            *param_2 = __dest;
            if (__dest == (void *)0x0) {
              iVar5 = -0x8d;
              goto LAB_00ba2708;
            }
            memcpy(__dest,(void *)((long)plVar6 + 0x24),__size_00);
            bVar4 = 0;
          }
          *(undefined4 *)(param_1 + 2) = *(undefined4 *)((long)plVar6 + 0xc);
          iVar5 = -0x92;
          if (!(bool)(bVar4 | uVar2 == 0)) {
            iVar5 = 0;
          }
          *param_1 = (short)plVar6[2];
          param_1[1] = *(undefined2 *)((long)plVar6 + 0x12);
          *(undefined8 *)(param_1 + 4) = *(undefined8 *)((long)plVar6 + 0x14);
          *(undefined4 *)(param_1 + 8) = *(undefined4 *)((long)plVar6 + 0x1c);
        }
      }
    }
    else {
LAB_00ba2704:
      iVar5 = -0x99;
    }
  }
LAB_00ba2708:
  mbedtls_zeroize_and_free(plVar6,__size);
LAB_00ba271c:
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar5;
}

