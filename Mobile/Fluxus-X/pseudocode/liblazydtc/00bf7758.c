/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bf7758
 */

void FUN_00bf7758(undefined8 *param_1,undefined8 *param_2,basic_string_conflict *param_3,
                 uint param_4)

{
  size_t __n;
  char *pcVar1;
  size_t sVar2;
  byte bVar3;
  basic_string_conflict bVar4;
  bool bVar5;
  int iVar6;
  collate_byname<char> *this;
  collate_byname<wchar_t> *this_00;
  ctype_byname<char> *this_01;
  ctype_byname<wchar_t> *this_02;
  undefined8 *puVar7;
  codecvt<wchar_t,char,mbstate_t> *this_03;
  void *pvVar8;
  numpunct_byname<char> *this_04;
  numpunct_byname<wchar_t> *this_05;
  long lVar9;
  long lVar10;
  ulong uVar12;
  long lVar11;
  basic_string_conflict *pbVar13;
  size_t sVar14;
  ulong uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  
  *param_1 = &PTR_FUN_00cad530;
  param_1[1] = 0xffffffffffffffff;
  param_1[0x23] = 1;
  param_1[6] = 0;
  param_1[5] = 0;
  param_1[2] = param_1 + 5;
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
  param_1[3] = param_1 + 0x23;
  param_1[4] = param_1 + 0x23;
  bVar3 = *(byte *)(param_2 + 0x24);
  sVar14 = param_2[0x25];
  __n = (ulong)(bVar3 >> 1);
  if ((bVar3 & 1) != 0) {
    __n = sVar14;
  }
  if (__n == 1) {
    pcVar1 = (char *)((long)param_2 + 0x121);
    if ((bVar3 & 1) != 0) {
      pcVar1 = (char *)param_2[0x26];
    }
    if (*pcVar1 != '*') goto LAB_00bf7824;
  }
  else {
LAB_00bf7824:
    bVar4 = *param_3;
    sVar2 = (ulong)((byte)bVar4 >> 1);
    if (((byte)bVar4 & 1) != 0) {
      sVar2 = *(size_t *)(param_3 + 8);
    }
    if (sVar2 == 1) {
      pbVar13 = *(basic_string_conflict **)(param_3 + 0x10);
      if (((byte)bVar4 & 1) == 0) {
        pbVar13 = param_3 + 1;
      }
      if (*pbVar13 == (basic_string_conflict)0x2a) goto LAB_00bf7898;
    }
    if (param_4 == 0) {
LAB_00bf7d30:
      if ((bVar3 & 1) == 0) {
        uVar17 = param_2[0x25];
        uVar16 = param_2[0x24];
        param_1[0x26] = param_2[0x26];
        param_1[0x25] = uVar17;
        param_1[0x24] = uVar16;
      }
      else {
                    /* try { // try from 00bf7d4c to 00bf7d63 has its CatchHandler @ 00bf7d68 */
        FUN_007ff40c(param_1 + 0x24,param_2[0x26],sVar14);
      }
      goto LAB_00bf78a4;
    }
    if (__n == sVar2) {
      pbVar13 = *(basic_string_conflict **)(param_3 + 0x10);
      pvVar8 = (void *)((long)param_2 + 0x121);
      if ((bVar3 & 1) != 0) {
        pvVar8 = (void *)param_2[0x26];
      }
      if (((byte)bVar4 & 1) == 0) {
        pbVar13 = param_3 + 1;
      }
      iVar6 = memcmp(pvVar8,pbVar13,__n);
      if (iVar6 == 0) goto LAB_00bf7d30;
    }
  }
LAB_00bf7898:
  *(undefined1 *)((long)param_1 + 0x122) = 0;
  *(undefined2 *)(param_1 + 0x24) = 0x2a02;
LAB_00bf78a4:
  if (param_1 != param_2) {
                    /* try { // try from 00bf78b8 to 00bf78c3 has its CatchHandler @ 00bf7e10 */
    FUN_00c0b578(param_1 + 2,param_2[2],param_2[3],(long)(param_2[3] - param_2[2]) >> 3);
  }
  lVar10 = param_1[2];
  lVar9 = param_1[3];
  if (lVar9 != lVar10) {
    uVar12 = 0;
    uVar15 = 1;
    do {
      lVar11 = *(long *)(lVar10 + uVar12 * 8);
      if (lVar11 != 0) {
        FUN_00c2bce0(1,lVar11 + 8);
        lVar10 = param_1[2];
        lVar9 = param_1[3];
      }
      bVar5 = uVar15 < (ulong)(lVar9 - lVar10 >> 3);
      uVar12 = uVar15;
      uVar15 = (ulong)((int)uVar15 + 1);
    } while (bVar5);
  }
  if ((param_4 >> 3 & 1) != 0) {
                    /* try { // try from 00bf7910 to 00bf7917 has its CatchHandler @ 00bf7e18 */
    this = operator_new(0x18);
                    /* try { // try from 00bf7918 to 00bf7927 has its CatchHandler @ 00bf7dfc */
    std::__ndk1::collate_byname<char>::collate_byname(this,param_3,0);
                    /* try { // try from 00bf7928 to 00bf793b has its CatchHandler @ 00bf7e18 */
    FUN_00bf5a30(param_1,this);
    this_00 = operator_new(0x18);
                    /* try { // try from 00bf793c to 00bf794b has its CatchHandler @ 00bf7df8 */
    std::__ndk1::collate_byname<wchar_t>::collate_byname(this_00,param_3,0);
                    /* try { // try from 00bf794c to 00bf7963 has its CatchHandler @ 00bf7e18 */
    FUN_00bf5b5c(param_1,this_00);
  }
  if ((param_4 & 1) != 0) {
    this_01 = operator_new(0x28);
                    /* try { // try from 00bf7964 to 00bf7973 has its CatchHandler @ 00bf7de4 */
    std::__ndk1::ctype_byname<char>::ctype_byname(this_01,param_3,0);
                    /* try { // try from 00bf7974 to 00bf7987 has its CatchHandler @ 00bf7e18 */
    FUN_00bf5c88(param_1,this_01);
    this_02 = operator_new(0x18);
                    /* try { // try from 00bf7988 to 00bf7997 has its CatchHandler @ 00bf7de0 */
    std::__ndk1::ctype_byname<wchar_t>::ctype_byname(this_02,param_3,0);
                    /* try { // try from 00bf7998 to 00bf79d3 has its CatchHandler @ 00bf7e18 */
    FUN_00bf5db4(param_1,this_02);
    puVar7 = operator_new(0x10);
    *puVar7 = &PTR__codecvt_byname_00caf840;
    puVar7[1] = 0xffffffffffffffff;
    FUN_00bf5ee0(param_1);
    this_03 = operator_new(0x18);
    pbVar13 = *(basic_string_conflict **)(param_3 + 0x10);
    if (((byte)*param_3 & 1) == 0) {
      pbVar13 = param_3 + 1;
    }
                    /* try { // try from 00bf79e8 to 00bf79ef has its CatchHandler @ 00bf7ddc */
    std::__ndk1::codecvt<wchar_t,char,mbstate_t>::codecvt(this_03,(char *)pbVar13,0);
    *(undefined ***)this_03 = &PTR__codecvt_byname_00caf8b8;
                    /* try { // try from 00bf7a00 to 00bf7ab7 has its CatchHandler @ 00bf7e18 */
    FUN_00bf600c(param_1,this_03);
    puVar7 = operator_new(0x10);
    *puVar7 = &PTR__codecvt_byname_00caf930;
    puVar7[1] = 0xffffffffffffffff;
    FUN_00bf6138(param_1);
    puVar7 = operator_new(0x10);
    *puVar7 = &PTR__codecvt_byname_00caf9a8;
    puVar7[1] = 0xffffffffffffffff;
    FUN_00bf6264(param_1);
    puVar7 = operator_new(0x10);
    *puVar7 = &PTR__codecvt_byname_00cafa20;
    puVar7[1] = 0xffffffffffffffff;
    FUN_00bf6390(param_1);
    puVar7 = operator_new(0x10);
    *puVar7 = &PTR__codecvt_byname_00cafa98;
    puVar7[1] = 0xffffffffffffffff;
    FUN_00bf64bc(param_1);
  }
  if ((param_4 >> 4 & 1) != 0) {
    pvVar8 = operator_new(0x88);
                    /* try { // try from 00bf7ab8 to 00bf7ac7 has its CatchHandler @ 00bf7dc8 */
    FUN_00bf696c(pvVar8,param_3,0);
                    /* try { // try from 00bf7ac8 to 00bf7adb has its CatchHandler @ 00bf7e18 */
    FUN_00bf6840(param_1,pvVar8);
    pvVar8 = operator_new(0x88);
                    /* try { // try from 00bf7adc to 00bf7aeb has its CatchHandler @ 00bf7dc4 */
    FUN_00bf6b9c(pvVar8,param_3,0);
                    /* try { // try from 00bf7aec to 00bf7aff has its CatchHandler @ 00bf7e18 */
    FUN_00bf6a70(param_1,pvVar8);
    pvVar8 = operator_new(0x88);
                    /* try { // try from 00bf7b00 to 00bf7b0f has its CatchHandler @ 00bf7dc0 */
    FUN_00bf6dcc(pvVar8,param_3,0);
                    /* try { // try from 00bf7b10 to 00bf7b23 has its CatchHandler @ 00bf7e18 */
    FUN_00bf6ca0(param_1,pvVar8);
    pvVar8 = operator_new(0x88);
                    /* try { // try from 00bf7b24 to 00bf7b33 has its CatchHandler @ 00bf7da8 */
    FUN_00bf6fa4(pvVar8,param_3,0);
                    /* try { // try from 00bf7b34 to 00bf7b4b has its CatchHandler @ 00bf7e18 */
    FUN_00bf6e78(param_1,pvVar8);
  }
  if ((param_4 >> 1 & 1) != 0) {
    this_04 = operator_new(0x30);
                    /* try { // try from 00bf7b4c to 00bf7b5b has its CatchHandler @ 00bf7dac */
    std::__ndk1::numpunct_byname<char>::numpunct_byname(this_04,param_3,0);
                    /* try { // try from 00bf7b5c to 00bf7b6f has its CatchHandler @ 00bf7e18 */
    FUN_00bf65e8(param_1,this_04);
    this_05 = operator_new(0x30);
                    /* try { // try from 00bf7b70 to 00bf7b7f has its CatchHandler @ 00bf7da4 */
    std::__ndk1::numpunct_byname<wchar_t>::numpunct_byname(this_05,param_3,0);
                    /* try { // try from 00bf7b80 to 00bf7b97 has its CatchHandler @ 00bf7e18 */
    FUN_00bf6714(param_1,this_05);
  }
  if ((param_4 >> 2 & 1) != 0) {
    puVar7 = operator_new(0x440);
    *puVar7 = &PTR_LAB_00cae9d0;
    puVar7[1] = 0xffffffffffffffff;
    puVar7[2] = &PTR___weeks_00caea30;
                    /* try { // try from 00bf7bb8 to 00bf7bc3 has its CatchHandler @ 00bf7d88 */
    std::__ndk1::__time_get_storage<char>::__time_get_storage
              ((__time_get_storage<char> *)(puVar7 + 3),param_3);
    *puVar7 = &PTR_LAB_00caebe0;
    puVar7[2] = &PTR_LAB_00caec78;
                    /* try { // try from 00bf7bdc to 00bf7bef has its CatchHandler @ 00bf7e18 */
    FUN_00bf7050(param_1,puVar7);
    puVar7 = operator_new(0x440);
    *puVar7 = &PTR_LAB_00caeae0;
    puVar7[1] = 0xffffffffffffffff;
    puVar7[2] = &PTR___weeks_00caeb40;
                    /* try { // try from 00bf7c10 to 00bf7c1b has its CatchHandler @ 00bf7d84 */
    std::__ndk1::__time_get_storage<wchar_t>::__time_get_storage
              ((__time_get_storage<wchar_t> *)(puVar7 + 3),param_3);
    *puVar7 = &PTR_LAB_00caed20;
    puVar7[2] = &PTR_LAB_00caedb8;
                    /* try { // try from 00bf7c34 to 00bf7c47 has its CatchHandler @ 00bf7e18 */
    FUN_00bf717c(param_1,puVar7);
    puVar7 = operator_new(0x18);
    *puVar7 = &PTR__codecvt_00cad8d0;
    puVar7[1] = 0xffffffffffffffff;
                    /* try { // try from 00bf7c60 to 00bf7c67 has its CatchHandler @ 00bf7d74 */
    std::__ndk1::__time_put::__time_put((__time_put *)(puVar7 + 2),param_3);
    *puVar7 = &PTR_LAB_00caef30;
                    /* try { // try from 00bf7c78 to 00bf7c8b has its CatchHandler @ 00bf7e18 */
    FUN_00bf72a8(param_1,puVar7);
    puVar7 = operator_new(0x18);
    *puVar7 = &PTR__codecvt_00cad8d0;
    puVar7[1] = 0xffffffffffffffff;
                    /* try { // try from 00bf7c9c to 00bf7ca3 has its CatchHandler @ 00bf7d70 */
    std::__ndk1::__time_put::__time_put((__time_put *)(puVar7 + 2),param_3);
    *puVar7 = &PTR_LAB_00caef78;
                    /* try { // try from 00bf7cb4 to 00bf7d13 has its CatchHandler @ 00bf7e18 */
    FUN_00bf73d4(param_1,puVar7);
  }
  if ((param_4 >> 5 & 1) != 0) {
    puVar7 = operator_new(0x10);
    *puVar7 = &PTR__codecvt_00caf790;
    puVar7[1] = 0xffffffffffffffff;
    FUN_00bf7500(param_1);
    puVar7 = operator_new(0x10);
    *puVar7 = &PTR__codecvt_00caf7e8;
    puVar7[1] = 0xffffffffffffffff;
    FUN_00bf762c(param_1);
  }
  return;
}

