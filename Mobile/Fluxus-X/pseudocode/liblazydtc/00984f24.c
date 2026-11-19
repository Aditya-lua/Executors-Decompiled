/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00984f24
 */

/* ix::Socket::readBytes(unsigned long, std::__ndk1::function<bool (int, int)> const&,
   std::__ndk1::function<void (std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&)> const&, std::__ndk1::function<bool ()> const&) */

void ix::Socket::readBytes(ulong param_1,function *param_2,function *param_3,function *param_4)

{
  long lVar1;
  undefined8 *puVar2;
  int iVar3;
  ulong uVar4;
  int *piVar5;
  undefined1 *puVar6;
  long *plVar7;
  undefined1 *puVar8;
  undefined8 *puVar9;
  long in_x4;
  undefined1 *in_x8;
  undefined1 *puVar11;
  undefined1 *puVar10;
  char *pcVar12;
  undefined8 uVar13;
  ulong uVar14;
  undefined1 *puVar16;
  undefined1 *puVar15;
  undefined8 *puVar17;
  ulong uVar18;
  function *pfVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  uint local_40a8;
  undefined4 uStack_40a4;
  undefined1 uStack_40a0;
  undefined2 uStack_409f;
  undefined4 uStack_409d;
  undefined1 uStack_4099;
  undefined1 uStack_4098;
  undefined6 uStack_4097;
  undefined1 uStack_4091;
  undefined1 *local_4090;
  undefined1 *local_4088;
  undefined8 local_4080;
  undefined4 local_4074;
  undefined1 local_4070 [16];
  undefined8 auStack_4060 [2046];
  long local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(long *)(lVar1 + 0x28);
  pfVar19 = (function *)0x0;
  local_4090 = (undefined1 *)0x0;
  local_4088 = (undefined1 *)0x0;
  local_4080 = 0;
  while (puVar11 = local_4088, puVar6 = local_4090, pfVar19 != param_2) {
                    /* try { // try from 00984fb4 to 00984fb7 has its CatchHandler @ 00985398 */
    if ((*(long **)(in_x4 + 0x20) != (long *)0x0) &&
       (uVar4 = (**(code **)(**(long **)(in_x4 + 0x20) + 0x30))(), (uVar4 & 1) != 0)) {
      uStack_409f = 0x6974;
      uStack_409d = 0x52206e6f;
      local_40a8 = 0x6e61432c;
      uStack_40a4 = 0x6c6c6563;
      uStack_40a0 = 0x61;
      uStack_4099 = 0x65;
      uStack_4098 = 0x71;
      uStack_4097 = 0x646574736575;
      goto LAB_009851e0;
    }
    uVar4 = (long)param_2 - (long)pfVar19;
    if (0x3fff < uVar4) {
      uVar4 = 0x4000;
    }
                    /* try { // try from 00984fd0 to 00984fdb has its CatchHandler @ 0098539c */
    uVar4 = (**(code **)(*(long *)param_1 + 0x30))(param_1,local_4070,uVar4);
    if ((long)uVar4 < 1) {
      piVar5 = (int *)__errno();
      if ((*piVar5 != 0xb) && (*piVar5 != 0x73)) {
        pcVar12 = "Recv Error";
        goto LAB_00985164;
      }
      plVar7 = *(long **)(param_3 + 0x20);
    }
    else {
      if (*(long *)(param_4 + 0x20) == 0) {
                    /* try { // try from 0098504c to 00985057 has its CatchHandler @ 00985364 */
        std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>::
        insert<unsigned_char*>
                  ((vector<unsigned_char,std::__ndk1::allocator<unsigned_char>> *)&local_4090,
                   local_4088,local_4070,local_4070 + uVar4);
      }
      else {
        local_40a8 = 0;
        uStack_40a4 = 0;
        uStack_40a0 = 0;
        uStack_409f = 0;
        uStack_409d = 0;
        uStack_4099 = 0;
        uStack_4098 = 0;
        uStack_4097 = 0;
        uStack_4091 = 0;
        if (uVar4 < 0x17) {
          local_40a8 = ((uint)uVar4 & 0x7f) << 1;
          puVar6 = (undefined1 *)((ulong)&local_40a8 | 1);
          if (uVar4 < 0x20) goto LAB_00985014;
LAB_00985084:
          uVar14 = uVar4 & 0xffffffffffffffe0;
          puVar11 = local_4070 + uVar14;
          puVar8 = puVar6 + uVar14;
          puVar9 = (undefined8 *)(puVar6 + 0x10);
          uVar18 = uVar14;
          puVar17 = auStack_4060;
          do {
            puVar2 = puVar17 + -1;
            uVar13 = puVar17[-2];
            uVar21 = puVar17[1];
            uVar20 = *puVar17;
            uVar18 = uVar18 - 0x20;
            puVar17 = puVar17 + 4;
            puVar9[-1] = *puVar2;
            puVar9[-2] = uVar13;
            puVar9[1] = uVar21;
            *puVar9 = uVar20;
            puVar9 = puVar9 + 4;
          } while (uVar18 != 0);
          if (uVar4 != uVar14) goto LAB_009850bc;
        }
        else {
          uVar18 = uVar4 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 00985064 to 0098506b has its CatchHandler @ 00985360 */
          puVar6 = operator_new(uVar18);
          local_40a8 = (uint)uVar18 | 1;
          uStack_40a0 = (undefined1)uVar4;
          uStack_409f = (undefined2)(uVar4 >> 8);
          uStack_409d = (undefined4)(uVar4 >> 0x18);
          uStack_4099 = (undefined1)(uVar4 >> 0x38);
          uStack_4098 = SUB81(puVar6,0);
          uStack_4097 = (undefined6)((ulong)puVar6 >> 8);
          uStack_4091 = (undefined1)((ulong)puVar6 >> 0x38);
          uStack_40a4 = (undefined4)(uVar18 >> 0x20);
          if (0x1f < uVar4) goto LAB_00985084;
LAB_00985014:
          puVar11 = local_4070;
          puVar8 = puVar6;
LAB_009850bc:
          do {
            puVar10 = puVar11 + 1;
            *puVar8 = *puVar11;
            puVar11 = puVar10;
            puVar8 = puVar8 + 1;
          } while (local_4070 + uVar4 != puVar10);
        }
        puVar6[uVar4] = 0;
        plVar7 = *(long **)(param_4 + 0x20);
        if (plVar7 == (long *)0x0) {
          puVar9 = (undefined8 *)__cxa_allocate_exception(8);
          *puVar9 = &PTR__bad_function_call_00cac7b8;
                    /* try { // try from 00985338 to 0098534b has its CatchHandler @ 00985358 */
                    /* WARNING: Subroutine does not return */
          __cxa_throw(puVar9,&std::__ndk1::bad_function_call::typeinfo,
                      std::bad_exception::~bad_exception);
        }
                    /* try { // try from 009850e4 to 009850eb has its CatchHandler @ 00985368 */
        (**(code **)(*plVar7 + 0x30))(plVar7,&local_40a8);
        if ((local_40a8 & 1) != 0) {
          operator_delete((void *)CONCAT17(uStack_4091,CONCAT61(uStack_4097,uStack_4098)));
        }
      }
      pfVar19 = pfVar19 + uVar4;
      plVar7 = *(long **)(param_3 + 0x20);
    }
    if (plVar7 != (long *)0x0) {
      local_40a8 = (uint)pfVar19;
      local_4074 = SUB84(param_2,0);
                    /* try { // try from 00985118 to 00985147 has its CatchHandler @ 0098539c */
      (**(code **)(*plVar7 + 0x30))(plVar7,&local_40a8,&local_4074);
    }
    if ((*(int *)(param_1 + 8) == -1) ||
       (iVar3 = poll(true,1,*(int *)(param_1 + 8),(unique_ptr *)(param_1 + 0x38)), iVar3 == 3)) {
      pcVar12 = "Poll Error";
LAB_00985164:
      uStack_4097 = 0;
      uStack_4098 = 0;
      uStack_4099 = 0;
      uVar13 = *(undefined8 *)pcVar12;
      uStack_409f = 0x726f;
      local_40a8 = CONCAT31((int3)uVar13,0x14);
      uStack_40a4 = (undefined4)((ulong)uVar13 >> 0x18);
      uStack_40a0 = (undefined1)((ulong)uVar13 >> 0x38);
      uStack_409d = 0;
LAB_009851e0:
      uStack_4091 = 0;
      *in_x8 = 0;
      *(ulong *)(in_x8 + 0x18) = (ulong)CONCAT61(uStack_4097,uStack_4098);
      *(ulong *)(in_x8 + 0x10) =
           CONCAT17(uStack_4099,CONCAT43(uStack_409d,CONCAT21(uStack_409f,uStack_40a0)));
      *(ulong *)(in_x8 + 8) = CONCAT44(uStack_40a4,local_40a8);
LAB_009852c0:
      if (local_4090 != (undefined1 *)0x0) {
        local_4088 = local_4090;
        operator_delete(local_4090);
      }
      if (*(long *)(lVar1 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      return;
    }
  }
  uStack_40a0 = 0;
  uStack_409f = 0;
  uStack_409d = 0;
  uStack_4099 = 0;
  uStack_4098 = 0;
  uStack_4097 = 0;
  uStack_4091 = 0;
  local_40a8 = 0;
  uStack_40a4 = 0;
  uVar4 = (long)local_4088 - (long)local_4090;
  if (0xffffffffffffffef < uVar4) {
                    /* try { // try from 00985350 to 00985357 has its CatchHandler @ 0098535c */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  if (uVar4 < 0x17) {
    local_40a8 = ((uint)uVar4 & 0x7f) << 1;
    puVar8 = (undefined1 *)((ulong)&local_40a8 | 1);
  }
  else {
    uVar18 = uVar4 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 00985204 to 0098520b has its CatchHandler @ 0098535c */
    puVar8 = operator_new(uVar18);
    local_40a8 = (uint)uVar18 | 1;
    uStack_40a0 = (undefined1)uVar4;
    uStack_409f = (undefined2)(uVar4 >> 8);
    uStack_409d = (undefined4)(uVar4 >> 0x18);
    uStack_4099 = (undefined1)(uVar4 >> 0x38);
    uStack_4098 = SUB81(puVar8,0);
    uStack_4097 = (undefined6)((ulong)puVar8 >> 8);
    uStack_4091 = (undefined1)((ulong)puVar8 >> 0x38);
    uStack_40a4 = (undefined4)(uVar18 >> 0x20);
  }
  if (puVar6 == puVar11) goto LAB_009852a0;
  puVar10 = puVar8;
  puVar16 = puVar6;
  if ((uVar4 < 0x20) || ((puVar8 < puVar11 && (puVar6 < puVar8 + uVar4)))) {
LAB_00985288:
    do {
      puVar15 = puVar16 + 1;
      *puVar10 = *puVar16;
      puVar10 = puVar10 + 1;
      puVar16 = puVar15;
    } while (puVar11 != puVar15);
  }
  else {
    uVar14 = uVar4 & 0xffffffffffffffe0;
    puVar9 = (undefined8 *)(puVar6 + 0x10);
    puVar17 = (undefined8 *)(puVar8 + 0x10);
    uVar18 = uVar14;
    do {
      puVar2 = puVar9 + -1;
      uVar13 = puVar9[-2];
      uVar21 = puVar9[1];
      uVar20 = *puVar9;
      puVar9 = puVar9 + 4;
      uVar18 = uVar18 - 0x20;
      puVar17[-1] = *puVar2;
      puVar17[-2] = uVar13;
      puVar17[1] = uVar21;
      *puVar17 = uVar20;
      puVar17 = puVar17 + 4;
    } while (uVar18 != 0);
    puVar10 = puVar8 + uVar14;
    puVar16 = puVar6 + uVar14;
    if (uVar14 != uVar4) goto LAB_00985288;
  }
  puVar8 = puVar8 + ((long)puVar11 - (long)puVar6);
LAB_009852a0:
  *puVar8 = 0;
  *in_x8 = 1;
  *(ulong *)(in_x8 + 0x18) = CONCAT17(uStack_4091,CONCAT61(uStack_4097,uStack_4098));
  *(ulong *)(in_x8 + 0x10) =
       CONCAT17(uStack_4099,CONCAT43(uStack_409d,CONCAT21(uStack_409f,uStack_40a0)));
  *(ulong *)(in_x8 + 8) = CONCAT44(uStack_40a4,local_40a8);
  goto LAB_009852c0;
}

