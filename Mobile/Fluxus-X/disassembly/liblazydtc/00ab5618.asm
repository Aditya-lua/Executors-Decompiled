; PEM_write_bio_PUBKEY @ 00ab5618
00ab5618	sub sp,sp,#0x40
00ab561c	stp x20,x19,[sp, #0x20]
00ab5620	mov x20,x1
00ab5624	adrp x2,0x2b9000
00ab5628	adrp x3,0x2a2000
00ab562c	mov x19,x0
00ab5630	add x2,x2,#0x56f
00ab5634	add x3,x3,#0xb58
00ab5638	mov w1,#0x86
00ab563c	mov x0,x20
00ab5640	mov x4,xzr
00ab5644	str x21,[sp, #0x10]
00ab5648	stp x29,x30,[sp, #0x30]
00ab564c	add x29,sp,#0x30
00ab5650	bl 0x00c3b960
00ab5654	mov x21,x0
00ab5658	bl 0x00c3b7d0
00ab565c	cbz w0,0x00ab5680
00ab5660	mov x0,x21
00ab5664	mov x1,x19
00ab5668	bl 0x00c3b860
00ab566c	mov w19,w0
00ab5670	mov x0,x21
00ab5674	bl 0x00c3b890
00ab5678	mov w0,w19
00ab567c	b 0x00ab56b8
00ab5680	mov x0,x21
00ab5684	bl 0x00c3b890
00ab5688	adrp x0,0xcb5000
00ab568c	ldr x0,[x0, #0x4c0]
00ab5690	adrp x1,0x2da000
00ab5694	add x1,x1,#0x514
00ab5698	mov x2,x19
00ab569c	mov x3,x20
00ab56a0	mov x4,xzr
00ab56a4	mov x5,xzr
00ab56a8	mov w6,wzr
00ab56ac	mov x7,xzr
00ab56b0	str xzr,[sp]
00ab56b4	bl 0x00c36070
00ab56b8	ldp x29,x30,[sp, #0x30]
00ab56bc	ldp x20,x19,[sp, #0x20]
00ab56c0	ldr x21,[sp, #0x10]
00ab56c4	add sp,sp,#0x40
00ab56c8	ret
