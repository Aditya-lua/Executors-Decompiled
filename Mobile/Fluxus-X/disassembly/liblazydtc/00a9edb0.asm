; OSSL_PARAM_set_uint64 @ 00a9edb0
00a9edb0	str x21,[sp, #-0x30]!
00a9edb4	stp x20,x19,[sp, #0x10]
00a9edb8	stp x29,x30,[sp, #0x20]
00a9edbc	add x29,sp,#0x20
00a9edc0	str x1,[sp, #0x8]
00a9edc4	cbz x0,0x00a9eee8
00a9edc8	ldr w8,[x0, #0x8]
00a9edcc	mov x20,x1
00a9edd0	mov x19,x0
00a9edd4	str xzr,[x0, #0x20]
00a9edd8	cmp w8,#0x1
00a9eddc	b.eq 0x00a9ee28
00a9ede0	cmp w8,#0x3
00a9ede4	b.eq 0x00a9ee68
00a9ede8	cmp w8,#0x2
00a9edec	mov w0,wzr
00a9edf0	b.ne 0x00a9eee8
00a9edf4	ldr x21,[x19, #0x10]
00a9edf8	mov w8,#0x8
00a9edfc	str x8,[x19, #0x20]
00a9ee00	cbz x21,0x00a9eee4
00a9ee04	ldr x2,[x19, #0x18]
00a9ee08	subs x8,x2,#0x8
00a9ee0c	b.eq 0x00a9eee0
00a9ee10	cmp x2,#0x4
00a9ee14	b.ne 0x00a9ee98
00a9ee18	lsr x8,x20,#0x20
00a9ee1c	mov w0,wzr
00a9ee20	cbz x8,0x00a9ee58
00a9ee24	b 0x00a9eee8
00a9ee28	ldr x21,[x19, #0x10]
00a9ee2c	mov w8,#0x8
00a9ee30	str x8,[x19, #0x20]
00a9ee34	cbz x21,0x00a9eee4
00a9ee38	ldr x2,[x19, #0x18]
00a9ee3c	subs x8,x2,#0x8
00a9ee40	b.eq 0x00a9eedc
00a9ee44	cmp x2,#0x4
00a9ee48	b.ne 0x00a9ef00
00a9ee4c	lsr x8,x20,#0x1f
00a9ee50	mov w0,wzr
00a9ee54	cbnz x8,0x00a9eee8
00a9ee58	mov w8,#0x4
00a9ee5c	str x8,[x19, #0x20]
00a9ee60	str w20,[x21]
00a9ee64	b 0x00a9eee4
00a9ee68	mov w8,#0x8
00a9ee6c	lsr x9,x20,#0x35
00a9ee70	str x8,[x19, #0x20]
00a9ee74	cbnz x9,0x00a9eef8
00a9ee78	ldr x8,[x19, #0x18]
00a9ee7c	mov w0,wzr
00a9ee80	cmp x8,#0x8
00a9ee84	b.ne 0x00a9eee8
00a9ee88	ldr x8,[x19, #0x10]
00a9ee8c	ucvtf d0,x20
00a9ee90	str d0,[x8]
00a9ee94	b 0x00a9eee4
00a9ee98	mov w9,#0x8
00a9ee9c	cmp x2,#0x9
00a9eea0	str x9,[x19, #0x20]
00a9eea4	b.cs 0x00a9ef10
00a9eea8	mov w8,#0x8
00a9eeac	subs x9,x8,x2
00a9eeb0	b.eq 0x00a9ef68
00a9eeb4	add x8,sp,#0x8
00a9eeb8	mov x10,xzr
00a9eebc	add x11,x8,x2
00a9eec0	mov w8,#0x8
00a9eec4	ldrb w12,[x11, x10]
00a9eec8	cbnz w12,0x00a9ef88
00a9eecc	add x10,x10,#0x1
00a9eed0	cmp x10,x9
00a9eed4	b.cc 0x00a9eec4
00a9eed8	b 0x00a9ef68
00a9eedc	tbnz x20,#0x3f,0x00a9eef8
00a9eee0	str x20,[x21]
00a9eee4	mov w0,#0x1
00a9eee8	ldp x29,x30,[sp, #0x20]
00a9eeec	ldp x20,x19,[sp, #0x10]
00a9eef0	ldr x21,[sp], #0x30
00a9eef4	ret
00a9eef8	mov w0,wzr
00a9eefc	b 0x00a9eee8
00a9ef00	mov w9,#0x8
00a9ef04	cmp x2,#0x9
00a9ef08	str x9,[x19, #0x20]
00a9ef0c	b.cc 0x00a9ef28
00a9ef10	add x0,x21,#0x8
00a9ef14	mov w1,wzr
00a9ef18	mov x2,x8
00a9ef1c	bl 0x00c301c0
00a9ef20	str x20,[x21]
00a9ef24	b 0x00a9ef74
00a9ef28	mov w8,#0x8
00a9ef2c	subs x9,x8,x2
00a9ef30	b.eq 0x00a9ef58
00a9ef34	add x8,sp,#0x8
00a9ef38	mov x10,xzr
00a9ef3c	add x11,x8,x2
00a9ef40	mov w8,#0x8
00a9ef44	ldrb w12,[x11, x10]
00a9ef48	cbnz w12,0x00a9ef88
00a9ef4c	add x10,x10,#0x1
00a9ef50	cmp x10,x9
00a9ef54	b.cc 0x00a9ef44
00a9ef58	add x8,sp,#0x8
00a9ef5c	add x8,x8,x2
00a9ef60	ldursb w8,[x8, #-0x1]
00a9ef64	tbnz w8,#0x1f,0x00a9ef84
00a9ef68	add x1,sp,#0x8
00a9ef6c	mov x0,x21
00a9ef70	bl 0x00c2ffd0
00a9ef74	ldr x8,[x19, #0x18]
00a9ef78	mov w0,#0x1
00a9ef7c	str x8,[x19, #0x20]
00a9ef80	b 0x00a9eee8
00a9ef84	mov w8,#0x8
00a9ef88	mov w0,wzr
00a9ef8c	str x8,[x19, #0x20]
00a9ef90	b 0x00a9eee8
