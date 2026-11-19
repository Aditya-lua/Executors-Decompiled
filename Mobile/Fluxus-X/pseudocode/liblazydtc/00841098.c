/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00841098
 */

void FUN_00841098(locale *param_1,char *param_2,undefined4 param_3)

{
  undefined8 uVar1;
  size_t sVar2;
  char *pcVar3;
  
  std::__ndk1::locale::locale(param_1);
                    /* try { // try from 008410b8 to 008410db has its CatchHandler @ 0084113c */
  uVar1 = std::__ndk1::locale::use_facet(param_1,(id *)&std::__ndk1::ctype<char>::id);
  *(undefined8 *)(param_1 + 8) = uVar1;
  uVar1 = std::__ndk1::locale::use_facet(param_1,(id *)&std::__ndk1::collate<char>::id);
  *(undefined8 *)(param_1 + 0x10) = uVar1;
  *(undefined4 *)(param_1 + 0x18) = param_3;
  *(undefined4 *)(param_1 + 0x3c) = 0;
  *(undefined8 *)(param_1 + 0x24) = 0;
  *(undefined8 *)(param_1 + 0x1c) = 0;
  *(undefined8 *)(param_1 + 0x34) = 0;
  *(undefined8 *)(param_1 + 0x2c) = 0;
  sVar2 = strlen(param_2);
                    /* try { // try from 00841100 to 0084112b has its CatchHandler @ 0084112c */
  pcVar3 = (char *)FUN_00841f98(param_1,param_2,param_2 + sVar2);
  if (pcVar3 != param_2 + sVar2) {
    uVar1 = FUN_008422a4();
                    /* catch() { ... } // from try @ 00841100 with catch @ 0084112c */
    FUN_00841f48(param_1 + 0x28);
    std::__ndk1::locale::~locale(param_1);
                    /* WARNING: Subroutine does not return */
    FUN_00c2c090(uVar1);
  }
  return;
}

