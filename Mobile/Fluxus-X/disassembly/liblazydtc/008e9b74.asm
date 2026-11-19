; std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::flush @ 008e9b74
008e9b74	sub sp,sp,#0x40
008e9b78	stp x20,x19,[sp, #0x20]
008e9b7c	stp x29,x30,[sp, #0x30]
008e9b80	add x29,sp,#0x30
008e9b84	mrs x20,tpidr_el0
008e9b88	ldr x8,[x20, #0x28]
008e9b8c	mov x19,x0
008e9b90	str x8,[sp, #0x18]
008e9b94	ldr x8,[x0]
008e9b98	ldr x9,[x8, #-0x18]!
008e9b9c	add x9,x0,x9
008e9ba0	ldr x9,[x9, #0x28]
008e9ba4	cbz x9,0x008e9c1c
008e9ba8	strb wzr,[sp, #0x8]
008e9bac	str x19,[sp, #0x10]
008e9bb0	ldr x9,[x8]
008e9bb4	add x9,x19,x9
008e9bb8	ldr w10,[x9, #0x20]
008e9bbc	cbnz w10,0x008e9c14
008e9bc0	ldr x0,[x9, #0x88]
008e9bc4	cbz x0,0x008e9bd4
008e9bc8	bl 0x00c30e50
008e9bcc	ldr x8,[x19]
008e9bd0	sub x8,x8,#0x18
008e9bd4	mov w9,#0x1
008e9bd8	strb w9,[sp, #0x8]
008e9bdc	ldr x8,[x8]
008e9be0	add x8,x19,x8
008e9be4	ldr x0,[x8, #0x28]
008e9be8	ldr x8,[x0]
008e9bec	ldr x8,[x8, #0x30]
008e9bf0	blr x8
008e9bf4	cmn w0,#0x1
008e9bf8	b.ne 0x008e9c14
008e9bfc	ldr x8,[x19]
008e9c00	ldur x8,[x8, #-0x18]
008e9c04	add x0,x19,x8
008e9c08	ldr w8,[x0, #0x20]
008e9c0c	orr w1,w8,#0x1
008e9c10	bl 0x00c30130
008e9c14	add x0,sp,#0x8
008e9c18	bl 0x00c30e60
008e9c1c	ldr x8,[x20, #0x28]
008e9c20	ldr x9,[sp, #0x18]
008e9c24	cmp x8,x9
008e9c28	b.ne 0x008e9c40
008e9c2c	mov x0,x19
008e9c30	ldp x29,x30,[sp, #0x30]
008e9c34	ldp x20,x19,[sp, #0x20]
008e9c38	add sp,sp,#0x40
008e9c3c	ret
008e9c40	bl 0x00c2fec0
