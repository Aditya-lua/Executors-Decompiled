/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f3530
 */

/* int cpr::util::progressUserFunction<cpr::CancellationCallback>(cpr::CancellationCallback const*,
   long, long, long, long) */

int cpr::util::progressUserFunction<cpr::CancellationCallback>
              (CancellationCallback *param_1,long param_2,long param_3,long param_4,long param_5)

{
  uint uVar1;
  
  uVar1 = CancellationCallback::operator()(param_1,param_2,param_3,param_4,param_5);
  return ~uVar1 & 1;
}

