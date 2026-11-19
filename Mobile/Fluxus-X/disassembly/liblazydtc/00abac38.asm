; FUN_00abac38 @ 00abac38
00abac38	sub sp,sp,#0x70
00abac3c	stp x28,x27,[sp, #0x10]
00abac40	stp x26,x25,[sp, #0x20]
00abac44	stp x24,x23,[sp, #0x30]
00abac48	stp x22,x21,[sp, #0x40]
00abac4c	stp x20,x19,[sp, #0x50]
00abac50	stp x29,x30,[sp, #0x60]
00abac54	add x29,sp,#0x60
00abac58	mov x19,x3
00abac5c	mov x20,x2
00abac60	mov x21,x1
00abac64	mov x22,x0
00abac68	bl 0x00c325e0
00abac6c	cmp w0,#0x1
00abac70	b.lt 0x00abae10
00abac74	adrp x27,0x774000
00abac78	adrp x24,0x2d8000
00abac7c	mov w23,wzr
00abac80	add x27,x27,#0x46c
00abac84	add x24,x24,#0x5d4
00abac88	mov x0,x22
00abac8c	mov w1,w23
00abac90	bl 0x00c32610
00abac94	mov w1,#0x9c
00abac98	mov x25,x0
00abac9c	bl 0x00c3f4e0
00abaca0	cbz x0,0x00abacac
00abaca4	ldr x26,[x0, #0x8]
00abaca8	b 0x00abacb0
00abacac	mov x26,xzr
00abacb0	mov w1,#0x9d
00abacb4	mov x0,x25
00abacb8	bl 0x00c3f4e0
00abacbc	cbz x0,0x00abacc8
00abacc0	ldr x28,[x0, #0x8]
00abacc4	b 0x00abaccc
00abacc8	mov x28,xzr
00abaccc	mov x0,x25
00abacd0	bl 0x00c3f530
00abacd4	sub w8,w0,#0x96
00abacd8	cmp w8,#0x5
00abacdc	b.hi 0x00abadfc
00abace0	ldrsw x8,[x27, x8, LSL #0x2]
00abace4	add x8,x8,x27
00abace8	br x8
00abacec	cbz x20,0x00abadfc
00abacf0	ldr x8,[x20]
00abacf4	cbnz x8,0x00abadfc
00abacf8	mov x0,x25
00abacfc	bl 0x00c3f4f0
00abad00	bl 0x00c3d0a0
00abad04	str x0,[x20]
00abad08	cbnz x0,0x00abadfc
00abad0c	b 0x00abae14
00abad10	cbz x20,0x00abadfc
00abad14	ldr x8,[x20]
00abad18	cbnz x8,0x00abadfc
00abad1c	mov w2,#0xffffffff
00abad20	mov x0,x25
00abad24	mov x1,x21
00abad28	bl 0x00c3f370
00abad2c	cbz x0,0x00abae14
00abad30	mov x25,x0
00abad34	bl 0x00c3d0a0
00abad38	str x0,[x20]
00abad3c	mov x0,x25
00abad40	bl 0x00c37d00
00abad44	ldr x8,[x20]
00abad48	cbnz x8,0x00abadfc
00abad4c	b 0x00abae3c
00abad50	cbz x19,0x00abadfc
00abad54	mov x0,x25
00abad58	bl 0x00c3f520
00abad5c	cmp w0,#0x9e
00abad60	b.ne 0x00abadfc
00abad64	mov x0,x25
00abad68	bl 0x00c3f510
00abad6c	cbz x0,0x00abae14
00abad70	mov x25,x0
00abad74	cbz x28,0x00abad8c
00abad78	ldr x1,[x28, #0x8]
00abad7c	ldr w2,[x28]
00abad80	mov x0,x25
00abad84	bl 0x00c3f580
00abad88	cbz w0,0x00abae34
00abad8c	cbz x26,0x00abadcc
00abad90	add x0,sp,#0x8
00abad94	mov x1,x26
00abad98	bl 0x00c32160
00abad9c	tbnz w0,#0x1f,0x00abadcc
00abada0	ldr x1,[sp, #0x8]
00abada4	mov w2,w0
00abada8	mov x0,x25
00abadac	bl 0x00c3f570
00abadb0	ldr x8,[sp, #0x8]
00abadb4	mov w26,w0
00abadb8	mov w2,#0xec
00abadbc	mov x1,x24
00abadc0	mov x0,x8
00abadc4	bl 0x00c32310
00abadc8	cbz w26,0x00abae34
00abadcc	mov x0,x19
00abadd0	mov x1,x25
00abadd4	bl 0x00c347a0
00abadd8	cbnz w0,0x00abadfc
00abaddc	b 0x00abae34
00abade0	mov x0,x25
00abade4	bl 0x00c3f500
00abade8	mov x1,x21
00abadec	mov x2,x20
00abadf0	mov x3,x19
00abadf4	bl 0x00abac38
00abadf8	cbz w0,0x00abae14
00abadfc	mov x0,x22
00abae00	add w23,w23,#0x1
00abae04	bl 0x00c325e0
00abae08	cmp w23,w0
00abae0c	b.lt 0x00abac88
00abae10	mov w0,#0x1
00abae14	ldp x29,x30,[sp, #0x60]
00abae18	ldp x20,x19,[sp, #0x50]
00abae1c	ldp x22,x21,[sp, #0x40]
00abae20	ldp x24,x23,[sp, #0x30]
00abae24	ldp x26,x25,[sp, #0x20]
00abae28	ldp x28,x27,[sp, #0x10]
00abae2c	add sp,sp,#0x70
00abae30	ret
00abae34	mov x0,x25
00abae38	bl 0x00c31a90
00abae3c	mov w0,wzr
00abae40	b 0x00abae14
