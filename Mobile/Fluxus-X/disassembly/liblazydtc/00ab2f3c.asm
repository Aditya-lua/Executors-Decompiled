; OCSP_request_verify @ 00ab2f3c
00ab2f3c	stp x24,x23,[sp, #-0x40]!
00ab2f40	stp x22,x21,[sp, #0x10]
00ab2f44	stp x20,x19,[sp, #0x20]
00ab2f48	stp x29,x30,[sp, #0x30]
00ab2f4c	ldr x8,[x0, #0x20]
00ab2f50	add x29,sp,#0x30
00ab2f54	cbz x8,0x00ab2fc8
00ab2f58	ldr x9,[x0, #0x8]
00ab2f5c	mov x20,x0
00ab2f60	cbz x9,0x00ab2fa0
00ab2f64	ldr w10,[x9]
00ab2f68	cmp w10,#0x4
00ab2f6c	b.ne 0x00ab2fa0
00ab2f70	ldr x24,[x9, #0x8]
00ab2f74	mov x21,x3
00ab2f78	mov x19,x2
00ab2f7c	mov x23,x1
00ab2f80	tbnz w21,#0x1,0x00ab300c
00ab2f84	ldr x0,[x8, #0x18]
00ab2f88	mov x1,x24
00ab2f8c	bl 0x00c3f110
00ab2f90	cbz x0,0x00ab300c
00ab2f94	mov x22,x0
00ab2f98	mov w8,#0x1
00ab2f9c	b 0x00ab3024
00ab2fa0	bl 0x00c342a0
00ab2fa4	adrp x0,0x2d2000
00ab2fa8	adrp x2,0x2b0000
00ab2fac	add x0,x0,#0x1db
00ab2fb0	add x2,x2,#0x73d
00ab2fb4	mov w1,#0x18f
00ab2fb8	bl 0x00c342b0
00ab2fbc	mov w0,#0x27
00ab2fc0	mov w1,#0x81
00ab2fc4	b 0x00ab2fec
00ab2fc8	bl 0x00c342a0
00ab2fcc	adrp x0,0x2d2000
00ab2fd0	adrp x2,0x2b0000
00ab2fd4	add x0,x0,#0x1db
00ab2fd8	add x2,x2,#0x73d
00ab2fdc	mov w1,#0x18a
00ab2fe0	bl 0x00c342b0
00ab2fe4	mov w0,#0x27
00ab2fe8	mov w1,#0x80
00ab2fec	mov x2,xzr
00ab2ff0	bl 0x00c342c0
00ab2ff4	mov w0,wzr
00ab2ff8	ldp x29,x30,[sp, #0x30]
00ab2ffc	ldp x20,x19,[sp, #0x20]
00ab3000	ldp x22,x21,[sp, #0x10]
00ab3004	ldp x24,x23,[sp], #0x40
00ab3008	ret
00ab300c	mov x0,x23
00ab3010	mov x1,x24
00ab3014	bl 0x00c3f110
00ab3018	cbz x0,0x00ab3090
00ab301c	mov x22,x0
00ab3020	mov w8,wzr
00ab3024	tst x21,#0x200
00ab3028	cset w9,eq
00ab302c	orr w8,w9,w8
00ab3030	orr x9,x21,#0x10
00ab3034	cmp w8,#0x0
00ab3038	csel x21,x21,x9,ne
00ab303c	mov x0,x20
00ab3040	mov x1,xzr
00ab3044	mov x2,x22
00ab3048	mov x3,x21
00ab304c	bl 0x00ab2c40
00ab3050	cmp w0,#0x1
00ab3054	b.lt 0x00ab2ff4
00ab3058	tbnz w21,#0x4,0x00ab30b8
00ab305c	mov x4,xzr
00ab3060	tbnz w21,#0x3,0x00ab306c
00ab3064	ldr x8,[x20, #0x20]
00ab3068	ldr x4,[x8, #0x18]
00ab306c	mov x0,x22
00ab3070	mov w1,wzr
00ab3074	mov x2,x19
00ab3078	mov x3,x21
00ab307c	mov x5,xzr
00ab3080	bl 0x00ab2d34
00ab3084	cmp w0,#0x0
00ab3088	cset w0,gt
00ab308c	b 0x00ab2ff8
00ab3090	bl 0x00c342a0
00ab3094	adrp x0,0x2d2000
00ab3098	adrp x2,0x2b0000
00ab309c	add x0,x0,#0x1db
00ab30a0	add x2,x2,#0x73d
00ab30a4	mov w1,#0x195
00ab30a8	bl 0x00c342b0
00ab30ac	mov w0,#0x27
00ab30b0	mov w1,#0x76
00ab30b4	b 0x00ab2fec
00ab30b8	mov w0,#0x1
00ab30bc	b 0x00ab2ff8
