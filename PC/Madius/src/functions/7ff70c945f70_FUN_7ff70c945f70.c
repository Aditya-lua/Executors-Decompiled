/* 7ff70c945f70 FUN_7ff70c945f70 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c945f70(longlong param_1,longlong param_2,ulonglong param_3)

{
  char cVar1;
  code *pcVar2;
  
  if (((char)param_3 == '\0') && (*(longlong *)(param_2 + 0x390) != 0)) {
    return;
  }
  if (*(longlong *)(param_2 + 0x50) != 0) {
    FUN_7ff70c9848d0(param_1);
    *(undefined8 *)(param_2 + 0x50) = 0;
  }
  FUN_7ff70c988f50(param_2);
  FUN_7ff70c989430(param_2);
  cVar1 = *(char *)(param_2 + 0x616);
  FUN_7ff70c94b6f0(param_1,param_2);
  if ((*(longlong *)(param_2 + 0x2e8) != 0) &&
     (pcVar2 = *(code **)(*(longlong *)(param_2 + 0x2e8) + 0x60), pcVar2 != (code *)0x0)) {
    (*pcVar2)(param_1,param_2,
              CONCAT71((int7)((param_3 & 0xffffffff) >> 8),
                       (byte)(param_3 & 0xffffffff) | cVar1 != '\0'));
  }
  if ((param_1 != 0) && (*(char *)(param_1 + 0xa37) == '\x01')) {
    FUN_7ff70c941400(param_1,&UNK_7ff70cb84488);
  }
  FUN_7ff70c944d10(param_1);
  FUN_7ff70c954a90(param_1,1);
  FUN_7ff70c954a90(param_1,0);
  FUN_7ff70c94b5b0(param_1);
  FUN_7ff70c954a20(param_1,param_2,0);
  FUN_7ff70c954a20(param_1,param_2,1);
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_2 + 0x110));
  *(undefined8 *)(param_2 + 0x110) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_2 + 0xd8));
  *(undefined8 *)(param_2 + 0xd8) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_2 + 0x118));
  *(undefined8 *)(param_2 + 0x118) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_2 + 0xe0));
  *(undefined8 *)(param_2 + 0xe0) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_2 + 0xe8));
  *(undefined8 *)(param_2 + 0xe8) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_2 + 0xb0));
  *(undefined8 *)(param_2 + 0xb0) = 0;
  FUN_7ff70c941ec0(param_2 + 600);
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_2 + 0x150));
  *(undefined8 *)(param_2 + 0x150) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_2 + 0x158));
  *(undefined8 *)(param_2 + 0x158) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_2 + 0x168));
  *(undefined8 *)(param_2 + 0x168) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_2 + 0x160));
  *(undefined8 *)(param_2 + 0x160) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_2 + 0x170));
  *(undefined8 *)(param_2 + 0x170) = 0;
  FUN_7ff70c94fd10(param_2 + 0x5b0);
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_2 + 0x60));
  *(undefined8 *)(param_2 + 0x60) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_2 + 0x90));
  *(undefined8 *)(param_2 + 0x90) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_2 + 0x80));
  *(undefined8 *)(param_2 + 0x80) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_2 + 0x88));
  *(undefined8 *)(param_2 + 0x88) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_2 + 0x5e8));
  *(undefined8 *)(param_2 + 0x5e8) = 0;
  FUN_7ff70c941ec0(param_2 + 0x1e8);
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_2 + 0x5e0));
  *(undefined8 *)(param_2 + 0x5e0) = 0;
                    /* WARNING: Could not recover jumptable at 0x7ff70c946244. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*_DAT_7ff70cbebad8)(param_2);
  return;
}


