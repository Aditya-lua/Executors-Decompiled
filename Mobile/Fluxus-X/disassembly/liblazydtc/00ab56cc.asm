; PEM_write_bio_PUBKEY_ex @ 00ab56cc
00ab56cc	sub sp,sp,#0x40
00ab56d0	stp x20,x19,[sp, #0x20]
00ab56d4	mov x4,x3
00ab56d8	mov x20,x1
00ab56dc	adrp x2,0x2b9000
00ab56e0	adrp x3,0x2a2000
00ab56e4	mov x19,x0
00ab56e8	add x2,x2,#0x56f
00ab56ec	add x3,x3,#0xb58
00ab56f0	mov w1,#0x86
00ab56f4	mov x0,x20
00ab56f8	str x21,[sp, #0x10]
00ab56fc	stp x29,x30,[sp, #0x30]
00ab5700	add x29,sp,#0x30
00ab5704	bl 0x00c3b960
00ab5708	mov x21,x0
00ab570c	bl 0x00c3b7d0
00ab5710	cbz w0,0x00ab5734
00ab5714	mov x0,x21
00ab5718	mov x1,x19
00ab571c	bl 0x00c3b860
00ab5720	mov w19,w0
00ab5724	mov x0,x21
00ab5728	bl 0x00c3b890
00ab572c	mov w0,w19
00ab5730	b 0x00ab576c
00ab5734	mov x0,x21
00ab5738	bl 0x00c3b890
00ab573c	adrp x0,0xcb5000
00ab5740	ldr x0,[x0, #0x4c0]
00ab5744	adrp x1,0x2da000
00ab5748	add x1,x1,#0x514
00ab574c	mov x2,x19
00ab5750	mov x3,x20
00ab5754	mov x4,xzr
00ab5758	mov x5,xzr
00ab575c	mov w6,wzr
00ab5760	mov x7,xzr
00ab5764	str xzr,[sp]
00ab5768	bl 0x00c36070
00ab576c	ldp x29,x30,[sp, #0x30]
00ab5770	ldp x20,x19,[sp, #0x20]
00ab5774	ldr x21,[sp, #0x10]
00ab5778	add sp,sp,#0x40
00ab577c	ret
