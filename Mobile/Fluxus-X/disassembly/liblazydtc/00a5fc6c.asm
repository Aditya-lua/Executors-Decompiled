; EVP_PKEY_CTX_set_group_name @ 00a5fc6c
00a5fc6c	sub sp,sp,#0xa0
00a5fc70	stp x20,x19,[sp, #0x80]
00a5fc74	mov x20,x1
00a5fc78	mov x19,x0
00a5fc7c	add x0,sp,#0x30
00a5fc80	mov w2,#0x50
00a5fc84	mov w1,wzr
00a5fc88	stp x29,x30,[sp, #0x90]
00a5fc8c	add x29,sp,#0x90
00a5fc90	bl 0x00c301c0
00a5fc94	cbz x19,0x00a5fcec
00a5fc98	ldr w8,[x19]
00a5fc9c	cmp w8,#0x2
00a5fca0	b.eq 0x00a5fcac
00a5fca4	cmp w8,#0x4
00a5fca8	b.ne 0x00a5fcec
00a5fcac	cbz x20,0x00a5fd20
00a5fcb0	adrp x0,0x2a2000
00a5fcb4	add x0,x0,#0x238
00a5fcb8	add x8,sp,#0x8
00a5fcbc	mov x1,x20
00a5fcc0	mov x2,xzr
00a5fcc4	bl 0x00c36280
00a5fcc8	ldr x8,[sp, #0x28]
00a5fccc	ldur q0,[sp, #0x18]
00a5fcd0	ldur q1,[sp, #0x8]
00a5fcd4	add x1,sp,#0x30
00a5fcd8	mov x0,x19
00a5fcdc	str x8,[sp, #0x50]
00a5fce0	stp q1,q0,[sp, #0x30]
00a5fce4	bl 0x00c36dd0
00a5fce8	b 0x00a5fd24
00a5fcec	bl 0x00c342a0
00a5fcf0	adrp x0,0x2a0000
00a5fcf4	adrp x2,0x2b9000
00a5fcf8	add x0,x0,#0x246
00a5fcfc	add x2,x2,#0xe01
00a5fd00	mov w1,#0x464
00a5fd04	bl 0x00c342b0
00a5fd08	orr w0,wzr,#0x6
00a5fd0c	mov w1,#0x93
00a5fd10	mov x2,xzr
00a5fd14	bl 0x00c342c0
00a5fd18	orr w0,wzr,#0xfffffffe
00a5fd1c	b 0x00a5fd24
00a5fd20	mov w0,#0xffffffff
00a5fd24	ldp x29,x30,[sp, #0x90]
00a5fd28	ldp x20,x19,[sp, #0x80]
00a5fd2c	add sp,sp,#0xa0
00a5fd30	ret
