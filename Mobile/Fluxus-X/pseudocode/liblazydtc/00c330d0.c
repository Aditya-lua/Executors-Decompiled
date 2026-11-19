/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c330d0
 */

long __thiscall
std::__ndk1::uniform_int_distribution<long>::operator()
          (uniform_int_distribution<long> *this,mersenne_twister_engine *param_1,param_type *param_2
          )

{
  long lVar1;
  
  lVar1 = operator()(this,param_1,param_2);
  return lVar1;
}

