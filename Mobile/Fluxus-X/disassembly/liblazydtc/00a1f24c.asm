; DH_set0_pqg @ 00a1f24c
00a1f24c	str x19,[sp, #-0x20]!
00a1f250	stp x29,x30,[sp, #0x10]
00a1f254	mov x19,x0
00a1f258	ldr x8,[x0, #0x8]!
00a1f25c	add x29,sp,#0x10
00a1f260	orr x9,x1,x8
00a1f264	mov w8,wzr
00a1f268	cbz x9,0x00a1f298
00a1f26c	ldr x8,[x19, #0x18]
00a1f270	orr x9,x3,x8
00a1f274	mov w8,wzr
00a1f278	cbz x9,0x00a1f298
00a1f27c	bl 0x00c3a060
00a1f280	mov x0,x19
00a1f284	bl 0x00c39cb0
00a1f288	ldr x8,[x19, #0xc8]
00a1f28c	add x8,x8,#0x1
00a1f290	str x8,[x19, #0xc8]
00a1f294	mov w8,#0x1
00a1f298	ldp x29,x30,[sp, #0x10]
00a1f29c	mov w0,w8
00a1f2a0	ldr x19,[sp], #0x20
00a1f2a4	ret
