; SRP_get_default_gN @ 00ae7204
00ae7204	stp x20,x19,[sp, #-0x20]!
00ae7208	adrp x20,0xcc9000
00ae720c	add x20,x20,#0x340
00ae7210	stp x29,x30,[sp, #0x10]
00ae7214	add x29,sp,#0x10
00ae7218	cbz x0,0x00ae72a4
00ae721c	adrp x8,0xcc9000
00ae7220	mov x19,x0
00ae7224	ldr x0,[x8, #0x340]
00ae7228	mov x1,x19
00ae722c	bl 0x00c301f0
00ae7230	cbz w0,0x00ae72ac
00ae7234	ldr x0,[x20, #0x18]
00ae7238	mov x1,x19
00ae723c	bl 0x00c301f0
00ae7240	cbz w0,0x00ae72b4
00ae7244	ldr x0,[x20, #0x30]
00ae7248	mov x1,x19
00ae724c	bl 0x00c301f0
00ae7250	cbz w0,0x00ae72bc
00ae7254	ldr x0,[x20, #0x48]
00ae7258	mov x1,x19
00ae725c	bl 0x00c301f0
00ae7260	cbz w0,0x00ae72c4
00ae7264	ldr x0,[x20, #0x60]
00ae7268	mov x1,x19
00ae726c	bl 0x00c301f0
00ae7270	cbz w0,0x00ae72cc
00ae7274	ldr x0,[x20, #0x78]
00ae7278	mov x1,x19
00ae727c	bl 0x00c301f0
00ae7280	cbz w0,0x00ae72d4
00ae7284	ldr x0,[x20, #0x90]
00ae7288	mov x1,x19
00ae728c	bl 0x00c301f0
00ae7290	mov w8,w0
00ae7294	mov x0,xzr
00ae7298	cbnz w8,0x00ae72e0
00ae729c	orr w8,wzr,#0x6
00ae72a0	b 0x00ae72d8
00ae72a4	mov x0,x20
00ae72a8	b 0x00ae72e0
00ae72ac	mov x8,xzr
00ae72b0	b 0x00ae72d8
00ae72b4	mov w8,#0x1
00ae72b8	b 0x00ae72d8
00ae72bc	mov w8,#0x2
00ae72c0	b 0x00ae72d8
00ae72c4	orr w8,wzr,#0x3
00ae72c8	b 0x00ae72d8
00ae72cc	mov w8,#0x4
00ae72d0	b 0x00ae72d8
00ae72d4	mov w8,#0x5
00ae72d8	orr w9,wzr,#0x18
00ae72dc	madd x0,x8,x9,x20
00ae72e0	ldp x29,x30,[sp, #0x10]
00ae72e4	ldp x20,x19,[sp], #0x20
00ae72e8	ret
