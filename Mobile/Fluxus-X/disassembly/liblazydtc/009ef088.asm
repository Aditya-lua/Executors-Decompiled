; ASN1_TIME_set_string_X509 @ 009ef088
009ef088	sub sp,sp,#0x70
009ef08c	stp x20,x19,[sp, #0x50]
009ef090	mov x20,x0
009ef094	mov x0,x1
009ef098	stp x29,x30,[sp, #0x60]
009ef09c	add x29,sp,#0x60
009ef0a0	mov x19,x1
009ef0a4	bl 0x00c2ff50
009ef0a8	mov w9,#0x17
009ef0ac	mov w8,#0x100
009ef0b0	stp w0,w9,[x29, #-0x28]
009ef0b4	sub x0,x29,#0x28
009ef0b8	stp x19,x8,[x29, #-0x20]
009ef0bc	bl 0x00c37960
009ef0c0	cbnz w0,0x009ef0d8
009ef0c4	orr w8,wzr,#0x18
009ef0c8	sub x0,x29,#0x28
009ef0cc	stur w8,[x29, #-0x24]
009ef0d0	bl 0x00c374c0
009ef0d4	cbz w0,0x009ef1b8
009ef0d8	cbz x20,0x009ef148
009ef0dc	ldur w8,[x29, #-0x24]
009ef0e0	cmp w8,#0x18
009ef0e4	b.ne 0x009ef148
009ef0e8	mov x0,sp
009ef0ec	sub x1,x29,#0x28
009ef0f0	bl 0x009ee624
009ef0f4	cbz w0,0x009ef1b8
009ef0f8	ldr w8,[sp, #0x14]
009ef0fc	sub w8,w8,#0x32
009ef100	cmp w8,#0x63
009ef104	b.hi 0x009ef14c
009ef108	ldursw x8,[x29, #-0x28]
009ef10c	adrp x1,0x2c9000
009ef110	add x1,x1,#0x598
009ef114	mov w2,#0x1a6
009ef118	sub w9,w8,#0x2
009ef11c	sub x0,x8,#0x1
009ef120	stur w9,[x29, #-0x28]
009ef124	bl 0x00c34250
009ef128	stur x0,[x29, #-0x20]
009ef12c	cbz x0,0x009ef188
009ef130	ldursw x2,[x29, #-0x28]
009ef134	add x1,x19,#0x2
009ef138	bl 0x00c2ffd0
009ef13c	mov w8,#0x17
009ef140	stur w8,[x29, #-0x24]
009ef144	b 0x009ef14c
009ef148	cbz x20,0x009ef15c
009ef14c	sub x1,x29,#0x28
009ef150	mov x0,x20
009ef154	bl 0x00c37940
009ef158	cbz w0,0x009ef164
009ef15c	mov w20,#0x1
009ef160	b 0x009ef168
009ef164	mov w20,wzr
009ef168	ldur x0,[x29, #-0x20]
009ef16c	cmp x0,x19
009ef170	b.eq 0x009ef1bc
009ef174	adrp x1,0x2c9000
009ef178	add x1,x1,#0x598
009ef17c	mov w2,#0x1b4
009ef180	bl 0x00c32310
009ef184	b 0x009ef1bc
009ef188	bl 0x00c342a0
009ef18c	adrp x0,0x2c9000
009ef190	adrp x2,0x2b5000
009ef194	add x0,x0,#0x598
009ef198	add x2,x2,#0xa3f
009ef19c	mov w1,#0x1a8
009ef1a0	bl 0x00c342b0
009ef1a4	mov w1,#0x100
009ef1a8	mov w0,#0xd
009ef1ac	movk w1,#0xc, LSL #16
009ef1b0	mov x2,xzr
009ef1b4	bl 0x00c342c0
009ef1b8	mov w20,wzr
009ef1bc	mov w0,w20
009ef1c0	ldp x29,x30,[sp, #0x60]
009ef1c4	ldp x20,x19,[sp, #0x50]
009ef1c8	add sp,sp,#0x70
009ef1cc	ret
