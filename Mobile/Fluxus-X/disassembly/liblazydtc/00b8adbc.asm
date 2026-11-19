; psa_cipher_update @ 00b8adbc
00b8adbc	str x27,[sp, #-0x60]!
00b8adc0	stp x26,x25,[sp, #0x10]
00b8adc4	stp x24,x23,[sp, #0x20]
00b8adc8	stp x22,x21,[sp, #0x30]
00b8adcc	stp x20,x19,[sp, #0x40]
00b8add0	stp x29,x30,[sp, #0x50]
00b8add4	add x29,sp,#0x50
00b8add8	ldr w27,[x0]
00b8addc	mov x24,x5
00b8ade0	mov x25,x4
00b8ade4	mov x19,x3
00b8ade8	mov x26,x2
00b8adec	mov x21,x0
00b8adf0	mov x22,x1
00b8adf4	cbz w27,0x00b8ae70
00b8adf8	ldrb w8,[x21, #0x4]
00b8adfc	and w8,w8,#0x3
00b8ae00	cmp w8,#0x1
00b8ae04	b.ne 0x00b8ae78
00b8ae08	mov x19,xzr
00b8ae0c	mov x22,xzr
00b8ae10	mov x23,xzr
00b8ae14	mov x20,xzr
00b8ae18	mov w24,#0xffffff77
00b8ae1c	cbz w27,0x00b8ae40
00b8ae20	cmp w27,#0x1
00b8ae24	b.ne 0x00b8ae30
00b8ae28	add x0,x21,#0x8
00b8ae2c	bl 0x00c42e70
00b8ae30	ldrb w8,[x21, #0x4]
00b8ae34	str wzr,[x21]
00b8ae38	and w8,w8,#0xfc
00b8ae3c	strb w8,[x21, #0x4]
00b8ae40	mov x0,x20
00b8ae44	bl 0x00c30960
00b8ae48	cbz x22,0x00b8aef8
00b8ae4c	cbz x19,0x00b8aef4
00b8ae50	cbz x23,0x00b8ae64
00b8ae54	mov x0,x19
00b8ae58	mov x1,x22
00b8ae5c	mov x2,x23
00b8ae60	bl 0x00c2ffd0
00b8ae64	mov x0,x22
00b8ae68	bl 0x00c30960
00b8ae6c	b 0x00b8aef8
00b8ae70	mov w24,#0xffffff77
00b8ae74	b 0x00b8aef8
00b8ae78	cbz x26,0x00b8af18
00b8ae7c	mov w1,#0x1
00b8ae80	mov x0,x26
00b8ae84	bl 0x00c30a30
00b8ae88	mov x20,x0
00b8ae8c	cbz x0,0x00b8af40
00b8ae90	mov x0,x20
00b8ae94	mov x1,x22
00b8ae98	mov x2,x26
00b8ae9c	bl 0x00c2ffd0
00b8aea0	cbz x25,0x00b8af20
00b8aea4	mov w1,#0x1
00b8aea8	mov x0,x25
00b8aeac	bl 0x00c30a30
00b8aeb0	mov x22,x0
00b8aeb4	mov x23,x25
00b8aeb8	cbz x0,0x00b8af4c
00b8aebc	cmp w27,#0x1
00b8aec0	b.ne 0x00b8af34
00b8aec4	add x0,x21,#0x8
00b8aec8	mov x1,x20
00b8aecc	mov x2,x26
00b8aed0	mov x3,x22
00b8aed4	mov x4,x25
00b8aed8	mov x5,x24
00b8aedc	bl 0x00c42ee0
00b8aee0	mov w24,w0
00b8aee4	cbz w0,0x00b8ae40
00b8aee8	ldr w27,[x21]
00b8aeec	cbnz w27,0x00b8ae20
00b8aef0	b 0x00b8ae40
00b8aef4	mov w24,#0xffffff69
00b8aef8	mov w0,w24
00b8aefc	ldp x29,x30,[sp, #0x50]
00b8af00	ldp x20,x19,[sp, #0x40]
00b8af04	ldp x22,x21,[sp, #0x30]
00b8af08	ldp x24,x23,[sp, #0x20]
00b8af0c	ldp x26,x25,[sp, #0x10]
00b8af10	ldr x27,[sp], #0x60
00b8af14	ret
00b8af18	mov x20,xzr
00b8af1c	cbnz x25,0x00b8aea4
00b8af20	mov x23,xzr
00b8af24	mov x22,xzr
00b8af28	mov x19,xzr
00b8af2c	cmp w27,#0x1
00b8af30	b.eq 0x00b8aec4
00b8af34	mov w24,#0xffffff79
00b8af38	cbnz w27,0x00b8ae20
00b8af3c	b 0x00b8ae40
00b8af40	mov x19,xzr
00b8af44	mov x22,xzr
00b8af48	b 0x00b8af50
00b8af4c	mov x19,xzr
00b8af50	mov x23,xzr
00b8af54	mov w24,#0xffffff73
00b8af58	cbnz w27,0x00b8ae20
00b8af5c	b 0x00b8ae40
