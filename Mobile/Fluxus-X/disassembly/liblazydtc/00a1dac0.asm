; FUN_00a1dac0 @ 00a1dac0
00a1dac0	str x25,[sp, #-0x50]!
00a1dac4	stp x24,x23,[sp, #0x10]
00a1dac8	stp x22,x21,[sp, #0x20]
00a1dacc	stp x20,x19,[sp, #0x30]
00a1dad0	stp x29,x30,[sp, #0x40]
00a1dad4	add x29,sp,#0x40
00a1dad8	cbz x1,0x00a1db2c
00a1dadc	ldr w8,[x2, #0x10]
00a1dae0	mov x22,x2
00a1dae4	cbnz w8,0x00a1db04
00a1dae8	mov w23,w0
00a1daec	mov x0,x22
00a1daf0	mov x19,x4
00a1daf4	mov w21,w3
00a1daf8	mov x20,x1
00a1dafc	bl 0x00c369b0
00a1db00	cbz w0,0x00a1db78
00a1db04	bl 0x00c342a0
00a1db08	adrp x0,0x2c1000
00a1db0c	adrp x2,0x2d7000
00a1db10	add x0,x0,#0xaac
00a1db14	add x2,x2,#0xcd6
00a1db18	mov w1,#0x91
00a1db1c	bl 0x00c342b0
00a1db20	orr w0,wzr,#0x3
00a1db24	mov w1,#0x73
00a1db28	b 0x00a1db54
00a1db2c	bl 0x00c342a0
00a1db30	adrp x0,0x2c1000
00a1db34	adrp x2,0x2d7000
00a1db38	add x0,x0,#0xaac
00a1db3c	add x2,x2,#0xcd6
00a1db40	mov w1,#0x8c
00a1db44	bl 0x00c342b0
00a1db48	mov w1,#0x102
00a1db4c	orr w0,wzr,#0x3
00a1db50	movk w1,#0xc, LSL #16
00a1db54	mov x2,xzr
00a1db58	bl 0x00c342c0
00a1db5c	mov w0,wzr
00a1db60	ldp x29,x30,[sp, #0x40]
00a1db64	ldp x20,x19,[sp, #0x30]
00a1db68	ldp x22,x21,[sp, #0x20]
00a1db6c	ldp x24,x23,[sp, #0x10]
00a1db70	ldr x25,[sp], #0x50
00a1db74	ret
00a1db78	mov x0,x22
00a1db7c	bl 0x00c322f0
00a1db80	cmp w0,#0x1
00a1db84	b.ne 0x00a1db98
00a1db88	mov x0,x20
00a1db8c	bl 0x00c38e00
00a1db90	mov w0,#0x1
00a1db94	b 0x00a1db60
00a1db98	mov w24,w0
00a1db9c	sub w1,w0,#0x2
00a1dba0	mov x0,x22
00a1dba4	bl 0x00c38d00
00a1dba8	cbnz w0,0x00a1dbbc
00a1dbac	sub w1,w24,#0x3
00a1dbb0	mov x0,x22
00a1dbb4	bl 0x00c38d00
00a1dbb8	cbz w0,0x00a1dc30
00a1dbbc	mov w25,#0xffffff9c
00a1dbc0	mov w3,#0xffffffff
00a1dbc4	mov w0,w23
00a1dbc8	mov x1,x20
00a1dbcc	mov w2,w24
00a1dbd0	mov w4,wzr
00a1dbd4	mov w5,w21
00a1dbd8	mov x6,x19
00a1dbdc	bl 0x00a1d778
00a1dbe0	cbz w0,0x00a1db60
00a1dbe4	adds w25,w25,#0x1
00a1dbe8	b.eq 0x00a1dc08
00a1dbec	mov x0,x20
00a1dbf0	mov x1,x22
00a1dbf4	bl 0x00c38cc0
00a1dbf8	mov w8,w0
00a1dbfc	mov w0,#0x1
00a1dc00	tbz w8,#0x1f,0x00a1dbc0
00a1dc04	b 0x00a1db60
00a1dc08	bl 0x00c342a0
00a1dc0c	adrp x0,0x2c1000
00a1dc10	adrp x2,0x2d7000
00a1dc14	add x0,x0,#0xaac
00a1dc18	add x2,x2,#0xcd6
00a1dc1c	mov w1,#0xc2
00a1dc20	bl 0x00c342b0
00a1dc24	orr w0,wzr,#0x3
00a1dc28	mov w1,#0x71
00a1dc2c	b 0x00a1db54
00a1dc30	add w24,w24,#0x1
00a1dc34	mov w25,#0xffffff9c
00a1dc38	mov w3,#0xffffffff
00a1dc3c	mov w0,w23
00a1dc40	mov x1,x20
00a1dc44	mov w2,w24
00a1dc48	mov w4,wzr
00a1dc4c	mov w5,w21
00a1dc50	mov x6,x19
00a1dc54	bl 0x00a1d778
00a1dc58	cbz w0,0x00a1db60
00a1dc5c	mov x0,x20
00a1dc60	mov x1,x22
00a1dc64	bl 0x00c38cc0
00a1dc68	tbnz w0,#0x1f,0x00a1dca4
00a1dc6c	mov x0,x20
00a1dc70	mov x1,x20
00a1dc74	mov x2,x22
00a1dc78	bl 0x00c38880
00a1dc7c	cbz w0,0x00a1db60
00a1dc80	mov x0,x20
00a1dc84	mov x1,x22
00a1dc88	bl 0x00c38cc0
00a1dc8c	tbnz w0,#0x1f,0x00a1dca4
00a1dc90	mov x0,x20
00a1dc94	mov x1,x20
00a1dc98	mov x2,x22
00a1dc9c	bl 0x00c38880
00a1dca0	cbz w0,0x00a1db60
00a1dca4	adds w25,w25,#0x1
00a1dca8	b.eq 0x00a1dcc8
00a1dcac	mov x0,x20
00a1dcb0	mov x1,x22
00a1dcb4	bl 0x00c38cc0
00a1dcb8	mov w8,w0
00a1dcbc	mov w0,#0x1
00a1dcc0	tbz w8,#0x1f,0x00a1dc38
00a1dcc4	b 0x00a1db60
00a1dcc8	bl 0x00c342a0
00a1dccc	adrp x0,0x2c1000
00a1dcd0	adrp x2,0x2d7000
00a1dcd4	add x0,x0,#0xaac
00a1dcd8	add x2,x2,#0xcd6
00a1dcdc	mov w1,#0xb4
00a1dce0	b 0x00a1dc20
