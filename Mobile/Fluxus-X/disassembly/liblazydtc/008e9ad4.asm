; std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::sentry::~sentry @ 008e9ad4
008e9ad4	str x19,[sp, #-0x20]!
008e9ad8	stp x29,x30,[sp, #0x10]
008e9adc	add x29,sp,#0x10
008e9ae0	ldr x8,[x0, #0x8]
008e9ae4	mov x19,x0
008e9ae8	ldr x9,[x8]
008e9aec	ldur x9,[x9, #-0x18]
008e9af0	add x8,x8,x9
008e9af4	ldr x9,[x8, #0x28]
008e9af8	cbz x9,0x008e9b58
008e9afc	ldr w9,[x8, #0x20]
008e9b00	cbnz w9,0x008e9b58
008e9b04	ldrb w8,[x8, #0x9]
008e9b08	tbz w8,#0x5,0x008e9b58
008e9b0c	bl 0x00c30f00
008e9b10	tbnz w0,#0x0,0x008e9b58
008e9b14	ldr x8,[x19, #0x8]
008e9b18	ldr x9,[x8]
008e9b1c	ldur x9,[x9, #-0x18]
008e9b20	add x8,x8,x9
008e9b24	ldr x0,[x8, #0x28]
008e9b28	ldr x8,[x0]
008e9b2c	ldr x8,[x8, #0x30]
008e9b30	blr x8
008e9b34	cmn w0,#0x1
008e9b38	b.ne 0x008e9b58
008e9b3c	ldr x8,[x19, #0x8]
008e9b40	ldr x9,[x8]
008e9b44	ldur x9,[x9, #-0x18]
008e9b48	add x0,x8,x9
008e9b4c	ldr w8,[x0, #0x20]
008e9b50	orr w1,w8,#0x1
008e9b54	bl 0x00c30130
008e9b58	ldp x29,x30,[sp, #0x10]
008e9b5c	ldr x19,[sp], #0x20
008e9b60	ret
