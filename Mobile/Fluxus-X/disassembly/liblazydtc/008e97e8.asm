; std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::~basic_streambuf @ 008e97e8
008e97e8	str x19,[sp, #-0x20]!
008e97ec	stp x29,x30,[sp, #0x10]
008e97f0	add x29,sp,#0x10
008e97f4	adrp x8,0xcb4000
008e97f8	ldr x8,[x8, #0xa08]
008e97fc	mov x19,x0
008e9800	add x8,x8,#0x10
008e9804	str x8,[x0], #0x8
008e9808	bl 0x00c30090
008e980c	ldp x29,x30,[sp, #0x10]
008e9810	mov x0,x19
008e9814	ldr x19,[sp], #0x20
008e9818	b 0x00c301d0
