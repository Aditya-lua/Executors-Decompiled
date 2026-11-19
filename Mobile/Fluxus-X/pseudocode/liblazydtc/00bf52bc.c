/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bf52bc
 */

void FUN_00bf52bc(undefined8 *param_1,byte *param_2,long param_3)

{
  char *pcVar1;
  bool bVar2;
  int iVar3;
  collate_byname<char> *this;
  collate_byname<wchar_t> *this_00;
  ctype_byname<char> *this_01;
  ctype_byname<wchar_t> *this_02;
  undefined8 *puVar4;
  codecvt<wchar_t,char,mbstate_t> *this_03;
  numpunct_byname<char> *this_04;
  numpunct_byname<wchar_t> *this_05;
  void *pvVar5;
  long lVar6;
  long lVar7;
  ulong uVar9;
  long lVar8;
  ulong uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  
  *param_1 = &PTR_FUN_00cad530;
  param_1[1] = param_3 + -1;
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
  if ((*param_2 & 1) == 0) {
    uVar12 = *(undefined8 *)(param_2 + 8);
    uVar11 = *(undefined8 *)param_2;
    param_1[0x26] = *(undefined8 *)(param_2 + 0x10);
    param_1[0x25] = uVar12;
    param_1[0x24] = uVar11;
  }
  else {
                    /* try { // try from 00bf5360 to 00bf536b has its CatchHandler @ 00bf583c */
    FUN_007ff40c(param_1 + 0x24,*(undefined8 *)(param_2 + 0x10),*(undefined8 *)(param_2 + 8));
  }
  if (((DAT_00d27240 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d27240), iVar3 != 0)) {
                    /* try { // try from 00bf5800 to 00bf5813 has its CatchHandler @ 00bf5828 */
    FUN_00bf34a8(&DAT_00d27100,1);
    DAT_00d27238 = (undefined8 *)&DAT_00d27100;
    __cxa_guard_release(&DAT_00d27240);
  }
  if (param_1 != DAT_00d27238) {
                    /* try { // try from 00bf5398 to 00bf539f has its CatchHandler @ 00bf58fc */
    FUN_00c0b578(param_1 + 2,DAT_00d27238[2],DAT_00d27238[3],
                 (long)(DAT_00d27238[3] - DAT_00d27238[2]) >> 3);
  }
  lVar7 = param_1[2];
  lVar6 = param_1[3];
  if (lVar6 != lVar7) {
    uVar9 = 0;
    uVar10 = 1;
    do {
      lVar8 = *(long *)(lVar7 + uVar9 * 8);
      if (lVar8 != 0) {
        FUN_00c2bce0(1,lVar8 + 8);
        lVar7 = param_1[2];
        lVar6 = param_1[3];
      }
      bVar2 = uVar10 < (ulong)(lVar6 - lVar7 >> 3);
      uVar9 = uVar10;
      uVar10 = (ulong)((int)uVar10 + 1);
    } while (bVar2);
  }
                    /* try { // try from 00bf53e8 to 00bf53ef has its CatchHandler @ 00bf58fc */
  this = operator_new(0x18);
                    /* try { // try from 00bf53f0 to 00bf53ff has its CatchHandler @ 00bf58e4 */
  std::__ndk1::collate_byname<char>::collate_byname
            (this,(basic_string_conflict *)(param_1 + 0x24),0);
                    /* try { // try from 00bf5400 to 00bf5413 has its CatchHandler @ 00bf58fc */
  FUN_00bf5a30(param_1,this);
  this_00 = operator_new(0x18);
                    /* try { // try from 00bf5414 to 00bf5423 has its CatchHandler @ 00bf58e0 */
  std::__ndk1::collate_byname<wchar_t>::collate_byname
            (this_00,(basic_string_conflict *)(param_1 + 0x24),0);
                    /* try { // try from 00bf5424 to 00bf5437 has its CatchHandler @ 00bf58fc */
  FUN_00bf5b5c(param_1,this_00);
  this_01 = operator_new(0x28);
                    /* try { // try from 00bf5438 to 00bf5447 has its CatchHandler @ 00bf58cc */
  std::__ndk1::ctype_byname<char>::ctype_byname(this_01,(basic_string_conflict *)(param_1 + 0x24),0)
  ;
                    /* try { // try from 00bf5448 to 00bf545b has its CatchHandler @ 00bf58fc */
  FUN_00bf5c88(param_1,this_01);
  this_02 = operator_new(0x18);
                    /* try { // try from 00bf545c to 00bf546b has its CatchHandler @ 00bf58c8 */
  std::__ndk1::ctype_byname<wchar_t>::ctype_byname
            (this_02,(basic_string_conflict *)(param_1 + 0x24),0);
                    /* try { // try from 00bf546c to 00bf54a7 has its CatchHandler @ 00bf58fc */
  FUN_00bf5db4(param_1,this_02);
  puVar4 = operator_new(0x10);
  *puVar4 = &PTR__codecvt_byname_00caf840;
  puVar4[1] = 0xffffffffffffffff;
  FUN_00bf5ee0(param_1);
  this_03 = operator_new(0x18);
  pcVar1 = (char *)((long)param_1 + 0x121);
  if ((*(byte *)(param_1 + 0x24) & 1) != 0) {
    pcVar1 = (char *)param_1[0x26];
  }
                    /* try { // try from 00bf54c0 to 00bf54c7 has its CatchHandler @ 00bf58b4 */
  std::__ndk1::codecvt<wchar_t,char,mbstate_t>::codecvt(this_03,pcVar1,0);
  *(undefined ***)this_03 = &PTR__codecvt_byname_00caf8b8;
                    /* try { // try from 00bf54d8 to 00bf558b has its CatchHandler @ 00bf58fc */
  FUN_00bf600c(param_1,this_03);
  puVar4 = operator_new(0x10);
  *puVar4 = &PTR__codecvt_byname_00caf930;
  puVar4[1] = 0xffffffffffffffff;
  FUN_00bf6138(param_1);
  puVar4 = operator_new(0x10);
  *puVar4 = &PTR__codecvt_byname_00caf9a8;
  puVar4[1] = 0xffffffffffffffff;
  FUN_00bf6264(param_1);
  puVar4 = operator_new(0x10);
  *puVar4 = &PTR__codecvt_byname_00cafa20;
  puVar4[1] = 0xffffffffffffffff;
  FUN_00bf6390(param_1);
  puVar4 = operator_new(0x10);
  *puVar4 = &PTR__codecvt_byname_00cafa98;
  puVar4[1] = 0xffffffffffffffff;
  FUN_00bf64bc(param_1);
  this_04 = operator_new(0x30);
                    /* try { // try from 00bf558c to 00bf559b has its CatchHandler @ 00bf58a0 */
  std::__ndk1::numpunct_byname<char>::numpunct_byname
            (this_04,(basic_string_conflict *)(param_1 + 0x24),0);
                    /* try { // try from 00bf559c to 00bf55af has its CatchHandler @ 00bf58fc */
  FUN_00bf65e8(param_1,this_04);
  this_05 = operator_new(0x30);
                    /* try { // try from 00bf55b0 to 00bf55bf has its CatchHandler @ 00bf589c */
  std::__ndk1::numpunct_byname<wchar_t>::numpunct_byname
            (this_05,(basic_string_conflict *)(param_1 + 0x24),0);
                    /* try { // try from 00bf55c0 to 00bf55d3 has its CatchHandler @ 00bf58fc */
  FUN_00bf6714(param_1,this_05);
  pvVar5 = operator_new(0x88);
                    /* try { // try from 00bf55d4 to 00bf55e3 has its CatchHandler @ 00bf5888 */
  FUN_00bf696c(pvVar5,param_1 + 0x24,0);
                    /* try { // try from 00bf55e4 to 00bf55f7 has its CatchHandler @ 00bf58fc */
  FUN_00bf6840(param_1,pvVar5);
  pvVar5 = operator_new(0x88);
                    /* try { // try from 00bf55f8 to 00bf5607 has its CatchHandler @ 00bf5884 */
  FUN_00bf6b9c(pvVar5,param_1 + 0x24,0);
                    /* try { // try from 00bf5608 to 00bf561b has its CatchHandler @ 00bf58fc */
  FUN_00bf6a70(param_1,pvVar5);
  pvVar5 = operator_new(0x88);
                    /* try { // try from 00bf561c to 00bf562b has its CatchHandler @ 00bf5880 */
  FUN_00bf6dcc(pvVar5,param_1 + 0x24,0);
                    /* try { // try from 00bf562c to 00bf563f has its CatchHandler @ 00bf58fc */
  FUN_00bf6ca0(param_1,pvVar5);
  pvVar5 = operator_new(0x88);
                    /* try { // try from 00bf5640 to 00bf564f has its CatchHandler @ 00bf587c */
  FUN_00bf6fa4(pvVar5,param_1 + 0x24,0);
                    /* try { // try from 00bf5650 to 00bf5663 has its CatchHandler @ 00bf58fc */
  FUN_00bf6e78(param_1,pvVar5);
  puVar4 = operator_new(0x440);
  *puVar4 = &PTR_LAB_00cae9d0;
  puVar4[1] = 0xffffffffffffffff;
  puVar4[2] = &PTR___weeks_00caea30;
                    /* try { // try from 00bf5684 to 00bf568f has its CatchHandler @ 00bf5864 */
  std::__ndk1::__time_get_storage<char>::__time_get_storage
            ((__time_get_storage<char> *)(puVar4 + 3),(basic_string_conflict *)(param_1 + 0x24));
  *puVar4 = &PTR_LAB_00caebe0;
  puVar4[2] = &PTR_LAB_00caec78;
                    /* try { // try from 00bf56a8 to 00bf56bb has its CatchHandler @ 00bf58fc */
  FUN_00bf7050(param_1,puVar4);
  puVar4 = operator_new(0x440);
  *puVar4 = &PTR_LAB_00caeae0;
  puVar4[1] = 0xffffffffffffffff;
  puVar4[2] = &PTR___weeks_00caeb40;
                    /* try { // try from 00bf56dc to 00bf56e7 has its CatchHandler @ 00bf5860 */
  std::__ndk1::__time_get_storage<wchar_t>::__time_get_storage
            ((__time_get_storage<wchar_t> *)(puVar4 + 3),(basic_string_conflict *)(param_1 + 0x24));
  *puVar4 = &PTR_LAB_00caed20;
  puVar4[2] = &PTR_LAB_00caedb8;
                    /* try { // try from 00bf5700 to 00bf5713 has its CatchHandler @ 00bf58fc */
  FUN_00bf717c(param_1,puVar4);
  puVar4 = operator_new(0x18);
  *puVar4 = &PTR__codecvt_00cad8d0;
  puVar4[1] = 0xffffffffffffffff;
                    /* try { // try from 00bf572c to 00bf5733 has its CatchHandler @ 00bf5848 */
  std::__ndk1::__time_put::__time_put
            ((__time_put *)(puVar4 + 2),(basic_string_conflict *)(param_1 + 0x24));
  *puVar4 = &PTR_LAB_00caef30;
                    /* try { // try from 00bf5744 to 00bf5757 has its CatchHandler @ 00bf58fc */
  FUN_00bf72a8(param_1,puVar4);
  puVar4 = operator_new(0x18);
  *puVar4 = &PTR__codecvt_00cad8d0;
  puVar4[1] = 0xffffffffffffffff;
                    /* try { // try from 00bf5768 to 00bf576f has its CatchHandler @ 00bf5844 */
  std::__ndk1::__time_put::__time_put
            ((__time_put *)(puVar4 + 2),(basic_string_conflict *)(param_1 + 0x24));
  *puVar4 = &PTR_LAB_00caef78;
                    /* try { // try from 00bf5780 to 00bf57db has its CatchHandler @ 00bf58fc */
  FUN_00bf73d4(param_1,puVar4);
  puVar4 = operator_new(0x10);
  *puVar4 = &PTR__codecvt_00caf790;
  puVar4[1] = 0xffffffffffffffff;
  FUN_00bf7500(param_1);
  puVar4 = operator_new(0x10);
  *puVar4 = &PTR__codecvt_00caf7e8;
  puVar4[1] = 0xffffffffffffffff;
  FUN_00bf762c(param_1);
  return;
}

