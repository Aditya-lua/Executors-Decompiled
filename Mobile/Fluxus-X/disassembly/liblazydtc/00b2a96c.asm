; FUN_00b2a96c @ 00b2a96c
00b2a96c	stp x22,x21,[sp, #-0x30]!
00b2a970	stp x20,x19,[sp, #0x10]
00b2a974	mov x19,x5
00b2a978	mov x5,xzr
00b2a97c	stp x29,x30,[sp, #0x20]
00b2a980	add x29,sp,#0x20
00b2a984	mov x22,x3
00b2a988	mov x20,x0
00b2a98c	bl 0x00c41240
00b2a990	mov w21,w0
00b2a994	cbz x22,0x00b2a9ac
00b2a998	cbz w21,0x00b2a9ac
00b2a99c	ldr x8,[x20, #0xa8]
00b2a9a0	mov x0,x20
00b2a9a4	ldr x8,[x8, #0x20]
00b2a9a8	blr x8
00b2a9ac	cbz w21,0x00b2a9c8
00b2a9b0	mov x0,x20
00b2a9b4	mov x1,x19
00b2a9b8	bl 0x00b2ad0c
00b2a9bc	cmp w0,#0x0
00b2a9c0	csel w0,wzr,w21,eq
00b2a9c4	b 0x00b2a9cc
00b2a9c8	mov w0,wzr
00b2a9cc	ldp x29,x30,[sp, #0x20]
00b2a9d0	ldp x20,x19,[sp, #0x10]
00b2a9d4	ldp x22,x21,[sp], #0x30
00b2a9d8	ret
