; ossl_ffc_params_print @ 00a7d6a4
00a7d6a4	stp x28,x27,[sp, #-0x60]!
00a7d6a8	stp x26,x25,[sp, #0x10]
00a7d6ac	stp x24,x23,[sp, #0x20]
00a7d6b0	stp x22,x21,[sp, #0x30]
00a7d6b4	stp x20,x19,[sp, #0x40]
00a7d6b8	stp x29,x30,[sp, #0x50]
00a7d6bc	mov w21,w2
00a7d6c0	ldr x2,[x1]
00a7d6c4	mov x20,x1
00a7d6c8	adrp x1,0x2bd000
00a7d6cc	add x1,x1,#0xbf1
00a7d6d0	mov x3,xzr
00a7d6d4	mov w4,w21
00a7d6d8	add x29,sp,#0x50
00a7d6dc	mov x19,x0
00a7d6e0	bl 0x00c37f60
00a7d6e4	cbz w0,0x00a7d890
00a7d6e8	ldr x2,[x20, #0x10]
00a7d6ec	adrp x1,0x2aa000
00a7d6f0	add x1,x1,#0x289
00a7d6f4	mov x0,x19
00a7d6f8	mov x3,xzr
00a7d6fc	mov w4,w21
00a7d700	bl 0x00c37f60
00a7d704	cbz w0,0x00a7d890
00a7d708	ldr x2,[x20, #0x8]
00a7d70c	cbz x2,0x00a7d72c
00a7d710	adrp x1,0x2cf000
00a7d714	add x1,x1,#0xc5e
00a7d718	mov x0,x19
00a7d71c	mov x3,xzr
00a7d720	mov w4,w21
00a7d724	bl 0x00c37f60
00a7d728	cbz w0,0x00a7d890
00a7d72c	ldr x2,[x20, #0x18]
00a7d730	cbz x2,0x00a7d750
00a7d734	adrp x1,0x2d7000
00a7d738	add x1,x1,#0xfd2
00a7d73c	mov x0,x19
00a7d740	mov x3,xzr
00a7d744	mov w4,w21
00a7d748	bl 0x00c37f60
00a7d74c	cbz w0,0x00a7d890
00a7d750	ldr x8,[x20, #0x20]
00a7d754	cbz x8,0x00a7d84c
00a7d758	mov w2,#0x80
00a7d75c	mov x0,x19
00a7d760	mov w1,w21
00a7d764	bl 0x00c38640
00a7d768	cbz w0,0x00a7d890
00a7d76c	adrp x1,0x2d1000
00a7d770	add x1,x1,#0xb0d
00a7d774	mov x0,x19
00a7d778	bl 0x00c32260
00a7d77c	cmp w0,#0x1
00a7d780	b.lt 0x00a7d890
00a7d784	orr x26,xzr,#-0x7777777777777778
00a7d788	adrp x23,0x2c4000
00a7d78c	adrp x27,0x2bc000
00a7d790	adrp x28,0x2ab000
00a7d794	adrp x24,0x2a3000
00a7d798	mov x25,xzr
00a7d79c	add w22,w21,#0x4
00a7d7a0	movk x26,#0x8889
00a7d7a4	add x23,x23,#0xdae
00a7d7a8	add x27,x27,#0xda4
00a7d7ac	add x28,x28,#0x32c
00a7d7b0	add x24,x24,#0xe88
00a7d7b4	ldr x8,[x20, #0x28]
00a7d7b8	cmp x25,x8
00a7d7bc	b.cs 0x00a7d830
00a7d7c0	umulh x9,x25,x26
00a7d7c4	lsr x9,x9,#0x3
00a7d7c8	lsl x10,x9,#0x4
00a7d7cc	sub x9,x10,x9
00a7d7d0	cmp x9,x25
00a7d7d4	b.ne 0x00a7d804
00a7d7d8	mov x0,x19
00a7d7dc	mov x1,x23
00a7d7e0	bl 0x00c32260
00a7d7e4	cmp w0,#0x1
00a7d7e8	b.lt 0x00a7d890
00a7d7ec	mov w2,#0x80
00a7d7f0	mov x0,x19
00a7d7f4	mov w1,w22
00a7d7f8	bl 0x00c38640
00a7d7fc	cbz w0,0x00a7d890
00a7d800	ldr x8,[x20, #0x28]
00a7d804	ldr x9,[x20, #0x20]
00a7d808	mov x0,x19
00a7d80c	mov x1,x24
00a7d810	ldrb w2,[x9, x25]
00a7d814	add x25,x25,#0x1
00a7d818	cmp x25,x8
00a7d81c	csel x3,x28,x27,eq
00a7d820	bl 0x00c32250
00a7d824	cmp w0,#0x1
00a7d828	b.ge 0x00a7d7b4
00a7d82c	b 0x00a7d890
00a7d830	adrp x1,0x2c4000
00a7d834	add x1,x1,#0xdae
00a7d838	mov w2,#0x1
00a7d83c	mov x0,x19
00a7d840	bl 0x00c34240
00a7d844	cmp w0,#0x1
00a7d848	b.lt 0x00a7d890
00a7d84c	ldr w8,[x20, #0x30]
00a7d850	cmn w8,#0x1
00a7d854	b.eq 0x00a7d888
00a7d858	mov w2,#0x80
00a7d85c	mov x0,x19
00a7d860	mov w1,w21
00a7d864	bl 0x00c38640
00a7d868	cbz w0,0x00a7d890
00a7d86c	ldr w2,[x20, #0x30]
00a7d870	adrp x1,0x2cb000
00a7d874	add x1,x1,#0x9f1
00a7d878	mov x0,x19
00a7d87c	bl 0x00c32250
00a7d880	cmp w0,#0x0
00a7d884	b.le 0x00a7d890
00a7d888	mov w0,#0x1
00a7d88c	b 0x00a7d894
00a7d890	mov w0,wzr
00a7d894	ldp x29,x30,[sp, #0x50]
00a7d898	ldp x20,x19,[sp, #0x40]
00a7d89c	ldp x22,x21,[sp, #0x30]
00a7d8a0	ldp x24,x23,[sp, #0x20]
00a7d8a4	ldp x26,x25,[sp, #0x10]
00a7d8a8	ldp x28,x27,[sp], #0x60
00a7d8ac	ret
