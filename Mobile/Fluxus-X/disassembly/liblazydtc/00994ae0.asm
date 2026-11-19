; FUN_00994ae0 @ 00994ae0
00994ae0	str x19,[sp, #-0x20]!
00994ae4	stp x29,x30,[sp, #0x10]
00994ae8	add x29,sp,#0x10
00994aec	ldr x19,[x0, #0x20]
00994af0	cbz x19,0x00994b0c
00994af4	add x8,x19,#0x8
00994af8	ldaxr x9,[x8]
00994afc	sub x10,x9,#0x1
00994b00	stlxr w11,x10,[x8]
00994b04	cbnz w11,0x00994af8
00994b08	cbz x9,0x00994b18
00994b0c	ldp x29,x30,[sp, #0x10]
00994b10	ldr x19,[sp], #0x20
00994b14	ret
00994b18	ldr x8,[x19]
00994b1c	mov x0,x19
00994b20	ldr x8,[x8, #0x10]
00994b24	blr x8
00994b28	ldp x29,x30,[sp, #0x10]
00994b2c	mov x0,x19
00994b30	ldr x19,[sp], #0x20
00994b34	b 0x00c2ff00
