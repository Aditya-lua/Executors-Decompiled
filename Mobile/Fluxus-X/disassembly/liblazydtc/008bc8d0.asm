; FUN_008bc8d0 @ 008bc8d0
008bc8d0	stp x29,x30,[sp, #-0x60]!
008bc8d4	stp x28,x27,[sp, #0x10]
008bc8d8	stp x26,x25,[sp, #0x20]
008bc8dc	stp x24,x23,[sp, #0x30]
008bc8e0	stp x22,x21,[sp, #0x40]
008bc8e4	stp x20,x19,[sp, #0x50]
008bc8e8	mov x29,sp
008bc8ec	mov w28,#0x3700
008bc8f0	mov x22,x3
008bc8f4	mov x21,x2
008bc8f8	mov x19,x1
008bc8fc	mov x20,x0
008bc900	mov w25,#0xffffffff
008bc904	adrp x23,0xd1f000
008bc908	add x23,x23,#0xc90
008bc90c	adrp x27,0xd1f000
008bc910	movk w28,#0x7f, LSL #16
008bc914	mov w26,#0x1
008bc918	ldrb w8,[x19, #0x5]
008bc91c	ldr w9,[x22, #0x10]
008bc920	ldr x10,[x19, #0x28]
008bc924	lsl w8,w25,w8
008bc928	bic w8,w9,w8
008bc92c	add x24,x10,x8, LSL #0x5
008bc930	ldr w8,[x24, #0xc]
008bc934	cbnz w8,0x008bc950
008bc938	ldarb w8,[x23]
008bc93c	tbz w8,#0x0,0x008bca1c
008bc940	ldr x8,[x27, #0xc88]
008bc944	add x8,x8,x28
008bc948	cmp x24,x8
008bc94c	b.ne 0x008bca54
008bc950	ldr w8,[x19, #0xc]
008bc954	cmp w8,#0x1
008bc958	b.lt 0x008bc980
008bc95c	sub x8,x8,#0x1
008bc960	ldr x9,[x19, #0x28]
008bc964	mov w10,w8
008bc968	str w8,[x19, #0xc]
008bc96c	add x2,x9,x10, LSL #0x5
008bc970	ldrb w9,[x2, #0x1c]
008bc974	tst w9,#0xf
008bc978	b.ne 0x008bc954
008bc97c	b 0x008bca44
008bc980	ldrb w8,[x19, #0x5]
008bc984	ldr x9,[x19, #0x28]
008bc988	mov w11,wzr
008bc98c	lsl w10,w26,w8
008bc990	sxtw x10,w10
008bc994	cbz x8,0x008bc9e4
008bc998	add x14,x9,x10, LSL #0x5
008bc99c	and x13,x10,#-0x2
008bc9a0	mov w12,wzr
008bc9a4	and x8,x10,#0x1
008bc9a8	mov x15,x13
008bc9ac	sub x14,x14,#0x14
008bc9b0	ldr w16,[x14]
008bc9b4	ldur w17,[x14, #-0x20]
008bc9b8	sub x15,x15,#0x2
008bc9bc	sub x14,x14,#0x40
008bc9c0	cmp w16,#0x0
008bc9c4	cinc w11,w11,ne
008bc9c8	cmp w17,#0x0
008bc9cc	cinc w12,w12,ne
008bc9d0	cbnz x15,0x008bc9b0
008bc9d4	cmp x13,x10
008bc9d8	add w11,w12,w11
008bc9dc	b.ne 0x008bc9e8
008bc9e0	b 0x008bca04
008bc9e4	mov x8,x10
008bc9e8	add x9,x9,x8, LSL #0x5
008bc9ec	sub x9,x9,#0x14
008bc9f0	ldr w10,[x9], #-0x20
008bc9f4	sub x8,x8,#0x1
008bc9f8	cmp w10,#0x0
008bc9fc	cinc w11,w11,ne
008bca00	cbnz x8,0x008bc9f0
008bca04	ldr w2,[x19, #0x8]
008bca08	add w3,w11,#0x1
008bca0c	mov x0,x20
008bca10	mov x1,x19
008bca14	bl 0x008ba968
008bca18	b 0x008bc918
008bca1c	mov x0,x23
008bca20	bl 0x00c2fe90
008bca24	cbz w0,0x008bc940
008bca28	adrp x8,0xcca000
008bca2c	ldr x0,[x8, #0x8c8]
008bca30	bl 0x007fe1ec
008bca34	str x0,[x27, #0xc88]
008bca38	mov x0,x23
008bca3c	bl 0x00c2fea0
008bca40	b 0x008bc940
008bca44	mov x0,x19
008bca48	mov x1,x24
008bca4c	bl 0x008bda50
008bca50	mov x24,x0
008bca54	ldr x8,[x21]
008bca58	ldr w9,[x24, #0x1c]
008bca5c	str x8,[x24, #0x10]
008bca60	ldr w8,[x21, #0x8]
008bca64	str w8,[x24, #0x18]
008bca68	ldr w8,[x21, #0xc]
008bca6c	bfxil w9,w8,#0x0,#0x4
008bca70	str w9,[x24, #0x1c]
008bca74	ldr w8,[x21, #0xc]
008bca78	cmp w8,#0x5
008bca7c	b.lt 0x008bcaa4
008bca80	ldrb w8,[x19, #0x2]
008bca84	tbz w8,#0x2,0x008bcaa4
008bca88	ldr x2,[x21]
008bca8c	ldrb w8,[x2, #0x2]
008bca90	tst w8,#0x3
008bca94	b.eq 0x008bcaa4
008bca98	mov x0,x20
008bca9c	mov x1,x19
008bcaa0	bl 0x008b6370
008bcaa4	mov x0,x24
008bcaa8	ldp x20,x19,[sp, #0x50]
008bcaac	ldp x22,x21,[sp, #0x40]
008bcab0	ldp x24,x23,[sp, #0x30]
008bcab4	ldp x26,x25,[sp, #0x20]
008bcab8	ldp x28,x27,[sp, #0x10]
008bcabc	ldp x29,x30,[sp], #0x60
008bcac0	ret
