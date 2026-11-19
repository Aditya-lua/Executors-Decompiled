; ASN1_TYPE_set1 @ 009efb78
009efb78	str x21,[sp, #-0x30]!
009efb7c	stp x20,x19,[sp, #0x10]
009efb80	mov x21,x2
009efb84	mov w20,w1
009efb88	cmp w1,#0x1
009efb8c	mov x19,x0
009efb90	stp x29,x30,[sp, #0x20]
009efb94	add x29,sp,#0x20
009efb98	b.eq 0x009efbf8
009efb9c	cbz x21,0x009efbf8
009efba0	mov x0,x21
009efba4	cmp w20,#0x6
009efba8	b.ne 0x009efc48
009efbac	bl 0x00c37730
009efbb0	cbz x0,0x009efc90
009efbb4	str x19,[sp, #0x8]
009efbb8	ldr w8,[x19]
009efbbc	mov x20,x0
009efbc0	orr w8,w8,#0x4
009efbc4	cmp w8,#0x5
009efbc8	b.eq 0x009efbe8
009efbcc	ldr x8,[x19, #0x8]
009efbd0	cbz x8,0x009efbe8
009efbd4	add x0,sp,#0x8
009efbd8	mov x1,xzr
009efbdc	mov w2,wzr
009efbe0	bl 0x00c37ac0
009efbe4	ldr x19,[sp, #0x8]
009efbe8	orr w8,wzr,#0x6
009efbec	str x20,[x19, #0x8]
009efbf0	str w8,[x19]
009efbf4	b 0x009efc8c
009efbf8	str x19,[sp, #0x8]
009efbfc	ldr w8,[x19]
009efc00	orr w8,w8,#0x4
009efc04	cmp w8,#0x5
009efc08	b.eq 0x009efc28
009efc0c	ldr x8,[x19, #0x8]
009efc10	cbz x8,0x009efc28
009efc14	add x0,sp,#0x8
009efc18	mov x1,xzr
009efc1c	mov w2,wzr
009efc20	bl 0x00c37ac0
009efc24	ldr x19,[sp, #0x8]
009efc28	cmp w20,#0x1
009efc2c	str w20,[x19]
009efc30	b.ne 0x009efc88
009efc34	cmp x21,#0x0
009efc38	orr w8,wzr,#0xff
009efc3c	csel w8,wzr,w8,eq
009efc40	str w8,[x19, #0x8]
009efc44	b 0x009efc8c
009efc48	bl 0x00c37a30
009efc4c	cbz x0,0x009efc90
009efc50	str x19,[sp, #0x8]
009efc54	ldr w8,[x19]
009efc58	mov x21,x0
009efc5c	orr w8,w8,#0x4
009efc60	cmp w8,#0x5
009efc64	b.eq 0x009efc84
009efc68	ldr x8,[x19, #0x8]
009efc6c	cbz x8,0x009efc84
009efc70	add x0,sp,#0x8
009efc74	mov x1,xzr
009efc78	mov w2,wzr
009efc7c	bl 0x00c37ac0
009efc80	ldr x19,[sp, #0x8]
009efc84	str w20,[x19]
009efc88	str x21,[x19, #0x8]
009efc8c	mov w0,#0x1
009efc90	ldp x29,x30,[sp, #0x20]
009efc94	ldp x20,x19,[sp, #0x10]
009efc98	ldr x21,[sp], #0x30
009efc9c	ret
