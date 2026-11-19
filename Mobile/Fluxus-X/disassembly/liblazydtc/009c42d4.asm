; tls1_set_sigalgs_list @ 009c42d4
009c42d4	sub sp,sp,#0xa0
009c42d8	mov x8,x1
009c42dc	adrp x3,0x9c4000
009c42e0	stp x20,x19,[sp, #0x80]
009c42e4	mov w19,w2
009c42e8	mov x20,x0
009c42ec	add x3,x3,#0x348
009c42f0	mov w1,#0x3a
009c42f4	mov w2,#0x1
009c42f8	add x4,sp,#0x8
009c42fc	mov x0,x8
009c4300	stp x29,x30,[sp, #0x90]
009c4304	add x29,sp,#0x90
009c4308	str xzr,[sp, #0x8]
009c430c	bl 0x00c35230
009c4310	cbz w0,0x009c4338
009c4314	cbz x20,0x009c4334
009c4318	ldr x2,[sp, #0x8]
009c431c	add x8,sp,#0x8
009c4320	add x1,x8,#0x8
009c4324	mov x0,x20
009c4328	mov w3,w19
009c432c	bl 0x009c4518
009c4330	b 0x009c4338
009c4334	mov w0,#0x1
009c4338	ldp x29,x30,[sp, #0x90]
009c433c	ldp x20,x19,[sp, #0x80]
009c4340	add sp,sp,#0xa0
009c4344	ret
