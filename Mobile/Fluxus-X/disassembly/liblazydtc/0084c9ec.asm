; FUN_0084c9ec @ 0084c9ec
0084c9ec	sub sp,sp,#0xa0
0084c9f0	stp x29,x30,[sp, #0x40]
0084c9f4	stp x28,x27,[sp, #0x50]
0084c9f8	stp x26,x25,[sp, #0x60]
0084c9fc	stp x24,x23,[sp, #0x70]
0084ca00	stp x22,x21,[sp, #0x80]
0084ca04	stp x20,x19,[sp, #0x90]
0084ca08	add x29,sp,#0x40
0084ca0c	mrs x24,tpidr_el0
0084ca10	mov w9,#0x2a
0084ca14	mov x10,#-0x1
0084ca18	ldr x8,[x24, #0x28]
0084ca1c	mov x19,x0
0084ca20	stur x8,[x29, #-0x8]
0084ca24	ldp x26,x23,[x0, #0x8]
0084ca28	subs x8,x23,x26
0084ca2c	asr x8,x8,#0x3
0084ca30	madd x10,x8,x9,x10
0084ca34	ldp x8,x11,[x0, #0x20]
0084ca38	subs x9,x23,x26
0084ca3c	add x11,x11,x8
0084ca40	csel x10,xzr,x10,eq
0084ca44	sub x10,x10,x11
0084ca48	cmp x10,#0x2a
0084ca4c	b.cc 0x0084ca74
0084ca50	add x8,x8,#0x2a
0084ca54	add x1,sp,#0x10
0084ca58	mov x0,x19
0084ca5c	str x8,[x19, #0x20]
0084ca60	ldr x8,[x23, #-0x8]!
0084ca64	str x23,[x19, #0x10]
0084ca68	str x8,[sp, #0x10]
0084ca6c	bl 0x0084cdb0
0084ca70	b 0x0084ccf4
0084ca74	mov x8,x19
0084ca78	ldr x10,[x19]
0084ca7c	ldr x11,[x8, #0x18]!
0084ca80	sub x12,x11,x10
0084ca84	cmp x9,x12
0084ca88	b.cs 0x0084cab0
0084ca8c	mov w0,#0xfc0
0084ca90	cmp x26,x10
0084ca94	b.eq 0x0084cca4
0084ca98	bl 0x00c2fed0
0084ca9c	str x0,[sp, #0x10]
0084caa0	add x1,sp,#0x10
0084caa4	mov x0,x19
0084caa8	bl 0x0084c68c
0084caac	b 0x0084ccd4
0084cab0	asr x9,x12,#0x2
0084cab4	cmp x11,x10
0084cab8	str x8,[sp, #0x30]
0084cabc	csinc x21,x9,xzr,ne
0084cac0	lsr x9,x21,#0x3d
0084cac4	cbnz x9,0x0084cd44
0084cac8	lsl x20,x21,#0x3
0084cacc	mov x0,x20
0084cad0	bl 0x00c2fed0
0084cad4	mov x22,x0
0084cad8	add x28,x0,x20
0084cadc	stp x0,x0,[sp, #0x10]
0084cae0	stp x0,x28,[sp, #0x20]
0084cae4	mov w0,#0xfc0
0084cae8	str x24,[sp, #0x8]
0084caec	bl 0x00c2fed0
0084caf0	mov x20,x0
0084caf4	cbnz x21,0x0084cb1c
0084caf8	mov w0,#0x8
0084cafc	bl 0x00c2fed0
0084cb00	mov x21,x0
0084cb04	add x28,x0,#0x8
0084cb08	mov x0,x22
0084cb0c	mov x1,xzr
0084cb10	bl 0x00c2fe80
0084cb14	ldp x26,x23,[x19, #0x8]
0084cb18	mov x22,x21
0084cb1c	mov x27,x22
0084cb20	cmp x26,x23
0084cb24	str x20,[x27], #0x8
0084cb28	mov x20,x22
0084cb2c	b.ne 0x0084cb8c
0084cb30	mov x21,x22
0084cb34	ldp x8,x9,[x19, #0x18]
0084cb38	sub x10,x27,x21
0084cb3c	ldr x0,[x19]
0084cb40	cmp x10,#0x8
0084cb44	mov w10,#0x15
0084cb48	stp x20,x21,[x19]
0084cb4c	add x9,x9,#0x2a
0084cb50	stp x27,x28,[x19, #0x10]
0084cb54	csel x9,x10,x9,eq
0084cb58	str x9,[x19, #0x20]
0084cb5c	cbz x0,0x0084cb68
0084cb60	sub x1,x8,x0
0084cb64	bl 0x00c2fe80
0084cb68	ldr x24,[sp, #0x8]
0084cb6c	b 0x0084ccf4
0084cb70	mov x21,x22
0084cb74	ldr x8,[x26], #0x8
0084cb78	mov x22,x21
0084cb7c	str x8,[x27], #0x8
0084cb80	ldr x8,[x19, #0x10]
0084cb84	cmp x26,x8
0084cb88	b.eq 0x0084cb34
0084cb8c	cmp x27,x28
0084cb90	b.ne 0x0084cb70
0084cb94	subs x8,x22,x20
0084cb98	b.ls 0x0084cbd0
0084cb9c	asr x8,x8,#0x3
0084cba0	subs x23,x27,x22
0084cba4	add x8,x8,#0x1
0084cba8	add x8,x8,x8, LSR #0x3f
0084cbac	lsr x8,x8,#0x1
0084cbb0	sub x21,x22,x8, LSL #0x3
0084cbb4	b.eq 0x0084cbc8
0084cbb8	mov x0,x21
0084cbbc	mov x1,x22
0084cbc0	mov x2,x23
0084cbc4	bl 0x00c2ff60
0084cbc8	add x27,x21,x23
0084cbcc	b 0x0084cb74
0084cbd0	subs x23,x27,x20
0084cbd4	asr x8,x23,#0x2
0084cbd8	csinc x25,x8,xzr,ne
0084cbdc	lsr x8,x25,#0x3d
0084cbe0	cbnz x8,0x0084cd24
0084cbe4	lsl x0,x25,#0x3
0084cbe8	bl 0x00c2fed0
0084cbec	lsr x8,x25,#0x2
0084cbf0	mov x24,x0
0084cbf4	subs x10,x27,x22
0084cbf8	add x21,x0,x8, LSL #0x3
0084cbfc	mov x27,x21
0084cc00	b.eq 0x0084cc40
0084cc04	sub x9,x10,#0x8
0084cc08	add x27,x21,x10
0084cc0c	cmp x9,#0x18
0084cc10	b.cc 0x0084cc28
0084cc14	lsl x8,x8,#0x3
0084cc18	add x10,x8,x24
0084cc1c	sub x10,x10,x22
0084cc20	cmp x10,#0x20
0084cc24	b.cs 0x0084cc58
0084cc28	mov x8,x21
0084cc2c	mov x9,x22
0084cc30	ldr x10,[x9], #0x8
0084cc34	str x10,[x8], #0x8
0084cc38	cmp x8,x27
0084cc3c	b.ne 0x0084cc30
0084cc40	mov x0,x20
0084cc44	mov x1,x23
0084cc48	add x28,x24,x25, LSL #0x3
0084cc4c	bl 0x00c2fe80
0084cc50	mov x20,x24
0084cc54	b 0x0084cb74
0084cc58	lsr x9,x9,#0x3
0084cc5c	add x13,x24,x8
0084cc60	add x12,x22,#0x10
0084cc64	add x13,x13,#0x10
0084cc68	add x10,x9,#0x1
0084cc6c	and x11,x10,#0x3ffffffffffffffc
0084cc70	lsl x9,x11,#0x3
0084cc74	mov x14,x11
0084cc78	add x8,x21,x9
0084cc7c	add x9,x22,x9
0084cc80	ldp q0,q1,[x12, #-0x10]
0084cc84	subs x14,x14,#0x4
0084cc88	add x12,x12,#0x20
0084cc8c	stp q0,q1,[x13, #-0x10]
0084cc90	add x13,x13,#0x20
0084cc94	b.ne 0x0084cc80
0084cc98	cmp x10,x11
0084cc9c	b.ne 0x0084cc30
0084cca0	b 0x0084cc40
0084cca4	bl 0x00c2fed0
0084cca8	str x0,[sp, #0x10]
0084ccac	add x1,sp,#0x10
0084ccb0	mov x0,x19
0084ccb4	bl 0x0084c50c
0084ccb8	ldr x8,[x19, #0x10]
0084ccbc	add x1,sp,#0x10
0084ccc0	mov x0,x19
0084ccc4	ldr x9,[x8, #-0x8]!
0084ccc8	str x8,[x19, #0x10]
0084cccc	str x9,[sp, #0x10]
0084ccd0	bl 0x0084cdb0
0084ccd4	ldp x9,x8,[x19, #0x8]
0084ccd8	ldr x10,[x19, #0x20]
0084ccdc	sub x8,x8,x9
0084cce0	add x9,x10,#0x2a
0084cce4	cmp x8,#0x8
0084cce8	mov w8,#0x15
0084ccec	csel x8,x8,x9,eq
0084ccf0	str x8,[x19, #0x20]
0084ccf4	ldr x8,[x24, #0x28]
0084ccf8	ldur x9,[x29, #-0x8]
0084ccfc	cmp x8,x9
0084cd00	b.ne 0x0084cdac
0084cd04	ldp x20,x19,[sp, #0x90]
0084cd08	ldp x22,x21,[sp, #0x80]
0084cd0c	ldp x24,x23,[sp, #0x70]
0084cd10	ldp x26,x25,[sp, #0x60]
0084cd14	ldp x28,x27,[sp, #0x50]
0084cd18	ldp x29,x30,[sp, #0x40]
0084cd1c	add sp,sp,#0xa0
0084cd20	ret
0084cd24	ldr x8,[sp, #0x8]
0084cd28	stp x27,x28,[sp, #0x20]
0084cd2c	stp x20,x22,[sp, #0x10]
0084cd30	ldr x8,[x8, #0x28]
0084cd34	ldur x9,[x29, #-0x8]
0084cd38	cmp x8,x9
0084cd3c	b.ne 0x0084cdac
0084cd40	bl 0x007fe1b8
0084cd44	ldr x8,[x24, #0x28]
0084cd48	ldur x9,[x29, #-0x8]
0084cd4c	cmp x8,x9
0084cd50	b.ne 0x0084cdac
0084cd54	bl 0x007fe1b8
0084cdac	bl 0x00c2fec0
