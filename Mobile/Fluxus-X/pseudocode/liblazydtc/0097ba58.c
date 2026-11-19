/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097ba58
 */

/* ix::makeCancellationRequestWithTimeout(int, std::__ndk1::atomic<bool>&) */

void __thiscall ix::makeCancellationRequestWithTimeout(ix *this,int param_1,atomic *param_2)

{
  undefined8 uVar1;
  undefined8 *in_x8;
  
  uVar1 = std::__ndk1::chrono::system_clock::now();
  *in_x8 = &PTR_LAB_00c51970;
  in_x8[1] = (ulong)(uint)param_1;
  in_x8[2] = uVar1;
  in_x8[3] = (long)(int)this;
  in_x8[4] = in_x8;
  return;
}

