; FUN_00a73370 @ 00a73370
00a73370	sub sp,sp,#0xd0
00a73374	stp x22,x21,[sp, #0xa0]
00a73378	stp x20,x19,[sp, #0xb0]
00a7337c	stp x29,x30,[sp, #0xc0]
00a73380	ldr x8,[x2, #0x20]
00a73384	mov w21,w0
00a73388	add x29,sp,#0xc0
00a7338c	mov x19,x2
00a73390	mov x0,x8
00a73394	mov x20,x1
00a73398	bl 0x00c37cd0
00a7339c	cmp w0,#0x6
00a733a0	b.eq 0x00a733b8
00a733a4	ldr x0,[x19, #0x20]
00a733a8	bl 0x00c37cd0
00a733ac	cmp w0,#0x390
00a733b0	mov w0,wzr
00a733b4	b.ne 0x00a7341c
00a733b8	ldr x0,[x19, #0x20]
00a733bc	bl 0x00c3d8d0
00a733c0	mov x22,x0
00a733c4	bl 0x00c3db80
00a733c8	cmp w0,#0x7
00a733cc	b.cc 0x00a73418
00a733d0	add x1,sp,#0x50
00a733d4	mov x2,sp
00a733d8	mov x0,x22
00a733dc	bl 0x00c3db30
00a733e0	cbz w0,0x00a73418
00a733e4	ldr x8,[sp, #0x80]
00a733e8	cbz x8,0x00a73418
00a733ec	ldr x9,[x19, #0x30]
00a733f0	mov w0,wzr
00a733f4	ldr w9,[x9, #0x8]
00a733f8	cmp w9,#0x2
00a733fc	b.ne 0x00a7341c
00a73400	mov w0,w21
00a73404	mov x1,x20
00a73408	mov x2,x19
00a7340c	str x8,[x19, #0x20]
00a73410	bl 0x00a6fd84
00a73414	b 0x00a7341c
00a73418	mov w0,wzr
00a7341c	ldp x29,x30,[sp, #0xc0]
00a73420	ldp x20,x19,[sp, #0xb0]
00a73424	ldp x22,x21,[sp, #0xa0]
00a73428	add sp,sp,#0xd0
00a7342c	ret
