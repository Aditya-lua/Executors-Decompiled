; tls1_change_cipher_state @ 009bfbec
009bfbec	sub sp,sp,#0x80
009bfbf0	stp x28,x27,[sp, #0x20]
009bfbf4	stp x26,x25,[sp, #0x30]
009bfbf8	stp x24,x23,[sp, #0x40]
009bfbfc	stp x22,x21,[sp, #0x50]
009bfc00	stp x20,x19,[sp, #0x60]
009bfc04	stp x29,x30,[sp, #0x70]
009bfc08	ldr x20,[x0, #0x320]
009bfc0c	ldr x28,[x0, #0x328]
009bfc10	ldr w24,[x0, #0x330]
009bfc14	ldr x21,[x0, #0x340]
009bfc18	mov x19,x0
009bfc1c	mov w23,w1
009bfc20	add x29,sp,#0x70
009bfc24	tbnz w1,#0x0,0x009bfcb4
009bfc28	ldr w9,[x19, #0xb2c]
009bfc2c	ldr x10,[x19, #0xa8]
009bfc30	mov w8,#0x1
009bfc34	str w8,[x19, #0x7c]
009bfc38	ldr x8,[x19, #0x2e0]
009bfc3c	cmp w9,#0x0
009bfc40	and x9,x10,#-0x401
009bfc44	orr x10,x10,#0x400
009bfc48	csel x9,x9,x10,eq
009bfc4c	str x9,[x19, #0xa8]
009bfc50	ldr w10,[x19, #0x540]
009bfc54	ldr w8,[x8, #0x40]
009bfc58	ldr x22,[x19, #0x878]
009bfc5c	and w9,w10,#0xfffffffd
009bfc60	orr w10,w10,#0x2
009bfc64	tst w8,#0x10000
009bfc68	csel w9,w9,w10,eq
009bfc6c	tst w8,#0x20000
009bfc70	and w8,w9,#0xfffffff7
009bfc74	orr w9,w9,#0x8
009bfc78	csel w8,w8,w9,eq
009bfc7c	str w8,[x19, #0x540]
009bfc80	cbz x22,0x009bfd10
009bfc84	mov x27,x19
009bfc88	ldr x8,[x27, #0x8]!
009bfc8c	ldr x8,[x8, #0xc0]
009bfc90	ldr w8,[x8, #0x60]
009bfc94	tbnz w8,#0x3,0x009bfd10
009bfc98	mov w25,#0x1
009bfc9c	tbz w8,#0x3,0x009bfd38
009bfca0	bl 0x00c31fa0
009bfca4	cbz x0,0x009bff7c
009bfca8	mov x26,x0
009bfcac	str x0,[x19, #0x890]
009bfcb0	b 0x009bfd4c
009bfcb4	ldr w8,[x19, #0xb2c]
009bfcb8	ldr x9,[x19, #0xa8]
009bfcbc	ldr x10,[x19, #0x2e0]
009bfcc0	ldr x22,[x19, #0x848]
009bfcc4	cmp w8,#0x0
009bfcc8	and x8,x9,#-0x101
009bfccc	orr x9,x9,#0x100
009bfcd0	csel x8,x8,x9,eq
009bfcd4	str x8,[x19, #0xa8]
009bfcd8	ldr w9,[x19, #0x540]
009bfcdc	ldr w8,[x10, #0x40]
009bfce0	and w10,w9,#0xfffffffe
009bfce4	orr w9,w9,#0x1
009bfce8	tst w8,#0x10000
009bfcec	csel w9,w10,w9,eq
009bfcf0	tst w8,#0x20000
009bfcf4	and w8,w9,#0xfffffffb
009bfcf8	orr w9,w9,#0x4
009bfcfc	csel w8,w8,w9,eq
009bfd00	str w8,[x19, #0x540]
009bfd04	cbz x22,0x009bfd9c
009bfd08	mov w25,#0x1
009bfd0c	b 0x009bfdb4
009bfd10	bl 0x00c34b90
009bfd14	str x0,[x19, #0x878]
009bfd18	cbz x0,0x009bfe78
009bfd1c	mov x27,x19
009bfd20	ldr x8,[x27, #0x8]!
009bfd24	mov x22,x0
009bfd28	mov w25,wzr
009bfd2c	ldr x8,[x8, #0xc0]
009bfd30	ldr w8,[x8, #0x60]
009bfd34	tbnz w8,#0x3,0x009bfca0
009bfd38	add x0,x19,#0x890
009bfd3c	mov x1,xzr
009bfd40	bl 0x00c34cb0
009bfd44	mov x26,x0
009bfd48	cbz x0,0x009bff98
009bfd4c	ldr x0,[x19, #0x868]
009bfd50	bl 0x00c34b60
009bfd54	str xzr,[x19, #0x868]
009bfd58	cbz x21,0x009bfd6c
009bfd5c	ldr x0,[x21, #0x10]
009bfd60	bl 0x00c34b70
009bfd64	str x0,[x19, #0x868]
009bfd68	cbz x0,0x009bffe4
009bfd6c	ldr x8,[x27]
009bfd70	ldr x8,[x8, #0xc0]
009bfd74	ldrb w8,[x8, #0x60]
009bfd78	tbnz w8,#0x3,0x009bfd84
009bfd7c	add x0,x19,#0xc58
009bfd80	bl 0x00c34c70
009bfd84	add x8,x19,#0x100
009bfd88	add x21,x19,#0xf8
009bfd8c	str x8,[sp, #0x18]
009bfd90	str x28,[sp, #0x10]
009bfd94	cbnz w25,0x009bfe14
009bfd98	b 0x009bfe1c
009bfd9c	bl 0x00c34b90
009bfda0	str x0,[x19, #0x848]
009bfda4	cbz x0,0x009bff60
009bfda8	bl 0x00c34ba0
009bfdac	ldr x22,[x19, #0x848]
009bfdb0	mov w25,wzr
009bfdb4	add x0,x19,#0x860
009bfdb8	mov x1,xzr
009bfdbc	bl 0x00c34cb0
009bfdc0	cbz x0,0x009bfe5c
009bfdc4	mov x26,x0
009bfdc8	ldr x0,[x19, #0x870]
009bfdcc	bl 0x00c34b60
009bfdd0	str xzr,[x19, #0x870]
009bfdd4	cbz x21,0x009bfde8
009bfdd8	ldr x0,[x21, #0x10]
009bfddc	bl 0x00c34b70
009bfde0	str x0,[x19, #0x870]
009bfde4	cbz x0,0x009bffc8
009bfde8	ldr x8,[x19, #0x8]
009bfdec	ldr x8,[x8, #0xc0]
009bfdf0	ldrb w8,[x8, #0x60]
009bfdf4	tbnz w8,#0x3,0x009bfe00
009bfdf8	add x0,x19,#0xc58
009bfdfc	bl 0x00c34c60
009bfe00	add x8,x19,#0xb8
009bfe04	str x8,[sp, #0x18]
009bfe08	add x21,x19,#0xb0
009bfe0c	str x28,[sp, #0x10]
009bfe10	cbz w25,0x009bfe1c
009bfe14	mov x0,x22
009bfe18	bl 0x00c34ba0
009bfe1c	ldr x28,[x19, #0x338]
009bfe20	ldr x25,[x19, #0x318]
009bfe24	mov x0,x20
009bfe28	str x28,[x21]
009bfe2c	bl 0x00c34bd0
009bfe30	mov w27,w0
009bfe34	mov x0,x20
009bfe38	bl 0x00c35290
009bfe3c	cmp w0,#0x6
009bfe40	b.eq 0x009bfe54
009bfe44	mov x0,x20
009bfe48	bl 0x00c35290
009bfe4c	cmp w0,#0x7
009bfe50	b.ne 0x009bfe94
009bfe54	mov w0,#0x4
009bfe58	b 0x009bfe9c
009bfe5c	bl 0x00c342a0
009bfe60	adrp x0,0x2d7000
009bfe64	adrp x2,0x2b3000
009bfe68	add x0,x0,#0xa4c
009bfe6c	add x2,x2,#0xe88
009bfe70	mov w1,#0xfa
009bfe74	b 0x009c01d0
009bfe78	bl 0x00c342a0
009bfe7c	adrp x0,0x2d7000
009bfe80	adrp x2,0x2b3000
009bfe84	add x0,x0,#0xa4c
009bfe88	add x2,x2,#0xe88
009bfe8c	mov w1,#0x123
009bfe90	b 0x009bffb0
009bfe94	mov x0,x20
009bfe98	bl 0x00c34bc0
009bfe9c	sxtw x8,w27
009bfea0	cmp w23,#0x21
009bfea4	sxtw x10,w0
009bfea8	str x21,[sp, #0x8]
009bfeac	b.eq 0x009bfeb8
009bfeb0	cmp w23,#0x12
009bfeb4	b.ne 0x009bfecc
009bfeb8	lsl x21,x28,#0x1
009bfebc	add x27,x21,x8, LSL #0x1
009bfec0	add x8,x27,x10, LSL #0x1
009bfec4	mov x1,x25
009bfec8	b 0x009bfee0
009bfecc	add x21,x8,x28, LSL #0x1
009bfed0	add x8,x21,x8
009bfed4	add x27,x8,x10
009bfed8	add x1,x25,x28
009bfedc	add x8,x27,x10
009bfee0	ldr x9,[x19, #0x310]
009bfee4	cmp x8,x9
009bfee8	b.ls 0x009bff08
009bfeec	bl 0x00c342a0
009bfef0	adrp x0,0x2d7000
009bfef4	adrp x2,0x2b3000
009bfef8	add x0,x0,#0xa4c
009bfefc	add x2,x2,#0xe88
009bff00	mov w1,#0x166
009bff04	b 0x009c01d0
009bff08	ldr x0,[sp, #0x18]
009bff0c	mov x2,x28
009bff10	str x10,[sp]
009bff14	bl 0x00c2ffd0
009bff18	mov x0,x20
009bff1c	bl 0x00c35280
009bff20	ldr x28,[sp, #0x10]
009bff24	tbnz w0,#0x15,0x009c0068
009bff28	cmp w24,#0x357
009bff2c	b.ne 0x009c000c
009bff30	ldr x8,[x19, #0x9a8]
009bff34	ldr x3,[sp, #0x18]
009bff38	adrp x1,0x2c3000
009bff3c	add x1,x1,#0x5d3
009bff40	ldr x0,[x8]
009bff44	ldr x2,[x8, #0x440]
009bff48	ldr x8,[sp, #0x8]
009bff4c	ldr x4,[x8]
009bff50	bl 0x00c36250
009bff54	mov x24,x0
009bff58	cbnz x0,0x009c002c
009bff5c	b 0x009c01b0
009bff60	bl 0x00c342a0
009bff64	adrp x0,0x2d7000
009bff68	adrp x2,0x2b3000
009bff6c	add x0,x0,#0xa4c
009bff70	add x2,x2,#0xe88
009bff74	mov w1,#0xef
009bff78	b 0x009bffb0
009bff7c	bl 0x00c342a0
009bff80	adrp x0,0x2d7000
009bff84	adrp x2,0x2b3000
009bff88	add x0,x0,#0xa4c
009bff8c	add x2,x2,#0xe88
009bff90	mov w1,#0x12a
009bff94	b 0x009bffb0
009bff98	bl 0x00c342a0
009bff9c	adrp x0,0x2d7000
009bffa0	adrp x2,0x2b3000
009bffa4	add x0,x0,#0xa4c
009bffa8	add x2,x2,#0xe88
009bffac	mov w1,#0x131
009bffb0	bl 0x00c342b0
009bffb4	mov w8,#0x103
009bffb8	movk w8,#0xc, LSL #16
009bffbc	sub w2,w8,#0x3
009bffc0	mov w1,#0x50
009bffc4	b 0x009c01e0
009bffc8	bl 0x00c342a0
009bffcc	adrp x0,0x2d7000
009bffd0	adrp x2,0x2b3000
009bffd4	add x0,x0,#0xa4c
009bffd8	add x2,x2,#0xe88
009bffdc	mov w1,#0x104
009bffe0	b 0x009bfffc
009bffe4	bl 0x00c342a0
009bffe8	adrp x0,0x2d7000
009bffec	adrp x2,0x2b3000
009bfff0	add x0,x0,#0xa4c
009bfff4	add x2,x2,#0xe88
009bfff8	mov w1,#0x13c
009bfffc	bl 0x00c342b0
009c0000	mov w1,#0x50
009c0004	mov w2,#0x8e
009c0008	b 0x009c01e0
009c000c	ldr x8,[sp, #0x8]
009c0010	ldr x2,[sp, #0x18]
009c0014	mov w0,w24
009c0018	mov x1,xzr
009c001c	ldr w3,[x8]
009c0020	bl 0x00c36240
009c0024	mov x24,x0
009c0028	cbz x0,0x009c01b0
009c002c	mov x0,x28
009c0030	bl 0x00c36230
009c0034	ldr x8,[x19, #0x9a8]
009c0038	mov x2,x0
009c003c	mov x0,x26
009c0040	mov x1,xzr
009c0044	ldr x3,[x8]
009c0048	ldr x4,[x8, #0x440]
009c004c	mov x5,x24
009c0050	mov x6,xzr
009c0054	bl 0x00c361d0
009c0058	cmp w0,#0x0
009c005c	b.le 0x009c01b0
009c0060	mov x0,x24
009c0064	bl 0x00c32450
009c0068	mov x0,x20
009c006c	add x24,x25,x21
009c0070	add x26,x25,x27
009c0074	bl 0x00c35290
009c0078	cmp w0,#0x6
009c007c	b.ne 0x009c00d8
009c0080	and w5,w23,#0x2
009c0084	mov x0,x22
009c0088	mov x1,x20
009c008c	mov x2,xzr
009c0090	mov x3,x24
009c0094	mov x4,xzr
009c0098	bl 0x00c34be0
009c009c	cbz w0,0x009c00bc
009c00a0	ldr x2,[sp]
009c00a4	mov w1,#0x12
009c00a8	mov x0,x22
009c00ac	mov x3,x26
009c00b0	bl 0x00c361b0
009c00b4	cmp w0,#0x0
009c00b8	b.gt 0x009c0230
009c00bc	bl 0x00c342a0
009c00c0	adrp x0,0x2d7000
009c00c4	adrp x2,0x2b3000
009c00c8	add x0,x0,#0xa4c
009c00cc	add x2,x2,#0xe88
009c00d0	mov w1,#0x18e
009c00d4	b 0x009c01d0
009c00d8	mov x0,x20
009c00dc	bl 0x00c35290
009c00e0	cmp w0,#0x7
009c00e4	b.ne 0x009c0210
009c00e8	ldr x8,[x19, #0x2e0]
009c00ec	mov w9,#0x8
009c00f0	mov w10,#0x10
009c00f4	and w5,w23,#0x2
009c00f8	ldr w8,[x8, #0x24]
009c00fc	mov x0,x22
009c0100	mov x1,x20
009c0104	mov x2,xzr
009c0108	tst w8,#0x30000
009c010c	mov x3,xzr
009c0110	mov x4,xzr
009c0114	csel w28,w10,w9,eq
009c0118	bl 0x00c34be0
009c011c	cbz w0,0x009c0194
009c0120	mov w1,#0x9
009c0124	orr w2,wzr,#0xc
009c0128	mov x0,x22
009c012c	mov x3,xzr
009c0130	bl 0x00c361b0
009c0134	cmp w0,#0x1
009c0138	b.lt 0x009c0194
009c013c	mov w1,#0x11
009c0140	mov x0,x22
009c0144	mov w2,w28
009c0148	mov x3,xzr
009c014c	bl 0x00c361b0
009c0150	cmp w0,#0x1
009c0154	b.lt 0x009c0194
009c0158	ldr x2,[sp]
009c015c	mov w1,#0x12
009c0160	mov x0,x22
009c0164	mov x3,x26
009c0168	bl 0x00c361b0
009c016c	cmp w0,#0x1
009c0170	b.lt 0x009c0194
009c0174	mov w5,#0xffffffff
009c0178	mov x0,x22
009c017c	mov x1,xzr
009c0180	mov x2,xzr
009c0184	mov x3,x24
009c0188	mov x4,xzr
009c018c	bl 0x00c34be0
009c0190	cbnz w0,0x009c0230
009c0194	bl 0x00c342a0
009c0198	adrp x0,0x2d7000
009c019c	adrp x2,0x2b3000
009c01a0	add x0,x0,#0xa4c
009c01a4	add x2,x2,#0xe88
009c01a8	mov w1,#0x19d
009c01ac	b 0x009c01d0
009c01b0	mov x0,x24
009c01b4	bl 0x00c32450
009c01b8	bl 0x00c342a0
009c01bc	adrp x0,0x2d7000
009c01c0	adrp x2,0x2b3000
009c01c4	add x0,x0,#0xa4c
009c01c8	add x2,x2,#0xe88
009c01cc	mov w1,#0x17f
009c01d0	bl 0x00c342b0
009c01d4	mov w2,#0x103
009c01d8	mov w1,#0x50
009c01dc	movk w2,#0xc, LSL #16
009c01e0	mov x0,x19
009c01e4	mov x3,xzr
009c01e8	bl 0x00c34410
009c01ec	mov w0,wzr
009c01f0	ldp x29,x30,[sp, #0x70]
009c01f4	ldp x20,x19,[sp, #0x60]
009c01f8	ldp x22,x21,[sp, #0x50]
009c01fc	ldp x24,x23,[sp, #0x40]
009c0200	ldp x26,x25,[sp, #0x30]
009c0204	ldp x28,x27,[sp, #0x20]
009c0208	add sp,sp,#0x80
009c020c	ret
009c0210	and w5,w23,#0x2
009c0214	mov x0,x22
009c0218	mov x1,x20
009c021c	mov x2,xzr
009c0220	mov x3,x24
009c0224	mov x4,x26
009c0228	bl 0x00c34be0
009c022c	cbz w0,0x009c0294
009c0230	mov x0,x20
009c0234	bl 0x00c35280
009c0238	tbz w0,#0x15,0x009c0260
009c023c	ldr x8,[sp, #0x8]
009c0240	ldr x2,[x8]
009c0244	cbz x2,0x009c0260
009c0248	ldr x3,[sp, #0x18]
009c024c	mov w1,#0x17
009c0250	mov x0,x22
009c0254	bl 0x00c361b0
009c0258	cmp w0,#0x0
009c025c	b.le 0x009c02b0
009c0260	mov x0,x22
009c0264	bl 0x00c34b80
009c0268	bl 0x00c34bb0
009c026c	cbz x0,0x009c0288
009c0270	ldr x3,[sp, #0x10]
009c0274	mov x0,x19
009c0278	mov x1,x22
009c027c	mov x2,x20
009c0280	bl 0x009bfacc
009c0284	cbz w0,0x009c01f0
009c0288	mov w0,#0x1
009c028c	str wzr,[x19, #0x7c]
009c0290	b 0x009c01f0
009c0294	bl 0x00c342a0
009c0298	adrp x0,0x2d7000
009c029c	adrp x2,0x2b3000
009c02a0	add x0,x0,#0xa4c
009c02a4	add x2,x2,#0xe88
009c02a8	mov w1,#0x1a2
009c02ac	b 0x009c01d0
009c02b0	bl 0x00c342a0
009c02b4	adrp x0,0x2d7000
009c02b8	adrp x2,0x2b3000
009c02bc	add x0,x0,#0xa4c
009c02c0	add x2,x2,#0xe88
009c02c4	mov w1,#0x1ab
009c02c8	b 0x009c01d0
