; std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::pbackfail @ 008e94b8
008e94b8	ldr x9,[x0, #0x58]
008e94bc	ldr x10,[x0, #0x30]
008e94c0	mov x8,x0
008e94c4	mov w0,w1
008e94c8	cmp x9,x10
008e94cc	b.cs 0x008e94d8
008e94d0	mov x9,x10
008e94d4	str x10,[x8, #0x58]
008e94d8	ldp x11,x10,[x8, #0x10]
008e94dc	cmp x11,x10
008e94e0	b.cs 0x008e9500
008e94e4	cmn w0,#0x1
008e94e8	b.eq 0x008e9508
008e94ec	ldrb w11,[x8, #0x60]
008e94f0	tbnz w11,#0x4,0x008e9518
008e94f4	ldrb w11,[x10, #-0x1]!
008e94f8	cmp w11,w0, UXTB 
008e94fc	b.eq 0x008e951c
008e9500	mov w0,#0xffffffff
008e9504	ret
008e9508	mov w0,wzr
008e950c	sub x10,x10,#0x1
008e9510	stp x10,x9,[x8, #0x18]
008e9514	ret
008e9518	sub x10,x10,#0x1
008e951c	stp x10,x9,[x8, #0x18]
008e9520	strb w0,[x10]
008e9524	ret
