; FUN_0094dbc8 @ 0094dbc8
0094dbc8	stp x22,x21,[sp, #-0x30]!
0094dbcc	stp x20,x19,[sp, #0x10]
0094dbd0	stp x29,x30,[sp, #0x20]
0094dbd4	add x29,sp,#0x20
0094dbd8	ldr x22,[x0, #0x20]
0094dbdc	mov x21,x1
0094dbe0	mov w2,wzr
0094dbe4	mov w3,wzr
0094dbe8	add x1,x22,#0x428
0094dbec	mov x19,x0
0094dbf0	bl 0x009450b4
0094dbf4	ldrb w8,[x22, #0x536]
0094dbf8	mov w20,w0
0094dbfc	cmp w8,#0x0
0094dc00	cset w9,eq
0094dc04	strb w9,[x21]
0094dc08	cbz w0,0x0094dc58
0094dc0c	ldrb w8,[x19, #0xa85]
0094dc10	tbz w8,#0x4,0x0094dd4c
0094dc14	ldr x8,[x19, #0x12a0]
0094dc18	cbz x8,0x0094dc78
0094dc1c	ldr w8,[x8, #0x8]
0094dc20	cmp w8,#0x1
0094dc24	b.lt 0x0094dd4c
0094dc28	adrp x8,0xcc4000
0094dc2c	add x8,x8,#0x6b8
0094dc30	ldr w8,[x8, #0x8]
0094dc34	cmp w8,#0x0
0094dc38	b.le 0x0094dd4c
0094dc3c	ldr x8,[x19, #0x20]
0094dc40	cbz x8,0x0094dc90
0094dc44	ldrb w8,[x8, #0x536]
0094dc48	adrp x9,0xc50000
0094dc4c	add x9,x9,#0x8c0
0094dc50	ldr x2,[x9, x8, LSL #0x3]
0094dc54	b 0x0094dc98
0094dc58	cbnz w8,0x0094dd4c
0094dc5c	ldr x8,[x19, #0x1a0]
0094dc60	ldr x20,[x19, #0x20]
0094dc64	ldr w8,[x8, #0x10]
0094dc68	cbz w8,0x0094dcac
0094dc6c	mov x0,x19
0094dc70	bl 0x00943194
0094dc74	b 0x0094dcb8
0094dc78	adrp x8,0xcc4000
0094dc7c	add x8,x8,#0x6b8
0094dc80	ldr w8,[x8, #0x8]
0094dc84	cmp w8,#0x1
0094dc88	b.ge 0x0094dc3c
0094dc8c	b 0x0094dd4c
0094dc90	adrp x2,0x2c1000
0094dc94	add x2,x2,#0x1b5
0094dc98	adrp x1,0x2c1000
0094dc9c	add x1,x1,#0x25c
0094dca0	mov x0,x19
0094dca4	bl 0x00905258
0094dca8	b 0x0094dd4c
0094dcac	ldr x8,[x20, #0x3a0]
0094dcb0	orr x8,x8,#0x2000
0094dcb4	str x8,[x20, #0x3a0]
0094dcb8	ldrb w8,[x20, #0x53a]
0094dcbc	orr w8,w8,#0x4
0094dcc0	strb w8,[x20, #0x53a]
0094dcc4	ldrb w8,[x19, #0xa85]
0094dcc8	mov w20,wzr
0094dccc	tbz w8,#0x4,0x0094dd4c
0094dcd0	ldr x8,[x19, #0x12a0]
0094dcd4	cbz x8,0x0094dd00
0094dcd8	ldr w8,[x8, #0x8]
0094dcdc	cmp w8,#0x1
0094dce0	b.lt 0x0094dd48
0094dce4	adrp x8,0xcc4000
0094dce8	add x8,x8,#0x6b8
0094dcec	mov w20,wzr
0094dcf0	ldr w8,[x8, #0x8]
0094dcf4	cmp w8,#0x0
0094dcf8	b.gt 0x0094dd14
0094dcfc	b 0x0094dd4c
0094dd00	adrp x8,0xcc4000
0094dd04	add x8,x8,#0x6b8
0094dd08	ldr w8,[x8, #0x8]
0094dd0c	cmp w8,#0x1
0094dd10	b.lt 0x0094dd48
0094dd14	ldr x8,[x19, #0x20]
0094dd18	cbz x8,0x0094dd30
0094dd1c	ldrb w8,[x8, #0x536]
0094dd20	adrp x9,0xc50000
0094dd24	add x9,x9,#0x8c0
0094dd28	ldr x2,[x9, x8, LSL #0x3]
0094dd2c	b 0x0094dd38
0094dd30	adrp x2,0x2c1000
0094dd34	add x2,x2,#0x1b5
0094dd38	adrp x1,0x2ab000
0094dd3c	add x1,x1,#0x7af
0094dd40	mov x0,x19
0094dd44	bl 0x00905258
0094dd48	mov w20,wzr
0094dd4c	mov w0,w20
0094dd50	ldp x29,x30,[sp, #0x20]
0094dd54	ldp x20,x19,[sp, #0x10]
0094dd58	ldp x22,x21,[sp], #0x30
0094dd5c	ret
