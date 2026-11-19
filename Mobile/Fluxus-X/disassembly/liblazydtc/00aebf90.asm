; ossl_store_get0_loader_int @ 00aebf90
00aebf90	sub sp,sp,#0x100
00aebf94	stp x20,x19,[sp, #0xe0]
00aebf98	mov x19,x0
00aebf9c	str x0,[sp]
00aebfa0	adrp x0,0xd22000
00aebfa4	adrp x1,0xaeb000
00aebfa8	add x0,x0,#0x308
00aebfac	add x1,x1,#0xf60
00aebfb0	str x21,[sp, #0xd0]
00aebfb4	stp x29,x30,[sp, #0xf0]
00aebfb8	add x29,sp,#0xf0
00aebfbc	str xzr,[sp, #0x10]
00aebfc0	stp xzr,xzr,[sp, #0x38]
00aebfc4	stp xzr,xzr,[sp, #0x50]
00aebfc8	bl 0x00c34d60
00aebfcc	cbz w0,0x00aec05c
00aebfd0	adrp x8,0xd22000
00aebfd4	ldr w8,[x8, #0x30c]
00aebfd8	cbz w8,0x00aec05c
00aebfdc	adrp x21,0xd22000
00aebfe0	ldr x0,[x21, #0x310]
00aebfe4	bl 0x00c356a0
00aebfe8	cbz w0,0x00aec08c
00aebfec	adrp x20,0xd22000
00aebff0	ldr x0,[x20, #0x318]
00aebff4	cbnz x0,0x00aec014
00aebff8	adrp x0,0xaec000
00aebffc	adrp x1,0xaec000
00aec000	add x0,x0,#0x2ec
00aec004	add x1,x1,#0x2f4
00aec008	bl 0x00c34dd0
00aec00c	str x0,[x20, #0x318]
00aec010	cbz x0,0x00aec094
00aec014	mov x1,sp
00aec018	bl 0x00c34de0
00aec01c	mov x20,x0
00aec020	cbnz x0,0x00aec0cc
00aec024	bl 0x00c342a0
00aec028	adrp x0,0x2bc000
00aec02c	adrp x2,0x2be000
00aec030	add x0,x0,#0x4ea
00aec034	add x2,x2,#0x391
00aec038	mov w1,#0xed
00aec03c	bl 0x00c342b0
00aec040	adrp x2,0x2d4000
00aec044	add x2,x2,#0x441
00aec048	mov w0,#0x2c
00aec04c	mov w1,#0x69
00aec050	mov x3,x19
00aec054	bl 0x00c342c0
00aec058	b 0x00aec0cc
00aec05c	bl 0x00c342a0
00aec060	adrp x0,0x2bc000
00aec064	adrp x2,0x2be000
00aec068	add x0,x0,#0x4ea
00aec06c	add x2,x2,#0x391
00aec070	mov w1,#0xe3
00aec074	bl 0x00c342b0
00aec078	mov w1,#0x100
00aec07c	mov w0,#0x2c
00aec080	movk w1,#0xc, LSL #16
00aec084	mov x2,xzr
00aec088	bl 0x00c342c0
00aec08c	mov x20,xzr
00aec090	b 0x00aec0d4
00aec094	bl 0x00c342a0
00aec098	adrp x0,0x2bc000
00aec09c	adrp x2,0x2be000
00aec0a0	add x0,x0,#0x4ea
00aec0a4	add x2,x2,#0x391
00aec0a8	mov w1,#0xea
00aec0ac	bl 0x00c342b0
00aec0b0	mov w8,#0x100
00aec0b4	movk w8,#0xc, LSL #16
00aec0b8	add w1,w8,#0x3
00aec0bc	mov w0,#0x2c
00aec0c0	mov x2,xzr
00aec0c4	bl 0x00c342c0
00aec0c8	mov x20,xzr
00aec0cc	ldr x0,[x21, #0x310]
00aec0d0	bl 0x00c35690
00aec0d4	mov x0,x20
00aec0d8	ldp x29,x30,[sp, #0xf0]
00aec0dc	ldp x20,x19,[sp, #0xe0]
00aec0e0	ldr x21,[sp, #0xd0]
00aec0e4	add sp,sp,#0x100
00aec0e8	ret
