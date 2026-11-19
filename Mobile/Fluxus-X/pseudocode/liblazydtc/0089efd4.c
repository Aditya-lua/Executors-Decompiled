/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089efd4
 */

void FUN_0089efd4(undefined8 *param_1,long param_2,long *param_3,undefined8 param_4)

{
  undefined8 *puVar1;
  ulong uVar2;
  ulong *puVar3;
  void *pvVar4;
  char *__src;
  long lVar5;
  undefined8 uVar6;
  ulong uVar7;
  ulong *puVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  undefined8 local_80;
  ulong local_78;
  void *local_70;
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  if (*(ulong *)(param_2 + 0x28) == 0) {
    *param_1 = 6;
LAB_0089f378:
    param_1[1] = &DAT_002ab32c;
    goto LAB_0089f384;
  }
  uVar11 = 0;
  uVar10 = 0;
  do {
    uVar11 = *(long *)(*(long *)(param_2 + 0x20) + uVar10 * 0x10 + 8) + uVar11;
    if (uVar10 < *(ulong *)(param_2 + 0x38)) {
      if (param_3[5] != 0) {
        uVar9 = *(ulong *)(*(long *)(param_2 + 0x30) + uVar10 * 8);
        uVar7 = ((ulong)(uint)((int)uVar9 << 3) + 8 ^ uVar9 >> 0x20) * -0x622015f714c7d297;
        uVar7 = (uVar9 >> 0x20 ^ uVar7 >> 0x2f ^ uVar7) * -0x622015f714c7d297;
        for (uVar7 = (uVar7 ^ uVar7 >> 0x2f) * -0x6b622cb0470b6a63 >>
                     ((ulong)*(byte *)(param_3 + 6) & 0x3f);
            (*(ulong *)(param_3[3] + (uVar7 >> 6) * 8) >> (uVar7 & 0x3f) & 1) != 0;
            uVar7 = uVar7 + 1 & param_3[4] - 1U) {
          puVar8 = (ulong *)(*param_3 + uVar7 * 0x30);
          if (*puVar8 == uVar9) goto LAB_0089f060;
        }
      }
      puVar8 = (ulong *)0x0;
LAB_0089f060:
      puVar3 = (ulong *)0x0;
      if (puVar8 != (ulong *)0x0) {
        puVar3 = puVar8 + 1;
      }
      uVar11 = uVar11 + *(uint *)((long)puVar3 + 4);
    }
    uVar10 = uVar10 + 1;
  } while (uVar10 != *(ulong *)(param_2 + 0x28));
  if (0x1000 < uVar11) goto LAB_0089f384;
  *(undefined4 *)param_1 = 6;
  *(int *)((long)param_1 + 4) = (int)uVar11;
  if (uVar11 == 0) goto LAB_0089f378;
  local_80 = 0;
  local_78 = 0;
  local_70 = (void *)0x0;
  if (uVar11 < 0x17) {
LAB_0089f144:
    uVar10 = 0;
    do {
      puVar1 = (undefined8 *)(*(long *)(param_2 + 0x20) + uVar10 * 0x10);
      __src = (char *)*puVar1;
      uVar9 = puVar1[1];
      uVar7 = 0x16;
      if ((local_80 & 1) != 0) {
        uVar7 = (local_80 & 0xfffffffffffffffe) - 1;
      }
      uVar2 = local_80 >> 1 & 0x7f;
      if ((local_80 & 1) != 0) {
        uVar2 = local_78;
      }
      if (uVar7 - uVar2 < uVar9) {
                    /* try { // try from 0089f1cc to 0089f1e3 has its CatchHandler @ 0089f40c */
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::__grow_by_and_replace
                  ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *
                   )&local_80,uVar7,(uVar9 - uVar7) + uVar2,uVar2,uVar2,0,uVar9,__src);
      }
      else if (uVar9 != 0) {
        pvVar4 = (void *)((ulong)&local_80 | 1);
        if ((local_80 & 1) != 0) {
          pvVar4 = local_70;
        }
        memmove((void *)((long)pvVar4 + uVar2),__src,uVar9);
        uVar2 = uVar2 + uVar9;
        if ((local_80 & 1) == 0) {
          local_80 = CONCAT71(local_80._1_7_,(char)((int)uVar2 << 1));
        }
        else {
          local_78 = uVar2;
        }
        *(undefined1 *)((long)pvVar4 + uVar2) = 0;
      }
      if (uVar10 < *(ulong *)(param_2 + 0x38)) {
        if (param_3[5] != 0) {
          uVar7 = *(ulong *)(*(long *)(param_2 + 0x30) + uVar10 * 8);
          uVar9 = ((ulong)(uint)((int)uVar7 << 3) + 8 ^ uVar7 >> 0x20) * -0x622015f714c7d297;
          uVar9 = (uVar7 >> 0x20 ^ uVar9 >> 0x2f ^ uVar9) * -0x622015f714c7d297;
          uVar9 = (uVar9 ^ uVar9 >> 0x2f) * -0x6b622cb0470b6a63 >>
                  ((ulong)*(byte *)(param_3 + 6) & 0x3f);
          if ((*(ulong *)(param_3[3] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0) {
            do {
              puVar8 = (ulong *)(*param_3 + uVar9 * 0x30);
              if (*puVar8 == uVar7) goto LAB_0089f2d8;
              uVar9 = uVar9 + 1 & param_3[4] - 1U;
            } while ((*(ulong *)(param_3[3] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0);
          }
        }
        puVar8 = (ulong *)0x0;
LAB_0089f2d8:
        puVar3 = (ulong *)0x0;
        if (puVar8 != (ulong *)0x0) {
          puVar3 = puVar8 + 1;
        }
        uVar9 = (ulong)*(uint *)((long)puVar3 + 4);
        uVar7 = 0x16;
        if ((local_80 & 1) != 0) {
          uVar7 = (local_80 & 0xfffffffffffffffe) - 1;
        }
        uVar2 = local_80 >> 1 & 0x7f;
        if ((local_80 & 1) != 0) {
          uVar2 = local_78;
        }
        if (uVar7 - uVar2 < uVar9) {
                    /* try { // try from 0089f164 to 0089f17b has its CatchHandler @ 0089f408 */
          std::__ndk1::
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
          __grow_by_and_replace
                    ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      *)&local_80,uVar7,(uVar9 - uVar7) + uVar2,uVar2,uVar2,0,uVar9,
                     (char *)puVar3[1]);
        }
        else if (*(uint *)((long)puVar3 + 4) != 0) {
          pvVar4 = (void *)((ulong)&local_80 | 1);
          if ((local_80 & 1) != 0) {
            pvVar4 = local_70;
          }
          memmove((void *)((long)pvVar4 + uVar2),(char *)puVar3[1],uVar9);
          uVar2 = uVar2 + uVar9;
          if ((local_80 & 1) == 0) {
            local_80 = CONCAT71(local_80._1_7_,(char)((int)uVar2 << 1));
            *(undefined1 *)((long)pvVar4 + uVar2) = 0;
          }
          else {
            *(undefined1 *)((long)pvVar4 + uVar2) = 0;
            local_78 = uVar2;
          }
        }
      }
      uVar10 = uVar10 + 1;
    } while (uVar10 < *(ulong *)(param_2 + 0x28));
  }
  else {
    uVar10 = 0x19;
    if ((uVar11 | 7) != 0x17) {
      uVar10 = uVar11 | 7;
    }
                    /* try { // try from 0089f134 to 0089f13b has its CatchHandler @ 0089f400 */
    FUN_00879ca4(&local_80,uVar10);
    if (*(long *)(param_2 + 0x28) != 0) goto LAB_0089f144;
  }
  pvVar4 = local_70;
  if ((local_80 & 1) == 0) {
    pvVar4 = (void *)((long)&local_80 + 1);
  }
  *(undefined4 *)param_1 = 6;
  *(int *)((long)param_1 + 4) = (int)uVar11;
                    /* try { // try from 0089f3d4 to 0089f3db has its CatchHandler @ 0089f404 */
  uVar6 = FUN_008530cc(param_4,pvVar4,uVar11);
  param_1[1] = uVar6;
  if ((local_80 & 1) != 0) {
    operator_delete(local_70,local_80 & 0xfffffffffffffffe);
  }
LAB_0089f384:
  if (*(long *)(lVar5 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

