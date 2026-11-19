; std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::uflow @ 008e9478
008e9478	str x19,[sp, #-0x20]!
008e947c	stp x29,x30,[sp, #0x10]
008e9480	add x29,sp,#0x10
008e9484	ldr x8,[x0]
008e9488	mov x19,x0
008e948c	ldr x8,[x8, #0x48]
008e9490	blr x8
008e9494	cmn w0,#0x1
008e9498	b.eq 0x008e94ac
008e949c	ldr x8,[x19, #0x18]
008e94a0	add x9,x8,#0x1
008e94a4	str x9,[x19, #0x18]
008e94a8	ldrb w0,[x8]
008e94ac	ldp x29,x30,[sp, #0x10]
008e94b0	ldr x19,[sp], #0x20
008e94b4	ret
