; evp_is_a @ 00a5debc
00a5debc	str x23,[sp, #-0x40]!
00a5dec0	stp x22,x21,[sp, #0x10]
00a5dec4	stp x20,x19,[sp, #0x20]
00a5dec8	stp x29,x30,[sp, #0x30]
00a5decc	add x29,sp,#0x30
00a5ded0	mov x19,x3
00a5ded4	mov x21,x2
00a5ded8	mov w20,w1
00a5dedc	mov x23,x0
00a5dee0	bl 0x00c3b2f0
00a5dee4	bl 0x00c3b650
00a5dee8	mov x22,x0
00a5deec	cbnz x23,0x00a5df00
00a5def0	mov x0,x22
00a5def4	mov x1,x21
00a5def8	bl 0x00c3b620
00a5defc	mov w20,w0
00a5df00	mov x0,x22
00a5df04	mov x1,x19
00a5df08	bl 0x00c3b620
00a5df0c	cmp w0,w20
00a5df10	ldp x29,x30,[sp, #0x30]
00a5df14	ldp x20,x19,[sp, #0x20]
00a5df18	ldp x22,x21,[sp, #0x10]
00a5df1c	cset w0,eq
00a5df20	ldr x23,[sp], #0x40
00a5df24	ret
