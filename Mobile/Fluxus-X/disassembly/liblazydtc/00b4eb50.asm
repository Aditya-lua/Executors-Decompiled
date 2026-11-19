; FUN_00b4eb50 @ 00b4eb50
00b4eb50	stp x22,x21,[sp, #-0x30]!
00b4eb54	stp x20,x19,[sp, #0x10]
00b4eb58	stp x29,x30,[sp, #0x20]
00b4eb5c	add x29,sp,#0x20
00b4eb60	cbz x0,0x00b4ec00
00b4eb64	mov x19,x1
00b4eb68	cbz x1,0x00b4ebec
00b4eb6c	mov x20,x0
00b4eb70	bl 0x00c36880
00b4eb74	mov x1,x19
00b4eb78	bl 0x00c3b0f0
00b4eb7c	cbz w0,0x00b4ec00
00b4eb80	adrp x1,0x2bd000
00b4eb84	add x1,x1,#0xb5e
00b4eb88	mov x0,x19
00b4eb8c	bl 0x00c36530
00b4eb90	cbz x0,0x00b4ebd4
00b4eb94	mov x22,x0
00b4eb98	mov x0,x20
00b4eb9c	bl 0x00c3ad30
00b4eba0	bl 0x00c38a60
00b4eba4	mov x21,x0
00b4eba8	cbz x0,0x00b4ebf4
00b4ebac	ldr w8,[x22, #0x8]
00b4ebb0	cmp w8,#0x5
00b4ebb4	b.ne 0x00b4ebf4
00b4ebb8	ldp x1,x2,[x22, #0x10]
00b4ebbc	mov x0,x20
00b4ebc0	mov x3,x21
00b4ebc4	bl 0x00c3a850
00b4ebc8	cbz w0,0x00b4ebf4
00b4ebcc	mov x0,x21
00b4ebd0	bl 0x00c38a30
00b4ebd4	mov x0,x20
00b4ebd8	mov x1,x19
00b4ebdc	ldp x29,x30,[sp, #0x20]
00b4ebe0	ldp x20,x19,[sp, #0x10]
00b4ebe4	ldp x22,x21,[sp], #0x30
00b4ebe8	b 0x00c3a9b0
00b4ebec	mov w0,#0x1
00b4ebf0	b 0x00b4ec00
00b4ebf4	mov x0,x21
00b4ebf8	bl 0x00c38a30
00b4ebfc	mov w0,wzr
00b4ec00	ldp x29,x30,[sp, #0x20]
00b4ec04	ldp x20,x19,[sp, #0x10]
00b4ec08	ldp x22,x21,[sp], #0x30
00b4ec0c	ret
