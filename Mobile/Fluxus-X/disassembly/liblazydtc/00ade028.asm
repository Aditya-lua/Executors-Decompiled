; SHA512 @ 00ade028
00ade028	str x19,[sp, #-0x20]!
00ade02c	adrp x8,0xd22000
00ade030	add x8,x8,#0x2c8
00ade034	cmp x2,#0x0
00ade038	mov x4,x1
00ade03c	csel x19,x8,x2,eq
00ade040	adrp x1,0x2b7000
00ade044	mov x3,x0
00ade048	add x1,x1,#0x998
00ade04c	mov x0,xzr
00ade050	mov x2,xzr
00ade054	mov x5,x19
00ade058	mov x6,xzr
00ade05c	stp x29,x30,[sp, #0x10]
00ade060	add x29,sp,#0x10
00ade064	bl 0x00c3c220
00ade068	ldp x29,x30,[sp, #0x10]
00ade06c	cmp w0,#0x0
00ade070	csel x0,xzr,x19,eq
00ade074	ldr x19,[sp], #0x20
00ade078	ret
