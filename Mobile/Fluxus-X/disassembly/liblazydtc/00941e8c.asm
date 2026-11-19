; FUN_00941e8c @ 00941e8c
00941e8c	str x21,[sp, #-0x30]!
00941e90	stp x20,x19,[sp, #0x10]
00941e94	stp x29,x30,[sp, #0x20]
00941e98	add x29,sp,#0x20
00941e9c	ldr x21,[x0, #0x340]
00941ea0	mov x19,x2
00941ea4	mov x20,x1
00941ea8	cbz x21,0x00941edc
00941eac	ldr x0,[x21]
00941eb0	mov x1,x20
00941eb4	mov x2,x19
00941eb8	bl 0x00c31b50
00941ebc	cbz w0,0x00941ed4
00941ec0	ldr x0,[x21]
00941ec4	ldrb w8,[x0, x19]
00941ec8	and w8,w8,#0xfe
00941ecc	cmp w8,#0x3a
00941ed0	b.eq 0x00941ee0
00941ed4	ldr x21,[x21, #0x8]
00941ed8	cbnz x21,0x00941eac
00941edc	mov x0,xzr
00941ee0	ldp x29,x30,[sp, #0x20]
00941ee4	ldp x20,x19,[sp, #0x10]
00941ee8	ldr x21,[sp], #0x30
00941eec	ret
