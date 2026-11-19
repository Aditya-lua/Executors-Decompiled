; ossl_asn1_time_from_tm @ 009eec44
009eec44	sub sp,sp,#0x40
009eec48	stp x22,x21,[sp, #0x10]
009eec4c	stp x20,x19,[sp, #0x20]
009eec50	mov w22,w2
009eec54	mov x20,x1
009eec58	cmp w2,#0x18
009eec5c	mov x21,x0
009eec60	stp x29,x30,[sp, #0x30]
009eec64	add x29,sp,#0x30
009eec68	b.eq 0x009eec94
009eec6c	cmp w22,#0x17
009eec70	b.eq 0x009eeca0
009eec74	cmn w22,#0x1
009eec78	mov x19,xzr
009eec7c	b.ne 0x009eed1c
009eec80	ldr w8,[x20, #0x14]
009eec84	sub w8,w8,#0x32
009eec88	cmp w8,#0x63
009eec8c	mov w8,#0x17
009eec90	cinc w22,w8,hi
009eec94	mov x19,x21
009eec98	cbnz x21,0x009eeccc
009eec9c	b 0x009eecc0
009eeca0	ldr w8,[x20, #0x14]
009eeca4	mov x19,xzr
009eeca8	sub w8,w8,#0x32
009eecac	cmp w8,#0x63
009eecb0	b.hi 0x009eed1c
009eecb4	mov w22,#0x17
009eecb8	mov x19,x21
009eecbc	cbnz x21,0x009eeccc
009eecc0	bl 0x00c37950
009eecc4	mov x19,x0
009eecc8	cbz x0,0x009eed7c
009eeccc	mov w2,#0x14
009eecd0	mov x0,x19
009eecd4	mov x1,xzr
009eecd8	bl 0x00c378a0
009eecdc	cbz w0,0x009eed1c
009eece0	str w22,[x19, #0x4]
009eece4	ldr x0,[x19, #0x8]
009eece8	ldr w8,[x20, #0x14]
009eecec	cmp w22,#0x18
009eecf0	b.ne 0x009eed34
009eecf4	ldp w5,w9,[x20, #0xc]
009eecf8	ldp w7,w6,[x20, #0x4]
009eecfc	ldr w10,[x20]
009eed00	adrp x2,0x2a2000
009eed04	add w3,w8,#0x76c
009eed08	add w4,w9,#0x1
009eed0c	add x2,x2,#0x123
009eed10	mov w1,#0x14
009eed14	str w10,[sp]
009eed18	b 0x009eed74
009eed1c	cmp x19,x21
009eed20	b.eq 0x009eed2c
009eed24	mov x0,x19
009eed28	bl 0x00c37890
009eed2c	mov x19,xzr
009eed30	b 0x009eed7c
009eed34	mov w9,#0x851f
009eed38	movk w9,#0x51eb, LSL #16
009eed3c	ldp w5,w11,[x20, #0xc]
009eed40	ldr w12,[x20]
009eed44	ldp w7,w6,[x20, #0x4]
009eed48	smull x9,w8,w9
009eed4c	lsr x13,x9,#0x3f
009eed50	asr x9,x9,#0x25
009eed54	mov w10,#0x64
009eed58	add w9,w9,w13
009eed5c	adrp x2,0x2b7000
009eed60	msub w3,w9,w10,w8
009eed64	add w4,w11,#0x1
009eed68	add x2,x2,#0x8a9
009eed6c	mov w1,#0x14
009eed70	str w12,[sp]
009eed74	bl 0x00c34d30
009eed78	str w0,[x19]
009eed7c	mov x0,x19
009eed80	ldp x29,x30,[sp, #0x30]
009eed84	ldp x20,x19,[sp, #0x20]
009eed88	ldp x22,x21,[sp, #0x10]
009eed8c	add sp,sp,#0x40
009eed90	ret
