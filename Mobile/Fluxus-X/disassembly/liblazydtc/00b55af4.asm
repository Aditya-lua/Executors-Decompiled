; FUN_00b55af4 @ 00b55af4
00b55af4	stp x20,x19,[sp, #-0x20]!
00b55af8	stp x29,x30,[sp, #0x10]
00b55afc	add x29,sp,#0x10
00b55b00	mov x19,x0
00b55b04	bl 0x00c41000
00b55b08	cbz w0,0x00b55b3c
00b55b0c	adrp x1,0x2be000
00b55b10	add x1,x1,#0xa83
00b55b14	mov w0,#0x90
00b55b18	mov w2,#0x50
00b55b1c	bl 0x00c32320
00b55b20	mov x20,x0
00b55b24	cbz x0,0x00b55b40
00b55b28	mov w2,#0x90
00b55b2c	mov x0,x20
00b55b30	mov x1,x19
00b55b34	bl 0x00c2ffd0
00b55b38	b 0x00b55b40
00b55b3c	mov x20,xzr
00b55b40	ldp x29,x30,[sp, #0x10]
00b55b44	mov x0,x20
00b55b48	ldp x20,x19,[sp], #0x20
00b55b4c	ret
