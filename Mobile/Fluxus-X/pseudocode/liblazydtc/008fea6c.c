/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fea6c
 */

bool FUN_008fea6c(condition_variable *param_1,undefined8 param_2,long *param_3)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  
  lVar2 = std::__ndk1::chrono::steady_clock::now();
  lVar2 = *param_3 - lVar2;
  if (0 < lVar2) {
    std::__ndk1::chrono::steady_clock::now();
    lVar3 = std::__ndk1::chrono::system_clock::now();
    uVar4 = FUN_00c2ae48(lVar2);
    uVar4 = FUN_00c2b358(0xfffc000000000000,uVar4);
    uVar5 = FUN_00c2ae48(lVar3);
    uVar5 = FUN_00c2aeac(uVar5,0);
    iVar1 = FUN_00c2acf4(uVar5,uVar4);
    if (iVar1 < 0) {
      lVar2 = lVar2 + lVar3 * 1000;
    }
    else {
      lVar2 = 0x7fffffffffffffff;
    }
    std::__ndk1::condition_variable::__do_timed_wait(param_1,param_2,lVar2);
    std::__ndk1::chrono::steady_clock::now();
  }
  lVar2 = std::__ndk1::chrono::steady_clock::now();
  return *param_3 <= lVar2;
}

