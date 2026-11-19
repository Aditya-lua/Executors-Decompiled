; OBJ_nid2sn @ 00aadfa0
00aadfa0	sub sp,sp,#0x60
00aadfa4	str x19,[sp, #0x40]
00aadfa8	mov w19,w0
00aadfac	cmp w0,#0x4df
00aadfb0	stp x29,x30,[sp, #0x50]
00aadfb4	add x29,sp,#0x50
00aadfb8	b.hi 0x00aadfe0
00aadfbc	cbz w19,0x00aae024
00aadfc0	adrp x8,0xc6d000
00aadfc4	add x8,x8,#0xa58
00aadfc8	mov w9,#0x28
00aadfcc	smaddl x8,w19,w9,x8
00aadfd0	ldr w8,[x8, #0x10]
00aadfd4	cbz w8,0x00aae040
00aadfd8	sxtw x8,w19
00aadfdc	b 0x00aae028
00aadfe0	mov w0,#0x40
00aadfe4	mov x1,xzr
00aadfe8	bl 0x00c35500
00aadfec	adrp x8,0xd22000
00aadff0	ldr x0,[x8, #0x188]
00aadff4	cbz x0,0x00aae08c
00aadff8	orr w8,wzr,#0x3
00aadffc	add x9,sp,#0x8
00aae000	sub x1,x29,#0x20
00aae004	stur w8,[x29, #-0x20]
00aae008	stur x9,[x29, #-0x18]
00aae00c	str w19,[sp, #0x18]
00aae010	bl 0x00c34de0
00aae014	cbz x0,0x00aae05c
00aae018	ldr x8,[x0, #0x8]
00aae01c	ldr x0,[x8]
00aae020	b 0x00aae08c
00aae024	mov x8,xzr
00aae028	mov w9,#0x28
00aae02c	mul x8,x8,x9
00aae030	adrp x9,0xc6d000
00aae034	add x9,x9,#0xa58
00aae038	ldr x0,[x9, x8#0x0]
00aae03c	b 0x00aae08c
00aae040	bl 0x00c342a0
00aae044	adrp x0,0x2d8000
00aae048	adrp x2,0x2b8000
00aae04c	add x0,x0,#0x291
00aae050	add x2,x2,#0x5c
00aae054	mov w1,#0x101
00aae058	b 0x00aae074
00aae05c	bl 0x00c342a0
00aae060	adrp x0,0x2d8000
00aae064	adrp x2,0x2b8000
00aae068	add x0,x0,#0x291
00aae06c	add x2,x2,#0x5c
00aae070	mov w1,#0x114
00aae074	bl 0x00c342b0
00aae078	mov w0,#0x8
00aae07c	mov w1,#0x65
00aae080	mov x2,xzr
00aae084	bl 0x00c342c0
00aae088	mov x0,xzr
00aae08c	ldp x29,x30,[sp, #0x50]
00aae090	ldr x19,[sp, #0x40]
00aae094	add sp,sp,#0x60
00aae098	ret
