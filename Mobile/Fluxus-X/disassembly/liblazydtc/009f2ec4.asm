; FUN_009f2ec4 @ 009f2ec4
009f2ec4	stp x29,x30,[sp, #-0x10]!
009f2ec8	mov x29,sp
009f2ecc	cbz x3,0x009f2f00
009f2ed0	ldrb w9,[x2]
009f2ed4	and w8,w9,#0x80
009f2ed8	cbz x1,0x009f2ee0
009f2edc	str w8,[x1]
009f2ee0	subs x10,x3,#0x1
009f2ee4	b.ne 0x009f2f34
009f2ee8	cbz x0,0x009f2f5c
009f2eec	ldrb w9,[x2]
009f2ef0	cbnz w8,0x009f2f64
009f2ef4	strb w9,[x0]
009f2ef8	mov w8,#0x1
009f2efc	b 0x009f304c
009f2f00	bl 0x00c342a0
009f2f04	adrp x0,0x2b9000
009f2f08	adrp x2,0x2a7000
009f2f0c	add x0,x0,#0xb0a
009f2f10	add x2,x2,#0xd0d
009f2f14	mov w1,#0xa0
009f2f18	bl 0x00c342b0
009f2f1c	mov w0,#0xd
009f2f20	mov w1,#0xde
009f2f24	mov x2,xzr
009f2f28	bl 0x00c342c0
009f2f2c	mov x8,xzr
009f2f30	b 0x009f304c
009f2f34	ldrb w11,[x2]
009f2f38	cbz w11,0x009f2fcc
009f2f3c	cmp w11,#0xff
009f2f40	mov x11,xzr
009f2f44	b.ne 0x009f3008
009f2f48	cmp x10,#0x2
009f2f4c	b.cs 0x009f2f74
009f2f50	mov w10,wzr
009f2f54	mov w11,#0x1
009f2f58	b 0x009f2fb0
009f2f5c	mov w8,#0x1
009f2f60	b 0x009f304c
009f2f64	neg w8,w9
009f2f68	strb w8,[x0]
009f2f6c	mov w8,#0x1
009f2f70	b 0x009f304c
009f2f74	and x14,x10,#-0x2
009f2f78	mov w12,wzr
009f2f7c	mov w13,wzr
009f2f80	orr x11,x10,#0x1
009f2f84	add x15,x2,#0x2
009f2f88	mov x16,x14
009f2f8c	ldurb w17,[x15, #-0x1]
009f2f90	ldrb w18,[x15], #0x2
009f2f94	subs x16,x16,#0x2
009f2f98	orr w12,w12,w17
009f2f9c	orr w13,w13,w18
009f2fa0	b.ne 0x009f2f8c
009f2fa4	cmp x10,x14
009f2fa8	orr w10,w13,w12
009f2fac	b.eq 0x009f2fc8
009f2fb0	add x12,x2,x11
009f2fb4	sub x11,x3,x11
009f2fb8	ldrb w13,[x12], #0x1
009f2fbc	subs x11,x11,#0x1
009f2fc0	orr w10,w10,w13
009f2fc4	b.ne 0x009f2fb8
009f2fc8	cbz w10,0x009f3058
009f2fcc	ldrb w10,[x2, #0x1]
009f2fd0	and w10,w10,#0x80
009f2fd4	cmp w8,w10
009f2fd8	b.ne 0x009f3004
009f2fdc	bl 0x00c342a0
009f2fe0	adrp x0,0x2b9000
009f2fe4	adrp x2,0x2a7000
009f2fe8	add x0,x0,#0xb0a
009f2fec	add x2,x2,#0xd0d
009f2ff0	mov w1,#0xc1
009f2ff4	bl 0x00c342b0
009f2ff8	mov w0,#0xd
009f2ffc	mov w1,#0xdd
009f3000	b 0x009f2f24
009f3004	mov w11,#0x1
009f3008	sub x8,x3,x11
009f300c	cbz x0,0x009f304c
009f3010	cbz x8,0x009f304c
009f3014	sbfx w11,w9,#0x7,#0x1
009f3018	add x10,x2,x3
009f301c	lsr w9,w9,#0x7
009f3020	sub x10,x10,#0x1
009f3024	and w11,w11,#0xff
009f3028	mov x12,x8
009f302c	ldrb w13,[x10], #-0x1
009f3030	add x14,x0,x12
009f3034	subs x12,x12,#0x1
009f3038	eor w13,w13,w11
009f303c	add w9,w9,w13
009f3040	sturb w9,[x14, #-0x1]
009f3044	lsr w9,w9,#0x8
009f3048	b.ne 0x009f302c
009f304c	mov x0,x8
009f3050	ldp x29,x30,[sp], #0x10
009f3054	ret
009f3058	mov x11,xzr
009f305c	sub x8,x3,x11
009f3060	cbnz x0,0x009f3010
009f3064	b 0x009f304c
