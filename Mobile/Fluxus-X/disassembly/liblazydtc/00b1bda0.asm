; X509_NAME_set @ 00b1bda0
00b1bda0	stp x20,x19,[sp, #-0x20]!
00b1bda4	stp x29,x30,[sp, #0x10]
00b1bda8	ldr x8,[x0]
00b1bdac	add x29,sp,#0x10
00b1bdb0	cmp x8,x1
00b1bdb4	b.eq 0x00b1bdec
00b1bdb8	mov x19,x0
00b1bdbc	adrp x0,0xc82000
00b1bdc0	add x0,x0,#0x4b0
00b1bdc4	bl 0x00c374a0
00b1bdc8	cbz x0,0x00b1bdf4
00b1bdcc	mov x20,x0
00b1bdd0	ldr x0,[x19]
00b1bdd4	adrp x1,0xc82000
00b1bdd8	add x1,x1,#0x4b0
00b1bddc	bl 0x00c36160
00b1bde0	mov w0,#0x1
00b1bde4	str x20,[x19]
00b1bde8	b 0x00b1bdf4
00b1bdec	cmp x1,#0x0
00b1bdf0	cset w0,ne
00b1bdf4	ldp x29,x30,[sp, #0x10]
00b1bdf8	ldp x20,x19,[sp], #0x20
00b1bdfc	ret
