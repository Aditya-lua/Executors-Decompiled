; SHA512_Update @ 00ae29bc
00ae29bc	str x23,[sp, #-0x40]!
00ae29c0	stp x22,x21,[sp, #0x10]
00ae29c4	stp x20,x19,[sp, #0x20]
00ae29c8	stp x29,x30,[sp, #0x30]
00ae29cc	add x29,sp,#0x30
00ae29d0	cbz x2,0x00ae2a9c
00ae29d4	ldp x8,x9,[x0, #0x40]
00ae29d8	mov x19,x2
00ae29dc	mov x21,x1
00ae29e0	mov x20,x0
00ae29e4	adds x8,x8,x2, LSL #0x3
00ae29e8	add x22,x0,#0x50
00ae29ec	b.cc 0x00ae29f8
00ae29f0	add x9,x9,#0x1
00ae29f4	str x9,[x20, #0x48]
00ae29f8	ldr w10,[x20, #0xd0]
00ae29fc	add x9,x9,x19, LSR #0x3d
00ae2a00	stp x8,x9,[x20, #0x40]
00ae2a04	cbz w10,0x00ae2a60
00ae2a08	mov w8,#0x80
00ae2a0c	sub x23,x8,x10
00ae2a10	cmp x23,x19
00ae2a14	add x0,x22,x10
00ae2a18	b.ls 0x00ae2a38
00ae2a1c	mov x1,x21
00ae2a20	mov x2,x19
00ae2a24	bl 0x00c2ffd0
00ae2a28	ldr w8,[x20, #0xd0]
00ae2a2c	add w8,w8,w19
00ae2a30	str w8,[x20, #0xd0]
00ae2a34	b 0x00ae2a9c
00ae2a38	mov x1,x21
00ae2a3c	mov x2,x23
00ae2a40	bl 0x00c2ffd0
00ae2a44	mov w2,#0x1
00ae2a48	mov x0,x20
00ae2a4c	mov x1,x22
00ae2a50	str wzr,[x20, #0xd0]
00ae2a54	sub x19,x19,x23
00ae2a58	add x21,x21,x23
00ae2a5c	bl 0x00ae1ac4
00ae2a60	cmp x19,#0x80
00ae2a64	b.cc 0x00ae2a84
00ae2a68	lsr x2,x19,#0x7
00ae2a6c	mov x0,x20
00ae2a70	mov x1,x21
00ae2a74	bl 0x00ae1ac4
00ae2a78	add x8,x21,x19
00ae2a7c	and x19,x19,#0x7f
00ae2a80	sub x21,x8,x19
00ae2a84	cbz x19,0x00ae2a9c
00ae2a88	mov x0,x22
00ae2a8c	mov x1,x21
00ae2a90	mov x2,x19
00ae2a94	bl 0x00c2ffd0
00ae2a98	str w19,[x20, #0xd0]
00ae2a9c	ldp x29,x30,[sp, #0x30]
00ae2aa0	ldp x20,x19,[sp, #0x20]
00ae2aa4	ldp x22,x21,[sp, #0x10]
00ae2aa8	mov w0,#0x1
00ae2aac	ldr x23,[sp], #0x40
00ae2ab0	ret
