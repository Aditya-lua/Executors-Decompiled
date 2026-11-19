; NCONF_get_string @ 00a0d210
00a0d210	str x21,[sp, #-0x30]!
00a0d214	stp x20,x19,[sp, #0x10]
00a0d218	stp x29,x30,[sp, #0x20]
00a0d21c	add x29,sp,#0x20
00a0d220	mov x19,x2
00a0d224	mov x20,x1
00a0d228	mov x21,x0
00a0d22c	bl 0x00c393f0
00a0d230	cbnz x0,0x00a0d290
00a0d234	bl 0x00c342a0
00a0d238	adrp x0,0x2af000
00a0d23c	adrp x2,0x2cd000
00a0d240	add x0,x0,#0xd73
00a0d244	add x2,x2,#0x8b3
00a0d248	cbz x21,0x00a0d274
00a0d24c	mov w1,#0x13b
00a0d250	bl 0x00c342b0
00a0d254	adrp x2,0x2bd000
00a0d258	add x2,x2,#0x829
00a0d25c	orr w0,wzr,#0xe
00a0d260	mov w1,#0x6c
00a0d264	mov x3,x20
00a0d268	mov x4,x19
00a0d26c	bl 0x00c342c0
00a0d270	b 0x00a0d28c
00a0d274	mov w1,#0x138
00a0d278	bl 0x00c342b0
00a0d27c	orr w0,wzr,#0xe
00a0d280	mov w1,#0x6a
00a0d284	mov x2,xzr
00a0d288	bl 0x00c342c0
00a0d28c	mov x0,xzr
00a0d290	ldp x29,x30,[sp, #0x20]
00a0d294	ldp x20,x19,[sp, #0x10]
00a0d298	ldr x21,[sp], #0x30
00a0d29c	ret
