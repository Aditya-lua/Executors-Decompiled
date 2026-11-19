; FUN_008bc688 @ 008bc688
008bc688	sub sp,sp,#0x80
008bc68c	stp d9,d8,[sp, #0x10]
008bc690	stp x29,x30,[sp, #0x20]
008bc694	stp x28,x27,[sp, #0x30]
008bc698	stp x26,x25,[sp, #0x40]
008bc69c	stp x24,x23,[sp, #0x50]
008bc6a0	stp x22,x21,[sp, #0x60]
008bc6a4	stp x20,x19,[sp, #0x70]
008bc6a8	add x29,sp,#0x20
008bc6ac	movi v8.2S,#0x80, LSL #24
008bc6b0	adrp x8,0x29a000
008bc6b4	mov w25,#0xf45d
008bc6b8	ldr d9,[x8, #0x148]
008bc6bc	mov w27,#0x3700
008bc6c0	mov x21,x3
008bc6c4	mov x19,x2
008bc6c8	mov x20,x1
008bc6cc	mov x22,x0
008bc6d0	mov w24,#0x80000000
008bc6d4	movk w25,#0x466, LSL #16
008bc6d8	mov w26,#0xffffffff
008bc6dc	adrp x23,0xd1f000
008bc6e0	add x23,x23,#0xc90
008bc6e4	movk w27,#0x7f, LSL #16
008bc6e8	mov w28,#0x1
008bc6ec	ldur d0,[x21, #0x4]
008bc6f0	ldr w8,[x21]
008bc6f4	ldrb w10,[x20, #0x5]
008bc6f8	cmeq v1.2S,v0.2S,v8.2S
008bc6fc	cmp w8,w24
008bc700	lsl w10,w26,w10
008bc704	csel w8,wzr,w8,eq
008bc708	eor w8,w8,w8, LSR #0x11
008bc70c	bic v0.8B,v0.8B,v1.8B
008bc710	mul w8,w8,w25
008bc714	ushr v1.2S,v0.2S,#0x11
008bc718	eor v0.8B,v1.8B,v0.8B
008bc71c	mul v0.2S,v0.2S,v9.2S
008bc720	mov w9,v0.S[0x1]
008bc724	fmov w11,s0
008bc728	eor w8,w11,w8
008bc72c	eor w8,w8,w9
008bc730	ldr x9,[x20, #0x28]
008bc734	bic w8,w8,w10
008bc738	add x1,x9,x8, LSL #0x5
008bc73c	ldr w8,[x1, #0xc]
008bc740	cbnz w8,0x008bc760
008bc744	ldarb w8,[x23]
008bc748	tbz w8,#0x0,0x008bc82c
008bc74c	adrp x8,0xd1f000
008bc750	ldr x8,[x8, #0xc88]
008bc754	add x8,x8,x27
008bc758	cmp x1,x8
008bc75c	b.ne 0x008bc870
008bc760	ldr w8,[x20, #0xc]
008bc764	cmp w8,#0x1
008bc768	b.lt 0x008bc790
008bc76c	sub x8,x8,#0x1
008bc770	ldr x9,[x20, #0x28]
008bc774	mov w10,w8
008bc778	str w8,[x20, #0xc]
008bc77c	add x2,x9,x10, LSL #0x5
008bc780	ldrb w9,[x2, #0x1c]
008bc784	tst w9,#0xf
008bc788	b.ne 0x008bc764
008bc78c	b 0x008bc864
008bc790	ldrb w8,[x20, #0x5]
008bc794	ldr x9,[x20, #0x28]
008bc798	mov w11,wzr
008bc79c	lsl w10,w28,w8
008bc7a0	sxtw x10,w10
008bc7a4	cbz x8,0x008bc7f4
008bc7a8	add x14,x9,x10, LSL #0x5
008bc7ac	and x13,x10,#-0x2
008bc7b0	mov w12,wzr
008bc7b4	and x8,x10,#0x1
008bc7b8	mov x15,x13
008bc7bc	sub x14,x14,#0x14
008bc7c0	ldr w16,[x14]
008bc7c4	ldur w17,[x14, #-0x20]
008bc7c8	sub x15,x15,#0x2
008bc7cc	sub x14,x14,#0x40
008bc7d0	cmp w16,#0x0
008bc7d4	cinc w11,w11,ne
008bc7d8	cmp w17,#0x0
008bc7dc	cinc w12,w12,ne
008bc7e0	cbnz x15,0x008bc7c0
008bc7e4	cmp x13,x10
008bc7e8	add w11,w12,w11
008bc7ec	b.ne 0x008bc7f8
008bc7f0	b 0x008bc814
008bc7f4	mov x8,x10
008bc7f8	add x9,x9,x8, LSL #0x5
008bc7fc	sub x9,x9,#0x14
008bc800	ldr w10,[x9], #-0x20
008bc804	sub x8,x8,#0x1
008bc808	cmp w10,#0x0
008bc80c	cinc w11,w11,ne
008bc810	cbnz x8,0x008bc800
008bc814	ldr w2,[x20, #0x8]
008bc818	add w3,w11,#0x1
008bc81c	mov x0,x22
008bc820	mov x1,x20
008bc824	bl 0x008ba968
008bc828	b 0x008bc6ec
008bc82c	mov x0,x23
008bc830	str x1,[sp, #0x8]
008bc834	bl 0x00c2fe90
008bc838	ldr x1,[sp, #0x8]
008bc83c	cbz w0,0x008bc74c
008bc840	adrp x8,0xcca000
008bc844	ldr x0,[x8, #0x8c8]
008bc848	bl 0x007fe1ec
008bc84c	adrp x8,0xd1f000
008bc850	str x0,[x8, #0xc88]
008bc854	mov x0,x23
008bc858	bl 0x00c2fea0
008bc85c	ldr x1,[sp, #0x8]
008bc860	b 0x008bc74c
008bc864	mov x0,x20
008bc868	bl 0x008bda50
008bc86c	mov x1,x0
008bc870	ldr x8,[x19]
008bc874	ldr w9,[x1, #0x1c]
008bc878	mov x0,x1
008bc87c	str x8,[x1, #0x10]
008bc880	ldr w8,[x19, #0x8]
008bc884	str w8,[x1, #0x18]
008bc888	ldr w8,[x19, #0xc]
008bc88c	bfxil w9,w8,#0x0,#0x4
008bc890	str w9,[x1, #0x1c]
008bc894	ldp x20,x19,[sp, #0x70]
008bc898	ldp x22,x21,[sp, #0x60]
008bc89c	ldp x24,x23,[sp, #0x50]
008bc8a0	ldp x26,x25,[sp, #0x40]
008bc8a4	ldp x28,x27,[sp, #0x30]
008bc8a8	ldp x29,x30,[sp, #0x20]
008bc8ac	ldp d9,d8,[sp, #0x10]
008bc8b0	add sp,sp,#0x80
008bc8b4	ret
