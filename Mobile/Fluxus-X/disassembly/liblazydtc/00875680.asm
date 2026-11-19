; FUN_00875680 @ 00875680
00875680	sub sp,sp,#0x40
00875684	stp x29,x30,[sp, #0x10]
00875688	str x21,[sp, #0x20]
0087568c	stp x20,x19,[sp, #0x30]
00875690	add x29,sp,#0x10
00875694	mrs x21,tpidr_el0
00875698	mov w19,w1
0087569c	mov x20,x0
008756a0	ldr x8,[x21, #0x28]
008756a4	add x0,x0,#0xd8
008756a8	mov x1,sp
008756ac	str x8,[sp, #0x8]
008756b0	str xzr,[sp]
008756b4	bl 0x0087559c
008756b8	ldr x8,[x20, #0xe0]
008756bc	mov w9,#0x1
008756c0	stp w9,w19,[x8, #-0x8]
008756c4	ldp x9,x8,[x20, #0xd8]
008756c8	ldr x10,[x21, #0x28]
008756cc	ldr x11,[sp, #0x8]
008756d0	cmp x10,x11
008756d4	b.ne 0x008756f8
008756d8	sub x8,x8,x9
008756dc	lsr x8,x8,#0x3
008756e0	sub w0,w8,#0x1
008756e4	ldp x20,x19,[sp, #0x30]
008756e8	ldr x21,[sp, #0x20]
008756ec	ldp x29,x30,[sp, #0x10]
008756f0	add sp,sp,#0x40
008756f4	ret
008756f8	bl 0x00c2fec0
