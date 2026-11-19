; ossl_digest_default_get_params @ 00b68994
00b68994	stp x22,x21,[sp, #-0x30]!
00b68998	mov x22,x1
00b6899c	adrp x1,0x2b9000
00b689a0	add x1,x1,#0xdb8
00b689a4	stp x20,x19,[sp, #0x10]
00b689a8	stp x29,x30,[sp, #0x20]
00b689ac	add x29,sp,#0x20
00b689b0	mov x19,x3
00b689b4	mov x21,x2
00b689b8	mov x20,x0
00b689bc	bl 0x00c3e8c0
00b689c0	cbz x0,0x00b689d0
00b689c4	mov x1,x22
00b689c8	bl 0x00c3e950
00b689cc	cbz w0,0x00b68a38
00b689d0	adrp x1,0x2d7000
00b689d4	add x1,x1,#0xe7d
00b689d8	mov x0,x20
00b689dc	bl 0x00c3e8c0
00b689e0	cbz x0,0x00b689f0
00b689e4	mov x1,x21
00b689e8	bl 0x00c3e950
00b689ec	cbz w0,0x00b68a54
00b689f0	adrp x1,0x2db000
00b689f4	add x1,x1,#0xfe7
00b689f8	mov x0,x20
00b689fc	bl 0x00c3e8c0
00b68a00	cbz x0,0x00b68a10
00b68a04	and w1,w19,#0x1
00b68a08	bl 0x00c3da90
00b68a0c	cbz w0,0x00b68a70
00b68a10	adrp x1,0x2c1000
00b68a14	add x1,x1,#0xc1a
00b68a18	mov x0,x20
00b68a1c	bl 0x00c3e8c0
00b68a20	cbz x0,0x00b68a30
00b68a24	ubfx w1,w19,#0x1,#0x1
00b68a28	bl 0x00c3da90
00b68a2c	cbz w0,0x00b68a8c
00b68a30	mov w0,#0x1
00b68a34	b 0x00b68abc
00b68a38	bl 0x00c342a0
00b68a3c	adrp x0,0x2a8000
00b68a40	adrp x2,0x2be000
00b68a44	add x0,x0,#0xe77
00b68a48	add x2,x2,#0xb6e
00b68a4c	mov w1,#0x15
00b68a50	b 0x00b68aa4
00b68a54	bl 0x00c342a0
00b68a58	adrp x0,0x2a8000
00b68a5c	adrp x2,0x2be000
00b68a60	add x0,x0,#0xe77
00b68a64	add x2,x2,#0xb6e
00b68a68	mov w1,#0x1a
00b68a6c	b 0x00b68aa4
00b68a70	bl 0x00c342a0
00b68a74	adrp x0,0x2a8000
00b68a78	adrp x2,0x2be000
00b68a7c	add x0,x0,#0xe77
00b68a80	add x2,x2,#0xb6e
00b68a84	mov w1,#0x20
00b68a88	b 0x00b68aa4
00b68a8c	bl 0x00c342a0
00b68a90	adrp x0,0x2a8000
00b68a94	adrp x2,0x2be000
00b68a98	add x0,x0,#0xe77
00b68a9c	add x2,x2,#0xb6e
00b68aa0	mov w1,#0x26
00b68aa4	bl 0x00c342b0
00b68aa8	mov w0,#0x39
00b68aac	mov w1,#0x68
00b68ab0	mov x2,xzr
00b68ab4	bl 0x00c342c0
00b68ab8	mov w0,wzr
00b68abc	ldp x29,x30,[sp, #0x20]
00b68ac0	ldp x20,x19,[sp, #0x10]
00b68ac4	ldp x22,x21,[sp], #0x30
00b68ac8	ret
