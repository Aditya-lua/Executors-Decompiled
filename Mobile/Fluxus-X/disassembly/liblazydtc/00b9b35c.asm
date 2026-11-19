; mbedtls_ecdh_make_public @ 00b9b35c
00b9b35c	stp x28,x27,[sp, #-0x60]!
00b9b360	stp x26,x25,[sp, #0x10]
00b9b364	stp x24,x23,[sp, #0x20]
00b9b368	stp x22,x21,[sp, #0x30]
00b9b36c	stp x20,x19,[sp, #0x40]
00b9b370	stp x29,x30,[sp, #0x50]
00b9b374	add x29,sp,#0x50
00b9b378	ldr w8,[x0, #0x8]
00b9b37c	mov x23,x5
00b9b380	mov x24,x4
00b9b384	mov x19,x3
00b9b388	mov x20,x2
00b9b38c	mov x26,x0
00b9b390	cmp w8,#0x1
00b9b394	mov x21,x1
00b9b398	b.ne 0x00b9b424
00b9b39c	ldr x8,[x26, #0x88]
00b9b3a0	cbz x8,0x00b9b424
00b9b3a4	ldrb w22,[x26]
00b9b3a8	add x25,x26,#0x10
00b9b3ac	add x27,x26,#0xd0
00b9b3b0	mov x0,x25
00b9b3b4	mov x1,x27
00b9b3b8	mov x2,x24
00b9b3bc	mov x3,x23
00b9b3c0	bl 0x00c42680
00b9b3c4	cbnz w0,0x00b9b428
00b9b3c8	add x28,x26,#0xe0
00b9b3cc	add x3,x26,#0x48
00b9b3d0	mov x0,x25
00b9b3d4	mov x1,x28
00b9b3d8	mov x2,x27
00b9b3dc	mov x4,x24
00b9b3e0	mov x5,x23
00b9b3e4	mov x6,xzr
00b9b3e8	bl 0x00c42710
00b9b3ec	cbnz w0,0x00b9b428
00b9b3f0	mov x0,x25
00b9b3f4	mov w2,w22
00b9b3f8	mov x3,x21
00b9b3fc	mov x4,x20
00b9b400	mov x5,x19
00b9b404	ldp x29,x30,[sp, #0x50]
00b9b408	ldp x20,x19,[sp, #0x40]
00b9b40c	ldp x22,x21,[sp, #0x30]
00b9b410	ldp x24,x23,[sp, #0x20]
00b9b414	ldp x26,x25,[sp, #0x10]
00b9b418	mov x1,x28
00b9b41c	ldp x28,x27,[sp], #0x60
00b9b420	b 0x00c427e0
00b9b424	mov w0,#0xffffb080
00b9b428	ldp x29,x30,[sp, #0x50]
00b9b42c	ldp x20,x19,[sp, #0x40]
00b9b430	ldp x22,x21,[sp, #0x30]
00b9b434	ldp x24,x23,[sp, #0x20]
00b9b438	ldp x26,x25,[sp, #0x10]
00b9b43c	ldp x28,x27,[sp], #0x60
00b9b440	ret
