; FUN_00aefa9c @ 00aefa9c
00aefa9c	stp x20,x19,[sp, #-0x20]!
00aefaa0	stp x29,x30,[sp, #0x10]
00aefaa4	adrp x8,0xd22000
00aefaa8	adrp x20,0xcb4000
00aefaac	ldr x8,[x8, #0x328]
00aefab0	ldr x20,[x20, #0xba0]
00aefab4	mov x19,x0
00aefab8	add x29,sp,#0x10
00aefabc	cmp x8,x20
00aefac0	b.eq 0x00aefacc
00aefac4	mov x0,x8
00aefac8	bl 0x00c30be0
00aefacc	adrp x8,0xd22000
00aefad0	ldr x0,[x8, #0x330]
00aefad4	add x8,x20,#0x130
00aefad8	cmp x0,x8
00aefadc	b.eq 0x00aefae4
00aefae0	bl 0x00c30be0
00aefae4	ldr x0,[x19, #0x30]
00aefae8	bl 0x00c35690
00aefaec	ldp x29,x30,[sp, #0x10]
00aefaf0	mov w0,#0x1
00aefaf4	ldp x20,x19,[sp], #0x20
00aefaf8	ret
