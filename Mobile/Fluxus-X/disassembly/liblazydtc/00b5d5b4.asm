; FUN_00b5d5b4 @ 00b5d5b4
00b5d5b4	sub sp,sp,#0x70
00b5d5b8	stp x22,x21,[sp, #0x40]
00b5d5bc	stp x20,x19,[sp, #0x50]
00b5d5c0	stp x29,x30,[sp, #0x60]
00b5d5c4	add x29,sp,#0x60
00b5d5c8	cbz x1,0x00b5d78c
00b5d5cc	mov x20,x0
00b5d5d0	mov x0,x1
00b5d5d4	mov x21,x2
00b5d5d8	mov x19,x1
00b5d5dc	bl 0x00c2ff50
00b5d5e0	cmp x0,#0x32
00b5d5e4	b.cc 0x00b5d610
00b5d5e8	bl 0x00c342a0
00b5d5ec	adrp x0,0x2aa000
00b5d5f0	adrp x2,0x2c6000
00b5d5f4	add x0,x0,#0xfdb
00b5d5f8	add x2,x2,#0x7a8
00b5d5fc	mov w1,#0xe4
00b5d600	bl 0x00c342b0
00b5d604	adrp x2,0x2ae000
00b5d608	add x2,x2,#0xbf7
00b5d60c	b 0x00b5d69c
00b5d610	cbnz x21,0x00b5d618
00b5d614	ldr x21,[x20, #0x8]
00b5d618	ldr x0,[x20]
00b5d61c	mov x1,x19
00b5d620	mov x2,x21
00b5d624	bl 0x00c357f0
00b5d628	cbz x0,0x00b5d678
00b5d62c	ldr w8,[x20, #0x168]
00b5d630	mov x21,x0
00b5d634	ldr x0,[x20]
00b5d638	mov x1,x21
00b5d63c	cmp w8,#0x10
00b5d640	cset w2,ne
00b5d644	bl 0x00c411b0
00b5d648	tbnz w0,#0x1f,0x00b5d6b4
00b5d64c	ldrb w8,[x20, #0x4a]
00b5d650	tbnz w8,#0x0,0x00b5d6f8
00b5d654	ldrb w8,[x20, #0x18]!
00b5d658	cbz w8,0x00b5d66c
00b5d65c	mov x0,x21
00b5d660	mov x1,x20
00b5d664	bl 0x00c34610
00b5d668	cbz w0,0x00b5d7a4
00b5d66c	mov x0,x21
00b5d670	bl 0x00c35800
00b5d674	b 0x00b5d78c
00b5d678	bl 0x00c342a0
00b5d67c	adrp x0,0x2aa000
00b5d680	adrp x2,0x2c6000
00b5d684	add x0,x0,#0xfdb
00b5d688	add x2,x2,#0x7a8
00b5d68c	mov w1,#0xec
00b5d690	bl 0x00c342b0
00b5d694	adrp x2,0x2bc000
00b5d698	add x2,x2,#0xa2d
00b5d69c	mov w0,#0x39
00b5d6a0	mov w1,#0x7a
00b5d6a4	mov x3,x19
00b5d6a8	bl 0x00c342c0
00b5d6ac	mov w0,wzr
00b5d6b0	b 0x00b5d790
00b5d6b4	bl 0x00c342a0
00b5d6b8	adrp x0,0x2aa000
00b5d6bc	adrp x2,0x2c6000
00b5d6c0	add x0,x0,#0xfdb
00b5d6c4	add x2,x2,#0x7a8
00b5d6c8	mov w1,#0xf4
00b5d6cc	bl 0x00c342b0
00b5d6d0	adrp x2,0x2ca000
00b5d6d4	add x2,x2,#0x826
00b5d6d8	mov w0,#0x39
00b5d6dc	mov w1,#0xae
00b5d6e0	mov x3,x19
00b5d6e4	bl 0x00c342c0
00b5d6e8	mov x0,x21
00b5d6ec	bl 0x00c35800
00b5d6f0	mov w0,wzr
00b5d6f4	b 0x00b5d790
00b5d6f8	mov w22,w0
00b5d6fc	ldr x0,[x20, #0x178]
00b5d700	bl 0x00c31f90
00b5d704	ldr x0,[x20, #0x170]
00b5d708	bl 0x00c35800
00b5d70c	add x1,x20,#0x4b
00b5d710	add x0,sp,#0x8
00b5d714	mov w2,#0x100
00b5d718	str xzr,[x20, #0x158]
00b5d71c	bl 0x00c3e870
00b5d720	cbz w0,0x00b5d760
00b5d724	ldr x2,[x20, #0x10]
00b5d728	add x0,sp,#0x8
00b5d72c	mov w1,#0xffffffff
00b5d730	mov w3,w22
00b5d734	bl 0x00c41840
00b5d738	cbz w0,0x00b5d760
00b5d73c	add x0,sp,#0x8
00b5d740	bl 0x00c34360
00b5d744	cbz w0,0x00b5d760
00b5d748	add x1,x20,#0x158
00b5d74c	add x0,sp,#0x8
00b5d750	bl 0x00c34370
00b5d754	add x0,sp,#0x8
00b5d758	bl 0x00c36c50
00b5d75c	str x0,[x20, #0x150]
00b5d760	add x0,sp,#0x8
00b5d764	bl 0x00c34340
00b5d768	mov x0,x21
00b5d76c	stp x21,xzr,[x20, #0x170]
00b5d770	bl 0x00c34c20
00b5d774	sxtw x8,w0
00b5d778	add x0,x20,#0x18
00b5d77c	mov w2,#0x32
00b5d780	mov x1,x19
00b5d784	str x8,[x20, #0x160]
00b5d788	bl 0x00c387f0
00b5d78c	mov w0,#0x1
00b5d790	ldp x29,x30,[sp, #0x60]
00b5d794	ldp x20,x19,[sp, #0x50]
00b5d798	ldp x22,x21,[sp, #0x40]
00b5d79c	add sp,sp,#0x70
00b5d7a0	ret
00b5d7a4	bl 0x00c342a0
00b5d7a8	adrp x0,0x2aa000
00b5d7ac	adrp x2,0x2c6000
00b5d7b0	add x0,x0,#0xfdb
00b5d7b4	add x2,x2,#0x7a8
00b5d7b8	orr w1,wzr,#0xfc
00b5d7bc	bl 0x00c342b0
00b5d7c0	adrp x2,0x2d0000
00b5d7c4	add x2,x2,#0x917
00b5d7c8	mov w0,#0x39
00b5d7cc	mov w1,#0xae
00b5d7d0	mov x3,x19
00b5d7d4	mov x4,x20
00b5d7d8	bl 0x00c342c0
00b5d7dc	b 0x00b5d6e8
