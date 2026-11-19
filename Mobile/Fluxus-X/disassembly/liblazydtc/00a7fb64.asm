; HMAC @ 00a7fb64
00a7fb64	sub sp,sp,#0x80
00a7fb68	stp x26,x25,[sp, #0x30]
00a7fb6c	stp x24,x23,[sp, #0x40]
00a7fb70	stp x22,x21,[sp, #0x50]
00a7fb74	stp x20,x19,[sp, #0x60]
00a7fb78	stp x29,x30,[sp, #0x70]
00a7fb7c	add x29,sp,#0x70
00a7fb80	mov x19,x6
00a7fb84	mov x23,x5
00a7fb88	mov x22,x4
00a7fb8c	mov x20,x3
00a7fb90	mov w24,w2
00a7fb94	mov x21,x1
00a7fb98	mov x26,x0
00a7fb9c	bl 0x00c34c20
00a7fba0	mov w25,w0
00a7fba4	str xzr,[sp, #0x28]
00a7fba8	tbnz w0,#0x1f,0x00a7fc0c
00a7fbac	mov x0,x26
00a7fbb0	bl 0x00c36230
00a7fbb4	adrp x8,0xd21000
00a7fbb8	add x8,x8,#0xb50
00a7fbbc	cmp x23,#0x0
00a7fbc0	adrp x1,0x2c3000
00a7fbc4	mov x3,x0
00a7fbc8	sxtw x6,w24
00a7fbcc	csel x8,x8,x23,eq
00a7fbd0	sxtw x9,w25
00a7fbd4	add x10,sp,#0x28
00a7fbd8	add x1,x1,#0x5d3
00a7fbdc	mov x0,xzr
00a7fbe0	mov x2,xzr
00a7fbe4	mov x4,xzr
00a7fbe8	mov x5,x21
00a7fbec	mov x7,x20
00a7fbf0	stp x9,x10,[sp, #0x10]
00a7fbf4	stp x22,x8,[sp]
00a7fbf8	bl 0x00c36810
00a7fbfc	cbz x19,0x00a7fc10
00a7fc00	ldr x8,[sp, #0x28]
00a7fc04	str w8,[x19]
00a7fc08	b 0x00a7fc10
00a7fc0c	mov x0,xzr
00a7fc10	ldp x29,x30,[sp, #0x70]
00a7fc14	ldp x20,x19,[sp, #0x60]
00a7fc18	ldp x22,x21,[sp, #0x50]
00a7fc1c	ldp x24,x23,[sp, #0x40]
00a7fc20	ldp x26,x25,[sp, #0x30]
00a7fc24	add sp,sp,#0x80
00a7fc28	ret
