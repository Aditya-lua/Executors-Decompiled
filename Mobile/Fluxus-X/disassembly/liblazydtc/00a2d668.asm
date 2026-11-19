; BN_GF2m_mod_sqrt @ 00a2d668
00a2d668	stp x26,x25,[sp, #-0x50]!
00a2d66c	stp x24,x23,[sp, #0x10]
00a2d670	mov x23,x0
00a2d674	mov x0,x2
00a2d678	stp x22,x21,[sp, #0x20]
00a2d67c	stp x20,x19,[sp, #0x30]
00a2d680	stp x29,x30,[sp, #0x40]
00a2d684	add x29,sp,#0x40
00a2d688	mov x21,x3
00a2d68c	mov x25,x2
00a2d690	mov x22,x1
00a2d694	bl 0x00c322f0
00a2d698	add w26,w0,#0x1
00a2d69c	adrp x1,0x2d9000
00a2d6a0	mov w24,w0
00a2d6a4	sbfiz x0,x26,#0x2,#0x20
00a2d6a8	add x1,x1,#0xb49
00a2d6ac	mov w2,#0x3db
00a2d6b0	bl 0x00c32320
00a2d6b4	cbz x0,0x00a2d710
00a2d6b8	mov x19,x0
00a2d6bc	mov x0,x25
00a2d6c0	bl 0x00c369b0
00a2d6c4	mov w20,wzr
00a2d6c8	cbz w0,0x00a2d760
00a2d6cc	bl 0x00c342a0
00a2d6d0	adrp x0,0x2d9000
00a2d6d4	adrp x2,0x2bb000
00a2d6d8	add x0,x0,#0xb49
00a2d6dc	add x2,x2,#0xb32
00a2d6e0	mov w1,#0x3e2
00a2d6e4	bl 0x00c342b0
00a2d6e8	orr w0,wzr,#0x3
00a2d6ec	mov w1,#0x6a
00a2d6f0	mov x2,xzr
00a2d6f4	bl 0x00c342c0
00a2d6f8	adrp x1,0x2d9000
00a2d6fc	add x1,x1,#0xb49
00a2d700	mov w2,#0x3e8
00a2d704	mov x0,x19
00a2d708	bl 0x00c32310
00a2d70c	b 0x00a2d744
00a2d710	bl 0x00c342a0
00a2d714	adrp x0,0x2d9000
00a2d718	adrp x2,0x2bb000
00a2d71c	add x0,x0,#0xb49
00a2d720	add x2,x2,#0xb32
00a2d724	mov w1,#0x3dd
00a2d728	bl 0x00c342b0
00a2d72c	mov w1,#0x100
00a2d730	orr w0,wzr,#0x3
00a2d734	movk w1,#0xc, LSL #16
00a2d738	mov x2,xzr
00a2d73c	bl 0x00c342c0
00a2d740	mov w20,wzr
00a2d744	mov w0,w20
00a2d748	ldp x29,x30,[sp, #0x40]
00a2d74c	ldp x20,x19,[sp, #0x30]
00a2d750	ldp x22,x21,[sp, #0x20]
00a2d754	ldp x24,x23,[sp, #0x10]
00a2d758	ldp x26,x25,[sp], #0x50
00a2d75c	ret
00a2d760	ldrsw x8,[x25, #0x8]
00a2d764	cmp w8,#0x1
00a2d768	b.lt 0x00a2d804
00a2d76c	ldr x9,[x25]
00a2d770	mov w20,wzr
00a2d774	lsl w10,w8,#0x6
00a2d778	sub x11,x8,#0x1
00a2d77c	ldr x12,[x9, x11, LSL #0x3]
00a2d780	cbz x12,0x00a2d7b8
00a2d784	orr x13,xzr,#-0x8000000000000000
00a2d788	mov w14,#0xffffffff
00a2d78c	tst x13,x12
00a2d790	b.eq 0x00a2d7a8
00a2d794	cmp w20,w24
00a2d798	b.gt 0x00a2d7a4
00a2d79c	add w15,w10,w14
00a2d7a0	str w15,[x19, w20, SXTW #0x2]
00a2d7a4	add w20,w20,#0x1
00a2d7a8	sub w14,w14,#0x1
00a2d7ac	cmn w14,#0x41
00a2d7b0	lsr x13,x13,#0x1
00a2d7b4	b.ne 0x00a2d78c
00a2d7b8	cmp x8,#0x1
00a2d7bc	sub w10,w10,#0x40
00a2d7c0	mov x8,x11
00a2d7c4	b.gt 0x00a2d778
00a2d7c8	cmp w20,w24
00a2d7cc	b.gt 0x00a2d7dc
00a2d7d0	mov w8,#0xffffffff
00a2d7d4	str w8,[x19, w20, SXTW #0x2]
00a2d7d8	add w20,w20,#0x1
00a2d7dc	cbz w20,0x00a2d6cc
00a2d7e0	cmp w20,w26
00a2d7e4	b.gt 0x00a2d6cc
00a2d7e8	mov x0,x23
00a2d7ec	mov x1,x22
00a2d7f0	mov x2,x19
00a2d7f4	mov x3,x21
00a2d7f8	bl 0x00a2d5c0
00a2d7fc	mov w20,w0
00a2d800	b 0x00a2d6f8
00a2d804	mov w20,wzr
00a2d808	cmp w20,w24
00a2d80c	b.le 0x00a2d7d0
00a2d810	b 0x00a2d7dc
