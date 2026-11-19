; FUN_00b434b0 @ 00b434b0
00b434b0	stp x20,x19,[sp, #-0x20]!
00b434b4	stp x29,x30,[sp, #0x10]
00b434b8	add x29,sp,#0x10
00b434bc	mov x19,x0
00b434c0	bl 0x00c41000
00b434c4	cbz w0,0x00b434fc
00b434c8	adrp x1,0x2ae000
00b434cc	add x1,x1,#0xb1e
00b434d0	mov w0,#0x40
00b434d4	mov w2,#0x5a
00b434d8	bl 0x00c34250
00b434dc	mov x20,x0
00b434e0	cbz x0,0x00b43500
00b434e4	mov x0,x19
00b434e8	bl 0x00c41210
00b434ec	movi d0,#0xffffffff
00b434f0	str x0,[x20]
00b434f4	str d0,[x20, #0x18]
00b434f8	b 0x00b43500
00b434fc	mov x20,xzr
00b43500	ldp x29,x30,[sp, #0x10]
00b43504	mov x0,x20
00b43508	ldp x20,x19,[sp], #0x20
00b4350c	ret
