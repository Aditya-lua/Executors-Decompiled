; FUN_007fef2c @ 007fef2c
007fef2c	stp x29,x30,[sp, #-0x50]!
007fef30	stp x26,x25,[sp, #0x10]
007fef34	stp x24,x23,[sp, #0x20]
007fef38	stp x22,x21,[sp, #0x30]
007fef3c	stp x20,x19,[sp, #0x40]
007fef40	mov x29,sp
007fef44	ldp x25,x8,[x0, #0x10]
007fef48	mov x19,x0
007fef4c	mov x20,x1
007fef50	cmp x25,x8
007fef54	b.ne 0x007ff084
007fef58	ldp x21,x23,[x19]
007fef5c	subs x8,x23,x21
007fef60	b.ls 0x007fefa8
007fef64	asr x8,x8,#0x3
007fef68	subs x22,x25,x23
007fef6c	add x8,x8,#0x1
007fef70	add x8,x8,x8, LSR #0x3f
007fef74	asr x8,x8,#0x1
007fef78	sub x21,x23,x8, LSL #0x3
007fef7c	neg x24,x8
007fef80	b.eq 0x007fef98
007fef84	mov x0,x21
007fef88	mov x1,x23
007fef8c	mov x2,x22
007fef90	bl 0x00c2ff60
007fef94	ldr x23,[x19, #0x8]
007fef98	add x8,x23,x24, LSL #0x3
007fef9c	add x25,x21,x22
007fefa0	str x8,[x19, #0x8]
007fefa4	b 0x007ff084
007fefa8	subs x22,x25,x21
007fefac	asr x8,x22,#0x2
007fefb0	csinc x8,x8,xzr,ne
007fefb4	lsr x9,x8,#0x3d
007fefb8	cbnz x9,0x007ff0a8
007fefbc	lsl x24,x8,#0x3
007fefc0	lsr x26,x8,#0x2
007fefc4	mov x0,x24
007fefc8	bl 0x00c2fed0
007fefcc	add x8,x0,x26, LSL #0x3
007fefd0	subs x10,x25,x23
007fefd4	add x9,x0,x24
007fefd8	mov x25,x8
007fefdc	b.eq 0x007ff068
007fefe0	sub x11,x10,#0x8
007fefe4	add x25,x8,x10
007fefe8	cmp x11,#0x38
007fefec	b.cs 0x007feff8
007feff0	mov x10,x8
007feff4	b 0x007ff058
007feff8	lsl x10,x26,#0x3
007feffc	add x15,x10,x0
007ff000	sub x10,x15,x23
007ff004	cmp x10,#0x20
007ff008	mov x10,x8
007ff00c	b.cc 0x007ff058
007ff010	lsr x10,x11,#0x3
007ff014	add x14,x23,#0x10
007ff018	add x15,x15,#0x10
007ff01c	add x11,x10,#0x1
007ff020	and x12,x11,#0x3ffffffffffffffc
007ff024	lsl x13,x12,#0x3
007ff028	mov x16,x12
007ff02c	add x10,x8,x13
007ff030	add x13,x23,x13
007ff034	ldp q0,q1,[x14, #-0x10]
007ff038	subs x16,x16,#0x4
007ff03c	add x14,x14,#0x20
007ff040	stp q0,q1,[x15, #-0x10]
007ff044	add x15,x15,#0x20
007ff048	b.ne 0x007ff034
007ff04c	cmp x11,x12
007ff050	mov x23,x13
007ff054	b.eq 0x007ff068
007ff058	ldr x11,[x23], #0x8
007ff05c	str x11,[x10], #0x8
007ff060	cmp x10,x25
007ff064	b.ne 0x007ff058
007ff068	stp x0,x8,[x19]
007ff06c	stp x25,x9,[x19, #0x10]
007ff070	cbz x21,0x007ff084
007ff074	mov x0,x21
007ff078	mov x1,x22
007ff07c	bl 0x00c2fe80
007ff080	ldr x25,[x19, #0x10]
007ff084	ldr x8,[x20]
007ff088	str x8,[x25], #0x8
007ff08c	str x25,[x19, #0x10]
007ff090	ldp x20,x19,[sp, #0x40]
007ff094	ldp x22,x21,[sp, #0x30]
007ff098	ldp x24,x23,[sp, #0x20]
007ff09c	ldp x26,x25,[sp, #0x10]
007ff0a0	ldp x29,x30,[sp], #0x50
007ff0a4	ret
007ff0a8	bl 0x007fe1b8
