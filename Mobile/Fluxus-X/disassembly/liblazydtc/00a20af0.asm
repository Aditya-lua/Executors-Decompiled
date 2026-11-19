; DSA_set0_key @ 00a20af0
00a20af0	str x21,[sp, #-0x30]!
00a20af4	stp x20,x19,[sp, #0x10]
00a20af8	mov x20,x2
00a20afc	mov x19,x0
00a20b00	stp x29,x30,[sp, #0x20]
00a20b04	add x29,sp,#0x20
00a20b08	cbz x1,0x00a20b1c
00a20b0c	ldr x0,[x19, #0x68]
00a20b10	mov x21,x1
00a20b14	bl 0x00c36290
00a20b18	str x21,[x19, #0x68]
00a20b1c	cbz x20,0x00a20b2c
00a20b20	ldr x0,[x19, #0x70]
00a20b24	bl 0x00c36290
00a20b28	str x20,[x19, #0x70]
00a20b2c	ldr x8,[x19, #0xc0]
00a20b30	mov w0,#0x1
00a20b34	add x8,x8,#0x1
00a20b38	str x8,[x19, #0xc0]
00a20b3c	ldp x29,x30,[sp, #0x20]
00a20b40	ldp x20,x19,[sp, #0x10]
00a20b44	ldr x21,[sp], #0x30
00a20b48	ret
