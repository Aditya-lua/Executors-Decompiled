; tls_construct_stoc_early_data @ 009da048
009da048	stp x20,x19,[sp, #-0x20]!
009da04c	mov x20,x1
009da050	cmp w2,#0x2, LSL #12
009da054	mov x19,x0
009da058	stp x29,x30,[sp, #0x10]
009da05c	add x29,sp,#0x10
009da060	b.ne 0x009da0cc
009da064	ldr w8,[x19, #0x1d40]
009da068	cbz w8,0x009da110
009da06c	mov w1,#0x2a
009da070	mov w2,#0x2
009da074	mov x0,x20
009da078	bl 0x00c343a0
009da07c	cbz w0,0x009da0b0
009da080	mov w1,#0x2
009da084	mov x0,x20
009da088	bl 0x00c343b0
009da08c	cbz w0,0x009da0b0
009da090	ldr w1,[x19, #0x1d40]
009da094	mov w2,#0x4
009da098	mov x0,x20
009da09c	bl 0x00c343a0
009da0a0	cbz w0,0x009da0b0
009da0a4	mov x0,x20
009da0a8	bl 0x00c34350
009da0ac	cbnz w0,0x009da108
009da0b0	bl 0x00c342a0
009da0b4	adrp x0,0x2d7000
009da0b8	adrp x2,0x2a5000
009da0bc	add x0,x0,#0xae0
009da0c0	add x2,x2,#0xb6a
009da0c4	mov w1,#0x759
009da0c8	b 0x009da130
009da0cc	ldr w8,[x19, #0xb30]
009da0d0	cmp w8,#0x2
009da0d4	b.ne 0x009da110
009da0d8	mov w1,#0x2a
009da0dc	mov w2,#0x2
009da0e0	mov x0,x20
009da0e4	bl 0x00c343a0
009da0e8	cbz w0,0x009da118
009da0ec	mov w1,#0x2
009da0f0	mov x0,x20
009da0f4	bl 0x00c343b0
009da0f8	cbz w0,0x009da118
009da0fc	mov x0,x20
009da100	bl 0x00c34350
009da104	cbz w0,0x009da118
009da108	mov w0,#0x1
009da10c	b 0x009da150
009da110	mov w0,#0x2
009da114	b 0x009da150
009da118	bl 0x00c342a0
009da11c	adrp x0,0x2d7000
009da120	adrp x2,0x2a5000
009da124	add x0,x0,#0xae0
009da128	add x2,x2,#0xb6a
009da12c	mov w1,#0x766
009da130	bl 0x00c342b0
009da134	mov w2,#0x103
009da138	mov w1,#0x50
009da13c	movk w2,#0xc, LSL #16
009da140	mov x0,x19
009da144	mov x3,xzr
009da148	bl 0x00c34410
009da14c	mov w0,wzr
009da150	ldp x29,x30,[sp, #0x10]
009da154	ldp x20,x19,[sp], #0x20
009da158	ret
