; FUN_008bd784 @ 008bd784
008bd784	ldr w8,[x1, #0xc]
008bd788	cmp w8,#0x2
008bd78c	b.le 0x008bd7dc
008bd790	cmp w8,#0x5
008bd794	b.eq 0x008bd814
008bd798	cmp w8,#0x4
008bd79c	b.eq 0x008bd820
008bd7a0	cmp w8,#0x3
008bd7a4	b.ne 0x008bd7e8
008bd7a8	ldp w9,w8,[x1]
008bd7ac	mov w10,#0xe995
008bd7b0	movk w10,#0x5bd1, LSL #16
008bd7b4	and w8,w8,#0x7fffffff
008bd7b8	eor w9,w9,w8, LSR #0x12
008bd7bc	mul w9,w9,w10
008bd7c0	eor w8,w8,w9, LSR #0x16
008bd7c4	mul w8,w8,w10
008bd7c8	eor w9,w9,w8, LSR #0x11
008bd7cc	mul w9,w9,w10
008bd7d0	eor w8,w8,w9, LSR #0x13
008bd7d4	mul w8,w8,w10
008bd7d8	b 0x008bd87c
008bd7dc	cmp w8,#0x1
008bd7e0	b.eq 0x008bd878
008bd7e4	cmp w8,#0x2
008bd7e8	ldr w8,[x1]
008bd7ec	mov w9,#0xca6b
008bd7f0	movk w9,#0x85eb, LSL #16
008bd7f4	eor w8,w8,w8, LSR #0x10
008bd7f8	mul w8,w8,w9
008bd7fc	mov w9,#0xae35
008bd800	movk w9,#0xc2b2, LSL #16
008bd804	eor w8,w8,w8, LSR #0xd
008bd808	mul w8,w8,w9
008bd80c	eor w8,w8,w8, LSR #0x10
008bd810	b 0x008bd87c
008bd814	ldr x8,[x1]
008bd818	ldr w8,[x8, #0x10]
008bd81c	b 0x008bd87c
008bd820	movi v0.2S,#0x80, LSL #24
008bd824	ldur d1,[x1, #0x4]
008bd828	adrp x8,0x29a000
008bd82c	ldr w9,[x1]
008bd830	cmeq v0.2S,v1.2S,v0.2S
008bd834	bic v0.8B,v1.8B,v0.8B
008bd838	ushr v1.2S,v0.2S,#0x11
008bd83c	eor v0.8B,v1.8B,v0.8B
008bd840	ldr d1,[x8, #0x148]
008bd844	mov w8,#0x80000000
008bd848	cmp w9,w8
008bd84c	csel w8,wzr,w9,eq
008bd850	mov w9,#0xf45d
008bd854	mul v0.2S,v0.2S,v1.2S
008bd858	eor w8,w8,w8, LSR #0x11
008bd85c	movk w9,#0x466, LSL #16
008bd860	mul w8,w8,w9
008bd864	mov w9,v0.S[0x1]
008bd868	fmov w10,s0
008bd86c	eor w8,w10,w8
008bd870	eor w8,w8,w9
008bd874	b 0x008bd87c
008bd878	ldr w8,[x1]
008bd87c	ldrb w9,[x0, #0x5]
008bd880	mov w10,#0xffffffff
008bd884	lsl w9,w10,w9
008bd888	ldr x10,[x0, #0x28]
008bd88c	bic w8,w8,w9
008bd890	add x0,x10,x8, LSL #0x5
008bd894	ret
