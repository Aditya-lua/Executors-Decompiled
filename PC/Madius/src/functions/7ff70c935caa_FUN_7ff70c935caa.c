/* 7ff70c935caa FUN_7ff70c935caa */

undefined8 FUN_7ff70c935caa(undefined8 param_1,longlong param_2)

{
  code *pcVar1;
  undefined8 uVar2;
  longlong alStack_110 [29];
  undefined8 uStack_28;
  
  uStack_28 = 0xfffffffffffffffe;
  if (param_2 != 0) {
    FUN_7ff70ca8ce60(alStack_110,1);
    func_0x7ff70d757c30((longlong)alStack_110 + (longlong)*(int *)(alStack_110[0] + 4),8);
    pcVar1 = (code *)swi(1);
    uVar2 = (*pcVar1)();
    return uVar2;
  }
  FUN_7ff70ca05eb0(param_1,&UNK_7ff70cb83219);
  return param_1;
}


