; EVP_PKEY_CTX_gettable_params @ 00a75eac
00a75eac	str x19,[sp, #-0x20]!
00a75eb0	stp x29,x30,[sp, #0x10]
00a75eb4	ldr w8,[x0]
00a75eb8	mov x19,x0
00a75ebc	add x29,sp,#0x10
00a75ec0	cmp w8,#0x1ff
00a75ec4	b.gt 0x00a75f20
00a75ec8	sub w9,w8,#0x10
00a75ecc	cmp w9,#0x30
00a75ed0	b.hi 0x00a75eec
00a75ed4	mov w10,#0x1
00a75ed8	lsl x9,x10,x9
00a75edc	mov x10,#0x1000000010000
00a75ee0	movk x10,#0x1
00a75ee4	tst x9,x10
00a75ee8	b.ne 0x00a75efc
00a75eec	cmp w8,#0x80
00a75ef0	b.eq 0x00a75efc
00a75ef4	cmp w8,#0x100
00a75ef8	b.ne 0x00a75fd0
00a75efc	ldr x0,[x19, #0x28]
00a75f00	cbz x0,0x00a75fd0
00a75f04	ldr x8,[x0, #0xc0]
00a75f08	cbz x8,0x00a75fd0
00a75f0c	bl 0x00c3d740
00a75f10	bl 0x00c3b680
00a75f14	ldp x9,x8,[x19, #0x28]
00a75f18	ldr x2,[x9, #0xc0]
00a75f1c	b 0x00a75fbc
00a75f20	cmp w8,#0x7ff
00a75f24	b.le 0x00a75f64
00a75f28	cmp w8,#0x2, LSL #12
00a75f2c	b.eq 0x00a75f9c
00a75f30	cmp w8,#0x1, LSL #12
00a75f34	b.eq 0x00a75f9c
00a75f38	cmp w8,#0x800
00a75f3c	b.ne 0x00a75fd0
00a75f40	ldr x0,[x19, #0x28]
00a75f44	cbz x0,0x00a75fd0
00a75f48	ldr x8,[x0, #0x78]
00a75f4c	cbz x8,0x00a75fd0
00a75f50	bl 0x00c3d1d0
00a75f54	bl 0x00c3b680
00a75f58	ldp x9,x8,[x19, #0x28]
00a75f5c	ldr x2,[x9, #0x78]
00a75f60	b 0x00a75fbc
00a75f64	cmp w8,#0x200
00a75f68	b.eq 0x00a75f74
00a75f6c	cmp w8,#0x400
00a75f70	b.ne 0x00a75fd0
00a75f74	ldr x0,[x19, #0x28]
00a75f78	cbz x0,0x00a75f8c
00a75f7c	ldr x9,[x0, #0x70]
00a75f80	cbz x9,0x00a75f8c
00a75f84	bl 0x00c3bf10
00a75f88	b 0x00a75fb0
00a75f8c	cmp w8,#0x2, LSL #12
00a75f90	b.eq 0x00a75f9c
00a75f94	cmp w8,#0x1, LSL #12
00a75f98	b.ne 0x00a75fd0
00a75f9c	ldr x0,[x19, #0x28]
00a75fa0	cbz x0,0x00a75fd0
00a75fa4	ldr x8,[x0, #0x70]
00a75fa8	cbz x8,0x00a75fd0
00a75fac	bl 0x00c3d2b0
00a75fb0	bl 0x00c3b680
00a75fb4	ldp x9,x8,[x19, #0x28]
00a75fb8	ldr x2,[x9, #0x70]
00a75fbc	ldp x29,x30,[sp, #0x10]
00a75fc0	mov x1,x0
00a75fc4	mov x0,x8
00a75fc8	ldr x19,[sp], #0x20
00a75fcc	br x2
00a75fd0	ldp x29,x30,[sp, #0x10]
00a75fd4	mov x0,xzr
00a75fd8	ldr x19,[sp], #0x20
00a75fdc	ret
