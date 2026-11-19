; SHA384 @ 00addfd4
00addfd4	str x19,[sp, #-0x20]!
00addfd8	adrp x8,0xd22000
00addfdc	add x8,x8,#0x298
00addfe0	cmp x2,#0x0
00addfe4	mov x4,x1
00addfe8	csel x19,x8,x2,eq
00addfec	adrp x1,0x2c5000
00addff0	mov x3,x0
00addff4	add x1,x1,#0x55a
00addff8	mov x0,xzr
00addffc	mov x2,xzr
00ade000	mov x5,x19
00ade004	mov x6,xzr
00ade008	stp x29,x30,[sp, #0x10]
00ade00c	add x29,sp,#0x10
00ade010	bl 0x00c3c220
00ade014	ldp x29,x30,[sp, #0x10]
00ade018	cmp w0,#0x0
00ade01c	csel x0,xzr,x19,eq
00ade020	ldr x19,[sp], #0x20
00ade024	ret
