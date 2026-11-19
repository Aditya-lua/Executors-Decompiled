/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008769e0
 */

void FUN_008769e0(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  ulong uVar1;
  char *__s;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  void *pvVar6;
  size_t sVar7;
  void *pvVar8;
  long lVar9;
  undefined4 *puVar10;
  ulong uVar11;
  undefined4 *puVar12;
  undefined4 uVar13;
  undefined1 auStack_f0 [8];
  undefined8 local_e8;
  undefined8 uStack_e0;
  undefined8 local_d8;
  undefined8 uStack_d0;
  undefined8 local_c8;
  undefined8 uStack_c0;
  char *local_b8;
  undefined1 *local_b0;
  char **ppcStack_a8;
  undefined1 *puStack_a0;
  undefined8 uStack_98;
  
  lVar5 = tpidr_el0;
  lVar9 = *(long *)(lVar5 + 0x28);
  local_e8 = param_3;
  uStack_e0 = param_4;
  local_d8 = param_5;
  uStack_d0 = param_6;
  local_c8 = param_7;
  uStack_c0 = param_8;
  if ((*(byte *)(param_1 + 0x2c0) >> 4 & 1) != 0) {
    puStack_a0 = auStack_f0;
    ppcStack_a8 = &local_b8;
    uStack_98 = 0xffffff80ffffffd0;
    uVar4 = (ulong)(*(byte *)(param_1 + 0x288) >> 1);
    if ((*(byte *)(param_1 + 0x288) & 1) != 0) {
      uVar4 = *(ulong *)(param_1 + 0x290);
    }
    local_b0 = (undefined1 *)register0x00000008;
    FUN_008a9f20(param_1 + 0x288,param_2,&local_b0);
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    push_back((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
              (param_1 + 0x288),'\0');
    puVar10 = *(undefined4 **)(param_1 + 0x278);
    uVar13 = (undefined4)((ulong)(*(long *)(param_1 + 0x38) - *(long *)(param_1 + 0x30)) >> 2);
    if (*(undefined4 **)(param_1 + 0x280) <= puVar10) {
      pvVar8 = *(void **)(param_1 + 0x270);
      sVar7 = (long)puVar10 - (long)pvVar8;
      uVar1 = ((long)sVar7 >> 3) + 1;
      if (uVar1 >> 0x3d == 0) {
        uVar11 = (long)*(undefined4 **)(param_1 + 0x280) - (long)pvVar8;
        uVar2 = (long)uVar11 >> 2;
        if ((ulong)((long)uVar11 >> 2) <= uVar1) {
          uVar2 = uVar1;
        }
        if (0x7ffffffffffffff7 < uVar11) {
          uVar2 = 0x1fffffffffffffff;
        }
        if (uVar2 >> 0x3d == 0) {
          pvVar6 = operator_new(uVar2 * 8);
          puVar12 = (undefined4 *)((long)pvVar6 + sVar7);
          *puVar12 = uVar13;
          puVar12[1] = (int)uVar4;
          puVar10 = puVar12 + 2;
          memcpy(puVar12 + ((long)sVar7 >> 3) * -2,pvVar8,sVar7);
          *(undefined4 **)(param_1 + 0x270) = puVar12 + ((long)sVar7 >> 3) * -2;
          *(undefined4 **)(param_1 + 0x278) = puVar10;
          *(void **)(param_1 + 0x280) = (void *)((long)pvVar6 + uVar2 * 8);
          if (pvVar8 != (void *)0x0) {
            operator_delete(pvVar8,uVar11);
          }
          goto LAB_00876b44;
        }
      }
      else {
        if (*(long *)(lVar5 + 0x28) != lVar9) goto LAB_00876c8c;
        FUN_0087a3e8();
      }
      if (*(long *)(lVar5 + 0x28) == lVar9) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe1b8();
      }
      goto LAB_00876c8c;
    }
    *puVar10 = uVar13;
    puVar10[1] = (int)uVar4;
    puVar10 = puVar10 + 2;
LAB_00876b44:
    puVar12 = *(undefined4 **)(param_1 + 0x2e8);
    *(undefined4 **)(param_1 + 0x278) = puVar10;
    lVar3 = param_1 + 0x289;
    if ((*(byte *)(param_1 + 0x288) & 1) != 0) {
      lVar3 = *(long *)(param_1 + 0x298);
    }
    __s = (char *)(lVar3 + uVar4);
    local_b8 = __s;
    if (puVar12 < *(undefined4 **)(param_1 + 0x2f0)) {
      *puVar12 = *(undefined4 *)(param_1 + 0x1a0);
      sVar7 = strlen(__s);
      if (0xfffffffffffffff7 < sVar7) {
        if (*(long *)(lVar5 + 0x28) == lVar9) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00876c70 to 00876c73 has its CatchHandler @ 00876c74 */
          FUN_007fe124();
        }
        goto LAB_00876c8c;
      }
      if (sVar7 < 0x17) {
        pvVar8 = (void *)((long)puVar12 + 9);
        *(char *)(puVar12 + 2) = (char)((int)sVar7 << 1);
        if (sVar7 != 0) goto LAB_00876be8;
      }
      else {
        uVar4 = 0x1a;
        if ((sVar7 | 7) != 0x17) {
          uVar4 = (sVar7 | 7) + 1;
        }
                    /* try { // try from 00876bd0 to 00876bd7 has its CatchHandler @ 00876c74 */
        pvVar8 = operator_new(uVar4);
        *(size_t *)(puVar12 + 4) = sVar7;
        *(void **)(puVar12 + 6) = pvVar8;
        *(ulong *)(puVar12 + 2) = uVar4 | 1;
LAB_00876be8:
        memmove(pvVar8,__s,sVar7);
      }
      puVar12 = puVar12 + 8;
      *(undefined1 *)((long)pvVar8 + sVar7) = 0;
      *(undefined4 **)(param_1 + 0x2e8) = puVar12;
    }
    else {
      puVar12 = (undefined4 *)
                FUN_0087a3fc(param_1 + 0x2e0,(undefined4 *)(param_1 + 0x1a0),&local_b8);
    }
    *(undefined4 **)(param_1 + 0x2e8) = puVar12;
  }
  if (*(long *)(lVar5 + 0x28) == lVar9) {
    return;
  }
LAB_00876c8c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

