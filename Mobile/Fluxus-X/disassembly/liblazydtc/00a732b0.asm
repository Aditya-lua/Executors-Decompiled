; FUN_00a732b0 @ 00a732b0
00a732b0	sub sp,sp,#0xd0
00a732b4	stp x22,x21,[sp, #0xa0]
00a732b8	stp x20,x19,[sp, #0xb0]
00a732bc	stp x29,x30,[sp, #0xc0]
00a732c0	ldr x8,[x2, #0x20]
00a732c4	mov w21,w0
00a732c8	add x29,sp,#0xc0
00a732cc	mov x19,x2
00a732d0	mov x0,x8
00a732d4	mov x20,x1
00a732d8	bl 0x00c37cd0
00a732dc	cmp w0,#0x6
00a732e0	b.eq 0x00a732f8
00a732e4	ldr x0,[x19, #0x20]
00a732e8	bl 0x00c37cd0
00a732ec	cmp w0,#0x390
00a732f0	mov w0,wzr
00a732f4	b.ne 0x00a7335c
00a732f8	ldr x0,[x19, #0x20]
00a732fc	bl 0x00c3d8d0
00a73300	mov x22,x0
00a73304	bl 0x00c3db80
00a73308	cmp w0,#0x6
00a7330c	b.cc 0x00a73358
00a73310	add x1,sp,#0x50
00a73314	mov x2,sp
00a73318	mov x0,x22
00a7331c	bl 0x00c3db30
00a73320	cbz w0,0x00a73358
00a73324	ldr x8,[sp, #0x78]
00a73328	cbz x8,0x00a73358
00a7332c	ldr x9,[x19, #0x30]
00a73330	mov w0,wzr
00a73334	ldr w9,[x9, #0x8]
00a73338	cmp w9,#0x2
00a7333c	b.ne 0x00a7335c
00a73340	mov w0,w21
00a73344	mov x1,x20
00a73348	mov x2,x19
00a7334c	str x8,[x19, #0x20]
00a73350	bl 0x00a6fd84
00a73354	b 0x00a7335c
00a73358	mov w0,wzr
00a7335c	ldp x29,x30,[sp, #0xc0]
00a73360	ldp x20,x19,[sp, #0xb0]
00a73364	ldp x22,x21,[sp, #0xa0]
00a73368	add sp,sp,#0xd0
00a7336c	ret
