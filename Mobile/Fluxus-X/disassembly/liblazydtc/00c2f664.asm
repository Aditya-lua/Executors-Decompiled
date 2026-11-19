; FUN_00c2f664 @ 00c2f664
00c2f664	paciasp
00c2f668	stp x29,x30,[sp, #-0x40]!
00c2f66c	str x23,[sp, #0x10]
00c2f670	stp x22,x21,[sp, #0x20]
00c2f674	stp x20,x19,[sp, #0x30]
00c2f678	mov x29,sp
00c2f67c	mov x20,x3
00c2f680	sub x3,x2,x1
00c2f684	mov x19,x1
00c2f688	cmp x3,#0x3
00c2f68c	b.hi 0x00c2f6b8
00c2f690	cmp x2,x19
00c2f694	b.eq 0x00c2f740
00c2f698	adrp x20,0xcb4000
00c2f69c	adrp x1,0x2c4000
00c2f6a0	add x1,x1,#0xaad
00c2f6a4	ldr x20,[x20, #0xba0]
00c2f6a8	mov x2,x19
00c2f6ac	add x0,x20,#0x130
00c2f6b0	bl 0x00c30940
00c2f6b4	b 0x00c2f738
00c2f6b8	ldrb w8,[x19]
00c2f6bc	cmp w8,#0x1
00c2f6c0	b.ne 0x00c2f718
00c2f6c4	add x8,x19,#0x4
00c2f6c8	ldrb w21,[x19, #0x2]
00c2f6cc	ldrb w3,[x19, #0x1]
00c2f6d0	str x8,[x29, #0x18]
00c2f6d4	add x1,x29,#0x18
00c2f6d8	mov x4,x19
00c2f6dc	ldrb w8,[x19, #0x3]
00c2f6e0	mov x23,x0
00c2f6e4	mov x22,x2
00c2f6e8	strb w8,[x20, #0x18]
00c2f6ec	bl 0x00c2e33c
00c2f6f0	cmp w21,#0xff
00c2f6f4	str x0,[x20]
00c2f6f8	b.eq 0x00c2f75c
00c2f6fc	add x1,x29,#0x18
00c2f700	mov x0,x23
00c2f704	mov x2,x22
00c2f708	mov w3,w21
00c2f70c	mov x4,x19
00c2f710	bl 0x00c2e33c
00c2f714	b 0x00c2f760
00c2f718	adrp x20,0xcb4000
00c2f71c	adrp x1,0x2ae000
00c2f720	add x1,x1,#0xefa
00c2f724	ldr x20,[x20, #0xba0]
00c2f728	mov w2,w8
00c2f72c	mov x3,x19
00c2f730	add x0,x20,#0x130
00c2f734	bl 0x00c30940
00c2f738	add x0,x20,#0x130
00c2f73c	bl 0x00c30c50
00c2f740	mov w0,wzr
00c2f744	ldp x20,x19,[sp, #0x30]
00c2f748	ldr x23,[sp, #0x10]
00c2f74c	ldp x22,x21,[sp, #0x20]
00c2f750	ldp x29,x30,[sp], #0x40
00c2f754	autiasp
00c2f758	ret
00c2f75c	mov x0,xzr
00c2f760	ldr x8,[x29, #0x18]
00c2f764	stp x0,x8,[x20, #0x8]
00c2f768	mov w0,#0x1
00c2f76c	ldp x20,x19,[sp, #0x30]
00c2f770	ldr x23,[sp, #0x10]
00c2f774	ldp x22,x21,[sp, #0x20]
00c2f778	ldp x29,x30,[sp], #0x40
00c2f77c	autiasp
00c2f780	ret
