; mbedtls_aes_cmac_prf_128 @ 00b9f1cc
00b9f1cc	sub sp,sp,#0x80
00b9f1d0	stp x26,x25,[sp, #0x30]
00b9f1d4	stp x24,x23,[sp, #0x40]
00b9f1d8	stp x22,x21,[sp, #0x50]
00b9f1dc	stp x20,x19,[sp, #0x60]
00b9f1e0	stp x29,x30,[sp, #0x70]
00b9f1e4	add x29,sp,#0x70
00b9f1e8	mrs x26,tpidr_el0
00b9f1ec	ldr x8,[x26, #0x28]
00b9f1f0	mov x19,x4
00b9f1f4	mov x20,x3
00b9f1f8	mov x21,x2
00b9f1fc	mov x23,x1
00b9f200	mov x24,x0
00b9f204	mov w22,#0xffff9f00
00b9f208	str x8,[sp, #0x28]
00b9f20c	cbz x0,0x00b9f298
00b9f210	cbz x21,0x00b9f298
00b9f214	cbz x19,0x00b9f298
00b9f218	mov w0,#0x2
00b9f21c	bl 0x00c30270
00b9f220	mov x25,x0
00b9f224	cbz x0,0x00b9f23c
00b9f228	cmp x23,#0x10
00b9f22c	b.ne 0x00b9f244
00b9f230	ldr q0,[x24]
00b9f234	str q0,[sp]
00b9f238	b 0x00b9f26c
00b9f23c	mov w22,#0xffff9f80
00b9f240	b 0x00b9f28c
00b9f244	add x1,sp,#0x18
00b9f248	mov w2,#0x80
00b9f24c	mov x5,sp
00b9f250	mov x0,x25
00b9f254	mov x3,x24
00b9f258	mov x4,x23
00b9f25c	stp xzr,xzr,[sp, #0x18]
00b9f260	bl 0x00c42420
00b9f264	mov w22,w0
00b9f268	cbnz w0,0x00b9f28c
00b9f26c	mov x1,sp
00b9f270	mov w2,#0x80
00b9f274	mov x0,x25
00b9f278	mov x3,x21
00b9f27c	mov x4,x20
00b9f280	mov x5,x19
00b9f284	bl 0x00c42420
00b9f288	mov w22,w0
00b9f28c	mov x0,sp
00b9f290	mov w1,#0x10
00b9f294	bl 0x00c42220
00b9f298	ldr x8,[x26, #0x28]
00b9f29c	ldr x9,[sp, #0x28]
00b9f2a0	cmp x8,x9
00b9f2a4	b.ne 0x00b9f2c8
00b9f2a8	mov w0,w22
00b9f2ac	ldp x29,x30,[sp, #0x70]
00b9f2b0	ldp x20,x19,[sp, #0x60]
00b9f2b4	ldp x22,x21,[sp, #0x50]
00b9f2b8	ldp x24,x23,[sp, #0x40]
00b9f2bc	ldp x26,x25,[sp, #0x30]
00b9f2c0	add sp,sp,#0x80
00b9f2c4	ret
00b9f2c8	bl 0x00c2fec0
