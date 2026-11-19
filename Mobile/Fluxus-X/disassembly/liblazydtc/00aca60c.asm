; ossl_rand_pool_attach @ 00aca60c
00aca60c	str x21,[sp, #-0x30]!
00aca610	stp x20,x19,[sp, #0x10]
00aca614	mov x20,x1
00aca618	adrp x1,0x29e000
00aca61c	mov x19,x2
00aca620	mov x21,x0
00aca624	add x1,x1,#0x966
00aca628	mov w0,#0x40
00aca62c	mov w2,#0x44
00aca630	stp x29,x30,[sp, #0x20]
00aca634	add x29,sp,#0x20
00aca638	bl 0x00c34250
00aca63c	cbz x0,0x00aca658
00aca640	mov w8,#0x1
00aca644	stp x21,x20,[x0]
00aca648	stp x20,x20,[x0, #0x18]
00aca64c	str w8,[x0, #0x10]
00aca650	stp x20,x19,[x0, #0x28]
00aca654	b 0x00aca68c
00aca658	bl 0x00c342a0
00aca65c	adrp x0,0x29e000
00aca660	adrp x2,0x2ce000
00aca664	add x0,x0,#0x966
00aca668	add x2,x2,#0x2a7
00aca66c	mov w1,#0x47
00aca670	bl 0x00c342b0
00aca674	mov w1,#0x100
00aca678	mov w0,#0x24
00aca67c	movk w1,#0xc, LSL #16
00aca680	mov x2,xzr
00aca684	bl 0x00c342c0
00aca688	mov x0,xzr
00aca68c	ldp x29,x30,[sp, #0x20]
00aca690	ldp x20,x19,[sp, #0x10]
00aca694	ldr x21,[sp], #0x30
00aca698	ret
