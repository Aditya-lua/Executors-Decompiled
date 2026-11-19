; tls_process_new_session_ticket @ 009dfb04
009dfb04	sub sp,sp,#0xa0
009dfb08	stp x28,x27,[sp, #0x40]
009dfb0c	stp x26,x25,[sp, #0x50]
009dfb10	stp x24,x23,[sp, #0x60]
009dfb14	stp x22,x21,[sp, #0x70]
009dfb18	stp x20,x19,[sp, #0x80]
009dfb1c	stp x29,x30,[sp, #0x90]
009dfb20	str xzr,[sp, #0x38]
009dfb24	ldr x11,[x1, #0x8]
009dfb28	mov x19,x0
009dfb2c	add x29,sp,#0x90
009dfb30	subs x8,x11,#0x4
009dfb34	b.cc 0x009dfc60
009dfb38	ldr x10,[x1]
009dfb3c	mov x22,x1
009dfb40	add x9,x10,#0x4
009dfb44	ldrb w28,[x10]
009dfb48	ldrb w25,[x10, #0x1]
009dfb4c	ldrb w26,[x10, #0x2]
009dfb50	ldrb w27,[x10, #0x3]
009dfb54	stp x9,x8,[x1]
009dfb58	ldr x12,[x19, #0x8]
009dfb5c	ldr x13,[x12, #0xc0]
009dfb60	ldrb w13,[x13, #0x60]
009dfb64	tbnz w13,#0x3,0x009dfbd0
009dfb68	ldr w12,[x12]
009dfb6c	cmp w12,#0x304
009dfb70	b.lt 0x009dfbd0
009dfb74	mov w21,wzr
009dfb78	mov x13,xzr
009dfb7c	cmp w12,#0x10, LSL #12
009dfb80	mov x12,xzr
009dfb84	b.eq 0x009dfbdc
009dfb88	cmp x8,#0x4
009dfb8c	b.cc 0x009dfc60
009dfb90	ldr w9,[x10, #0x4]
009dfb94	add x8,x10,#0x8
009dfb98	subs x12,x11,#0x8
009dfb9c	stp x8,x12,[x22]
009dfba0	b.eq 0x009dfc60
009dfba4	ldrb w13,[x10, #0x8]
009dfba8	sub x8,x11,#0x9
009dfbac	subs x8,x8,x13
009dfbb0	b.cc 0x009dfc60
009dfbb4	add x12,x10,#0x9
009dfbb8	rev w21,w9
009dfbbc	add x9,x12,x13
009dfbc0	stp x9,x8,[x22]
009dfbc4	subs x8,x8,#0x2
009dfbc8	b.cs 0x009dfbe4
009dfbcc	b 0x009dfc60
009dfbd0	mov w21,wzr
009dfbd4	mov x13,xzr
009dfbd8	mov x12,xzr
009dfbdc	subs x8,x8,#0x2
009dfbe0	b.cc 0x009dfc60
009dfbe4	ldrb w10,[x9]
009dfbe8	ldrb w23,[x9, #0x1]
009dfbec	add x9,x9,#0x2
009dfbf0	stp x9,x8,[x22]
009dfbf4	ldr x9,[x19, #0x8]
009dfbf8	bfm w23,w10,#0x18,#0x7
009dfbfc	ldr x11,[x9, #0xc0]
009dfc00	ldr w11,[x11, #0x60]
009dfc04	tbnz w11,#0x3,0x009dfc2c
009dfc08	ldr w10,[x9]
009dfc0c	cmp w10,#0x304
009dfc10	b.lt 0x009dfc2c
009dfc14	cmp w10,#0x10, LSL #12
009dfc18	b.eq 0x009dfc2c
009dfc1c	cbz w23,0x009dfc60
009dfc20	cmp x8,x23
009dfc24	b.cs 0x009dfc40
009dfc28	b 0x009dfc60
009dfc2c	cmp x8,x23
009dfc30	b.ne 0x009dfc60
009dfc34	cbz w23,0x009dffe4
009dfc38	tbnz w11,#0x3,0x009dfcd8
009dfc3c	ldr w10,[x9]
009dfc40	cmp w10,#0x304
009dfc44	b.lt 0x009dfcd8
009dfc48	cmp w10,#0x10, LSL #12
009dfc4c	b.eq 0x009dfcd8
009dfc50	stp x12,x13,[sp, #0x18]
009dfc54	ldr x0,[x19, #0x918]
009dfc58	add x20,x19,#0x918
009dfc5c	b 0x009dfcec
009dfc60	bl 0x00c342a0
009dfc64	adrp x0,0x2d7000
009dfc68	adrp x2,0x2cf000
009dfc6c	add x0,x0,#0xb1a
009dfc70	add x2,x2,#0x873
009dfc74	mov w1,#0x9a8
009dfc78	bl 0x00c342b0
009dfc7c	mov w1,#0x32
009dfc80	mov w2,#0x9f
009dfc84	mov x0,x19
009dfc88	mov x3,xzr
009dfc8c	bl 0x00c34410
009dfc90	mov x22,xzr
009dfc94	mov x0,x22
009dfc98	bl 0x00c35800
009dfc9c	ldr x0,[sp, #0x38]
009dfca0	adrp x1,0x2d7000
009dfca4	add x1,x1,#0xb1a
009dfca8	mov w2,#0xa41
009dfcac	bl 0x00c32310
009dfcb0	mov w22,wzr
009dfcb4	mov w0,w22
009dfcb8	ldp x29,x30,[sp, #0x90]
009dfcbc	ldp x20,x19,[sp, #0x80]
009dfcc0	ldp x22,x21,[sp, #0x70]
009dfcc4	ldp x24,x23,[sp, #0x60]
009dfcc8	ldp x26,x25,[sp, #0x50]
009dfccc	ldp x28,x27,[sp, #0x40]
009dfcd0	add sp,sp,#0xa0
009dfcd4	ret
009dfcd8	stp x12,x13,[sp, #0x18]
009dfcdc	ldr x0,[x19, #0x918]
009dfce0	add x20,x19,#0x918
009dfce4	ldr x8,[x0, #0x250]
009dfce8	cbz x8,0x009dfd40
009dfcec	mov w1,wzr
009dfcf0	bl 0x00c36120
009dfcf4	cbz x0,0x009dfdc4
009dfcf8	mov x24,x0
009dfcfc	ldr x0,[x19, #0xb88]
009dfd00	ldrb w8,[x0, #0x50]
009dfd04	tbz w8,#0x0,0x009dfd34
009dfd08	ldr x8,[x19, #0x8]
009dfd0c	ldr x9,[x8, #0xc0]
009dfd10	ldrb w9,[x9, #0x60]
009dfd14	tbnz w9,#0x3,0x009dfd2c
009dfd18	ldr w8,[x8]
009dfd1c	cmp w8,#0x304
009dfd20	b.lt 0x009dfd2c
009dfd24	cmp w8,#0x10, LSL #12
009dfd28	b.ne 0x009dfd34
009dfd2c	ldr x1,[x20]
009dfd30	bl 0x00c34cd0
009dfd34	ldr x0,[x20]
009dfd38	bl 0x00c32870
009dfd3c	str x24,[x20]
009dfd40	mov x0,xzr
009dfd44	bl 0x00c30970
009dfd48	ldr x8,[x20]
009dfd4c	str x0,[x8, #0x2e0]
009dfd50	mov x0,x8
009dfd54	bl 0x00c36110
009dfd58	ldr x8,[x20]
009dfd5c	adrp x24,0x2d7000
009dfd60	add x24,x24,#0xb1a
009dfd64	mov w2,#0x9d9
009dfd68	ldr x0,[x8, #0x338]
009dfd6c	mov x1,x24
009dfd70	bl 0x00c32310
009dfd74	ldr x8,[x20]
009dfd78	mov w2,#0x9dd
009dfd7c	mov x0,x23
009dfd80	mov x1,x24
009dfd84	str xzr,[x8, #0x340]
009dfd88	str xzr,[x8, #0x338]
009dfd8c	bl 0x00c32320
009dfd90	ldr x8,[x20]
009dfd94	str x0,[x8, #0x338]
009dfd98	cbz x0,0x009dfde0
009dfd9c	ldr x8,[x22, #0x8]
009dfda0	cmp x8,x23
009dfda4	b.cs 0x009dfe0c
009dfda8	bl 0x00c342a0
009dfdac	adrp x0,0x2d7000
009dfdb0	adrp x2,0x2cf000
009dfdb4	add x0,x0,#0xb1a
009dfdb8	add x2,x2,#0x873
009dfdbc	mov w1,#0x9e3
009dfdc0	b 0x009dfc78
009dfdc4	bl 0x00c342a0
009dfdc8	adrp x0,0x2d7000
009dfdcc	adrp x2,0x2cf000
009dfdd0	add x0,x0,#0xb1a
009dfdd4	add x2,x2,#0x873
009dfdd8	mov w1,#0x9c4
009dfddc	b 0x009dfdf8
009dfde0	bl 0x00c342a0
009dfde4	adrp x0,0x2d7000
009dfde8	adrp x2,0x2cf000
009dfdec	add x0,x0,#0xb1a
009dfdf0	add x2,x2,#0x873
009dfdf4	mov w1,#0x9df
009dfdf8	bl 0x00c342b0
009dfdfc	mov w2,#0x100
009dfe00	mov w1,#0x50
009dfe04	movk w2,#0xc, LSL #16
009dfe08	b 0x009dfc84
009dfe0c	ldr x1,[x22]
009dfe10	lsl x8,x28,#0x18
009dfe14	bfm x8,x25,#0x30,#0x7
009dfe18	bfm x8,x26,#0x38,#0x7
009dfe1c	mov x2,x23
009dfe20	orr x24,x8,x27
009dfe24	bl 0x00c2ffd0
009dfe28	ldp x8,x9,[x22]
009dfe2c	add x8,x8,x23
009dfe30	sub x9,x9,x23
009dfe34	stp x8,x9,[x22]
009dfe38	ldr x8,[x19, #0x918]
009dfe3c	str x24,[x8, #0x348]
009dfe40	str w21,[x8, #0x350]
009dfe44	str x23,[x8, #0x340]
009dfe48	ldr x8,[x19, #0x8]
009dfe4c	ldr x9,[x8, #0xc0]
009dfe50	ldrb w9,[x9, #0x60]
009dfe54	tbnz w9,#0x3,0x009dfee0
009dfe58	ldr w8,[x8]
009dfe5c	cmp w8,#0x304
009dfe60	b.lt 0x009dfee0
009dfe64	cmp w8,#0x10, LSL #12
009dfe68	b.eq 0x009dfee0
009dfe6c	ldr x8,[x22, #0x8]
009dfe70	subs x10,x8,#0x2
009dfe74	b.cc 0x009dfffc
009dfe78	ldr x9,[x22]
009dfe7c	ldrb w11,[x9]
009dfe80	ldrb w8,[x9, #0x1]
009dfe84	bfm x8,x11,#0x38,#0x7
009dfe88	cmp x10,x8
009dfe8c	b.ne 0x009dfffc
009dfe90	add x9,x9,#0x2
009dfe94	add x10,x9,x8
009dfe98	add x1,sp,#0x28
009dfe9c	mov w2,#0x2000
009dfea0	add x3,sp,#0x38
009dfea4	mov w5,#0x1
009dfea8	mov x0,x19
009dfeac	mov x4,xzr
009dfeb0	stp x10,xzr,[x22]
009dfeb4	stp x9,x8,[sp, #0x28]
009dfeb8	bl 0x00c36e50
009dfebc	cbz w0,0x009dfc90
009dfec0	ldr x2,[sp, #0x38]
009dfec4	mov w1,#0x2000
009dfec8	mov w5,#0x1
009dfecc	mov x0,x19
009dfed0	mov x3,xzr
009dfed4	mov x4,xzr
009dfed8	bl 0x00c36e70
009dfedc	cbz w0,0x009dfc90
009dfee0	ldr x8,[x19, #0x9a8]
009dfee4	adrp x1,0x2a9000
009dfee8	add x1,x1,#0xb18
009dfeec	ldr x0,[x8]
009dfef0	ldr x2,[x8, #0x440]
009dfef4	bl 0x00c357f0
009dfef8	mov x22,x0
009dfefc	cbz x0,0x009dffec
009dff00	ldr x8,[x20]
009dff04	add x3,sp,#0x28
009dff08	mov x1,x23
009dff0c	mov x4,x22
009dff10	ldr x0,[x8, #0x338]
009dff14	add x2,x8,#0x258
009dff18	mov x5,xzr
009dff1c	bl 0x00c370c0
009dff20	cbz w0,0x009e0018
009dff24	mov x0,x22
009dff28	bl 0x00c35800
009dff2c	ldr w8,[sp, #0x28]
009dff30	ldr x9,[x19, #0x918]
009dff34	str x8,[x9, #0x250]
009dff38	str wzr,[x9, #0x2b0]
009dff3c	ldr x8,[x19, #0x8]
009dff40	ldr x9,[x8, #0xc0]
009dff44	ldrb w9,[x9, #0x60]
009dff48	tbnz w9,#0x3,0x009dffe4
009dff4c	ldr w8,[x8]
009dff50	orr w22,wzr,#0x3
009dff54	cmp w8,#0x304
009dff58	b.lt 0x009dfcb4
009dff5c	cmp w8,#0x10, LSL #12
009dff60	b.eq 0x009dfcb4
009dff64	mov x0,x19
009dff68	bl 0x00c34a10
009dff6c	mov x22,x0
009dff70	bl 0x00c34c20
009dff74	tbnz w0,#0x1f,0x009e0050
009dff78	ldr x8,[x19, #0x918]
009dff7c	ldp x5,x6,[sp, #0x18]
009dff80	adrp x3,0x74d000
009dff84	sxtw x20,w0
009dff88	add x2,x19,#0x604
009dff8c	add x7,x8,#0x50
009dff90	mov w8,#0x1
009dff94	add x3,x3,#0x6a4
009dff98	mov w4,#0xa
009dff9c	mov x0,x19
009dffa0	mov x1,x22
009dffa4	str w8,[sp, #0x8]
009dffa8	str x20,[sp]
009dffac	bl 0x00c36850
009dffb0	cbz w0,0x009dfc90
009dffb4	ldr x8,[x19, #0x918]
009dffb8	adrp x1,0x2d7000
009dffbc	add x1,x1,#0xb1a
009dffc0	mov w2,#0xa39
009dffc4	str x20,[x8, #0x8]
009dffc8	ldr x0,[sp, #0x38]
009dffcc	bl 0x00c32310
009dffd0	mov w1,#0x1
009dffd4	mov x0,x19
009dffd8	mov w22,#0x1
009dffdc	bl 0x00c35e40
009dffe0	b 0x009dfcb4
009dffe4	orr w22,wzr,#0x3
009dffe8	b 0x009dfcb4
009dffec	mov w1,#0x50
009dfff0	mov x0,x19
009dfff4	bl 0x00c34c80
009dfff8	b 0x009dfc94
009dfffc	bl 0x00c342a0
009e0000	adrp x0,0x2d7000
009e0004	adrp x2,0x2cf000
009e0008	add x0,x0,#0xb1a
009e000c	add x2,x2,#0x873
009e0010	mov w1,#0x9f0
009e0014	b 0x009dfc78
009e0018	bl 0x00c342a0
009e001c	adrp x0,0x2d7000
009e0020	adrp x2,0x2cf000
009e0024	add x0,x0,#0xb1a
009e0028	add x2,x2,#0x873
009e002c	mov w1,#0xa17
009e0030	bl 0x00c342b0
009e0034	mov w2,#0x6
009e0038	mov w1,#0x50
009e003c	movk w2,#0x8, LSL #16
009e0040	mov x0,x19
009e0044	mov x3,xzr
009e0048	bl 0x00c34410
009e004c	b 0x009dfc94
009e0050	bl 0x00c342a0
009e0054	adrp x0,0x2d7000
009e0058	adrp x2,0x2cf000
009e005c	add x0,x0,#0xb1a
009e0060	add x2,x2,#0x873
009e0064	mov w1,#0xa28
009e0068	bl 0x00c342b0
009e006c	mov w8,#0x100
009e0070	movk w8,#0xc, LSL #16
009e0074	add w2,w8,#0x3
009e0078	mov w1,#0x50
009e007c	b 0x009dfc84
