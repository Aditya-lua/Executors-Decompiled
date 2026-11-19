; FUN_00a8a568 @ 00a8a568
00a8a568	sub sp,sp,#0x60
00a8a56c	stp x26,x25,[sp, #0x10]
00a8a570	stp x24,x23,[sp, #0x20]
00a8a574	stp x22,x21,[sp, #0x30]
00a8a578	stp x20,x19,[sp, #0x40]
00a8a57c	stp x29,x30,[sp, #0x50]
00a8a580	add x29,sp,#0x50
00a8a584	cbz x3,0x00a8a61c
00a8a588	adrp x25,0xcb5000
00a8a58c	ldr x25,[x25, #0x318]
00a8a590	lsr x8,x3,#0x1e
00a8a594	mov w9,#0x40000000
00a8a598	cmp x8,#0x0
00a8a59c	mov x19,x3
00a8a5a0	mov x20,x2
00a8a5a4	mov x21,x1
00a8a5a8	mov x22,x0
00a8a5ac	add x23,x0,#0x28
00a8a5b0	csel x24,x3,x9,eq
00a8a5b4	mov x0,x22
00a8a5b8	bl 0x00c3ceb0
00a8a5bc	str w0,[sp, #0xc]
00a8a5c0	mov x0,x22
00a8a5c4	bl 0x00c3cea0
00a8a5c8	mov x26,x0
00a8a5cc	mov x0,x22
00a8a5d0	bl 0x00c3cec0
00a8a5d4	mov w6,w0
00a8a5d8	add x5,sp,#0xc
00a8a5dc	mov x0,x20
00a8a5e0	mov x1,x21
00a8a5e4	mov x2,x24
00a8a5e8	mov x3,x26
00a8a5ec	mov x4,x23
00a8a5f0	mov x7,x25
00a8a5f4	bl 0x00c3e300
00a8a5f8	ldr w1,[sp, #0xc]
00a8a5fc	mov x0,x22
00a8a600	bl 0x00c3ced0
00a8a604	sub x19,x19,x24
00a8a608	cmp x19,x24
00a8a60c	add x20,x20,x24
00a8a610	add x21,x21,x24
00a8a614	csel x24,x19,x24,cc
00a8a618	cbnz x19,0x00a8a5b4
00a8a61c	ldp x29,x30,[sp, #0x50]
00a8a620	ldp x20,x19,[sp, #0x40]
00a8a624	ldp x22,x21,[sp, #0x30]
00a8a628	ldp x24,x23,[sp, #0x20]
00a8a62c	ldp x26,x25,[sp, #0x10]
00a8a630	mov w0,#0x1
00a8a634	add sp,sp,#0x60
00a8a638	ret
