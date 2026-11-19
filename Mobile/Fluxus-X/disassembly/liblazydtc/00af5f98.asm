; FUN_00af5f98 @ 00af5f98
00af5f98	sub sp,sp,#0x40
00af5f9c	stp x20,x19,[sp, #0x20]
00af5fa0	mov x19,x0
00af5fa4	lsr w8,w1,#0x8
00af5fa8	stp x22,x21,[sp, #0x10]
00af5fac	stp x29,x30,[sp, #0x30]
00af5fb0	add x29,sp,#0x30
00af5fb4	strb w8,[sp, #0xc]
00af5fb8	strb w1,[sp, #0xd]
00af5fbc	cbz x2,0x00af5fd0
00af5fc0	ldr w8,[x2]
00af5fc4	orr w20,wzr,#0x3
00af5fc8	strb w8,[sp, #0xe]
00af5fcc	b 0x00af5fd4
00af5fd0	mov w20,#0x2
00af5fd4	mov x0,x19
00af5fd8	bl 0x00c325e0
00af5fdc	cmp w0,#0x1
00af5fe0	b.lt 0x00af6030
00af5fe4	mov w22,wzr
00af5fe8	mov x0,x19
00af5fec	mov w1,w22
00af5ff0	bl 0x00c32610
00af5ff4	ldr x8,[x0]
00af5ff8	ldr w9,[x8]
00af5ffc	cmp w9,w20
00af6000	b.ne 0x00af601c
00af6004	mov x21,x0
00af6008	ldr x0,[x8, #0x8]
00af600c	add x1,sp,#0xc
00af6010	mov x2,x20
00af6014	bl 0x00c300b0
00af6018	cbz w0,0x00af60a8
00af601c	mov x0,x19
00af6020	add w22,w22,#0x1
00af6024	bl 0x00c325e0
00af6028	cmp w22,w0
00af602c	b.lt 0x00af5fe8
00af6030	adrp x0,0xc7e000
00af6034	add x0,x0,#0x7f8
00af6038	bl 0x00c372e0
00af603c	mov x21,x0
00af6040	cbz x0,0x00af6094
00af6044	ldr x8,[x21, #0x8]
00af6048	cbnz x8,0x00af6060
00af604c	adrp x0,0xc7e000
00af6050	add x0,x0,#0x7c0
00af6054	bl 0x00c372e0
00af6058	str x0,[x21, #0x8]
00af605c	cbz x0,0x00af6094
00af6060	ldr x0,[x21]
00af6064	cbnz x0,0x00af6074
00af6068	bl 0x00c38170
00af606c	str x0,[x21]
00af6070	cbz x0,0x00af6094
00af6074	add x1,sp,#0xc
00af6078	mov w2,w20
00af607c	bl 0x00c377a0
00af6080	cbz w0,0x00af6094
00af6084	mov x0,x19
00af6088	mov x1,x21
00af608c	bl 0x00c347a0
00af6090	cbnz w0,0x00af60a8
00af6094	adrp x1,0xc7e000
00af6098	add x1,x1,#0x7f8
00af609c	mov x0,x21
00af60a0	bl 0x00c36160
00af60a4	mov x21,xzr
00af60a8	mov x0,x21
00af60ac	ldp x29,x30,[sp, #0x30]
00af60b0	ldp x20,x19,[sp, #0x20]
00af60b4	ldp x22,x21,[sp, #0x10]
00af60b8	add sp,sp,#0x40
00af60bc	ret
