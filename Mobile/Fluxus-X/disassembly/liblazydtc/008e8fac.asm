; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::~basic_istream @ 008e8fac
008e8fac	str x19,[sp, #-0x20]!
008e8fb0	stp x29,x30,[sp, #0x10]
008e8fb4	add x29,sp,#0x10
008e8fb8	ldr x8,[x0]
008e8fbc	ldur x8,[x8, #-0x18]
008e8fc0	add x19,x0,x8
008e8fc4	add x0,x19,#0x10
008e8fc8	bl 0x00c30ee0
008e8fcc	ldp x29,x30,[sp, #0x10]
008e8fd0	mov x0,x19
008e8fd4	ldr x19,[sp], #0x20
008e8fd8	b 0x00c301d0
