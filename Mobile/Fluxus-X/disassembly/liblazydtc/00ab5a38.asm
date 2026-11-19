; PEM_proc_type @ 00ab5a38
00ab5a38	stp x20,x19,[sp, #-0x20]!
00ab5a3c	stp x29,x30,[sp, #0x10]
00ab5a40	add x29,sp,#0x10
00ab5a44	mov w19,w1
00ab5a48	mov x20,x0
00ab5a4c	bl 0x00c2ff50
00ab5a50	cmp w19,#0xa
00ab5a54	add x8,x20,x0
00ab5a58	b.eq 0x00ab5a78
00ab5a5c	cmp w19,#0x14
00ab5a60	b.eq 0x00ab5a84
00ab5a64	cmp w19,#0x1e
00ab5a68	b.ne 0x00ab5a90
00ab5a6c	adrp x3,0x2b6000
00ab5a70	add x3,x3,#0x2f3
00ab5a74	b 0x00ab5a98
00ab5a78	adrp x3,0x774000
00ab5a7c	add x3,x3,#0x42c
00ab5a80	b 0x00ab5a98
00ab5a84	adrp x3,0x2d0000
00ab5a88	add x3,x3,#0x245
00ab5a8c	b 0x00ab5a98
00ab5a90	adrp x3,0x29e000
00ab5a94	add x3,x3,#0x8bf
00ab5a98	ldp x29,x30,[sp, #0x10]
00ab5a9c	mov w9,#0x400
00ab5aa0	adrp x2,0x2aa000
00ab5aa4	sub x1,x9,x0
00ab5aa8	add x2,x2,#0x82e
00ab5aac	mov x0,x8
00ab5ab0	ldp x20,x19,[sp], #0x20
00ab5ab4	b 0x00c34d30
