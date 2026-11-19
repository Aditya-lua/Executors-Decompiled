; X509_EXTENSION_create_by_OBJ @ 00b0d660
00b0d660	str x23,[sp, #-0x40]!
00b0d664	stp x22,x21,[sp, #0x10]
00b0d668	stp x20,x19,[sp, #0x20]
00b0d66c	mov x21,x3
00b0d670	mov w22,w2
00b0d674	mov x23,x1
00b0d678	mov x20,x0
00b0d67c	stp x29,x30,[sp, #0x30]
00b0d680	add x29,sp,#0x30
00b0d684	cbz x0,0x00b0d690
00b0d688	ldr x19,[x20]
00b0d68c	cbnz x19,0x00b0d69c
00b0d690	bl 0x00c40d20
00b0d694	mov x19,x0
00b0d698	cbz x0,0x00b0d714
00b0d69c	cbz x23,0x00b0d6f4
00b0d6a0	cbz x19,0x00b0d6f4
00b0d6a4	ldr x0,[x19]
00b0d6a8	bl 0x00c37660
00b0d6ac	mov x0,x23
00b0d6b0	bl 0x00c37730
00b0d6b4	str x0,[x19]
00b0d6b8	cbz x0,0x00b0d6f4
00b0d6bc	cmp w22,#0x0
00b0d6c0	orr w8,wzr,#0xff
00b0d6c4	csinv w8,w8,wzr,ne
00b0d6c8	str w8,[x19, #0x8]
00b0d6cc	ldr x1,[x21, #0x8]
00b0d6d0	ldr w2,[x21]
00b0d6d4	add x0,x19,#0x10
00b0d6d8	bl 0x00c377a0
00b0d6dc	cbz w0,0x00b0d6f4
00b0d6e0	cbz x20,0x00b0d744
00b0d6e4	ldr x8,[x20]
00b0d6e8	cbnz x8,0x00b0d744
00b0d6ec	str x19,[x20]
00b0d6f0	b 0x00b0d744
00b0d6f4	cbz x20,0x00b0d704
00b0d6f8	ldr x8,[x20]
00b0d6fc	cmp x19,x8
00b0d700	b.eq 0x00b0d70c
00b0d704	mov x0,x19
00b0d708	bl 0x00c35b00
00b0d70c	mov x19,xzr
00b0d710	b 0x00b0d744
00b0d714	bl 0x00c342a0
00b0d718	adrp x0,0x2a2000
00b0d71c	adrp x2,0x2b6000
00b0d720	add x0,x0,#0xeaa
00b0d724	add x2,x2,#0x699
00b0d728	mov w1,#0xa5
00b0d72c	bl 0x00c342b0
00b0d730	mov w1,#0x100
00b0d734	mov w0,#0xb
00b0d738	movk w1,#0xc, LSL #16
00b0d73c	mov x2,xzr
00b0d740	bl 0x00c342c0
00b0d744	mov x0,x19
00b0d748	ldp x29,x30,[sp, #0x30]
00b0d74c	ldp x20,x19,[sp, #0x20]
00b0d750	ldp x22,x21,[sp, #0x10]
00b0d754	ldr x23,[sp], #0x40
00b0d758	ret
