; FUN_00a0fb20 @ 00a0fb20
00a0fb20	stp x20,x19,[sp, #-0x20]!
00a0fb24	stp x29,x30,[sp, #0x10]
00a0fb28	mov x19,x1
00a0fb2c	mov x20,x0
00a0fb30	ldr x0,[x0]
00a0fb34	ldr x1,[x1]
00a0fb38	add x29,sp,#0x10
00a0fb3c	cmp x0,x1
00a0fb40	b.eq 0x00a0fb4c
00a0fb44	bl 0x00c301f0
00a0fb48	cbnz w0,0x00a0fb7c
00a0fb4c	ldr x0,[x20, #0x8]
00a0fb50	ldr x1,[x19, #0x8]
00a0fb54	cbz x0,0x00a0fb68
00a0fb58	cbz x1,0x00a0fb68
00a0fb5c	ldp x29,x30,[sp, #0x10]
00a0fb60	ldp x20,x19,[sp], #0x20
00a0fb64	b 0x00c301f0
00a0fb68	cmp x0,#0x0
00a0fb6c	mov w8,#0xffffffff
00a0fb70	cneg w8,w8,ne
00a0fb74	cmp x0,x1
00a0fb78	csel w0,wzr,w8,eq
00a0fb7c	ldp x29,x30,[sp, #0x10]
00a0fb80	ldp x20,x19,[sp], #0x20
00a0fb84	ret
