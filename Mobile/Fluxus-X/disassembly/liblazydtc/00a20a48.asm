; DSA_set0_pqg @ 00a20a48
00a20a48	str x19,[sp, #-0x20]!
00a20a4c	stp x29,x30,[sp, #0x10]
00a20a50	mov x19,x0
00a20a54	ldr x8,[x0, #0x8]!
00a20a58	add x29,sp,#0x10
00a20a5c	orr x9,x1,x8
00a20a60	mov w8,wzr
00a20a64	cbz x9,0x00a20a9c
00a20a68	ldr x8,[x19, #0x10]
00a20a6c	orr x9,x2,x8
00a20a70	mov w8,wzr
00a20a74	cbz x9,0x00a20a9c
00a20a78	ldr x8,[x19, #0x18]
00a20a7c	orr x9,x3,x8
00a20a80	mov w8,wzr
00a20a84	cbz x9,0x00a20a9c
00a20a88	bl 0x00c3a060
00a20a8c	ldr x8,[x19, #0xc0]
00a20a90	add x8,x8,#0x1
00a20a94	str x8,[x19, #0xc0]
00a20a98	mov w8,#0x1
00a20a9c	ldp x29,x30,[sp, #0x10]
00a20aa0	mov w0,w8
00a20aa4	ldr x19,[sp], #0x20
00a20aa8	ret
