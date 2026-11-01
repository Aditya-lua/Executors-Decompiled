
/* WARNING: Removing unreachable block (ram,0x00082720) */
/* WARNING: Removing unreachable block (ram,0x000827b0) */

void FUN_00082690(undefined8 param_1,undefined8 param_2)

{
  undefined8 ****ppppuVar1;
  undefined4 uVar2;
  undefined8 extraout_x1;
  undefined8 *extraout_x8;
  char acStack_98 [8];
  undefined4 uStack_90;
  undefined1 uStack_8c;
  char cStack_81;
  undefined8 auStack_80 [2];
  char cStack_69;
  undefined8 ****appppuStack_68 [2];
  char cStack_51;
  undefined1 auStack_50 [23];
  undefined1 uStack_39;
  undefined1 uStack_31;
  
  uVar2 = ___cxa_throw(param_1,param_2,&DAT_0008292c);
  cStack_81 = '\f';
  uStack_90 = 0x65676e61;
  acStack_98[0] = s_out_of_range_008d31ae[0];
  acStack_98[1] = s_out_of_range_008d31ae[1];
  acStack_98[2] = s_out_of_range_008d31ae[2];
  acStack_98[3] = s_out_of_range_008d31ae[3];
  acStack_98[4] = s_out_of_range_008d31ae[4];
  acStack_98[5] = s_out_of_range_008d31ae[5];
  acStack_98[6] = s_out_of_range_008d31ae[6];
  acStack_98[7] = s_out_of_range_008d31ae[7];
  uStack_8c = 0;
  uStack_31 = 0x2e;
  __ZNSt3__19to_stringEi(auStack_50);
  func_0x00079404(auStack_80,"[json.exception.",acStack_98,&uStack_31,auStack_50,"] ");
  uStack_39 = 0;
  auStack_50[0] = 0;
  func_0x00079304(appppuStack_68,auStack_80,auStack_50,extraout_x1);
  if (cStack_69 < '\0') {
    __ZdlPv(auStack_80[0]);
  }
  if (cStack_81 < '\0') {
    __ZdlPv(acStack_98);
  }
  ppppuVar1 = appppuStack_68[0];
  if (-1 < cStack_51) {
    ppppuVar1 = appppuStack_68;
  }
  *extraout_x8 = &UNK_009b9460;
  *(undefined4 *)(extraout_x8 + 1) = uVar2;
  __ZNSt13runtime_errorC1EPKc(extraout_x8 + 2,ppppuVar1);
  *extraout_x8 = &UNK_009b9548;
  if (cStack_51 < '\0') {
    __ZdlPv(appppuStack_68[0]);
    return;
  }
  return;
}

