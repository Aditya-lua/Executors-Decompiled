; FUN_00941b6c @ 00941b6c
00941b6c	sub sp,sp,#0x50
00941b70	stp x24,x23,[sp, #0x10]
00941b74	stp x22,x21,[sp, #0x20]
00941b78	stp x20,x19,[sp, #0x30]
00941b7c	stp x29,x30,[sp, #0x40]
00941b80	add x29,sp,#0x40
00941b84	mrs x24,tpidr_el0
00941b88	ldr x8,[x24, #0x28]
00941b8c	mov x19,x3
00941b90	mov w22,w2
00941b94	mov x21,x1
00941b98	mov x20,x0
00941b9c	str x8,[sp, #0x8]
00941ba0	str xzr,[sp]
00941ba4	bl 0x00c30710
00941ba8	mov x23,x0
00941bac	str wzr,[x0]
00941bb0	str xzr,[x19]
00941bb4	b 0x00941bbc
00941bb8	add x20,x20,#0x1
00941bbc	ldrb w8,[x20]
00941bc0	cmp w8,#0x9
00941bc4	b.eq 0x00941bb8
00941bc8	cmp w8,#0x20
00941bcc	b.eq 0x00941bb8
00941bd0	cmp w8,#0x2d
00941bd4	b.eq 0x00941be4
00941bd8	sub w8,w8,#0xa
00941bdc	cmp w8,#0x3
00941be0	b.hi 0x00941c18
00941be4	cbz x21,0x00941bec
00941be8	str x20,[x21]
00941bec	mov w0,#0x2
00941bf0	ldr x8,[x24, #0x28]
00941bf4	ldr x9,[sp, #0x8]
00941bf8	cmp x8,x9
00941bfc	b.ne 0x00941c64
00941c00	ldp x29,x30,[sp, #0x40]
00941c04	ldp x20,x19,[sp, #0x30]
00941c08	ldp x22,x21,[sp, #0x20]
00941c0c	ldp x24,x23,[sp, #0x10]
00941c10	add sp,sp,#0x50
00941c14	ret
00941c18	mov x1,sp
00941c1c	mov x0,x20
00941c20	mov w2,w22
00941c24	bl 0x00c31f00
00941c28	mov x8,x0
00941c2c	cbz x21,0x00941c38
00941c30	ldr x9,[sp]
00941c34	str x9,[x21]
00941c38	ldr w9,[x23]
00941c3c	cmp w9,#0x22
00941c40	b.ne 0x00941c4c
00941c44	mov w0,#0x1
00941c48	b 0x00941bf0
00941c4c	ldr x9,[sp]
00941c50	cmp x9,x20
00941c54	b.eq 0x00941bec
00941c58	mov w0,wzr
00941c5c	str x8,[x19]
00941c60	b 0x00941bf0
00941c64	bl 0x00c2fec0
