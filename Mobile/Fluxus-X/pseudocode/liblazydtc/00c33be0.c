/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c33be0
 */

int __thiscall
std::__ndk1::uniform_int_distribution<int>::operator()
          (uniform_int_distribution<int> *this,linear_congruential_engine *param_1,
          param_type *param_2)

{
  int iVar1;
  
  iVar1 = operator()(this,param_1,param_2);
  return iVar1;
}

