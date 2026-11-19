/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098f2d0
 */

bool FUN_0098f2d0(condition_variable *param_1,undefined8 param_2,double *param_3)

{
  bool bVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  double dVar8;
  
  if (0.0 < *param_3) {
    lVar3 = std::__ndk1::chrono::steady_clock::now();
    lVar4 = std::__ndk1::chrono::system_clock::now();
    dVar8 = *param_3;
    uVar6 = FUN_00c2ad94(dVar8);
    uVar6 = FUN_00c2aeac(uVar6,0);
    uVar6 = FUN_00c2a8b4(uVar6,0xfffc000000000000);
    uVar7 = FUN_00c2ae48(lVar4);
    uVar7 = FUN_00c2aeac(uVar7,0);
    iVar2 = FUN_00c2acf4(uVar7,uVar6);
    if (iVar2 < 0) {
      dVar8 = dVar8 * 1000000.0;
      lVar5 = (long)dVar8;
      lVar4 = lVar5 + lVar4 * 1000 + (ulong)((double)lVar5 < dVar8);
    }
    else {
      lVar4 = 0x7fffffffffffffff;
    }
    std::__ndk1::condition_variable::__do_timed_wait(param_1,param_2,lVar4);
    lVar4 = std::__ndk1::chrono::steady_clock::now();
    bVar1 = *param_3 * 1000000.0 <= (double)(lVar4 - lVar3);
  }
  else {
    bVar1 = true;
  }
  return bVar1;
}

