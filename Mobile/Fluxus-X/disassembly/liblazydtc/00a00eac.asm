; FUN_00a00eac @ 00a00eac
00a00eac	str x21,[sp, #-0x30]!
00a00eb0	mov x21,x1
00a00eb4	adrp x1,0x29f000
00a00eb8	stp x20,x19,[sp, #0x10]
00a00ebc	mov x20,x0
00a00ec0	add x1,x1,#0xf2e
00a00ec4	mov w0,#0x10
00a00ec8	mov w2,#0x6f
00a00ecc	stp x29,x30,[sp, #0x20]
00a00ed0	add x29,sp,#0x20
00a00ed4	bl 0x00c34250
00a00ed8	cbz x0,0x00a00f64
00a00edc	mov x19,x0
00a00ee0	mov x0,x21
00a00ee4	bl 0x00c38830
00a00ee8	adrp x1,0x29f000
00a00eec	add x1,x1,#0xf2e
00a00ef0	str x0,[x19]
00a00ef4	cbz x0,0x00a00f3c
00a00ef8	mov w0,#0x20
00a00efc	mov w2,#0x77
00a00f00	bl 0x00c34250
00a00f04	str x0,[x19, #0x8]
00a00f08	cbz x0,0x00a00f44
00a00f0c	ldr x8,[x19]
00a00f10	movi v1.2S,#0x1
00a00f14	ldr q0,[x8, #0x10]
00a00f18	str q0,[x0, #0x10]
00a00f1c	ldr q0,[x8]
00a00f20	mov w8,#0xffffffff
00a00f24	str q0,[x0]
00a00f28	mov w0,#0x1
00a00f2c	str d1,[x20, #0x28]
00a00f30	str w8,[x20, #0x38]
00a00f34	str x19,[x20, #0x40]
00a00f38	b 0x00a00f64
00a00f3c	mov w2,#0x74
00a00f40	b 0x00a00f58
00a00f44	ldr x0,[x19]
00a00f48	bl 0x00c35660
00a00f4c	adrp x1,0x29f000
00a00f50	add x1,x1,#0xf2e
00a00f54	mov w2,#0x79
00a00f58	mov x0,x19
00a00f5c	bl 0x00c32310
00a00f60	mov w0,wzr
00a00f64	ldp x29,x30,[sp, #0x20]
00a00f68	ldp x20,x19,[sp, #0x10]
00a00f6c	ldr x21,[sp], #0x30
00a00f70	ret
