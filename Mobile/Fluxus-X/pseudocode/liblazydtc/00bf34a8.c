/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bf34a8
 */

void FUN_00bf34a8(undefined8 *param_1,long param_2)

{
  int iVar1;
  undefined8 *puVar2;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  long *plVar6;
  long *plVar7;
  ulong uVar8;
  undefined8 *local_70;
  undefined1 **local_68;
  undefined1 *local_48;
  
  *(undefined1 *)((long)param_1 + 0x122) = 0;
  *param_1 = &PTR_FUN_00cad530;
  param_1[1] = param_2 + -1;
  param_1[0x23] = 1;
  puVar2 = param_1 + 5;
  param_1[6] = 0;
  *puVar2 = 0;
  plVar6 = param_1 + 2;
  *plVar6 = (long)puVar2;
  param_1[8] = 0;
  param_1[7] = 0;
  param_1[10] = 0;
  param_1[9] = 0;
  param_1[0xc] = 0;
  param_1[0xb] = 0;
  param_1[0xe] = 0;
  param_1[0xd] = 0;
  param_1[0x10] = 0;
  param_1[0xf] = 0;
  param_1[0x12] = 0;
  param_1[0x11] = 0;
  param_1[0x14] = 0;
  param_1[0x13] = 0;
  param_1[0x16] = 0;
  param_1[0x15] = 0;
  param_1[0x18] = 0;
  param_1[0x17] = 0;
  param_1[0x1a] = 0;
  param_1[0x19] = 0;
  param_1[0x1c] = 0;
  param_1[0x1b] = 0;
  param_1[0x1e] = 0;
  param_1[0x1d] = 0;
  param_1[0x20] = 0;
  param_1[0x1f] = 0;
  param_1[0x22] = 0;
  param_1[0x21] = 0;
  *(undefined2 *)(param_1 + 0x24) = 0x4302;
  param_1[3] = puVar2;
  param_1[4] = param_1 + 0x23;
  DAT_00d27bb0 = &PTR__collate_00cae5e0;
  DAT_00d27bb8 = 0;
  local_70 = &std::__ndk1::collate<char>::id;
  if (std::__ndk1::collate<char>::id != -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf3588 to 00bf359f has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::collate<char>::id,&local_68,
               (_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d26fb8;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27bb8);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf35d8 to 00bf35df has its CatchHandler @ 00bf5228 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27bb0;
  local_70 = &std::__ndk1::collate<wchar_t>::id;
  DAT_00d27bc0 = &PTR__collate_00cae620;
  DAT_00d27bc8 = 0;
  if (std::__ndk1::collate<wchar_t>::id != -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf3664 to 00bf367b has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::collate<wchar_t>::id,&local_68,
               (_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d26fc8;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27bc8);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf36b4 to 00bf36bb has its CatchHandler @ 00bf5204 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27bc0;
                    /* try { // try from 00bf3700 to 00bf375b has its CatchHandler @ 00bf5254 */
  std::__ndk1::ctype<char>::ctype((ctype<char> *)&DAT_00d27bd0,(ulong *)0x0,false,1);
  local_70 = &std::__ndk1::ctype<char>::id;
  if (std::__ndk1::ctype<char>::id != -1) {
    local_68 = &local_48;
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::ctype<char>::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0
              );
  }
  uVar3 = (ulong)DAT_00d27278;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27bd8);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf3794 to 00bf379b has its CatchHandler @ 00bf51f4 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined **)(*plVar6 + uVar8 * 8) = &DAT_00d27bd0;
  local_70 = &std::__ndk1::ctype<wchar_t>::id;
  DAT_00d27bf0 = &PTR__codecvt_00cad910;
  DAT_00d27bf8 = 0;
  if (std::__ndk1::ctype<wchar_t>::id != -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf3820 to 00bf3837 has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::ctype<wchar_t>::id,&local_68,
               (_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d27268;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27bf8);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf3870 to 00bf3877 has its CatchHandler @ 00bf51e4 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27bf0;
  local_70 = &std::__ndk1::codecvt<char,char,mbstate_t>::id;
  DAT_00d27c00 = &PTR__codecvt_00cad9e0;
  DAT_00d27c08 = 0;
  if (std::__ndk1::codecvt<char,char,mbstate_t>::id != -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf38fc to 00bf3913 has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::codecvt<char,char,mbstate_t>::id,&local_68,
               (_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d27288;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27c08);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf394c to 00bf3953 has its CatchHandler @ 00bf51d4 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27c00;
                    /* try { // try from 00bf3998 to 00bf39eb has its CatchHandler @ 00bf5254 */
  std::__ndk1::codecvt<wchar_t,char,mbstate_t>::codecvt
            ((codecvt<wchar_t,char,mbstate_t> *)&DAT_00d27c10,1);
  local_70 = &std::__ndk1::codecvt<wchar_t,char,mbstate_t>::id;
  if (std::__ndk1::codecvt<wchar_t,char,mbstate_t>::id != -1) {
    local_68 = &local_48;
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::codecvt<wchar_t,char,mbstate_t>::id,&local_68,
               (_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d27298;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27c18);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf3a24 to 00bf3a2b has its CatchHandler @ 00bf51c4 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined **)(*plVar6 + uVar8 * 8) = &DAT_00d27c10;
  local_70 = &std::__ndk1::codecvt<char16_t,char,mbstate_t>::id;
  DAT_00d27c28 = &PTR__codecvt_00cada88;
  DAT_00d27c30 = 0;
  if (std::__ndk1::codecvt<char16_t,char,mbstate_t>::id != -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf3ab0 to 00bf3ac7 has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::codecvt<char16_t,char,mbstate_t>::id,&local_68,
               (_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d272a8;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27c30);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf3b00 to 00bf3b07 has its CatchHandler @ 00bf51b4 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27c28;
  local_70 = &std::__ndk1::codecvt<char32_t,char,mbstate_t>::id;
  DAT_00d27c38 = &PTR__codecvt_00cadbb8;
  DAT_00d27c40 = 0;
  if (std::__ndk1::codecvt<char32_t,char,mbstate_t>::id != -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf3b8c to 00bf3ba3 has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::codecvt<char32_t,char,mbstate_t>::id,&local_68,
               (_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d272c8;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27c40);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf3bdc to 00bf3be3 has its CatchHandler @ 00bf51a4 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27c38;
  local_70 = &std::__ndk1::codecvt<char16_t,char8_t,mbstate_t>::id;
  DAT_00d27c48 = &PTR__codecvt_00cadb20;
  DAT_00d27c50 = 0;
  if (std::__ndk1::codecvt<char16_t,char8_t,mbstate_t>::id != -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf3c68 to 00bf3c7f has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::codecvt<char16_t,char8_t,mbstate_t>::id,&local_68,
               (_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d272b8;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27c50);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf3cb8 to 00bf3cbf has its CatchHandler @ 00bf5194 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27c48;
  local_70 = &std::__ndk1::codecvt<char32_t,char8_t,mbstate_t>::id;
  DAT_00d27c58 = &PTR__codecvt_00cadc50;
  DAT_00d27c60 = 0;
  if (std::__ndk1::codecvt<char32_t,char8_t,mbstate_t>::id != -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf3d44 to 00bf3d5b has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::codecvt<char32_t,char8_t,mbstate_t>::id,&local_68,
               (_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d272d8;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27c60);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf3d94 to 00bf3d9b has its CatchHandler @ 00bf5184 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27c58;
                    /* try { // try from 00bf3de0 to 00bf3e33 has its CatchHandler @ 00bf5254 */
  std::__ndk1::numpunct<char>::numpunct((numpunct<char> *)&DAT_00d27c68,1);
  local_70 = &std::__ndk1::numpunct<char>::id;
  if (std::__ndk1::numpunct<char>::id != -1) {
    local_68 = &local_48;
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::numpunct<char>::id,&local_68,
               (_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d272e8;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27c70);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf3e6c to 00bf3e73 has its CatchHandler @ 00bf5174 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined **)(*plVar6 + uVar8 * 8) = &DAT_00d27c68;
                    /* try { // try from 00bf3eb8 to 00bf3f0b has its CatchHandler @ 00bf5254 */
  std::__ndk1::numpunct<wchar_t>::numpunct((numpunct<wchar_t> *)&DAT_00d27c98,1);
  local_70 = &std::__ndk1::numpunct<wchar_t>::id;
  if (std::__ndk1::numpunct<wchar_t>::id != -1) {
    local_68 = &local_48;
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::numpunct<wchar_t>::id,&local_68,
               (_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d272f8;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27ca0);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf3f44 to 00bf3f4b has its CatchHandler @ 00bf5164 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined **)(*plVar6 + uVar8 * 8) = &DAT_00d27c98;
  local_70 = &std::__ndk1::
              num_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
              id;
  DAT_00d27cc8 = &PTR__codecvt_00cae660;
  DAT_00d27cd0 = 0;
  if (std::__ndk1::
      num_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::id != -1)
  {
    local_68 = &local_48;
                    /* try { // try from 00bf3fd0 to 00bf3fe7 has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::
                         num_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>
                         ::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d26fd8;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27cd0);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf4020 to 00bf4027 has its CatchHandler @ 00bf5154 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27cc8;
  local_70 = &std::__ndk1::
              num_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
              ::id;
  DAT_00d27cd8 = &PTR__codecvt_00cae750;
  DAT_00d27ce0 = 0;
  if (std::__ndk1::
      num_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::
      id != -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf40ac to 00bf40c3 has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::
                         num_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
                         ::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d26fe8;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27ce0);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf40fc to 00bf4103 has its CatchHandler @ 00bf5144 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27cd8;
  local_70 = &std::__ndk1::
              num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
              id;
  DAT_00d27ce8 = &PTR__codecvt_00cae830;
  DAT_00d27cf0 = 0;
  if (std::__ndk1::
      num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::id != -1)
  {
    local_68 = &local_48;
                    /* try { // try from 00bf4188 to 00bf419f has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::
                         num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>
                         ::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d26ff8;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27cf0);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf41d8 to 00bf41df has its CatchHandler @ 00bf5134 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27ce8;
  local_70 = &std::__ndk1::
              num_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
              ::id;
  DAT_00d27cf8 = &PTR__codecvt_00cae908;
  DAT_00d27d00 = 0;
  if (std::__ndk1::
      num_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::
      id != -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf4264 to 00bf427b has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::
                         num_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
                         ::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d27008;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27d00);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf42b4 to 00bf42bb has its CatchHandler @ 00bf5124 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27cf8;
  local_70 = &std::__ndk1::moneypunct<char,false>::id;
  DAT_00d27d08 = &PTR__codecvt_00caefc0;
  DAT_00d27d10 = 0;
  if (std::__ndk1::moneypunct<char,false>::id != -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf4340 to 00bf4357 has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::moneypunct<char,false>::id,&local_68,
               (_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d27058;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27d10);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf4390 to 00bf4397 has its CatchHandler @ 00bf5114 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27d08;
  local_70 = &std::__ndk1::moneypunct<char,true>::id;
  DAT_00d27d18 = &PTR__codecvt_00caf078;
  DAT_00d27d20 = 0;
  if (std::__ndk1::moneypunct<char,true>::id != -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf441c to 00bf4433 has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::moneypunct<char,true>::id,&local_68,
               (_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d27068;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27d20);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf446c to 00bf4473 has its CatchHandler @ 00bf5104 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27d18;
  local_70 = &std::__ndk1::moneypunct<wchar_t,false>::id;
  DAT_00d27d28 = &PTR__codecvt_00caf120;
  DAT_00d27d30 = 0;
  if (std::__ndk1::moneypunct<wchar_t,false>::id != -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf44f8 to 00bf450f has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::moneypunct<wchar_t,false>::id,&local_68,
               (_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d27078;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27d30);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf4548 to 00bf454f has its CatchHandler @ 00bf50f4 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27d28;
  local_70 = &std::__ndk1::moneypunct<wchar_t,true>::id;
  DAT_00d27d38 = &PTR__codecvt_00caf1c8;
  DAT_00d27d40 = 0;
  if (std::__ndk1::moneypunct<wchar_t,true>::id != -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf45d4 to 00bf45eb has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::moneypunct<wchar_t,true>::id,&local_68,
               (_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d27088;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27d40);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf4624 to 00bf462b has its CatchHandler @ 00bf50e4 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27d38;
  local_70 = &std::__ndk1::
              money_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>
              ::id;
  DAT_00d27d48 = &PTR__codecvt_00caf490;
  DAT_00d27d50 = 0;
  if (std::__ndk1::
      money_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::id !=
      -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf46b0 to 00bf46c7 has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::
                         money_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>
                         ::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d27098;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27d50);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf4700 to 00bf4707 has its CatchHandler @ 00bf50d4 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27d48;
  local_70 = &std::__ndk1::
              money_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
              ::id;
  DAT_00d27d58 = &PTR__codecvt_00caf510;
  DAT_00d27d60 = 0;
  if (std::__ndk1::
      money_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
      ::id != -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf478c to 00bf47a3 has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::
                         money_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
                         ::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d270a8;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27d60);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf47dc to 00bf47e3 has its CatchHandler @ 00bf50c4 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27d58;
  local_70 = &std::__ndk1::
              money_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>
              ::id;
  DAT_00d27d68 = &PTR__codecvt_00caf590;
  DAT_00d27d70 = 0;
  if (std::__ndk1::
      money_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::id !=
      -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf4868 to 00bf487f has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::
                         money_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>
                         ::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d270b8;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27d70);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf48b8 to 00bf48bf has its CatchHandler @ 00bf50a0 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27d68;
  local_70 = &std::__ndk1::
              money_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
              ::id;
  DAT_00d27d78 = &PTR__codecvt_00caf610;
  DAT_00d27d80 = 0;
  if (std::__ndk1::
      money_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
      ::id != -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf4944 to 00bf495b has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::
                         money_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
                         ::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d270c8;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27d80);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf4994 to 00bf499b has its CatchHandler @ 00bf5090 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27d78;
  local_70 = &std::__ndk1::
              time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
              id;
  DAT_00d27d88 = &PTR_LAB_00cae9d0;
  DAT_00d27d90 = 0;
  DAT_00d27d98 = &PTR___weeks_00caea30;
  if (std::__ndk1::
      time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::id != -1
     ) {
    local_68 = &local_48;
                    /* try { // try from 00bf4a28 to 00bf4a3f has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::
                         time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>
                         ::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d27018;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27d90);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf4a78 to 00bf4a7f has its CatchHandler @ 00bf5080 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27d88;
  local_70 = &std::__ndk1::
              time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
              ::id;
  DAT_00d27da0 = &PTR_LAB_00caeae0;
  DAT_00d27da8 = 0;
  DAT_00d27db0 = &PTR___weeks_00caeb40;
  if (std::__ndk1::
      time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
      ::id != -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf4b0c to 00bf4b23 has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::
                         time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
                         ::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d27028;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27da8);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf4b5c to 00bf4b63 has its CatchHandler @ 00bf5070 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27da0;
  DAT_00d27db8 = &PTR__codecvt_00cad8d0;
  DAT_00d27dc0 = 0;
  if (((DAT_00d270f8 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d270f8), iVar1 != 0)) {
                    /* try { // try from 00bf4f90 to 00bf4fa3 has its CatchHandler @ 00bf5010 */
    DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
    __cxa_guard_release(&DAT_00d270f8);
  }
  DAT_00d27dc8 = DAT_00d270f0;
  local_70 = &std::__ndk1::
              time_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
              id;
  DAT_00d27db8 = &PTR_LAB_00caee50;
  if (std::__ndk1::
      time_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::id != -1
     ) {
    local_68 = &local_48;
                    /* try { // try from 00bf4c14 to 00bf4c2b has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::
                         time_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>
                         ::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d27038;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27dc0);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf4c64 to 00bf4c6b has its CatchHandler @ 00bf5060 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27db8;
  DAT_00d27dd0 = &PTR__codecvt_00cad8d0;
  DAT_00d27dd8 = 0;
  if (((DAT_00d270f8 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d270f8), iVar1 != 0)) {
                    /* try { // try from 00bf4fc8 to 00bf4fdb has its CatchHandler @ 00bf4ff0 */
    DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
    __cxa_guard_release(&DAT_00d270f8);
  }
  DAT_00d27de0 = DAT_00d270f0;
  local_70 = &std::__ndk1::
              time_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
              ::id;
  DAT_00d27dd0 = &PTR_LAB_00caeec8;
  if (std::__ndk1::
      time_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
      ::id != -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf4d08 to 00bf4d1f has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::
                         time_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
                         ::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d27048;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27dd8);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf4d58 to 00bf4d5f has its CatchHandler @ 00bf5050 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27dd0;
  local_70 = &std::__ndk1::messages<char>::id;
  DAT_00d27de8 = &PTR__codecvt_00caf690;
  DAT_00d27df0 = 0;
  if (std::__ndk1::messages<char>::id != -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf4de4 to 00bf4dfb has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::messages<char>::id,&local_68,
               (_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d270d8;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27df0);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf4e34 to 00bf4e3b has its CatchHandler @ 00bf5040 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27de8;
  local_70 = &std::__ndk1::messages<wchar_t>::id;
  DAT_00d27df8 = &PTR__codecvt_00caf718;
  DAT_00d27e00 = 0;
  if (std::__ndk1::messages<wchar_t>::id != -1) {
    local_68 = &local_48;
                    /* try { // try from 00bf4ec0 to 00bf4ed7 has its CatchHandler @ 00bf5254 */
    local_48 = (undefined1 *)&local_70;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::messages<wchar_t>::id,&local_68,
               (_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar3 = (ulong)DAT_00d270e8;
  uVar8 = uVar3 - 1;
  FUN_00c2bce0(1,&DAT_00d27e00);
  lVar4 = param_1[2];
  uVar5 = param_1[3] - lVar4 >> 3;
  if (uVar5 <= uVar8) {
    if (uVar3 < uVar5 || uVar3 - uVar5 == 0) {
      if (uVar3 < uVar5) {
        param_1[3] = lVar4 + uVar3 * 8;
      }
    }
    else {
                    /* try { // try from 00bf4f10 to 00bf4f17 has its CatchHandler @ 00bf5030 */
      FUN_00c0b6e4(plVar6,uVar3 - uVar5);
      lVar4 = *plVar6;
    }
  }
  plVar7 = *(long **)(lVar4 + uVar8 * 8);
  if ((plVar7 != (long *)0x0) && (lVar4 = FUN_00c2bd10(0xffffffffffffffff,plVar7 + 1), lVar4 == 0))
  {
    (**(code **)(*plVar7 + 0x10))(plVar7);
  }
  *(undefined ****)(*plVar6 + uVar8 * 8) = &DAT_00d27df8;
  return;
}

