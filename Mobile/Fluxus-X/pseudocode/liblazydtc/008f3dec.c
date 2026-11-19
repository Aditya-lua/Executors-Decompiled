/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f3dec
 */

/* std::__ndk1::__tree<unsigned short, std::__ndk1::less<unsigned short>,
   std::__ndk1::allocator<unsigned short> >::destroy(std::__ndk1::__tree_node<unsigned short,
   void*>*) */

void __thiscall
std::__ndk1::
__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>::
destroy(__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
        *this,__tree_node *param_1)

{
  if (param_1 == (__tree_node *)0x0) {
    return;
  }
  destroy(this,*(__tree_node **)param_1);
  destroy(this,*(__tree_node **)(param_1 + 8));
  operator_delete(param_1);
  return;
}

