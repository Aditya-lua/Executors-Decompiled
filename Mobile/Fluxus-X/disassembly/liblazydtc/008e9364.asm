; std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::xsgetn @ 008e9364
008e9364	stp x24,x23,[sp, #-0x40]!
008e9368	stp x22,x21,[sp, #0x10]
008e936c	stp x20,x19,[sp, #0x20]
008e9370	stp x29,x30,[sp, #0x30]
008e9374	add x29,sp,#0x30
008e9378	mov x20,x2
008e937c	mov x21,x1
008e9380	cmp x2,#0x1
008e9384	mov x22,x0
008e9388	mov x19,xzr
008e938c	b.lt 0x008e9408
008e9390	orr w24,wzr,#0x7fffffff
008e9394	ldp x1,x8,[x22, #0x18]
008e9398	cmp x1,x8
008e939c	b.cs 0x008e93dc
008e93a0	sub x8,x8,x1
008e93a4	sub x9,x20,x19
008e93a8	cmp x9,x8
008e93ac	csel x8,x9,x8,lt
008e93b0	cmp x8,x24
008e93b4	csel x23,x8,x24,lt
008e93b8	cbz x23,0x008e93cc
008e93bc	mov x0,x21
008e93c0	mov x2,x23
008e93c4	bl 0x00c2ffd0
008e93c8	ldr x1,[x22, #0x18]
008e93cc	add x8,x1,w23, SXTW 
008e93d0	add x21,x21,x23
008e93d4	str x8,[x22, #0x18]
008e93d8	b 0x008e93fc
008e93dc	ldr x8,[x22]
008e93e0	mov x0,x22
008e93e4	ldr x8,[x8, #0x50]
008e93e8	blr x8
008e93ec	cmn w0,#0x1
008e93f0	b.eq 0x008e9408
008e93f4	strb w0,[x21], #0x1
008e93f8	mov w23,#0x1
008e93fc	add x19,x23,x19
008e9400	cmp x19,x20
008e9404	b.lt 0x008e9394
008e9408	mov x0,x19
008e940c	ldp x29,x30,[sp, #0x30]
008e9410	ldp x20,x19,[sp, #0x20]
008e9414	ldp x22,x21,[sp, #0x10]
008e9418	ldp x24,x23,[sp], #0x40
008e941c	ret
