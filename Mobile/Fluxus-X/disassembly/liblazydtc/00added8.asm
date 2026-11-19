; SHA1 @ 00added8
00added8	str x19,[sp, #-0x20]!
00addedc	adrp x8,0xd22000
00addee0	add x8,x8,#0x248
00addee4	cmp x2,#0x0
00addee8	mov x4,x1
00addeec	csel x19,x8,x2,eq
00addef0	adrp x1,0x2d1000
00addef4	mov x3,x0
00addef8	add x1,x1,#0x42e
00addefc	mov x0,xzr
00addf00	mov x2,xzr
00addf04	mov x5,x19
00addf08	mov x6,xzr
00addf0c	stp x29,x30,[sp, #0x10]
00addf10	add x29,sp,#0x10
00addf14	bl 0x00c3c220
00addf18	ldp x29,x30,[sp, #0x10]
00addf1c	cmp w0,#0x0
00addf20	csel x0,xzr,x19,eq
00addf24	ldr x19,[sp], #0x20
00addf28	ret
