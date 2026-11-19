; FUN_00c2c58c @ 00c2c58c
00c2c58c	paciasp
00c2c590	stp x29,x30,[sp, #-0x20]!
00c2c594	str x19,[sp, #0x10]
00c2c598	mov x29,sp
00c2c59c	ldr x8,[x0]
00c2c5a0	mov x19,x1
00c2c5a4	ldr x8,[x8, #0x48]
00c2c5a8	blr x8
00c2c5ac	ldr x8,[x19, #0x8]
00c2c5b0	cmp x8,#0x0
00c2c5b4	mov w8,#0xffffe66b
00c2c5b8	csel w0,w8,wzr,eq
00c2c5bc	ldr x19,[sp, #0x10]
00c2c5c0	ldp x29,x30,[sp], #0x20
00c2c5c4	autiasp
00c2c5c8	ret
