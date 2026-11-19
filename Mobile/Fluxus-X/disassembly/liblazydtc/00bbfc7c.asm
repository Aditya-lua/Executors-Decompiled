; FUN_00bbfc7c @ 00bbfc7c
00bbfc7c	cmp x3,#0x7
00bbfc80	sub x10,x0,x2
00bbfc84	add x8,x0,x3
00bbfc88	b.hi 0x00bbfcc4
00bbfc8c	cbz x3,0x00bc0068
00bbfc90	add x9,x3,x0
00bbfc94	add x11,x0,#0x1
00bbfc98	cmp x9,x11
00bbfc9c	csinc x9,x9,x0,hi
00bbfca0	sub x9,x9,x0
00bbfca4	cmp x9,#0x8
00bbfca8	b.cc 0x00bbfdb0
00bbfcac	cmp x10,#0x20
00bbfcb0	b.cc 0x00bbfdb0
00bbfcb4	cmp x9,#0x20
00bbfcb8	b.cs 0x00bbfec0
00bbfcbc	mov x12,xzr
00bbfcc0	b 0x00bbfef8
00bbfcc4	cbz w4,0x00bbfd1c
00bbfcc8	cmp x10,#0x7
00bbfccc	b.hi 0x00bbfdbc
00bbfcd0	ldrb w9,[x2]
00bbfcd4	adrp x11,0x364000
00bbfcd8	add x11,x11,#0xd10
00bbfcdc	ldrsw x11,[x11, x10, LSL #0x2]
00bbfce0	strb w9,[x0]
00bbfce4	ldrb w9,[x2, #0x1]
00bbfce8	strb w9,[x0, #0x1]
00bbfcec	ldrb w9,[x2, #0x2]
00bbfcf0	strb w9,[x0, #0x2]
00bbfcf4	ldrb w9,[x2, #0x3]
00bbfcf8	strb w9,[x0, #0x3]
00bbfcfc	adrp x9,0x364000
00bbfd00	add x9,x9,#0xe10
00bbfd04	ldr w9,[x9, x10, LSL #0x2]
00bbfd08	add x9,x2,x9
00bbfd0c	ldr w10,[x9]
00bbfd10	sub x2,x9,x11
00bbfd14	str w10,[x0, #0x4]
00bbfd18	b 0x00bbfdc4
00bbfd1c	mov x9,x0
00bbfd20	mov x10,x3
00bbfd24	cmp x8,x1
00bbfd28	b.hi 0x00bbfdd8
00bbfd2c	add x8,x9,x10
00bbfd30	cbz w4,0x00bbfe88
00bbfd34	sub x11,x9,x2
00bbfd38	cmp x11,#0xf
00bbfd3c	b.gt 0x00bbfe88
00bbfd40	add x10,x10,x9
00bbfd44	add x12,x9,#0x8
00bbfd48	cmp x10,x12
00bbfd4c	csel x10,x10,x12,hi
00bbfd50	mvn x12,x9
00bbfd54	add x10,x10,x12
00bbfd58	cmp x10,#0x18
00bbfd5c	b.cc 0x00bbffa4
00bbfd60	cmp x11,#0x20
00bbfd64	b.cc 0x00bbffa4
00bbfd68	lsr x10,x10,#0x3
00bbfd6c	add x14,x2,#0x10
00bbfd70	add x12,x10,#0x1
00bbfd74	and x13,x12,#0x3ffffffffffffffc
00bbfd78	lsl x11,x13,#0x3
00bbfd7c	mov x15,x13
00bbfd80	add x10,x9,x11
00bbfd84	add x11,x2,x11
00bbfd88	add x9,x9,#0x10
00bbfd8c	ldp q0,q1,[x14, #-0x10]
00bbfd90	subs x15,x15,#0x4
00bbfd94	add x14,x14,#0x20
00bbfd98	stp q0,q1,[x9, #-0x10]
00bbfd9c	add x9,x9,#0x20
00bbfda0	b.ne 0x00bbfd8c
00bbfda4	cmp x12,x13
00bbfda8	b.ne 0x00bbffac
00bbfdac	b 0x00bc0068
00bbfdb0	mov x10,x2
00bbfdb4	mov x11,x0
00bbfdb8	b 0x00bc003c
00bbfdbc	ldr x9,[x2]
00bbfdc0	str x9,[x0]
00bbfdc4	add x2,x2,#0x8
00bbfdc8	add x9,x0,#0x8
00bbfdcc	sub x10,x3,#0x8
00bbfdd0	cmp x8,x1
00bbfdd4	b.ls 0x00bbfd2c
00bbfdd8	cmp x9,x1
00bbfddc	mov x11,x9
00bbfde0	mov x10,x2
00bbfde4	b.hi 0x00bbff68
00bbfde8	sub x10,x1,x9
00bbfdec	cbz w4,0x00bbff2c
00bbfdf0	sub x13,x9,x2
00bbfdf4	cmp x13,#0xf
00bbfdf8	b.gt 0x00bbff2c
00bbfdfc	add x11,x9,#0x8
00bbfe00	mvn x12,x9
00bbfe04	cmp x1,x11
00bbfe08	csel x11,x1,x11,hi
00bbfe0c	add x14,x11,x12
00bbfe10	mov x11,x9
00bbfe14	mov x12,x2
00bbfe18	cmp x14,#0x18
00bbfe1c	b.cc 0x00bbfe74
00bbfe20	cmp x13,#0x20
00bbfe24	mov x11,x9
00bbfe28	mov x12,x2
00bbfe2c	b.cc 0x00bbfe74
00bbfe30	lsr x11,x14,#0x3
00bbfe34	add x15,x2,#0x10
00bbfe38	add x16,x9,#0x10
00bbfe3c	add x13,x11,#0x1
00bbfe40	and x14,x13,#0x3ffffffffffffffc
00bbfe44	lsl x12,x14,#0x3
00bbfe48	mov x17,x14
00bbfe4c	add x11,x9,x12
00bbfe50	add x12,x2,x12
00bbfe54	ldp q0,q1,[x15, #-0x10]
00bbfe58	subs x17,x17,#0x4
00bbfe5c	add x15,x15,#0x20
00bbfe60	stp q0,q1,[x16, #-0x10]
00bbfe64	add x16,x16,#0x20
00bbfe68	b.ne 0x00bbfe54
00bbfe6c	cmp x13,x14
00bbfe70	b.eq 0x00bbff60
00bbfe74	ldr x13,[x12], #0x8
00bbfe78	str x13,[x11], #0x8
00bbfe7c	cmp x11,x1
00bbfe80	b.cc 0x00bbfe74
00bbfe84	b 0x00bbff60
00bbfe88	ldr q0,[x2]
00bbfe8c	cmp x10,#0x11
00bbfe90	str q0,[x9]
00bbfe94	b.cc 0x00bc0068
00bbfe98	add x9,x9,#0x10
00bbfe9c	add x10,x2,#0x20
00bbfea0	ldur q0,[x10, #-0x10]
00bbfea4	str q0,[x9]
00bbfea8	ldr q0,[x10], #0x20
00bbfeac	str q0,[x9, #0x10]
00bbfeb0	add x9,x9,#0x20
00bbfeb4	cmp x9,x8
00bbfeb8	b.cc 0x00bbfea0
00bbfebc	b 0x00bc0068
00bbfec0	and x12,x9,#-0x20
00bbfec4	add x10,x0,#0x10
00bbfec8	add x11,x2,#0x10
00bbfecc	mov x13,x12
00bbfed0	ldp q0,q1,[x11, #-0x10]
00bbfed4	subs x13,x13,#0x20
00bbfed8	add x11,x11,#0x20
00bbfedc	stp q0,q1,[x10, #-0x10]
00bbfee0	add x10,x10,#0x20
00bbfee4	b.ne 0x00bbfed0
00bbfee8	cmp x9,x12
00bbfeec	b.eq 0x00bc0068
00bbfef0	tst x9,#0x18
00bbfef4	b.eq 0x00bc0034
00bbfef8	and x13,x9,#-0x8
00bbfefc	add x14,x0,x12
00bbff00	add x15,x2,x12
00bbff04	add x10,x2,x13
00bbff08	add x11,x0,x13
00bbff0c	sub x12,x12,x13
00bbff10	ldr d0,[x15], #0x8
00bbff14	adds x12,x12,#0x8
00bbff18	str d0,[x14], #0x8
00bbff1c	b.ne 0x00bbff10
00bbff20	cmp x9,x13
00bbff24	b.ne 0x00bc003c
00bbff28	b 0x00bc0068
00bbff2c	ldr q0,[x2]
00bbff30	cmp x10,#0x11
00bbff34	str q0,[x9]
00bbff38	b.cc 0x00bbff60
00bbff3c	add x11,x9,#0x10
00bbff40	add x12,x2,#0x20
00bbff44	ldur q0,[x12, #-0x10]
00bbff48	str q0,[x11]
00bbff4c	ldr q0,[x12], #0x20
00bbff50	str q0,[x11, #0x10]
00bbff54	add x11,x11,#0x20
00bbff58	cmp x11,x1
00bbff5c	b.cc 0x00bbff44
00bbff60	add x10,x2,x10
00bbff64	mov x11,x1
00bbff68	cmp x11,x8
00bbff6c	b.cs 0x00bc0068
00bbff70	cmp x9,x1
00bbff74	add x12,x3,x0
00bbff78	csel x13,x9,x1,hi
00bbff7c	sub x12,x12,x13
00bbff80	cmp x12,#0x8
00bbff84	b.cc 0x00bc0058
00bbff88	sub x14,x9,x2
00bbff8c	cmp x14,#0x20
00bbff90	b.cc 0x00bc0058
00bbff94	cmp x12,#0x20
00bbff98	b.cs 0x00bbffc0
00bbff9c	mov x14,xzr
00bbffa0	b 0x00bbfffc
00bbffa4	mov x10,x9
00bbffa8	mov x11,x2
00bbffac	ldr x9,[x11], #0x8
00bbffb0	str x9,[x10], #0x8
00bbffb4	cmp x10,x8
00bbffb8	b.cc 0x00bbffac
00bbffbc	b 0x00bc0068
00bbffc0	add x15,x13,#0x10
00bbffc4	and x14,x12,#-0x20
00bbffc8	sub x16,x15,x9
00bbffcc	mov x17,x14
00bbffd0	add x16,x2,x16
00bbffd4	ldp q0,q1,[x16, #-0x10]
00bbffd8	subs x17,x17,#0x20
00bbffdc	add x16,x16,#0x20
00bbffe0	stp q0,q1,[x15, #-0x10]
00bbffe4	add x15,x15,#0x20
00bbffe8	b.ne 0x00bbffd4
00bbffec	cmp x12,x14
00bbfff0	b.eq 0x00bc0068
00bbfff4	tst x12,#0x18
00bbfff8	b.eq 0x00bc0050
00bbfffc	add x13,x14,x13
00bc0000	and x15,x12,#-0x8
00bc0004	sub x9,x13,x9
00bc0008	add x10,x10,x15
00bc000c	add x11,x11,x15
00bc0010	add x9,x2,x9
00bc0014	sub x14,x14,x15
00bc0018	ldr d0,[x9], #0x8
00bc001c	adds x14,x14,#0x8
00bc0020	str d0,[x13], #0x8
00bc0024	b.ne 0x00bc0018
00bc0028	cmp x12,x15
00bc002c	b.ne 0x00bc0058
00bc0030	b 0x00bc0068
00bc0034	add x10,x2,x12
00bc0038	add x11,x0,x12
00bc003c	ldrb w9,[x10], #0x1
00bc0040	strb w9,[x11], #0x1
00bc0044	cmp x11,x8
00bc0048	b.cc 0x00bc003c
00bc004c	b 0x00bc0068
00bc0050	add x10,x10,x14
00bc0054	add x11,x11,x14
00bc0058	ldrb w9,[x10], #0x1
00bc005c	strb w9,[x11], #0x1
00bc0060	cmp x11,x8
00bc0064	b.cc 0x00bc0058
00bc0068	ret
