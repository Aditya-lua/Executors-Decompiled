; FUN_0086f27c @ 0086f27c
0086f27c	stp x29,x30,[sp, #-0x20]!
0086f280	stp x20,x19,[sp, #0x10]
0086f284	mov x29,sp
0086f288	mov x19,x0
0086f28c	ldp x20,x0,[x0, #0x8]
0086f290	cmp x20,x0
0086f294	b.eq 0x0086f2b4
0086f298	ldr x8,[x0, #-0x30]!
0086f29c	str x0,[x19, #0x10]
0086f2a0	ldr x8,[x8]
0086f2a4	blr x8
0086f2a8	ldr x0,[x19, #0x10]
0086f2ac	cmp x20,x0
0086f2b0	b.ne 0x0086f298
0086f2b4	ldr x0,[x19]
0086f2b8	cbz x0,0x0086f2d0
0086f2bc	ldr x8,[x19, #0x18]
0086f2c0	sub x1,x8,x0
0086f2c4	ldp x20,x19,[sp, #0x10]
0086f2c8	ldp x29,x30,[sp], #0x20
0086f2cc	b 0x00c2fe80
0086f2d0	ldp x20,x19,[sp, #0x10]
0086f2d4	ldp x29,x30,[sp], #0x20
0086f2d8	ret
