; mbedtls_psa_hash_setup @ 00b9d6e8
00b9d6e8	str x21,[sp, #-0x30]!
00b9d6ec	stp x20,x19,[sp, #0x10]
00b9d6f0	stp x29,x30,[sp, #0x20]
00b9d6f4	add x29,sp,#0x20
00b9d6f8	ldr w8,[x0]
00b9d6fc	mov x19,x0
00b9d700	mov w20,w1
00b9d704	cbz w8,0x00b9d71c
00b9d708	mov w0,#0xffffff77
00b9d70c	ldp x29,x30,[sp, #0x20]
00b9d710	ldp x20,x19,[sp, #0x10]
00b9d714	ldr x21,[sp], #0x30
00b9d718	ret
00b9d71c	mov w8,#0xfffd
00b9d720	movk w8,#0xfdff, LSL #16
00b9d724	add w8,w20,w8
00b9d728	cmp w8,#0x10
00b9d72c	b.hi 0x00b9d7a4
00b9d730	adrp x9,0x787000
00b9d734	add x9,x9,#0x56c
00b9d738	ldrsw x8,[x9, x8, LSL #0x2]
00b9d73c	add x8,x8,x9
00b9d740	br x8
00b9d744	add x21,x19,#0x8
00b9d748	mov x0,x21
00b9d74c	bl 0x00c42920
00b9d750	mov x0,x21
00b9d754	bl 0x00c42930
00b9d758	mov w21,w0
00b9d75c	cbnz w0,0x00b9d894
00b9d760	b 0x00b9d830
00b9d764	add x21,x19,#0x8
00b9d768	mov x0,x21
00b9d76c	bl 0x00c429d0
00b9d770	mov x0,x21
00b9d774	bl 0x00c429e0
00b9d778	mov w21,w0
00b9d77c	cbnz w0,0x00b9d894
00b9d780	b 0x00b9d830
00b9d784	add x21,x19,#0x8
00b9d788	mov x0,x21
00b9d78c	bl 0x00c42a40
00b9d790	mov x0,x21
00b9d794	bl 0x00c42a50
00b9d798	mov w21,w0
00b9d79c	cbnz w0,0x00b9d894
00b9d7a0	b 0x00b9d830
00b9d7a4	and w8,w20,#0x7f000000
00b9d7a8	mov w9,#0x2000000
00b9d7ac	cmp w8,w9
00b9d7b0	mov w8,#0xffffff79
00b9d7b4	cinc w0,w8,eq
00b9d7b8	b 0x00b9d70c
00b9d7bc	add x21,x19,#0x8
00b9d7c0	mov x0,x21
00b9d7c4	bl 0x00c42ab0
00b9d7c8	mov w1,#0x1
00b9d7cc	mov x0,x21
00b9d7d0	b 0x00b9d7e8
00b9d7d4	add x21,x19,#0x8
00b9d7d8	mov x0,x21
00b9d7dc	bl 0x00c42ab0
00b9d7e0	mov x0,x21
00b9d7e4	mov w1,wzr
00b9d7e8	bl 0x00c42ac0
00b9d7ec	mov w21,w0
00b9d7f0	cbnz w0,0x00b9d894
00b9d7f4	b 0x00b9d830
00b9d7f8	add x21,x19,#0x8
00b9d7fc	mov x0,x21
00b9d800	bl 0x00c42b80
00b9d804	mov w1,#0x1
00b9d808	mov x0,x21
00b9d80c	b 0x00b9d824
00b9d810	add x21,x19,#0x8
00b9d814	mov x0,x21
00b9d818	bl 0x00c42b80
00b9d81c	mov x0,x21
00b9d820	mov w1,wzr
00b9d824	bl 0x00c42b90
00b9d828	mov w21,w0
00b9d82c	cbnz w0,0x00b9d894
00b9d830	str w20,[x19]
00b9d834	b 0x00b9d89c
00b9d838	add x21,x19,#0x8
00b9d83c	mov x0,x21
00b9d840	bl 0x00c42b10
00b9d844	mov w1,#0x1
00b9d848	b 0x00b9d884
00b9d84c	add x21,x19,#0x8
00b9d850	mov x0,x21
00b9d854	bl 0x00c42b10
00b9d858	mov w1,#0x2
00b9d85c	b 0x00b9d884
00b9d860	add x21,x19,#0x8
00b9d864	mov x0,x21
00b9d868	bl 0x00c42b10
00b9d86c	orr w1,wzr,#0x3
00b9d870	b 0x00b9d884
00b9d874	add x21,x19,#0x8
00b9d878	mov x0,x21
00b9d87c	bl 0x00c42b10
00b9d880	mov w1,#0x4
00b9d884	mov x0,x21
00b9d888	bl 0x00c42b20
00b9d88c	mov w21,w0
00b9d890	cbz w0,0x00b9d830
00b9d894	mov x0,x19
00b9d898	bl 0x00c42fe0
00b9d89c	ldp x29,x30,[sp, #0x20]
00b9d8a0	ldp x20,x19,[sp, #0x10]
00b9d8a4	mov w0,w21
00b9d8a8	ldr x21,[sp], #0x30
00b9d8ac	b 0x00c42bf0
