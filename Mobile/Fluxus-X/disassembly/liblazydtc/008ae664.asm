; FUN_008ae664 @ 008ae664
008ae664	stp x29,x30,[sp, #-0x40]!
008ae668	str x23,[sp, #0x10]
008ae66c	stp x22,x21,[sp, #0x20]
008ae670	stp x20,x19,[sp, #0x30]
008ae674	mov x29,sp
008ae678	ldr x23,[x0, #0x60]
008ae67c	mov x19,x0
008ae680	cmp w1,#0x1
008ae684	b.lt 0x008ae6c8
008ae688	ldp x9,x8,[x19, #0x68]
008ae68c	add x8,x8,w1, UXTW  #0x4
008ae690	sub x20,x8,#0x10
008ae694	cmp x20,x9
008ae698	b.cc 0x008ae6dc
008ae69c	adrp x8,0xd1f000
008ae6a0	add x8,x8,#0x1e0
008ae6a4	adrp x20,0xd1f000
008ae6a8	ldarb w8,[x8]
008ae6ac	tbz w8,#0x0,0x008ae79c
008ae6b0	ldr x8,[x20, #0x1d8]
008ae6b4	add x8,x8,#0x7f2, LSL #12
008ae6b8	add x20,x8,#0xef0
008ae6bc	ldr w8,[x20, #0xc]
008ae6c0	cbnz w8,0x008ae6e4
008ae6c4	b 0x008ae780
008ae6c8	mov w8,#0xffffd8f1
008ae6cc	cmp w1,w8
008ae6d0	b.lt 0x008ae76c
008ae6d4	ldr x8,[x19, #0x68]
008ae6d8	add x20,x8,w1, SXTW  #0x4
008ae6dc	ldr w8,[x20, #0xc]
008ae6e0	cbz w8,0x008ae780
008ae6e4	ldr x8,[x19, #0x60]
008ae6e8	ldr w9,[x23, #0x630]
008ae6ec	ldr x22,[x8, #0x620]
008ae6f0	ands w21,w9,#0xfffffff
008ae6f4	b.ne 0x008ae704
008ae6f8	mov x0,x22
008ae6fc	bl 0x008bcf64
008ae700	add w21,w0,#0x1
008ae704	mov x0,x19
008ae708	mov x1,x22
008ae70c	mov w2,w21
008ae710	bl 0x008bcd04
008ae714	ldr w8,[x23, #0x630]
008ae718	tst w8,#0xfffffff
008ae71c	b.eq 0x008ae730
008ae720	ldr d0,[x0]
008ae724	fcvtzs w9,d0
008ae728	bfxil w8,w9,#0x0,#0x1c
008ae72c	str w8,[x23, #0x630]
008ae730	ldr q0,[x20]
008ae734	str q0,[x0]
008ae738	ldr w8,[x20, #0xc]
008ae73c	cmp w8,#0x5
008ae740	b.lt 0x008ae784
008ae744	ldrb w8,[x22, #0x2]
008ae748	tbz w8,#0x2,0x008ae784
008ae74c	ldr x2,[x20]
008ae750	ldrb w8,[x2, #0x2]
008ae754	tst w8,#0x3
008ae758	b.eq 0x008ae784
008ae75c	mov x0,x19
008ae760	mov x1,x22
008ae764	bl 0x008b6370
008ae768	b 0x008ae784
008ae76c	mov x0,x19
008ae770	bl 0x008aea7c
008ae774	mov x20,x0
008ae778	ldr w8,[x20, #0xc]
008ae77c	cbnz w8,0x008ae6e4
008ae780	mov w21,wzr
008ae784	mov w0,w21
008ae788	ldp x20,x19,[sp, #0x30]
008ae78c	ldr x23,[sp, #0x10]
008ae790	ldp x22,x21,[sp, #0x20]
008ae794	ldp x29,x30,[sp], #0x40
008ae798	ret
008ae79c	adrp x0,0xd1f000
008ae7a0	add x0,x0,#0x1e0
008ae7a4	bl 0x00c2fe90
008ae7a8	cbz w0,0x008ae6b0
008ae7ac	adrp x8,0xcca000
008ae7b0	ldr x0,[x8, #0x8c8]
008ae7b4	bl 0x007fe1ec
008ae7b8	str x0,[x20, #0x1d8]
008ae7bc	adrp x0,0xd1f000
008ae7c0	add x0,x0,#0x1e0
008ae7c4	bl 0x00c2fea0
008ae7c8	b 0x008ae6b0
