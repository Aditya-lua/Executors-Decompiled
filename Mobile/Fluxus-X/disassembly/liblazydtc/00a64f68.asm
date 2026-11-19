; EVP_KEM_free @ 00a64f68
00a64f68	stp x20,x19,[sp, #-0x20]!
00a64f6c	stp x29,x30,[sp, #0x10]
00a64f70	add x29,sp,#0x10
00a64f74	cbz x0,0x00a64fa4
00a64f78	mov x19,x0
00a64f7c	add x9,x0,#0x20
00a64f80	ldxr w8,[x9]
00a64f84	subs w10,w8,#0x1
00a64f88	stxr w11,w10,[x9]
00a64f8c	cbnz w11,0x00a64f80
00a64f90	b.ne 0x00a64f9c
00a64f94	dmb ISHLD
00a64f98	b 0x00a64fb0
00a64f9c	cmp w8,#0x1
00a64fa0	b.le 0x00a64fb0
00a64fa4	ldp x29,x30,[sp, #0x10]
00a64fa8	ldp x20,x19,[sp], #0x20
00a64fac	ret
00a64fb0	ldr x0,[x19, #0x8]
00a64fb4	adrp x20,0x2a2000
00a64fb8	add x20,x20,#0x3eb
00a64fbc	mov w2,#0x181
00a64fc0	mov x1,x20
00a64fc4	bl 0x00c32310
00a64fc8	ldr x0,[x19, #0x18]
00a64fcc	bl 0x00c3b690
00a64fd0	ldr x0,[x19, #0x28]
00a64fd4	bl 0x00c34d40
00a64fd8	ldp x29,x30,[sp, #0x10]
00a64fdc	mov w2,#0x184
00a64fe0	mov x0,x19
00a64fe4	mov x1,x20
00a64fe8	ldp x20,x19,[sp], #0x20
00a64fec	b 0x00c32310
