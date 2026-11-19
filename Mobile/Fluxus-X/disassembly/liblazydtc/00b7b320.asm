; mbedtls_ms_time @ 00b7b320
00b7b320	sub sp,sp,#0x40
00b7b324	str x19,[sp, #0x20]
00b7b328	stp x29,x30,[sp, #0x30]
00b7b32c	add x29,sp,#0x30
00b7b330	mrs x19,tpidr_el0
00b7b334	ldr x8,[x19, #0x28]
00b7b338	orr w0,wzr,#0x7
00b7b33c	add x1,sp,#0x8
00b7b340	str x8,[sp, #0x18]
00b7b344	bl 0x00c308e0
00b7b348	cbz w0,0x00b7b360
00b7b34c	mov x0,xzr
00b7b350	bl 0x00c30970
00b7b354	mov w8,#0x3e8
00b7b358	mul x0,x0,x8
00b7b35c	b 0x00b7b388
00b7b360	ldp x9,x8,[sp, #0x8]
00b7b364	mov x11,#0x34db
00b7b368	movk x11,#0xd7b6, LSL #16
00b7b36c	movk x11,#0xde82, LSL #32
00b7b370	movk x11,#0x431b, LSL #48
00b7b374	smulh x8,x8,x11
00b7b378	asr x11,x8,#0x12
00b7b37c	mov w10,#0x3e8
00b7b380	add x8,x11,x8, LSR #0x3f
00b7b384	madd x0,x9,x10,x8
00b7b388	ldr x8,[x19, #0x28]
00b7b38c	ldr x9,[sp, #0x18]
00b7b390	cmp x8,x9
00b7b394	b.ne 0x00b7b3a8
00b7b398	ldp x29,x30,[sp, #0x30]
00b7b39c	ldr x19,[sp, #0x20]
00b7b3a0	add sp,sp,#0x40
00b7b3a4	ret
00b7b3a8	bl 0x00c2fec0
