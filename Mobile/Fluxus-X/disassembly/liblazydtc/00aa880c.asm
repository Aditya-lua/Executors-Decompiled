; CRYPTO_ccm128_tag @ 00aa880c
00aa880c	str x19,[sp, #-0x20]!
00aa8810	stp x29,x30,[sp, #0x10]
00aa8814	ldrb w8,[x0]
00aa8818	mov x19,x2
00aa881c	add x29,sp,#0x10
00aa8820	lsr w8,w8,#0x2
00aa8824	and w8,w8,#0xe
00aa8828	add w8,w8,#0x2
00aa882c	cmp x8,x2
00aa8830	mov x2,xzr
00aa8834	b.ne 0x00aa8850
00aa8838	add x8,x0,#0x10
00aa883c	mov x0,x1
00aa8840	mov x1,x8
00aa8844	mov x2,x19
00aa8848	bl 0x00c2ffd0
00aa884c	mov x2,x19
00aa8850	ldp x29,x30,[sp, #0x10]
00aa8854	mov x0,x2
00aa8858	ldr x19,[sp], #0x20
00aa885c	ret
