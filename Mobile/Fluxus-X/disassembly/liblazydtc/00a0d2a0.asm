; CONF_get_number @ 00a0d2a0
00a0d2a0	sub sp,sp,#0x70
00a0d2a4	stp x29,x30,[sp, #0x60]
00a0d2a8	add x29,sp,#0x60
00a0d2ac	str x23,[sp, #0x30]
00a0d2b0	stp x22,x21,[sp, #0x40]
00a0d2b4	stp x20,x19,[sp, #0x50]
00a0d2b8	mov x19,x2
00a0d2bc	mov x20,x1
00a0d2c0	mov x21,x0
00a0d2c4	stur xzr,[x29, #-0x28]
00a0d2c8	bl 0x00c35250
00a0d2cc	cbz x21,0x00a0d31c
00a0d2d0	adrp x22,0xd21000
00a0d2d4	ldr x0,[x22, #0x950]
00a0d2d8	cbnz x0,0x00a0d2e4
00a0d2dc	bl 0x00c39420
00a0d2e0	str x0,[x22, #0x950]
00a0d2e4	ldr x8,[x0, #0x10]
00a0d2e8	mov x0,sp
00a0d2ec	blr x8
00a0d2f0	mov x0,sp
00a0d2f4	sub x3,x29,#0x28
00a0d2f8	mov x1,x20
00a0d2fc	mov x2,x19
00a0d300	str x21,[sp, #0x10]
00a0d304	bl 0x00a0d414
00a0d308	mov w19,w0
00a0d30c	bl 0x00c35240
00a0d310	cbz w19,0x00a0d3f4
00a0d314	ldur x19,[x29, #-0x28]
00a0d318	b 0x00a0d3f8
00a0d31c	mov x0,xzr
00a0d320	mov x1,x20
00a0d324	mov x2,x19
00a0d328	bl 0x00c393f0
00a0d32c	cbz x0,0x00a0d39c
00a0d330	mov x20,x0
00a0d334	ldrb w0,[x0]
00a0d338	bl 0x00c37770
00a0d33c	mov x19,xzr
00a0d340	cbz w0,0x00a0d390
00a0d344	mov x21,#0x2f
00a0d348	orr x22,xzr,#0x6666666666666666
00a0d34c	add x20,x20,#0x1
00a0d350	movk x21,#0x8000, LSL #48
00a0d354	movk x22,#0x6667
00a0d358	mov w23,#0xa
00a0d35c	ldurb w8,[x20, #-0x1]
00a0d360	sub x9,x21,x8
00a0d364	smulh x9,x9,x22
00a0d368	asr x10,x9,#0x2
00a0d36c	add x9,x10,x9, LSR #0x3f
00a0d370	cmp x19,x9
00a0d374	b.gt 0x00a0d3c4
00a0d378	ldrb w0,[x20], #0x1
00a0d37c	nop
00a0d380	madd x8,x19,x23,x8
00a0d384	sub x19,x8,#0x30
00a0d388	bl 0x00c37770
00a0d38c	cbnz w0,0x00a0d35c
00a0d390	stur x19,[x29, #-0x28]
00a0d394	bl 0x00c35240
00a0d398	b 0x00a0d3f8
00a0d39c	bl 0x00c342a0
00a0d3a0	adrp x0,0x2af000
00a0d3a4	adrp x2,0x2cd000
00a0d3a8	add x0,x0,#0xd73
00a0d3ac	add x2,x2,#0x8b3
00a0d3b0	mov w1,#0x138
00a0d3b4	bl 0x00c342b0
00a0d3b8	orr w0,wzr,#0xe
00a0d3bc	mov w1,#0x6a
00a0d3c0	b 0x00a0d3e8
00a0d3c4	bl 0x00c342a0
00a0d3c8	adrp x0,0x2af000
00a0d3cc	adrp x2,0x2d7000
00a0d3d0	add x0,x0,#0xd73
00a0d3d4	add x2,x2,#0xc73
00a0d3d8	mov w1,#0x166
00a0d3dc	bl 0x00c342b0
00a0d3e0	orr w0,wzr,#0xe
00a0d3e4	mov w1,#0x79
00a0d3e8	mov x2,xzr
00a0d3ec	bl 0x00c342c0
00a0d3f0	bl 0x00c35240
00a0d3f4	mov x19,xzr
00a0d3f8	mov x0,x19
00a0d3fc	ldp x29,x30,[sp, #0x60]
00a0d400	ldp x20,x19,[sp, #0x50]
00a0d404	ldp x22,x21,[sp, #0x40]
00a0d408	ldr x23,[sp, #0x30]
00a0d40c	add sp,sp,#0x70
00a0d410	ret
