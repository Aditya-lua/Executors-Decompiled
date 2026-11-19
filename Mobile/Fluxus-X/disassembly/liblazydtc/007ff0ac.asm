; FUN_007ff0ac @ 007ff0ac
007ff0ac	stp x29,x30,[sp, #-0x60]!
007ff0b0	str x27,[sp, #0x10]
007ff0b4	stp x26,x25,[sp, #0x20]
007ff0b8	stp x24,x23,[sp, #0x30]
007ff0bc	stp x22,x21,[sp, #0x40]
007ff0c0	stp x20,x19,[sp, #0x50]
007ff0c4	mov x29,sp
007ff0c8	ldp x23,x21,[x0]
007ff0cc	mov x19,x0
007ff0d0	mov x20,x1
007ff0d4	cmp x21,x23
007ff0d8	b.eq 0x007ff0e4
007ff0dc	mov x22,x21
007ff0e0	b 0x007ff214
007ff0e4	ldp x26,x8,[x19, #0x10]
007ff0e8	cmp x26,x8
007ff0ec	b.cs 0x007ff134
007ff0f0	sub x8,x8,x26
007ff0f4	subs x9,x26,x21
007ff0f8	asr x8,x8,#0x3
007ff0fc	subs x2,x26,x21
007ff100	add x8,x8,#0x1
007ff104	add x8,x8,x8, LSR #0x3f
007ff108	asr x23,x8,#0x1
007ff10c	add x8,x26,x23, LSL #0x3
007ff110	sub x22,x8,x9
007ff114	b.eq 0x007ff128
007ff118	mov x0,x22
007ff11c	mov x1,x21
007ff120	bl 0x00c2ff60
007ff124	ldr x26,[x19, #0x10]
007ff128	add x8,x26,x23, LSL #0x3
007ff12c	str x8,[x19, #0x10]
007ff130	b 0x007ff214
007ff134	subs x24,x8,x21
007ff138	asr x8,x24,#0x2
007ff13c	csinc x8,x8,xzr,ne
007ff140	lsr x9,x8,#0x3d
007ff144	cbnz x9,0x007ff23c
007ff148	lsl x25,x8,#0x3
007ff14c	add x9,x8,#0x3
007ff150	lsr x27,x9,#0x2
007ff154	mov x0,x25
007ff158	bl 0x00c2fed0
007ff15c	add x22,x0,x27, LSL #0x3
007ff160	subs x10,x26,x21
007ff164	add x8,x0,x25
007ff168	mov x9,x22
007ff16c	b.eq 0x007ff1f8
007ff170	sub x12,x10,#0x8
007ff174	add x9,x22,x10
007ff178	mov x10,x22
007ff17c	cmp x12,#0x38
007ff180	mov x11,x21
007ff184	b.cc 0x007ff1e8
007ff188	lsl x10,x27,#0x3
007ff18c	mov x11,x21
007ff190	add x15,x10,x0
007ff194	sub x10,x15,x21
007ff198	cmp x10,#0x20
007ff19c	mov x10,x22
007ff1a0	b.cc 0x007ff1e8
007ff1a4	lsr x10,x12,#0x3
007ff1a8	add x14,x21,#0x10
007ff1ac	add x15,x15,#0x10
007ff1b0	add x12,x10,#0x1
007ff1b4	and x13,x12,#0x3ffffffffffffffc
007ff1b8	lsl x11,x13,#0x3
007ff1bc	mov x16,x13
007ff1c0	add x10,x22,x11
007ff1c4	add x11,x21,x11
007ff1c8	ldp q0,q1,[x14, #-0x10]
007ff1cc	subs x16,x16,#0x4
007ff1d0	add x14,x14,#0x20
007ff1d4	stp q0,q1,[x15, #-0x10]
007ff1d8	add x15,x15,#0x20
007ff1dc	b.ne 0x007ff1c8
007ff1e0	cmp x12,x13
007ff1e4	b.eq 0x007ff1f8
007ff1e8	ldr x12,[x11], #0x8
007ff1ec	str x12,[x10], #0x8
007ff1f0	cmp x10,x9
007ff1f4	b.ne 0x007ff1e8
007ff1f8	stp x0,x22,[x19]
007ff1fc	stp x9,x8,[x19, #0x10]
007ff200	cbz x21,0x007ff214
007ff204	mov x0,x23
007ff208	mov x1,x24
007ff20c	bl 0x00c2fe80
007ff210	ldr x22,[x19, #0x8]
007ff214	ldr x8,[x20]
007ff218	str x8,[x22, #-0x8]!
007ff21c	str x22,[x19, #0x8]
007ff220	ldp x20,x19,[sp, #0x50]
007ff224	ldr x27,[sp, #0x10]
007ff228	ldp x22,x21,[sp, #0x40]
007ff22c	ldp x24,x23,[sp, #0x30]
007ff230	ldp x26,x25,[sp, #0x20]
007ff234	ldp x29,x30,[sp], #0x60
007ff238	ret
007ff23c	bl 0x007fe1b8
