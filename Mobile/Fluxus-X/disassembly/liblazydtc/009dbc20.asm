; ossl_statem_client_construct_message @ 009dbc20
009dbc20	str x19,[sp, #-0x20]!
009dbc24	stp x29,x30,[sp, #0x10]
009dbc28	ldr w8,[x0, #0x5c]
009dbc2c	mov x19,x0
009dbc30	add x29,sp,#0x10
009dbc34	sub w8,w8,#0xc
009dbc38	cmp w8,#0x24
009dbc3c	b.hi 0x009dbcf0
009dbc40	adrp x9,0x74d000
009dbc44	add x9,x9,#0x4b0
009dbc48	ldrsw x8,[x9, x8, LSL #0x2]
009dbc4c	add x8,x8,x9
009dbc50	br x8
009dbc54	adrp x8,0xcb5000
009dbc58	ldr x8,[x8, #0x288]
009dbc5c	mov w0,#0x1
009dbc60	str x8,[x2]
009dbc64	str w0,[x3]
009dbc68	b 0x009dbd60
009dbc6c	adrp x8,0xcb5000
009dbc70	ldr x8,[x8, #0x280]
009dbc74	mov w9,#0xb
009dbc78	b 0x009dbd54
009dbc7c	adrp x8,0xcb5000
009dbc80	ldr x8,[x8, #0x290]
009dbc84	mov w9,#0x10
009dbc88	b 0x009dbd54
009dbc8c	adrp x8,0xcb5000
009dbc90	ldr x8,[x8, #0x270]
009dbc94	orr w9,wzr,#0xf
009dbc98	b 0x009dbd54
009dbc9c	ldr x8,[x19, #0x8]
009dbca0	adrp x9,0xcb5000
009dbca4	adrp x10,0xcb5000
009dbca8	mov w11,#0x101
009dbcac	ldr x8,[x8, #0xc0]
009dbcb0	ldr w8,[x8, #0x60]
009dbcb4	ldr x9,[x9, #0x268]
009dbcb8	ldr x10,[x10, #0x278]
009dbcbc	tst w8,#0x8
009dbcc0	csel x8,x10,x9,eq
009dbcc4	str x8,[x2]
009dbcc8	str w11,[x3]
009dbccc	b 0x009dbd5c
009dbcd0	adrp x8,0xcb5000
009dbcd4	ldr x8,[x8, #0x2b0]
009dbcd8	mov w9,#0x43
009dbcdc	b 0x009dbd54
009dbce0	adrp x8,0xcb5000
009dbce4	ldr x8,[x8, #0x2a0]
009dbce8	mov w9,#0x14
009dbcec	b 0x009dbd54
009dbcf0	bl 0x00c342a0
009dbcf4	adrp x0,0x2d7000
009dbcf8	adrp x2,0x2b1000
009dbcfc	add x0,x0,#0xb1a
009dbd00	add x2,x2,#0xfa6
009dbd04	mov w1,#0x37a
009dbd08	bl 0x00c342b0
009dbd0c	mov w1,#0x50
009dbd10	mov w2,#0xec
009dbd14	mov x0,x19
009dbd18	mov x3,xzr
009dbd1c	bl 0x00c34410
009dbd20	mov w0,wzr
009dbd24	b 0x009dbd60
009dbd28	adrp x8,0xcb5000
009dbd2c	ldr x8,[x8, #0x2a8]
009dbd30	orr w9,wzr,#0x18
009dbd34	b 0x009dbd54
009dbd38	mov w8,#0xffffffff
009dbd3c	str xzr,[x2]
009dbd40	str w8,[x3]
009dbd44	b 0x009dbd5c
009dbd48	adrp x8,0xcb5000
009dbd4c	ldr x8,[x8, #0x298]
009dbd50	mov w9,#0x5
009dbd54	str x8,[x2]
009dbd58	str w9,[x3]
009dbd5c	mov w0,#0x1
009dbd60	ldp x29,x30,[sp, #0x10]
009dbd64	ldr x19,[sp], #0x20
009dbd68	ret
