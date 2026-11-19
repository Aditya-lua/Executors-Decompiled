; dtls1_buffer_message @ 009e1ed8
009e1ed8	str x21,[sp, #-0x30]!
009e1edc	stp x20,x19,[sp, #0x10]
009e1ee0	stp x29,x30,[sp, #0x20]
009e1ee4	ldr x8,[x0, #0xa0]
009e1ee8	mov x20,x0
009e1eec	mov w0,wzr
009e1ef0	add x29,sp,#0x20
009e1ef4	cbnz x8,0x009e2028
009e1ef8	ldr x0,[x20, #0x98]
009e1efc	mov w21,w1
009e1f00	mov w1,wzr
009e1f04	bl 0x009e2038
009e1f08	cbz x0,0x009e2028
009e1f0c	ldr x8,[x20, #0x88]
009e1f10	mov x19,x0
009e1f14	ldr x0,[x0, #0x58]
009e1f18	ldr x2,[x20, #0x98]
009e1f1c	ldr x1,[x8, #0x8]
009e1f20	bl 0x00c2ffd0
009e1f24	ldr x9,[x20, #0x4b8]
009e1f28	ldr x8,[x9, #0x140]
009e1f2c	cbz w21,0x009e1f54
009e1f30	ldr w10,[x20]
009e1f34	ldr w11,[x20, #0x98]
009e1f38	cmp w10,#0x100
009e1f3c	orr w10,wzr,#0x3
009e1f40	csinc x10,x10,xzr,eq
009e1f44	add x10,x10,x8
009e1f48	cmp x10,x11
009e1f4c	b.eq 0x009e1f64
009e1f50	b 0x009e1fec
009e1f54	ldr w10,[x20, #0x98]
009e1f58	add x11,x8,#0xc
009e1f5c	cmp x11,x10
009e1f60	b.ne 0x009e1fec
009e1f64	str x8,[x19, #0x8]
009e1f68	ldrh w10,[x9, #0x148]
009e1f6c	add x0,sp,#0x8
009e1f70	mov x1,x19
009e1f74	strh w10,[x19, #0x10]
009e1f78	ldrb w9,[x9, #0x138]
009e1f7c	stp xzr,x8,[x19, #0x18]
009e1f80	str w21,[x19, #0x28]
009e1f84	strb w9,[x19]
009e1f88	ldr x8,[x20, #0x878]
009e1f8c	lsl w9,w10,#0x1
009e1f90	sub w9,w9,w21
009e1f94	lsr w10,w9,#0x8
009e1f98	str x8,[x19, #0x30]
009e1f9c	ldr x8,[x20, #0x890]
009e1fa0	str x8,[x19, #0x38]
009e1fa4	ldr x8,[x20, #0x868]
009e1fa8	str x8,[x19, #0x40]
009e1fac	ldr x8,[x20, #0x918]
009e1fb0	str x8,[x19, #0x48]
009e1fb4	ldr x8,[x20, #0x1d10]
009e1fb8	ldrh w8,[x8, #0x2]
009e1fbc	strh w8,[x19, #0x50]
009e1fc0	str xzr,[sp, #0x8]
009e1fc4	strb w10,[sp, #0xe]
009e1fc8	strb w9,[sp, #0xf]
009e1fcc	bl 0x00c34520
009e1fd0	cbz x0,0x009e1fec
009e1fd4	ldr x8,[x20, #0x4b8]
009e1fd8	mov x1,x0
009e1fdc	ldr x0,[x8, #0x120]
009e1fe0	bl 0x00c34540
009e1fe4	mov w0,#0x1
009e1fe8	b 0x009e2028
009e1fec	ldr x0,[x19, #0x58]
009e1ff0	adrp x20,0x2c3000
009e1ff4	add x20,x20,#0x656
009e1ff8	mov w2,#0x63
009e1ffc	mov x1,x20
009e2000	bl 0x00c32310
009e2004	ldr x0,[x19, #0x60]
009e2008	mov w2,#0x64
009e200c	mov x1,x20
009e2010	bl 0x00c32310
009e2014	mov w2,#0x65
009e2018	mov x0,x19
009e201c	mov x1,x20
009e2020	bl 0x00c32310
009e2024	mov w0,wzr
009e2028	ldp x29,x30,[sp, #0x20]
009e202c	ldp x20,x19,[sp, #0x10]
009e2030	ldr x21,[sp], #0x30
009e2034	ret
