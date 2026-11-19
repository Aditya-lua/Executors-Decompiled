; FUN_00b4cafc @ 00b4cafc
00b4cafc	stp x20,x19,[sp, #-0x20]!
00b4cb00	stp x29,x30,[sp, #0x10]
00b4cb04	add x29,sp,#0x10
00b4cb08	mov w19,w1
00b4cb0c	mov x20,x0
00b4cb10	bl 0x00c41000
00b4cb14	cbz w0,0x00b4cb28
00b4cb18	mov x0,x20
00b4cb1c	mov w1,w19
00b4cb20	bl 0x00c39c10
00b4cb24	b 0x00b4cb2c
00b4cb28	mov x0,xzr
00b4cb2c	ldp x29,x30,[sp, #0x10]
00b4cb30	ldp x20,x19,[sp], #0x20
00b4cb34	ret
