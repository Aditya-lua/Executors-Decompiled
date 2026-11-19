; ossl_a2ucompare @ 00b0052c
00b0052c	stp x28,x19,[sp, #-0x20]!
00b00530	stp x29,x30,[sp, #0x10]
00b00534	add x29,sp,#0x10
00b00538	sub sp,sp,#0x210
00b0053c	mov x19,x1
00b00540	mov w8,#0x201
00b00544	add x1,sp,#0xc
00b00548	mov x2,sp
00b0054c	str x8,[sp]
00b00550	bl 0x00b002ac
00b00554	cmp w0,#0x1
00b00558	b.lt 0x00b00574
00b0055c	add x0,sp,#0xc
00b00560	mov x1,x19
00b00564	bl 0x00c301f0
00b00568	cmp w0,#0x0
00b0056c	cset w0,ne
00b00570	b 0x00b00578
00b00574	mov w0,#0xffffffff
00b00578	add sp,sp,#0x210
00b0057c	ldp x29,x30,[sp, #0x10]
00b00580	ldp x28,x19,[sp], #0x20
00b00584	ret
