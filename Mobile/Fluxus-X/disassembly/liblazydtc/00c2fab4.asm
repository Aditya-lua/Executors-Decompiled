; FUN_00c2fab4 @ 00c2fab4
00c2fab4	paciasp
00c2fab8	stp x29,x30,[sp, #-0x20]!
00c2fabc	str x19,[sp, #0x10]
00c2fac0	mov x29,sp
00c2fac4	and w8,w0,#0xf
00c2fac8	mov w0,#0x4
00c2facc	cmp w8,#0x8
00c2fad0	b.gt 0x00c2faf0
00c2fad4	cmp w8,#0x2
00c2fad8	b.le 0x00c2fb30
00c2fadc	cmp w8,#0x3
00c2fae0	b.eq 0x00c2fb08
00c2fae4	cmp w8,#0x4
00c2fae8	b.eq 0x00c2fb1c
00c2faec	b 0x00c2fb3c
00c2faf0	cmp w8,#0xa
00c2faf4	b.le 0x00c2fb70
00c2faf8	cmp w8,#0xc
00c2fafc	b.eq 0x00c2fb1c
00c2fb00	cmp w8,#0xb
00c2fb04	b.ne 0x00c2fb3c
00c2fb08	mov w0,#0x8
00c2fb0c	ldr x19,[sp, #0x10]
00c2fb10	ldp x29,x30,[sp], #0x20
00c2fb14	autiasp
00c2fb18	ret
00c2fb1c	mov w0,#0x10
00c2fb20	ldr x19,[sp, #0x10]
00c2fb24	ldp x29,x30,[sp], #0x20
00c2fb28	autiasp
00c2fb2c	ret
00c2fb30	b.eq 0x00c2fb0c
00c2fb34	cmp w8,#0x1
00c2fb38	b.eq 0x00c2fb7c
00c2fb3c	adrp x19,0xcb4000
00c2fb40	adrp x1,0x2a1000
00c2fb44	add x1,x1,#0x45d
00c2fb48	ldr x19,[x19, #0xba0]
00c2fb4c	adrp x2,0x2b1000
00c2fb50	add x2,x2,#0x249
00c2fb54	adrp x3,0x2ce000
00c2fb58	add x3,x3,#0xc41
00c2fb5c	add x0,x19,#0x130
00c2fb60	bl 0x00c30940
00c2fb64	add x0,x19,#0x130
00c2fb68	bl 0x00c30c50
00c2fb6c	bl 0x00c30b40
00c2fb70	b.eq 0x00c2fb0c
00c2fb74	cmp w8,#0x9
00c2fb78	b.ne 0x00c2fb3c
00c2fb7c	adrp x19,0xcb4000
00c2fb80	adrp x1,0x2a1000
00c2fb84	add x1,x1,#0x45d
00c2fb88	ldr x19,[x19, #0xba0]
00c2fb8c	adrp x2,0x2b1000
00c2fb90	add x2,x2,#0x249
00c2fb94	adrp x3,0x2a9000
00c2fb98	add x3,x3,#0x1a1
00c2fb9c	add x0,x19,#0x130
00c2fba0	bl 0x00c30940
00c2fba4	add x0,x19,#0x130
00c2fba8	bl 0x00c30c50
00c2fbac	bl 0x00c30b40
