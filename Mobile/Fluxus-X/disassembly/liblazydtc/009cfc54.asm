; tls13_enc @ 009cfc54
009cfc54	sub sp,sp,#0xc0
009cfc58	stp x20,x19,[sp, #0xa0]
009cfc5c	cmp x2,#0x1
009cfc60	mov x19,x0
009cfc64	stp x28,x27,[sp, #0x60]
009cfc68	stp x26,x25,[sp, #0x70]
009cfc6c	stp x24,x23,[sp, #0x80]
009cfc70	stp x22,x21,[sp, #0x90]
009cfc74	stp x29,x30,[sp, #0xb0]
009cfc78	add x29,sp,#0xb0
009cfc7c	b.ne 0x009cfce8
009cfc80	cmp w3,#0x0
009cfc84	mov w11,#0x848
009cfc88	mov w12,#0x878
009cfc8c	csel x11,x12,x11,ne
009cfc90	ldr x22,[x19, x11#0x0]
009cfc94	mov w9,#0x1d00
009cfc98	mov w11,#0x1cf8
009cfc9c	add x8,x19,#0x880
009cfca0	add x10,x19,#0x850
009cfca4	add x9,x19,x9
009cfca8	add x11,x19,x11
009cfcac	mov w21,w3
009cfcb0	mov x20,x1
009cfcb4	csel x24,x8,x10,ne
009cfcb8	csel x27,x9,x11,ne
009cfcbc	cbz x22,0x009cfccc
009cfcc0	ldr w8,[x20, #0x4]
009cfcc4	cmp w8,#0x15
009cfcc8	b.ne 0x009cfd40
009cfccc	ldp x0,x1,[x20, #0x20]
009cfcd0	ldr x2,[x20, #0x8]
009cfcd4	bl 0x00c2ff60
009cfcd8	ldr x8,[x20, #0x20]
009cfcdc	str x8,[x20, #0x28]
009cfce0	mov w0,#0x1
009cfce4	b 0x009cfd20
009cfce8	bl 0x00c342a0
009cfcec	adrp x0,0x2a2000
009cfcf0	adrp x2,0x2a7000
009cfcf4	add x0,x0,#0x82
009cfcf8	add x2,x2,#0xbaa
009cfcfc	mov w1,#0x27
009cfd00	bl 0x00c342b0
009cfd04	mov w2,#0x103
009cfd08	mov w1,#0x50
009cfd0c	movk w2,#0xc, LSL #16
009cfd10	mov x0,x19
009cfd14	mov x3,xzr
009cfd18	bl 0x00c34410
009cfd1c	mov w0,wzr
009cfd20	ldp x29,x30,[sp, #0xb0]
009cfd24	ldp x20,x19,[sp, #0xa0]
009cfd28	ldp x22,x21,[sp, #0x90]
009cfd2c	ldp x24,x23,[sp, #0x80]
009cfd30	ldp x26,x25,[sp, #0x70]
009cfd34	ldp x28,x27,[sp, #0x60]
009cfd38	add sp,sp,#0xc0
009cfd3c	ret
009cfd40	mov x0,x22
009cfd44	bl 0x00c36300
009cfd48	mov w25,w0
009cfd4c	tbnz w0,#0x1f,0x009cfd88
009cfd50	ldr w8,[x19, #0x84]
009cfd54	sub w8,w8,#0x3
009cfd58	cmp w8,#0x1
009cfd5c	b.hi 0x009cfda4
009cfd60	ldr x8,[x19, #0x918]
009cfd64	cbz x8,0x009cfd70
009cfd68	ldr w9,[x8, #0x354]
009cfd6c	cbnz w9,0x009cfd80
009cfd70	ldr x8,[x19, #0x920]
009cfd74	cbz x8,0x009cfe78
009cfd78	ldr w9,[x8, #0x354]
009cfd7c	cbz w9,0x009cfe78
009cfd80	ldr x8,[x8, #0x2f8]
009cfd84	b 0x009cfdac
009cfd88	bl 0x00c342a0
009cfd8c	adrp x0,0x2a2000
009cfd90	adrp x2,0x2a7000
009cfd94	add x0,x0,#0x82
009cfd98	add x2,x2,#0xbaa
009cfd9c	mov w1,#0x43
009cfda0	b 0x009cfd00
009cfda4	ldr x8,[x19, #0x2e0]
009cfda8	cbz x8,0x009cfe5c
009cfdac	ldr w8,[x8, #0x24]
009cfdb0	ands w26,w8,#0x3c000
009cfdb4	b.eq 0x009cfe04
009cfdb8	tst w8,#0x30000
009cfdbc	mov w8,#0x8
009cfdc0	mov w9,#0x10
009cfdc4	csel x23,x9,x8,eq
009cfdc8	cbz w21,0x009cfe1c
009cfdcc	mov w1,#0x11
009cfdd0	mov x0,x22
009cfdd4	mov w2,w23
009cfdd8	mov x3,xzr
009cfddc	bl 0x00c361b0
009cfde0	cmp w0,#0x0
009cfde4	b.gt 0x009cfe38
009cfde8	bl 0x00c342a0
009cfdec	adrp x0,0x2a2000
009cfdf0	adrp x2,0x2a7000
009cfdf4	add x0,x0,#0x82
009cfdf8	add x2,x2,#0xbaa
009cfdfc	mov w1,#0x66
009cfe00	b 0x009cfd00
009cfe04	mov w9,#0x3000
009cfe08	movk w9,#0x8, LSL #16
009cfe0c	tst w8,w9
009cfe10	b.eq 0x009d007c
009cfe14	mov w23,#0x10
009cfe18	cbnz w21,0x009cfe38
009cfe1c	ldr x8,[x20, #0x8]
009cfe20	orr x9,x23,#0x1
009cfe24	mov w0,wzr
009cfe28	cmp x8,x9
009cfe2c	b.cc 0x009cfd20
009cfe30	sub x8,x8,x23
009cfe34	str x8,[x20, #0x8]
009cfe38	cmp w25,#0x7
009cfe3c	b.gt 0x009cfe94
009cfe40	bl 0x00c342a0
009cfe44	adrp x0,0x2a2000
009cfe48	adrp x2,0x2a7000
009cfe4c	add x0,x0,#0x82
009cfe50	add x2,x2,#0xbaa
009cfe54	orr w1,wzr,#0x7f
009cfe58	b 0x009cfd00
009cfe5c	bl 0x00c342a0
009cfe60	adrp x0,0x2a2000
009cfe64	adrp x2,0x2a7000
009cfe68	add x0,x0,#0x82
009cfe6c	add x2,x2,#0xbaa
009cfe70	mov w1,#0x59
009cfe74	b 0x009cfd00
009cfe78	bl 0x00c342a0
009cfe7c	adrp x0,0x2a2000
009cfe80	adrp x2,0x2a7000
009cfe84	add x0,x0,#0x82
009cfe88	add x2,x2,#0xbaa
009cfe8c	mov w1,#0x4e
009cfe90	b 0x009cfd00
009cfe94	sxtw x8,w25
009cfe98	sub x25,x8,#0x8
009cfe9c	add x0,sp,#0x50
009cfea0	mov x1,x24
009cfea4	mov x2,x25
009cfea8	add x28,sp,#0x50
009cfeac	bl 0x00c2ffd0
009cfeb0	ldr d0,[x24,x25]
009cfeb4	ldr d1,[x27]
009cfeb8	orr w8,wzr,#0x7
009cfebc	eor v0.8B,v1.8B,v0.8B
009cfec0	str d0,[x28,x25]
009cfec4	cmn x8,#0x1
009cfec8	b.eq 0x009cfd1c
009cfecc	ldrb w9,[x27, x8]
009cfed0	add w9,w9,#0x1
009cfed4	and w10,w9,#0xff
009cfed8	strb w9,[x27, x8]
009cfedc	sub x8,x8,#0x1
009cfee0	cbz w10,0x009cfec4
009cfee4	add x4,sp,#0x50
009cfee8	mov x0,x22
009cfeec	mov x1,xzr
009cfef0	mov x2,xzr
009cfef4	mov x3,xzr
009cfef8	mov w5,w21
009cfefc	bl 0x00c34be0
009cff00	cmp w0,#0x1
009cff04	b.lt 0x009d00d8
009cff08	cbnz w21,0x009cff30
009cff0c	ldr x8,[x20, #0x20]
009cff10	ldr x9,[x20, #0x8]
009cff14	mov w1,#0x11
009cff18	mov x0,x22
009cff1c	mov w2,w23
009cff20	add x3,x8,x9
009cff24	bl 0x00c361b0
009cff28	cmp w0,#0x0
009cff2c	b.le 0x009d00d8
009cff30	mov x0,sp
009cff34	add x1,sp,#0x48
009cff38	mov w2,#0x5
009cff3c	mov x3,xzr
009cff40	bl 0x00c34380
009cff44	cbz w0,0x009d0098
009cff48	ldrsw x1,[x20, #0x4]
009cff4c	mov x0,sp
009cff50	mov w2,#0x1
009cff54	bl 0x00c343a0
009cff58	cbz w0,0x009d0098
009cff5c	ldrsw x1,[x20]
009cff60	mov x0,sp
009cff64	mov w2,#0x2
009cff68	bl 0x00c343a0
009cff6c	cbz w0,0x009d0098
009cff70	ldr x8,[x20, #0x8]
009cff74	mov x0,sp
009cff78	mov w2,#0x2
009cff7c	add x1,x8,x23
009cff80	bl 0x00c343a0
009cff84	cbz w0,0x009d0098
009cff88	mov x0,sp
009cff8c	add x1,sp,#0x40
009cff90	bl 0x00c34370
009cff94	cbz w0,0x009d0098
009cff98	ldr x8,[sp, #0x40]
009cff9c	cmp x8,#0x5
009cffa0	b.ne 0x009d0098
009cffa4	mov x0,sp
009cffa8	bl 0x00c34360
009cffac	cbz w0,0x009d0098
009cffb0	cbz w26,0x009cffd4
009cffb4	ldr w4,[x20, #0x8]
009cffb8	add x2,sp,#0x3c
009cffbc	mov x0,x22
009cffc0	mov x1,xzr
009cffc4	mov x3,xzr
009cffc8	bl 0x00c36d70
009cffcc	cmp w0,#0x1
009cffd0	b.lt 0x009cfd1c
009cffd4	add x2,sp,#0x3c
009cffd8	add x3,sp,#0x48
009cffdc	mov w4,#0x5
009cffe0	mov x0,x22
009cffe4	mov x1,xzr
009cffe8	bl 0x00c36d70
009cffec	cmp w0,#0x1
009cfff0	b.lt 0x009cfd1c
009cfff4	ldp x1,x3,[x20, #0x20]
009cfff8	ldr w4,[x20, #0x8]
009cfffc	add x2,sp,#0x3c
009d0000	mov x0,x22
009d0004	bl 0x00c36d70
009d0008	cmp w0,#0x1
009d000c	b.lt 0x009cfd1c
009d0010	ldr x8,[x20, #0x20]
009d0014	ldrsw x9,[sp, #0x3c]
009d0018	add x2,sp,#0x38
009d001c	mov x0,x22
009d0020	add x1,x8,x9
009d0024	bl 0x00c36e20
009d0028	cmp w0,#0x1
009d002c	b.lt 0x009cfd1c
009d0030	ldpsw x8,x9,[sp, #0x38]
009d0034	ldr x10,[x20, #0x8]
009d0038	add x8,x8,x9
009d003c	cmp x10,x8
009d0040	cset w0,eq
009d0044	b.ne 0x009cfd20
009d0048	cbz w21,0x009cfd20
009d004c	ldr x9,[x20, #0x20]
009d0050	mov w1,#0x10
009d0054	mov x0,x22
009d0058	mov w2,w23
009d005c	add x3,x9,x8
009d0060	bl 0x00c361b0
009d0064	cmp w0,#0x0
009d0068	b.le 0x009d00f4
009d006c	ldr x8,[x20, #0x8]
009d0070	add x8,x8,x23
009d0074	str x8,[x20, #0x8]
009d0078	b 0x009cfce0
009d007c	bl 0x00c342a0
009d0080	adrp x0,0x2a2000
009d0084	adrp x2,0x2a7000
009d0088	add x0,x0,#0x82
009d008c	add x2,x2,#0xbaa
009d0090	mov w1,#0x6e
009d0094	b 0x009cfd00
009d0098	bl 0x00c342a0
009d009c	adrp x0,0x2a2000
009d00a0	adrp x2,0x2a7000
009d00a4	add x0,x0,#0x82
009d00a8	add x2,x2,#0xbaa
009d00ac	mov w1,#0xa2
009d00b0	bl 0x00c342b0
009d00b4	mov w2,#0x103
009d00b8	mov w1,#0x50
009d00bc	movk w2,#0xc, LSL #16
009d00c0	mov x0,x19
009d00c4	mov x3,xzr
009d00c8	bl 0x00c34410
009d00cc	mov x0,sp
009d00d0	bl 0x00c34340
009d00d4	b 0x009cfd1c
009d00d8	bl 0x00c342a0
009d00dc	adrp x0,0x2a2000
009d00e0	adrp x2,0x2a7000
009d00e4	add x0,x0,#0x82
009d00e8	add x2,x2,#0xbaa
009d00ec	mov w1,#0x96
009d00f0	b 0x009cfd00
009d00f4	bl 0x00c342a0
009d00f8	adrp x0,0x2a2000
009d00fc	adrp x2,0x2a7000
009d0100	add x0,x0,#0x82
009d0104	add x2,x2,#0xbaa
009d0108	mov w1,#0xba
009d010c	b 0x009cfd00
