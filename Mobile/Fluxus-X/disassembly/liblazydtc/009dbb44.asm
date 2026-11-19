; tls_client_key_exchange_post_work @ 009dbb44
009dbb44	stp x22,x21,[sp, #-0x30]!
009dbb48	stp x20,x19,[sp, #0x10]
009dbb4c	stp x29,x30,[sp, #0x20]
009dbb50	ldr x8,[x0, #0x2e0]
009dbb54	ldr x21,[x0, #0x360]
009dbb58	ldr x20,[x0, #0x368]
009dbb5c	mov x19,x0
009dbb60	ldr w8,[x8, #0x1c]
009dbb64	add x29,sp,#0x20
009dbb68	tbnz w8,#0x5,0x009dbbb0
009dbb6c	cbnz x21,0x009dbbc4
009dbb70	tbnz w8,#0x3,0x009dbbc4
009dbb74	bl 0x00c342a0
009dbb78	adrp x0,0x2d7000
009dbb7c	adrp x2,0x2c9000
009dbb80	add x0,x0,#0xb1a
009dbb84	add x2,x2,#0x53d
009dbb88	mov w1,#0xd18
009dbb8c	bl 0x00c342b0
009dbb90	mov w2,#0x100
009dbb94	mov w1,#0x50
009dbb98	movk w2,#0xc, LSL #16
009dbb9c	mov x0,x19
009dbba0	mov x3,xzr
009dbba4	bl 0x00c34410
009dbba8	mov x21,xzr
009dbbac	b 0x009dbbe8
009dbbb0	mov x0,x19
009dbbb4	bl 0x00c36a80
009dbbb8	cbz w0,0x009dbbe8
009dbbbc	mov w22,#0x1
009dbbc0	b 0x009dbc0c
009dbbc4	mov w3,#0x1
009dbbc8	mov x0,x19
009dbbcc	mov x1,x21
009dbbd0	mov x2,x20
009dbbd4	mov w22,#0x1
009dbbd8	bl 0x00c349b0
009dbbdc	cbnz w0,0x009dbc0c
009dbbe0	mov x21,xzr
009dbbe4	mov x20,xzr
009dbbe8	adrp x2,0x2d7000
009dbbec	add x2,x2,#0xb1a
009dbbf0	mov w3,#0xd45
009dbbf4	mov x0,x21
009dbbf8	mov x1,x20
009dbbfc	add x19,x19,#0x360
009dbc00	bl 0x00c345e0
009dbc04	mov w22,wzr
009dbc08	stp xzr,xzr,[x19]
009dbc0c	ldp x29,x30,[sp, #0x20]
009dbc10	ldp x20,x19,[sp, #0x10]
009dbc14	mov w0,w22
009dbc18	ldp x22,x21,[sp], #0x30
009dbc1c	ret
