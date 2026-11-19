; LZ4_uncompress @ 008dd6b8
008dd6b8	stp x29,x30,[sp, #-0x50]!
008dd6bc	str x25,[sp, #0x10]
008dd6c0	stp x24,x23,[sp, #0x20]
008dd6c4	stp x22,x21,[sp, #0x30]
008dd6c8	stp x20,x19,[sp, #0x40]
008dd6cc	mov x29,sp
008dd6d0	add x24,x1,w2, SXTW 
008dd6d4	mov x21,x1
008dd6d8	mov x19,x0
008dd6dc	mov x20,x0
008dd6e0	mov x22,x1
008dd6e4	b 0x008dd6f8
008dd6e8	add x22,x8,x9
008dd6ec	sub x8,x24,x22
008dd6f0	cmp x8,#0x5
008dd6f4	b.cc 0x008dd850
008dd6f8	ldrb w25,[x20], #0x1
008dd6fc	lsr x23,x25,#0x4
008dd700	cmp w23,#0xf
008dd704	b.ne 0x008dd720
008dd708	mov x8,xzr
008dd70c	ldrb w9,[x20], #0x1
008dd710	cmp x9,#0xff
008dd714	add x8,x8,x9
008dd718	b.eq 0x008dd70c
008dd71c	add x23,x8,#0xf
008dd720	sub x8,x24,x22
008dd724	cmp x8,x23
008dd728	b.cc 0x008dd850
008dd72c	mov x0,x22
008dd730	mov x1,x20
008dd734	mov x2,x23
008dd738	bl 0x00c2ff60
008dd73c	add x8,x22,x23
008dd740	add x20,x20,x23
008dd744	sub x11,x24,x8
008dd748	cmp x11,#0xb
008dd74c	b.ls 0x008dd848
008dd750	and x10,x25,#0xf
008dd754	ldrh w13,[x20], #0x2
008dd758	cmp w10,#0xf
008dd75c	b.ne 0x008dd778
008dd760	mov x9,xzr
008dd764	ldrb w10,[x20], #0x1
008dd768	cmp x10,#0xff
008dd76c	add x9,x9,x10
008dd770	b.eq 0x008dd764
008dd774	add x10,x9,#0xf
008dd778	add x9,x10,#0x4
008dd77c	sub x12,x8,x21
008dd780	cmp x11,x9
008dd784	ccmp x12,x13,#0x0,cs
008dd788	b.cc 0x008dd850
008dd78c	cbz x9,0x008dd6e8
008dd790	mov x12,xzr
008dd794	cmp x9,#0x8
008dd798	neg x11,x13
008dd79c	b.cc 0x008dd824
008dd7a0	cmp w13,#0x20
008dd7a4	b.cc 0x008dd824
008dd7a8	cmp x9,#0x20
008dd7ac	b.cs 0x008dd7b8
008dd7b0	mov x12,xzr
008dd7b4	b 0x008dd7f8
008dd7b8	and x12,x9,#-0x20
008dd7bc	add x14,x22,#0x10
008dd7c0	sub x13,x23,x13
008dd7c4	add x13,x14,x13
008dd7c8	add x14,x14,x23
008dd7cc	mov x15,x12
008dd7d0	ldp q0,q1,[x13, #-0x10]
008dd7d4	subs x15,x15,#0x20
008dd7d8	add x13,x13,#0x20
008dd7dc	stp q0,q1,[x14, #-0x10]
008dd7e0	add x14,x14,#0x20
008dd7e4	b.ne 0x008dd7d0
008dd7e8	cmp x9,x12
008dd7ec	b.eq 0x008dd6e8
008dd7f0	tst x9,#0x18
008dd7f4	b.eq 0x008dd824
008dd7f8	mov x14,x12
008dd7fc	and x12,x9,#-0x8
008dd800	add x13,x14,x23
008dd804	sub x14,x14,x12
008dd808	add x13,x22,x13
008dd80c	ldr d0,[x13,x11]
008dd810	adds x14,x14,#0x8
008dd814	str d0,[x13], #0x8
008dd818	b.ne 0x008dd80c
008dd81c	cmp x9,x12
008dd820	b.eq 0x008dd6e8
008dd824	sub x10,x10,x12
008dd828	add x12,x12,x23
008dd82c	add x10,x10,#0x4
008dd830	add x12,x22,x12
008dd834	ldrb w13,[x12, x11]
008dd838	subs x10,x10,#0x1
008dd83c	strb w13,[x12], #0x1
008dd840	b.ne 0x008dd834
008dd844	b 0x008dd6e8
008dd848	cmp x8,x24
008dd84c	b.eq 0x008dd86c
008dd850	mov w0,#0xffffffff
008dd854	ldp x20,x19,[sp, #0x40]
008dd858	ldr x25,[sp, #0x10]
008dd85c	ldp x22,x21,[sp, #0x30]
008dd860	ldp x24,x23,[sp, #0x20]
008dd864	ldp x29,x30,[sp], #0x50
008dd868	ret
008dd86c	sub w0,w20,w19
008dd870	b 0x008dd854
